import java.util.Scanner;
public class App {
    public static void main( String[]args){
        int i ,j,count ;

        for (i =2 ; i<=25 ; i++){
            count =0;
            for (j=2; j<i ; j++){
                if (i%j == 0){
                    count ++;
                    break;
                }

            }
            if(count == 0){
                System.out.println(i + " is a Prime Number");
            }
        }

   
        int i ,sum;
        sum = 0;
        for (i=1; i<=100; i++){
            sum = sum + i;
        }
        System.out.println(sum);

       



    }
}