public class Delivery {
    boolean[][] arrDelivered = new boolean[10][4];
    double[] arrPrices = new double[4];

    public static void main(String[] args) {
        Delivery delivery = new Delivery();

        System.out.println(delivery.toString());
        delivery.add(0, 0);
        System.out.println(delivery.toString());
        delivery.remove(0, 0);
        System.out.println(delivery.toString());
    }

    public void add(int person, int paper) {
        arrDelivered[person][paper] = true;
    }

    public void remove(int person, int paper) {
        arrDelivered[person][paper] = false;
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