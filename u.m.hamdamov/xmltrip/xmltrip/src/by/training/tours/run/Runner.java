package by.training.tours.run;

import java.io.IOException;
import java.util.List;

import by.training.tours.entity.Vaucher;
import by.training.tours.xml.VaucherXmlReader;
import by.training.tours.xml.VaucherXmlValidator;

public class Runner {
    public static final String XML_FILE_NAME = "data/vauchers.xml";
   
	public static void main(String[] args) throws IOException {
		VaucherXmlValidator validator = new VaucherXmlValidator(XML_FILE_NAME);
		if(validator.validate()) {
			VaucherXmlReader reader = new VaucherXmlReader();
			List<Vaucher> vauchers = reader.read(XML_FILE_NAME);
			for(Vaucher vaucher : vauchers) {
				System.out.println(vaucher);
			}
		} else {
			System.out.println(validator.getError());
		}
	}
}
