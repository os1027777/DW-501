package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//Service : 서비스에서 로직(알고리즘)을 구현한다.
//비즈니스 구역(로직)
@Service
public class ApiService {
	
	
	/**
	 * @Since : 2022. 11. 23.
	 * @Author : mr.Hyun
	 * @Return : List<Movie>
	 * @Comment : 영화 만들기
	 */
	public List<Movie> makeMovies() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie movie = new Movie();
		movie.setTitle("Just Friends");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGenre("Comedy, Romance");
		
		Movie movie2 = new Movie();
		movie2.setTitle("Toy Story 42019");
		movie2.setYear("2019");
		movie2.setRuntime("100 min");
		movie2.setGenre("애니메이션");
		
		Movie movie3 = new Movie();
		movie3.setTitle("헤어질 결심");
		movie3.setYear("2022");
		movie3.setRuntime("138 min");
		movie3.setGenre("멜로/로맨스");
	
		list.add(movie);
		list.add(movie2);
		list.add(movie3);
		
		return list;
	}

}
