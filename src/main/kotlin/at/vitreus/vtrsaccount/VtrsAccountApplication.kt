package at.vitreus.vtrsaccount

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VtrsAccountApplication

fun main(args: Array<String>) {
	runApplication<VtrsAccountApplication>(*args)
}
