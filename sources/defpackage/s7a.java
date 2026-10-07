package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class s7a extends x7a {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final gjg i;
    public final gjg j;

    public s7a(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, mjg mjgVar, gjg gjgVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = mjgVar;
        this.j = gjgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a)) {
            return false;
        }
        s7a s7aVar = (s7a) obj;
        return this.a == s7aVar.a && this.b == s7aVar.b && this.c == s7aVar.c && cqk.d(this.d, s7aVar.d) && this.e.equals(s7aVar.e) && cqk.d(this.f, s7aVar.f) && this.g.equals(s7aVar.g) && this.h.equals(s7aVar.h) && cqk.d(this.i, s7aVar.i) && cqk.d(this.j, s7aVar.j);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.j.hashCode() + ((this.i.hashCode() + zo5.d(zo5.d(zo5.d(zo5.d(zo5.d(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31);
    }

    @Override // defpackage.x7a
    public final boolean i() {
        return false;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.profile_media_view_type_audio;
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
        StringBuilder sbS = qt4.s(this.a, "Audio(itemId=", ", messageId=");
        sbS.append(this.b);
        qt4.z(this.c, ", attachId=", ", attachLocalId=", sbS);
        nbh.G(sbS, this.d, ", audioUrl=", this.e, ", audioArtist=");
        nbh.G(sbS, this.f, ", subtitle=", this.g, ", playerTitle=");
        sbS.append(this.h);
        sbS.append(", state=");
        sbS.append(this.i);
        sbS.append(", progressState=");
        sbS.append(this.j);
        sbS.append(", isContentLevel=false)");
        return sbS.toString();
    }
}
