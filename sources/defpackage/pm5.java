package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pm5 {
    public static final HashMap a = wm9.O0(new ylc(0, wdc.a), new ylc(1, wdc.b), new ylc(2, wdc.c), new ylc(3, wdc.d), new ylc(4, wdc.e), new ylc(5, wdc.f));

    public static wdc a(int i) {
        wdc wdcVar = (wdc) a.get(Integer.valueOf(i));
        return wdcVar == null ? wdc.g : wdcVar;
    }
}
