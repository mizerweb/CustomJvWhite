package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface gd2 {
    default void a(ke6 ke6Var) {
        int i;
        String str;
        ArrayList arrayList = ke6Var.a;
        int iC = c();
        if (iC == 1) {
            return;
        }
        int iD = qt4.D(iC);
        if (iD == 1) {
            i = 32;
        } else if (iD == 2) {
            i = 0;
        } else {
            if (iD != 3) {
                if (iC == 1) {
                    str = "UNKNOWN";
                } else if (iC == 2) {
                    str = "NONE";
                } else if (iC != 3) {
                    str = iC != 4 ? "null" : "FIRED";
                } else {
                    str = "READY";
                }
                tvj.g("ExifData", "Unknown flash state: ".concat(str));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            ke6Var.c("LightSource", String.valueOf(4), arrayList);
        }
        ke6Var.c("Flash", String.valueOf(i), arrayList);
    }

    int c();

    ghh d();

    long getTimestamp();

    dd2 r();

    ed2 s();

    cd2 w();
}
