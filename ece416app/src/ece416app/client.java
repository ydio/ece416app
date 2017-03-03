package ece416app;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class client {
	
	static int serverPortNumber = 4276;

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket clientSocket = new Socket("127.0.0.1", serverPortNumber);
		PrintWriter clientOut = new PrintWriter(clientSocket.getOutputStream(), true);
		//BufferedReader severIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(System.in));
		String clientInput = stdInput.readLine();
		while(true){
			if (clientInput!= null) {
			clientOut.println(clientInput);
			}
			clientInput = stdInput.readLine();
		}
		//clientSocket.close();
    }

}
