package ru.hardhill.hubservice;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 13/02/2017
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class CFTInspectDoctorsReferalResult extends CFTMethodResult implements KvmSerializable
{

    
    public String IdDoc;
    
    public Integer IdLpu;
    
    public String Id_Patient;
    
    public CFTEnums.AppointmentType Type;

    public CFTInspectDoctorsReferalResult ()
    {
    }

    public CFTInspectDoctorsReferalResult (java.lang.Object paramObj,CFTExtendedSoapSerializationEnvelope __envelope)
    {
	    super(paramObj, __envelope);
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("IdDoc"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.IdDoc = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.IdDoc = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("IdLpu"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.IdLpu = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.IdLpu = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Id_Patient"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Id_Patient = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Id_Patient = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Type"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Type = CFTEnums.AppointmentType.fromString(j.toString());
                            }
                        }
                        else if (obj instanceof CFTEnums.AppointmentType){
                            this.Type = (CFTEnums.AppointmentType)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.IdDoc!=null?this.IdDoc:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.IdLpu!=null?this.IdLpu:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.Id_Patient!=null?this.Id_Patient:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.Type!=null?this.Type.toString():SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "IdDoc";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "IdLpu";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id_Patient";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Type";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

