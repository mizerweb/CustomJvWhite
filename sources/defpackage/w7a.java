package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w7a extends x7a {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final lzf h;

    public w7a(long j, long j2, long j3, String str, Uri uri, String str2, String str3, lzf lzfVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = uri;
        this.f = str2;
        this.g = str3;
        this.h = lzfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7a)) {
            return false;
        }
        w7a w7aVar = (w7a) obj;
        return this.a == w7aVar.a && this.b == w7aVar.b && this.c == w7aVar.c && cqk.d(this.d, w7aVar.d) && cqk.d(this.e, w7aVar.e) && cqk.d(this.f, w7aVar.f) && this.g.equals(w7aVar.g) && cqk.d(this.h, w7aVar.h);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = zo5.d(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Uri uri = this.e;
        return Boolean.hashCode(false) + ((this.h.hashCode() + zo5.d(zo5.d((iD + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f), 31, this.g)) * 31);
    }

    @Override // defpackage.x7a
    public final boolean i() {
        return false;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.profile_media_view_type_video_msg;
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
        StringBuilder sbS = qt4.s(this.a, "VideoMsg(itemId=", ", messageId=");
        sbS.append(this.b);
        qt4.z(this.c, ", attachId=", ", attachLocalId=", sbS);
        sbS.append(this.d);
        sbS.append(", preview=");
        sbS.append(this.e);
        sbS.append(", title=");
        nbh.G(sbS, this.f, ", subtitle=", this.g, ", state=");
        sbS.append(this.h);
        sbS.append(", isContentLevel=false)");
        return sbS.toString();
    }
}
