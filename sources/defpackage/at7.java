package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class at7 {
    public final String a;
    public final it7 b;
    public final String c;

    public at7(String str, it7 it7Var, String str2) {
        this.a = str;
        this.b = it7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at7)) {
            return false;
        }
        at7 at7Var = (at7) obj;
        return cqk.d(this.a, at7Var.a) && this.b == at7Var.b && cqk.d(this.c, at7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(conversationId=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", internalParams=");
        return zo5.w(sb, this.c, ")");
    }
}
