package pl.byMario.playground;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

//import org.apache.commons.io.output.FileWriterWithEncoding;
import org.apache.log4j.Logger;
//import org.mozilla.universalchardet.UniversalDetector;
//import org.xhtmlrenderer.pdf.ITextRenderer;

import com.artofsolving.jodconverter.DefaultDocumentFormatRegistry;
import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.DocumentFormat;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
//import com.lowagie.text.DocumentException;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ConvertUtil {

	private static final Logger LOGGER = Logger.getLogger(ConvertUtil.class);

	public static void main(String[] argv) {
//		 String inPath = "C:\\maile\\read\\1.txt";
//		String inPath = "C:\\maile\\read\\1.html";
		 String inPath = "C:\\maile\\read\\1.doc";

		String outPath = "C:\\maile\\converted\\2.pdf";

		File inF = new File(inPath);
		File outF = new File(outPath);

		try {
			OutputStream outBA1 = new FileOutputStream(outF);
			OutputStream outBA = new FileOutputStream(outF);
			// OutputStream outBA3 = new FileOutputStream(outF3);
			// Writer o = new BufferedWriter(new OutputStreamWriter(outBA3,
			// "UTF8"));
			// Writer out = new OutputStreamWriter(outBA1, "UTF8");
			// out.write(sb.toString());
			// out.close();
			//
			// return baosss.toByteArray();

			 convertToPdf(inF, outBA);
//			genPDFdoc(inF, outBA);
			 
			

			// o.write(aString);
			// o.flush();
			// o.close();
			// outBA.flush();
			// outBA.close();

		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public static void genPDFdoc(File sourceF, OutputStream outputStream) {
//
//		try {
//			// String HTMLpageUrl = "http://localhost:8080/PDF/strona.html"; //
//			// URL strony renderowanej .
//			String PDFdoc = "C:\\ConvertedFile.pdf"; // Wyjściowy plik PDF
//			// OutputStream os = new FileOutputStream(PDFdoc);
//			ITextRenderer renderer = new ITextRenderer();
//			renderer.setDocument(sourceF);
//			renderer.layout();
//			renderer.createPDF(outputStream);
//		}
//		catch(IOException | DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// os.close();
//	}

	/**
	 * 
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	private static void convertToPdf(File fileToConvert, OutputStream outputStream) {

		ByteArrayInputStream inBAInputStream = null;
		// OutputStream outputStream = null;
		OpenOfficeConnection connection = null;

		String[] fileNameExt = fileToConvert.getName().split("\\.");
		String fileName = fileNameExt[0];
		String fileExt = fileNameExt[1];

		try {

			byte[] inByteArr = Files.readAllBytes(fileToConvert.toPath());

			if("txt".equalsIgnoreCase(fileExt) || "html".equalsIgnoreCase(fileExt)) {
//				String encoding = getEncoding(inByteArr);

				// if("cp1250".equals(encoding)) {
//				inByteArr = convertCp1250ToUtf8(inByteArr);
				// }
			}

			inBAInputStream = new ByteArrayInputStream(inByteArr);
			// outputStream = new FileOutputStream(fileName + ".pdf");

			// connect to an OpenOffice.org instance running on port 8100
			connection = new SocketOpenOfficeConnection(8100);
			connection.connect();

			// convert
			DocumentConverter converter = new OpenOfficeDocumentConverter(connection);

			DefaultDocumentFormatRegistry inDFr = new DefaultDocumentFormatRegistry();
			LOGGER.info("CONVERTING FILE: " + fileName + " FROM ." + fileExt + " TO PDF ...");

			// Writer out = null;
			// ByteArrayOutputStream baosss = new ByteArrayOutputStream();
			// out = new OutputStreamWriter(baosss, "UTF8");
			// out.write(sb.toString());
			// out.close();
			//
			// return baosss.toByteArray();

			converter.convert(inBAInputStream, inDFr.getFormatByFileExtension(fileExt), outputStream, inDFr.getFormatByFileExtension("pdf"));
			// converter.convert(in, out);

			// outputStream.flush();
			// outputStream.close();
			inBAInputStream.close();

			connection.disconnect();
			LOGGER.info("FILE CONVERTED! ");

			 toBW(fileToConvert);
			 
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

		// return outputStream;
	}
	
	public static void toBW(File org){
		
		try 
        {
         BufferedImage original = ImageIO.read(org);
         BufferedImage binarized = new BufferedImage(original.getWidth(), original.getHeight(),BufferedImage.TYPE_BYTE_BINARY);

		 String outPath3 = "C:\\maile\\converted\\3.pdf";
         File outF3 = new File(outPath3);
         
         int red;
         int newPixel;
         int threshold =230;

            for(int i=0; i<original.getWidth(); i++) 
            {
                for(int j=0; j<original.getHeight(); j++)
                {

                    // Get pixels
                  red = new Color(original.getRGB(i, j)).getRed();

                  int alpha = new Color(original.getRGB(i, j)).getAlpha();

                  if(red > threshold)
                    {
                        newPixel = 0;
                    }
                    else
                    {
                        newPixel = 255;
                    }
                    newPixel = colorToRGB(alpha, newPixel, newPixel, newPixel);
                    binarized.setRGB(i, j, newPixel);

                }
            } 
            ImageIO.write(binarized, "png",outF3 );
         }
        catch (IOException e) 
        {
                e.printStackTrace();
        }    
		
	}
	
	 private static int colorToRGB(int alpha, int red, int green, int blue) {
         int newPixel = 0;
         newPixel += alpha;
         newPixel = newPixel << 8;
         newPixel += red; newPixel = newPixel << 8;
         newPixel += green; newPixel = newPixel << 8;
         newPixel += blue;

         return newPixel;
     }

//	private static String getEncoding(byte[] bytes) throws java.io.IOException {
//		byte[] buf = new byte[4096];
//		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//
//		UniversalDetector detector = new UniversalDetector(null);
//
//		int nread;
//		while((nread = bais.read(buf)) > 0 && !detector.isDone()) {
//			detector.handleData(buf, 0, nread);
//		}
//
//		detector.dataEnd();
//
//		String encoding = detector.getDetectedCharset();
//
//		System.out.println(encoding);
//		// if(encoding == null || "WINDOWS-1252".equals(encoding)) {
//		// encoding = "cp1250";
//		// }
//		detector.reset();
//		return encoding;
//	}

	private static byte[] convertCp1250ToUtf8(byte[] stringBytesCp1250) {
		StringBuilder sb = new StringBuilder();
		String inputLine;
		BufferedReader br = null;
		Writer out = null;

		try {
			br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(stringBytesCp1250), "UTF8"));
			while((inputLine = br.readLine()) != null) {
				sb.append(inputLine).append("\n");
			}

			ByteArrayOutputStream baosss = new ByteArrayOutputStream();
			out = new OutputStreamWriter(baosss, "ISO-8859-2");
			out.write(sb.toString());
			out.close();

			return baosss.toByteArray();

			// br = new BufferedReader(new InputStreamReader(new
			// ByteArrayInputStream(baosss.toByteArray()), "cp1250"));
			// while((inputLine = br.readLine()) != null) {
			// sb.append(inputLine).append("\n");
			// }
			//
			// ByteArrayOutputStream baosss1 = new ByteArrayOutputStream();
			// out = new OutputStreamWriter(baosss1, "ISO-8859-13");
			// out.write(sb.toString());
			// out.close();
			//
			// return baosss1.toByteArray();
		}
		catch(Exception e) {
			e.printStackTrace();
			return stringBytesCp1250;
		}
		finally {
			if(br != null) {
				try {
					br.close();
				}
				catch(IOException e1) {
					e1.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				}
				catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
