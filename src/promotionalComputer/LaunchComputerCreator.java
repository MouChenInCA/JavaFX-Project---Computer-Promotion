/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promotionalComputer;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mou Chen
 */
public class LaunchComputerCreator extends Application{
    
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ComputerCreator.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Computer Promotion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
