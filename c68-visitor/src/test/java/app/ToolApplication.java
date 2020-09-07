package app;

import java.util.ArrayList;
import java.util.List;

/**
 * ToolApplication
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class ToolApplication {

    public static void main(String[] args) {
        String dir = "/a/b/c";
        List<ResourceFile> resourceFiles = listAllResourceFiles(dir);

        Extractor extractor = new Extractor();
        for (ResourceFile file : resourceFiles) {
            file.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile file : resourceFiles) {
            file.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDir) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new PptFile("b.ppt"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }

}
