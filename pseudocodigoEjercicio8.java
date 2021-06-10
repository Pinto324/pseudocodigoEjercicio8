
import java.util.Scanner;

public class pseudocodigoEjercicio8 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String C;
        int NoR;
        do{            
            NoR = (int) Math.round((Math.random()*100));
            NoR *=5;
            System.out.println(NoR);
            System.out.println("Desea continuar? Enter para repetir, C para cancelar:");
            C = sc.nextLine();
        }while(!(C.equals("C")||C.equals("c")));
    }   
}
