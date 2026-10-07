package defpackage;

import one.me.statistics.androidperf.memory.MemoryRegistrarException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jba extends fg7 implements cf7 {
    public static final jba a = new jba(1, MemoryRegistrarException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return new MemoryRegistrarException((Throwable) obj);
    }
}
