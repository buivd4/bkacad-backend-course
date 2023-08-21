public class Lec03Prac01 {
    public static void main(String[] args) {
        final String IMPERIAL = "Imperial";
        final int IMPERIAL_CONVERSION_RATE=703;
        final String METRIC = "Metric";

        double weight=60;
        double height=1.7;
        // kilograms | meters
        String unit=METRIC;

        // inches | pounds
        // String unit=IMPERIAL

        // Calculate..
        int conversionRate=(unit.equals(IMPERIAL))? IMPERIAL_CONVERSION_RATE:1;
        double bmiMetric=conversionRate*(weight/(height*height));
        String ketQua = "";
        if(bmiMetric<18.5){
            ketQua="Gay";
        }else if(bmiMetric<25){ 
            ketQua="Binh thuong"; 
        }else { 
            ketQua="Thua can"; 
        }

        System.out.printf("Ket qua BMI: %f => %s",bmiMetric,ketQua); 
    }
}
