package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lwa {
    public final jwa[] a;
    public final long b;

    public lwa(List list) {
        this((jwa[]) list.toArray(new jwa[0]));
    }

    public final lwa a(jwa... jwaVarArr) {
        if (jwaVarArr.length == 0) {
            return this;
        }
        String str = vqi.a;
        jwa[] jwaVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(jwaVarArr2, jwaVarArr2.length + jwaVarArr.length);
        System.arraycopy(jwaVarArr, 0, objArrCopyOf, jwaVarArr2.length, jwaVarArr.length);
        return new lwa(this.b, (jwa[]) objArrCopyOf);
    }

    public final lwa b(lwa lwaVar) {
        return lwaVar == null ? this : a(lwaVar.a);
    }

    public final lwa c(long j) {
        return this.b == j ? this : new lwa(j, this.a);
    }

    public final jwa d(int i) {
        return this.a[i];
    }

    public final int e() {
        return this.a.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lwa.class == obj.getClass()) {
            lwa lwaVar = (lwa) obj;
            if (Arrays.equals(this.a, lwaVar.a) && this.b == lwaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return gpk.c(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public lwa(long j, jwa... jwaVarArr) {
        this.b = j;
        this.a = jwaVarArr;
    }

    public lwa(jwa... jwaVarArr) {
        this(-9223372036854775807L, jwaVarArr);
    }

    public lwa(long j, ArrayList arrayList) {
        this(j, (jwa[]) arrayList.toArray(new jwa[0]));
    }
}
