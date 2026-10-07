package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l9 {
    public final String a;
    public final dz4 b;
    public final enc c;
    public final be1 d;
    public final k52 e;

    public l9(String str, dz4 dz4Var, enc encVar, be1 be1Var, k52 k52Var) {
        this.a = str;
        this.b = dz4Var;
        this.c = encVar;
        this.d = be1Var;
        this.e = k52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return cqk.d(this.a, l9Var.a) && cqk.d(this.b, l9Var.b) && cqk.d(this.c, l9Var.c) && cqk.d(this.d, l9Var.d) && cqk.d(this.e, l9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActiveSessionState(sessionId=" + this.a + ", callInfo=" + this.b + ", participants=" + this.c + ", chatInfo=" + this.d + ", userState=" + this.e + ")";
    }
}
