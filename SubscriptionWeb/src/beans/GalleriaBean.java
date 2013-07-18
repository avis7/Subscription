package beans;

import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class GalleriaBean {  

  private List<String> images;  



  @PostConstruct  
  public void init() {  
      images = new ArrayList<String>();  
     
          images.add("galleria" + 2 + ".jpg");  
          images.add("galleria" + 3 + ".jpg");  
          images.add("galleria" + 7 + ".jpg");  
      
  }
     
   
  public List<String> getImages() {  
      return images;  
  }  
}