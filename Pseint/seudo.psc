Proceso chairStore
	Definir NUM_ARTICLES,quantity,option,quantitiesA,quantitiesE,quantitiesI,i Como Entero
	NUM_ARTICLES <- 3
	Definir name,lastName,address,phone,company,nit,articlesA,articlesE,articlesI Como Caracter
	Definir isCompany Como Logico
	Definir article,price,pricesA,pricesE,pricesI,total,discount Como Real
	Dimension articlesA[NUM_ARTICLES]
	Dimension articlesE[NUM_ARTICLES]
	Dimension articlesI[NUM_ARTICLES]
	Dimension pricesA[NUM_ARTICLES]
	Dimension pricesE[NUM_ARTICLES]
	Dimension pricesI[NUM_ARTICLES]
	Dimension quantitiesA[NUM_ARTICLES]
	Dimension quantitiesE[NUM_ARTICLES]
	Dimension quantitiesI[NUM_ARTICLES]
	articlesA[0] <- 'Silla interlocutora      '
	articlesA[1] <- 'Silla plastica auditorio '
	articlesA[2] <- 'Silla para teatro        '
	articlesE[0] <- 'Silla ergonomica portable'
	articlesE[1] <- 'Silla para oficina		 '
	articlesE[2] <- 'Silla para el hogar		 '
	articlesI[0] <- 'Silla para invierno      '
	articlesI[1] <- 'Silla de espera			 '
	articlesI[2] <- 'Silla para calor		 '
	pricesA[0] <- 80000
	pricesA[1] <- 140000
	pricesA[2] <- 230000
	pricesE[0] <- 100000
	pricesE[1] <- 170000
	pricesE[2] <- 280000
	pricesI[0] <- 160000
	pricesI[1] <- 150000
	pricesI[2] <- 190000
	quantitiesA[0] <- 0
	quantitiesA[1] <- 0
	quantitiesA[2] <- 0
	quantitiesE[0] <- 0
	quantitiesE[1] <- 0
	quantitiesE[2] <- 0
	quantitiesI[0] <- 0
	quantitiesI[1] <- 0
	quantitiesI[2] <- 0
	quantity <- 0
	discount <- 0
	total <- 0
	isCompany <- Falso
	Escribir 'Digite el nombre del Cliente'
	Leer name
	Escribir 'Digite el apellido del Cliente'
	Leer lastName
	Escribir 'Digite la dirección'
	Leer address
	Escribir 'Digite el numero de telefono'
	Leer phone
	Escribir 'Es empresarial. 1.Si / 0.No'
	Leer isCompany
	Si isCompany Entonces
		Escribir 'Digite el nombre la empresa'
		Leer company
		Escribir 'Digite el numero de NIT'
		Leer nit
	FinSi
	Repetir
		Escribir 'Seleccione el tipo de silla'
		Escribir '1. de Auditorio / 2. Ergonómicas / 3. Invitados'
		Leer option
		Mientras (option<1 Y option>3) Hacer
			Leer option
		FinMientras
		Segun option  Hacer
			1:
				Para i<-0 Hasta NUM_ARTICLES-1 Hacer
					Escribir i+1,'. ',articlesA[i],' Precio: ',pricesA[i]
				FinPara
				Escribir 'Digite el indice del producto que desea adquirir: '
				Leer option
				Escribir articlesA[option-1]
				Escribir 'Digite la cantidad'
				Leer quantitiesA[option-1]
				quantity <- quantity+quantitiesA[option-1]
			2:
				Escribir ''
				Para i<-0 Hasta NUM_ARTICLES-1 Hacer
					Escribir i+1,'. ',articlesE[i],' Precio: ',pricesE[i]
				FinPara
				Escribir 'Digite el indice del producto que desea adquirir: '
				Leer option
				Escribir articlesE[option-1]
				Escribir 'Digite la cantidad'
				Leer quantitiesE[option-1]
				quantity <- quantity+quantitiesE[option-1]
			3:
				Para i<-0 Hasta NUM_ARTICLES-1 Hacer
					Escribir i+1,'. ',articlesI[i],' Precio: ',pricesI[i]
				FinPara
				Escribir 'Digite el indice del producto que desea adquirir: '
				Leer option
				Escribir articlesI[option-1]
				Escribir 'Digite la cantidad'
				Leer quantitiesI[option-1]
				quantity <- quantity+quantitiesI[option-1]
			De Otro Modo:
				Escribir "Opción no válida"
		FinSegun
		Escribir '¿Continuar comprando?'
		Escribir '1. Si, seguir comprando / 2. No, finalizar compra'
		Repetir
			Leer option
		Hasta Que (option==1 O option==2)
	Hasta Que (option==2)
	Si quantity>250 Entonces
		discount <- 8
	SiNo
		Si quantity>500 Entonces
			discount <- 20
		SiNo
			Si quantity>1000 Entonces
				discount <- 30
			FinSi
		FinSi
	FinSi
	
	Si isCompany Entonces
		Escribir 'Empresa: ',company
		Escribir 'NIT:     ',nit
	FinSi
	Escribir 'Cliente:   ',name,' ',lastName
	Escribir 'Dirección: ',address
	Escribir 'Teléfono:  ',phone
	Para i<-0 Hasta NUM_ARTICLES-1 Hacer
		Si quantitiesA[i]>0 Entonces
			Escribir articlesA[i],' - $',pricesA[i],' - ',quantitiesA[i],' unidades'
			total <- total+(pricesA[i]*quantitiesA[i])
		FinSi
		Si quantitiesE[i]>0 Entonces
			Escribir articlesE[i],' - $',pricesE[i],' - ',quantitiesE[i],' unidades'
			total <- total+(pricesE[i]*quantitiesE[i])
		FinSi
		Si quantitiesI[i]>0 Entonces
			Escribir articlesI[i],' - $',pricesI[i],' - ',quantitiesI[i],' unidades'
			total <- total+(pricesI[i]*quantitiesI[i])
		FinSi
	FinPara
	Escribir 'Unidades adquiridas: ',quantity
	Escribir 'Descuento aplicado: ',discount
	Escribir 'Total de la compra: ',total
	discount <- total*(discount/100)
	Escribir 'Total a pagar: ',total-discount
FinProceso
