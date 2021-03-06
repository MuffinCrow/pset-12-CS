import java.util.ArrayList;

public class ProblemSet12 {

    public long factorial(int n) {
        if (n > 0) {
            long fact = 1;
            for (int i = n; i > 0; i--) {
                fact *= i;
            }
            return fact;
        }
        return -1;
    }

    public long fibonacci(int n) {
        if (n >= 0) {
            ArrayList<Long> fib = new ArrayList<Long>();
            fib.add((long) 0);
            fib.add((long) 1);

            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                for (int i = 0; i < n - 1; i++) {
                    fib.add(fib.get(i) + fib.get(i + 1));
                }
                return fib.get(fib.size() - 1);
            }
        }
        return -1;
    }

    public long triangle(int rows) {
        if (rows >= 0) {
            if (rows == 0) return 0;

            long out = 0;

            for (int i = 0; i <= rows; i++) {
                out += i;
            }

            return out;
        }
        return -1;
    }

    public long sumDigits(int n) {
        if (n >= 0) {
            String sNum = String.valueOf(n);
            String[] nums = sNum.split("");

            long sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += Integer.parseInt(nums[i]);
            }

            return sum;
        }
        return -1;
    }

    public long powerN(int base, int exponent) {
        if (base >= 1 && exponent >= 1) {
            long out = 1;

            for (int i = 0; i < exponent; i++) {
                out *= base;
            }

            return out;
        }
        return -1;
    }

    public String changeXY(String text) {
        if (text != null) {
            text = text.replaceAll("x", "y");
            return text;
        }
        return null;
    }

    public int array11(int[] data, int index) {
        if (data != null && index >= 0 && index <= data.length - 1) {
            int count = 0;

            for (int i = index; i < data.length; i++) {
                if (data[i] == 11) {
                    count++;
                }
            }

            return count;
        }
        return -1;
    }

    public int strCount(String text, String sub) {
        if (text != null && sub != null && sub.length() > 0) {
            int count = 0;

            for (int i = 0; i < text.length() - sub.length() + 1; i++) {
                String temp = text.substring(i, i + sub.length());

                if (temp.equals(sub)) {
                    count++;
                }
            }

            return count;
        }
        return -1;
    }

    public boolean strCopies(String text, String sub, int n) {
        if (text != null && sub != null && sub.length() > 0 && n >= 0) {
            int count = 0;

            for (int i = 0; i < text.length() - sub.length() + 1; i++) {
                String temp = text.substring(i, i + sub.length());

                if (temp.equals(sub)) {
                    count++;
                }
            }

            if (n <= count) {
                return true;
            }
        }
        return false;
    }

    public int strDist(String text, String sub) {
        if (text != null && sub != null && sub.length() > 0) {
            int count = 0;
            int outlen = 0;

            for (int i = 0; i < text.length() - sub.length() + 1; i++) {
                String temp = text.substring(i, i + sub.length());

                if (temp.equals(sub)) {
                    count++;
                }
            }
            if (count > 1) {
                int tempC = count;
                count = 0;

                for (int i = 0; i < text.length() - sub.length() + 1; i++) {
                    String temp = text.substring(i, i + sub.length());

                    if (temp.equals(sub)) {
                        count++;
                       if (count == 1) outlen = i;
                       if (count == tempC) outlen = (i + 1 + sub.length()) - (outlen + 1);
                    }
                }
                return outlen;
            } else if (count == 1) {
                return sub.length();
            } else {
                return 0;
            }
        }
        return -1;
    }
}
