package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.Item;

public class TelaListarItensController {
	private Main main;

	
	@FXML private Button btVoltar;
	@FXML private ListView listView;
	@FXML private TextArea taListarItens;
	
	public void initialize(){
		
	//	this.listView.setText;
	//	this.taListarItens.setText();

		
		this.main = Main.getInstancia();
		this.btVoltar.setOnAction(e ->{
			this.retornar();
		});
	}
	
	public void retornar(){
			Stage stage;
			Parent root;
		try {
			root = (Parent) FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
			Scene scene = new Scene(root);
			stage = main.getPalcoPrincipal();
			stage.setScene(scene);
			main.changeStage(stage);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
