import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SheepAndSheepManagerTest {

    @Test
    
    public void testAddSheep() {
        SheepManager sheepManager = new SheepManager();
        Sheep sheep = new Sheep("chrish","Pink",172,75);
        int numberOfSheep = sheepManager.AddSheep(sheep);
        assertEquals(0, numberOfSheep);
    }

    @Test
    public void mockAddSheep() {
        SheepManager sheepManager = mock(SheepManager.class);
        Sheep sheep = new Sheep("chrish","Pink",172,75);
        sheepManager.AddSheep(sheep);

        verify(sheepManager, times(1)).AddSheep(sheep);
//        verify(sheepManager,times(100000)).verifyAddSheep(100000,sheep);
    }

}
