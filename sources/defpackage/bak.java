package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class bak {
    public static final String[] E = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public final bv4 A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final y3e a;
    public final c5f b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public csb f;
    public y55 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final nsh u;
    public final nsh v;
    public final nsh w;
    public final nsh x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    public bak(y3e y3eVar, esh eshVar, c5f c5fVar) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1L;
        this.i = 0L;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new nsh();
        this.v = new nsh();
        this.w = new nsh();
        this.x = new nsh();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = y3eVar;
        this.b = c5fVar;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new bv4(eshVar);
    }

    public final void a() {
        if (this.C) {
            return;
        }
        this.C = true;
        HandlerThread handlerThread = this.d;
        Handler handler = this.e;
        myj myjVar = new myj(2, this);
        handler.removeCallbacksAndMessages(null);
        handler.post(myjVar);
        handlerThread.quitSafely();
    }
}
