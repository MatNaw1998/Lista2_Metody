package zadanie1;

public class zad3 {
        public static double wynik;
        public static double wynik_cos;
        public static double wynik_sin;
        public static double pi = 3.14159265359;
        public static double licznik = 0;
        public static int N = 0;
        public static double tablica_wynik[];
        public static double tablica_bląd[];

        public static void main(String[] args) {
            tablica_wynik = new double[7];
            tablica_bląd = new double[7];
            for (int i = 0; i <7; i++) {
                tablica_wynik[i] = cos_pohodna(i,pi/4,pi/12);
            }
            for (int i = 0; i <7; i++) {
                tablica_bląd[i] = pr_blad_wzgt(Math.cos(pi/3),cos_pohodna(i, (pi / 4), (pi / 12)));
            }

            for (int n = 0; n < 7; n++) {
                System.out.println("przybliżenie dla "+N) ;
                System.out.print(tablica_wynik[N] + " ");
                System.out.println("");
                System.out.print("błąd sigmaT = " + tablica_bląd[N] + " %");
                System.out.println("");
                N++;
            }
        }


        public static double integral(int n) {
            double sum = 1;
            for (int i = 2; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }

        public static double cos_pohodna(int n, double x, double h) {  //metoda która oblicza wartości przeyblizęnia; w zależności od stopnia pochodnej jest dodawana odpowiednia funkcja trygonometrycza od danej liczby

            for (int i = 0; i <= n; i++) {
                if (n == 0) {
                    wynik = Math.cos(x);
                    break;
                }
                if (licznik == 3 || licznik == 4) {
                    if (i % 2 == 0) {
                        wynik_sin = +(Math.sin(x) * h) / integral(i);
                    } else if (i % 2 != 0) {
                        wynik_cos = +(Math.cos(x) * h) / integral(i);
                    }
                } else {
                    if (i % 2 == 0) {
                        wynik_sin = +(Math.sin(x) * h) / integral(i);
                    } else if (i % 2 != 0) {
                        wynik_cos = +(Math.cos(x) * h) / integral(i);
                    }
                }
                licznik++;
            }
            return wynik + wynik_sin + wynik_cos;
        }

        public static double pr_blad_wzgt(double prawdziwa, double przybliżenie) {
            double sigmaT = Math.abs(((prawdziwa - przybliżenie) / prawdziwa) * 100);
            return sigmaT;
        }
    }


