
package com.proyecto.eventos.actions;

import com.proyecto.eventos.dto.ListaEventosDTO;
import com.proyecto.eventos.entity.Evento;
import com.proyecto.eventos.entity.Localidad;
import com.proyecto.eventos.entity.LocalidadEvento;
import com.proyecto.eventos.repository.EventoRepository;
import com.proyecto.eventos.repository.LocalidadEventoRepository;
import com.proyecto.eventos.repository.LocalidadRepository;
import com.proyecto.eventos.response.ListaEventosResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author crist
 */
public class ListarEventos {
    private List<Localidad> localidades;
    private List<ListaEventosDTO> listaEventos = new ArrayList<ListaEventosDTO>();;
    private List<LocalidadEvento> asignacion;
    private List<Evento> eventos;
    public ListarEventos(List<Localidad> localidades,List<LocalidadEvento> asignacion, List<Evento> eventos ) {
        this.localidades = localidades;
        this.asignacion = asignacion;
        this.eventos = eventos;
    }
    public ListaEventosResponse listar(){
        
        for (int i = 0; i < eventos.size(); i++) {
            List<String> localidadesAsignadas = new ArrayList<String>();
           
            System.out.println(eventos.get(i).getNombre());
            for (int j = 0; j < asignacion.size(); j++) {
                if (asignacion.get(j).getIdEvento().equals(eventos.get(i).getId()))
                {
                
                    localidadesAsignadas.add("nombre: " + localidades.get(asignacion.get(j).getIdLocalidad() - 1).getNombre());
                }
            }
            ListaEventosDTO elementoEvento = new ListaEventosDTO(eventos.get(i).getNombre(), eventos.get(i).getLugar(), eventos.get(i).getFecha(), localidadesAsignadas );
            listaEventos.add(elementoEvento);
        }
        ListaEventosResponse response = new ListaEventosResponse("ok", listaEventos);
        return response;
        
    }
    
    
    
}
