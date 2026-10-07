package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rfc implements grf {
    public final tnh a;
    public final ArrayList b;

    public rfc(tnh tnhVar, ArrayList arrayList) {
        this.a = tnhVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfc)) {
            return false;
        }
        rfc rfcVar = (rfc) obj;
        return this.a.equals(rfcVar.a) && this.b.equals(rfcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "OpenConfirmationBottomSheet(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
