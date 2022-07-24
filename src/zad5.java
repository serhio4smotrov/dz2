public class zad5 {
    public static void main(String[] args) {
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKris = 76230;
        int monthInYear = 12;
        int zpMashaYear = zpMasha * monthInYear;
        int zpDenisYear = zpDenis * monthInYear;
        int zpKrisYear = zpKris * monthInYear;
        zpMasha = zpMasha * 110 / 100;
        zpDenis = zpDenis * 110 / 100;
        zpKris = zpKris * 110 / 100;
        int zpMashaYear1 = zpMasha * monthInYear;
        int zpDenisYear1 = zpDenis * monthInYear;
        int zpKrisYear1 = zpKris * monthInYear;
        zpMashaYear = zpMashaYear1 - zpMashaYear;
        zpDenisYear = zpDenisYear1 - zpDenisYear;
        zpKrisYear = zpKrisYear1 - zpKrisYear;
        System.out.println("Теперь зарплата Маши стала " + zpMasha + " рублей, а годовой заработок стал на " + zpMashaYear + " рублей больше");
        System.out.println("Теперь зарплата Дениса стала " + zpDenis + " рублей, а годовой заработок стал на "+zpDenisYear+" рублей больше");
        System.out.println("Теперь зарплата Кристины стала "+zpKris+" рублей, а годовой заработок стал на "+zpKrisYear+" рублей больше");
    }
}
