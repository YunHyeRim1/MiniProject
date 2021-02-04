package com.example.demo.shw.web;

import static com.example.demo.cmm.utl.Util.integer;
import static com.example.demo.cmm.utl.Util.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.enm.Table;
import com.example.demo.cmm.service.CommonMapper;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.shw.service.Show;
import com.example.demo.shw.service.ShowMapper;
import com.example.demo.shw.service.ShowService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired ShowService showService;
    @Autowired Pagination page;
    @Autowired ShowMapper showMapper;
    @Autowired CommonMapper commonMapper;

    @PostMapping("")
    public Messenger add(@RequestBody Show show) {
    	return showMapper.insert(show)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    
    @GetMapping("/list/{pageSize}/{pageNum}")
    public Map<?,?> list(@PathVariable String pageSize, @PathVariable String pageNum) {
    	logger.info("=========== 목록 진입 ===========");
        var map = new HashMap<String, String>();
        map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.SHOWS);	
    	var page = new Pagination(
				Table.SHOWS.toString(), 
				integer.apply(pageSize),
				integer.apply(pageNum),
				commonMapper.totalCount(map))
				;
    	var map2 = new HashMap<String, Object>();
    	map2.put("list", showService.list(page));
    	map2.put("page", page);
        return map2;
    }
    
    @GetMapping("/page/{pageSize}/{pageNum}/selectAll")
    public List<?> selectAll(@PathVariable String pageSize, @PathVariable String pageNum){
    	logger.info("Shows List Execute ...");
    	var map = new HashMap<String, String>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.SHOWS);	
        return showMapper.selectAll(new Pagination(
				Table.SHOWS.toString(), 
				integer.apply(pageSize),
				integer.apply(pageNum),
				commonMapper.totalCount(map)));
    }
    
    @GetMapping("/shows/{showNum}")
    public Show detail(@PathVariable String showNum) {
        return showService.getShowById(showNum);
    }
    
    @PutMapping("")
    public Messenger update(@RequestBody Show show){
    	logger.info("Shows Updated Execute ...");
        return showMapper.update(show)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    
    @DeleteMapping("")
    public Messenger delete(@RequestBody Show show){
    	logger.info("Shows Deleted Execute ...");
        return showMapper.delete(show)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
    
    @GetMapping("/count")
    public String count() {
    	logger.info(String.format("Count Shows ..."));
    	var map = new HashMap<String,String>();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.SHOWS);	
    	return string.apply(commonMapper.totalCount(map));
    }
}