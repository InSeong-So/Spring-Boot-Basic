package jpashop.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date createdDate;
    
    private Date lastModifiedDate;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public Date getCreatedDate()
    {
        return createdDate;
    }
    
    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }
    
    public Date getLastModifiedDate()
    {
        return lastModifiedDate;
    }
    
    public void setLastModifiedDate(Date lastModifiedDate)
    {
        this.lastModifiedDate = lastModifiedDate;
    }
    
}