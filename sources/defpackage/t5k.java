package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t5k {
    static {
        Pattern.compile("\\p{XDigit}+");
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != length; i++) {
            byte b = bArr[i];
            stringBuffer.append("0123456789abcdef".charAt((b & 255) >> 4));
            stringBuffer.append("0123456789abcdef".charAt(b & 15));
        }
        return stringBuffer.toString();
    }
}
