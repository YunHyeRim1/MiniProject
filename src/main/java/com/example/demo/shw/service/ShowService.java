package com.example.demo.shw.service;

import com.example.demo.cmm.utl.Pagination;
import com.example.demo.shw.service.Show;

import static java.util.Comparator.comparing;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface ShowService {
	
	
	public int add(Show show);
	    
	public List<Show> list(Pagination page);
		
	public int count();
	
    public Show getShowById(String showNum);
    
	public int update(Show show);
	
	public int delete(Show show);

}
