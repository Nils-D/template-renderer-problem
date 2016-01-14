package com.auswertung.plugins.auswertungjira.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.templaterenderer.TemplateRenderer;

import java.util.HashMap;
import java.util.Map;

@Component
public class AuswertungJira extends HttpServlet
{
	
  private final TemplateRenderer templateRenderer;
	
  @Autowired
  public AuswertungJira(@ComponentImport TemplateRenderer templateRenderer)
  {
	  this.templateRenderer = templateRenderer;
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {          
      Map<String,Object> context = new HashMap<String,Object>();

      context.put("first", "Hello");
      context.put("second", "World");
      templateRenderer.render("AuswertungJira.vm", context, response.getWriter());
      
//      response.setContentType("text/html");
//      response.getWriter().write("<html><body>Hello World</body></html>");
  }
}