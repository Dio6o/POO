package Lista9.SistemaAcademico;

public class SistemaMain {
    public static void main(String[] args) {

        Fase fase = new Fase();
        Curso curso = new Curso("BCC", 1, fase);
        Aluno aluno = new Aluno("Diogo", 1, curso);
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina();
        DadosDisciplina dados = new DadosDisciplina(10, 2, 15, 2 , aluno,  professor);
        SituacaoAluno situacaoAluno = new SituacaoAluno(dados);

        System.out.println(aluno);
        System.out.println(curso);

    }
}
