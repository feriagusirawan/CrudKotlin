package com.crud.root.crudkotlin

class ApiEndPoint {

    companion object {

        private val SERVER = "http://feriagusirawan.000webhostapp.com/Crud/connection.php"
        val CREATE = SERVER+"create.php"
        val READ = SERVER+"read.php"
        val DELETE = SERVER+"delete.php"
        val UPDATE = SERVER+"update.php"

    }

}