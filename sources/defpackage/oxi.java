package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oxi implements hti, j1i {
    public final long a;
    public final String b;
    public final fti c;
    public final r8e d;
    public final lzf e;
    public final CharSequence f;
    public final i1i g;
    public final int h;
    public final boolean i;

    public oxi(long j, String str, fti ftiVar, r8e r8eVar, lzf lzfVar, CharSequence charSequence, i1i i1iVar, int i, boolean z) {
        this.a = j;
        this.b = str;
        this.c = ftiVar;
        this.d = r8eVar;
        this.e = lzfVar;
        this.f = charSequence;
        this.g = i1iVar;
        this.h = i;
        this.i = z;
    }

    @Override // defpackage.j1i
    public final int a() {
        return this.h;
    }

    @Override // defpackage.hti
    public final boolean b() {
        l1j l1jVarE;
        l1j l1jVarE2;
        k1j k1jVar;
        l1j l1jVarE3 = e();
        long j = this.a;
        boolean z = l1jVarE3 != null && l1jVarE3.b == j && (l1jVarE2 = e()) != null && ((k1jVar = l1jVarE2.f) == k1j.e || k1jVar == k1j.f);
        r8e r8eVar = this.d;
        gjg gjgVar = r8eVar.a;
        return (!(!(gjgVar.getValue() instanceof f50) || (gjgVar.getValue() instanceof g50) || (gjgVar.getValue() instanceof c50)) || (r8eVar.a.getValue() instanceof g50)) && ((l1jVarE = e()) == null || l1jVarE.b != j || z);
    }

    @Override // defpackage.hti
    public final boolean c() {
        return this.c.l;
    }

    public final l1j e() {
        return (l1j) ww3.t1(this.e.d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxi)) {
            return false;
        }
        oxi oxiVar = (oxi) obj;
        return this.a == oxiVar.a && cqk.d(this.b, oxiVar.b) && this.c.equals(oxiVar.c) && this.h == oxiVar.h && cqk.d(this.g, oxiVar.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // defpackage.hti
    public final String k() {
        return this.b;
    }

    @Override // defpackage.hti
    public final long l() {
        return this.a;
    }
}
