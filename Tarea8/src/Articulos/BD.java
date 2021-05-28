/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Daniel
 */
public class BD {
    
    private final String PATH = "Tarea8.yap";
    private final String ENCABEZADO = "CODIGO\tNOMBRE\tCANTIDAD\tDESCRIPCION" + System.lineSeparator();
    private final String SUBRAYADO = "=======\t=======\t=========\t============" + System.lineSeparator();
    private ObjectContainer bd;
    
    public String darAlta (Articulos a){
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), PATH);
        bd.store(a);
        bd.close();
        return "Artículo insertado";
    }
    
    public String buscar (int codigo){
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), PATH);
        String busqueda = "No existe este artículo";
        Articulos consulta = new Articulos(codigo, null, 0, null);
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(consulta);
        
	if (!resultadoConsulta.isEmpty()){
            Articulos articulo = resultadoConsulta.next();
            busqueda = ENCABEZADO + SUBRAYADO + articulo.getCodigo() + "\t" +
            articulo.getNombre() + "\t" +
            articulo.getCantidad() + "\t" +
            articulo.getDescripcion();
        }
        bd.close();
        return busqueda;
    }
    
    public String modificar (int codigo, String nombre, int cantidad, String descripcion){
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), PATH);
        String mensaje = "No existe este artículo";
        Articulos consulta = new Articulos(codigo, null, 0, null);
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(consulta);
        
	if (!resultadoConsulta.isEmpty()){
            Articulos articulo = resultadoConsulta.next();
            articulo.setCantidad(cantidad);
            articulo.setNombre(nombre);
            articulo.setDescripcion(descripcion);
            bd.store(articulo);
            mensaje = "Artículo modificado";
        }
        bd.close();
        return mensaje;
    }
    
    public String borrar (int codigo){
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), PATH);
        String mensaje = "No existe este artículo";
        Articulos consulta = new Articulos(codigo, null, 0, null);
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(consulta);
        
	if (!resultadoConsulta.isEmpty()){
            Articulos articulo = resultadoConsulta.next();
            bd.delete(articulo);
            mensaje = "Artículo borrado";
        }
        bd.close();
        return mensaje;
    }
    
    public String mostrar (){
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), PATH);
        String busqueda = "No existe ningún artículo";
        Articulos consulta = new Articulos(0, null, 0, null);
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(consulta);
        
	if (!resultadoConsulta.isEmpty()){
            String aux = "";
            while (resultadoConsulta.hasNext()) {
                Articulos articulo = resultadoConsulta.next();
                aux += articulo.getCodigo() + "\t" +
                articulo.getNombre() + "\t" +
                articulo.getCantidad() + "\t" +
                articulo.getDescripcion() + "\n";
            }
            busqueda = ENCABEZADO + SUBRAYADO + aux;
        }
        bd.close();
        return busqueda;
    }
    
}
