import java.lang.module.Configuration;

public class Application {
    Dialog dialog;
    //String OS;
    public void initialize(String OS){
        if (OS == "Windos") {
            dialog = new WindowsDialog();
        } else if (OS=="Web"){
            dialog=new WebDialog();
        }
    }
    public void main(String OS){
        this.initialize(OS);
        dialog.render();

    }
}
