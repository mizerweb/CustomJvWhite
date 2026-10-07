package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cja implements Serializable {
    public final String a;
    public final b50 b;

    public cja(xp9 xp9Var) {
        this.a = (String) xp9Var.c;
        this.b = (b50) xp9Var.b;
    }

    public static cja a(fka fkaVar) {
        xp9 xp9Var = new xp9(22, (boolean) (0 == true ? 1 : 0));
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            if (strS0.equals("attachment")) {
                l40 l40VarB = l40.b(fkaVar);
                b50 b50Var = new b50(1);
                b50Var.add(l40VarB);
                xp9Var.b = b50Var;
            } else if (strS0.equals("text")) {
                xp9Var.c = ch3.W(fkaVar);
            } else {
                fkaVar.x();
            }
        }
        return new cja(xp9Var);
    }

    public final String toString() {
        return nbh.w("Message{text='", this.a, "', attaches=", String.valueOf(this.b), "}");
    }
}
