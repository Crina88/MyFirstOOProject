public class Human implements Vietate{
     String email;
    String address;
     static String planet;

    public Human(String email, String address) {
        this.email = email;
        this.address = address;
    }
    //email attribute is private
    public String getAdress (){
        return this.address;

    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAdress(String address){
        this.address=address;
    }
    //email attribute is private and can be returned only by calling this method
    public String getEmail(String email){
       return this.email;
    }

    public void verify(){
        System.out.println("Verifies email");
    }
    public void sendEmail(){
        System.out.println("Sends email");

    }

    @Override
    public void metodaInterfata() {
        System.out.println("Metoda din interfata Vietate");
    }

}



