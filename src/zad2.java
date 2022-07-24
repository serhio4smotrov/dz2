public class zad2 {
    public static void main(String[] args) {
        float weight1Box = 78.2f;
        float weight2Box = 82.7f;
        float sWeight = weight1Box + weight2Box;
        float rWeight = weight1Box - weight2Box;
        if (rWeight<0){rWeight = rWeight*(-1);}
        System.out.println("Сумма веса обооих боксеров равна " + sWeight + " кг");
        System.out.println("Разница веса двух боксеров равна " + rWeight + " кг");

    }
}
