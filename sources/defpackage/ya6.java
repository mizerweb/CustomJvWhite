package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class ya6 {
    public static final ua6 Companion = new ua6();
    public final String a;
    public final xa6 b;

    public /* synthetic */ ya6(int i, String str, xa6 xa6Var) {
        if (3 != (i & 3)) {
            shl.b(i, 3, ta6.a.d());
            throw null;
        }
        this.a = str;
        this.b = xa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya6)) {
            return false;
        }
        ya6 ya6Var = (ya6) obj;
        return cqk.d(this.a, ya6Var.a) && cqk.d(this.b, ya6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public ya6(String str, xa6 xa6Var) {
        this.a = str;
        this.b = xa6Var;
    }
}
