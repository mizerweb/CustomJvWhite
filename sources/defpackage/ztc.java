package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ztc {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public ztc(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztc)) {
            return false;
        }
        ztc ztcVar = (ztc) obj;
        return cqk.d(this.a, ztcVar.a) && cqk.d(this.b, ztcVar.b) && cqk.d(this.c, ztcVar.c) && cqk.d(this.d, ztcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qv1.c(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Result(updated=" + this.a + ", inserted=" + this.b + ", deleted=" + this.c + ", collectedDevicePhones=" + this.d + ")";
    }
}
