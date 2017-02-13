package ru.hardhill.hubservice;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 13/02/2017
//
//---------------------------------------------------





public class CFTEnums
{

    public enum AppointmentType
    {
        
        отсутстствует_неопределено(0),
        
        повторный(2),
        
        консультация(1);
        
        private int code;
        
        AppointmentType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static AppointmentType fromString(String str)
        {
            if (str.equals("отсутстствует_неопределено"))
                return отсутстствует_неопределено;
            if (str.equals("повторный"))
                return повторный;
            if (str.equals("консультация"))
                return консультация;
		    return null;
        }
    }

    public enum SpecialistType
    {
        
        отсутстствует_неопределено(0),
        
        широкого_профиля(1),
        
        узкий(2);
        
        private int code;
        
        SpecialistType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SpecialistType fromString(String str)
        {
            if (str.equals("отсутстствует_неопределено"))
                return отсутстствует_неопределено;
            if (str.equals("широкого_профиля"))
                return широкого_профиля;
            if (str.equals("узкий"))
                return узкий;
		    return null;
        }
    }

    public enum PositionType
    {
        
        отсутстствует_неопределено(0),
        
        медрегистратор(1),
        
        оператор(2),
        
        врач(3),
        
        портал(4),
        
        инфомат(5),
        
        система(6);
        
        private int code;
        
        PositionType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static PositionType fromString(String str)
        {
            if (str.equals("отсутстствует_неопределено"))
                return отсутстствует_неопределено;
            if (str.equals("медрегистратор"))
                return медрегистратор;
            if (str.equals("оператор"))
                return оператор;
            if (str.equals("врач"))
                return врач;
            if (str.equals("портал"))
                return портал;
            if (str.equals("инфомат"))
                return инфомат;
            if (str.equals("система"))
                return система;
		    return null;
        }
    }

}