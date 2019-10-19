package zadanie1;


public class zad4 {
    public static void main(String[] args) {
        System.out.println("prawdziwa wartość pochodnej = " + pochodna( 0.5));
        System.out.println("przykład 1");
        System.out.println(przybliżona_pochodna_przykład_1(1.5,-0.5,0.25));
        System.out.println(przybliżona_pochodna_przykład_1(1.5,-0.5,0.5));
        System.out.println(epsilonT_przykład_1(0.5,przybliżona_pochodna_przykład_1(1.5,-0.5,0.25)));
        System.out.println(epsilonT_przykład_1(0.5,przybliżona_pochodna_przykład_1(1.5,-0.5,0.5)));
        System.out.println("przykład 2");
        int k =10;
        for (int i =0; i<=k; i++) {
            System.out.println("dla k =  " + i);
            System.out.println(przybliżona_pochodna_przykład_2(1.5, -0.5, Math.pow(0.1,i)));
            System.out.println(epsilonT_przykład_2(0.5, przybliżona_pochodna_przykład_2(1.5, -0.5, Math.pow(0.1,i))));
        }

    }
    ///pętla obliczająca wartość przybliżenia
    public static double przybliżona_pochodna_przykład_1(double x1,double x2, double h){

        double poh1 = 0;
        double poh2 = 0;
        double prz =0;
        poh1 = (-0.1*Math.pow((x1),4)-0.15*Math.pow((x1),3)-0.5*Math.pow((x1),2)-0.25*(x1)+1.2);//potrzebowałem dwóch zmiennych ponieważ kombliator gubił się przy obliczaniu i pokazywał złą wartość
        poh2 = (-0.1*Math.pow((x2),4)-0.15*Math.pow((x2),3)-0.5*Math.pow((x2),2)-0.25*(x2)+1.2);
        prz = ((poh1-poh2)/2*h)-Math.pow(h,2);
        return prz;
    }
    ///pętla obliczająca wartość błędu przybliżenia
    public static double epsilonT_przykład_1(double x, double przybliżenie){

        double poch = 0;
        double epsT = 0;
        poch = (-0.4*Math.pow(x,3)-0.45*Math.pow(x,2)-1*Math.pow(x,1)-0.25);
        epsT = ((poch-przybliżenie)/poch) * 100;
        return epsT;
    }
    //pętla obliczająca  prawdziwą wartość pochodnej
    public static double pochodna(double x){
        double pochodn = 0;
        pochodn = (-0.4*Math.pow(x,3)-0.45*Math.pow(x,2)-1*Math.pow(x,1)-0.25);
        return pochodn;
    }
    public static double przybliżona_pochodna_przykład_2(double x1,double x2, double h){
        double poh1_2 = 0;
        double poh2_2 = 0;
        double prz_2 =0;
        poh1_2 = (-0.1*Math.pow((x1),4)-0.15*Math.pow((x1),3)-0.5*Math.pow((x1),2)-0.25*(x1)+1.2);
        poh2_2 = (-0.1*Math.pow((x2),4)-0.15*Math.pow((x2),3)-0.5*Math.pow((x2),2)-0.25*(x2)+1.2);
        prz_2 = ((poh1_2-poh2_2)/2*h)-Math.pow(h,2);
        return prz_2;
    }
    public static double epsilonT_przykład_2(double x, double przybliżenie){

        double poch_2 = 0;
        double epsT_2 = 0;
        poch_2 = (-0.4*Math.pow(x,3)-0.45*Math.pow(x,2)-1*Math.pow(x,1)-0.25);
        epsT_2 = ((poch_2-przybliżenie)/poch_2) * 100;
        epsT_2 = Math.abs(epsT_2);
        return epsT_2;
    }
}
