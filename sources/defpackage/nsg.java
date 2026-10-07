package defpackage;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class nsg extends f83 {
    public nsg() {
        super(3);
    }

    public final boolean o() {
        return ((BitSet) this.b).get(2);
    }

    public final boolean p() {
        return ((BitSet) this.b).get(0);
    }

    public final boolean q() {
        return ((BitSet) this.b).get(1);
    }

    public final void r(boolean z) {
        ((BitSet) this.b).set(2, z);
    }

    public final void s(boolean z) {
        ((BitSet) this.b).set(0, z);
    }

    public final void t(boolean z) {
        ((BitSet) this.b).set(1, z);
    }
}
