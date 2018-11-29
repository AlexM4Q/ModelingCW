package com.modeling.cw.controllers;

import com.modeling.cw.constants.ExeMode;
import com.modeling.cw.constants.ModelingLevel;
import com.modeling.cw.entities.logic.MicroProgram;
import com.modeling.cw.entities.rows.Register16Row;
import com.modeling.cw.entities.rows.Register31Row;
import com.modeling.cw.entities.rows.Register3Row;
import com.modeling.cw.utils.MathUtils;
import com.modeling.cw.utils.UiUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Обработчик формы
 */
public final class MainController {

    /**
     * Таблица двоичного представления множимого
     */
    @FXML
    private TableView<Register16Row> a2Input_TV;
    /**
     * Поле десятичного представления множимого
     */
    @FXML
    private TextField a10Input_TF;
    /**
     * Таблица двоичного представления множителя
     */
    @FXML
    private TableView<Register16Row> b2Input_TV;
    /**
     * Поле десятичного представления множителя
     */
    @FXML
    private TextField b10Input_TF;
    /**
     * Таблица двоичного представления регистров множимого
     */
    @FXML
    private TableView<Register16Row> a2Process_TV;
    /**
     * Таблица двоичного представления регистров множителя
     */
    @FXML
    private TableView<Register16Row> b2Process_TV;
    /**
     * Таблица двоичного представления результата
     */
    @FXML
    private TableView<Register31Row> c2Result_TV;
    /**
     * Поле десятичного представления результата
     */
    @FXML
    private TextField c2Result_TF;
    /**
     * Кнопка контроля процесса
     */
    @FXML
    private Button processControl_B;
    /**
     * Таблица двоичного представления регистра счетчика
     */
    @FXML
    private TableView<Register3Row> ch2Process_TV;

    /**
     * Режим выполнения
     */
    private ExeMode exeMode;

    /**
     * Уровень моделирования ОУ
     */
    private ModelingLevel modelingLevel;

    /**
     * Запускается после полной подготовки формы.
     * Добавление строк регистров и назнчение логики нажатия
     * на ячейки таблиц ввода множимого и множителя
     */
    @FXML
    public void initialize() {
        a2Input_TV.getItems().add(new Register16Row());
        b2Input_TV.getItems().add(new Register16Row());
        a2Process_TV.getItems().add(new Register16Row());
        b2Process_TV.getItems().add(new Register16Row());
        c2Result_TV.getItems().add(new Register31Row());
        ch2Process_TV.getItems().add(new Register3Row());

        UiUtils.prepareRegisterTable(a2Input_TV, () -> convertBinaryToDecimal(a2Input_TV, a10Input_TF));
        UiUtils.prepareRegisterTable(b2Input_TV, () -> convertBinaryToDecimal(b2Input_TV, b10Input_TF));
    }

    /**
     * Очистка всех таблиц и полей вывода
     */
    @FXML
    private void clear_B_action() {
        a2Input_TV.getItems().get(0).clear();
        a2Input_TV.refresh();
        a10Input_TF.clear();

        b2Input_TV.getItems().get(0).clear();
        b2Input_TV.refresh();
        b10Input_TF.clear();

        a2Process_TV.getItems().get(0).clear();
        a2Process_TV.refresh();

        b2Process_TV.getItems().get(0).clear();
        b2Process_TV.refresh();

        c2Result_TV.getItems().get(0).clear();
        c2Result_TV.refresh();
        c2Result_TF.clear();

        ch2Process_TV.getItems().get(0).clear();
        ch2Process_TV.refresh();
    }

    /**
     * Обработка кнопки контроля процесса
     * Собираются данные из таблиц регистра ввода
     * Обрабатываются в микропрограмме
     * И выводят результат
     */
    @FXML
    private void processControl_B_action() {
        final byte[] aBinary = a2Input_TV.getItems().get(0).toArray();
        final byte[] bBinary = b2Input_TV.getItems().get(0).toArray();
        final byte[] execute = new MicroProgram(aBinary, bBinary).execute();

        final double aOct = MathUtils.binaryToDouble(aBinary);
        final double bOct = MathUtils.binaryToDouble(bBinary);
        final float result = (float) (aOct * bOct);
        c2Result_TF.setText(String.valueOf(result));
        c2Result_TV.getItems().get(0).set(execute);
        c2Result_TV.refresh();
    }

    @FXML
    private void exeModeAuto_RB_action() {
        exeMode = ExeMode.AUTO;
        processControl_B.setText("Старт");
    }

    @FXML
    private void exeModeTact_RB_action() {
        exeMode = ExeMode.TACT;
        processControl_B.setText("Такт");
    }

    @FXML
    private void modelingLevelMicroProgram_RB_action() {
        modelingLevel = ModelingLevel.MICRO_PROGRAM;
    }

    @FXML
    private void modelingLevelUAOA_RB_action() {
        modelingLevel = ModelingLevel.UAOA;
    }

    private static void convertBinaryToDecimal(final TableView<Register16Row> table, final TextField textField) {
        textField.setText(String.valueOf(table.getItems().get(0).toDouble()));
    }

}
