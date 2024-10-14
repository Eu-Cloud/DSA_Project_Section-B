package phonebook_project;

import java.util.ArrayList;

public class Phone_Functions {

    // Variable, Array to store contact data
    ArrayList<Phone> p1;

    // Default constructor
    Phone_Functions() {
        p1 = new ArrayList<>();
    }

    // Add Contact , myfunction 1
    public void addcontact(String name, String number) {
        Phone p = new Phone(name, number);
        p1.add(p);
        System.out.println("\nContact Added Successfully!!!!");
    }

    // Delete Contact , myfunction 2
    public void removecontact(String name) {
        boolean found = false; // To track if the contact is found

        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i).getCont_name().equalsIgnoreCase(name)) {
                p1.remove(i);
                System.out.println("\nContact Deleted Successfully!!!!");
                found = true;
                break; // Exit loop after deleting the contact
            }
        }

        if (!found) {
            System.out.println("\nContact Not Found!!!!");
        }
    }

    // Update Contact , myfunction 3
    public void updatecontact(String name, String number) {
        boolean found = false; // To track if the contact is found

        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i).getCont_name().equalsIgnoreCase(name)) {
                p1.get(i).setCont_numb(number);
                System.out.println("\nContact Updated Successfully!!!!");
                found = true;
                break; // Exit loop after updating the contact
            }
        }

        if (!found) {
            System.out.println("\nContact Not Found!!!!");
        }
    }

    // Search Contact , myfunction 4
    public Phone searchcontact(String name) {
        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i).getCont_name().equalsIgnoreCase(name)) {
                System.out.println("\nContact Found Successfully!!!!");
                return p1.get(i);
            }
        }
        // If contact is not found, print message and return null
        System.out.println("\nContact Not Found!!!!");
        return null;
    }

    // Display All Contacts , myfunction 5
    public void printAllcontact() {
        if (p1.isEmpty()) {
            System.out.println("\nNo Contact is Saved in Phonebook!");
        } else {
            for (Phone p : p1) {
                System.out.println(p);
            }
        }
    }

    // Sort All Contacts Alphabetically , myfunction 6
    public void sortContactByAlphabet() {
        int n = p1.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (p1.get(j).getCont_name().compareToIgnoreCase(p1.get(j + 1).getCont_name()) > 0) {
                    // Swapping
                    Phone temp = p1.get(j);
                    p1.set(j, p1.get(j + 1));
                    p1.set(j + 1, temp);
                }
            }
        }
        System.out.println("All Contacts sorted alphabetically!!!!!.");
    }
}