public class Lec02BMICalculator {
    public static void main(String[] args) {
        double weight = 70.0; // Cân nặng (kg)
        double height = 1.75; // Chiều cao (m)
        final double METRIC_CONSTANT = 1; // Hằng số chuyển đổi cho Kg/m^2

        double bmi = weight / (height * height);
        double imperialBMI = bmi * METRIC_CONSTANT;

        System.out.println("Chỉ số BMI của bạn là: " + imperialBMI);

        if (imperialBMI < 18.5) {
            System.out.println("Bạn có thể bị thiếu cân.");
        } else if (imperialBMI >= 18.5 && imperialBMI < 24.9) {
            System.out.println("Bạn có trọng lượng bình thường.");
        } else if (imperialBMI >= 25.0 && imperialBMI < 29.9) {
            System.out.println("Bạn có thể bị thừa cân.");
        } else {
            System.out.println("Bạn có thể bị béo phì.");
        }
    }
}
