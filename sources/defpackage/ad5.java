package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class ad5 {
    public static final zc5 Companion = new zc5();
    public static final ny8[] e = {null, null, null, rx8.P(2, new i94(13))};
    public static final ad5 f = new ad5();
    public final boolean a;
    public final int b;
    public final boolean c;
    public final List d;

    public /* synthetic */ ad5(int i, boolean z, int i2, boolean z2, List list) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = 8;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = r66.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5)) {
            return false;
        }
        ad5 ad5Var = (ad5) obj;
        return this.a == ad5Var.a && this.b == ad5Var.b && this.c == ad5Var.c && cqk.d(this.d, ad5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nbh.n(zo5.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "DefaultReactionsSettings(isActive=" + this.a + ", count=" + this.b + ", included=" + this.c + ", reactionIds=" + this.d + ")";
    }

    public ad5() {
        this.a = true;
        this.b = 8;
        this.c = false;
        this.d = r66.a;
    }
}
