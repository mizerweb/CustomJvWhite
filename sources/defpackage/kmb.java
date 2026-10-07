package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kmb {
    public final Map a;
    public final zmb b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final l8b h;
    public final List i;

    public kmb(Map map, zmb zmbVar, int i, int i2, String str, boolean z, String str2, l8b l8bVar, List list) {
        this.a = map;
        this.b = zmbVar;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
        this.g = str2;
        this.h = l8bVar;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kmb) {
            kmb kmbVar = (kmb) obj;
            if (this.a.equals(kmbVar.a) && this.b == kmbVar.b && this.c == kmbVar.c && this.d == kmbVar.d && cqk.d(this.e, kmbVar.e) && this.f == kmbVar.f && cqk.d(this.g, kmbVar.g) && cqk.d(this.h, kmbVar.h) && this.i.equals(kmbVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iN = nbh.n(zo5.d(zo5.c(this.d, zo5.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iN + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(notificationsMap=");
        sb.append(this.a);
        sb.append(", notificationSettings=");
        sb.append(this.b);
        sb.append(", totalUnreadMessagesCount=");
        qt4.x(this.c, this.d, ", notificationId=", ", groupSummaryKey=", sb);
        sb.append(this.e);
        sb.append(", checkCount=");
        sb.append(this.f);
        sb.append(", tag=");
        sb.append(this.g);
        sb.append(", urlMap=");
        sb.append(this.h);
        sb.append(", droppedMessages=");
        return qv1.n(")", sb, this.i);
    }
}
