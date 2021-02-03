package com.example.demo.shw.service;

import com.example.demo.shw.service.Show;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ShowService {
	
	public int add(Show show);
	    
	public List<Show> list();
	
	public int count();
	
    public Show getShowById(String showNum);
    
	public int update(Show show);
	
	public int delete(Show show);

}
