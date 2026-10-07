package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class swg {
    public final long a;
    public final String b;
    public final String c;
    public final kxg d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;

    public swg(long j, String str, String str2, kxg kxgVar, long j2, int i, int i2, int i3, long j3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = kxgVar;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j3;
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.g;
    }

    public final long c() {
        return this.i;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swg)) {
            return false;
        }
        swg swgVar = (swg) obj;
        return this.a == swgVar.a && cqk.d(this.b, swgVar.b) && cqk.d(this.c, swgVar.c) && this.d == swgVar.d && this.e == swgVar.e && this.f == swgVar.f && this.g == swgVar.g && this.h == swgVar.h && this.i == swgVar.i;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.i) + zo5.c(this.h, zo5.c(this.g, zo5.c(this.f, qt4.g((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31), 31), 31);
    }

    public final kxg i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "StoryDraftEntity(draftId=", ", mediaPath=", this.b);
        sbT.append(", previewPath=");
        sbT.append(this.c);
        sbT.append(", type=");
        sbT.append(this.d);
        qt4.z(this.e, ", expirationMs=", ", settings=", sbT);
        qt4.x(this.f, this.g, ", canvasWidth=", ", canvasHeight=", sbT);
        c0a.v(sbT, this.h, ", createdAt=", this.i);
        sbT.append(")");
        return sbT.toString();
    }
}
