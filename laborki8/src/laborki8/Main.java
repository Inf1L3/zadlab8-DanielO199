package laborki8;

import lab8.*;

public class Main {

    public static void main(String[] args) {
        int i = 0;

        FiguraGeometryczna[] t = new FiguraGeometryczna[15];

        t[0] = new Kwadrat(4);
        t[1] = new Kolo(9);
        t[2] = new Kula(3);
        t[3] = new Prostokat(6, 8);
        t[4] = new Prostopadloscian(9);
        t[5] = new Romb(2, 6);
        t[6] = new Rownoleglobok(5, 4);
        t[7] = new Stozek(7, 6, 3);
        t[8] = new Szescian(3, 2, 1);
        t[9] = new Trapez(6, 5, 7, 1, 5);
        t[10] = new Trojkat(9, 3, 1);
        t[11] = new Walec(2, 2);
        t[12] = new Kolo(9);
        t[13] = new Kula(2);
        t[14] = new Romb(3, 9);

        while (i < 10) {

            t[i].toString();

            i++;
        }

    }

}
