package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fs8 implements hs8 {
    public final String a;
    public final String b;
    public final boolean c;

    public fs8(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs8)) {
            return false;
        }
        fs8 fs8Var = (fs8) obj;
        return cqk.d(this.a, fs8Var.a) && cqk.d(this.b, fs8Var.b) && this.c == fs8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(qv1.q("JsEvent(name=", this.a, ", data=", this.b, ", isPrivateEvent="), this.c, ")");
    }
}
