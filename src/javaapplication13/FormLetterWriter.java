
package javaapplication13;

import javax.swing.JOptionPane;
        
public class FormLetterWriter {
    String LastName = "Khumalo";
    String FirstName = "Simphiwe";
            
    public void displaySalutation(String LastName){
    JOptionPane.showMessageDialog(null,"Dear Mr./Mrs."+LastName+" "+displayThisMessage());
    }
    public void displayGreeting(String FirstName, String LastName){
    JOptionPane.showMessageDialog(null,"Dear "+FirstName+" "+LastName+" "+displayThisMessage());
    }
    public static void main (String[] args){
    }   
    public String displayThisMessage(){
         
    return "Thank you for your recent order";
    }
}

