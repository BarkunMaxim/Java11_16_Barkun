package by.tr.analizer.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tr.analizer.bean.Element;
import by.tr.analizer.bean.ElementType;
import by.tr.analizer.dao.DocumentAnalizerDAO;
import by.tr.analizer.dao.exception.DaoException;

public class DocumentAnalizerDAOImpl implements DocumentAnalizerDAO {

	private static final String CODE = "UTF-8";
	private static final int SIZE = 100;
	private static final int LINE_BREAK = 0x000A;

	private static Pattern p1;
	private static Pattern p2;
	private static Pattern p3;

	static {
		p1 = Pattern.compile("<[^/]+>");
		p2 = Pattern.compile(">[^>]+</");
		p3 = Pattern.compile("</[^>]+>");
	}

	@Override
	public List<Element> analizeFile(File file) throws DaoException {

		List<Element> list = new ArrayList<Element>();
		BufferedReader br = null;
		try {
			int a = 0;
			char c = 0;
			int i = 0;
			char array[] = new char[SIZE];

			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), CODE));

			while ((a = br.read()) != -1) {
				c = (char) a;

				if (c != LINE_BREAK) {
					array[i] = c;
					i++;
				} else {
					StringBuilder str = new StringBuilder().append(array);
					createElement(str, list);
					array = new char[500];
				}
			}

		} catch (FileNotFoundException e) {
			throw new DaoException("There are no such file", e);
		} catch (IOException e) {
			throw new DaoException("Could not read file", e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				throw new DaoException("Could not close file", e);
			}
		}
		return list;
	}

	public List<Element> createElement(StringBuilder str, List<Element> list) {

		Matcher m = p1.matcher(str);
		if (m.find()) {
			Element element = new Element(str.substring(m.start(), m.end()), ElementType.START);
			list.add(element);
		}
		m = p2.matcher(str);
		if (m.find()) {
			Element element = new Element(str.substring(m.start() + 1, m.end() - 2), ElementType.TEXT);
			list.add(element);
		}
		m = p3.matcher(str);
		if (m.find()) {
			Element element = new Element(str.substring(m.start(), m.end()), ElementType.END);
			list.add(element);
		}
		return list;
	}

}
