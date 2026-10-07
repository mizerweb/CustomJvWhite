package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yi4 implements ej4 {
    public final long a;
    public final boolean b;

    public yi4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4)) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        return this.a == yi4Var.a && this.b == yi4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "HideStoriesConfirmed(contactId=", ", hidden=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
