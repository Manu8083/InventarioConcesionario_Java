/**
 * 
 */

/**
 * @author manuelromero
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Concesionario {

	private ArrayList<autos> listautos; //definicion arreglo
	
	public Concesionario(){
		this.listautos = new ArrayList<autos>(); //se crea la instancia
	} 
	
public void addAutos() throws IOException{
	// TODO Auto-generated method stub
	
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	autos newautos = new autos();
	
		System.out.println("Codigo: ");//imprimir en consola
		newautos.setCodigo(input.readLine()); //se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Marca: ");//imprimir en consola
		newautos.setMarca(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Tipo: ");//imprimir en consola
		newautos.setTipo(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Modelo: ");//imprimir en consola
		newautos.setModelo(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Kilometraje: ");//imprimir en consola
		newautos.setKilometraje(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Precio: ");//imprimir en consola
		newautos.setPrecio(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Apellido: ");//imprimir en consola
		newautos.setApellido(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Nombre: ");//imprimir en consola
		newautos.setNombre(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		System.out.println("Documento: "); //imprimir en consola
		newautos.setDocumento(input.readLine());//se hace el llamado a la funcion Set para recoger los datos y guardar
		
		listautos.add(newautos); //se agrega el formulario con los campos diligenciados
}

	public void getAutos(){
		for (autos autos: listautos){
		System.out.println(autos); // se obtiene el arreglo con los datos y se pinta en la consola	
		}
	}
}
