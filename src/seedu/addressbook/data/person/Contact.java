package seedu.addressbook.data.person;

public class Contact {

    private String email;
    private String address;
    private String phonenumber;

    public Contact(String email, String address, String phonenumber){
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    


}
