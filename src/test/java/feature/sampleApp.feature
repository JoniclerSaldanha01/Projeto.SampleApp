#language: pt
#encoding: utf-8
Funcionalidade: Preencher formulario de seguro veicular

	@Cadastro
	Cenario: Preencher o formulario Seguro veicular
		Dado que acessei o sampleapp no chrome
		Quando preencho o formulario "Enter Vehicle Data" e pressione next
		E preencho o formulario "Enter Insurant Data" e pressione next
		E preencho o formulario "Enter Product Data" e pressione next
		E preencho o formulario "Select Price Option" e pressione next
		E preencho o fomrulario Send Quote e pressione Send
		Entao valido que o email foi enviado com sucesso

