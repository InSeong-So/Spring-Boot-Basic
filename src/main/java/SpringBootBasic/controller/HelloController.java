package SpringBootBasic.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloController
{
    String[] names = { "kim", "lee", "park", "choi", "jo" };
    
    String[] mails = { "kim@sis.com", "lee@flower.com", "park@golden.co.kr", "choi@count.com", "jo@vivaladiva.com" };
    
    @RequestMapping("/{id}")
    public DataObject2 index(@PathVariable int id)
    {
        return new DataObject2(id, names[id], mails[id]);
    }
    
}

class DataObject
{
    private int id;
    
    private String name;
    
    private String value;
    
    public DataObject(int id, String name, String value)
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
