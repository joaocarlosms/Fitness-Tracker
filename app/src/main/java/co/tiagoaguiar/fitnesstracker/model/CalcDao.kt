package co.tiagoaguiar.fitnesstracker.model

import androidx.room.*

@Dao
interface CalcDao {

    @Insert
    fun insert(calc: Calc)

    // @Query -> buscar
    // @Update -> atualizar
    // @Delete -> excluir
}