package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cb4 extends mk0 {
    public final String b;
    public final fgd c;

    public cb4(String str, fgd fgdVar) {
        super(6);
        this.b = str;
        this.c = fgdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb4)) {
            return false;
        }
        cb4 cb4Var = (cb4) obj;
        return cqk.d(this.b, cb4Var.b) && this.c.equals(cb4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
