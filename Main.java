package zadanie1;

public class Main {
    public static double[] tab2 = {1.2,-0.25,-1,-0.9,-2.4};
    public static double[] tab = {1.2,0.95,0.5,0.3,0.2};
    public static void main(String[] args) {
        System.out.println("obliczone matematycznie");
            for (int i = 1; i<tab.length;i++){
            System.out.println(tab[i]);
        }
        System.out.println("wyznaczone z metody");
        System.out.println(pryblizenie(1,1,4));
    }

    public static double pryblizenie(double x, int h,int n){
        double prz = 0;
        double ilość=tab2[0];
        for (int i = 1; i<=n; i++){
            ilość= (ilość + (tab2[i]*Math.pow(h,i))/factorial(i));
        }
        return ilość;
    }
    public static double factorial(int n){
        double fact = 1;
        for (int i=2; i<=n;i++)
            fact*=i;
        return fact;
    }
}
