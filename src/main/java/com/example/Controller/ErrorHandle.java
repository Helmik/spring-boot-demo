package com.example.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ErrorHandle implements ErrorController{
	
	private static final String ERROR_PATH = "/error";
	private ErrorAttributes errorAttributes;
	
	@RequestMapping(value = ERROR_PATH)
	public String Error(){
		System.out.println("--------------------");
		return "404 handling";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return ERROR_PATH;
	}
	
	/**
     * Supports the HTML Error View
     * @param request
     * @return
     *
    @RequestMapping(value = ERROR_PATH, produces = "text/html")
    public ModelAndView errorHtml(HttpServletRequest request) {
        return new ModelAndView("/students", getErrorAttributes(request, false));
    }
    
    /**
     * Controller for the Error Controller
     * @param errorAttributes
     *
    public ErrorHandle(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }
    
    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return this.errorAttributes.getErrorAttributes(requestAttributes,includeStackTrace);
	}*/
}
