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

public class CFTOrg extends AttributeContainer implements KvmSerializable
{

    
    public String Chief;
    
    public String Contact;
    
    public Integer District;
    
    public String EMail;
    
    public Integer GIS_ID;
    
    public Integer GIS_Layer;
    
    public Integer Hub_ID;
    
    public Integer ID;
    
    public String Org_Address;
    
    public String Org_Name;
    
    public String Org_Type;
    
    public String WWW;
    
    public String WorkTime;

    public CFTOrg ()
    {
    }

    public CFTOrg (java.lang.Object paramObj,CFTExtendedSoapSerializationEnvelope __envelope)
    {
	    
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
                if (info.name.equals("Chief"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Chief = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Chief = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Contact"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Contact = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Contact = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("District"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.District = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.District = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("EMail"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.EMail = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.EMail = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("GIS_ID"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.GIS_ID = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.GIS_ID = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("GIS_Layer"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.GIS_Layer = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.GIS_Layer = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Hub_ID"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Hub_ID = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.Hub_ID = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ID"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ID = Integer.parseInt(j.toString());
                            }
                        }
                        else if (obj instanceof Integer){
                            this.ID = (Integer)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Org_Address"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Org_Address = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Org_Address = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Org_Name"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Org_Name = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Org_Name = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("Org_Type"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.Org_Type = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.Org_Type = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("WWW"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.WWW = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.WWW = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("WorkTime"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.WorkTime = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.WorkTime = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.Chief!=null?this.Chief:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Contact!=null?this.Contact:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.District!=null?this.District:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.EMail!=null?this.EMail:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.GIS_ID!=null?this.GIS_ID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.GIS_Layer!=null?this.GIS_Layer:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.Hub_ID!=null?this.Hub_ID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.ID!=null?this.ID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.Org_Address!=null?this.Org_Address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.Org_Name!=null?this.Org_Name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.Org_Type!=null?this.Org_Type:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.WWW!=null?this.WWW:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.WorkTime!=null?this.WorkTime:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 13;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Chief";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Contact";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "District";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "EMail";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "GIS_ID";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "GIS_Layer";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Hub_ID";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "ID";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Org_Address";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Org_Name";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Org_Type";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "WWW";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "WorkTime";
            info.namespace= "http://schemas.datacontract.org/2004/07/HubService2";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
