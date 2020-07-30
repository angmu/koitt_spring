package com.board;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class ExceptionResolver implements ErrorController {

    @ExceptionHandler
    public ModelAndView handle(Exception e) {
        return new ModelAndView("errorPage", "message", e);
    }

    @Override
    public String getErrorPath() {
        return "error";
    }

    @RequestMapping("/error")
    public ModelAndView handleError(HttpServletRequest request) {
        return new ModelAndView("errorPage", "message", request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE));
    }

}
