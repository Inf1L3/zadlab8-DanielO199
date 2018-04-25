package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        
        
        Product[] array = new Product[10];
        
       
        
        for(int i=0;i<10;i++){
        
            array[i].buy();
            array[i].showInfo();
        }
        

        System.out.println("Wybierz 1)Ksiazke/n"
                + " 2)Dzem/n"
                + "3)Polopiryna/n"
                + "4)Dlugopis/n"
                + "5)Czekolada/n"
        );
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        switch (a) {

            case 1:
                System.out.println("Ksiązka");
                Product ksiazka = new Product(0,"","") ;
                    ksiazka.getPrice();
                    ksiazka.getName();
                    ksiazka.getDescribe();
                break;
            case 2:
                System.out.println("Dzem");
                Product dzem = new Product(0,"","");
                dzem.getPrice();
                    dzem.getName();
                    dzem.getDescribe();
                
                break;
            case 3:
                System.out.println("Polopiryna");
                Product polopiryna = new Product(0,"","");
                polopiryna.getPrice();
                    polopiryna.getName();
                    polopiryna.getDescribe();
                break;
            case 4:
                System.out.println("Dlugopis");
                Product dlugopis = new Product(0,"","");
                dlugopis.getPrice();
                    dlugopis.getName();
                    dlugopis.getDescribe();
                break;
            case 5:
                System.out.println("Czekolada");
                Product czekolada = new Product(0,"","");
                czekolada.getPrice();
                    czekolada.getName();
                    czekolada.getDescribe();
                break;

        }

    }

}
