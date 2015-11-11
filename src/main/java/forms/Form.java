package forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class Form {

    //champs du formulaire
    private String inputText;
    private String inputSecret = "secret";
    private String inputTextArea = "ligne1\nligne2\n";
    private String selectOneListBox1 = "2";
    private String selectOneListBox2 = "3";
    private String[] selectManyListBox = new String[]{"1", "3"};
    private String selectOneMenu = "1";
    private String[] selectManyMenu = new String[]{"1", "2"};
    private String inputHidden = "initial";
    private boolean selectBooleanCheckBox = true;
    private String[] selectManyCheckBox = new String[]{"1", "3"};
    private String selectOneRadio = "2";

    //événements
    public String submit() {
        return null;
    }

    //getters et setters
    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getInputSecret() {
        return inputSecret;
    }

    public void setInputSecret(String inputSecret) {
        this.inputSecret = inputSecret;
    }

    public String getInputTextArea() {
        return inputTextArea;
    }

    public void setInputTextArea(String inputTextArea) {
        this.inputTextArea = inputTextArea;
    }

    public String getSelectOneListBox1() {
        return selectOneListBox1;
    }

    public void setSelectOneListBox1(String selectOneListBox1) {
        this.selectOneListBox1 = selectOneListBox1;
    }

    public String getSelectOneListBox2() {
        return selectOneListBox2;
    }

    public void setSelectOneListBox2(String selectOneListBox2) {
        this.selectOneListBox2 = selectOneListBox2;
    }

    public String[] getSelectManyListBox() {
        return selectManyListBox;
    }

    public void setSelectManyListBox(String[] selectManyListBox) {
        this.selectManyListBox = selectManyListBox;
    }

    public String getSelectManyListBoxValue() {
        return getValue(selectManyListBox);
    }

    private String getValue(String[] chaines) {
        String value = "[";
        for (String chaine : chaines) {
            value += " " + chaine;
        }
        return value + "]";
    }

    public String getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(String selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }

    public String[] getSelectManyMenu() {
        return selectManyMenu;
    }

    public void setSelectManyMenu(String[] selectManyMenu) {
        this.selectManyMenu = selectManyMenu;
    }

    public String getSelectManyMenuValue() {
        return getValue(selectManyMenu);
    }

    public String getInputHidden() {
        return inputHidden;
    }

    public void setInputHidden(String inputHidden) {
        this.inputHidden = inputHidden;
    }

    public boolean getSelectBooleanCheckBox() {
        return selectBooleanCheckBox;
    }

    public void setSelectBooleanCheckBox(boolean selectBooleanCheckBox) {
        this.selectBooleanCheckBox = selectBooleanCheckBox;
    }

    public String[] getSelectManyCheckBox() {
        return selectManyCheckBox;
    }

    public void setSelectManyCheckBox(String[] selectManyCheckBox) {
        this.selectManyCheckBox = selectManyCheckBox;
    }

    public String getSelectManyCheckBoxValue() {
        return getValue(getSelectManyCheckBox());
    }

    public String getSelectOneRadio() {
        return selectOneRadio;
    }

    public void setSelectOneRadio(String selectOneRadio) {
        this.selectOneRadio = selectOneRadio;
    }

    public SelectItem[] getSelectOneListbox1Items() {
        return getItems("A", 3);
    }

    public SelectItem[] getSelectOneListbox2Items() {
        return getItems("B", 4);
    }

    public SelectItem[] getSelectManyListBoxItems() {
        return getItems("C", 5);
    }

    public SelectItem[] getSelectOneMenuItems() {
        return getItems("D", 3);
    }

    public SelectItem[] getSelectManyMenuItems() {
        return getItems("E", 4);
    }

    public SelectItem[] getSelectManyCheckboxItems() {
        return getItems("F", 3);
    }

    public SelectItem[] getSelectOneRadioItems() {
        return getItems("G", 4);
    }

    private SelectItem[] getItems(String label, int qte) {
        SelectItem[] items = new SelectItem[qte];
        for (int i = 0; i < qte; i++) {
            items[i] = new SelectItem(i + 1, label + (i + 1));
        }
        return items;
    }

    // événements
    public String doAction2() {
        return "form2";
    }

    public String doAction4() {
        return "form4";
    }

    public String doAlea() {
        // un nombre aléatoire entre 1 et 3
        int i = 1 + (int) (3 * Math.random());
        // on rend la clé de navigation
        return "form" + i ;
    }

    public String throwException() throws java.lang.Exception {
        throw new Exception("Exception test");
    }

}
