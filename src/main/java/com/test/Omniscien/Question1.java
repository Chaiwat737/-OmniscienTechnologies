package com.test.Omniscien;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Question1 {
    public static void main(String[] args) {
        String inputXml = args[0];  
        String outputTxt = args[1];  

        try {
            File file = new File(inputXml);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList tuvList = doc.getElementsByTagName("tuv");

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputTxt));

            for (int i = 0; i < tuvList.getLength(); i++) {
                Element tuv = (Element) tuvList.item(i);

                String lang = tuv.getAttribute("xml:lang");

                if ("en US".equals(lang)) {
                    NodeList segList = tuv.getElementsByTagName("seg");

                    for (int j = 0; j < segList.getLength(); j++) {
                        Element seg = (Element) segList.item(j);
                        String text = seg.getTextContent();

                        writer.write(text);
                        writer.newLine(); // \n
                    }
                }
            }

            writer.close();
            System.out.println("Finish extracting text");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

