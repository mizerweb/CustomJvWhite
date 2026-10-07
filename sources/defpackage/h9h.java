package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class h9h implements j9h {
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence d;
    public final long e;
    public final CharSequence f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final g9h j;
    public final Long k;

    public h9h(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, long j2, CharSequence charSequence3, boolean z, boolean z2, String str, g9h g9hVar, Long l) {
        this.a = j;
        this.b = uri;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = j2;
        this.f = charSequence3;
        this.g = z;
        this.h = z2;
        this.i = str;
        this.j = g9hVar;
        this.k = l;
    }

    public static h9h i(h9h h9hVar, g9h g9hVar) {
        return new h9h(h9hVar.a, h9hVar.b, h9hVar.c, h9hVar.d, h9hVar.e, h9hVar.f, h9hVar.g, h9hVar.h, h9hVar.i, g9hVar, h9hVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9h)) {
            return false;
        }
        h9h h9hVar = (h9h) obj;
        return this.a == h9hVar.a && cqk.d(this.b, h9hVar.b) && this.c.equals(h9hVar.c) && this.d.equals(h9hVar.d) && this.e == h9hVar.e && cqk.d(this.f, h9hVar.f) && this.g == h9hVar.g && this.h == h9hVar.h && cqk.d(this.i, h9hVar.i) && this.j == h9hVar.j && cqk.d(this.k, h9hVar.k);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iHashCode2 = (this.j.hashCode() + zo5.d(nbh.n(nbh.n(mw7.f(qt4.g(mw7.f(mw7.f((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31;
        Long l = this.k;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chat_suggest_item_view_type;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        g9h g9hVar;
        h9h h9hVar = k79Var instanceof h9h ? (h9h) k79Var : null;
        if (h9hVar == null || this.j == (g9hVar = h9hVar.j)) {
            return null;
        }
        return new f9h(g9hVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(serverId=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append((Object) this.c);
        sb.append(", subtitle=");
        sb.append((Object) this.d);
        qt4.z(this.e, ", avatarSourceId=", ", abbreviation=", sb);
        sb.append((Object) this.f);
        sb.append(", isVerified=");
        sb.append(this.g);
        sb.append(", hasLiveStream=");
        sb.append(this.h);
        sb.append(", chatLink=");
        sb.append(this.i);
        sb.append(", status=");
        sb.append(this.j);
        sb.append(", dialogOpponentId=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
