package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rq3 {
    public final String a;
    public final int b;

    public rq3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq3)) {
            return false;
        }
        rq3 rq3Var = (rq3) obj;
        return cqk.d(this.a, rq3Var.a) && this.b == rq3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "TraceLane(name=", this.a, ", index=", ")");
    }
}
