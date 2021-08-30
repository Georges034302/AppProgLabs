public class ZCount {
    public static void main(String[] args) {
        System.out.println("z count = " + zCount(readString().toLowerCase()));
    } // An argument is a literal passed to the method when it is called

    //Read Function 
    public static String readString() {
        System.out.print("String: ");
        return In.nextLine();
    }

    public static int zCount(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'z')
                count++;
        }
        return count;
    } //A parameter is a temparory variable for a method at definition stage
}
