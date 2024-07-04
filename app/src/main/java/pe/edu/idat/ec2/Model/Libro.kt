package pe.edu.idat.ec2.Model

import androidx.annotation.DrawableRes

data class Libro {
    val titulo: String,
    val descripcion: String,
    val fecha: String,
    @DrawableRes var imagen: Int
}