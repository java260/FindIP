
package src;

import java.net.InetAddress;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class layoutFindIPController implements Initializable {
    
    @FXML
    private Label result;
    
    @FXML
    private TextField texturl ; 
   
    @FXML
    private void findIp(ActionEvent event) {
        
          
            if (!texturl.getText().isEmpty()){ 
                       try { 
                            String url = texturl.getText().toString().trim();
                            InetAddress address = InetAddress.getByName(url);
                            String ip = address.getHostAddress();
                            result.setText(ip); 
                           } 
                       catch (Exception e ) {
                           result.setText("Invalid URL or Network is Down");
                          }     
                   }
            
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please Enter URL");
                alert.show();
            }
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
