package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sod extends vod {
    public final tnh a;
    public final int b;
    public final i8c c;

    public sod(tnh tnhVar, int i, i8c i8cVar) {
        this.a = tnhVar;
        this.b = i;
        this.c = i8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sod)) {
            return false;
        }
        sod sodVar = (sod) obj;
        return this.a.equals(sodVar.a) && this.b == sodVar.b && this.c.equals(sodVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
