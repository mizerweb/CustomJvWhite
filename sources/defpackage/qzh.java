package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qzh {
    public final x86 a;
    public final stg b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public qzh(x86 x86Var, stg stgVar, Long l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = x86Var;
        this.b = stgVar;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzh)) {
            return false;
        }
        qzh qzhVar = (qzh) obj;
        return cqk.d(this.a, qzhVar.a) && cqk.d(this.b, qzhVar.b) && cqk.d(this.c, qzhVar.c) && this.d == qzhVar.d && this.e == qzhVar.e && this.f == qzhVar.f && this.g == qzhVar.g && this.h == qzhVar.h && this.i == qzhVar.i && this.j == qzhVar.j;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return Boolean.hashCode(this.j) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranscodeAttemptConfig(target=");
        sb.append(this.a);
        sb.append(", settings=");
        sb.append(this.b);
        sb.append(", maxOutputDurationMcs=");
        sb.append(this.c);
        sb.append(", isCbr=");
        sb.append(this.d);
        sb.append(", isCbrForced=");
        qt4.B(", isPortraitEncodingEnabled=", ", isBFramesDisabled=", sb, this.e, this.f);
        qt4.B(", isEncoderParametersDisabled=", ", isHdrAllowed=", sb, this.g, this.h);
        return bc1.m(", isHdrToneMappingViaCodecEnabled=", ")", sb, this.i, this.j);
    }
}
