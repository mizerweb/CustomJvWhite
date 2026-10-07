package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class us2 extends e48 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final e48[] f;

    public us2(String str, boolean z, boolean z2, String[] strArr, e48[] e48VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = e48VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || us2.class != obj.getClass()) {
            return false;
        }
        us2 us2Var = (us2) obj;
        return this.c == us2Var.c && this.d == us2Var.d && this.b.equals(us2Var.b) && Arrays.equals(this.e, us2Var.e) && Arrays.equals(this.f, us2Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
