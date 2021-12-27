package com.example.testng_app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingController {

    @FXML
    private Button answer_conf_btn;

    @FXML
    private ToggleGroup answers;

    @FXML
    private Button close_app_btn;

    @FXML
    private Text question_text;

    @FXML
    private RadioButton radio_btn_1;

    @FXML
    private RadioButton radio_btn_2;

    @FXML
    private RadioButton radio_btn_3;

    @FXML
    private RadioButton radio_btn_4;
    //массив вопросов
    private Questions[] questions = new Questions[] {
            new Questions("В каком из вариантов представлен корректный формат вывода информации на экран?", new String[] {"Console.Write()", "console.log()", "print()", "System.out.println()"}),
            new Questions("Какой тип данных отвечает за целые числа?", new String[] {"String", "Float", "Boolean", "Integer"}),
            new Questions("Где правильно присвоено новое значение к многомерному массиву?", new String[] {"a(0)(0) = 1;", "a[0 0] = 1;", "a{0}{0} = 1;", "a[0][0] = 1;"}),
            new Questions("Какой метод позволяет запустить программу на Java?", new String[] {"Основного метода нет", "С класса, что был написан первым и с методов что есть внутри него", "Любой, его можно задавать в настройках проекта", "С метода main в любом из классов"}),
            new Questions("Каждый файл должен называется...", new String[] {"по имени первой библиотеки в нём", "по имени названия пакета", "как вам захочется", "по имени класса в нём"}),
            new Questions("Сколько параметров может принимать функция?", new String[] {"5", "10", "20", "неограниченное количество"})

    };
private int NowQuestion = 0, correctAnswers;
    private String nowCorrectAnswer;
    @FXML
    public void initialize(){
        // Берем корректный ответ для текущего вопроса
        nowCorrectAnswer = questions[NowQuestion].correctAnswer();

        answer_conf_btn.setOnAction(e -> {
            //нажал на кнопку
            RadioButton selectedRadio = (RadioButton) answers.getSelectedToggle();
            if (selectedRadio != null) {
                String toggleGroupValue = selectedRadio.getText();

                if(toggleGroupValue.equals(nowCorrectAnswer)){
                    System.out.println("Верный ответ");
                    correctAnswers++;
                }
                else {
                    System.out.println("Не Верный ответ");
                }
            }
            if (NowQuestion+1 != questions.length) {
                NowQuestion++;
                nowCorrectAnswer = questions[NowQuestion].correctAnswer();

                question_text.setText(questions[NowQuestion].getQuestion());
                String[] answers = questions[NowQuestion].getAnswers();

                List<String> stringList = Arrays.asList(answers);

                Collections.shuffle(stringList);

                radio_btn_1.setText(stringList.get(0));
                radio_btn_2.setText(stringList.get(1));
                radio_btn_3.setText(stringList.get(2));
                radio_btn_4.setText(stringList.get(3));

                selectedRadio.setSelected(false);
            }
            else {
                radio_btn_1.setVisible(false);
                radio_btn_2.setVisible(false);
                radio_btn_3.setVisible(false);
                radio_btn_4.setVisible(false);

                answer_conf_btn.setVisible(false);

                question_text.setText("Вы ответили корректно на " + correctAnswers + " из " + questions.length + " вопросов!");
            }
        });
    }
}
