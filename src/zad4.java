public class zad4 {
    public static void main(String[] args) {
      int weight = 7;
      int weight1 = 250;
      int weight2 = 500;
      weight = weight * 1000;
      int howManyDays250 = weight / weight1;
      int howManyDays500 = weight / weight2;
      System.out.println("Количество дней при потере по 250 грамм в день равно " +howManyDays250);
      System.out.println("количество дней при потере по 500 грамм в день равно "+howManyDays500);
    }
}
