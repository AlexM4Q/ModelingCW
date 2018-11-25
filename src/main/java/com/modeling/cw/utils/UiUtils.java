package com.modeling.cw.utils;

import com.modeling.cw.entities.rows.Register16Row;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableView;

public final class UiUtils {

    private static final String ZERO = "0";

    public static void prepareRegisterTable(final TableView<Register16Row> table, final Runnable task) {
        final Register16Row register16Row = table.getItems().get(0);
        table.getColumns().forEach(column -> column.setCellFactory(p -> {
            final TableCell cell = new TableCell();
            final int number = Integer.valueOf(column.getText());
            cell.setText(ZERO);
            cell.setOnMouseClicked(event -> {
                final int newValue = cell.getText().equals(ZERO) ? 1 : 0;
                register16Row.set(number, newValue);
                cell.setText(String.valueOf(newValue));
                task.run();
            });
            return cell;
        }));
    }

}
