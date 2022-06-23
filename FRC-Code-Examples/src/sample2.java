public class sample2 {
    public static void main(String[] args) {
        //if, else if and else statements
        int x = 3;
        //compares the value of x to 4, if x is greater than 4 it runs the code inside the brackets
        if(x>4){
            //this code will run because x is greater than 4
            System.out.println("x is greater than 4");
        }
        //will only run if above if statement is false
        //notice that 2 equals signs are used, this is because one equals signs gives a variable value, 2 equals signs compare data
        else if(x==4){
            System.out.println("X is equal to 4");
        }
        //only runs if both statements above don't run
        else{
            System.out.println("X is less than 4");
        }

        //loops
        
        //for loops will run a predetermined amount of times
        //this loop will run 5 times, 0-4
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //while loops will keep running until their statement is false
        int y=0;
        while(y<=10){ // this loop will run 11 times because we are starting at 0 and including 10.
            System.out.println(y);
            y++; //++ will increment y by 1 each time the loop runs
        }

        //do while loops will at least once, even if the statement inside the while part is false
        int z=100;
        do {
            System.out.println(z);
        } while (z<1);
    }
}