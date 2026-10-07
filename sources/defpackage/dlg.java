package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dlg {
    public final long a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final int j;
    public final long k;
    public final String l;
    public final boolean m;
    public final int n;
    public final String o;

    public dlg(blg blgVar) {
        this.a = blgVar.a;
        this.b = blgVar.b;
        this.c = blgVar.c;
        this.d = blgVar.d;
        this.e = blgVar.e;
        this.f = blgVar.f;
        this.g = blgVar.g;
        this.h = blgVar.h;
        this.i = blgVar.i;
        this.j = blgVar.j;
        this.k = blgVar.k;
        this.l = blgVar.l;
        this.m = blgVar.m;
        this.n = blgVar.n;
        this.o = blgVar.o;
    }

    public static dlg a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        blg blgVar = new blg();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= iU) {
                if (blgVar.i == null) {
                    blgVar.i = Collections.EMPTY_LIST;
                }
                if (blgVar.j == 0) {
                    blgVar.j = 1;
                }
                if (blgVar.n == 0) {
                    blgVar.n = 1;
                }
                return new dlg(blgVar);
            }
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "authorType":
                    String strW = ch3.W(fkaVar);
                    for (int i3 : qt4.H(3)) {
                        if (c0a.b(i3).equals(strW)) {
                            i2 = i3;
                            blgVar.n = i2;
                        }
                        break;
                    }
                    blgVar.n = i2;
                    break;
                case "height":
                    blgVar.c = fkaVar.D0();
                    break;
                case "mp4Url":
                    blgVar.f = ch3.W(fkaVar);
                    break;
                case "firstUrl":
                    blgVar.g = ch3.W(fkaVar);
                    break;
                case "updateTime":
                    blgVar.e = ch3.T(fkaVar, 0L);
                    break;
                case "previewUrl":
                    blgVar.h = ch3.W(fkaVar);
                    break;
                case "id":
                    blgVar.a = fkaVar.I0();
                    break;
                case "url":
                    blgVar.d = fkaVar.S0();
                    break;
                case "tags":
                    int iJ = ch3.J(fkaVar);
                    ArrayList arrayList = new ArrayList(iJ);
                    for (int i4 = 0; i4 < iJ; i4++) {
                        arrayList.add(fkaVar.S0());
                    }
                    blgVar.i = arrayList;
                    break;
                case "type":
                    String strW2 = ch3.W(fkaVar);
                    strW2.getClass();
                    switch (strW2) {
                        case "LOTTIE":
                            i2 = 4;
                            break;
                        case "STATIC":
                            i2 = 2;
                            break;
                        case "LIVE":
                            i2 = 3;
                            break;
                    }
                    blgVar.j = i2;
                    break;
                case "audio":
                    blgVar.m = ch3.L(fkaVar);
                    break;
                case "setId":
                    blgVar.k = ch3.T(fkaVar, 0L);
                    break;
                case "token":
                    ch3.W(fkaVar);
                    break;
                case "width":
                    blgVar.b = fkaVar.D0();
                    break;
                case "videoUrl":
                    blgVar.o = ch3.W(fkaVar);
                    break;
                case "lottieUrl":
                    blgVar.l = ch3.W(fkaVar);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
            i++;
        }
    }
}
