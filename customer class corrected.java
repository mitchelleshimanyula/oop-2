public class ClientProfile {
    private String fullName;
    private String contactInformation;
    private String mobileContact;

    public ClientProfile(String fullName, String contactInformation, String mobileContact) {
        this.fullName = fullName;
        this.contactInformation = contactInformation;
        this.mobileContact = mobileContact;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getMobileContact() {
        return mobileContact;
    }
}