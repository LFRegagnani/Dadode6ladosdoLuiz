package com.example.dadode6ladosdoluiz

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test as Test



class ExampleUnitTest {
    @Test

    fun testeGerarNumeros(){

        val dado = Dado(6)
        val testeDado = dado.rolar()
        assertTrue("O valor resultado de testeDado não é entre 1 e 6", testeDado in 1..6)

    }
}