package ece416app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int serverPortNumber = 4276; 
		
		ServerSocket serverSoc = new ServerSocket(serverPortNumber);
		Socket clientSoc = serverSoc.accept();
		System.out.print("Client Accepted\n");
		
		BufferedReader clientInput = new BufferedReader(new InputStreamReader(clientSoc.getInputStream()));
		PrintWriter serverOutput = new PrintWriter(clientSoc.getOutputStream(), true);
		
		System.out.println("Waiting for client respose\n");
	    String input = clientInput.readLine();
	    while (true) {
	    	if (input != null) {
	    		System.out.println(input);
	    	}
	    	input = clientInput.readLine();
	    }
	    
		//serverSoc.close();
	}

	

}
