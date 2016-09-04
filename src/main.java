import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit=false;
		
		Concesionario concesionario = new Concesionario();
		do{
			try{
				int taks = mainMenu();
				switch(taks){
				case 0:exit=true; break;
				case 1:	concesionario.addAutos(); break;
				case 2:	concesionario.getAutos(); break;
				default: break;
				}
				System.out.println();
			}
			catch(IOException ex){
				Logger.getLogger(Concesionario.class.getName()).log(Level.SEVERE,null, ex);
			}
			
		}while (!exit);
	}
	private static int mainMenu() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("opciones: \n"
				+ "1. introducir nuevo Auto \n"
				+ "2. ver autos \n"
				+ "0. Salir \n");
		System.out.println("introducir nuemero de opcion deseada:");
		return Integer.parseInt(input.readLine());
	}
}
