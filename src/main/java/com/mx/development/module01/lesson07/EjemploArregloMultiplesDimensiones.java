package com.mx.development.module01.lesson07;

public class EjemploArregloMultiplesDimensiones {
    Pais pais;
}

class Pais{
    Estado []estados;
}
class Estado{
    Municipio[]municipios;
}
class Municipio{
    Colonia[]colonias;
}

class Colonia{
    Calle[]calles;
}
class Calle{

}