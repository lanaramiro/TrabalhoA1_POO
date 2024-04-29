import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) {

    Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno amelia = new Aluno("Amélia", "TI");
        Aluno ana = new Aluno("Ana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno capitu = new Aluno("Capitú", "TI");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno iracema = new Aluno("Iracema", "TI");
        Aluno joelmir = new Aluno("Joelmir", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno luciana = new Aluno("Luciana", "TI");
        Aluno majo = new Aluno("Majô", "ADM");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno norberto = new Aluno("Norberto", "TI");
        Aluno paulo = new Aluno("Paulo", "ADM");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno zoey = new Aluno("Zoey", "TI");

        System.out.println("Alunos e cursos:");
        System.out.println(alfredo.getNome() + " - " + alfredo.getCurso());
        System.out.println(amelia.getNome() + " - " + amelia.getCurso());
        System.out.println(ana.getNome() + " - " + ana.getCurso());
        System.out.println(bruno.getNome() + " - " + bruno.getCurso());
        System.out.println(bentinho.getNome() + " - " + bentinho.getCurso());
        System.out.println(capitu.getNome() + " - " + capitu.getCurso());
        System.out.println(debra.getNome() + " - " + debra.getCurso());
        System.out.println(ian.getNome() + " - " + ian.getCurso());
        System.out.println(iracema.getNome() + " - " + iracema.getCurso());
        System.out.println(joelmir.getNome() + " - " + joelmir.getCurso());
        System.out.println(julieta.getNome() + " - " + julieta.getCurso());
        System.out.println(luana.getNome() + " - " + luana.getCurso());
        System.out.println(luciana.getNome() + " - " + luciana.getCurso());
        System.out.println(majo.getNome() + " - " + majo.getCurso());
        System.out.println(maria.getNome() + " - " + maria.getCurso());
        System.out.println(norberto.getNome() + " - " + norberto.getCurso());
        System.out.println(paulo.getNome() + " - " + paulo.getCurso());
        System.out.println(romeu.getNome() + " - " + romeu.getCurso());
        System.out.println(wendel.getNome() + " - " + wendel.getCurso());
        System.out.println(zoey.getNome() + " - " + zoey.getCurso());
      }
    }