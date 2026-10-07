package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xcd {
    public final CharSequence a;
    public final String[] b;

    public xcd(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static final xcd a() {
        return new xcd("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcd)) {
            return false;
        }
        xcd xcdVar = (xcd) obj;
        if (cqk.d(this.a, xcdVar.a)) {
            return Arrays.equals(this.b, xcdVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final String toString() {
        String strK;
        boolean zC = gm0.c();
        Object obj = this.a;
        if (zC) {
            strK = obj.toString();
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                strK = "[]";
            } else {
                strK = c0a.k(collection.size(), "[**", "**]");
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(objArr.length, "[**", "**]");
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(iArr.length, "[**", "**]");
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(fArr.length, "[**", "**]");
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(jArr.length, "[**", "**]");
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            if (dArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(dArr.length, "[**", "**]");
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            if (sArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(sArr.length, "[**", "**]");
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(bArr.length, "[**", "**]");
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (cArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(cArr.length, "[**", "**]");
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(zArr.length, "[**", "**]");
            }
        } else {
            strK = "***";
        }
        return c0a.l(this.b.length, "PreProcessedText{text=", strK, ", tokens=", "}");
    }
}
