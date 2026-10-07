package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wx8 {
    public final String a;
    public final List b;

    public wx8(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx8)) {
            return false;
        }
        wx8 wx8Var = (wx8) obj;
        return cqk.d(this.a, wx8Var.a) && cqk.d(this.b, wx8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
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
        return "LastInputText(text='" + strK + "', messageElementsData=" + this.b + ")";
    }
}
