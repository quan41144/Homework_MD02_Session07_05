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
        Customer customer;
        double total;
        public void printOrder() {
            System.out.println("OrderInfo:");
            System.out.println("orderId: " + orderId);
            System.out.println("customer: " + customer.name);
            System.out.println("total: " + total);
        }
    }
}
