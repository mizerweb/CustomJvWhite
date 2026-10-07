package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class y2l extends e3l {
    public static e4l a(Object obj) {
        return new h3l(obj);
    }

    public static void b(e4l e4lVar, s2l s2lVar, Executor executor) {
        e4lVar.a(new v2l(e4lVar, s2lVar), executor);
    }

    public static e4l c(bcm bcmVar, Executor executor) {
        p4l p4lVar = new p4l(bcmVar);
        p4lVar.run();
        return p4lVar;
    }
}
