package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fwf extends mk0 {
    public final vnh b;
    public final List c;
    public final tnh d;

    public fwf(tnh tnhVar, vnh vnhVar, List list) {
        super(20);
        this.b = vnhVar;
        this.c = list;
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwf)) {
            return false;
        }
        fwf fwfVar = (fwf) obj;
        return this.b.equals(fwfVar.b) && this.c.equals(fwfVar.c) && this.d.equals(fwfVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.c) + qv1.c(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", desc=" + this.d + ")";
    }
}
