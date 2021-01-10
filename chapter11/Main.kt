

fun main(){
    val orderProcessing = OrderProcessing(LineItemFactoryImpl())
    orderProcessing.printLineItem()
}

class OrderProcessing(
        private val lineItemFactory: LineItemFactory
){
    fun printLineItem(){
        lineItemFactory.makeLineItem().print()
    }
}

class LineItem{

    fun print(){
        println("lineItem")
    }
}

interface LineItemFactory{
    fun makeLineItem():LineItem
}

class LineItemFactoryImpl:LineItemFactory{
    override fun makeLineItem():LineItem {
       return LineItem()
    }
}