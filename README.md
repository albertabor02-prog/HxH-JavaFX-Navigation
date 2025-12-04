HxH JavaFX Navigation

A simple JavaFX project demonstrating clean scene navigation using multiple FXML pages, controllers, and a reusable navigation helper.

Features
- Easy and reusable scene switching  
- Separate FXML + Controller for each page  
- Uses `SceneChanger` and `SceneManager`  
- Clean, organized folder structure  

Project Structure

src/main/java/com.example.hxhfx  
- controller  
  - ConjurerController.java  
  - EmitterController.java  
  - EnhancerController.java  
  - homeController.java  
  - ManipulatorController.java  
  - SpecialistController.java  
  - TransmuterController.java  

- helper  
  - SceneChanger.java  
  - SceneManager.java  

- Launcher.java  
- MainApplication.java  
- module-info.java  


src/main/resources/com.example.view  
- image  
  - Conjurer.png  
  - Emitter.png  
  - Enhancer.png  
  - home.png  
  - Manipulator.png  
  - Specialist.png  
  - Transmuter.png  

- Conjurer.fxml  
- Emitter.fxml  
- Enhancer.fxml  
- home-view.fxml  
- manipulator.fxml  
- Specialist.fxml  
- Transmuter.fxml  
