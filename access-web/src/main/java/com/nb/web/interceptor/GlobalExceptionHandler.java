package com.nb.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseBody
@Controller
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler implements ErrorController{

	/**
	 * 方法异常处理
	 */
	@ExceptionHandler(value= {Exception.class, ArithmeticException.class})
	public String allExceptionHandler(HttpServletRequest request, Exception e){
		e.printStackTrace();
		return "cuowu:" + e.getMessage();
	}

	/**
	 * 请求路径异常处理
	 */
	@Override
	@ResponseBody
	public String getErrorPath() {
		return "error";
	}
	
	@RequestMapping(value = "/error")
	@ResponseBody
    public Object error(HttpServletResponse resp, HttpServletRequest req) {
        return "error request path";
    }
	
	/**
	 * 请求参数异常处理
	 */
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		return new ResponseEntity<Object>("param error", HttpStatus.NOT_EXTENDED);
	}
}
