package model;

import java.text.*;
import javafx.collections.*;
import javafx.beans.*;
import javafx.beans.property.*;
import javafx.beans.binding.*;

public class Stadium {
    private ObservableList<Group> groups = FXCollections.observableArrayList();
    
    private DoubleProperty income = new SimpleDoubleProperty();

    public Stadium() {
        groups.add(new Group("front", 300, 400.0));
        groups.add(new Group("middle", 1500, 100.0));
        groups.add(new Group("back", 200, 60.0));
        /* // Use an extractor so that observers are notified of changes to the income property */
        /* ObservableList<Group> groups = FXCollections.observableList(this.groups, */
        /* 		item -> new Observable[] { item.incomeProperty() }); */
        /* // Bind the stadium income to the sum of group incomes */
        /* income.bind(Bindings.createDoubleBinding(() ->  */
        /* 		groups.stream().mapToDouble(Group::getIncome).sum(), groups)); */
        // Use an extractor so that observers are notified of changes to the income property
        ObservableList<Group> groups = FXCollections.observableList(this.groups,
                item -> new Observable[] { item.incomeProperty() });
        // Bind the stadium income to the sum of group incomes
        income.bind(Bindings.createDoubleBinding(() -> 
                groups.stream().mapToDouble(Group::getIncome).sum(), groups));
    }

    public final ObservableList<Group> getGroups() { return groups; }
    
    /* public final double getIncome() { return income.get(); } */
    /* public ReadOnlyDoubleProperty incomeProperty() { return income; } */
    public final double getIncome() { return income.get(); }
    public ReadOnlyDoubleProperty incomeProperty() { return income; }
}
