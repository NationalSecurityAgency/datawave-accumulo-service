package datawave.webservice.response.objects;

import datawave.webservice.query.util.StringMapAdapter;
import jakarta.xml.bind.annotation.XmlAccessOrder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorOrder;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.HashMap;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class Visibility {
    
    @XmlAttribute(name = "valid")
    private Boolean valid;
    
    @XmlElement(name = "markings")
    @XmlJavaTypeAdapter(StringMapAdapter.class)
    private HashMap<String,String> markings;
    
    @XmlAttribute(name = "visibility")
    private String visibility;
    
    public Boolean getValid() {
        return valid;
    }
    
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
    
    public String getVisibility() {
        return visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    
    public Map<String,String> getMarkings() {
        return markings;
    }
    
    public void setMarkings(Map<String,String> markings) {
        if (this.markings == null) {
            this.markings = new HashMap<String,String>();
        }
        this.markings.clear();
        if (markings != null) {
            this.markings.putAll(markings);
        }
    }
    
}
