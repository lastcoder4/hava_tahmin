import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float degree;
        Scanner inp =new Scanner(System.in);
        System.out.println("lutfen hava sıcaklıgını gırermısınız : 0-25");
        degree = inp.nextFloat();
        if(degree <= 5 && degree>= 0)
        {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (degree > 5 && degree<=15)
        {
            System.out.println("Sinema ya gidebilirsiniz");

        }
        else if (degree > 15 && degree<=25)
        {
            System.out.println("piknik yapabilirsiniz");

        }
        else if (degree > 25)
        {
            System.out.println("yüzmeye gidebilirsiniz");

        }
    }
}