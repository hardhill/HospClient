package ru.hardhill.hubservice;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 13/02/2017
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class CFTArrayOfError extends Vector< CFTError> implements KvmSerializable
{
    
    public CFTArrayOfError(){}
    
    public CFTArrayOfError(java.lang.Object inObj,CFTExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                CFTError j1= (CFTError)__envelope.get(j,CFTError.class,false);
                add(j1);
            }
        }
}
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "Error";
        info.type = CFTError.class;
    	info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    
}