/*
 * Hello World - Application
 * Copyright (c) 2020 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.helloworld;

import de.muspellheim.helloworld.backend.MessageHandler;
import de.muspellheim.helloworld.backend.adapters.MemoryUserRepository;
import de.muspellheim.helloworld.contract.data.User;
import de.muspellheim.helloworld.frontend.UserInterface;
import java.io.InputStream;
import java.util.Properties;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    var userRepository = new MemoryUserRepository();
    userRepository.setCurrentUser(new User("Alice"));
    var backend = new MessageHandler(userRepository);

    var appIcon = getClass().getResource("/app.png");
    var appProperties = new Properties();
    try (InputStream in = getClass().getResourceAsStream("/app.properties")) {
      appProperties.load(in);
    }
    var frontend = new UserInterface(backend, primaryStage, appIcon, appProperties);

    frontend.run();
  }
}
