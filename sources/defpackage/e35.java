package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e35 {
    public static final HashMap a = wm9.O0(new ylc(0, vdc.a), new ylc(1, vdc.b), new ylc(2, vdc.c), new ylc(3, vdc.d), new ylc(4, vdc.e), new ylc(5, vdc.f), new ylc(6, vdc.g), new ylc(7, vdc.h));

    public static vdc a(int i) {
        vdc vdcVar = (vdc) a.get(Integer.valueOf(i));
        return vdcVar == null ? vdc.i : vdcVar;
    }
}
