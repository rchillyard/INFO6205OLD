package edu.neu.coe.info6205.graphs.tunnels;

import edu.neu.coe.info6205.graphs.gis.Position_Spherical;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    private Building snellLibrary;
    private String snell;
    private String sn;

    @Before
    public void setUp() throws Exception {
        snell = "Snell Engineering Center";
        sn = "SN";
        snellLibrary = new Building(54, sn, "Center", 42.3382885, -71.0910495, true, snell);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals(sn, snellLibrary.getName());
    }

    @Test
    public void getPosition() {
        assertEquals(new Position_Spherical(42.3382885, -71.0910495), snellLibrary.getPosition());
    }

    @Test
    public void toStringTest() {
        assertEquals(snell, snellLibrary.toString());
    }

}