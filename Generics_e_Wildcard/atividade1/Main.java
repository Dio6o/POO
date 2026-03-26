package Generics_e_Wildcard.atividade1;

public class Main {
    public static void main(String[] args) {

        ClasseGenerica<String> valorString = new ClasseGenerica<>("Oi");
        ClasseGenerica<Integer> valorInteger = new ClasseGenerica<>(10);
        ClasseGenerica<Double> valorDouble = new ClasseGenerica<>(3.1341);
        ClasseGenerica<Animal> valorAnimal = new ClasseGenerica<>(new Animal("Lebre"));

        valorString.print();
        valorInteger.print();
        valorDouble.print();
        valorAnimal.print();

    }
}
