package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rj4 extends kih implements xe9 {
    public final List c;

    public rj4(List list) {
        this.c = list;
    }

    @Override // defpackage.xe9
    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + f55.s(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj4) && cqk.d(this.c, ((rj4) obj).c);
    }

    public final List h() {
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pj4) obj) != oj4.t) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return a(false, false);
    }
}
