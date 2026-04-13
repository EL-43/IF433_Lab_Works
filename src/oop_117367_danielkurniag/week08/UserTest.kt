package oop_117367_danielkurniag.week08

object DatabaseMock {
    fun findUer(id: Int): UserProfile?{
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitText(){
    println("\n==== RUNNING UNIT TEST ====")
    val testUser = DatabaseMock.findUer(1)

    //in unit testing, if user is null, we hope that test fails.
    // so the usage of !! is very common in file testing.
    val initial = testUser!!.name.substring(0, 1)

    //check() is a kotlin function for assertion
    check(initial == "T") {
        "Test Failed! initial is wrong."
    }
    println("Test Passed: Initial is T")
}