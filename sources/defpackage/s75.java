package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s75 {
    public final String a;
    public final boolean b;

    public s75(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s75)) {
            return false;
        }
        s75 s75Var = (s75) obj;
        return cqk.d(this.a, s75Var.a) && this.b == s75Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewCacheKey(attachId=" + this.a + ", blurred=" + this.b + ")";
    }
}
