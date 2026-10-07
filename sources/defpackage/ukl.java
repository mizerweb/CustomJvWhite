package defpackage;

import java.lang.ref.WeakReference;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ukl {
    public static final Object a(AsynchronousSocketChannel asynchronousSocketChannel, InetSocketAddress inetSocketAddress, juh juhVar) {
        ek2 ek2Var = new ek2(1, p90.B(juhVar));
        ek2Var.u();
        asynchronousSocketChannel.connect(inetSocketAddress, new WeakReference(ek2Var), z10.c);
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbi.a;
    }

    public static sjd b(mjd mjdVar, oof oofVar, jk8 jk8Var) {
        return new sjd(mjdVar, oofVar, jk8Var);
    }
}
