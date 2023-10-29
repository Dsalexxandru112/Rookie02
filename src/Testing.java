public class Testing {
    public static void main(String[] args){
        // Optionals (4)

        int var1 = 5;
        int var2 = 10;
        int var3 = 20;
        int var4 = 40;

        // 1)
        // Afisati suma lor.

        System.out.println(var1+var2+var3+var4);

        // Afisati produsul lor.

        System.out.println(var1*var2*var3*var4);

        // Afisati restul impartirii dintre var4 si var2.

        System.out.println(var4/var2);

        // 2)
        // Incrementati var1 cu o unitate de 3 ori si afisati var 1 dupa a 3-a incrementare.

        var1++;
        var1++;
        var1++;

        System.out.println(var1);
        // 3)

        //Decrementati var2 cu o unitate de 2 ori si afisati var2 dupa a 2-a decrementare.

        var2--;
        var2--;

        System.out.println(var2);

        // 4)
        boolean cond1;
        boolean cond2;

        if ((var1+var2+var3+var4) >= 100){
            cond1 = true;
        }
        else cond1 = false;

        if ((var1*var2*var3*var4) >= 1000){
            cond2 = true;
        }
        else cond2 = false;

        System.out.println(cond1);
        System.out.println(cond2);
    }
}
