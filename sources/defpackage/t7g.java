package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t7g {
    public final String a;
    public final List b;

    public t7g(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        for (Object obj : list) {
            if (((u7g) obj).b == 1) {
                arrayList.add(obj);
            }
        }
        String strZ1 = ww3.z1(arrayList, ";", null, null, new chf(12), 30);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((u7g) obj2).b == 2) {
                arrayList2.add(obj2);
            }
        }
        String strZ2 = ww3.z1(arrayList2, ";", null, null, new chf(13), 30);
        ArrayList arrayList3 = new ArrayList();
        if (strZ1.length() > 0) {
            arrayList3.add("a=simulcast:send ".concat(strZ1));
        }
        if (strZ2.length() > 0) {
            arrayList3.add("a=simulcast:recv ".concat(strZ2));
        }
        return arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7g)) {
            return false;
        }
        t7g t7gVar = (t7g) obj;
        return this.a.equals(t7gVar.a) && cqk.d(this.b, t7gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimulcastConfig(mid=" + this.a + ", layers=" + this.b + ")";
    }
}
