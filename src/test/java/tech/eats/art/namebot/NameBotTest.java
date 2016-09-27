package tech.eats.art.namebot;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by John on 9/26/16.
 */
public class NameBotTest {

    boolean verdict;

    @Before
    public void setUp() throws Exception {
        verdict = false;

    }

    @Test
    public void returnTrueOnTurribleClassName() throws Exception{
        boolean verdict = NameBot.isClassNameTurrible("terribleClassName");
        assertTrue(verdict);
    }

    @Test
    public void returnFalseOnCoolClassName() throws Exception{
        boolean verdict = NameBot.isClassNameTurrible("CoolClassName");
        assertFalse(verdict);
    }

    @Test
    public void returnPositiveOnTurribleMethodName() throws Exception{
        boolean verdict = NameBot.isMethodNameTurrible("TerribleMethodName");
        assertTrue(verdict);
    }

    @Test
    public void returnFalseOnCoolMethodName() throws Exception{
        boolean verdict = NameBot.isMethodNameTurrible("coolMethodName");
        assertFalse(verdict);
    }

}