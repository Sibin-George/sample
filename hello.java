import java.util.Scanner;
public class hello{

    public static void check(int a){
        if(a>10){
            a=(a+1)*4;
            System.out.println(a);
        }else if(a<10){
            System.out.println(a/2);

        }else{
            
            System.out.println(0);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       check(x);  
       
    }

}

