package com.akshat.findmytutor

class Student {
    var name:String?=null
    var email:String?=null
    var uid:String?=null
    var userType: String? = null

    constructor(){}

    constructor(name:String,email:String,uid:String){
        this.name=name
        this.email=email
        this.uid=uid
        this.userType = "student"
    }
}