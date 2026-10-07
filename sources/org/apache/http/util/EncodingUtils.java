package org.apache.http.util;

import defpackage.ore;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class EncodingUtils {
    private EncodingUtils() {
    }

    public static byte[] getAsciiBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        }
        ore.p("Parameter may not be null");
        return null;
    }

    public static String getAsciiString(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                return new String(bArr, i, i2, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        }
        ore.p("Parameter may not be null");
        return null;
    }

    public static byte[] getBytes(String str, String str2) {
        if (str == null) {
            ore.p("data may not be null");
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            ore.p("charset may not be null or empty");
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String getString(byte[] bArr, int i, int i2, String str) {
        if (bArr == null) {
            ore.p("Parameter may not be null");
            return null;
        }
        if (str == null || str.length() == 0) {
            ore.p("charset may not be null or empty");
            return null;
        }
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i, i2);
        }
    }

    public static String getAsciiString(byte[] bArr) {
        if (bArr != null) {
            return getAsciiString(bArr, 0, bArr.length);
        }
        ore.p("Parameter may not be null");
        return null;
    }

    public static String getString(byte[] bArr, String str) {
        if (bArr != null) {
            return getString(bArr, 0, bArr.length, str);
        }
        ore.p("Parameter may not be null");
        return null;
    }
}
