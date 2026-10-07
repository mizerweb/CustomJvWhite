package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f6k extends k6k {
    public final String a;
    public final ArrayList b;

    public f6k(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6k)) {
            return false;
        }
        f6k f6kVar = (f6k) obj;
        return cqk.d(this.a, f6kVar.a) && cqk.d(this.b, f6kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoMasterInHostsList(master=" + this.a + ", installedHosts=" + this.b + ')';
    }
}
