/**
 * 
 */

/**
 * @author manuelromero
 *
 */
public class autos {
	
	private String Codigo = "";
	private String Marca = "";
	private String Tipo = "";
	private String Modelo = "";
	private String Kilometraje = "";
	private String Precio = "";
	private String Apellido = "";
	private String Nombre = "";
	private String Documento = "";
	
	public autos (){
		
		
	}
	
	public autos (String Codigo,
			String Marca,
			String Tipo,
			String Modelo,
			String Kilometraje,
			String Precio,
			String Apellido, 
			String Nombre,
			String Documento){
		
		this.Codigo = Codigo;
		this.Marca = Marca;
		this.Tipo = Tipo;
		this.Modelo = Modelo;
		this.Kilometraje = Kilometraje;
		this.Precio = Precio;
		this.Apellido = Apellido;
		this.Nombre = Nombre;
		this.Documento = Documento;		
	}
	// Guardar datos
	
	public void setCodigo(String Codigo){
		this.Codigo = Codigo;
	}
	public void setMarca(String Marca){
		this.Marca = Marca;
	}
	public void setTipo(String Tipo){
		this.Tipo = Tipo;
	}
	public void setModelo(String Modelo){
		this.Modelo = Modelo;
	}
	public void setKilometraje(String Kilometraje){
		this.Kilometraje = Kilometraje;
	}
	public void setPrecio(String Precio){
		this.Precio = Precio;
	}
	public void setApellido(String Apellido){
		this.Apellido = Apellido;
	}
	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	public void setDocumento(String Documento){
		this.Documento = Documento;
	}
	
	
	
	//Obtener Datos
	
	public String getCodigo(){
		return this.Codigo;
	}
	public String getMarca(){
		return this.Marca;
	}
	public String getTipo(){
		return this.Tipo;
	}
	public String getModelo(){
		return this.Modelo;
	}
	public String getKilometraje(){
		return this.Kilometraje;
	}
	public String getPrecio(){
		return this.Precio;
	}
	public String getApellido(){
		return this.Apellido;
	}
	public String getNombre(){
		return this.Nombre;
	}
	public String getDocumento(){
		return this.Documento;
	}
	
	@Override
	public String toString(){
		return (this.Codigo+" "+
				this.Marca+" "+
				this.Tipo+" "+
				this.Modelo+" "+
				this.Kilometraje+" "+
				this.Precio+" "+
				this.Apellido+" "+
				this.Nombre+" "+
				this.Documento+" ");
	}
}
