package zadanie1;

public class zad2 {
    public static int[] M = {1,2,3,4};
    public static double[] H= {0.015625, 0.03125, 0.0625,0.125,0.25,0.5,1};
    public static void main(String[] args) {
        for (int i = 0; i < M.length; i++) {
            System.out.println(prawdziwa(M[i]));
        }
        System.out.println(" ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < H.length; j++) {
                System.out.println("dla m = "+ M[i]+ " i h = " + H[j]);
                System.out.println(prawdziwa(M[i], H[j]));
                System.out.println(reszta(M[i],H[j]));
            }
        }

    }
public static double prawdziwa(int m){
double x =0;
x= Math.pow(2,m);
return x;
}
    public static double prawdziwa(int m,double h){
        double x =0;
        x= 1+ m*h;
        return x;
    }
    public static double reszta(int m,double h){
        double R=0;
    if(m==1){
      R=0;
    }else if(m==2){
        R=(Math.pow(h,2)*2);
    }else if(m==3){
        R=(Math.pow(h,3));
    }else if(m==4){
        R=(Math.pow(h,4));
    }
        return R;
    }
    public static double factorial(int n){
        double fact = 1;
        for (int i=2; i<=n;i++)
            fact*=i;
        return fact;
    }
}
