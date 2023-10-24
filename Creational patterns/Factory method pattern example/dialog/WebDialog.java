package dialog;

import button.Button;
import button.HTMLButton;
import dialog.Dialog;

public class WebDialog extends Dialog {
    public Button createButton(){
        return new HTMLButton();
    }
}
