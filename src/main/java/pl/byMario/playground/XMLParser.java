package pl.byMario.playground;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class XMLParser {

	public void parseFileFromPath(String path) throws ParserConfigurationException, SAXException, IOException {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(path);

		if(in == null) {
			System.out.println("Cannot find file");
		}
		else {

			parseInputStream(in);

		}
	}

	/**
	 * @param in
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private void parseInputStream(InputStream in) {

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			MyHandler handler = new MyHandler();

			Reader reader = new InputStreamReader(in, "UTF-8");

			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");

			saxParser.parse(is, handler);
			Video entity = handler.getEntity();

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public class Video implements Serializable {

		private static final long serialVersionUID = 2284488937952510797L;

		private Long id;
		private String title;
		private String videoPath;
		private Date creationDate;

		// Default Constructor
		public Video() {

		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getVideoPath() {
			return videoPath;
		}

		public void setVideoPath(String videoPath) {
			this.videoPath = videoPath;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

	}
	
	public class MyHandler extends DefaultHandler {
		
		

		Video video = null;
		
		
		public Video getEntity(){
			return video;
		}
		
		boolean isTitle = false;
		boolean isType = false;
		boolean isPath = false;
		boolean iskeywordSet = false;

		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

			System.out.println("Start Element :" + qName);

			if(qName.equalsIgnoreCase("video")) {
				video = new Video();
			}else
			
			if(qName.equalsIgnoreCase("title")) {
				isTitle = true;
			}else

			if(qName.equalsIgnoreCase("type")) {
				isType = true;
			}else

			if(qName.equalsIgnoreCase("path")) {
				isPath = true;
			}else

			if(qName.equalsIgnoreCase("keywordSet")) {
				iskeywordSet = true;
			}

		}

		public void endElement(String uri, String localName, String qName) throws SAXException {

			System.out.println("End Element :" + qName);

		}

		public void characters(char ch[], int start, int length) throws SAXException {

			String value = new String(ch, start, length);
			System.out.println(new String(ch, start, length));

			if(isTitle) {
				System.out.println("Title : " + new String(ch, start, length));
				video.setTitle(value);
				isTitle = false;
			}

			if(isType) {
				System.out.println("Type : " + new String(ch, start, length));
				video.setTitle(value);
				isType = false;
			}

			if(isPath) {
				System.out.println("Path : " + new String(ch, start, length));
				video.setVideoPath(value);
				isPath = false;
			}

//			if(iskeywordSet) {
//				System.out.println("Salary : " + new String(ch, start, length));
//				video.setTitle(value);
//				iskeywordSet = false;
//			}

		}
		

	}

}
