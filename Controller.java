/*
* File: Controller.java
* Author: Faragó Csaba
* Copyright: 2023, Faragó Csaba
* Group: Szoft II_1_E
* Date: 2023-11-26
* Github: https://github.com/Szalami72/
* Licenc: GNU GPL
*/
public class Controller implements Controllable {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }

    @Override
    public void start() {
        System.out.println("A start metódus elindult!");
    }

    @Override
    public void stop() {
        System.out.println("A stop metódus elindult!");

    }

    @Override
    public void restart() {
        System.out.println("A restart metódus elindult!");

    }
}
