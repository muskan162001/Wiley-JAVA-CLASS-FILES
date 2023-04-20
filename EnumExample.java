enum weekdays{
    Monday, Mon, Tue,Wed,Thu,Fri,Sat
}

public class EnumExample {

    public static void main(String[] args){
        
    //weekdays day = weekdays.Sat;
    //System.out.println(day);

    for(weekdays w : weekdays.values()){
        System.out.println(w);
    }
    }
}
