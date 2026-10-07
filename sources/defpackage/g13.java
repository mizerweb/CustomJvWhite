package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g13 extends kih {
    public final ArrayList c;

    public g13(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g13) && this.c.equals(((g13) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        ArrayList arrayList = this.c;
        return "{size=" + arrayList.size() + "[" + arrayList + "]}";
    }
}
