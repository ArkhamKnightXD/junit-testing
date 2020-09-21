package arkham.knight.demo.models;

public class Calculator {

    public int add(int number1, int number2){

        return number1 + number2;
    }

    public int less(int number1, int number2){

        return number1 - number2;
    }

    public int multiply(int number1, int number2){

        return number1 * number2;
    }

    public int divide(int number1, int number2){

        return number1 / number2;
    }

    public String numberToString(int number){

        return Integer.toString(number);
    }

    public float addFloat(float number1, float number2){

        return number1 + number2;
    }
}
