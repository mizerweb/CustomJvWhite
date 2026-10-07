package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class rbc {
    public final Thread.UncaughtExceptionHandler a;
    public final f5h b;
    public final y1c c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public rbc(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, f5h f5hVar, y1c y1cVar) {
        this.a = uncaughtExceptionHandler;
        this.b = f5hVar;
        this.c = y1cVar;
    }

    public final ThreadFactory a(String str, Integer num, boolean z, boolean z2) {
        return (ThreadFactory) this.d.computeIfAbsent(str, new mm(14, new qbc(str, this, num, z, z2)));
    }
}
