package by.tr.xmlAnalized.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import by.tr.xmlAnalized.dao.AnalizerDAO;
import by.tr.xmlAnalized.dao.exception.DAOException;

public class XmlAnalizerDAO implements AnalizerDAO {
	
	public String readFile(String fileName) throws DAOException{
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
