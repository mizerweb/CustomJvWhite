package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kui implements Serializable {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public kui(String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static kui a(fka fkaVar) throws IOException {
        int iP0 = fkaVar.P0();
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        String strW = null;
        for (int i = 0; i < iP0; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "height":
                    iR2 = ch3.R(fkaVar, 0);
                    break;
                case "frequency":
                    iR = ch3.R(fkaVar, 0);
                    break;
                case "url":
                    strW = ch3.W(fkaVar);
                    break;
                case "count":
                    iR4 = ch3.R(fkaVar, 0);
                    break;
                case "width":
                    iR3 = ch3.R(fkaVar, 0);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new kui(strW, iR, iR2, iR3, iR4);
    }
}
