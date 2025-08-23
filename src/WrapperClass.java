public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper class - Allow primitive values(int, char, boolean, double)
        //                to be used as an objects "Wrap them in an object"
        //                Generally, you dont wrap until you need an object
        //                Allows use of collections Framework and static Utility Methods

        //Autoboxing
        Integer a = 2;
        Boolean b = true;
        Character c = 'b';
        Double d = 3.7;

        //Unboxing
        int x = a;
        double y = d;

        String e = Integer.toString(2);
        String f = Boolean.toString(true);
        String g = Character.toString('a');
        String h = Double.toString(d);

        String i = e + f + g + h;

        System.out.println(i);

        //utility methods
        char j = 'z';
        System.out.println(Character.isUpperCase(j));
        System.out.println(Character.isLetter(j));// to check if it is a character

    }
}
