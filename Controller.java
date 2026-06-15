import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ScrollPane scrollpane;

    @FXML
    private Button submit;

    @FXML
    private Label total;

    @FXML
    void On_submit(ActionEvent event) {

    }

    @FXML
    void on_scroll(MouseEvent event) {

    }
    VBox vbox = new VBox();

    HBox hbox1 = new HBox();
    HBox hbox2 = new HBox();
    HBox hbox3 = new HBox();

    Label label_item1 = new Label("Item 1");
    Label label_item1_price = new Label("$");
    ImageView imageview_item_1 = new ImageView(getClass().getResource("greenapple.png").toExternalForm());
    Spinner<Integer> spinner_item1 = new Spinner<>(0, 10, 0);

    @FXML
    void initialize() {
        //change size of imageview_item_1
        imageview_item_1.setFitWidth(60);
        imageview_item_1.setFitHeight(60);

        hbox1.getChildren().addAll(imageview_item_1, label_item1, label_item1_price, spinner_item1);
        vbox.getChildren().addAll(hbox1);
        vbox.getChildren().addAll(hbox2);
        vbox.getChildren().addAll(hbox3);
        scrollpane.setContent(vbox);
    }
}
