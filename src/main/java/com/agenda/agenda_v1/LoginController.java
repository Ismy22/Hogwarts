/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.agenda.agenda_v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nuria
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView jlabelEntrarLogin;
    @FXML
    private Label jlabelRegistro;
    @FXML
    private Label jlabelSalir;
    @FXML
    private TextField labelUser;
    @FXML
    private PasswordField labelPass;
    @FXML
    private ImageView botonRegistro;
    @FXML
    private Pane panelGifCasa;
    @FXML
    private Pane panelLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Tooltip.install(jlabelEntrarLogin, new Tooltip("Pulsa para entrar"));
        panelLogin.setVisible(true);
    }

    @FXML
    private void login(MouseEvent event) throws IOException, InterruptedException {
        if (labelUser.getText().equals("admin") && labelPass.getText().equals("admin")) {
            
            
//            int tam3, tam4;
//            tam3 = 920;
//            tam4 = 688;
//            String gif = "panelGifCasa.fxml";
//            abrirCasa(event, gif, tam3, tam4);
//            
//            //event.wait(7);
//            //event.notifyAll();
//            TimeUnit.SECONDS.sleep(7);
            //esperar(7);

            int tam1, tam2;
            tam1 = 1040;
            tam2 = 690;
            String casa = "PanelPrincipalCasas.fxml";
            abrirCasa(event, casa, tam1, tam2);

        }

    }

    //=========================================================================================================
    // Registro
    @FXML
    private void registro(MouseEvent event) throws IOException {

        int tam1, tam2;
        tam1 = 913;
        tam2 = 511;
        String casa = "panelSeleccionCasa.fxml";
        abrirCasa(event, casa, tam1, tam2);

    }
    //=========================================================================================================

    public void abrirCasa(MouseEvent event, String casa, int tam1, int tam2) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource(casa));
            Scene scene = new Scene(root, tam1, tam2);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.centerOnScreen();
            appStage.show();

        } catch (Exception e) {
        }
    }

    @FXML
    private void cerrarTodo(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void abrirCasa(MouseEvent event) {
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
