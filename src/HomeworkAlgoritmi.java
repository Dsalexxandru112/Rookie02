public class HomeworkAlgoritmi {
    public static void main(String[] args) {
        //1)

        int numbers [] = {1, -25, 34, -2, 67, 5};

        //2)
        for (int i = 0; i<numbers.length; i++){
            int inainte = numbers[i]-1;
            int dupa = numbers[i]+1;
            System.out.println(inainte+" "+dupa);
        }

        //3)

        for (int i = 0; i<numbers.length; i++){
            if(numbers[i]<0){
                System.out.println(numbers[i]);
            }
        }

        //4)

        String countries [] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};

        //5)

        for (String c: countries){
            System.out.println(c.charAt(0));

            //6)

            if(c.charAt(0) == 'A')
            {System.out.println(c);}

            //7)
            System.out.println(c.length());
        }
        //8)

        for(String c: countries){
            if((c.length())>9){
                System.out.println(c);
            }

            //9)

            else if ((c.length())<4){
                System.out.println(c);
            }
        }
    }
}
