package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final String g;
    public final w0h h;
    public final long i;

    public /* synthetic */ zzg(long j, int i, long j2, String str, boolean z) {
        this(0L, j, i, j2, str, z, null, w0h.PREPARED, System.currentTimeMillis());
    }

    public final long a() {
        return this.i;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        return this.a == zzgVar.a && this.b == zzgVar.b && this.c == zzgVar.c && this.d == zzgVar.d && cqk.d(this.e, zzgVar.e) && this.f == zzgVar.f && cqk.d(this.g, zzgVar.g) && this.h == zzgVar.h && this.i == zzgVar.i;
    }

    public final w0h f() {
        return this.h;
    }

    public final long g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int iN = nbh.n(zo5.d(qt4.g(zo5.c(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Long.hashCode(this.i) + ((this.h.hashCode() + ((iN + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StoryPublishEntity(publishId=", ", draftId=");
        c0a.w(sbS, this.b, ", segmentIndex=", this.c);
        qt4.z(this.d, ", storyId=", ", segmentPath=", sbS);
        sbS.append(this.e);
        sbS.append(", isVideo=");
        sbS.append(this.f);
        sbS.append(", uploadToken=");
        sbS.append(this.g);
        sbS.append(", status=");
        sbS.append(this.h);
        sbS.append(", createdAt=");
        return c0a.m(this.i, ")", sbS);
    }

    public zzg(long j, long j2, int i, long j3, String str, boolean z, String str2, w0h w0hVar, long j4) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = str;
        this.f = z;
        this.g = str2;
        this.h = w0hVar;
        this.i = j4;
    }
}
