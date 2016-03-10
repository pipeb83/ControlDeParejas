package com.companyname.springapp.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class ControladorBienvenidaTest {

    @Test
    public void testHandleRequestView() throws Exception{		
        ControladorBienvenida controller = new ControladorBienvenida();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("Hello.jsp", modelAndView.getViewName());
    }

}