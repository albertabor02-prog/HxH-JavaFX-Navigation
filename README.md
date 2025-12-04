HxH JavaFX Navigation
A simple JavaFX project that demonstrates switching between multiple pages using controllers, FXML files, and a reusable scene-navigation system.

Project Structure
src
└─ main
   ├─ java
   │   └─ com.example.hxhfx
   │       ├─ controller
   │       │   ├─ ConjurerController.java
   │       │   ├─ EmitterController.java
   │       │   ├─ EnhancerController.java
   │       │   ├─ homeController.java
   │       │   ├─ ManipulatorController.java
   │       │   ├─ SpecialistController.java
   │       │   └─ TransmuterController.java
   │       │
   │       ├─ helper
   │       │   ├─ SceneChanger.java
   │       │   └─ SceneManager.java
   │       │
   │       ├─ Launcher.java
   │       ├─ MainApplication.java
   │       └─ module-info.java
   │
   └─ resources
       └─ com.example.view
           ├─ image/
           │   ├─ Conjurer.png
           │   ├─ Emitter.png
           │   ├─ Enhancer.png
           │   ├─ home.png
           │   ├─ Manipulator.png
           │   ├─ Specialist.png
           │   └─ Transmuter.png
           │
           ├─ Conjurer.fxml
           ├─ Emitter.fxml
           ├─ Enhancer.fxml
           ├─ home-view.fxml
           ├─ manipulator.fxml
           ├─ Specialist.fxml
           └─ Transmuter.fxml
