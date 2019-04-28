public class hello
public class PrinterWCounter{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please enter a number!");
        } else {
            for(int i = 0; i <= Integer.parseInt(args[0]); i++){
                System.out.println(i);
            }
        }
    }
}

