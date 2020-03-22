package com.epam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class RemoveAfromFirstTwoChar
{
    /* TODO list for my feature
     * 1. 2 chars : AB => B
     * 2. 2 chars : BA => B
     * 3. 4 chars : ABCD => BCD
     * 4. 1 char : AA => ""
     * 5. empty char : "" => ""
     */

    RemoveAfromFirst2 removeAffromFirst2;
    @BeforeEach
    void setup()
    {
        removeAffromFirst2 = new RemoveAfromFirst2();
    }
    @Test
    void testRemove()
    {
        String actual = removeAffromFirst2.removeA("AB");
        assertEquals("B", actual);
    }
    @Test
    void test2Char()
    {
        String actual = removeAffromFirst2.removeA("BA");
        assertEquals("B", actual);
    }
@Test
    void test2Achar()
    {
        String actual = removeAffromFirst2.removeA("BBAA");
        assertEquals("BBAA", actual);
    }
@Test
    void test2Achar2()
    {
        String actual = removeAffromFirst2.removeA("BAA");
        assertEquals("BA", actual);
    }

}
