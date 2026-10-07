package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q5g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public q5g(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a(int i) {
        if (i == 0) {
            throw null;
        }
        switch (p5g.$EnumSwitchMapping$0[qt4.D(i)]) {
            case 1:
                return this.a;
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                ore.o();
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5g)) {
            return false;
        }
        q5g q5gVar = (q5g) obj;
        return this.a.equals(q5gVar.a) && this.b.equals(q5gVar.b) && this.c.equals(q5gVar.c) && this.d.equals(q5gVar.d) && this.e.equals(q5gVar.e) && this.f.equals(q5gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + zo5.d(zo5.d(zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("SignalingType(restart=", this.a, ", connected=", this.b, ", reconnected=");
        nbh.G(sbQ, this.c, ", failedByPings=", this.d, ", failedByException=");
        return nbh.y(sbQ, this.e, ", timeout=", this.f, ")");
    }
}
