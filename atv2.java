import java.util.Scanner;

public class atv2 {

    public static void main(String[] args) { 
       int n;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o número: ");
           n = sc.nextInt();
    }
       imprimeNumeros(n);
    }

    static void imprimeNumeros(int n){
        int b, c;
        for (b=0; b <= n; b++) {
            for(c=1; c<=b; c++){
                
                System.out.print(c+" ");
            }
            System.out.println(" ");
        
            
        }

    }
}