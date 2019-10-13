package Garbige.Office;

import java.util.ArrayList;

public class Hr {

    public void employees() {
        ArrayList<Secretary> employeesarr = new ArrayList();

        Secretary svetlana = new Secretary("Svetlana", 28, true, true);
        Secretary nikolai = new Secretary("Nikolai", 39, true, true);
        Secretary elena = new Secretary("Elena", 24, true, false);
        Secretary ludmila = new Secretary("Ludmila", 30, false, true);
        Secretary anastasiya = new Secretary("Anastasiya", 25, true, false);
        Secretary viktoriya = new Secretary("Viktoriya", 27, true, true);
        Secretary julia = new Secretary("Julia", 26, true, true);
        Secretary olesya = new Secretary("Olesya", 28, true, true);
        Secretary elizaveta = new Secretary("Elizaveta", 22, false, false);
        Secretary ekaterina = new Secretary("Ekaterina", 48, true, true);
        Secretary anna = new Secretary("Anna", 28, true, true);
        Secretary mariya = new Secretary("Mariya", 22, false, false);
        Secretary olga = new Secretary("Olga", 48, true, true);

        employeesarr.add(svetlana);
        employeesarr.add(nikolai);
        employeesarr.add(elena);
        employeesarr.add(ludmila);
        employeesarr.add(anastasiya);
        employeesarr.add(viktoriya);
        employeesarr.add(julia);
        employeesarr.add(olesya);
        employeesarr.add(elizaveta);
        employeesarr.add(ekaterina);
        employeesarr.add(anna);
        employeesarr.add(mariya);
        employeesarr.add(olga);

        System.out.println("Сотрудники созданы");

        Office office = new Office();
        office.concurence(employeesarr);
    }
}
