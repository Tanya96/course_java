package sandbox;

import org.testng.annotations.Test;

/**
 * Created by taty on 31.07.2017.
 */
public class SquareTests {

    @Test
    public void testArea(){
        Square a = new Square(5);
        assert a.area() == 25;
    }
}
