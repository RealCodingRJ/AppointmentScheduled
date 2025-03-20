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

        println("Enter Month: ")
        val month = readln()
        println("Enter Day: ")
        val day = readln()
        println("Enter Hour: ")
        val hour = readln()
        println("Enter Minute: ")
        val minute = readln()

        val dateCurrent  = "$inputs was Added on: ${date.toLocalDate()}\n"
        val appointmentTime = "Appointment Starts on $month/$day $hour:$minute\n";

        file.appendText(dateCurrent);
        file.appendText(appointmentTime);

        num += 1;
        break;
    }

}