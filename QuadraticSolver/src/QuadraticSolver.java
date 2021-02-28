public class QuadraticSolver {
    public static void main( String[] args){
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        float z = Float.parseFloat(args[2]);
        System.out.println(((-y+Math.sqrt((y*y)-(4*x*z)))/(2*x)));
        System.out.println(((-y-Math.sqrt((y*y)-(4*x*z)))/(2*x)));

    }
}
