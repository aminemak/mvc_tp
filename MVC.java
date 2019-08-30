import javafx.application.Application;
import javafx.stage.Stage;
public class MVC extends Application {
    public static void main(String[] args) {
        launch(args); }
    @Override
    public void start(Stage primaryStage)
    {
        View view = new View(primaryStage) ;
        Model model = new Model(0);
//un controleur pour une vue et un model
        Controller controller=new Controller(model,view);
        controller.control();
    }}