package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mkd {
    public final lkd a;
    public final boolean b;

    public mkd(lkd lkdVar, boolean z) {
        this.a = lkdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkd)) {
            return false;
        }
        mkd mkdVar = (mkd) obj;
        return this.a.equals(mkdVar.a) && this.b == mkdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarState(title=" + this.a + ", menuAvailable=" + this.b + ")";
    }
}
