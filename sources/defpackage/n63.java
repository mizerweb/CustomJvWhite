package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n63 {
    public final vg4 a;
    public final int b;
    public final long c;
    public final long d;

    public n63(vg4 vg4Var, int i, long j, long j2) {
        this.a = vg4Var;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n63) {
            n63 n63Var = (n63) obj;
            if (this.a == n63Var.a && this.b == n63Var.b && this.c == n63Var.c && this.d == n63Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(c0a.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChatMember(contact=");
        sb.append(this.a);
        sb.append(", role=");
        int i = this.b;
        if (i == 1) {
            str = "OWNER";
        } else if (i != 2) {
            str = i != 3 ? "null" : "MEMBER";
        } else {
            str = "ADMIN";
        }
        sb.append(str);
        sb.append(", blockedCommentsTime=");
        sb.append(this.c);
        return zo5.k(this.d, ", blockedById=", ")", sb);
    }
}
