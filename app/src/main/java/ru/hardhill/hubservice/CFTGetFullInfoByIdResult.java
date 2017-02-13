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

public class CFTGetFullInfoByIdResult extends CFTMethodResult implements KvmSerializable
{

    
    public CFTDoctor Doc;
    
    public CFTSpesiality DoctorsSpesiality;
    
    public CFTClinic LPU;
    
    public CFTPatient Pat;

    public CFTGetFullInfoByIdResult ()
    {
    }

    public CFTGetFullInfoByIdResult (java.lang.Object paramObj,CFTExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("Doc"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.Doc = (CFTDoctor)__envelope.get(j,CFTDoctor.class,false);
                    }
                    continue;
                }
                if (info.name.equals("DoctorsSpesiality"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.DoctorsSpesiality = (CFTSpesiality)__envelope.get(j,CFTSpesiality.class,false);
                    }
                    continue;
                }
                if (info.name.equals("LPU"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.LPU = (CFTClinic)__envelope.get(j,CFTClinic.class,false);
                    }
                    continue;
                }
                if (info.name.equals("Pat"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.Pat = (CFTPatient)__envelope.get(j,CFTPatient.class,false);
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
            return this.Doc!=null?this.Doc:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.DoctorsSpesiality!=null?this.DoctorsSpesiality:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.LPU!=null?this.LPU:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.Pat!=null?this.Pat:SoapPrimitive.NullSkip;
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
            info.type = CFTDoctor.class;
            info.name = "Doc";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+1)
        {
            info.type = CFTSpesiality.class;
            info.name = "DoctorsSpesiality";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+2)
        {
            info.type = CFTClinic.class;
            info.name = "LPU";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==count+3)
        {
            info.type = CFTPatient.class;
            info.name = "Pat";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
