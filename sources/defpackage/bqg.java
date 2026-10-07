package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bqg {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final i64 d;

    public bqg(ArrayList arrayList, int i, int i2, i64 i64Var) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqg) {
            bqg bqgVar = (bqg) obj;
            return this.a.equals(bqgVar.a) && this.b == bqgVar.b && this.c == bqgVar.c && this.d == bqgVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CaptureRequest(captureConfigs=" + this.a + ", captureMode=" + this.b + ", flashType=" + this.c + ", result=" + this.d + ')';
    }
}
