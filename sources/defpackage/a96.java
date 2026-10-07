package defpackage;

import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a96 {
    public static final ifh a = new ifh(new s35(13));

    public static String a(String str) {
        if (str.length() == 0) {
            return "";
        }
        MessageDigest messageDigest = (MessageDigest) a.getValue();
        if (messageDigest == null) {
            return str;
        }
        messageDigest.update(str.getBytes(pt2.a), 0, str.length());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toLowerCase(Locale.ROOT);
    }
}
