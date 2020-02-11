
object Clases{
  def main(args: Array[String]): Unit = {
    class Cliente(var nombre: String = "", var direccion: String = "", var email: String = "", var telefono: String = "", private var _cotizacion: Float = 0.0f) {

      var total_cotizaciones: Float = 0.0f

      def cotizacion = _cotizacion

      def cotizacion_(nuevaCotizacion: Float): Unit = {
        _cotizacion = nuevaCotizacion
        total_cotizaciones += nuevaCotizacion
      }

      override def toString: String = s"Cliente(nombre: $nombre, direccion: $direccion, email: $email, telefono: $telefono, cotizacion: $cotizacion, total cotizacion: $total_cotizaciones )"


    }
    var entelgy = new Cliente("Entelgy", "Calle larrauri", "entelgy@gmail.com", "640123212")
    entelgy.cotizacion_(5210.1f)
    println(entelgy)

    var paquitoChocolatero = new Cliente("Paquito Chocolatero", _cotizacion = 100)
    paquitoChocolatero.cotizacion_(50)
    paquitoChocolatero.cotizacion_(1000)
    paquitoChocolatero.cotizacion_(3000)
    println(paquitoChocolatero)

    var nintendo = new Cliente(email = "Nintendo@nintendo.com")
    println(nintendo)

    class Persona(var nombre: String = "", var direccion: String = "") {

      override def toString: String = s"Persona(nombre: $nombre, direccion: $direccion)"


    }

    var paco = new Persona("Paco")
    println(paco)

    var reme = new Persona("Reme")
    println(reme)


    class Empleado(nombre: String = "", direccion: String = "", var cargo: String = "", var sueldo: Float = 0.0f) extends Persona(nombre, direccion) {

      override def toString: String = s"Empleado(nombre: $nombre, direccion: $direccion, cargo: $cargo, sueldo: $sueldo)"
    }
    var ivan = new Empleado("Ivan", "Calle ombu", "Director Recursos Humanos", 1500)
    println(ivan)

    class Jefe(nombre: String = "", direccion: String = "", cargo: String = "", sueldo: Float = 0.0f, var nombreDepartamento: String = "") extends Empleado(nombre, direccion, cargo, sueldo) {

      override def toString: String = s"Jefe(nombre: $nombre, direccion: $direccion, cargo: $cargo, sueldo: $sueldo, nombre de departamento: $nombreDepartamento)"

    }
    var cristian = new Jefe("Cristian", "calle cambroño", "Encargado", 5600, "I+D+i")
    println(cristian)


    trait Ladrador {

      def ladrar(): Unit = println("Guau")
    }

    trait Mordedor {

      def morder(): Unit = println("GRRRRRRR")
    }

    class Perro(var nombre: String = "", var raza: String = "", var edad: Int = 0) extends Ladrador with Mordedor {

      override def toString: String = s"Perro(nombre: $nombre, raza: $raza, edad: $edad)"

    }

    var drogo = new Perro("Drogo", "Labrador", 4)
    drogo.ladrar()
    drogo.morder()
    println(drogo)

    class Galgo(nombre: String = "", raza: String = "", edad: Int = 0) extends Perro(nombre, raza, edad){

      override def morder(): Unit = println("Muerde el culo")
    }

    var perro1 = new Galgo()
    perro1.morder()
  }
}