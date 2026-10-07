package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hyg {
    public final long a;
    public final azg b;
    public final int c;
    public final long d;
    public final int e;
    public final l40 f;
    public final long g;
    public final k1h h;
    public final u8b i;
    public final Long j;
    public final int k;
    public final int l;

    public hyg(long j, azg azgVar, int i, long j2, int i2, l40 l40Var, long j3, k1h k1hVar, u8b u8bVar, Long l, int i3, int i4, int i5) {
        this(j, azgVar, i, j2, i2, l40Var, j3, k1hVar, (i5 & np0.n) != 0 ? cqb.b : u8bVar, (i5 & np0.o) != 0 ? null : l, (i5 & 1024) != 0 ? 0 : i3, (i5 & np0.q) != 0 ? 0 : i4);
    }

    public static hyg a(hyg hygVar, int i, k1h k1hVar, int i2, int i3) {
        return new hyg(hygVar.a, hygVar.b, (i3 & 4) != 0 ? hygVar.c : i, hygVar.d, hygVar.e, hygVar.f, hygVar.g, (i3 & np0.m) != 0 ? hygVar.h : k1hVar, hygVar.i, hygVar.j, (i3 & 1024) != 0 ? hygVar.k : i2, hygVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyg)) {
            return false;
        }
        hyg hygVar = (hyg) obj;
        return this.a == hygVar.a && cqk.d(this.b, hygVar.b) && v1h.b(this.c, hygVar.c) && this.d == hygVar.d && this.e == hygVar.e && cqk.d(this.f, hygVar.f) && this.g == hygVar.g && cqk.d(this.h, hygVar.h) && cqk.d(this.i, hygVar.i) && cqk.d(this.j, hygVar.j) && this.k == hygVar.k && this.l == hygVar.l;
    }

    public final int hashCode() {
        int iC = zo5.c(this.e, qt4.g((v1h.d(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31);
        l40 l40Var = this.f;
        int iG = qt4.g((iC + (l40Var == null ? 0 : l40Var.hashCode())) * 31, 31, this.g);
        k1h k1hVar = this.h;
        int iHashCode = (this.i.hashCode() + ((iG + (k1hVar == null ? 0 : k1hVar.hashCode())) * 31)) * 31;
        Long l = this.j;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        int i = this.k;
        return Integer.hashCode(this.l) + ((iHashCode2 + (i != 0 ? qt4.D(i) : 0)) * 31);
    }

    public final String toString() {
        String strE = v1h.e(this.c);
        StringBuilder sb = new StringBuilder("StoryItemModel(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        p.j(sb, ", settings=", strE, ", time=");
        c0a.w(sb, this.d, ", expiration=", this.e);
        sb.append(", media=");
        sb.append(this.f);
        sb.append(", cid=");
        sb.append(this.g);
        sb.append(", reaction=");
        sb.append(this.h);
        sb.append(", layers=");
        sb.append(this.i);
        sb.append(", draftId=");
        sb.append(this.j);
        sb.append(", publishState=");
        sb.append(v0h.m(this.k));
        sb.append(", version=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public hyg(long j, azg azgVar, int i, long j2, int i2, l40 l40Var, long j3, k1h k1hVar, u8b u8bVar, Long l, int i3, int i4) {
        this.a = j;
        this.b = azgVar;
        this.c = i;
        this.d = j2;
        this.e = i2;
        this.f = l40Var;
        this.g = j3;
        this.h = k1hVar;
        this.i = u8bVar;
        this.j = l;
        this.k = i3;
        this.l = i4;
    }
}
