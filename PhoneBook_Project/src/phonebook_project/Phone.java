
package phonebook_project;

//my class  to get/set phone number & contact name
public class Phone {
    //variables
    private String cont_name;
    private String cont_numb;
    
    //default Constructor
    Phone(){
        this.cont_name="";
        this.cont_numb="";
    }
    
     //parameterize Constructor
    Phone(String n, String p){
        this.cont_name=n;
        this.cont_numb=p;
    }

    //name getter.....
    public String getCont_name() {
        return cont_name;
    }

    //name setter.....
    public void setCont_name(String cont_name) {
        this.cont_name = cont_name;
    }

    //number getter.....
    public String getCont_numb() {
        return cont_numb;
    }

    
    //number setter.....    
    public void setCont_numb(String cont_numb) {
        this.cont_numb = cont_numb;
    }

    @Override
    public String toString() {
        return "\n------------------------------"
                + "\nContact Name: "+this.cont_name +"\nContact Number: "+this.cont_numb
                +"\n------------------------------\n";
    }
    
    
}
