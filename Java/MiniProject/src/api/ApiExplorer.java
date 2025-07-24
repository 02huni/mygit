package api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
	public static void main(String[] args) throws IOException{
		
		StringBuilder urlBuilder=new StringBuilder("'http://api.odcloud.kr/api/3074462/v1/uddi:161740bd-8ec5-4734-9a3d-f7a2cde34942?page=1&perPage=10'");
		urlBuilder.append("?"+URLEncoder.encode("serviceKey","UTF-8")+"u8qlheiQ7+E5Lp55FPk7JHOP4y72jkROhJkWmsyexrH7tcKmU8DmiGU0MdlWHfip06wfOoQKeMPfWxD+3EU3DA==");
		urlBuilder.append("&"+URLEncoder.encode("page","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("perPage","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("totalCount","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("currentCount","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("matchCount","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));
	
		URL url=new URL(urlBuilder.toString());
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application.json");
		System.out.println("Response code:" +conn.getResponseCode());
		
		BufferedReader rd;
		if(conn.getResponseCode() >=200&& conn.getResponseCode()<=300) {
			rd=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			rd=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb= new StringBuilder();
		String line;
		while((line=rd.readLine())!=null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}

}
