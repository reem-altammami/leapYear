fun main(args: Array<String>) {
    var year=1600

    if (year>=1582){
        if (year%400==0) {
            println("year is leap year")
        }
        else if(year%100==0){
            println("year is not leap year")
        }
        else if(year%4==0)
            println("year is leap year")
        else{
            println("year is not leap year")
        }
    }
    else if (year<1582 ) {
        if (year % 4 == 0) {
            println("year is leap year")
        }
        else {
            println("year is not leap year")
        }
    }
}