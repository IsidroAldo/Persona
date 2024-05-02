import java.util.Scanner;

class MainPersona {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        String a;
        int b;
        double altura;

        Persona x = new Persona();

        System.out.println("tu nombre es ");
        a = op.next();
        x.setNombre(a);
        System.out.println("cual es tu edad");
        b = op.nextInt();
        x.setEdad(b);
        System.out.println("cual es tu altura");
        altura = op.nextDouble();
        x.setAltura(altura);
        System.out.println(x);

    }
}
