
public class Main {
    public static void main(String[] args) {

        //for loop start at 1, check condition, increment or decrement
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i);
        }

        //while loop start at 10 , check condition , print first then decrement or increment.
        int x = 10;
        while (x >= 1){
            System.out.println(x);
            x--;
        }

        int y = 10;
        do{
            System.out.println(y);
        }while(y <= 1);
    }
}