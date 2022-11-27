package java06.Enum;

import java06.Enum.dominio.SingletonEnum;

public class EnumSingleton {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}


