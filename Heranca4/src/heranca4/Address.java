package heranca4;

public class Address {
    private String Street;
    private String City;
    private String State;
    private String PostalCode;
    private String Country;
    
    public Address(String Street, String City, String State, String PostalCode, String Country) {
    this.Street = Street;
    this.City = City;
    this.State = State;
    this.PostalCode = PostalCode;
    this.Country = Country;
    }
    
    public void OutputAsLabel() {
        System.out.println(Street + ", " + City + ", " + State + " - " + PostalCode + ", " + Country);
    }
}
