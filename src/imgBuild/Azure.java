//https://docs.microsoft.com/es-es/azure/cognitive-services/Computer-vision/quickstarts/java-analyze
package imgBuild;

import java.net.URI;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class Azure {

// https://westcentralus.api.cognitive.microsoft.com/vision/v1.0
//https://westcentralus.api.cognitive.microsoft.com/vision/v2.0
//Clave 1: 66ebfe0f0b8844b185b394968aa2a26f
//Clave 2: c1db0fbfa4ea4f979ba101bf7afde240
    ArrayList<Double> conf = new ArrayList<>();

    ArrayList<String> name = new ArrayList<>();
    private static String imageToAnalyze;
    private static final String subscriptionKey = "66ebfe0f0b8844b185b394968aa2a26f";
    private static final String uriBase
            = "https://westcentralus.api.cognitive.microsoft.com/vision/v1.0/tag";

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

                JSONArray json1 = json.getJSONArray("tags");

                for (int i = 0; i < json1.length(); i++) {
                    JSONObject json2 = (JSONObject) json1.get(i);
                    conf.add((Double) json2.get("confidence"));
                    name.add((String) json2.get("name"));
                    System.out.print("  ,  " + name.get(i));
                }
            }
        } catch (Exception e) {
            // Display error message.
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<String> tagTen() {
        ArrayList<String> tagt = new ArrayList<>();
        int tagLen;
        if (getName().size()>= 10) {
            tagLen = 10;
        } else {
            tagLen = getName().size();
        }

        for (int i = 0; i < tagLen; i++) {

            tagt.add(name.get(i));

        }
        return tagt;
    }

///////////////////////////////////////////GET&SET//////////////////////////////
    public ArrayList<Double> getConf() {
        return conf;
    }

    public void setConf(ArrayList<Double> conf) {
        this.conf = conf;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }
}
