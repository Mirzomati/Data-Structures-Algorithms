public class BigOSingleLoop {

    public static void main(String[] args) {
        long numberOfOperations=0;
        int n=100000;// size of Data
        int m = 100;

        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        // Task 1 Single Loop................... O(n)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operation Single Loop: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );
        numberOfOperations =0;

        // Task 2 Nested Loops...................
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operation nested Loops: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );
        numberOfOperations = 0;
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }

            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operation Triple nested Loops: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );
        numberOfOperations = 0;
        // Task 3 Triple Nested Loops...................

        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops  O(n*m)...................
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operation N*M nested Loops: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );

        numberOfOperations = 0;

        // Task 4 End...................

        // Task 4.5 N and M Consecutive Loops O(n+m)...................
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations+=1;
            }
            for (int k = 0; k < n; k++) {
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operation N+M Consecutive Loops: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );
        numberOfOperations = 0;
        // Task 4.5 End...................

        // Task 5 Logarithmic Complexity...................
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i*=2) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operation Logarithmic: " + numberOfOperations + " in " + (endTime-startTime) + " milliseconds" );

        // Task 5 End...................*/
    }
}