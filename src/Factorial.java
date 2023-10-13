public class Factorial {
    public int calculateFactorial(int check){
        if (check < 0){
            throw new IllegalArgumentException("factorials are only defined on non-negative intergers");
        }

        int result = check;
        if (result > 1){
            result = check * calculateFactorial(check - 1);
        }
        return result;
    }
}
