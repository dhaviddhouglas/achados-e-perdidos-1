package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class TelaCadastroController {
	private Main main;
	@FXML private Button btItemAchado;
	@FXML private Button btItemPerdido;
	
	
	public void initialize(){
		this.main = Main.getInstancia();	
			this.btItemAchado.setOnAction(e2 -> {
				main = Main.getInstancia();
				 Stage stage;
				 Parent root;	
				 try{
					 
					 stage=(Stage) btItemAchado.getScene().getWindow();
					 root = (Parent) FXMLLoader.load(getClass().getResource("/view/TelaCadastroItemAchado.fxml"));
					 Scene scene = new Scene(root);
					 stage = main.getPalcoPrincipal();
					 stage.setScene(scene);
					 main.changeStage(stage);
				 }catch(IOException e3){
					 e3.printStackTrace(); 
				 }
				
			});
			this.btItemPerdido.setOnAction(e -> {
				main = Main.getInstancia();
				Stage stage;
				Parent root;
				try {
					
					stage=(Stage) btItemPerdido.getScene().getWindow();
					root = (Parent) FXMLLoader.load(getClass().getResource("/view/TelaCadastroItemPerdido.fxml"));
					Scene scene = new Scene(root);
					stage = main.getPalcoPrincipal();
					stage.setScene(scene);
					main.changeStage(stage);
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			});
			
			
	}

}
