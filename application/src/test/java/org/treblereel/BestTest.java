package org.treblereel;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 9/10/19
 */
@J2clTestInput(BestTest.class)
public class BestTest {

    @Test
    public void testOne() {

        assertEquals(true, true);
    }
}
