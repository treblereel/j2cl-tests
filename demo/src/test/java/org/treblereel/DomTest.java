package org.treblereel;

import com.google.j2cl.junit.apt.J2clTestInput;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 9/10/19
 */
@J2clTestInput(DomTest.class)
public class DomTest extends TestCase {

    public void testOne() {

        assertEquals(true, true);

    }
}