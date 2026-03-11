package com.yu.DSA.DesignPatterns.Creational;

public class AbstractFactoryDP {
    public static void main(String[] args) {
        UIFactory factory = new MacUIFactory();//new WindowsUIFactory();
        Application app = new Application(factory);
        app.renderUI();
    }

}

//Abstract Products
interface Button {
    void render();
}
interface CheckBox {
    void render();
}

//****Concrete ProductFamil 1****
class WindowButton implements Button {

    @Override
    public void render() {
        System.out.println("Window Button");
    }
}

class WindowCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Window CheckBox");
    }
}

//****Concrete ProductFamil 2****
class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Mac Button");
    }
}

class MacCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Mac CheckBox");
    }
}

//abstract Factory
abstract class UIFactory {
    abstract Button createButton();
    abstract CheckBox createCheckBox();
}

//concrete Factory1
class WindowsUIFactory extends UIFactory {

    @Override
    Button createButton() {
        return new WindowButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}

//concrete Factory2
class MacUIFactory extends UIFactory {

    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

//Client
class Application {
    Button button;
    CheckBox checkBox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkBox.render();
    }
}