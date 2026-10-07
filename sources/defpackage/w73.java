package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannedString;
import java.util.BitSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class w73 implements k79, kw7 {
    public final long A;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence d;
    public final dnh e;
    public final CharSequence f;
    public final CharSequence g;
    public final dnh h;
    public final CharSequence i;
    public final int j;
    public final dnh k;
    public final boolean l;
    public final String m;
    public final long n;
    public final v73 o;
    public final int p;
    public final long q;
    public final Long r;
    public final long s;
    public final CharSequence t;
    public final long u;
    public final Long v;
    public final CharSequence w;
    public final ozg x;
    public final CharSequence y;
    public final int z;

    public w73(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, dnh dnhVar, CharSequence charSequence3, CharSequence charSequence4, dnh dnhVar2, CharSequence charSequence5, int i, dnh dnhVar3, boolean z, String str, long j2, v73 v73Var, int i2, long j3, Long l, long j4, CharSequence charSequence6, long j5, Long l2, CharSequence charSequence7, ozg ozgVar, CharSequence charSequence8) {
        this.a = j;
        this.b = uri;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = dnhVar;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = dnhVar2;
        this.i = charSequence5;
        this.j = i;
        this.k = dnhVar3;
        this.l = z;
        this.m = str;
        this.n = j2;
        this.o = v73Var;
        this.p = i2;
        this.q = j3;
        this.r = l;
        this.s = j4;
        this.t = charSequence6;
        this.u = j5;
        this.v = l2;
        this.w = charSequence7;
        this.x = ozgVar;
        this.y = charSequence8;
        this.z = C() ? R.id.chat_item_view_type_pinned : R.id.chat_item_view_type;
        this.A = j;
    }

    public static w73 o(w73 w73Var, dnh dnhVar, dnh dnhVar2, CharSequence charSequence, int i, dnh dnhVar3, boolean z, ozg ozgVar, int i2) {
        return new w73(w73Var.a, w73Var.b, w73Var.c, w73Var.d, (i2 & 16) != 0 ? w73Var.e : dnhVar, w73Var.f, w73Var.g, (i2 & np0.m) != 0 ? w73Var.h : dnhVar2, (i2 & np0.n) != 0 ? w73Var.i : charSequence, (i2 & np0.o) != 0 ? w73Var.j : i, dnhVar3, z, w73Var.m, w73Var.n, w73Var.o, w73Var.p, w73Var.q, w73Var.r, w73Var.s, w73Var.t, w73Var.u, w73Var.v, w73Var.w, (i2 & 8388608) != 0 ? w73Var.x : ozgVar, w73Var.y);
    }

    public final boolean C() {
        return this.q != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        return this.a == w73Var.a && cqk.d(this.b, w73Var.b) && cqk.d(this.c, w73Var.c) && cqk.d(this.d, w73Var.d) && cqk.d(this.e, w73Var.e) && cqk.d(this.f, w73Var.f) && cqk.d(this.g, w73Var.g) && cqk.d(this.h, w73Var.h) && cqk.d(this.i, w73Var.i) && this.j == w73Var.j && cqk.d(this.k, w73Var.k) && this.l == w73Var.l && cqk.d(this.m, w73Var.m) && this.n == w73Var.n && this.o == w73Var.o && this.p == w73Var.p && this.q == w73Var.q && cqk.d(this.r, w73Var.r) && this.s == w73Var.s && cqk.d(this.t, w73Var.t) && this.u == w73Var.u && cqk.d(this.v, w73Var.v) && cqk.d(this.w, w73Var.w) && cqk.d(this.x, w73Var.x) && cqk.d(this.y, w73Var.y);
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: getId */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.A;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.A == k79Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iF = mw7.f((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int iHashCode2 = (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        dnh dnhVar = this.e;
        int iF2 = mw7.f((iHashCode2 + (dnhVar == null ? 0 : dnhVar.hashCode())) * 31, 31, this.f);
        CharSequence charSequence2 = this.g;
        int iHashCode3 = (iF2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        dnh dnhVar2 = this.h;
        int iHashCode4 = (iHashCode3 + (dnhVar2 == null ? 0 : dnhVar2.hashCode())) * 31;
        CharSequence charSequence3 = this.i;
        int iHashCode5 = (iHashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        int i = this.j;
        int iD = (iHashCode5 + (i == 0 ? 0 : qt4.D(i))) * 31;
        dnh dnhVar3 = this.k;
        int iN = nbh.n((iD + (dnhVar3 == null ? 0 : dnhVar3.hashCode())) * 31, 31, this.l);
        String str = this.m;
        int iG = qt4.g(zo5.c(this.p, (this.o.hashCode() + qt4.g((iN + (str == null ? 0 : str.hashCode())) * 31, 31, this.n)) * 31, 31), 31, this.q);
        Long l = this.r;
        int iG2 = qt4.g(mw7.f(qt4.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u);
        Long l2 = this.v;
        int iHashCode6 = (iG2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence4 = this.w;
        int iHashCode7 = (iHashCode6 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        ozg ozgVar = this.x;
        int iHashCode8 = (iHashCode7 + (ozgVar == null ? 0 : ozgVar.hashCode())) * 31;
        CharSequence charSequence5 = this.y;
        return iHashCode8 + (charSequence5 != null ? charSequence5.hashCode() : 0);
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: i */
    public final long getC() {
        return this.n;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.z;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        w73 w73Var = k79Var instanceof w73 ? (w73) k79Var : null;
        if (w73Var == null) {
            return null;
        }
        u73 u73Var = new u73(3);
        BitSet bitSet = (BitSet) u73Var.b;
        bitSet.set(0, z() != w73Var.z());
        bitSet.set(1, (cqk.d(this.b, w73Var.b) && this.s == w73Var.s && cqk.d(this.t, w73Var.t)) ? false : true);
        bitSet.set(2, !cqk.d(this.c, w73Var.c));
        bitSet.set(3, !cqk.d(this.d, w73Var.d));
        bitSet.set(15, this.e != w73Var.e);
        bitSet.set(17, this.h != w73Var.h);
        bitSet.set(4, (cqk.d(this.f, w73Var.f) && cqk.d(this.g, w73Var.g)) ? false : true);
        bitSet.set(5, (cqk.d(this.i, w73Var.i) && this.j == w73Var.j) ? false : true);
        bitSet.set(16, this.k != w73Var.k);
        bitSet.set(6, !cqk.d(this.m, w73Var.m));
        bitSet.set(7, this.n != w73Var.n);
        bitSet.set(8, this.o != w73Var.o);
        bitSet.set(9, this.p != w73Var.p);
        bitSet.set(10, gm0.C(this.u) != gm0.C(w73Var.u));
        bitSet.set(11, w() != w73Var.w());
        bitSet.set(12, x() != w73Var.x());
        bitSet.set(13, this.q != w73Var.q);
        bitSet.set(14, q() != w73Var.q());
        bitSet.set(18, r() != w73Var.r());
        bitSet.set(19, !cqk.d(this.w, w73Var.w));
        bitSet.set(20, !cqk.d(this.x, w73Var.x));
        bitSet.set(21, !cqk.d(this.y, w73Var.y));
        return u73Var;
    }

    public final boolean q() {
        return (this.u & PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) != 0;
    }

    public final boolean r() {
        return (this.u & PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) != 0;
    }

    public final String toString() {
        boolean zC = gm0.c();
        CharSequence charSequenceC = this.c;
        if (!zC) {
            charSequenceC = gxl.c(charSequenceC);
        }
        StringBuilder sb = new StringBuilder("ChatModel(chatId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) charSequenceC);
        return zo5.k(this.n, ", time=", ")", sb);
    }

    public final boolean w() {
        return (this.u & 16) != 0;
    }

    public final boolean x() {
        return (this.u & 32) != 0;
    }

    public final boolean z() {
        return (this.u & 2) != 0;
    }

    public /* synthetic */ w73(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, boolean z, String str, long j2, v73 v73Var, int i, long j3, Long l, long j4, CharSequence charSequence6, long j5, Long l2, SpannedString spannedString, String str2, int i2) {
        this(j, uri, charSequence, charSequence2, null, charSequence3, charSequence4, null, charSequence5, 0, null, (i2 & np0.q) != 0 ? true : z, str, j2, v73Var, i, j3, l, j4, charSequence6, j5, (2097152 & i2) != 0 ? null : l2, (4194304 & i2) != 0 ? null : spannedString, null, (i2 & 16777216) != 0 ? null : str2);
    }
}
