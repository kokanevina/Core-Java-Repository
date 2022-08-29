
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
		Socket socket;	
		DataInputStream inputStream;
		public TcpServer() {
			System.out.println("Connection Establishment with Client");		
			try(ServerSocket ss=new ServerSocket(2020);    ){
				System.out.println("Server is waiting for client request...... ");
				socket=ss.accept();
				System.out.println("Connection Established...........");
				inputStream=new DataInputStream(socket.getInputStream());
				chat();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void chat() throws IOException{
			String messagefromClient=inputStream.readUTF();
			System.out.println(messagefromClient);
		}
		public static void main(String[] args) {
			TcpServer server=new TcpServer();
			
		}
}
