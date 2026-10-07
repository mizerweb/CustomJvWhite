package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t7a extends x7a {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final zp6 l;
    public final r8e m;

    public t7a(long j, long j2, long j3, String str, String str2, String str3, long j4, String str4, String str5, String str6, int i, zp6 zp6Var, r8e r8eVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = j4;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = i;
        this.l = zp6Var;
        this.m = r8eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t7a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t7a t7aVar = (t7a) obj;
        return this.a == t7aVar.a && this.b == t7aVar.b && this.c == t7aVar.c && this.g == t7aVar.g && cqk.d(this.d, t7aVar.d) && cqk.d(this.e, t7aVar.e) && this.f.equals(t7aVar.f) && this.h.equals(t7aVar.h) && cqk.d(this.i, t7aVar.i) && cqk.d(this.j, t7aVar.j) && this.k == t7aVar.k && cqk.d(this.l, t7aVar.l);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iN = nbh.n(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.g), 31, false);
        String str = this.d;
        int iD = zo5.d((this.h.hashCode() + ((this.f.hashCode() + zo5.d((iN + (str != null ? str.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31, 31, this.i);
        String str2 = this.j;
        return this.l.hashCode() + c0a.f(this.k, (iD + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.x7a
    public final boolean i() {
        return false;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.profile_media_view_type_file;
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
        String str;
        StringBuilder sbS = qt4.s(this.a, "File(itemId=", ", messageId=");
        sbS.append(this.b);
        qt4.z(this.c, ", attachId=", ", previewUrl=", sbS);
        nbh.G(sbS, this.d, ", title=", this.e, ", uploadTime=");
        sbS.append((Object) this.f);
        sbS.append(", rawFileSize=");
        sbS.append(this.g);
        sbS.append(", fileSize=");
        sbS.append((Object) this.h);
        sbS.append(", attachLocalId=");
        sbS.append(this.i);
        sbS.append(", localPath=");
        sbS.append(this.j);
        sbS.append(", type=");
        int i = this.k;
        if (i == 1) {
            str = "PHOTO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "UNKNOWN";
        } else {
            str = "VIDEO";
        }
        sbS.append(str);
        sbS.append(", extension=");
        sbS.append(this.l);
        sbS.append(", isContentLevel=false, loadingStateFlow=");
        sbS.append(this.m);
        sbS.append(")");
        return sbS.toString();
    }
}
