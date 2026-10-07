package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class anh {
    public final noh a;
    public final int b;
    public final bx5 c;

    public anh(noh nohVar, int i, bx5 bx5Var) {
        this.a = nohVar;
        this.b = i;
        this.c = bx5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anh)) {
            return false;
        }
        anh anhVar = (anh) obj;
        return this.a.equals(anhVar.a) && this.b == anhVar.b && this.c == anhVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TextPaintCacheKey(textStyle=" + this.a + ", textColor=" + this.b + ", dynamicFont=" + this.c + ")";
    }
}
