package com.example.list.usecase

sealed class ListOrder(val orderType: OrderType){
    class ListName(orderType: OrderType): ListOrder(orderType)
   // class ListName(orderType: OrderType): ListOrder(orderType)//date
   // class ListName(orderType: OrderType): ListOrder(orderType) //color, etc..
}
