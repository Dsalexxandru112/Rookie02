import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args){
        //afisarea din ordine descrescatoare
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }

        //afisarea din ordine crescatoare cu numere pare
        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        //WHILE

        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //DO WHILE

        int j = 0;
        do{
            System.out.println(j);
            j++;
        } while (i<5);

        //BREAK

        for (int k=0; k<10; k++){
            System.out.println(k);
            if(k==4){break;}
        }

        //CONTINUE

        int k = 0;
        while (k < 10) {
            k++;
            if(k==4) {continue;}
            System.out.println(k);
        }

        //TRY... CATCH



    }
}
