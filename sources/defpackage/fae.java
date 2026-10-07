package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class fae {
    public final int a;
    public final long b;
    public final long c;
    public final puc d;

    public fae(rw2 rw2Var) {
        this.a = rw2Var.a;
        this.b = rw2Var.b;
        this.c = rw2Var.c;
        this.d = (puc) rw2Var.d;
    }

    public static fae a(fka fkaVar) throws IOException {
        String str;
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        rw2 rw2Var = new rw2();
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            int i2 = 1;
            switch (strS0) {
                case "id":
                    rw2Var.b = fkaVar.I0();
                    break;
                case "gif":
                    rw2Var.d = (puc) l40.b(fkaVar);
                    break;
                case "type":
                    String strW = ch3.W(fkaVar);
                    for (int i3 : qt4.H(3)) {
                        if (i3 == 1) {
                            str = "UNKNOWN";
                        } else if (i3 == 2) {
                            str = "STICKER";
                        } else {
                            if (i3 != 3) {
                                throw null;
                            }
                            str = "GIF";
                        }
                        if (str.equals(strW)) {
                            i2 = i3;
                            rw2Var.a = i2;
                        }
                        break;
                    }
                    rw2Var.a = i2;
                    break;
                case "stickerId":
                    rw2Var.c = ch3.T(fkaVar, 0L);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new fae(rw2Var);
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "GIF";
        } else {
            str = "STICKER";
        }
        String strValueOf = String.valueOf(this.d);
        StringBuilder sbB = nbh.B(this.b, "RecentItem{type=", str, ", id=");
        qt4.z(this.c, ", stickerId=", ", gif=", sbB);
        return zo5.w(sbB, strValueOf, "}");
    }
}
