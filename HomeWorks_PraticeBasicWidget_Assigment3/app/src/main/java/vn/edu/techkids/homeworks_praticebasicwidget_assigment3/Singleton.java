package vn.edu.techkids.homeworks_praticebasicwidget_assigment3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/7/2016.
 */
public class Singleton {
    private static List<Employee> listEmp = new ArrayList();

    public static List<Employee> getListEmployee() {
        return listEmp;
    }
}
