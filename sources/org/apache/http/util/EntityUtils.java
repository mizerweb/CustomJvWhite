package org.apache.http.util;

import defpackage.np0;
import defpackage.ore;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class EntityUtils {
    private EntityUtils() {
    }

    public static String getContentCharSet(HttpEntity httpEntity) throws ParseException {
        NameValuePair parameterByName;
        if (httpEntity == null) {
            ore.p("HTTP entity may not be null");
            return null;
        }
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0 && (parameterByName = elements[0].getParameterByName("charset")) != null) {
                return parameterByName.getValue();
            }
        }
        return null;
    }

    public static byte[] toByteArray(HttpEntity httpEntity) throws IOException {
        if (httpEntity == null) {
            ore.p("HTTP entity may not be null");
            return null;
        }
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return new byte[0];
        }
        if (httpEntity.getContentLength() > 2147483647L) {
            ore.p("HTTP entity too large to be buffered in memory");
            return null;
        }
        int contentLength = (int) httpEntity.getContentLength();
        if (contentLength < 0) {
            contentLength = 4096;
        }
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
        try {
            byte[] bArr = new byte[np0.r];
            while (true) {
                int i = content.read(bArr);
                if (i == -1) {
                    content.close();
                    return byteArrayBuffer.toByteArray();
                }
                byteArrayBuffer.append(bArr, 0, i);
            }
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    public static String toString(HttpEntity httpEntity, String str) throws ParseException, IOException {
        if (httpEntity == null) {
            ore.p("HTTP entity may not be null");
            return null;
        }
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return "";
        }
        if (httpEntity.getContentLength() > 2147483647L) {
            ore.p("HTTP entity too large to be buffered in memory");
            return null;
        }
        int contentLength = (int) httpEntity.getContentLength();
        if (contentLength < 0) {
            contentLength = np0.r;
        }
        String contentCharSet = getContentCharSet(httpEntity);
        if (contentCharSet != null) {
            str = contentCharSet;
        }
        if (str == null) {
            str = "ISO-8859-1";
        }
        InputStreamReader inputStreamReader = new InputStreamReader(content, str);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength);
        try {
            char[] cArr = new char[1024];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    inputStreamReader.close();
                    return charArrayBuffer.toString();
                }
                charArrayBuffer.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    public static String toString(HttpEntity httpEntity) throws ParseException, IOException {
        return toString(httpEntity, null);
    }
}
