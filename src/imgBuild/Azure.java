//https://docs.microsoft.com/es-es/azure/cognitive-services/Computer-vision/quickstarts/java-analyze
package imgBuild;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Azure {

//    https://westcentralus.api.cognitive.microsoft.com/vision/v1.0
//https://westcentralus.api.cognitive.microsoft.com/vision/v2.0
//Clave 1: 66ebfe0f0b8844b185b394968aa2a26f
//Clave 2: c1db0fbfa4ea4f979ba101bf7afde240
    private static String imageToAnalyze;
    private static final String subscriptionKey = "c1db0fbfa4ea4f979ba101bf7afde240";
    private static final String uriBase
            = "https://westcentralus.api.cognitive.microsoft.com/vision/v2.0/analyze";

    public String getImageToAnalyze() {
        return imageToAnalyze;
    }

    public void setImageToAnalyze(String imageToAnalyze) {
        Azure.imageToAnalyze = imageToAnalyze;
        shareDataJson();
    }

    public void shareDataJson() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {
            URIBuilder builder = new URIBuilder(uriBase);

            // Request parameters. All of them are optional.
            builder.setParameter("visualFeatures", "Categories,Description,Color");
            builder.setParameter("language", "en");

            // Prepare the URI for the REST API method.
            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers.
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);

            // Request body.
            StringEntity requestEntity
                    = new StringEntity("{\"url\":\"" + imageToAnalyze + "\"}");
            request.setEntity(requestEntity);

            // Call the REST API method and get the response entity.
            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                // Format and display the JSON response.
                String jsonString = EntityUtils.toString(entity);
                JSONObject json = new JSONObject(jsonString);

                JSONObject json1 = json.getJSONObject("color");
                JSONObject json2 = json.getJSONObject("description");
                JSONObject json3 = json.getJSONObject("description");
                JSONObject json4 = (JSONObject) (json3.getJSONArray("captions")).get(0);

                System.out.println(json2.getJSONArray("tags"));
                System.out.println(json1.get("dominantColors"));
                System.out.println(json4.get("confidence"));

                // System.out.println(" tags " + json.get("tags"));
                // System.out.println("REST Response:\n");
                //System.out.println(json.getJSONArray("dominantColorForeground"));
                // System.out.println(jsonString);  
            }
        } catch (Exception e) {
            // Display error message.
            System.out.println(e.getMessage());
        }

    }

}
