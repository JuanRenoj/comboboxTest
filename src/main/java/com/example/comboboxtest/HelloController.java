package com.example.comboboxtest;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox listaEmpleado;
    @FXML
    private TextField codigo;
    @FXML
    private TextField nombre;

    @FXML
    private TextField apellido;
    @FXML
    private TextField direccion;
    @FXML
    private Button btnGuardar;
    @FXML
    private TextField codigoEmpleado;
    @FXML
    private Button btnAsignar;
    @FXML
    private Label welcomeText;
    @FXML
    private ArrayList<Person> personList=new ArrayList<>();
    @FXML
    private ObservableList<Person> observableListPerson= FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnGuardar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Person person=new Person(
                        Integer.parseInt( codigo.getText()),
                        nombre.getText(),
                        apellido.getText(),
                        direccion.getText()
                );
                personList.add(person);

                listaEmpleado.setItems(FXCollections.observableList(personList));
            }
        });
        btnAsignar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Person person= Person.getPerson(personList, Integer.parseInt(codigoEmpleado.getText()));
                System.out.println(person);
                listaEmpleado.getSelectionModel().select(person);
            }
        });
        listaEmpleado.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Person d=(Person)listaEmpleado.getSelectionModel().getSelectedItem();
                System.out.println(d.getCodigo());
            }
        });
    }


}