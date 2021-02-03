package com.example.demo.shw.service;

import com.example.demo.shw.service.Show;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ShowMapper {
	
	public int insert(Show show);

	public List<Show> selectAll();

	public Show selectById(String showNum);

	public int update(Show show);

	public int delete(Show show);

	public int count();
}
