public class ConvexPentagon {

    // Identify a pentagon that is convex and whose interior angles are all distinct prime number,
    // and the sum of all digits of angles is a perfect cube.
    public static void main(String[] args) {

        for (int i = 1; i < 180; i++) {
            for (int j = 2; j < 180; j++) {
                for (int k = 3; k < 180; k++) {
                    for (int l = 4; l < 180; l++) {
                        for (int m = 5; m < 180; m++) {
                            if (isPrime(i) && isPrime(j) && isPrime(k) && isPrime(l) && isPrime(m) && isPentagon(i, j, k, l, m)) {
                                int sumOfDigit = sumDigit(i) + sumDigit(j) + sumDigit(k) + sumDigit(l) + sumDigit(m);
                                if (isCube(sumOfDigit)) {
                                    System.out.println("Solution: " + i + " " + j + " "+ k + " "+ l + " "+ m);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private static boolean isCube(int n) {
        // Get the cube root
        double cubeRoot = Math.cbrt(n);
        return Math.round(cubeRoot) == cubeRoot;
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0 && n > 2) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }

    private static boolean isPentagon(int i, int j, int k, int l, int m) {
        int sum = i + j + k + l + m;
        return sum == 540;
    }
}
