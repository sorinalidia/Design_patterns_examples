package Factory;

import Checkbox.Checkbox;
import Button.*;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
