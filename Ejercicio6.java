/*Observe atentamente el siguiente algoritmo:

Algo Trampa  
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0 
         escribir("Respuesta incorrecta")  
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &  
" intento(s)")  
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ") 
   FMq  
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces  
         escribir("Bravo")  
   Si no  
         escribir("Revise sus conocimientos en geografía")  
   FSi  
Fin 
¿Qué hace? */

/* Es un programa el cual te da 5 intentos de poder acertar la capital de Fracia , si se acierta te dice "bravo" y i fallas "Revise sus conocimientos en geografía"  */