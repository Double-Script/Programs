import java.util.ArrayList;
import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Add main balance:");
        int balance = sc.nextInt();
        System.out.println("Add number of operations:");
        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> amounts = new ArrayList<>();
        ArrayList<String> operationTypes = new ArrayList<>();
        ArrayList<Integer> commitBalances = new ArrayList<>();
        int transCount = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Enter operation:");
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String operation = parts[0];

            switch (operation) {
                case "read": // Read balance
                    System.out.println("Balance: " + balance);
                    break;

                case "credit": // Credit
                    int creditAmount = Integer.parseInt(parts[1]);
                    balance += creditAmount;
                    amounts.add(creditAmount);
                    operationTypes.add("credit");
                    transCount++;
                    break;

                case "debit": // Debit
                    int debitAmount = Integer.parseInt(parts[1]);
                    if (balance >= debitAmount) {
                        balance -= debitAmount;
                        amounts.add(debitAmount);
                        operationTypes.add("debit");
                        transCount++;
                    } else {
                        System.out.println("Insufficient balance for debit operation.");
                    }
                    break;

                case "abort": // Abort
                    int transNum = Integer.parseInt(parts[1]);
                    if (transNum <= transCount && commitBalances.size() == 0) {
                        int count = 0;
                        for (int j = 0; j < operationTypes.size(); j++) {
                            if (operationTypes.get(j).equals("credit") ||
                                    operationTypes.get(j).equals("debit")) {
                                count++;
                                if (count == transNum) {
                                    if (operationTypes.get(j).equals("credit")) {
                                        balance -= amounts.get(j);
                                    } else {
                                        balance += amounts.get(j);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "commit": // Commit
                    commitBalances.add(balance);
                    break;

                case "rollback": // Rollback
                    int commitNum = Integer.parseInt(parts[1]);
                    if (commitNum <= commitBalances.size()) {
                        balance = commitBalances.get(commitNum - 1);
                    } else {
                        System.out.println("Invalid commit number for rollback.");
                    }
                    break;

                default:
                    System.out.println("Invalid operation.");
            }
        }

        sc.close();
    }
}
