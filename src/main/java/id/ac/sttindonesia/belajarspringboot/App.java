package id.ac.sttindonesia.belajarspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        int a = 100;
        String namaMhs = "Haris";

        System.out.println("Hello World \n%s\nNilai: %d".formatted(namaMhs, a));
        System.out.println("===============");
        System.out.println("Hello World \n"+namaMhs+"\nNilai: "+a);

        final float phi = (float) 3.14;
        final float phi2 = 3.14f;
        
        int angka = 1;
        float angkaBerkoma = 1.2f;
        char karakter = 'A';
        boolean benarSalah = false;
        String kalimat = "Haris";

        System.out.println(angka);
        System.out.println(angkaBerkoma);
        System.out.println(karakter);
        System.out.println(benarSalah);
        System.out.println(kalimat);
        
        System.out.println("===============");
        byte myNum = 127;
        System.out.println(myNum);

        short myNum2 = 5000;
        System.out.println(myNum2);

        long myNum3 = 15000000000L;
        System.out.println(myNum3);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        int x;
        int y;
        int hasil;

        x=10;
        y=15;

        hasil = x+y;
        System.out.println("x + y = "+ hasil);

        hasil = x-y;
        System.out.println("x - y = "+ hasil);

        hasil = x*y;
        System.out.println("x * y = "+ hasil);

        hasil = x/y;
        System.out.println("x / y = "+ hasil);

        hasil = x%y;
        System.out.println("x % y = "+ hasil);

        System.out.println("x++ = "+ x++);
        System.out.println("y-- = "+ y--);

        Boolean bool;
        bool = x > y;
        System.out.println("x > y = "+ bool);

        bool = x < y;
        System.out.println("x < y = "+ bool);
        
        bool = x >= y;
        System.out.println("x >= y = "+ bool);

        bool = x <= y;
        System.out.println("x <= y = "+ bool);

        bool = x == y;
        System.out.println("x == y = "+ bool);
        
        bool = x != y;
        System.out.println("x != y = "+ bool);

        bool = x < 5 && x < 10;
        System.out.println("x < 5 && < 10 = "+ bool);

        bool = x < 5 || x < 10;
        System.out.println("x < 5 || < 10 = "+ bool);

        bool = !bool;
        System.out.println("!bool = "+ bool);

        System.out.println("===============");

        String greeting = "assalamu'alaikum HARIS";
        System.out.println("Panjang string = "+ greeting.length());
        System.out.println("to Uppercase = "+ greeting.toUpperCase());
        System.out.println("to Lowercase = "+ greeting.toLowerCase());
        System.out.println("Concat = "+ greeting.concat(" Test"));
        System.out.println("Single Quote = "+ "Jum\'at");

        System.out.println("===============");

        int nilai_p3 = 35;
        if (nilai_p3 >= 85){
            System.out.println("A");
        }
        else if(nilai_p3 >= 70 && nilai_p3 < 85){
            System.out.println("B");
        }
        else if(nilai_p3 >= 55 && nilai_p3 < 70){
            System.out.println("C");
        }
        else if(nilai_p3 >= 35 && nilai_p3 < 55){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }

        System.out.println("===============");

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;

            case 2:
                System.out.println("Selasa");
                break;
            
            case 3:
                System.out.println("Rabu");
                break;

            case 4:
                System.out.println("Kamis");
                break;
            
            case 5:
                System.out.println("Juma't");
                break;

            case 6:
                System.out.println("Sabtu");
                break;

            case 7:
                System.out.println("Ahad");
                break;
        
            default:
                break;
        }

        System.out.println("===============");

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("===============");

        for (int ia = 0; ia < 5; ia++) {
            System.out.println(ia);
        }

        System.out.println("===============");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

    }
}
