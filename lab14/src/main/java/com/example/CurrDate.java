package com.example;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrDate extends SimpleTagSupport {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    String color;
    String size;

    public void doTag() throws JspException, IOException {
        Date date = new Date();
        String strDate = dateFormat.format(date);
        JspWriter out = getJspContext().getOut();
        if (color != null && size != null) {    //Color and size was given
            out.write(String.format("<span style='color:%s;font-size:%s'>%s</span>", color, size, strDate));
            return;
        }
        if (color == null && size == null) {    //Nor Color or Size given
            out.write(String.format("<span >%s</span>", strDate));
            return;
        } else {
            if (size == null)                   //Only color and size was given
                out.write(String.format("<span style='color:%s'>%s</span>", color, strDate));
            else                                //Only size was given
                out.write(String.format("<span style='font-size=%s'>%s</span>", size, strDate));
        }
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
