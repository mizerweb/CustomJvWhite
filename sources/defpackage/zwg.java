package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zwg implements bxg {
    public final String a;
    public final int b;
    public final long c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final i6a g;
    public final String h;
    public final String i;

    public zwg(int i, long j, ArrayList arrayList, int i2, int i3, i6a i6aVar, String str, String str2, int i4) {
        i6aVar = (i4 & 64) != 0 ? null : i6aVar;
        str = (i4 & np0.m) != 0 ? null : str;
        this.a = "";
        this.b = i;
        this.c = j;
        this.d = arrayList;
        this.e = i2;
        this.f = i3;
        this.g = i6aVar;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.bxg
    public final List a() {
        return this.d;
    }

    @Override // defpackage.bxg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bxg
    public final long c() {
        return this.c;
    }

    @Override // defpackage.bxg
    public final i6a d() {
        return this.g;
    }

    @Override // defpackage.bxg
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwg)) {
            return false;
        }
        zwg zwgVar = (zwg) obj;
        return this.a.equals(zwgVar.a) && this.b == zwgVar.b && this.c == zwgVar.c && this.d.equals(zwgVar.d) && this.e == zwgVar.e && this.f == zwgVar.f && cqk.d(this.g, zwgVar.g) && cqk.d(this.h, zwgVar.h) && cqk.d(this.i, zwgVar.i);
    }

    @Override // defpackage.bxg
    public final int f() {
        return this.f;
    }

    @Override // defpackage.bxg
    public final int g() {
        return this.e;
    }

    @Override // defpackage.bxg
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        int iC = zo5.c(this.f, zo5.c(this.e, x05.b(this.d, qt4.g(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31);
        i6a i6aVar = this.g;
        int iHashCode = (iC + (i6aVar == null ? 0 : i6aVar.hashCode())) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final String toString() {
        String strK;
        boolean zC = gm0.c();
        String strK2 = "***";
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
        String strE = v1h.e(this.b);
        int size = this.d.size();
        Object obj2 = this.h;
        if (obj2 == null) {
            strK2 = "empty";
        } else {
            if (gm0.c()) {
                strK2 = obj2.toString();
            } else if (obj2 instanceof Collection) {
                Collection collection2 = (Collection) obj2;
                if (collection2.isEmpty()) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(collection2.size(), "[**", "**]");
                }
            } else if (obj2 instanceof Map) {
                Map map2 = (Map) obj2;
                strK2 = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
            } else if (obj2 instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj2;
                if (objArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(objArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof int[]) {
                int[] iArr2 = (int[]) obj2;
                if (iArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(iArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof float[]) {
                float[] fArr2 = (float[]) obj2;
                if (fArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(fArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof long[]) {
                long[] jArr2 = (long[]) obj2;
                if (jArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(jArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof double[]) {
                double[] dArr2 = (double[]) obj2;
                if (dArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(dArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr2 = (short[]) obj2;
                if (sArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(sArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj2;
                if (bArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(bArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof char[]) {
                char[] cArr2 = (char[]) obj2;
                if (cArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(cArr2.length, "[**", "**]");
                }
            } else if (obj2 instanceof boolean[]) {
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr2.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(zArr2.length, "[**", "**]");
                }
            }
            if (strK2 == null) {
                strK2 = "empty";
            }
        }
        StringBuilder sbQ = qv1.q("\n                Text(\n                    path='", strK, "',\n                    settings=", strE, ",\n                    expirationMs=");
        c0a.w(sbQ, this.c, ",\n                    layers=", size);
        zo5.C(this.e, this.f, ",\n                    canvasWidth=", ",\n                    canvasHeight=", sbQ);
        nbh.G(sbQ, ",\n                    previewPath='", strK2, "',\n                    backgroundName=", this.i);
        sbQ.append("\n                )\n            ");
        return s5h.x0(sbQ.toString());
    }
}
