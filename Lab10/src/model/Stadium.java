package model;

import java.text.*;
import java.util.*;
import javafx.collections.*;
import javafx.beans.*;
import javafx.beans.property.*;
import javafx.beans.binding.*;

public class Stadium {
    
   private ObservableList<Group> groups = FXCollections.observableArrayList();

    public Stadium() {
        groups.add(new Group("front", 300, 400.0));
        groups.add(new Group("middle", 1500, 100.0));
        groups.add(new Group("back", 200, 60.0));
    }

    public final ObservableList<Group> getGroups() { return groups; }
}
