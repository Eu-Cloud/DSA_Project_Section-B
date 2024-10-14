//package
package phonebook_project;

//libraries
import java.util.Scanner;

//my main class 
public class PhoneBook_Project {

   
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    Phone phone=new Phone();
    Phone_Functions phoneBook=new Phone_Functions();
    int option;
    String pname,pnumber,nsearch,dname, nnamee, nphonee;
    

    do{

        System.out.println("\nSelect From Menu: \n1. Insert Contact \n2. Search Contact"
                + "\n3. Display all Contacts \n4. Delete Contacts \n5. Update Conatcts \n6. Sort Contacts"
                + "\n7. Quit");
        System.out.println("\nEnter Your Choice: ");
        option=s.nextInt();
        
        if(option==1){
        System.out.println("\nEnter Contact Name: ");
        pname=s.next();
        System.out.println("Enter Contact Number: ");
        pnumber=s.next();
        phoneBook.addcontact(pname, pnumber);

        }
        else if(option==2){
        System.out.println("\nEnter Contact Name to Search: ");
        nsearch=s.next();
        System.out.println(phoneBook.searchcontact(nsearch));
    }
        else if(option==3){
            phoneBook.printAllcontact();
        }
        else if(option == 4){
        System.out.println("\nEnter Contact Name you want to Delete: ");
        dname=s.next();  
        phoneBook.removecontact(dname);
    }
        else if(option == 5){
        System.out.println("\nEnter Contact Name you want to Update: ");
        nnamee=s.next(); 
        System.out.println("Enter New Number to Update: ");
        nphonee=s.next(); 
        phoneBook.updatecontact(nnamee, nphonee);
    }
        else if(option==6){
            phoneBook.sortContactByAlphabet();
            phoneBook.printAllcontact();
        }
        else if(option==7){
        System.out.println("Existing the Program..........");
        return;
        }
        else{
        System.out.println("\nInvalid OptioN! Please choose option from Menu........");
       
        }
    }
    while(option!=7);


    }
    
}