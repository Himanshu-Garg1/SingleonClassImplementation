enum SingletonEnum
{
    Instance;
    int data;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class SingletonImplementation {

    public static void main(String[] args) {
        SingletonEnum singletonEnum= SingletonEnum.Instance;
        System.out.println(singletonEnum.getData());
        singletonEnum.setData(12);

        System.out.println(singletonEnum.getData());


    }


}
