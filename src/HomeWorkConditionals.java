public class HomeWorkConditionals {
    public static void main(String[] args) {
        // 1) Scrieti un program care sa afiseze toate numerele intregi de la 0 pana la 10 (inclusiv).

        for (int i = 0; i <= 10; i++)
            System.out.println(i);

        // 2) Scrieti un program care sa afiseze numerele intregi de la 20 pana la 10 (inclusiv).

        for (int k = 20; k >= 10; k--)
            System.out.println(k);

        // 3) Scrieti un program care sa afiseze toate numerele pare pozitive pana la 100(inclusiv).

        for (int u = 0; u <= 100; u += 2)
            System.out.println(u);

        // 4)

        String [] fructe = {"mar", "capsune", "pere", "banane",};
        for (String f : fructe){
            System.out.println(f);
        }

        // 5)

        int luna = 8;

        switch (luna) {
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11: System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
        }
    }
}
