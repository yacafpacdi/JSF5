package utils;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ChangeLocale implements Serializable {

    private String locale = "fr";

    public ChangeLocale() {
    }

    public String getLocale() {
        return locale;
    }

    public String setFrenchLocale() {
        locale = "fr";
        return null;

    }

    public String setEnglishLocale() {
        locale = "en";
        return null;
    }
}
