package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zsg {
    public final ArrayList a;
    public final boolean b;

    public zsg(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsg)) {
            return false;
        }
        zsg zsgVar = (zsg) obj;
        return this.a.equals(zsgVar.a) && this.b == zsgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollapsedItems(items=" + this.a + ", isSelfFirst=" + this.b + ")";
    }
}
