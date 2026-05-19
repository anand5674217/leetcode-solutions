import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class FetchData {

    public static void main(String[] args) throws Exception {
        String url = "https://jsonmock.hackerrank.com/api/tvseries/";
        List<TVSeries> tvSeriesList = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        int page = 1;
        while (true) {
            String pageUrl = url + "?page=" + page;
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(pageUrl))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> httpResponse = client.send(
                    httpRequest,
                    HttpResponse.BodyHandlers.ofString()
            );

            ResponseObject responseObject = objectMapper.readValue(httpResponse.body(), ResponseObject.class);

            System.out.println("Status code: " + httpResponse.statusCode());
            System.out.println("Page: " + responseObject.page());
            System.out.println("Total pages: " + responseObject.total_pages());
            System.out.println("First TV series: " + responseObject.data().get(0));


            for (int i = 0; i < responseObject.data().size(); i++) {
                TVSeries tvSeries = responseObject.data().get(i);
                tvSeriesList.add(tvSeries);
            }
            if (page == responseObject.total_pages()) {
                return;
            }
            page++;
        }

    }
}
