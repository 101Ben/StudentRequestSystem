package com.example.slc;
import java.util.regex.Pattern;

public class StudentInfo {
    private String firstName, lastName, sid;


    public StudentInfo(String f, String l, String id){
        if (f.equals("") || l.equals("")){
            throw new IllegalArgumentException("invalid Name");
        }
        else {
            this.firstName = f;
            this.lastName = l;
        }

        if (!checkId(id)) {
            throw new IllegalArgumentException("Incorrect SID");
        }
        else this.sid = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getSid() {
        return sid;
    }


    public boolean checkId (String val){
        if(val.length() != 9) return false;

        Boolean found = val.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d");

        return found;
    }

}


