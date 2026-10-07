package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d83 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final e83 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public d83(long j, String str, long j2, String str2, e83 e83Var, List list, List list2, Bitmap bitmap, int i, boolean z, boolean z2, long j3, long j4, String str3, long j5) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = e83Var;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = j3;
        this.m = j4;
        this.n = str3;
        this.o = j5;
    }

    public static d83 a(d83 d83Var, String str, List list, List list2, Bitmap bitmap, boolean z, int i) {
        long j = d83Var.a;
        String str2 = d83Var.b;
        long j2 = d83Var.c;
        String str3 = (i & 8) != 0 ? d83Var.d : str;
        e83 e83Var = d83Var.e;
        List list3 = (i & 32) != 0 ? d83Var.f : list;
        List list4 = (i & 64) != 0 ? d83Var.g : list2;
        Bitmap bitmap2 = (i & np0.m) != 0 ? d83Var.h : bitmap;
        int i2 = (i & np0.n) != 0 ? d83Var.i : 0;
        boolean z2 = (i & np0.o) != 0 ? d83Var.j : z;
        boolean z3 = d83Var.k;
        long j3 = d83Var.l;
        boolean z4 = z2;
        long j4 = d83Var.m;
        String str4 = d83Var.n;
        long j5 = d83Var.o;
        d83Var.getClass();
        d83Var.getClass();
        return new d83(j, str2, j2, str3, e83Var, list3, list4, bitmap2, i2, z4, z3, j3, j4, str4, j5);
    }

    public final boolean b() {
        tia tiaVar = (tia) ww3.D1(this.f);
        return tiaVar != null && tiaVar.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        return this.a == d83Var.a && cqk.d(this.b, d83Var.b) && this.c == d83Var.c && cqk.d(this.d, d83Var.d) && this.e == d83Var.e && cqk.d(this.f, d83Var.f) && cqk.d(this.g, d83Var.g) && cqk.d(this.h, d83Var.h) && this.i == d83Var.i && this.j == d83Var.j && this.k == d83Var.k && this.l == d83Var.l && this.m == d83Var.m && cqk.d(this.n, d83Var.n) && this.o == d83Var.o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iC = qv1.c(qv1.c((this.e.hashCode() + zo5.d(qt4.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int iG = qt4.g(qt4.g(nbh.n(nbh.n(zo5.c(this.i, (iC + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        return qt4.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.o);
    }

    public final String toString() {
        return "ChatNotification(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + "', chatNotificationType=" + this.e + ", displayMessages=" + ww3.z1(this.f, ",", "[", "]", new c6(19), 24) + ", droppedMessages=" + this.g.size() + ", totalUnreadMessagesCount=" + this.i + ", needNotify=" + this.j + ", showNotificationText=" + this.k + ", lastMessageId=" + this.l + ", lastMessageDate=" + this.m + ", pushType=" + this.n + ", createdTime=" + this.o + ", isScheduled=" + b() + ")";
    }
}
