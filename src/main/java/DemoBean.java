
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 *
 * @author cristianoaf81
 */

@ManagedBean
@RequestScoped
public class DemoBean {
    private List<String> items;
    private Map<String,Boolean> checkMap = new HashMap<>();
    
    public DemoBean(){
        items = new ArrayList<>();
        items.add("Passear");
        items.add("Ficar em casa");
        items.add("Ganhar dinheiro");
        
        //preenche o map
        for(String item : items)
        {
            this.checkMap.put(item, Boolean.FALSE);
        }
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, Boolean> getCheckMap() {
        return this.checkMap;
    }

    public void setCheckMap(Map<String, Boolean> checkMap) {
        this.checkMap = checkMap;
    }
    
    
    public void showSelectedItems(){
        String result = "";
        for (Entry<String,Boolean> entry : checkMap.entrySet())
        {
            if(entry.getValue() == true)
                result = result + ", "+entry.getKey();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        
        System.out.println("checkboxes selecionados: "+result);
    }
    
}
