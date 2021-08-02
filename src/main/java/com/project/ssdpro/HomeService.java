package com.project.ssdpro;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class HomeService {
	private static String DEAGU_COVID_OUTBREAK_URL = "http://covid19.daegu.go.kr/00937400.html";
//	private HomeMapper homeMapper;
	
	@PostConstruct
	public void getCovidOutBreak() throws IOException {
		Document doc = Jsoup.connect(DEAGU_COVID_OUTBREAK_URL).get();
		Elements contents = doc.select("table tbody tr");
		
		//System.out.println(doc);
		
		System.out.println(contents);
	}
}
