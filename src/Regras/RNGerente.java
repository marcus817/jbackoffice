package Regras;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import model.Setor;

public class RNGerente {
	
	public boolean setorIsEmpty(Setor setor){
		if(setor.getGerente()!= null){
			//throw new RuntimeException("Setor J� Possui Gerente");
			
			return true;
		}
		return false;
	}
}
