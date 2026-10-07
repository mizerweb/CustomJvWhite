package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rqe {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Set e;
    public final boolean f;
    public final List g;
    public final Map h;
    public final List i;
    public final Set j;
    public final long k;
    public final List l;
    public final Long m;
    public final Long n;

    public rqe(String str, String str2, int i, String str3, Set set, boolean z, List list, Map map, List list2, Set set2, long j, List list3, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = set;
        this.f = z;
        this.g = list;
        this.h = map;
        this.i = list2;
        this.j = set2;
        this.k = j;
        this.l = list3;
        this.m = l;
        this.n = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rqe.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        rqe rqeVar = (rqe) obj;
        if (this.c != rqeVar.c || this.f != rqeVar.f || this.k != rqeVar.k || !cqk.d(this.m, rqeVar.m) || !cqk.d(this.n, rqeVar.n) || !cqk.d(this.a, rqeVar.a) || !cqk.d(this.b, rqeVar.b) || !cqk.d(this.d, rqeVar.d) || !cqk.d(this.e, rqeVar.e) || !cqk.d(this.g, rqeVar.g)) {
            return false;
        }
        LinkedHashSet linkedHashSet = i37.b;
        return f55.b(this.h, rqeVar.h) && cqk.d(this.i, rqeVar.i) && cqk.d(this.j, rqeVar.j) && cqk.d(this.l, rqeVar.l);
    }

    public final int hashCode() {
        int iU;
        int iG = qt4.g(nbh.n(this.c * 31, 31, this.f), 31, this.k);
        Long l = this.m;
        int iHashCode = (iG + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31;
        Long l2 = this.n;
        int iD = zo5.d(zo5.d((iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31, 31, this.a), 31, this.b);
        String str = this.d;
        int iO = nbh.o(this.e, (iD + (str != null ? str.hashCode() : 0)) * 31, 31);
        List list = this.g;
        int iHashCode2 = (iO + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.h;
        if (map != null) {
            LinkedHashSet linkedHashSet = i37.b;
            iU = f55.u(map);
        } else {
            iU = 0;
        }
        int i = (iHashCode2 + iU) * 31;
        List list2 = this.i;
        int iHashCode3 = (i + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set set = this.j;
        int iHashCode4 = (iHashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        List list3 = this.l;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("RoomChatFolder(id=", this.a, ", title=", this.b, ", order=");
        sbQ.append(this.c);
        sbQ.append(", emoji=");
        sbQ.append(this.d);
        sbQ.append(", filters=");
        sbQ.append(this.e);
        sbQ.append(", isHiddenForAllFolder=");
        sbQ.append(this.f);
        sbQ.append(", elements=");
        sbQ.append(this.g);
        sbQ.append(", filterSubjects=");
        sbQ.append(this.h);
        sbQ.append(", widgets=");
        sbQ.append(this.i);
        sbQ.append(", options=");
        sbQ.append(this.j);
        sbQ.append(", updateTime=");
        sbQ.append(this.k);
        sbQ.append(", favorites=");
        sbQ.append(this.l);
        sbQ.append(", templateId=");
        sbQ.append(this.m);
        sbQ.append(", sourceId=");
        sbQ.append(this.n);
        sbQ.append(")");
        return sbQ.toString();
    }
}
