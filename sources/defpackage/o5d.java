package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o5d {
    public final long a;
    public final String b;
    public final u8b c;
    public final int d;
    public final n5d e;
    public final int f;

    public o5d(long j, String str, u8b u8bVar, int i, n5d n5dVar, int i2) {
        this.a = j;
        this.b = str;
        this.c = u8bVar;
        this.d = i;
        this.e = n5dVar;
        this.f = i2;
    }

    public static o5d a(o5d o5dVar, int i, n5d n5dVar, int i2) {
        long j = o5dVar.a;
        String str = o5dVar.b;
        u8b u8bVar = o5dVar.c;
        if ((i2 & 8) != 0) {
            i = o5dVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            n5dVar = o5dVar.e;
        }
        int i4 = o5dVar.f;
        o5dVar.getClass();
        return new o5d(j, str, u8bVar, i3, n5dVar, i4);
    }

    public final u8b b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final n5d e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5d)) {
            return false;
        }
        o5d o5dVar = (o5d) obj;
        return this.a == o5dVar.a && cqk.d(this.b, o5dVar.b) && cqk.d(this.c, o5dVar.c) && this.d == o5dVar.d && cqk.d(this.e, o5dVar.e) && this.f == o5dVar.f;
    }

    public final String f() {
        return this.b;
    }

    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        int iC = zo5.c(this.d, (this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31);
        n5d n5dVar = this.e;
        return Integer.hashCode(this.f) + ((iC + (n5dVar == null ? 0 : n5dVar.hashCode())) * 31);
    }

    public final String toString() {
        String strK = c0a.k(this.d, "Settings(rawValue=", ")");
        StringBuilder sbT = qt4.t(this.a, "Poll(id=", ", title=", this.b);
        sbT.append(", answers=");
        sbT.append(this.c);
        sbT.append(", settings=");
        sbT.append(strK);
        sbT.append(", state=");
        sbT.append(this.e);
        sbT.append(", version=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
