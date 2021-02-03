package com.example.demo.shw.web;

import java.util.List;
import java.util.Map;

import com.example.demo.cmm.utl.Printer;
import com.example.demo.cmm.utl.Proxy;
import com.example.demo.shw.service.Show;
import com.example.demo.shw.service.ShowService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired Printer printer;
    @Autowired ShowService showService;
    @Autowired Proxy px;

    @PostMapping("/shows")
    public Map<?,?> add(@RequestBody Show show) {
        var map = px.hashmap();
        map.put("message", px.message(showService.add(show)));
        return map;
    }
    @GetMapping("/shows")
    public Map<?,?> list() {
        printer.accept("===== 목록 진입 =====");
        var map = px.hashmap();
        map.put("count", showService.count());
        List<Show> l = showService.list();
        System.out.println("목록 수: "+l.size());
        map.put("list", l);
        return map;
    }
    @GetMapping("/shows/{showNum}")
    public Show detail(@PathVariable String showNum) {
        return showService.getShowById(showNum);
    }
    @PutMapping("/shows")
    public Map<?,?> update(@RequestBody Show show){
        printer.accept("수정할 데이터: "+show.toString());
        var map = px.hashmap();
        int result = showService.update(show);
        map.put("message", (result == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
    @DeleteMapping("/shows")
    public Map<?,?> delete(@RequestBody Show show) {
        printer.accept("삭제할 데이터: "+show.getTitle());
        var map = px.hashmap();
        int result = showService.delete(show);
        map.put("message", (result == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
}