package org.treblereel;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 9/10/19
 */
@J2clTestInput(DomTest.class)
public class DomTest {

    @Test
    public void testOne() {
        assertEquals(true, true);

    }
}
