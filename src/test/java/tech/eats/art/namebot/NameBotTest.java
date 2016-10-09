package tech.eats.art.namebot;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by John on 9/26/16.
 */
public class NameBotTest {

    boolean verdict;

    @NameCheck
    public class badClassName{
        private void BadMethodName(){

        }

        private void AnotherBadMethodName(){

        }
    }

    @Before
    public void setUp() throws Exception {
        verdict = false;

    }

    @Test
    public void returnTrueOnBadClassName() throws Exception{
        boolean verdict = NameBot.isClassNameBad("terribleClassName");
        assertTrue(verdict);
    }

    @Test
    public void returnFalseOnCoolClassName() throws Exception{
        boolean verdict = NameBot.isClassNameBad("CoolClassName");
        assertFalse(verdict);
    }

    @Test
    public void returnPositiveOnTurribleMethodName() throws Exception{
        boolean verdict = NameBot.isMethodNameBad("TerribleMethodName");
        assertTrue(verdict);
    }

    @Test
    public void returnFalseOnCoolMethodName() throws Exception{
        boolean verdict = NameBot.isMethodNameBad("coolMethodName");
        assertFalse(verdict);
    }

    @Test
    public void returnListOfTerribleMethodNames() throws Exception{
        List<String> badMethodNames =  NameBot.getBadMethodNames(badClassName.class);
        assertNotNull(badMethodNames);
    }

}