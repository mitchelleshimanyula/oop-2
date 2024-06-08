import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AutomotiveUnitTests {
    @Test
    public void verifyIdentificationNumber() {
        AutomotiveEntity entity = new AutomotiveEntity("XYZ789", "ManufacturerA", "ModelB", 2020);
        assertEquals("XYZ789", entity.getIdentificationNumber());
    }

    @Test
    public void verifyManufacturerDetails() {
        AutomotiveEntity entity = new AutomotiveEntity("XYZ789", "ManufacturerA", "ModelB", 2020);
        assertEquals("ManufacturerA", entity.getManufacturerDetails());
    }

    @Test
    public void verifyModelSpecification() {
        AutomotiveEntity entity = new AutomotiveEntity("XYZ789", "ManufacturerA", "ModelB", 2020);
        assertEquals("ModelB", entity.getModelSpecification());
    }

    @Test
    public void verifyProductionYear() {
        AutomotiveEntity entity = new AutomotiveEntity("XYZ789", "ManufacturerA", "ModelB", 2020);
        assertEquals(2020, entity.getProductionYear());
    }

    @Test
    public void verifyRentalStatus() {
        AutomotiveEntity entity = new AutomotiveEntity("XYZ789", "ManufacturerA", "ModelB", 2020);
        assertTrue(!entity.isRentedOut()); // Note: isRentedOut is initially false
    }
}