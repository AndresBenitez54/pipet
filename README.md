# Ejercicio 1

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un coordinador de ventas de una tienda  de computadores, que desea calcular el promedio de ingresos que han tenido en el último periodo. Como información básica de cada cliente se debe registrar el número de identificación, su nombre y la reparación que se le ha realizado. Aclaraciones: 
• Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo especifico. 
• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos. 
• No se realiza validación, ni se verifica calidad en los datos ingresados


# HU Programa

![HUP](https://github.com/AndresBenitez54/pipet/assets/133779157/37ed75cc-3bca-4d28-bbcf-2301e5be5aeb)

# Diagrama caso de uso

![CUP](https://github.com/AndresBenitez54/pipet/assets/133779157/959747d0-ca32-4161-830c-b1198163fb62)

# Diagrama de Flujo

![DFDP](https://github.com/AndresBenitez54/pipet/assets/133779157/d7734082-bd14-4e26-b313-6d10a5eb3334)




# Pseudocodigo

Algoritmo CalcularPromedioDeVentas
	Tamaño <- 50
	Dimension identificaciones[Tamaño]
	Dimension nombres[Tamaño]
	Dimension Computadores[Tamaño] 
	Dimension costos[Tamaño]
	Escribir '---------------------------------------'
	Escribir 'Digite el número de clientes:'
	Leer numeroClientes
	Para i<-0 Hasta numeroClientes-1 Hacer
		Escribir '-----------------------------------'
		Escribir 'Bienvenido a la mejor tienda de computadores!!'
		Escribir 'Digite la identificación del cliente:'
		Leer identificacion
		Escribir '-----------------------------------'
		Escribir 'Ingrese el nombre del cliente:'
		Leer nombre
		Escribir '-----------------------------------'
		Escribir 'Digite el computador que compro el cliente:'
		Leer Computador
		Escribir '-----------------------------------'
		Escribir 'Digite el costo del computador:'
		Leer costo
		identificaciones[i] <- identificacion
		nombres[i] <- nombre
		Computadores[i] <- Computador 
		costos[i] <- costo
	FinPara
	Para i<-0 Hasta numeroClientes-1 Hacer
		promedio <- promedio+(costos[i]/numeroClientes)
	FinPara
	Escribir '--------------------------------------'
	Escribir 'Los clientes son :'
	Para i<-0 Hasta numeroClientes-1 Hacer
		Escribir '----------------------------------'
		Escribir 'C.C: ',identificaciones[i]
		Escribir 'Nombre: ',nombres[i] 
		Escribir 'Computador: ',Computadores[i]
		Escribir 'Costo: ',costos[i],'$'
	FinPara
	Escribir '-------------------------------------'
	Escribir 'El promedio de ingresos es de: ',promedio,'$'
FinAlgoritmo
