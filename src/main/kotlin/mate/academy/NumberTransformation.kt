package mate.academy

const val A = 3
const val B = 10
const val C = 11
/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(A)?.plus(B)?.mod(C)
}
