package io.eventuate.util.test.async;

import org.junit.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlTesting {
  public static void assertUrlStatusIsOk(String url, int port, String path) throws IOException {
    HttpURLConnection connection = (HttpURLConnection)new URL(String.format("%s:%s/%s", url, port, path)).openConnection();

    Assert.assertEquals(200, connection.getResponseCode());
  }
}
