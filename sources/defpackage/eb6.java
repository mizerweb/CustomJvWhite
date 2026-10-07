package defpackage;

import android.util.Range;
import android.util.Rational;

/* JADX INFO: loaded from: classes2.dex */
public final class eb6 {
    public final boolean a;
    public final int b;
    public final Range c;
    public final Rational d;

    public eb6(boolean z, int i, Range range, Rational rational) {
        this.a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb6)) {
            return false;
        }
        eb6 eb6Var = (eb6) obj;
        return this.a == eb6Var.a && this.b == eb6Var.b && cqk.d(this.c, eb6Var.c) && cqk.d(this.d, eb6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}
