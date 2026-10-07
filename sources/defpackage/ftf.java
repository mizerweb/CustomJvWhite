package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ftf extends itf {
    public final String a;
    public final tnh b;

    public ftf(String str, tnh tnhVar) {
        this.a = str;
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftf)) {
            return false;
        }
        ftf ftfVar = (ftf) obj;
        return cqk.d(this.a, ftfVar.a) && this.b.equals(ftfVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
