public class Delivery {
    boolean[][] arrDelivered = new boolean[10][4];
    double[] arrPrices = new double[4];

    public static void main(String[] args) {
        System.out.println(new Delivery().toString());
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < arrDelivered.length; i++) {
            for (int j = 0; j < arrDelivered[i].length; j++) {
                output += arrDelivered[i][j] + " ";
            }
            output += "; ";
        }

        return output;
    }
}