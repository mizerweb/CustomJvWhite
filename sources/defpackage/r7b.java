package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r7b extends ewk {
    public final long a;
    public final long b;
    public final mg5 c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final ns5 i;

    public r7b(long j, long j2, mg5 mg5Var, String str, long j3, String str2, String str3, String str4, ns5 ns5Var) {
        this.a = j;
        this.b = j2;
        this.c = mg5Var;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = ns5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7b)) {
            return false;
        }
        r7b r7bVar = (r7b) obj;
        return this.a == r7bVar.a && this.b == r7bVar.b && this.c == r7bVar.c && cqk.d(this.d, r7bVar.d) && this.e == r7bVar.e && this.f.equals(r7bVar.f) && this.g.equals(r7bVar.g) && cqk.d(this.h, r7bVar.h) && this.i == r7bVar.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + zo5.d(zo5.d(zo5.d(qt4.g(zo5.d((this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "AudioAttach(chatId=", ", messageId=");
        sbS.append(this.b);
        sbS.append(", itemType=");
        sbS.append(this.c);
        p.j(sbS, ", attachLocalId=", this.d, ", audioId=");
        qv1.s(this.e, ", audioUrl=", this.f, sbS);
        nbh.G(sbS, ", attachTitle=", this.g, ", attachSubtitle=", this.h);
        sbS.append(", place=");
        sbS.append(this.i);
        sbS.append(")");
        return sbS.toString();
    }
}
