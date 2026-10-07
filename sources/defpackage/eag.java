package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eag implements hti, iq9 {
    public final long a;
    public final String b;
    public final fti c;
    public final r8e d;
    public final boolean e;
    public final boolean f;

    public eag(long j, String str, fti ftiVar, r8e r8eVar, boolean z, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = ftiVar;
        this.d = r8eVar;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        gjg gjgVar = this.d.a;
        return (gjgVar.getValue() instanceof c50) || (gjgVar.getValue() instanceof g50) || (gjgVar.getValue() instanceof e50);
    }

    @Override // defpackage.hti
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hti
    public final boolean c() {
        return true;
    }

    @Override // defpackage.iq9
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eag)) {
            return false;
        }
        eag eagVar = (eag) obj;
        return this.a == eagVar.a && cqk.d(this.b, eagVar.b) && this.c.equals(eagVar.c) && this.e == eagVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
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
