public class Dalek1 {
    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11);              // move around and use up the charge
        d.batteryReCharge(2.5);  // get a new charge
        d.batteryReCharge(0.5);  // add a bit more
        d.move(5);               // move some more
    }

    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        batteryCharge += c;
        System.out.println("Battery charge is: " + batteryCharge);
    }

    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            if (batteryCharge >= 0.5) {
                System.out.print("[" + (i + 1) + "] ");
                batteryCharge -= 0.5;
            }else{
                System.out.println("Out of power!");
                //i = distance + 1;
            }
        }

    }
}
