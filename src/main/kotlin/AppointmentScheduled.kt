import java.io.File
import java.time.LocalDateTime
import java.util.*

fun main() {

    var num = 1;

    while(true) {

        println("Enter Appointment Text: ");
        val inputs = readln()

        val file = File("appointments.txt");

        val date = LocalDateTime.now();

        val dateCurrent  = "$inputs was Added on: ${date.toLocalDate()}\n"

        file.appendText(dateCurrent);

        num += 1;
        break;
    }


}