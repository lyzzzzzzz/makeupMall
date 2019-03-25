package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.ResponseBody;

import com.lyz.makeupMall.component.ResultCode;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class GlobalExceptionHandler {
	//@ExceptionHandler(Exception.class)
	//@ResponseBody
	public String exceptionHandler() {
		return ResultCode.ERRORSYSTEM;
	}
}
