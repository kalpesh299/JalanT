package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
      String url="https://dummy.restapiexample.com/api/v1/employees";

        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client= HttpClient.newBuilder().build();
        HttpResponse response= client.send(request,HttpResponse.BodyHandlers.ofString());



        System.out.print(response.body());


    }
}