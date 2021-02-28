public class IntroToLoops {
    public static void main( String [] args ){
        int start = Integer.parseInt(args[0]);
        int stop = Integer.parseInt(args[1]);
        if (start > stop) {
            System.out.println("Start-limit greater than stop-limit!");
        }
        else {
            for (int i = start; i <= stop; i++) {
                System.out.print(i * i + " ");
            }
        }
    }
}
