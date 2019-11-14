package SpringBootBasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController
{
    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView mv)
    {
        mv.setViewName("index");
        mv.addObject("msg", "current data. ");
        DataObject obj = new DataObject(123, "lee", "lee@flower.com");
        mv.addObject("object", obj);
        return mv;
    }
}

class DataObject2
{
    private int id;
    
    private String name;
    
    private String value;
    
    public DataObject2(int id, String name, String value)
    {
        super();
        this.id = id;
        this.name = name;
        this.value = value;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getValue()
    {
        return value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
}