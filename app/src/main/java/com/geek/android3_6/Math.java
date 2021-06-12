package com.geek.android3_6;

public class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) return 0;
        return a / b;
    }

    public String[] reverse(String str) {
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        String[] res = new String[spaceCount + 1];
        for (int i = 0; i <= spaceCount; i++) {
            res[i] = str.split(" ")[spaceCount - i];
        }
        return res;
    }
}
