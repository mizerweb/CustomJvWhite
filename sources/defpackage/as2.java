package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class as2 {
    public final Object a;
    public final gu4 b;
    public final rgi c;
    public final pe3 d;
    public final String e;
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);

    public as2(Object obj, gu4 gu4Var, rgi rgiVar, pe3 pe3Var) {
        this.a = obj;
        this.b = gu4Var;
        this.c = rgiVar;
        this.d = pe3Var;
        this.e = c0a.n(obj, "ChannelQueueElement#");
    }
}
