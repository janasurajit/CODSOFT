package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void exchange(String fromCountry, String toCountry, float amount)throws IOException, InterruptedException {
        var url="https://api.frankfurter.dev/v1/latest?base="+fromCountry+"&symbols="+toCountry+"&amount="+amount;
        var client=HttpClient.newBuilder().build();
        var request=HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        var data=response.body();

        // System.out.println(response.statusCode());
        // System.out.println(data);
        
        JSONObject jsonObject = new JSONObject(data);
        JSONObject rateoObject = jsonObject.getJSONObject("rates");
        float value = rateoObject.getFloat(toCountry);
        System.out.println(amount+" "+fromCountry+" = "+value+" "+toCountry);
    }

    public static void main(String[] args) {
        Map<Integer,String> country = new HashMap<>();
        country.put(1,"USD");
        country.put(2,"INR");
        country.put(3,"CAD");
        country.put(4,"EUR");
        country.put(5,"JPY");
        country.put(6,"NPR");

        String toCountry, fromCountry;
        int country1,country2;
        float amount;
        System.out.println(country);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the From Country");        
        country1=sc.nextInt();
        System.out.println("Enter the To Country");
        country2=sc.nextInt();
        System.out.println("Enter the amount:");
        amount=sc.nextFloat();
        sc.close();
        fromCountry=country.get(country1);
        toCountry=country.get(country2);

       try{
        exchange(fromCountry,toCountry,amount);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
      

    
