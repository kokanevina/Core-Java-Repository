
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	DataOutputStream outputStream;
	InetAddress serveraddress;
	
	public TcpClient() throws UnknownHostException {
		System.out.println("Connection Establishment");
		serveraddress=InetAddress.getByName("DESKTOP-RBMTGN6");
		System.out.println(serveraddress);
		System.out.println("Client Establishing Connection with Server");
		try(Socket clientSocket=new Socket(serveraddress,2020)){
			outputStream =new DataOutputStream(clientSocket.getOutputStream());
			chat();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection gets autoclosed");
		

	}// constructor
	
	public void chat() throws IOException{
		String clientMessage="Hello How are you?";
		outputStream.writeUTF(clientMessage);
	}
	
	public static void main(String[] args) {
		try {
			TcpClient client=new TcpClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
