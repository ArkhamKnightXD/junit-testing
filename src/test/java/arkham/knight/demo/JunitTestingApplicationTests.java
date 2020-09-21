package arkham.knight.demo;

import arkham.knight.demo.models.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JunitTestingApplicationTests {

    Calculator calculator = new Calculator();

    //Para empezar con la prueba unitaria de una funcion de una clase, primero debo de crear una funcion e indicarle arriba el @Test
    @Test
    public void testCalculatorAdd(){

        //assertEquals toma dos parametros el primer es el esperado y el segundo sera lo que nos retorne la funcion, si los parametros son iguales
        //la prueba pasara, pero si son diferentes la prueba fallara y esto quiere decir que la funcion tiene un error y este error me lo indicara en la consola
        // me dira que valor tira la funcion y me mostrara el esperado
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testCalculatorLess(){

        assertEquals(10, calculator.less(20, 10));
    }

    @Test
    public void testCalculatorMultiply(){

        assertEquals(16, calculator.multiply(4, 4));
    }

    @Test
    public void testCalculatorDivide(){

        assertEquals(2, calculator.divide(8,4));
    }

    @Test
    public void testCalculatorAddFloat(){

        assertEquals(8.5f, calculator.addFloat(4.3f,4.2f));
    }

    @Test
    public void testCalculatorNumberToString(){

        assertEquals("5", calculator.numberToString(5));
    }
}
