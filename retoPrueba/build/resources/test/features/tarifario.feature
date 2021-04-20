# language:es
Característica: : Consultar tarifas de Cuentas de Depósitos
  Yo como usuario de banistmo,
  necesito consultar las diferentes tarifas existentes para las Cuentas de Depositos a traves de la pagina web,
  para conocer los diferentes cargos que se puedan aplicar, segun el tipo de cuenta Depositos que maneje.

  Escenario: Consulta exitosa del archivo con tarifas para cuentas depositos
    Dado Yo como usuario del portal web de banistmo
    Cuando Ingreso al menu tarifario
    Y Consulto el archivo de tarifas de Cuentas de Depositos
    Entonces Visualizo en una nueva ventana el archivo de tarifas


