import java.util.Random;
class Main {
public static int otp()
{
   Random ran = new Random();
   return 1000 + ran.nextInt(5000);
}
    public static void main(String[] args) {
       int otp = otp();
       System.out.println("the one time password is " + otp);




    }
}