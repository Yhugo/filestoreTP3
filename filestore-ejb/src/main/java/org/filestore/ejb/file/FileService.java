package org.filestore.ejb.file;

import java.io.InputStream;
import java.util.List;

import org.filestore.ejb.file.entity.FileItem;

public interface FileService {

	String postFile(String owner, List<String> receivers, String message, String name, byte[] data) throws FileServiceException;

	String postFile(String owner, List<String> receivers, String message, String name, InputStream stream) throws FileServiceException ;

	FileItem getFile(String id) throws FileServiceException;

	byte[] getWholeFileContent(String id) throws FileServiceException;

	InputStream getFileContent(String id) throws FileServiceException;

	void deleteFile(String id) throws FileServiceException;

}
