/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polancogonzalez_20251020;

/**
 *
 * @author Dell
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    //MÉTODO CONSTRUCTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    //SE CREARÁ EN MEMORIA UN OBJETO CON LOS ATRIBUTOS QUE ESTÁN
    //DENTRO DE ESTE CONSTRUCTOR.
    public Pila(int tamano){
    
        this.capacidad = tamano;//CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR EN LA PILA
        this.elementos = new int[this.capacidad]; //SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1; //EL VALOR POR DEFECTO DE LA CIMA ES -1 (VACÍA)
        
    }
    
    //MÉTODO PARA VERIFICAR SI LA PILA ESTÁ VACÍA, ES DECIR, SI NO HAY ELEMENTOS
    //O VALORES APILADOS
    public boolean estaVacia(){
    
        if(this.cima == -1){
            //EL VALOR DE LA CIMA ES -1 POR LO TANTO, LA PILA ESTÁ VACÍA
            return true;
        }else{
            //EL VALOR DE LA CIMA ES UN NÚMERO DIFERENTE DE -1 POR LO TANTO
            //LA PILA SÍ TIENE AL MENOS UN VALOR O UN ELEMENTO.
            return false;
        }
        
    }
    
    //METODO PARA VERIFICAR SI LA PILA ESTÁ LLENA, DE ESTA MANERA TOMAR LA DESICIÓN
    //DE NO SEGUIR ALIMENTANDO LA PILA
    public boolean estaLlena(){
        
        if(this.cima == (this.capacidad - 1) ){
            //EL VALOR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
        }else{
            //EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
            return false;
        }
            
    }
    
    
    //DEVUELVE EL VALOR DE LA CIMA, ES DECIR EL VALOR EL ULTIMO ELEMENTO
    //QUE FUE INSERTADO AL ARREGLO
    public int tamano(){
        return this.cima + 1;
    }
    
    
    //MÉTODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR A LA PILA
    //PRIMEROS SE DEBE REALIZAR LA VERIFICACIÓN DEL TAMAÑO DE LA PILA
    //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    public void push(int elemento){
    
        //PRIMERO SE VERIFICA SI LA PILA ESTÁ LLENA
        if(estaLlena()){
            System.out.println("La pila está llena, no puede agregar el valor: "+elemento);
            //return;
        }else{
            this.cima++; //SE INCREMENTA EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento; //SE AGREGA EL NUEVO ELEMENTO AL ARREGLO (A LA PILA)
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
        }
    
    }
    
    
    //MÉTODO PARA EXTRAER UN ELEMENTO DE LA PILA(EL ÚLTIMO QUE HA SIDO INSERTADO AL ARREGLO)
    public int pop(){
        
        //SE VERIFICA QUE, LA PILA NO ESTÉ VACÍA PARA PODER EXTRAER UN ELEMENTO.
        if(estaVacia()){
            //SÍ ESTÁ VACÍA, POR LO TANTO, SE NOTIFICA AL USUARIO
            System.out.println("La pila está vacía, no puede hacer la extracción del elemento");
            //NO SE REALIZA NINGUNA ACCIÓN
            return -1;
        }else{
            //SÍ HAY ELEMENTOS QUE EXTRAER, POR LO TANTO, SE CREA UNA NUEVA VARIABLE}
            //QUE ALMACENARÁ EL VALOR QUE SERÁ EXTRAÍDO
            int elementoExtraido = this.elementos[this.cima]; //LA NUEVA VARIABLE POSEE EL VALOR DEL ÚLTIMO ELEMENTO INSERTADO AL ARREGLO
            this.cima--; //SE REDUCE EL VALOR DE LA CIMA DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO.
            return elementoExtraido; //SE DEVUELVE AL USUARIO EL VALOR QUE FUE EXTRAÍDO
        }
        
    }
    
    
    //MÉTODO PARA VERIFICAR EL ÚLTIMO VALOR INSERTADO, ES DECIR, VER EL VALOR QUE SE PUEDE
    //EXTRAER DE LA PILA
    public int peek(){
        
        //SE VERIFICA SI ESTÁ VACÍA
        if(estaVacia()){
            //SÍ ESTÁ VACÍA, POR LO TANTO, SE MUESTRA MENSAJE AL USUARIO
            System.out.println("La pila está vacía");
            //NO SE REALIZA NINGUNA ACCIÓN
            return -1;
        }else{
            //SE DEVUELVE AL USUARIO EL ÚLTIMO ELEMENTO QUE FUE INSERTADO
            //Y QUE ES EL PRÓXIMO ELEMENTO A SER EXTRAÍDO.
            return this.elementos[this.cima];
        }
    }
    
    
    //MÉTODO PARA IMPRIMIR LOS VALORES QUE POSEE UNA PILA, ES DECIR,
    //IMPRIMIR TODOS LOS VALORES DEL ARREGLO, DESDE EL ÚLTIMO QUE FUE
    //AGREGADO, HASTA EL PRIMERO (EN ESE ORDEN)
    public void mostrar(){
        
        //SE VERIFICA QUE LA PILA NO ESTÉ VACÍA
        if(estaVacia()){
            //SÍ ESTÁ VACÍA, POR LO TANTO NO SE REALIZA NADA
            System.out.println("La pila está vacía");
        }else{
            //SE IMPRIME LA SALIDA AL USUARIO
            System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila)");
            //SE INICIA UNA ESTRUCTURA CON CORCHETE "["
            System.out.print("[");
            //SE DEBE RECORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            //EN LA ESTRUCTURA ITERATIVA DE INICIA DESDE EL VALOR DE LA CIMA, ES DECIR
            //DESDE LA ÚLTIMA POSICIÓN AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA
            //MAYOR QUE CERO (ES DECIR QUE AUN NO HA LLEGADO A LA BASE DE LA PILA), EL VALOR
            //DE "i" ESTARÁ EN DECREMENTO HASTA LLEGAR A CERO
            for(int i = this.cima; i >= 0; i--){
                //SE IMPRIME CADA VALOR EN SU POSICIÓN CORRESPONDIENTE DE MANERA CONTÍNUA (SIN SALTOS DE LÍNEA)
                System.out.print(this.elementos[i]);
                //SE VERIFICA SI EL VALOR DE "i" ES MAYOR QUE CERO PARA PODER IMPRIMIR UN CARACTER
                if(i > 0){
                    //"i" NO HA LLEGADO A CERO, POR LO TANTO, SE PUEDE IMPRIMIR UNA COMA
                    System.out.print(",");//SE IMPRIME UNA COMA
                }
            }
            //SE CIERRA LA ESTRUCTURA DE CORCHETE PARA LA SALIDA DEL USUARIO FINAL
            System.out.print("]");
        }
    
    }
    
    
}