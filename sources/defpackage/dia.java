package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dia implements Serializable {
    public final int a;
    public final long b;
    public final gda c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public dia(int i, long j, gda gdaVar, String str, String str2, String str3, int i2) {
        this.a = i;
        this.b = j;
        this.c = gdaVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    public static dia a(fka fkaVar) {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        gda gdaVarQ0 = null;
        String strW = null;
        String strW2 = null;
        String strW3 = null;
        int i = 0;
        int i2 = 0;
        long jI0 = 0;
        for (int i3 = 0; i3 < iU; i3++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "chatId":
                    jI0 = fkaVar.I0();
                    break;
                case "postId":
                    fkaVar.I0();
                    break;
                case "chatAccessType":
                    String strW4 = ch3.W(fkaVar);
                    if (strW4 != null && strW4.equals("PUBLIC")) {
                        i2 = 1;
                        break;
                    } else {
                        i2 = 2;
                        break;
                    }
                    break;
                case "chatIconUrl":
                    strW3 = ch3.W(fkaVar);
                    break;
                case "type":
                    String strS1 = fkaVar.S0();
                    if (strS1 == null) {
                        i = 1;
                        break;
                    } else {
                        if (strS1.equals("FORWARD")) {
                            i = 3;
                        } else if (strS1.equals("REPLY")) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        break;
                    }
                    break;
                case "message":
                    gdaVarQ0 = yab.q0(fkaVar);
                    break;
                case "chatLink":
                    strW2 = ch3.W(fkaVar);
                    break;
                case "chatName":
                    strW = ch3.W(fkaVar);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new dia(i, jI0, gdaVarQ0, strW, strW2, strW3, i2);
    }

    public final String toString() {
        return c0a.o("{type=", r5a.l(this.a), "}");
    }
}
