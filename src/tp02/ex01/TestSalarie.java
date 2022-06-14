package tp02.ex01;

public class TestSalarie {
    public TestSalarie() {
    }
    public static void main(String[] args) {
        Individu am=new Individu("Aurélien","Martineau");
        System.out.println("Individu ="+am.toString());
        Salarie ak = new Salarie("Alain","Kerlero",5000);
        System.out.println("Individu : "+am.toString());
        System.out.println("Salarie : "+ak.toString());
    }
}

