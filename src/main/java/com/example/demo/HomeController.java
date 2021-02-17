package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
<<<<<<< HEAD
/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"ctx","cmm","brd"})
public class HomeController {
	@Autowired HttpSession session;
=======

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@SessionAttributes({"ctx","bkg","cmm", "uss"})
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired HttpSession session;
>>>>>>> refs/heads/develop-keb
	@Autowired HttpServletRequest request;
	
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index(HttpSession session, HttpServletRequest request) {
    	String ctx = request.getContextPath();
    	session.setAttribute("ctx", ctx);
    	session.setAttribute("bkg", session.getAttribute("ctx")+"/resources/bkg");
    	session.setAttribute("uss", session.getAttribute("ctx")+"/resources/uss");
    	session.setAttribute("cmm", session.getAttribute("ctx")+"/resources/cmm");
<<<<<<< HEAD
    	session.setAttribute("brd", session.getAttribute("ctx")+"/resources/brd");
        logger.info("Project Initialized ... ");
=======
        logger.info("Hello. This is LogManager's logger");
>>>>>>> refs/heads/develop-keb
        return "index";
    }
<<<<<<< HEAD
<<<<<<< HEAD
 
=======
    
>>>>>>> refs/heads/develop-pwy
    @GetMapping("/move/{dir}/{page}") 
    public String move(@PathVariable String dir, 
    						@PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 파일: " + page);
        return String.format("%s/%s", dir, page);
=======
    @GetMapping("/move/uss/{page}")
    public String moveUss(@PathVariable String page){
        logger.info("이동경로>>> uss/"+page);
        return String.format("uss:%s", page);
>>>>>>> refs/heads/develop-keb
    }
<<<<<<< HEAD
}
=======
    @GetMapping("/move/bkg/{page}")
    public String moveBkg(@PathVariable String page){
        logger.info("이동경로>>> bkg/"+page);
        return String.format("bkg:%s", page);
    }
}
>>>>>>> refs/heads/develop-keb
