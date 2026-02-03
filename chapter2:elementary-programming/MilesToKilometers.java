public class MilesToKilometers {
  public static void main(String[] args){
    final double KILOMETERS_PER_MILE = 1.609;
    double miles = 100;
    double kilometers;

    kilometers = miles * KILOMETERS_PER_MILE;

    System.out.println(miles + " miles to kilometers is " + kilometers);
  }
}
