package pl.byMario.playground;

import com.artofsolving.jodconverter.DefaultDocumentFormatRegistry;
import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.sun.media.jai.codec.*;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.imageio.ImageIO;
import javax.media.jai.NullOpImage;
import javax.media.jai.OpImage;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.nio.file.Files;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.jatha.Jatha;
//import org.jatha.dynatype.LispValue;
//import org.jatha.read.LispParser;

public class Main {

	// @Autowired
	// UserCommunicationService userCommunicationService;
	private static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] argv) {

		System.out.println("1,2,3,4".contains(""));
		System.out.println("1,2,3,4".replaceAll(" ,",""));
//		String zdanie = "0000567/03";
//		
//		
//		String[] split = zdanie.split("/");
//		
//		split[1] = split[1].replaceFirst("^0+(?!$)", "");
//		
//		System.out.println(split[0] + "/" + split[1]);
//		modulo();
		
		
//		checkFtps();
		//		checkDuplicatesInList();
		//		parseXMLTest();

		//		overrideTest();
		//split();
		//		timeUnitPlay();
		//		System.out.println(Integer.parseInt("80000175412060".substring(3, 14 - 1), 10));

//				equalityCompare();

		// enumEqulTest();
		// wordConvTest();
		// barcodeGenerate();
		//		vectorTest();
		//		 imageTest();
		// testMAX();
		// checkPolymorphism();
		// compoundCheck();
		// forLoopCheck();
//		 switchTest();
		// checkMassiveFunc();
		// jatha();
		// checkSysProps();
//		 regExpCheck();
		// checkArrays();
		// parseDate();
		//		 getWordsFromString("so322word95");
		//		getPatternCheck();
		//		 stringTest();
		// checkLoopBreak();
		// listContainsCheck();
		//		 checkMapInsertion();
		// checkListImpl();
		// mySqlTest();
		// sysPropCheck();
		// mapSize();
		// arraySize();
		// floatOperation();
		// getRandomFloat();
		// listTest2();
		System.out.println("koniec MAIN");
	}

	private static void modulo() {
		int a = 5;
		int b = 1;
		
		
		
		
		System.out.println(a/b);
		System.out.println(a%b);
		
	}

	public class MyThread extends Thread{
		
//		String path ;
//		File file;
//		SftpsClient cl;
//		
//		public void sett(String path,File file , SftpsClient cl){
//			this.file = file;
//			this.path = path;
//			this.cl = cl;
//		}
//		
//		public void run (){
//			try {
//				cl.uploadFile(path, file);
//			}
//			catch(Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	private static void checkFtps() {

//		SftpsClient cl = new SftpsClient();
//		String path = "C:\\maile\\2.tif";
//		String path2 = "C:\\maile\\2a.tif";
//
//		File file = new File(path);
//		File file2 = new File(path2);
//
//		cl.init("ftp.getbacksa.pl", "archidoc_01", "GhE3y!kL841@vFdq97$", true, 990, Typ.FTPS);
//		
//		
//		MyThread t1 = new Main().new MyThread();
//		t1.sett("/", file, cl);
//		
//		MyThread t2 = new Main().new MyThread();
//		t2.sett("/", file2, cl);
//		
//		t1.start();
//		t2.start();
//		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(outF))) {
//			ftpcl.uploadFile("/", outF);
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private static void checkDuplicatesInList() {

		List<String> strList = new ArrayList<String>();

		strList.add(new String("one"));
		strList.add(new String("two"));
		strList.add(new String("three"));
		strList.add(new String("three"));

		System.out.println(strList);

		Set<String> strSet = new TreeSet<String>();

		strSet.addAll(strList);

		System.out.println(strSet);
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void parseXMLTest() {

		XMLParser parser = new XMLParser();
		String path = "video_1.xml";

		try {
			parser.parseFileFromPath(path);
		}
		catch(ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void split() {

		String szukanyText = "";
		String regex = "";

		String[] words = szukanyText.split(regex);

		for(String string : words) {
			System.out.println(string);
		}

	}

	class BaseC {
		public void foo() {
			System.out.println("base foo");
		}
	}

	class DeriC extends BaseC {
		public void foo() {
			System.out.println("deri foo");
		}

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	public static void overrideTest() {

		BaseC c = new Main().new DeriC();
		BaseC ca = new Main().new BaseC();

		BaseC c1 = (DeriC)ca;

		c1.foo();
		//		c.foo();

	}

	private static void timeUnitPlay() {
		System.out.println(TimeUnit.SECONDS.toMinutes(7200));
		System.out.println(TimeUnit.MINUTES.toSeconds(120));
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void equalityCompare() {
		Integer i1 = new Integer(13);
		Integer i2 = new Integer(14);

		if(i1 == i1) {
			System.out.println("== same object");
		}
		if(i1.equals(i1)) {
			System.out.println("equals");
		}
		System.out.println(i1);
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void vectorTest() {

		Vector<String[]> v = new Vector<>();

		for(int i = 0; i < Integer.MAX_VALUE; i++) {

			// if(i == 46700000) {
			// System.out.println("LAST " + i);
			// break;
			// }
			if(i % 100000 == 0) System.out.println(i);
			v.add(new String[] { String.valueOf(i) });
			// nodes.add(i);

			// conn.put(i, value)
		}

		System.out.println(v.get(1234325));
		// System.out.println(v.get(1)[0]);
		// System.out.println(v.get(14234325)[0]);
		// System.out.println(v.get(0)[0]);
		// System.out.println(v.get(16700000)[0]);
		// System.out.println(v.get(46700000 - 1)[0]);
		// System.out.println(v.get(66667)[0]);
		// System.out.println(v.get(1234325)[0]);
		// v.get(1234325)="000.00000000;99.222222222;1322.123412352134;45345.1313132";
		// System.out.println(v.get(1234325)[0]);
		System.out.println(v.get(1234325));
		System.out.println(v.size());

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void barcodeGenerate() {

		// ArchiDoc: kod dokumentu
		// '10', 11 cyfr, 1 cyfra kontrolna

		int value = 13534;
		int barcodeLength = 12;
		int leadingDigit = 9;
		// String.valueOf(barcodeLength).length()
		String bcval = String.format("%d%0" + (barcodeLength - String.valueOf(leadingDigit).length() - 1) + "d", leadingDigit, value);
		System.out.println("bcval: " + bcval);
		System.out.println("len: " + bcval.length());
		int sum = 0;
		int len = bcval.length();
		for(int i = 0; i < len; i++) {
			// wagi maja wartosc naprzemiennie 3 i 1,
			// poczawszy od najbardziej prawego
			int weight = (len - 1 - i) % 2 == 0 ? 3 : 1;
			sum += weight * (bcval.charAt(i) - '0');
		}
		System.out.println("sum: " + sum);
		int bInt = (10 - sum % 10) % 10;
		System.out.println("bInt: " + bInt);
		bcval += Integer.toString(bInt);
		System.out.println("bcval: " + bcval);
		System.out.println("len: " + bcval.length());

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void wordConvTest() {
		String inPath = "C:\\maile\\read\\text.txt";
		String outPath = "C:\\maile\\converted\\2.pdf";

		try {
			File inF = new File(inPath);
			File outF = new File(outPath);

			byte[] inB = Files.readAllBytes(inF.toPath());
			// byte[] outB = Files.readAllBytes(outF.toPath());

			ByteArrayInputStream inBA = new ByteArrayInputStream(inB);
			OutputStream outBA = new FileOutputStream(outF);
			// File sourceDirectory = new File(inPath);
			// File file[] = sourceDirectory.listFiles();
			// int numImages = file.length;

			// System.out.println("num of files: " + numImages);
			OpenOfficeConnection connection;

			// connect to an OpenOffice.org instance running on port 8100
			connection = new SocketOpenOfficeConnection(8100);
			connection.connect();

			// convert
			DocumentConverter converter = new OpenOfficeDocumentConverter(connection);

			// DocumentFormat inDF = new DocumentFormat();
			DefaultDocumentFormatRegistry inDF = new DefaultDocumentFormatRegistry();

			converter.convert(inBA, inDF.getFormatByFileExtension("txt"), outBA, inDF.getFormatByFileExtension("pdf"));
			// converter.convert(in, out);

			outBA.flush();
			outBA.close();
			inBA.close();

			// close the connection
			connection.disconnect();

		}
		catch(ConnectException ex) {
			ex.printStackTrace();
			// throw new
			// ConversionException("Usługa konwertująca dokumenty 'office' nie została uruchomiona");
		}
		catch(FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			// throw new ConversionException(e.getLocalizedMessage());
		}

	}

	private enum TestEnum {

		TEST_1(1), TEST_2(2);

		Integer sysId;

		TestEnum(Integer sysId) {
			this.sysId = sysId;
		}

	}

	private static void enumEqulTest() {

		Integer i = 1;
		TestEnum e = null;

		if(TestEnum.TEST_1.equals(e)) {
			System.out.println("OK");
		}
		else {
			System.out.println("NOT OK");
		}
		// for(TestEnum iterable_element : TestEnum.values()) {
		//
		// iterable_element.
		// }

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void imageTest() {

		String inPath = "C:\\maile\\read\\2.tif";
		String outPath = "C:\\maile\\";

		File sourceDirectory = new File(inPath);
		//		File file[] = sourceDirectory.listFiles();
		File file[] = new File[1];
		file[0] = sourceDirectory;
		System.out.println("file size: " + sourceDirectory.length());
		int numImages = file.length;

		System.out.println("num of files: " + numImages);
		Vector<BufferedImage> vector = new Vector<BufferedImage>();

		BufferedImage image[] = new BufferedImage[numImages];

		try {
			for(int i = 0; i < numImages; i++) {
				if(file[i].getName().contains("tif")) {
					byte[] readAllBytes = Files.readAllBytes(file[i].toPath());

					SeekableStream ss = new ByteArraySeekableStream(readAllBytes);
					ImageDecoder decoder = ImageCodec.createImageDecoder("tiff", ss, null);
					int numPages = decoder.getNumPages();

					int acceptedSize = 3500000 / numPages; // around 100kb
					//					int acceptedSize = 1500; // around 100kb

					System.out.println("num of pages: " + numPages);
					for(int j = 0; j < numPages; j++) {

						//						RenderedImage decodeAsRenderedImage = decoder.decodeAsRenderedImage(j);

						BufferedImage asBufferedImage = new NullOpImage(decoder.decodeAsRenderedImage(j), null, null, OpImage.OP_IO_BOUND).getAsBufferedImage();

						for(String b : ImageIO.getWriterFormatNames()) {
							//							System.out.println(b);
						}

						//						boolean isConvertToBW = false;
						//						writeTiff(outPath, asBufferedImage);
						if(writeTiff(outPath, asBufferedImage) > acceptedSize) {

							System.out.println("compressing... ");
							//							BufferedImage image_to_save2 = new BufferedImage(asBufferedImage.getWidth(), asBufferedImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
							//							image_to_save2.getGraphics().drawImage(asBufferedImage, 0, 0, null);
							//
							//							asBufferedImage = image_to_save2;

							byte[] map = new byte[] { (byte)(255), (byte)(199) };
							IndexColorModel colorModel = new IndexColorModel(1, 2, map, map, map, 0);

							//							Color[] colors = {
							//								    Color.blue, Color.darkGray}; 
							//								    byte[] reds = new byte[colors.length];  
							//								    byte[] greens = new byte[colors.length];  
							//								    byte[] blues = new byte[colors.length];  
							//								    for (int k = 0; k < colors.length; k++) {  
							//								      reds[k] = (byte) colors[k].getRed();  
							//								      greens[k] = (byte) colors[k].getGreen();  
							//								      blues[k] = (byte) colors[k].getBlue();  
							//								    }  
							//								    IndexColorModel colorModel = new IndexColorModel(8, colors.length, reds, greens, blues); 

							BufferedImage image_to_save3;
							boolean ifColorModel = false;
							//							image_to_save3 = new BufferedImage(asBufferedImage.getWidth(), asBufferedImage.getHeight(), BufferedImage.TYPE_BYTE_BINARY);

							//							if (writeTiff(outPath, image_to_save3)> acceptedSize) {

							image_to_save3 = new BufferedImage(asBufferedImage.getWidth(), asBufferedImage.getHeight(), BufferedImage.TYPE_BYTE_BINARY, colorModel);
							//								writeTiff(outPath, image_to_save3);
							//							}
							//							if(ifColorModel){
							//							} else{
							//							}

							image_to_save3.getGraphics().drawImage(asBufferedImage, 0, 0, null);

							asBufferedImage = image_to_save3;
						}

						//						PlanarImage op = new NullOpImage(decoder.decodeAsRenderedImage(j), null, null, OpImage.OP_IO_BOUND);
						vector.add(asBufferedImage);
					}
				}
			}

			TIFFEncodeParam params = new TIFFEncodeParam();
			OutputStream out = new FileOutputStream(outPath + "\\combined.tif");
			ImageEncoder encoder = ImageCodec.createImageEncoder("tiff", out, params);

			List<BufferedImage> imageList = new ArrayList<BufferedImage>();

			for(int i = 1; i < vector.size(); i++) {
				imageList.add(vector.get(i));
			}
			params.setExtraImages(imageList.iterator());
			params.setCompression(TIFFEncodeParam.COMPRESSION_PACKBITS);
			params.setLittleEndian(true);
			encoder.encode(vector.get(0));
			out.close();
			System.out.println("total page size: " + new File(outPath + "\\combined.tif").length());
			//			writeTiff(outPath, vector);
		}
		catch(Exception e) {
			System.out.println("Exception " + e.getLocalizedMessage());
		}

	}

	private static int writeTiff(String outPath, BufferedImage bi) throws IOException {

		TIFFEncodeParam params = new TIFFEncodeParam();
		OutputStream out = new ByteArrayOutputStream();
		ImageEncoder encoder = ImageCodec.createImageEncoder("tiff", out, params);

		params.setCompression(TIFFEncodeParam.COMPRESSION_PACKBITS);
		params.setLittleEndian(true);
		encoder.encode(bi);
		out.close();
		System.out.println("page size: " + ((ByteArrayOutputStream)out).size());

		return ((ByteArrayOutputStream)out).size();
	}

	private static int checkSize(BufferedImage bufferedImage) {
		ByteArrayOutputStream tmp = new ByteArrayOutputStream();

		try {
			ImageIO.write(bufferedImage, "jpg", tmp);
			tmp.close();
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1 size: " + tmp.size());

		return tmp.size();

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void listTest2() {

		List<String> l = new LinkedList<String>();

		l.add(0, "0");
		l.add(2, "1234567890");

		System.out.println(l.size());
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void floatOperation() {
		float fl = 0.0987654321F;
		long ln = 10000000000L;
		long in = (int)(fl * ln);
		// double in= 9999999999.9999999999D;
		Float randomDouble = getRandomFloat();
		// double in= Double.MAX_VALUE;
		// BigDecimal bd = new BigDecimal(1234567890.0987654321);
		//
		// System.out.println(bd.toEngineeringString());
		// System.out.println(bd.toPlainString());
		// System.out.println(bd.toString());
		// System.out.println(bd);

		System.out.printf("%.10f", randomDouble % 1);
		System.out.println();

		System.out.println(randomDouble);
		System.out.printf("%.10f", randomDouble);
		System.out.println();
		System.out.printf(Double.toString(randomDouble));

		System.out.println("integer");
		System.out.printf("%10d", randomDouble % 1);
		System.out.println();

		// System.out.println(in);
		// System.out.printf("%10d", in);
		// System.out.println();
		// System.out.printf(Long.toString(in));
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void arraySize() {

		long currentTimeMillis = System.currentTimeMillis();
		List<String> nodes = new ArrayList<String>(); // idNode;sum;output;nodeD
		Map<String, List<String[]>> conn = new HashMap<String, List<String[]>>(); // idNode
																					// ,
																					// weight;gradient;weightD;outputD

		for(int i = 0; i < Integer.MAX_VALUE; i++) {

			// if(i == 46700000) {
			// System.out.println("LAST " + i);
			// break;
			// }
			if(i % 100000 == 0) System.out.println(i);
			nodes.add(new String("3"));
			// nodes.add(i);

			// conn.put(i, value)
		}

		/**
		 * 4 x float 28500000 2 x float 31100000 1 x float 46700000 4 x double
		 * 19800000 2 x double 28500000 1 x double 31100000
		 * 
		 * 
		 */

		//
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(1234325)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(1)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(14234325)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(0)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(16700000)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(46700000 - 1)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(66667)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// System.out.println(nodes.get(1234325)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// nodes.get(1234325)[0]="000.00000000;99.222222222;1322.123412352134;45345.1313132";
		// System.out.println(nodes.get(1234325)[0]);
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
		// // System.out.println(aray.get(1234325));
		// // System.out.println(System.currentTimeMillis() -
		// currentTimeMillis);
		// System.out.println(nodes.size());
		// System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void mapSize() {
		long currentTimeMillis = System.currentTimeMillis();
		Map<Integer, Double> map = new HashMap<Integer, Double>();

		for(int i = 0; i < Integer.MAX_VALUE; i++) {

			if(i == 16700000) {
				System.out.println("LAST " + i);
				break;
			}
			// if(i % 100000 == 0) System.out.println(i);
			map.put(i, (double)i);
		}

		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(1234325));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(1));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(14234325));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(0));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(16700000));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(16700000 - 1));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(66667));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.get(1234325));
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
		System.out.println(map.size());
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void testMAX() {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
		final long MEGABYTE = 1024L * 1024L;

		System.out.println(Integer.MAX_VALUE);

		System.out.println("b" + runtime.totalMemory());
		System.out.println("b" + runtime.freeMemory());

		int[] arrayMax = new int[Integer.MAX_VALUE];

		System.out.println("a" + runtime.totalMemory());
		System.out.println("a" + runtime.freeMemory());

	}

	private static void sysPropCheck() {

		try {
			Properties props = System.getProperties();
			String path = new File(".").getCanonicalPath();
			String pat = System.getProperty("user.dir");

			LOGGER.info(props);
			LOGGER.info(path);
			LOGGER.info(pat);
			LOGGER.warn(props);
			LOGGER.warn(path);
			LOGGER.warn(pat);

		}
		catch(Throwable t) {
			System.out.println("exception!");
			t.printStackTrace();
		}

	}

	public static class One {

		public void method1() {

			System.out.println("method1 in One clazz");
		}

		public static void method2() {

			System.out.println("method2 in One clazz");
		}
	}

	public static class Two extends One {

		@Override
		public void method1() {

			System.out.println("method1 in Two clazz");
		}

		public static void method2() {

			System.out.println("method2 in Two clazz");
		}
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void checkPolymorphism() {

		One one = new Main.One();
		One oneTwo = new Main.Two();
		Two two = new Main.Two();

		one.method1();
		oneTwo.method1();
		two.method1();

		one.method2();
		oneTwo.method2();
		two.method2();

		one.method2();
		((Two)oneTwo).method2();
		((Two)two).method2();
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void compoundCheck() {

		int a = 10;
		System.out.print(a + ": ");
		System.out.println(a %= 3);

		a = 4;
		System.out.print(a + ": ");
		System.out.println(a &= 2);

		a = 4;
		System.out.print(a + ": ");
		System.out.println(a ^= 2);

		a = 4;
		System.out.print(a + ": ");
		System.out.println(a |= 2);

		a = 4;
		System.out.print(a + ": ");
		System.out.println(a <<= 2);

		a = 3;
		System.out.print(a + ": ");
		System.out.println(a >>= 2);

		a = 3;
		System.out.print(a + ": ");
		System.out.println(a >>>= 2);

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void forLoopCheck() {
		int i = 0;
		for(i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		i = 0;
		for(i = 0; i < 5; ++i) {
			System.out.println(i);
		}
		System.out.println(i);

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void switchTest() {

		Integer i = null;

		switch(i) {
		case 1:
			System.out.println("case 1");
			System.out.println(i);
			// break;
		case 2:
			System.out.println("case 2");
			System.out.println(i);
		case 3:
			System.out.println("case 3");
			System.out.println(i);
		case 4:
			System.out.println("case 4");
			System.out.println(i);
			break;
		case 5:
			System.out.println("case 5");
			System.out.println(i);
		default:
			System.out.println("default");
			System.out.println(i);
			// break;
		}

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void checkMassiveFunc() {
		// int it = 100;
		BigDecimal it = new BigDecimal(1000);
		BigDecimal sum = new BigDecimal(1);
		for(BigDecimal x = new BigDecimal(0); x.compareTo(it) < 0; x = x.add(new BigDecimal(1))) {
			sum = sum.multiply(new BigDecimal(1).add(x));
		}
		System.out.println(sum);
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void checkSysProps() {

		OperatingSystemMXBean odXb = ManagementFactory.getOperatingSystemMXBean();

		System.out.println(odXb.getAvailableProcessors());
		System.out.println(odXb.getArch());
		System.out.println(odXb.getName());
		System.out.println(odXb.getSystemLoadAverage());
		System.out.println(odXb.getVersion());
		System.out.println();

		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().totalMemory());

		// RuntimeMXBean mml = ManagementFactory.getRuntimeMXBean();
		// System.out.println(mml.getName());
		//
		// for(MemoryPoolMXBean memoryManagerMXBean : mml) {
		// System.out.println(memoryManagerMXBean.getName());
		// }
	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void checkArrays() {

		int[][] testArray;

		testArray = new int[2][];

		for(int i = 0; i < testArray.length; i++) {

			if(i == 0) {

				testArray[i] = new int[4];
			}
			else {
				testArray[i] = new int[9];

			}

		}

		System.out.println(testArray.length);
		for(int[] is : testArray) {
			System.out.println(is.length);

		}

	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void parseDate() {
		// TODO Auto-generated method stub
		Long dateLong = new Date().getTime();
		Integer dateInt = (int)new Date().getTime();

		System.out.println();
	}

	private static void getPatternCheck() {
		//		String w = "19995 - Wydział Podatków";
		String w = "DAW (W-wa Pl. 3 Krzyży)";

		List<String> stringsToCheck = new ArrayList<String>();

		Pattern characterPattern = Pattern.compile("\\d{3,}");

		StringBuilder pwCharsOnly = new StringBuilder();

		// Strip out all characters except A-Z and remove capitalization.
		Matcher matcher = characterPattern.matcher(w.toLowerCase());
		while(matcher.find()) {
			String group = matcher.group();
			if(group.length() >= 4) {
				stringsToCheck.add(group);
			}

			pwCharsOnly.append(matcher.group());
		}
		System.out.println(pwCharsOnly);

	}

	private static void getWordsFromString(String sSentence) {
		String w = "19995 - Wydział Podatków";
		//		String w = "DAW (W-wa Pl. 3 Krzyży)";

		List<String> stringsToCheck = new ArrayList<String>();
		List<String> wordsToCheckInDB = new ArrayList<String>();

		Pattern characterPattern = Pattern.compile("\\b\\d ");

		String password = "12KuDupaKk";

		StringBuilder pwCharsOnly = new StringBuilder();

		// Strip out all characters except A-Z and remove capitalization.
		Matcher matcher = characterPattern.matcher(w.toLowerCase());
		while(matcher.find()) {
			String group = matcher.group();
			if(group.length() >= 4) {
				stringsToCheck.add(group);
			}

			pwCharsOnly.append(matcher.group());
		}
		System.out.println(pwCharsOnly);

		Integer liczbaPodslow = 0;

		for(String string : stringsToCheck) {

			int pwLength = string.length();
			int strWidth = 4;
			int position = 0;
			String compareStr = null;
			while(strWidth < pwLength) {

				position = 0;
				while((position + strWidth) <= pwLength) {

					compareStr = string.substring(position, (position + strWidth));
					wordsToCheckInDB.add(compareStr);
					liczbaPodslow++;

					position++;
				}

				// Increase the width of the word now
				strWidth++;
			}
		}

		System.err.println("Liczba stringow do sprawdzenia: " + liczbaPodslow + " przy dlugosci hasla=" + password.length());

		// String sSentence = "The quick brown fox jumped over the lazy dog.";
		// Pattern p = Pattern.compile("\\d+");
		// String[] result = p.split(sSentence);
		// System.out.println(sSentence);

		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("(");
		for(String string : wordsToCheckInDB) {
			queryBuilder.append("'" + string + "', ");
		}

		queryBuilder.replace(queryBuilder.length() - 2, queryBuilder.length(), "");

		queryBuilder.append(")");

		queryBuilder.toString();
		// TODO Auto-generated method stub

	}

	/**
	 * checking null value into string
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void stringTest() {

		Object ob = null;

		ob = "kuku";

		System.out.println(ob);
		System.out.println(String.valueOf(ob));
		System.out.println(ob.toString());

		String email = "kuku@mail.pl";
		//		if(email.contains(";")){
		System.out.println(email);
		email = email.replaceAll(";", "");
		System.out.println(email);
		//		}

	}

	/**
	 * sprawdza roznice pomiedzy ArrayList a LinkedList
	 * 
	 * @author Mariusz Lewandowski; byMario
	 */
	private static void checkListImpl() {

		List<Integer> aL = new ArrayList<Integer>();
		List<Integer> lL = new LinkedList<Integer>();

		for(int i = 0; i < 5; i++) {
			aL.add(i);
			lL.add(i);
		}
		aL.add(9);
		lL.add(9);

		aL.add(9);
		lL.add(9);

		aL.add(10);
		lL.add(10);

		aL.remove(5);
		lL.remove(5);

		aL.add(11);
		lL.add(11);

		for(Iterator iterator = aL.iterator(); iterator.hasNext();) {
			Integer integer = (Integer)iterator.next();
			// if(integer.equals(4)){
			// iterator.remove();
			// }
			// iterator.

		}

		for(Iterator iterator = lL.iterator(); iterator.hasNext();) {
			Integer integer = (Integer)iterator.next();
			if(integer.equals(4)) {
				integer = new Integer(999);
				iterator.remove();

			}
		}
	}

	public int addTwoNumbers(int a, int b) {
		return a + b;
	}

//	public static void jatha() {
//		try {
//
//			Jatha lisp = new Jatha(false, false);
//			lisp.init();
//			lisp.start();
//			System.out.println(lisp.findPackage("CL-USER"));
//			System.out.println(lisp.allPackages());
//			LispValue symbol1 = lisp.parse("FOO", LispParser.PRESERVE);
//
//			LispValue foo1 = lisp.makeInteger(7);
//
//			// String input = "(* 5 10)";
//			// LispValue result = myLisp.eval(input);
//			// System.out.println(input + " = " + result);
//			// System.out.println(myLisp.eval("(let ((x 7)) (* 5 x)))"));
//			// System.out.println(myLisp.eval("(progn (setq x 7) (* 5 x))"));
//			System.out.println(lisp.eval("(setq x 7)"));
//			System.out.println(lisp.eval("(* 5 x)"));
//
//			LispValue file = lisp.makeString("D:\\Dropbox\\LISP\\sentenceGenerator.lisp");
//			LispValue rez1 = lisp.load(file);
//
//			System.out.println(rez1.toString());
//
//		}
//		catch(EOFException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	private static void mySqlTest() {

		String dbtime;
		String dbUrl = "jdbc:mysql://localhost:3306/words?user=root&password=xsed";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "Select count(*) FROM all_words";

		String findTablesQ = "SELECT DISTINCT * FROM INFORMATION_SCHEMA.COLUMNS";
		findTablesQ += " WHERE  TABLE_SCHEMA='words'";

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()) {
				// rs.
				for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					LOGGER.info(dbtime = rs.getString(i));
				}
				// LOGGER.info(dbtime = rs.getString(1));

				// LOGGER.info(dbtime + rs.getString(2));
			}

			con.close();
		}

		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch(SQLException e) {
			e.printStackTrace();
		}

	}

	protected Logger getLogger() {
		return LOGGER;
	}

	public static void regExpCheck() {

		String zdanie = "NIP 0123456789 \n Nr umowy 10174";
		String zdanie1 = "NIP 0123456789";
		String zdanie2 = "1234567/1";

		String patternString = "\\w{3} \\d{10} [ \\t\\r\\n ]Nr umowy[ \\t\\r\\n ]*[\\w]+|[\\d]{5}|[\\d]{1,5}[A-Z]{2,3}";
//		String patternString = "\\w{3} \\d{10}";
		Pattern pat = Pattern.compile(patternString);

		Matcher m = pat.matcher(zdanie);
		System.out.println(zdanie);
		if(m.matches()) {
			System.out.println("pasuje");
		}
		else {
			System.out.println("NIE pasuje");

		}
		m = pat.matcher(zdanie1);
		System.out.println(zdanie1);

		if(m.matches()) {
			System.out.println("pasuje");
		}
		else {
			System.out.println("NIE pasuje");

		}
//		m = pat.matcher(zdanie2);
//		System.out.println(zdanie2);
//
//		if(m.matches()) {
//			System.out.println("pasuje");
//		}
//		else {
//			System.out.println("NIE pasuje");
//
//		}
	}

	public static void testList() {

		List<Integer> intList = new ArrayList<Integer>();
		Set<Integer> intSet = new HashSet<Integer>();

		for(int i = 0; i < 10; i++) {
			intList.add(i);
			intSet.add(i);
		}

		System.out.println(intList.size());
		System.out.println(intSet.size());

		intList.add(2);
		intSet.add(3);

		System.out.println(intList.size());
		System.out.println(intSet.size());
	}

	static void checkLoopBreak() {

		for(int i = 0; i < 20; i++) {

			for(int j = 0; j < 20; j++) {
				System.out.print(j + " ");
				if(j == 10) break;
			}

			System.out.println(i + " ");
		}
	}

	static void listContainsCheck() {

		List<Integer> intList = new ArrayList<Integer>();

		intList.add(new Integer(1));
		intList.add(new Integer(2));
		intList.add(new Integer(3));

		Integer integerToCheck = new Integer(6);
		int intToCheck = 4;

		System.out.println(intList.contains(integerToCheck));
		System.out.println(intList.contains(intToCheck));

	}

	public static void checkMapInsertion() {

		// check if when put same key with different value replaces record
		Map<Integer, String[]> testMap = new HashMap<>();

		testMap.put(1, new String[] { "one" });
		testMap.put(2, new String[] { "two" });
		testMap.put(3, null);

		//		testMap.put(1, null);
		testMap.put(3, new String[] { "three" });

		checkMapInsertion2(testMap.get(1));
		checkMapInsertion2(testMap.get(2));
		checkMapInsertion2(testMap.get(3));
		//		checkMapInsertion2(testMap.get(4));

		System.out.println(testMap.get(1));
		System.out.println(testMap.get(2));
		System.out.println(testMap.get(3));
		System.out.println(testMap.get(4));

	}

	public static void checkMapInsertion2(String[] s) {

		s[0] = "secondMeth";

	}

	public static Float getRandomFloat() {

		// devided by 10 because we need as small weight as possible
		return (float)(Math.random() - 0.5) / 10;

	}

	private static Double getRandomDouble() {

		// devided by 10 because we need as small weight as possible
		return (Math.random() - 0.5) / 10;

	}

}
