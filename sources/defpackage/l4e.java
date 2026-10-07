package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l4e {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public l4e(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final l4e a(l4e l4eVar, String str) {
        String strD = w1m.d(str, this.c);
        if (l4eVar == null) {
            return null;
        }
        long j = l4eVar.b;
        if (!strD.equals(w1m.d(str, l4eVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == l4eVar.a) {
                return new l4e(strD, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = l4eVar.a;
        if (j4 + j == this.a) {
            return new l4e(strD, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l4e.class != obj.getClass()) {
            return false;
        }
        l4e l4eVar = (l4e) obj;
        return this.a == l4eVar.a && this.b == l4eVar.b && this.c.equals(l4eVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return c0a.m(this.b, ")", sb);
    }
}
