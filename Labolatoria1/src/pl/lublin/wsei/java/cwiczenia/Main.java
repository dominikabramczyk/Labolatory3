package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        System.out.print("Ala\n");
//        System.out.print("ma\n");
//        System.out.print("kota\n\n");
//        System.out.println("Ala");
//        System.out.println("ma");
//        System.out.println("kota\n\n");
//        System.out.print("Ala");
//        System.out.print("ma");
//        System.out.print("kota\n\n");
//        int a =3;
//        double b = 4.21;
//        String s = "Jakiś tekst";
//
//        System.out.printf("a=%d, b=%.2f , s=%20s%n\n\n",a,b,s );
//
//        System.out.printf("Nazwaliśmy to \"Witaminą B3\"\n");
//
//        System.out.printf("alfa  Ssin(alfa)\n");
//            for (int i=0; i < 370; i+=10)
//                System.out.printf("%d\t%f\t\n", i , Math.sin(i/360.0*2*Math.PI));
//
//                System.out.println("Argument  Logarytm  Suma");
//                int number = 1;
//                double result = 0;
//                for (int i=0; i < 10; i++) {
//                    result = number + result;
////            System.out.printf(number++ + "    //   " + log2(number) + "   //   " + result + "\n");
//                    System.out.printf("%d   //    %.4f   //   %.4f\n",number,log2(number),result);
//                    number++;
//                }
//            }
//
//            public static double log2(int x)
//            {
//                return (double) (Math.log(x) / Math.log(2));
//            }
//
//            Scanner input = new Scanner(System.in);
//            int num1,num2;
//            System.out.print("Podaj pierwszą liczbę: ");
//            num1 = input.nextInt();
//            System.out.print("Podaj drugą liczbę: ");
//            num2 = input.nextInt();
//            System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2);

        int num1;
        int num2 = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 != 0) {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while ((num1 != 0) && (num2 != 0));
    }
}

