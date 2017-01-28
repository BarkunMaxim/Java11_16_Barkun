package by.tr.xmlAnalized.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import by.tr.xmlAnalized.dao.AnalizedDAO;
import by.tr.xmlAnalized.dao.exception.DAOException;

public class XmlAnalizedDAO implements AnalizedDAO {
	
	public String getNode(String fileName) throws DAOException{
		String tag = "";
		try{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"));
			int symbol;
			while((symbol = bufferedReader.read()) != -1){
				tag+=(char)symbol;
				
			}
			bufferedReader.close();
		}catch(IOException e){
			throw new DAOException();
		}

		return tag;
	}

}
