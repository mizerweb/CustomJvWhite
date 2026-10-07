package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f1g extends fql {
    public final String a;
    public final String b;
    public final tnh c;
    public final boolean d;
    public final ynh e;
    public final Integer f;

    public f1g(String str, String str2, tnh tnhVar, boolean z, ynh ynhVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = tnhVar;
        this.d = z;
        this.e = ynhVar;
        this.f = num;
    }

    @Override // defpackage.fql
    public final ynh b() {
        return this.e;
    }

    @Override // defpackage.fql
    public final Integer c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1g)) {
            return false;
        }
        f1g f1gVar = (f1g) obj;
        return this.a.equals(f1gVar.a) && cqk.d(this.b, f1gVar.b) && this.c.equals(f1gVar.c) && this.d == f1gVar.d && cqk.d(this.e, f1gVar.e) && this.f.equals(f1gVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iN = nbh.n(nbh.n(zo5.c(this.c.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, false), 31, this.d);
        ynh ynhVar = this.e;
        return this.f.hashCode() + ((iN + (ynhVar != null ? ynhVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("Input(prefix=", this.a, ", link=", this.b, ", placeholder=");
        sbQ.append(this.c);
        sbQ.append(", shouldShowMore=false, shouldShowDescription=");
        sbQ.append(this.d);
        sbQ.append(", hint=");
        sbQ.append(this.e);
        sbQ.append(", hintColor=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
