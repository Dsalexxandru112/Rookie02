public class DataTypes {
    public static void main(String[] args)
    {
        // tips de date primitive:
        boolean myBoolean = true;
        char myChar = 'A';
        byte myByte = 0;
        short myShort = 3583;
        int myInt = 34;
        long myLong = 9999999999999999L;
        float myFloat = 5.5f;
        double myDouble = 4.6;

        int x = 5;
        double y = x;
        double z = 5.5;
        int w = (int)z;

        // tips de date non-primitive:

        String myString = "this is the text";
        int lungime = myString.length();
        System.out.println("lungimea textului este " + lungime);

        String myName = "Suteu Alexandru-Marius";
        int lungimeaNumelui = myName.length();
        System.out.println("Lungimea numelui " + myName + " este \n"+lungimeaNumelui);

        char aPatraLitera = myName.charAt(4);
        char primaLitera = myName.charAt(0);



    }
}
