public class Homework {
    public static void main(String[] args)
    {
        //1
        System.out.println(10*6);
        //2
        System.out.println(10/5);
        //3
        int x = 10;
        ++x;
        System.out.println(x); // =11
        //4
        x+=5;
        System.out.println(x); // =16
        //5
        int y = 10;
        int z = 20;
        int k = y+z;

        if(k>=10) {
            System.out.println("suma este mai mare decat 10");
        }
        else System.out.println("suma este mai mica decat 10");

        //6
        if (k%2==0) {
            System.out.println("suma este numar par");
        }
        else System.out.println("suma este numar impar");
    }
}
