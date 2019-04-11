package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Network1 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://ggoreb.com/python/json/data2.jsp");
			URLConnection con = url.openConnection();

			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);

			String result = "";
			while (true) {
				String data = reader.readLine();
				if (data == null) {
					break;
				}
				result += data;
				System.out.println(result);
				
				JSONArray arr = new JSONArray(result);
				for (int i = 0; i < args.length; i++) {
					JSONObject obj = arr.getJSONObject(i);
					int age = obj.getInt("age");
					String name = obj.getString("name");
					System.out.println(age + " " + name);
				}

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
