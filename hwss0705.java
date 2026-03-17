import java.util.Scanner;

public class hwss0705 {
    public static class Customer {
        public int id;
        public String name;
        public String email;
        public void showInfo() {
            System.out.println("CustomerInfo:");
            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("email: " + email);
        }
    }
    public static class Order {
        public int orderId;
        public Customer customer;
        public double total;
        public void printOrder() {
            System.out.println("OrderInfo:");
            System.out.println("orderId: " + orderId);
            System.out.println("customer: " + customer.name);
            System.out.println("total: " + total);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Nhập thông tin khách hàng:");
        System.out.print("id: ");
        c.id = sc.nextInt();
        sc.nextLine();
        System.out.print("name: ");
        c.name = sc.nextLine();
        System.out.print("email: ");
        c.email = sc.nextLine();
        Order o = new Order();
        System.out.println("Nhập thông tin đơn hàng:");
        System.out.print("id: "); o.orderId = sc.nextInt();
        o.customer = c;
        o.total = 14356.678;
        c.showInfo();
        o.printOrder();
    }
}
