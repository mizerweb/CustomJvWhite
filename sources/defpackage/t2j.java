package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t2j {
    public final String a;
    public final ih0 b;

    public t2j(String str, ih0 ih0Var) {
        this.a = str;
        this.b = ih0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2j)) {
            return false;
        }
        t2j t2jVar = (t2j) obj;
        return this.a.equals(t2jVar.a) && cqk.d(this.b, t2jVar.b);
    }

    public final int hashCode() {
        int iC = zo5.c(-1, this.a.hashCode() * 31, 31);
        ih0 ih0Var = this.b;
        return iC + (ih0Var == null ? 0 : ih0Var.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo(mimeType=" + this.a + ", profile=-1, compatibleVideoProfile=" + this.b + ')';
    }
}
