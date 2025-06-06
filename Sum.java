package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class Sum {
    double keuntungan[];
    
    Sum(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total=0;
        for(int i=0;i<keuntungan.length;i++){
            total = total+keuntungan[i];
        }
        return total;
    }
    double totalDC(double arr[], int i, int r){
        if(i==r){
            return arr[i];
        }
        int mid = (i+r)/2;
        double lsum = totalDC(arr, i, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum+rsum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

    Sum sm = new Sum(elemen);
    for(int i=0;i<elemen;i++){
        System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
        sm.keuntungan[i] = input.nextDouble();
    }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}
