/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex27;

public class UserInfo {
    private String first_name;
    private String last_name;
    private String zip;
    private String id;

    public String validateFirstName() {
        String error = "";

        if(first_name.length() < 2 ) {
            error += "The first name must be at least 2 characters long.\n";
        }
        if(first_name.equals("")){
            error = "The first name must be filled in.\n";

        }

        return error;
    }

    public String validateLastName() {
        String error = "";

        if(last_name.length() < 2 ) {
            error += "The last name must be at least 2 characters long.\n";
        }

        if(last_name.equals("")){
            error += "The last name must be filled in.\n";

        }
        return error;
    }

    public String validateID() {
        String result = "";
        String substring = "-";
        try
        {
            if (id.length() > 7 || !(id.contains(substring) || !(Character.isLetter(id.charAt(0))) || !(Character.isLetter(id.charAt(1))) || !(Character.isDigit(id.charAt(3))) || !(Character.isDigit(id.charAt(4)))) || !(Character.isDigit(id.charAt(5))) || !(Character.isDigit(id.charAt(6)))) {
                result = "The employee ID must be in the format of AA-1234.\n";
            }
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            result = "The employee ID must be in the format of AA-1234.\n";
        }
        return result;
    }

    public String validateZIP() {
        String result = "";
        int intZIP;

        try {
            intZIP = Integer.parseInt(zip);
        } catch (NumberFormatException e) {
            result = "The zipcode must be a 5 digit number.";
        }

        return result;
    }

    public String validateInput() {
        String result = "";
        result += validateFirstName();
        result += validateLastName();
        result += validateID();
        result += validateZIP();

        if(result.equals("")) {
            result = "There were no errors found.";
        }
        return result;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
