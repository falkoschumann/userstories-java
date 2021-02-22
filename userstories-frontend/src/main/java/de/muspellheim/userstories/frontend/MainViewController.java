/*
 * User Stories - Frontend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.frontend;

import de.muspellheim.userstories.contract.messages.commands.CreateUserCommand;
import de.muspellheim.userstories.contract.messages.queries.UserQuery;
import de.muspellheim.userstories.contract.messages.queries.UserQueryResult;
import java.util.function.Consumer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

public class MainViewController {
  @Getter @Setter private Runnable onOpenInfo;
  @Getter @Setter private Consumer<CreateUserCommand> onCreateUserCommand;
  @Getter @Setter private Consumer<UserQuery> onUserQuery;

  @FXML private HBox commandBar;
  @FXML private Label greeting;

  public static MainViewController create(Stage stage) {
    var factory = new ViewControllerFactory(MainViewController.class);

    var scene = new Scene(factory.getView());
    stage.setScene(scene);
    stage.setTitle("User Stories");
    stage.setMinWidth(320);
    stage.setMinHeight(569);

    return factory.getController();
  }

  private Stage getWindow() {
    return (Stage) commandBar.getScene().getWindow();
  }

  public void run() {
    getWindow().show();
    onUserQuery.accept(new UserQuery());
  }

  public void display(UserQueryResult result) {
    greeting.setText("Hello " + result.getUser().getName());
  }

  @FXML
  private void initialize() {}

  @FXML
  private void handleOpenInfo() {
    onOpenInfo.run();
  }
}
