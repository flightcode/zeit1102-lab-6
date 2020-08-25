import java.util.Scanner;

public class PaperDriver {
    private Scanner scan = new Scanner(System.in);
    double[] prices = { 1.2, 1.0, 1.4, 2.0 };
    Delivery delivery = new Delivery(prices);

    public static void main(String[] args) {
        new PaperDriver().menu();
    }

    void menu() {
        System.out.println("Select Option:");
        System.out.println("1. View Deliveries");
        System.out.println("2. Add Delivery");
        System.out.println("3. Remove Delivery");
        System.out.println("4. Print Bill");
        System.out.println("5. Quit");
        System.out.println("---");
        String menuOption = scan.nextLine();
        System.out.println("---");
        switch (Integer.parseInt("0" + menuOption)) {
            case 1:
                view();
                menu();
                break;
            case 2:
                add();
                menu();
                break;
            case 3:
                remove();
                menu();
                break;
            case 4:
                print();
                menu();
                break;
            case 5:
                break;
            default:
                menu();
                break;
        }
    }

    void view() {
        String deliveries = delivery.toString();
        String[] arrDeliveries = deliveries.split(" ; ");
        for (int i = 0; i < arrDeliveries.length; i++) {
            System.out.println(arrDeliveries[i]);
        }
        System.out.println("---");
    }

    void add() {
        System.out.print("Select Person: ");
        String person = scan.nextLine();
        System.out.print("Select Paper: ");
        String paper = scan.nextLine();
        delivery.add(Integer.parseInt(person), Integer.parseInt(paper));
        System.out.println("---");
    }

    void remove() {
        System.out.print("Select Person: ");
        String person = scan.nextLine();
        System.out.print("Select Paper: ");
        String paper = scan.nextLine();
        delivery.remove(Integer.parseInt(person), Integer.parseInt(paper));
        System.out.println("---");
    }

    void print() {
        System.out.print("Select Person: ");
        String person = scan.nextLine();
        System.out.println("$" + delivery.getBill(Integer.parseInt(person)));
        System.out.println("---");
    }
}