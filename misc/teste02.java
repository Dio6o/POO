package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class teste02 {

    public static void main(String[] args) {

        String[] arquivos = {
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-0.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-1.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-2.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-3.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-4.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-5.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-6.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-7.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-8.txt",
                "C:\\Users\\77777777777777777777\\Downloads\\arquivosDNA\\dna-9.txt"
        };

        int totalFitas = 0;
        int totalValidas = 0;
        int totalInvalidas = 0;
        ArrayList<String> todasInvalidas = new ArrayList<>();

        for (String caminho : arquivos) {
            Resultado resultado = processarArquivo(caminho);
            totalFitas += resultado.total;
            totalValidas += resultado.validas;
            totalInvalidas += resultado.invalidas;
            todasInvalidas.addAll(resultado.listaInvalidas);
        }

        System.out.println("Total de fitas: " + totalFitas);
        System.out.println("Fitas válidas: " + totalValidas);
        System.out.println("Fitas inválidas: " + totalInvalidas);

        if (!todasInvalidas.isEmpty()) {
            System.out.println("\nLista de TODAS as fitas inválidas:");
            for (String invalida : todasInvalidas) {
                System.out.println(invalida);
            }
        }
    }

    public static Resultado processarArquivo(String filePath) {
        ArrayList<String> fitas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder fitaTemp = new StringBuilder();
            int linha = 0;

            while ((line = reader.readLine()) != null) {
                linha++;
                fitaTemp.append(line.trim());

                if (linha % 2 == 0) {
                    fitas.add(fitaTemp.toString());
                    fitaTemp.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new Resultado(0, 0, 0, new ArrayList<>());
        }

        int validas = 0;
        int invalidas = 0;
        ArrayList<String> fitasInvalidas = new ArrayList<>();

        for (int i = 0; i < fitas.size(); i++) {
            String fitaOriginal = fitas.get(i);
            StringBuilder fitaComplementar = new StringBuilder();
            boolean valida = true;

            for (char base : fitaOriginal.toCharArray()) {
                switch (base) {
                    case 'A':
                        fitaComplementar.append('T');
                        break;
                    case 'T':
                        fitaComplementar.append('A');
                        break;
                    case 'C':
                        fitaComplementar.append('G');
                        break;
                    case 'G':
                        fitaComplementar.append('C');
                        break;
                    default:
                        fitaComplementar.append("?");
                        valida = false;
                        break;
                }
            }

            if (valida) {
                validas++;
            } else {
                invalidas++;
                fitasInvalidas.add("Arquivo: " + filePath + " | Fita " + (i + 1) + " -> " + fitaOriginal);
            }
        }

        return new Resultado(fitas.size(), validas, invalidas, fitasInvalidas);
    }
}

class Resultado {
    int total;
    int validas;
    int invalidas;
    ArrayList<String> listaInvalidas;

    public Resultado(int total, int validas, int invalidas, ArrayList<String> listaInvalidas) {
        this.total = total;
        this.validas = validas;
        this.invalidas = invalidas;
        this.listaInvalidas = listaInvalidas;
    }
}
