package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o2g extends rbb {
    public final ArrayList b;

    public o2g(ArrayList arrayList) {
        super(sbi.a);
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2g) && this.b.equals(((o2g) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowDirections(directionsIntents=" + this.b + ")";
    }
}
