public class CreditPaymentService {
    public double calculate (double loanAmount, double rate, int loanPeriod){
        double monthlyRate = rate / (100 * 12);
        double denominator = 1 - Math.pow(1 + monthlyRate, -1 * loanPeriod);
        double monthlyPaymentAmount = loanAmount * (monthlyRate / denominator);
        return monthlyPaymentAmount;
    }
}
