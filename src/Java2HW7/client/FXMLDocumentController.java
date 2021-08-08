package Java2HW7.client;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.*;
import java.io.*;

public class FXMLDocumentController implements Initializable {

    private Socket socket;

    private DataInputStream  in;
    private DataOutputStream out;

    @FXML
    private Button sendButton;

    @FXML
    private javafx.scene.control.TextArea TextArea;

    @FXML
    private javafx.scene.control.TextField TextField;

    @FXML
    private void sendMsg(ActionEvent event) {
        String str = TextField.getText();
        try
        {
            out.writeUTF(str);
            TextField.clear();
            TextField.requestFocus();
        }
        catch (IOException ex)
        {
            ex.getStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try
        {

            socket = new Socket("localhost", 12345);
            in  = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {

                    while(true)
                    {
                        String str = in.readUTF();
                        TextArea.appendText(str + "\n");
                    }
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }).start();

        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
