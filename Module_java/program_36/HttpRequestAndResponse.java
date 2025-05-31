package program_36;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestAndResponse {
    //introduced in java 11
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();

        //building a request

        HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("https://google.com")).build();

          //sending request and getting response
          HttpResponse<String>response = client.send(request,HttpResponse.BodyHandlers.ofString());
          System.out.println("Body: "+response.body());
    }
}
