package com;

import java.rmi.Remote;
import java.util.List;

import com.DictionaryserviceImpl.Dictionary;

public interface IDictionaryservice extends Remote {

public String sayTxt(String name) throws java.rmi.RemoteException;
public String comparison(String txt) throws java.rmi.RemoteException;
public String getDictionaryList() throws java.rmi.RemoteException;
public boolean add(String code,String definition) throws java.rmi.RemoteException;
public boolean delete(String code) throws java.rmi.RemoteException;

}