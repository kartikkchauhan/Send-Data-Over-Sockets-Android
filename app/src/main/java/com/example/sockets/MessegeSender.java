package com.example.sockets;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class MessegeSender extends AsyncTask<String,Void,Void> {
    Socket socket;
    DataOutputStream dataOutputStream;
    PrintWriter printWriter;
    


    @Override
    protected Void doInBackground(String... strings) {
        String message=strings[0];

        try {
            String fullMsg=message +"#"+ "custom";
            socket = new Socket("192.168.1.6",9876);
            printWriter= new PrintWriter(socket.getOutputStream());
            printWriter.write(fullMsg);
            printWriter.flush();
            printWriter.close();
            socket.close();

        } catch (IOException e) {

            Log.d("Errors", message + " " + e.toString());
            e.printStackTrace();
        }

        return null;
    }


}
