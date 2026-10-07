package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cef extends eef {
    public final String b;
    public final long c;
    public final int d;

    public cef(String str, long j, int i) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.eef
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cef)) {
            return false;
        }
        cef cefVar = (cef) obj;
        return cqk.d(this.b, cefVar.b) && this.c == cefVar.c && this.d == cefVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qt4.g(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return qv1.o(nbh.B(this.c, "Neuro(uri=", this.b, ", photoId="), ", categoryId=", this.d, ")");
    }
}
