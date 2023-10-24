package dialog;

import button.Button;
import button.WindowsButton;
import dialog.Dialog;

public class WindowsDialog extends Dialog {
    public Button createButton(){
        return new WindowsButton();
    }
}
