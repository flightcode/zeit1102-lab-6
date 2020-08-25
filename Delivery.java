public class Delivery {
    private boolean[][] arrDelivered = new boolean[10][4];
    private double[] arrPrices = new double[4];

    public Delivery(double[] prices) {
        this.arrPrices = prices;
    }

    public void add(int person, int paper) {
        this.arrDelivered[person][paper] = true;
    }

    public void remove(int person, int paper) {
        this.arrDelivered[person][paper] = false;
    }

    public double getBill(int person) {
        double output = 0;
        for (int i = 0; i < this.arrDelivered[person].length; i++) {
            if (this.arrDelivered[person][i]) {
                output += this.arrPrices[i];
            }
        }

        return output;
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