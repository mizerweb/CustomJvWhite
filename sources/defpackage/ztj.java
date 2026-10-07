package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ztj {
    public final String a;
    public final boolean b;
    public final koj c;

    public ztj(String str, boolean z, koj kojVar) {
        this.a = str;
        this.b = z;
        this.c = kojVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztj)) {
            return false;
        }
        ztj ztjVar = (ztj) obj;
        return cqk.d(this.a, ztjVar.a) && this.b == ztjVar.b && this.c.equals(ztjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("WebViewContainerState(title=", this.a, ", isVerified=", ", loadingState=", this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
