package vn.edu.it209.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CalculatorService Tests")
class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("Cộng hai số dương")
    void testAdd_PositiveNumbers() {
        int result = calculatorService.add(3, 5);
        assertEquals(8, result, "3 + 5 phải bằng 8");
    }

    @Test
    @DisplayName("Cộng số âm với số dương")
    void testAdd_NegativeAndPositive() {
        int result = calculatorService.add(-3, 5);
        assertEquals(2, result, "-3 + 5 phải bằng 2");
    }

    @Test
    @DisplayName("Trừ hai số")
    void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result, "10 - 4 phải bằng 6");
    }

    @Test
    @DisplayName("Nhân hai số")
    void testMultiply() {
        int result = calculatorService.multiply(3, 7);
        assertEquals(21, result, "3 * 7 phải bằng 21");
    }

    @Test
    @DisplayName("Chia hai số hợp lệ")
    void testDivide_ValidNumbers() {
        double result = calculatorService.divide(10, 4);
        assertEquals(2.5, result, 0.001, "10 / 4 phải bằng 2.5");
    }

    @Test
    @DisplayName("Chia cho 0 phải ném ngoại lệ")
    void testDivide_ByZero_ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(10, 0),
                "Chia cho 0 phải ném IllegalArgumentException");
    }
}
