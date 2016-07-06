/*
 * CS1632 Software Quality Assurance 
 * Deliverable 4 
 * Lecture Monday & Wednesday 2:30~4:15 
 */
package laboonify;

import com.sun.javafx.fxml.expression.Expression;
import java.util.Random;
import javafx.beans.binding.Bindings;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.*;

/**
 *
 * @Lun Xi 
 */
public class LaboonifyTest {
    
    public LaboonifyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * The following test will check out the functionality of the function
     * whether it is giving the desired output or not
     * If the output matches with our expected output test pass
     */
    @Test
    public void testLaboonify() {
        
        int[] x = {1, 2, 3};
        Laboonify instance = new Laboonify();
        int[] expResult = {1, 4, 9, 14};
        int[] result = instance.laboonify(x);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * The following test will check out the numbers in the array
     * whether the number in array are greater than 0 and less than 100
     * If it contains any other number that is < 0 or >100 the result should be null
     * If the output is null then test pass else not
     */
    @Test
    public void testNumbers() {
        
        System.out.println("Testing Numbers");
        
        int x[] = new int[] {-1, -2, 5, 6};
        Laboonify instance = new Laboonify();
        int[] result = instance.laboonify(x);
        assertArrayEquals(null, result);
    }
    
    /**
     * The following test will check out the length of the array
     * If the length is less than equal to 0 or greater than 100 the output will be null 
     * If the output is null then test pass else not
     */
    @Test
    public void testLength() {
        
        System.out.println("Testing Length");
        
        int x[] = new int[0];
        Laboonify instance = new Laboonify();
        int[] result = instance.laboonify(x);
        assertArrayEquals(null, result);
    }
    
    
    
}
