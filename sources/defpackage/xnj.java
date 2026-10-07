package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xnj implements ynj {
    public final String[] a;
    public final int[] b;

    public xnj(String[] strArr, int[] iArr) {
        this.a = strArr;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xnj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xnj xnjVar = (xnj) obj;
        return Arrays.equals(this.a, xnjVar.a) && Arrays.equals(this.b, xnjVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.w("VerifyCameraPermission(permissions=", Arrays.toString(this.a), ", grantResults=", Arrays.toString(this.b), ")");
    }
}
