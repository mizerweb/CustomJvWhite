package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e7d implements t50 {
    public final long a;
    public final long b;
    public final CharSequence c;
    public final tnh d;
    public final List e;
    public final a7d f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public e7d(long j, long j2, CharSequence charSequence, tnh tnhVar, List list, a7d a7dVar, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.d = tnhVar;
        this.e = list;
        this.f = a7dVar;
        this.g = z;
        this.h = z2;
        List list2 = list;
        boolean z3 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((b7d) it.next()).d instanceof v6d) {
                    z3 = true;
                    break;
                }
            }
        }
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7d)) {
            return false;
        }
        e7d e7dVar = (e7d) obj;
        return this.a == e7dVar.a && this.b == e7dVar.b && cqk.d(this.c, e7dVar.c) && this.d.equals(e7dVar.d) && this.e.equals(e7dVar.e) && this.f.equals(e7dVar.f) && this.g == e7dVar.g && this.h == e7dVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + nbh.n((this.f.hashCode() + qv1.c(zo5.c(this.d.c, mw7.f(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PollAttachModel(messageId=", ", pollId=");
        sbS.append(this.b);
        sbS.append(", title=");
        sbS.append((Object) this.c);
        sbS.append(", subtitle=");
        sbS.append(this.d);
        sbS.append(", answers=");
        sbS.append(this.e);
        sbS.append(", buttonState=");
        sbS.append(this.f);
        sbS.append(", isInteractionEnabled=");
        sbS.append(this.g);
        return nbh.z(sbS, ", hasDescription=", this.h, ")");
    }
}
