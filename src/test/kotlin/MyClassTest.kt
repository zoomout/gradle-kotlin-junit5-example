import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyClassTest{

    @Test
    fun myTest(){
        assertEquals(5, MyClass().myFun())
    }
}
