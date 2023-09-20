package unifatecie;
import java.util.Scanner;
public class L10E4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int tab;
        int result;
        
        System.out.println("Digite a tabuada desejada:");
        tab=input.nextInt();
        System.out.println("Tabuada do: "+tab);       
        
        for(int i=0;i<=10;i++){
            result=tab*i;
        System.out.println(tab+"x"+i+"="+result);
            
        }
    }
}
