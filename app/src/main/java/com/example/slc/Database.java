package com.example.slc;

import java.util.*;
import java.io.*;

public class Database {
    private ArrayList<StudentInfo> students;

    public static String[] codes = {
            "1234567890",
            "0123456789",
            "2345678901",
            "3456789012",
            "4567890123"
    };

    public Database () throws FileNotFoundException {

        this.students = new ArrayList<>();
        Scanner input = new Scanner(new File("/Users/benajasandrain/Desktop/Winter 19/Application Development Club/SLC2/app/src/main/java/com/example/slc/StudentsList.txt"));


        while (input.hasNextLine()) { // filling the array with the location
            Scanner line = new Scanner(input.nextLine());
            String id = line.next();
            String first = line.next();
            String last = line.next();

            this.students.add(new StudentInfo(first, last, id));
        }

        input.close();
    }

    public void addToDatabase(StudentInfo student){
        students.add(student);

        // I have to write back to the file now.q
    }

    public boolean equals(String other){
        for (int i=0; i<students.size(); i++) {
            StudentInfo student=students.get(i);
            if (student.getSid().equals(other)) {
                return true;
            }
        }
        return false;
    }


    public String[] fillBackOriginal (ArrayList<String> arr){
        String[] result = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }
        return result;
    }


    public ArrayList<StudentInfo> getStudents() {
        return this.students;
    }
}
