package com.profcristianoaf81.html5inputs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author cristianoaf81
 */
@ManagedBean
@ViewScoped
public class HomeBean {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static final List<Book> books = new ArrayList<>();
    static {
        books.add(new Book("crime e castigo", "dostoievsk", 30d));
        books.add(new Book("biblia sagrada", "varios", 2d));
        books.add(new Book("os irmãos karamazov", "dostoievsk", 25d));
    }
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static final List<String> favoriteFood = new ArrayList();
    static {
        favoriteFood.add("Lazanha");
        favoriteFood.add("café");
        favoriteFood.add("chocolate");
    }
    private String selectedFood = "";
    private String destroyTheWorld = "";
    private String userSelectedLanguage = "";
    
    private List<String> langs = new ArrayList<>();
    private Map<String,Boolean> languages = new HashMap<>();

    public List<String> getLangs() {
        return langs;
    }

    public void setLangs(List<String> langs) {
        this.langs = langs;
    }

    public Map<String, Boolean> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, Boolean> languages) {
        this.languages = languages;
    }
    
    

    public List<String> getUserLanguages() {
        return userLanguages;
    }

    public void setUserLanguages(List<String> userLanguages) {
        this.userLanguages = userLanguages;
        this.userLanguages.add(userSelectedLanguage);
        this.userSelectedLanguage = null;
    }
    private List<String> userLanguages = new ArrayList<>();
    
    public String getUserSelectedLanguage() {
        return userSelectedLanguage;
    }

    public void setUserSelectedLanguage(String userSelectedLanguage) {
        this.userSelectedLanguage = userSelectedLanguage;                
    }
    
    
    public String getDestroyTheWorld() {
        return destroyTheWorld;
    }

    public void setDestroyTheWorld(String destroyTheWorld) {
        this.destroyTheWorld = destroyTheWorld;
    }

    public String getSelectedFood() {
        return selectedFood;
    }

    public void setSelectedFood(String selectedFood) {
        this.selectedFood = selectedFood;
    }    
    
    public List<Book> getBookList(){
        return books;
    }
    
    public List<String> getFoodList(){
        return favoriteFood;
    }
    
    public static class Book{
        String title;
        String author;
        Double price;

        public Book(String title, String author, Double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }  
        

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
        
        
    }
    
    public HomeBean(){
        langs.add("português");
        langs.add("english");
        langs.add("spañol");
        for(String lang : langs)
        {
            languages.put(lang, Boolean.FALSE);
        }
    }
    
    public void showSelectedfields(){
        System.out.println("alimento seleciondado : "+selectedFood);
        System.out.println(destroyTheWorld+" destruir o mundo!");
                
        List<String> UserSelectdLanguage = new ArrayList<>();
        for(Entry<String,Boolean> entry : languages.entrySet())
        {
            if(entry.getValue() == true)
                UserSelectdLanguage.add(entry.getKey());
                
        }
        
        Iterator i = UserSelectdLanguage.iterator();
        
        while(i.hasNext())
        {
            String s = (String) i.next();
            System.out.println("idioma escolhido: "+s);
        }
            
        
    }
    
    
}
