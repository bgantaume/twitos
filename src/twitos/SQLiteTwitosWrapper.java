/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twitos;

import java.util.ArrayList;
import java.util.List;

public class SQLiteTwitosWrapper {
    public List<String> getList() {
        ArrayList<String> list;
        list = new ArrayList<>();
        list.add("John Doe");
        list.add("Jean-Michel Dupond");
        return list;
    }
}
