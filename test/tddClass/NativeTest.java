package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    private Native aNative;

    @Test
    public void setCohortIdTest(){
        Native aNative = new Native();
        aNative .setCohortId(13);
        assertEquals(0,aNative.getCohortId());

    }

    @Test
    public void lyingSCVIDTest(){
        Native aNative = new Native();
        aNative.setCohortId(12);
        System.out.println(aNative.getScvId());
        assertEquals("SCV-UNICORNS0", aNative.getScvId());
    }
}