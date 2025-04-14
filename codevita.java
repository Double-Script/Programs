import java.util.ArrayList;
import java.util.Scanner;

public class codevita {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Reading initial balance
            int balance = sc.nextInt();

            // Reading number of operations
            int N = sc.nextInt();
//            sc.nextLine();  // consume newline

            // Simple arrays to store history
            ArrayList<Integer> amounts = new ArrayList<>();       // stores amounts
            ArrayList<String> opTypes = new ArrayList<>();        // stores operation types
            ArrayList<Integer> commitBalances = new ArrayList<>(); // stores balances after commits
            int transCount = 0;  // count of credit/debit operations

            // Process all operations
            for(int i = 0; i < N; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                String operation = parts[0];

                // Using switch for each operation type
                switch(operation) {
                    case "read":
                        // Just print current balance
                        System.out.println(balance);
                        break;

                    case "credit":
                        // Add money to account
                        int creditAmount = Integer.parseInt(parts[1]);
                        balance += creditAmount;
                        amounts.add(creditAmount);
                        opTypes.add("credit");
                        transCount++;
                        break;

                    case "debit":
                        // Remove money if enough balance
                        int debitAmount = Integer.parseInt(parts[1]);
                        if(balance >= debitAmount) {
                            balance -= debitAmount;
                            amounts.add(debitAmount);
                            opTypes.add("debit");
                            transCount++;
                        }
                        break;

                    case "abort":
                        // Try to abort a transaction
                        int transNum = Integer.parseInt(parts[1]);

                        // Can only abort if not committed
                        if(transNum <= transCount && commitBalances.size() == 0) {
                            int count = 0;
                            for(int j = 0; j < opTypes.size(); j++) {
                                // Count credit/debit operations
                                if(opTypes.get(j).equals("credit") ||
                                        opTypes.get(j).equals("debit")) {
                                    count++;
                                    if(count == transNum) {
                                        // Found transaction to abort
                                        if(opTypes.get(j).equals("credit")) {
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

                    case "commit":
                        // Save current balance
                        commitBalances.add(balance);
                        break;

                    case "rollback":
                        // Go back to previous commit
                        int commitNum = Integer.parseInt(parts[1]);
                        if(commitNum <= commitBalances.size()) {
                            balance = commitBalances.get(commitNum - 1);
                        }
                        break;
                }
            }

            sc.close();
        }

}
