import java.util.Scanner;
public class balik_kata {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat = ");
        String input = s.nextLine();
        
        char a[]=new char[input.length()];
        int panjang=input.length()-1;
        
        for(int i=0;i<a.length;i++){
            a[i]=input.charAt(panjang);
            panjang--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
        System.out.println();
    }
}