package com.profcristianoaf81.html5inputs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author cristianoaf81
 */
@ManagedBean(name="indexBean")
@ViewScoped
public class IndexBean {
    
    private List<String> userLanguages = new ArrayList<>();
    private String currentLanguage = "";
    private String[] favoriteFoods;

    public List<String> getUserLanguages() {
        return userLanguages;
    }

    public void setUserLanguages(List<String> userLanguages) {
        this.userLanguages = userLanguages;
    }

    public String getCurrentLanguage() {
        return currentLanguage;
    }

    public void setCurrentLanguage(String currentLanguage) {
        this.currentLanguage = currentLanguage;
    }

    public String[] getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(String[] favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }   
    
    public void add(){
        userLanguages.add(currentLanguage);
        currentLanguage = null;
        System.out.println(currentLanguage);
        System.out.println(userLanguages);
    }

    public void formSubmitted(){    
        System.out.println(Arrays.toString(favoriteFoods));       
    }
}
