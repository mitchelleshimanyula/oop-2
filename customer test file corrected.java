import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerVerification {
    @Test
    public void validateCustomerName() {
        CustomerInfo customer = new CustomerInfo("Jane Smith", "janesmith@email.com", "0987654321");
        assertEquals("Jane Smith", customer.getCustomerName());
    }

    @Test
    public void validateCustomerEmail() {
        CustomerInfo customer = new CustomerInfo("Jane Smith", "janesmith@email.com", "0987654321");
        assertEquals("janesmith@email.com", customer.getContactEmail());
    }

    @Test
    public void validateCustomerPhoneNumber() {
        CustomerInfo customer = new CustomerInfo("Jane Smith", "janesmith@email.com", "0987654321");
        assertEquals("0987654321", customer.getContactNumber());
    }
}