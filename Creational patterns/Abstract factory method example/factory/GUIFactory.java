package factory;

import checkbox.Checkbox;
import button.*;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
