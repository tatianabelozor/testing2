/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myCode.CalculatorImp;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 *
 * @author user
 */
public class CalculatorTestNG {

    private CalculatorImp calculator;

    @BeforeClass
    public void setUp() {
        calculator = new CalculatorImp();
    }

    public CalculatorTestNG() {
    }

    @Test
    public void zeroTest() {
        // double result=calculator.calculate("0");//выдаст ошибку
        double result = calculator.calculate("1");
        assertEquals(result, 1.0, "Error! zeroTest not pass!");
    }

    @Test
    public void floatingPointTest() {
        // double result = calculator.calculate("-300002");//выдаст ошибку
        double result = calculator.calculate("-3000.02");
        assertEquals(result, -3000.02, "Error! floatingPointTest not pass!");
    }

    @Test
    public void addTest_1() {
        // double result = calculator.calculate("31.4/2");//выдаст ошибку
        double result = calculator.calculate("30.4/2");
        assertEquals(result, 15.2, "Error! addTest_1 not pass!");
    }

    @Test
    //сложное вычисление
    public void addTest_2() {
       //  double result = calculator.calculate("(2+2)*1.5/10-445");//выдаст ошибку
       double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result, -443.4, "Error! addTest_2 not pass!");
    }

    @Test
    //функции
    public void functionTest() {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        //assertEquals(result, 1, "Error! functionTest not pass!");//выдаст ошибку
        assertEquals(result, 1.0, "Error! functionTest not pass!");
    }
}
