package org.example;

import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "abcdefg";
        int arr[] = new int[26];
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            int ind = ch - 'a';
            System.out.println(ch+" "+ind);
            arr[ind]++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class User {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }


}