package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;



public class ApproximatePITest {

    @Test
    public void main() {
    }

    @Test
    public void approxPi() {
        Assert.assertEquals(ApproximatePI.approxPi(100000000), 3.141, 0.0009);
    }
}