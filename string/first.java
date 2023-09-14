public class first {
    public static void main(String[] args) {
        String name = "rajan";
        String attribute = "charming boy";
        System.out.println(name);
        System.out.println(attribute);
        System.out.println(name + attribute);
        System.out.println(name + "is a " + attribute);
        /*
         plus operator (+)is used for addition if operands are intergers and
         it is used concatenation if opereands are strings.
         */
        System.out.println(name.length());
        System.out.println(attribute.length());
        System.out.println(name.charAt(3));

        name=name.concat(attribute);
        System.out.println(name);

    
    }
}
