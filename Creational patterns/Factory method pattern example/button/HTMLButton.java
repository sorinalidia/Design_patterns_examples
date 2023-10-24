package button;

import button.Button;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Web dialog successfully rendered!");
    }

    @Override
    public void onClick(String command) {

    }
}
