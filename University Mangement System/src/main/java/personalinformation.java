public class personalinformation {
    String firstname , secondname , lastname ; 
    String fullname = firstname + secondname + lastname ;  
    String monthbirth ;
    int daybirth , yearbirth ; 
    String gender ; 
    String nationality ; 
    int id ; 
    String nationalitytype ; 

    personalinformation(String firstname, String gender) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void personalinformation (String firstname ,String gender  ){
    
       this.firstname = firstname; 
       this.gender = gender ; 
      
      
    }
}
