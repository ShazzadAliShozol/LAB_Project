package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DetailViewController {
  @FXML
  private Label fullNameLabel;

  @FXML
  private Label genderLabel;

  @FXML
  private Label dateOfBirthLabel;

  @FXML
  private Label electricityBillLabel;

  @FXML
  private Label waterBillLabel;

  @FXML
  private Label gasBillLabel;

  @FXML
  private Label totalAmountLabel;

  @FXML
  private Button closeButton;

  @FXML
  void handleCloseButton(ActionEvent event) { }
}
