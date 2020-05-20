package com.wxss.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @package: com.wxss.exception
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView processUnauthenticatedException(NativeWebRequest request, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", e);
        mv.setViewName("unauthorized");
        return mv;
    }
}
