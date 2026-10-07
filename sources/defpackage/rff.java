package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rff implements tff {
    public final jef a;
    public final int b;

    public rff(jef jefVar, int i) {
        this.a = jefVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff)) {
            return false;
        }
        rff rffVar = (rff) obj;
        return cqk.d(this.a, rffVar.a) && this.b == rffVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
