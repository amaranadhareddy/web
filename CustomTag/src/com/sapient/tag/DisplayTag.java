package com.sapient.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DisplayTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<h1 style='text-align:center;background-color:wheat;color:orange;padding:10px'>");
		getJspBody().invoke(null);
		out.println("<h1>");
	}

}
