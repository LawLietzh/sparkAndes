/**
  * Created by zhangheng on 2017/9/2.
  *
  * 这是定义  一个类，
  * 同一个包中，scaTestClass 类可以调研该类，创建对象，
  */
class Point (xc: Int, yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x);
    println("y 的坐标点: " + y);
  }
}
