public class zad3 {
    public static void main(String[] args) {
        int bananW = 80;
        int milkW = 105;
        int milkIceW = 100;
        int eggW = 70;
        int banan = 5;
        int milk = 2;
        int milkIce = 2;
        int egg = 4;
        bananW =  banan * bananW;
        milkW = milk * milkW;
        milkIceW = milkIce * milkIceW;
        eggW = egg * eggW;
        float sProdWeight = bananW+milkW+milkIceW+eggW;
        sProdWeight = sProdWeight/1000;
        System.out.println("Вес спорт-завтрака равен "+sProdWeight+" кг");
    }
}
