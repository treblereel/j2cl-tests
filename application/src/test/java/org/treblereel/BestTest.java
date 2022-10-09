package org.treblereel;

import com.google.j2cl.junit.apt.J2clTestInput;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 9/10/19
 */
@J2clTestInput(BestTest.class)
public class BestTest extends TestCase {

    @Test
    public void testOne() {

        assertEquals(true, true);
    }
}
