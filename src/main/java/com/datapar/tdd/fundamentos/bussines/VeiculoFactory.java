package com.datapar.tdd.fundamentos.bussines;

 
import com.datapar.tdd.fundamentos.exceptions.ExceptionVeiculoFactory;
import com.datapar.tdd.fundamentos.model.Carga;
import com.datapar.tdd.fundamentos.model.Motor;
import com.datapar.tdd.fundamentos.model.Passeio;

public class VeiculoFactory {

	public <S> VeiculoTipo getVeiculo( Class<S> clazz) throws ExceptionVeiculoFactory{
		
		if (  (clazz!=null) && clazz.equals( Passeio.class )){
			
			Passeio veiculo = new Passeio("PLACA", "FORD", "FIESTA", 200, new Motor(4, 200), 5);
			return veiculo;
		}
		else if ( (clazz!=null) && clazz.equals( Carga.class ) ){
			Carga veiculo = new Carga("PLACA", "FORD", "FIESTA", 200, new Motor(4, 200), 5,1000);
			return veiculo;
		}
		else
		{
			throw new ExceptionVeiculoFactory("Tipo Inválido");
		}
		
	 
	}
	
}
