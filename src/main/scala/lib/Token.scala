package lib

class Token(val _type:String, val value:String){

  override def toString: String = {
    "{'type':'%s', 'value':'%s'}".format(_type, value)
  }
}
