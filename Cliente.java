package proyecto.src.clase1;

public class Cliente {
    
    public String nombre;
    public String apepat;
    public String apemat;
    public int dni; 

    Cliente(String nom,String pat,String mat,int Dni)
    {
        setNombre(nom);
        setApepat(pat);
        setApemat(mat);
        setDni(Dni);
    }

    void setNombre(String nom){
        nombre = nom;
    }

    String getNombre(){
        return nombre;
    } 

    void setApepat(String pat){
        apepat = pat;
    }

    String getApepat(){

        return apepat;
    }

    void setApemat(String mat){
        apemat = mat;
    }

    String getApemat(){

        return apemat;
    }

    void setDni(int Dni){
        dni = Dni;
    }

    int getDni(){

        return dni;
    }



}
