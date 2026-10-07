package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ldg {
    public static final ifh l = new ifh(new irf(17));
    public final kdg a;
    public final kdg b;
    public final kdg c;
    public final kdg d;
    public final kdg e;
    public final kdg f;
    public final kdg g;
    public final kdg h;
    public final kdg i;
    public final boolean j;
    public final kdg k;

    public ldg(kdg kdgVar, kdg kdgVar2, kdg kdgVar3, kdg kdgVar4, kdg kdgVar5, kdg kdgVar6, kdg kdgVar7, kdg kdgVar8, kdg kdgVar9, boolean z, kdg kdgVar10) {
        this.a = kdgVar;
        this.b = kdgVar2;
        this.c = kdgVar3;
        this.d = kdgVar4;
        this.e = kdgVar5;
        this.f = kdgVar6;
        this.g = kdgVar7;
        this.h = kdgVar8;
        this.i = kdgVar9;
        this.j = z;
        this.k = kdgVar10;
    }

    public static ldg a(ldg ldgVar, kdg kdgVar, boolean z, int i) {
        kdg kdgVar2 = ldgVar.a;
        kdg kdgVar3 = ldgVar.b;
        if ((i & 4) != 0) {
            kdgVar = ldgVar.c;
        }
        kdg kdgVar4 = ldgVar.d;
        kdg kdgVar5 = ldgVar.e;
        kdg kdgVar6 = ldgVar.f;
        kdg kdgVar7 = ldgVar.g;
        kdg kdgVar8 = ldgVar.h;
        kdg kdgVar9 = ldgVar.i;
        kdg kdgVar10 = ldgVar.k;
        ldgVar.getClass();
        return new ldg(kdgVar2, kdgVar3, kdgVar, kdgVar4, kdgVar5, kdgVar6, kdgVar7, kdgVar8, kdgVar9, z, kdgVar10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldg)) {
            return false;
        }
        ldg ldgVar = (ldg) obj;
        return this.a.equals(ldgVar.a) && this.b.equals(ldgVar.b) && this.c.equals(ldgVar.c) && this.d.equals(ldgVar.d) && this.e.equals(ldgVar.e) && this.f.equals(ldgVar.f) && this.g.equals(ldgVar.g) && this.h.equals(ldgVar.h) && this.i.equals(ldgVar.i) && this.j == ldgVar.j && this.k.equals(ldgVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + nbh.n((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        return "SoundConfig(end=" + this.a + ", iosEnd=" + this.b + ", ringtone=" + this.c + ", beep=" + this.d + ", connecting=" + this.e + ", connected=" + this.f + ", busy=" + this.g + ", startRecord=" + this.h + ", stopRecord=" + this.i + ", canVibration=" + this.j + ", waiting=" + this.k + ")";
    }
}
