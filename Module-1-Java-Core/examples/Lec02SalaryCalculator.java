public class Lec02SalaryCalculator {
    public static void main(String[] args) {
        double hoursWorked = 45.0; // Số giờ làm việc
        double hourlyWage = 10.0; // Mức lương mỗi giờ
        final double OVERTIME_RATE = 1.5; // Mức lương làm thêm giờ

        double regularPay = hoursWorked <= 40 ? hoursWorked * hourlyWage : 40 * hourlyWage;
        double overtimePay = hoursWorked > 40 ? (hoursWorked - 40) * OVERTIME_RATE * hourlyWage : 0;

        double totalPay = regularPay + overtimePay;

        System.out.println("Tiền lương của nhân viên: $" + totalPay);
    }
}
