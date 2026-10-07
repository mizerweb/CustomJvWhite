package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class be3 extends y8f {
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final CharSequence h;
    public final int i;
    public final vu2 j;
    public final Uri k;
    public final long l;
    public final xcd m;
    public final CharSequence n;
    public final List o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final CharSequence t;
    public final boolean u;
    public final boolean v;
    public final Long w;
    public final CharSequence x;
    public final long y;

    public be3(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, vu2 vu2Var, Uri uri, long j2, xcd xcdVar, CharSequence charSequence, List list, boolean z5, boolean z6, boolean z7, boolean z8, CharSequence charSequence2, boolean z9, boolean z10, Long l, String str2) {
        super(1, list);
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = i;
        this.j = vu2Var;
        this.k = uri;
        this.l = j2;
        this.m = xcdVar;
        this.n = charSequence;
        this.o = list;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = charSequence2;
        this.u = z9;
        this.v = z10;
        this.w = l;
        this.x = str2;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be3)) {
            return false;
        }
        be3 be3Var = (be3) obj;
        return this.c == be3Var.c && this.d == be3Var.d && this.e == be3Var.e && this.f == be3Var.f && this.g == be3Var.g && cqk.d(this.h, be3Var.h) && this.i == be3Var.i && this.j == be3Var.j && cqk.d(this.k, be3Var.k) && this.l == be3Var.l && this.m.equals(be3Var.m) && cqk.d(this.n, be3Var.n) && cqk.d(this.o, be3Var.o) && this.p == be3Var.p && this.q == be3Var.q && this.r == be3Var.r && this.s == be3Var.s && cqk.d(this.t, be3Var.t) && this.u == be3Var.u && this.v == be3Var.v && cqk.d(this.w, be3Var.w) && cqk.d(this.x, be3Var.x);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        CharSequence charSequence = this.h;
        int iHashCode = (this.j.hashCode() + zo5.c(this.i, (iN + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.k;
        int iHashCode2 = (this.m.hashCode() + qt4.g((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.l)) * 31;
        CharSequence charSequence2 = this.n;
        int iN2 = nbh.n(nbh.n(mw7.f(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(qv1.c((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, false), 31, this.t), 31, this.u), 31, this.v);
        Long l = this.w;
        int iHashCode3 = (iN2 + (l == null ? 0 : l.hashCode())) * 31;
        CharSequence charSequence3 = this.x;
        return (iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
    }

    @Override // defpackage.y8f
    public final boolean i(y8f y8fVar) {
        return equals((be3) y8fVar);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chats_search_chat_view_type;
    }

    @Override // defpackage.y8f
    public final boolean o(y8f y8fVar) {
        return y8fVar.getItemId() == this.y;
    }

    @Override // defpackage.y8f
    public final String q() {
        return null;
    }

    @Override // defpackage.y8f
    public final String toString() {
        String strC = gxl.c(this.m.a);
        String strC2 = gxl.c(this.n);
        String strZ1 = ww3.z1(this.o, null, null, null, new w83(1), 31);
        CharSequence charSequence = this.x;
        String strC3 = charSequence != null ? gxl.c(charSequence) : null;
        StringBuilder sbQ = c0a.q(R.id.chats_search_chat_view_type, this.c, "ChatSearchModel(id=", ", viewType=");
        qt4.z(this.y, ", itemId=", ", isPinned=", sbQ);
        qt4.B(", isMuted=", ", hasUnreadReplyOrMention=", sbQ, this.d, this.e);
        qt4.B(", hasReaction=", ", lastMessageTime=", sbQ, this.f, this.g);
        sbQ.append((Object) this.h);
        sbQ.append(", unreadCount=");
        sbQ.append(this.i);
        sbQ.append(", status=");
        sbQ.append(this.j);
        sbQ.append(", avatar=");
        sbQ.append(this.k);
        sbQ.append(", avatarSourceId=");
        sbQ.append(this.l);
        sbQ.append(", preProcessedChatTitle=");
        sbQ.append((Object) strC);
        sbQ.append(", subtitle=");
        sbQ.append((Object) strC2);
        sbQ.append(", titleHighlights=");
        sbQ.append(strZ1);
        qv1.v(", isChannel=", ", highlightTitle=", sbQ, this.p, this.q);
        qv1.v(", highlightLink=", ", highlightContactName=", sbQ, this.r, this.s);
        sbQ.append(", selected=false, abbreviation=*, buttonText=");
        sbQ.append(strC3);
        sbQ.append(", isVerified=");
        sbQ.append(this.u);
        sbQ.append(")");
        return sbQ.toString();
    }
}
