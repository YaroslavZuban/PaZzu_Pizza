package com.example.pazzu_pizza;

import com.example.pazzu_pizza.animations.Movement;
import com.example.pazzu_pizza.animations.Shake;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {
    @FXML
    private DatePicker data;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private TextField surname;

    @FXML
    private TextField telephone;

    @FXML
    private AnchorPane windowAuthorization;

    @FXML
    void authorizationActon(ActionEvent event) throws IOException, CloneNotSupportedException, InterruptedException {
        if (name.getText().equals("")) {
            Movement.fieldMovement("имя", name,windowAuthorization);
        } else if (surname.getText().equals("")) {
            Movement.fieldMovement("фамилию", surname,windowAuthorization);
        } else if (email.getText().equals("")) {
            Movement.fieldMovement("email", email,windowAuthorization);
        } else if (password.getText().equals("")) {
            Movement.fieldMovement("пароль", password,windowAuthorization);
        } else if (telephone.getText().equals("")) {
            Movement.fieldMovement("телефон", telephone,windowAuthorization);
        } else if (String.valueOf(data.getValue()).equals("")) {
            Movement.fieldMovement("дату", data,windowAuthorization);
        } else {
            signUpNewUser();

            Stage stage = (Stage) windowAuthorization.getScene().getWindow();
            stage.close();
        }
    }

    private void signUpNewUser() {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        String name_new = name.getText();
        String surname_new = surname.getText();
        String email_new = email.getText();
        String password_new = password.getText();
        String telephone_new = telephone.getText();
        String births = String.valueOf(data.getValue());

        User user = new User(name_new, surname_new, email_new, password_new, telephone_new, births);

        databaseHandler.singUpUser(user);

    }

}
