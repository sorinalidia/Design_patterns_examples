package app;
import factory.*;

public class ApplicationConfigurator {
    GUIFactory factory;
    public void mainA(String OS){
        if(OS=="Windows"){
            factory=new WinFactory();
        }
        else if(OS=="Mac"){
            factory=new MacFactory();
        }

        Application app= new Application(factory);
        app.createUI();
        app.paint();
    }

    public static void main(String[]arg){
        ApplicationConfigurator appConfig=new ApplicationConfigurator();
        appConfig.mainA("Web");
    }
}
