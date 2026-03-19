import org.junit.*;

public class conversiontest {
    
    private conversion convert = new conversion();

    @Test
    public void testRound() {
        //controllability
        double result = convert.round(3.14159);
        //observability
        Assert.assertEquals(3.14, result, 0.001);
    }

    @Test
    public void testF2C() {
        //controllability
        double result = convert.convertF2C(32);
        //observability
        Assert.assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testC2F() {
        //controllability
        double result = convert.convertC2F(0);
        //observability
        Assert.assertEquals(32.0, result, 0.001);
    }

    @Test
    public void testIn2CM() {
        //controllability
        double result = convert.convertIn2Cm(1);
        //observability
        Assert.assertEquals(2.54, result, 0.001);
    }

    @Test
    public void testCm2In() {
        //controllability
        double result = convert.convertCm2In(2.54);
        //observability
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testF2M() {
        //controllability
        double result = convert.convertF2M(1);
        //observability
        Assert.assertEquals(0.3, result, 0.001);
    }

    @Test
    public void testM2F() {
        //controllability
        double result = convert.convertM2F(0.3048);
        //observability
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testM2K() {
        //controllability
        double result = convert.convertM2K(1000);
        //observability
        Assert.assertEquals(1609.0, result, 0.001);
    }

    @Test
    public void testK2M() {
        //controllability
        double result = convert.convertK2M(1);
        //observability
        Assert.assertEquals(0.62, result, 0.001);
    }

    @Test
    public void testG2L() {
        //controllability
        double result = convert.convertG2L(1000);
        //observability
        Assert.assertEquals(3785.0, result, 0.001);
    }

    @Test
    public void testL2G() {
        //controllability
        double result = convert.convertL2G(1);
        //observability
        Assert.assertEquals(0.26, result, 0.001);
    }

    @Test
    public void testOz2G() {
        //controllability
        double result = convert.convertOz2G(1);
        //observability
        Assert.assertEquals(28.35, result, 0.001);
    }
    
    @Test
    public void testG2Oz() {
        //controllability
        double result = convert.convertG2Oz(28.3495);
        //observability
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testLb2K() {
        //controllability
        double result = convert.convertLb2K(1);
        //observability
        Assert.assertEquals(0.45, result, 0.001);
    }

    @Test
    public void testK2Lb() {
        //controllability
        double result = convert.convertK2Lb(0.453592);
        //observability
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testH2S() {
        //controllability
        double result = convert.convertH2S(1);
        //observability
        Assert.assertEquals(3600.0, result, 0.001);
    }

    @Test
    public void testS2H() {
        //controllability
        double result = convert.convertS2H(3600);
        //observability
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test //in conversiontest.java, red
    public void testMph2Kph() {
	    //controllability
        double result = convert.convertMph2Kph(1);
   	    //observability
    	Assert.assertEquals(1.61, result, 0.01);
    }

    @Test //in conversiontest.java, red
    public void testKph2Mph() {
        //controllability
        double result = convert.convertKph2Mph(1);
   	    //observability
    	Assert.assertEquals(0.62, result, 0.01);
    }

    @Test //in conversiontest.java, red
    public void testC2K() {
        //controllability
        double result = convert.convertC2K(0);
        //observability
        Assert.assertEquals(273.15, result, 0.001);
    }

    @Test //in conversiontest.java, red
    public void testK2C() {
        //controllability
        double result = convert.convertK2C(273.15);
        //observability
        Assert.assertEquals(0.0, result, 0.001);
    }
}