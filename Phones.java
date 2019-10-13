import java.util.Random;
public class Phones {
public static void main(String[] args) {
  Random rand = new Random();
  String phone = "";
  for (int i=0;i<3;i++) {
    int n = rand.nextInt(8);
    phone = phone+n;
  }
  phone = phone+"-"+(rand.nextInt(900)+100)+"-"+(rand.nextInt(556)+100);
  System.out.println(phone);
  }
}

