package br.com.alura.store.http;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavahttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> data) {
		try {
			URL apiUrl = URI.create(url).toURL();
			URLConnection conn = apiUrl.openConnection();
			conn.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Error while sending http request");
		}

	}

}
