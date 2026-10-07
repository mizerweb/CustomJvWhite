package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class vja implements Serializable {
    public final int a;
    public final int b;

    public vja(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static vja a(fka fkaVar) {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        int iD0 = 0;
        int iD1 = 0;
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            if (strS0.equals("views")) {
                iD0 = fkaVar.D0();
            } else if (strS0.equals("forwards")) {
                iD1 = fkaVar.D0();
            } else {
                fkaVar.x();
            }
        }
        return new vja(iD0, iD1);
    }

    public final String toString() {
        return nbh.u("{views=", this.a, ", forwards=", this.b, "}");
    }
}
