package com.ketan;

import javax.jws.soap.SOAPBinding;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);
    }

    private static UserInterface createUserInterface(String color) {

        if(color.equals("RED")){
            return new UserInterface(new RedButton(),new RedScrollbar());
        } else if (color.equals("BLUE")) {
            return new UserInterface(new BlueButton(),new BlueScrollbar());
        }else {
            throw new IllegalArgumentException("Color not supported");
        }
    }
}
