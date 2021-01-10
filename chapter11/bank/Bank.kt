package bank

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

fun main(){
//    val bank = Proxy.newProxyInstance(Bank::class.java.classLoader,
//    arrayOf(Bank::class.java),
//    BankProxyHandler(BankImpl())) as Bank
    val bank = BankImpl()

    bank.getAccounts()
}

interface Bank{
    fun getAccounts():List<Account>
    fun setAccounts(accounts:List<Account>)
}

class BankImpl:Bank{
    private lateinit var accounts: List<Account>

    override fun getAccounts(): List<Account> {
       return accounts
    }


    override fun setAccounts(accounts: List<Account>) {
        this.accounts = accounts
    }

}

class BankProxyHandler(
        private val bank: Bank
):InvocationHandler{
    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any? {
        println("invoke 실행")
        val methodName = method.name
        return when(methodName){
            "getAccounts" ->{
                bank.setAccounts(getAccountsFromDB())
                bank.getAccounts()
            }
            "setAccounts" -> {
                bank.setAccounts(args?.get(0) as List<Account>)
                null
            }
            else -> null
        }
    }

    private fun getAccountsFromDB() = listOf<Account>()
    private fun setAccountsToDB(accounts: List<Account>){
        //Database에 넣는 작업
    }

}
