package com.ctrip.framework.apollo.portal.util;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * jian.tan
 */
public class ConfigToFileUtils {

    public static void itemsToFile(OutputStream os, List<String> items) {
        try {
            PrintWriter printWriter = new PrintWriter(os);
            items.forEach(printWriter::println);
            printWriter.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public static String fileToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        return bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
    }
}
