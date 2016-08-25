package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Http.*;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Http.RawBuffer;
import play.mvc.Result;
import views.html.fileupload.*;

public class FileUpload extends Controller {
	public static Result showUploadPage() {
		Logger.debug("@C FileUpload -->> showUploadPage() -->> ");
		return ok(showFormUploadPage.render());
	}

	public static Result UploadForm() {
		Logger.debug("@C FileUpload -->> UploadForm() -->> ");
		
		MultipartFormData body = request().body().asMultipartFormData();
		Logger.debug("@C FileUpload -->> UploadForm() -->> Body : " + body);
		//List<FilePart> files = body.getFiles();

		/*for (int i = 0; i < files.size(); i++) {
			Logger.debug("@C FileUpload -->> UploadForm() -->> file name " +  files.get(i).getFilename());

			String targetPath = "/home/roots/web/tomcat8/webapps/pdfs/" + files.get(i).getFilename();
			files.get(i).getFile().renameTo(new File(targetPath));
			System.out.println("target path : "+targetPath);
			System.out.println(i);

		}
		Logger.debug("@C FileUpload -->> UploadForm() -->> " + files.size()
				+ "," + files);*/
		return ok("success");

	}
	

}
