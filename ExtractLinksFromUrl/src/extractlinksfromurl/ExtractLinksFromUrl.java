/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractlinksfromurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extrae los links de una url de internet. Abre la URL, carga el contenido en
 * un String y por medio de una expresion regular busca los href="enlace"
 * 
 * @author Chuidiang
 * 
 */
public class ExtractLinksFromUrl {

   public static void main(String[] args) throws Exception {
      String content = extractContent("https://onedrive.live.com/?id=178FA09E3D01FE1A%21161&cid=178FA09E3D01FE1A");
      showLinks(content);
   }

   private static String extractContent(String urlString)
         throws MalformedURLException, IOException {
      URL url = new URL(urlString);
      URLConnection urlConnection = url.openConnection();
      InputStream is = urlConnection.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String content = "";
      String linea = br.readLine();
      while (null != linea) {
         content += linea;
         linea = br.readLine();
      }
      return content;
   }

   private static void showLinks(String content) {
      Pattern pattern = Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
      Matcher matcher = pattern.matcher(content);
      while (matcher.find()) {
         System.out.println(matcher.group(1));
      }
   }

}
