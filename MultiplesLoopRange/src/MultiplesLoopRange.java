public class MultiplesLoopRange {
    public static void main( String[] args ){
        int start = Integer.parseInt(args[0]);
        int stop = Integer.parseInt(args[1]);
        int mult = Integer.parseInt(args[2]);
        if (start > stop) {
            for(int i = start; i >= stop; i--){
                if (i % mult == 0){
                    System.out.print(i + " ");
                }
            }
        }
        else {
            for(int i = start; i <= stop; i++){
                if (i % mult == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
