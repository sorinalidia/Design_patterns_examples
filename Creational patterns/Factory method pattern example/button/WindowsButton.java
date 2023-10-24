package button;

import button.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows dialog successfully rendered!");
    }

    @Override
    public void onClick(String command) {

    }
}
