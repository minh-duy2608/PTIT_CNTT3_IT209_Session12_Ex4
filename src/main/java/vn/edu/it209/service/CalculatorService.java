package vn.edu.it209.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /**
     * Cộng hai số nguyên.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Trừ hai số nguyên.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Nhân hai số nguyên.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Chia hai số (trả về double).
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return (double) a / b;
    }
}
