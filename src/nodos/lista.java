package nodos;

public class lista<T>{
    
    private Nodo<T> p;
    
    public lista(){
        this.p = null;
    }

    public Nodo<T> getInicio() {
        return p;
    }

    public void setInicio(Nodo<T> inicio) {
        this.p = inicio;
    }
    
    
    public void mostrarLista(){
        Nodo<T> q = p;
        while(q != null){
            System.out.println(q.getInfo());
            q = q.getLiga();
            //
        }
    }
    
    
    public void insertaInicio(T obj){
        Nodo<T> t = new Nodo<>(obj);
        t.setLiga(p);
        p = t;
    }
    
    
    public void insertaFinal(T obj){
        Nodo<T> q = p;
        Nodo<T> t = new Nodo<>(obj);
        if (p == null){
            p = t;
        }else{
            while(q.getLiga() != null){
                q = q.getLiga();
            }
        q.setLiga(t);
        }
    }
    
    
    public lista invertirLista(){
        lista<T> nueva = new lista<>();
        Nodo<T> q = p;
        if (p != null){
            while (q != null){  
                nueva.insertaInicio(q.getInfo());
                q = q.getLiga();
            }
        }
        return nueva;
    }
    
    
    public void insertaAntesDeX(T obj, T dato){
        boolean ban = false;
        Nodo<T> t = new Nodo<>(dato);
        Nodo<T> s = new Nodo<>();
        Nodo<T> q = p;
        while ((!q.getInfo().equals(obj))&&(!ban)){
            if (q.getLiga()!=null){
                s = q;
                q = q.getLiga();
            }else{
                ban = true;
            }
        }      
        if (!ban){
            if (p == q){
                t.setLiga(p);
                p = t;
            }else{
                s.setLiga(t);
                t.setLiga(q);
            }
        }else{
            System.out.println("No lo encontro");
        }
    }
    
    
    public void insertaDespuesDeX(T obj, T dato ){
        boolean ban = false;
        Nodo<T> t = new Nodo<>(dato);
        Nodo<T> s;
        Nodo<T> q = p;
        while ((q != null) && (!ban)){
            if (q.getInfo().equals(obj)){
                ban = true;
            }else{
                q = q.getLiga();
            }
        }            
        if (ban){
            if (q.getLiga() != null){
                s = q.getLiga();
                q.setLiga(t);
                t.setLiga(s);
            }else{
                q.setLiga(t);
                t.setLiga(null);
            }
        }        
    }
    
    
    public void borrarNodo(T dato){
        Nodo<T> q = p;
        Nodo<T> s = q;
        Boolean ban = false;
        while(q != null && !ban){
            s = q.getLiga();
            if (s.getInfo().equals(dato) && q.getInfo().equals(dato)){
                ban = true;
            }else{
                q = q.getLiga();
            }
        }
        if (ban){
            if (q == p){
                s = q.getLiga();
                p.setLiga(s); 
            }else{               
                s = s.getLiga();
                q.setLiga(s);
            }
        }
    }
    
    
    public void editarNodo(T obj, T dato){
        Nodo<T> q = p;
        Nodo<T> s = new Nodo<>();
        boolean ban = false;
        while(q != null && !ban){
            s = q.getLiga();
            if (s.getInfo().equals(obj)){
                ban = true;
            }else{
                q = q.getLiga();
            }
        }
        if (ban){
            s.setInfo(dato);
        }
    }
    
    public void dividir(Integer num){
        int cont = 0;
        Nodo<T> q = p;
        while(q != null){
            q = q.getLiga();
            cont++;
        }
        q = p;
        int primeraParte = cont - cont/2;
        cont = 0;
        if (num == 1){
            while (cont != primeraParte){
                System.out.println(q.getInfo());
                q = q.getLiga();
                cont++;
            }
        }else{
            while(cont != primeraParte){
                q = q.getLiga();
                cont++;
            }
            while(q != null){
                System.out.println(q.getInfo());
                q = q.getLiga();
            }
        }
    }
    
    
    public void eliminarDuplicados(){
        Nodo<T> q = p;
        Nodo<T> r = q;
        Nodo<T> s = q;
        boolean ban;
        while (q != null && s != null){
            ban = false;
            s = q.getLiga();
            while (s.getInfo() != q.getInfo() && !ban){
                if (s.getLiga() != null){
                    r = s;
                    s = s.getLiga();
                }else{
                    ban = true;
                }
            }
            if (!ban){
                if (s.getLiga() != null){
                    r.setLiga(s.getLiga());
                }else{
                    r.setLiga(null);
                }
            }
            q = q.getLiga();
        }
    }
    
    public void ordenar(){
        Nodo<T> q = p;
        
    }
    
    public void dividirAlternado(Integer num){
        Nodo<T> q = p;
    }
    
    
    public void borrarLista(){
        p = null;
    }
}
