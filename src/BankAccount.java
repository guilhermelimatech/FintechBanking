public class BankAccount {
    public static void main(String[] args) {
        // 1. Operational Data (Simulating a database pull)
        String accountType = "VIP";
        double accountBalance = 1000.00;
        double transferAmount = 250.00;
        double transferFee = 5.00;

        // 2. Business Logic (The Bank's Rules)
        System.out.println("Initiating transfer...");

        if (accountType.equals("VIP")) {
            transferFee = 0.00;
            System.out.println("VIP Client recognized. Transfer fee waived.");
        }

        double totalCost = transferAmount + transferFee;

        // 3. Security Check
        if (accountBalance >= totalCost) {
            accountBalance = accountBalance - totalCost;
            System.out.println("Transfer successful! Remaining balance: $" + accountBalance);
        } else {
            System.out.println("Transaction failed: Insufficient funds.");
        }
    }
}