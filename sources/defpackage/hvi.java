package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hvi {
    public static final byte[] a = {48, 49, 53, 0};
    public static final byte[] b = {48, 49, 48, 0};
    public static final byte[] c = {48, 48, 57, 0};
    public static final byte[] d = {48, 48, 53, 0};
    public static final byte[] e = {48, 48, 49, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 50, 0};

    public static final String a(Object obj) {
        if (gm0.c()) {
            return obj.toString();
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            return collection.isEmpty() ? "[]" : c0a.k(collection.size(), "[**", "**]");
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            return objArr.length == 0 ? "[]" : c0a.k(objArr.length, "[**", "**]");
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return iArr.length == 0 ? "[]" : c0a.k(iArr.length, "[**", "**]");
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            return fArr.length == 0 ? "[]" : c0a.k(fArr.length, "[**", "**]");
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            return jArr.length == 0 ? "[]" : c0a.k(jArr.length, "[**", "**]");
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            return dArr.length == 0 ? "[]" : c0a.k(dArr.length, "[**", "**]");
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            return sArr.length == 0 ? "[]" : c0a.k(sArr.length, "[**", "**]");
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return bArr.length == 0 ? "[]" : c0a.k(bArr.length, "[**", "**]");
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            return cArr.length == 0 ? "[]" : c0a.k(cArr.length, "[**", "**]");
        }
        if (!(obj instanceof boolean[])) {
            return "***";
        }
        boolean[] zArr = (boolean[]) obj;
        return zArr.length == 0 ? "[]" : c0a.k(zArr.length, "[**", "**]");
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbV = qt4.v("<", str2, " threw ");
                    sbV.append(e2.getClass().getName());
                    sbV.append(">");
                    string = sbV.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
