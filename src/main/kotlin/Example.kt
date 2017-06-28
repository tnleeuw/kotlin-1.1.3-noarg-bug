
import javax.persistence.Entity

@Entity
class Foo(
        val s1: String
) {
    val s2: String = ""

    val l: List<String> = listOf()
}
