public class ConstructorDemo {
    int x,y;
    ConstructorDemo(int x,int y){
        this.x=x;
        this.y=y;
        void add(){
            System.out.println("Sum is:" +(this.x+this.y));
        }
    }
}
