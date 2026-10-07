package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u7a extends x7a {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final CharSequence f;
    public final CharSequence g;
    public final boolean h;

    public u7a(long j, long j2, long j3, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7a)) {
            return false;
        }
        u7a u7aVar = (u7a) obj;
        return this.a == u7aVar.a && this.b == u7aVar.b && this.c == u7aVar.c && cqk.d(this.d, u7aVar.d) && this.e.equals(u7aVar.e) && cqk.d(this.f, u7aVar.f) && cqk.d(this.g, u7aVar.g) && this.h == u7aVar.h;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD = zo5.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        int iHashCode = (iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.x7a
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.profile_media_view_type_link;
    }

    @Override // defpackage.x7a
    public final long k() {
        return this.c;
    }

    @Override // defpackage.x7a
    public final long l() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Link(itemId=", ", messageId=");
        sbS.append(this.b);
        qt4.z(this.c, ", attachId=", ", previewUrl=", sbS);
        nbh.G(sbS, this.d, ", title=", this.e, ", subtitle=");
        sbS.append((Object) this.f);
        sbS.append(", link=");
        sbS.append((Object) this.g);
        sbS.append(", isContentLevel=");
        return qt4.r(sbS, this.h, ")");
    }
}
