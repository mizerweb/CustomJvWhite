package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xdg implements aeg {
    public final String a;
    public final int b;
    public final long c;
    public final wdg d;

    public xdg(String str, int i, long j, wdg wdgVar) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = wdgVar;
    }

    @Override // defpackage.aeg
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdg)) {
            return false;
        }
        xdg xdgVar = (xdg) obj;
        return cqk.d(this.a, xdgVar.a) && this.b == xdgVar.b && this.c == xdgVar.c && this.d == xdgVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qt4.g(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Regular(name=", this.a, ", order=", ", sliceTime=");
        sbR.append(this.c);
        sbR.append(", mergeStrategy=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
