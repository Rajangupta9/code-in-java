public class mutable {
    public static void main(String[] args) {
        String brand = "rajan";
        System.out.println(brand);
        brand.concat("brand"); // immutale string does't change.
        System.out.println(brand);

        StringBuffer brand1 = new StringBuffer("rajan");
        System.out.println(brand1);
        brand1.append("brand");
        System.out.println(brand1);

    }
}
