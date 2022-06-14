package ru.zoommax.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.*;

public class http {
	public static String get(String url) {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				try {
					URL obj = new URL("https://api.telegram.org/bot" + url);
					HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
					connection.setRequestMethod("GET");
					BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					String inputLine;
					StringBuffer response = new StringBuffer();
					while ((inputLine = in.readLine()) != null) {
						response.append(inputLine);
					}
					in.close();
					return response.toString();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
		};
		FutureTask<String> future = (FutureTask)executor.submit(callable);
		try {
			return future.get();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
			return "error;"+e.getMessage()+";";
		}
	}
}

