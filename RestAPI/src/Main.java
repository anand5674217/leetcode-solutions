import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

//        HttpURLConnection httpURLConnection=null;
//
//        String url="https://jsonmock.hackerrank.com/api/tvseries/";
////        HttpURLConnection connection= new URLConnection(URL.of(url)) {
////            @Override
////            public void connect() throws IOException {
////              this.connect(new URL(url));
////            }
////        }
//
//        URL obj= new URL(url);
//         httpURLConnection= (HttpURLConnection) obj.openConnection();
//
//         httpURLConnection.setRequestMethod("GET");
//         httpURLConnection.setRequestProperty("Accept","application/json");
//
//         httpURLConnection.setConnectTimeout(1000);
//         httpURLConnection.setReadTimeout(5000);
//
//
//        BufferedReader in= new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//        StringBuilder sb=new StringBuilder();
//        String response;
//        while((response= in.readLine())!=null){
//            sb.append(response);
//        }
//
//        in.close();
//        System.out.println( "Response:"+ sb.toString());



        String url = "https://jsonmock.hackerrank.com/api/tvseries/";

        URL obj = new URL(url);

        HttpURLConnection httpURLConnection =

                (HttpURLConnection) obj.openConnection();

        httpURLConnection.setRequestMethod("GET");

        httpURLConnection.setRequestProperty("Accept", "application/json");

        httpURLConnection.setConnectTimeout(5000);

        httpURLConnection.setReadTimeout(5000);

        int responseCode = httpURLConnection.getResponseCode();

        System.out.println("Response Code: " + responseCode);

        BufferedReader in =

                new BufferedReader(

                        new InputStreamReader(httpURLConnection.getInputStream())

                );

        StringBuilder sb = new StringBuilder();

        String response;

        while ((response = in.readLine()) != null) {

            sb.append(response);

        }

        in.close();

        System.out.println("Response: " + sb);


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create("https://jsonmock.hackerrank.com/api/tvseries/"))

                .GET()

                .build();

        HttpResponse<String> response1 =

                client.send(request,

                        HttpResponse.BodyHandlers.ofString());

        System.out.println(response1.statusCode());

        System.out.println(response1.body());

    }
}