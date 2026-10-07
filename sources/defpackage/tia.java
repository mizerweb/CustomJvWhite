package defpackage;

import android.graphics.Bitmap;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class tia {
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final Bitmap h;
    public final long i;
    public final long j;
    public final yja k;
    public final bo6 l;
    public final mmb m;
    public final lzd n;
    public final boolean o;
    public final boolean p;
    public final String q;

    public /* synthetic */ tia(long j, String str, long j2, Long l, long j3, String str2, long j4, Bitmap bitmap, long j5, long j6, yja yjaVar, bo6 bo6Var, mmb mmbVar, lzd lzdVar, boolean z, String str3, int i) {
        this(j, str, j2, l, j3, str2, j4, bitmap, j5, j6, yjaVar, bo6Var, (i & np0.r) != 0 ? null : mmbVar, lzdVar, (i & 16384) == 0, (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? false : z, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tia)) {
            return false;
        }
        tia tiaVar = (tia) obj;
        return this.a == tiaVar.a && cqk.d(this.b, tiaVar.b) && this.c == tiaVar.c && cqk.d(this.d, tiaVar.d) && this.e == tiaVar.e && cqk.d(this.f, tiaVar.f) && this.g == tiaVar.g && cqk.d(this.h, tiaVar.h) && this.i == tiaVar.i && this.j == tiaVar.j && cqk.d(this.k, tiaVar.k) && this.l == tiaVar.l && cqk.d(this.m, tiaVar.m) && this.n == tiaVar.n && this.o == tiaVar.o && this.p == tiaVar.p && cqk.d(this.q, tiaVar.q);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iG = qt4.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iG2 = qt4.g(zo5.d(qt4.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int iHashCode2 = (this.l.hashCode() + ((this.k.hashCode() + qt4.g(qt4.g((iG2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.i), 31, this.j)) * 31)) * 31;
        mmb mmbVar = this.m;
        int iN = nbh.n(nbh.n((this.n.hashCode() + ((iHashCode2 + (mmbVar == null ? 0 : mmbVar.hashCode())) * 31)) * 31, 31, this.o), 31, this.p);
        String str2 = this.q;
        return iN + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append("', senderUserId=");
        sb.append(this.g);
        sb.append(", time=");
        sb.append(this.i);
        sb.append(", lastEditTime=");
        sb.append(this.j);
        sb.append(", text=");
        sb.append(this.k);
        sb.append(", fcmNotificationType=");
        sb.append(this.l);
        sb.append(", image=");
        sb.append(this.m);
        sb.append(", pushSource=");
        sb.append(this.n.a);
        sb.append(", isScheduledMessage=");
        sb.append(this.o);
        sb.append(", hasAnyError=");
        sb.append(this.p);
        sb.append(", url=");
        return zo5.w(sb, this.q, ")");
    }

    public tia(long j, String str, long j2, Long l, long j3, String str2, long j4, Bitmap bitmap, long j5, long j6, yja yjaVar, bo6 bo6Var, mmb mmbVar, lzd lzdVar, boolean z, boolean z2, String str3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = l;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = bitmap;
        this.i = j5;
        this.j = j6;
        this.k = yjaVar;
        this.l = bo6Var;
        this.m = mmbVar;
        this.n = lzdVar;
        this.o = z;
        this.p = z2;
        this.q = str3;
    }
}
