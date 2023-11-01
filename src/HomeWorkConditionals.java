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

        // Exercitii optionale (Conditionals)

        // 1)

        int temperature = 21;

        if (temperature < 18){
            System.out.println("too cold");
        }
        else if ((temperature>18) & (temperature<22)){
            System.out.println("ok");
        }
        else if (temperature>22){
            System.out.println("too hot");
        }

        // 2)

        char gender = 'M';

        boolean married = false;

        if (married = true){
            System.out.println(gender + " " + "is to be considered" + " " + "Domnul");
        }

        // 3)

        int min = 4;
        int even = 9;

        if (min>even){
            System.out.println("min is bigger than max");
        }
        else if(even>min){
            System.out.println("max is bigger than min");
        }
        else if(even==min){
            System.out.println("the two numbers are equal");
        }

        // 4)

        int max = 20;

        if(min >= even){
            if(min >= max)
                System.out.println(min + " " + "is the largest number");
            else System.out.println(max + " " + "is the largest number");
        }
        else {
            if(even >= max)
                System.out.println(even + " " + "is the largest number");
            else System.out.println(max + " " + "is the largest number");
            }
        }
    }
