package main.java.marines.strategy;

import java.io.File;
import java.util.List;

/**
 * Strategy
 * 
 * @author Marines Lopez Soliz
 */
public interface CompressionStrategy {
	public void compressFiles(List<File> files);
}
