package com.example.myapplication.tests;

import com.example.myapplication.StringRotation;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class StringRotationJUnit4Test {
        @Test
        public void testReverse(){
            Assert.assertEquals("dexdnimoF oocl 7/42", StringRotation.reversePhrase("Foxminded cool 24/7", "xl"));
            assertEquals("dcba hgfe", StringRotation.reversePhrase("abcd efgh", "xl"));
            assertEquals("dcb1a hgfle", StringRotation.reversePhrase("a1bcd efglh", "xl"));
            assertEquals("", "");
            assertNotEquals("dcb1a hgfle", StringRotation.reversePhrase("a1bcd efglh", "x"));
        }
}
