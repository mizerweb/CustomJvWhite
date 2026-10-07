package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m5d {
    public final int a;
    public final int b;
    public final u8b c;
    public final int d;
    public final int e;

    public m5d(int i, int i2, u8b u8bVar, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = u8bVar;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5d)) {
            return false;
        }
        m5d m5dVar = (m5d) obj;
        return this.a == m5dVar.a && this.b == m5dVar.b && this.c.equals(m5dVar.c) && this.d == m5dVar.d && this.e == m5dVar.e;
    }

    public final u8b f() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(this.d, (this.c.hashCode() + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        String strK = c0a.k(this.e, "Options(rawValue=", ")");
        StringBuilder sbP = qv1.p("Result(answerId=", this.a, ", voteCount=", this.b, ", votes=");
        sbP.append(this.c);
        sbP.append(", rate=");
        sbP.append(this.d);
        sbP.append(", options=");
        return zo5.w(sbP, strK, ")");
    }
}
