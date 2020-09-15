package Objetos;

public class RegistroAcademico {
    private int año;
    private String correlativo;
    
    public RegistroAcademico(int año, String correlativo){
        this.año = año;
        this.correlativo = correlativo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
    
    public boolean cheequearCarnet(){
        String carnet = this.año+this.correlativo;
        boolean chequeoTamaño = carnet.length() == 9 && String.valueOf(this.año).length()==4;
        if(chequeoTamaño){
            try{
                int chequeoCorrelativo = Integer.parseInt(this.correlativo);
                if(año > 1900){
                    return true;
                }else{
                    throw new Exception("Año no valido.");
                }
            }catch(Exception e){
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    
    
}
