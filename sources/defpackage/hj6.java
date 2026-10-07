package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hj6 extends u7e {
    public static final int[] x = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final int[] y = {1920, 1088};
    public static final long z;
    public final wm7 e;
    public md5 f;
    public final int g;
    public final Surface h;
    public final SurfaceTexture i;
    public final float[] j;
    public final ConcurrentLinkedQueue k;
    public final ScheduledExecutorService l;
    public final boolean m;
    public int n;
    public int o;
    public boolean p;
    public oc7 q;
    public oc7 r;
    public boolean s;
    public ScheduledFuture t;
    public CountDownLatch u;
    public volatile boolean v;
    public volatile RuntimeException w;

    static {
        z = vqi.S() ? 20000L : 500L;
    }

    public hj6(wm7 wm7Var, final o02 o02Var, boolean z2, boolean z3) throws VideoFrameProcessingException {
        super(o02Var);
        this.e = wm7Var;
        this.s = z2;
        this.m = z3;
        try {
            int iS = tab.s();
            tab.c(36197, iS, 9729);
            this.g = iS;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iS);
            this.i = surfaceTexture;
            this.j = new float[16];
            this.k = new ConcurrentLinkedQueue();
            this.l = Executors.newSingleThreadScheduledExecutor(new g94("ExtTexMgr:Timer", 1));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: gj6
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    o02Var.q(new fj6(this.a, 3), false);
                }
            });
            this.h = new Surface(surfaceTexture);
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static float D(int i, float f) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 *= 2) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (G(i4, f, i) < G(i2, f, i)) {
                i2 = i4;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = y[i5];
            if (i6 >= i && G(i6, f, i) < G(i2, f, i)) {
                i2 = i6;
            }
        }
        return G(i2, f, i) > 1.0E-9f ? f : i / i2;
    }

    public static float G(int i, float f, int i2) {
        float fAbs = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f2 = ((i2 - i3) / i) - f;
            if (Math.abs(f2) < fAbs) {
                fAbs = Math.abs(f2);
            }
        }
        return fAbs;
    }

    public final void E() {
        if (this.n == 0 || this.o == 0 || this.q != null) {
            return;
        }
        this.i.updateTexImage();
        int i = 1;
        this.o--;
        oc7 oc7Var = (oc7) this.k.element();
        this.q = oc7Var;
        this.n--;
        this.i.getTransformMatrix(this.j);
        long timestamp = (this.i.getTimestamp() / 1000) + oc7Var.b;
        if (this.m) {
            float[] fArr = this.j;
            b87 b87Var = oc7Var.a;
            int i2 = b87Var.u;
            int i3 = b87Var.v;
            int i4 = 0;
            int i5 = fArr.length != 16 ? 1 : 0;
            int[] iArr = x;
            for (int i6 = 0; i6 < 8; i6++) {
                i5 |= Math.abs(fArr[iArr[i6]]) > 1.0E-9f ? 1 : 0;
            }
            int i7 = i5 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            byte b = 13;
            byte b2 = 12;
            byte b3 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i7 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                b2 = 13;
                b = 12;
                b3 = 5;
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                i4 = -1;
                b = -1;
                b2 = -1;
                b3 = -1;
            } else {
                i4 = 1;
                i = i7 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (i != 0) {
                LinkedHashMap linkedHashMap = g55.a;
                synchronized (g55.class) {
                }
            } else {
                float f = fArr[i4];
                float f2 = fArr[b];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float fCopySign = Math.copySign(D(i2, Math.abs(f)), f);
                    float fC = c0a.c(f, fCopySign, 0.5f, f2);
                    LinkedHashMap linkedHashMap2 = g55.a;
                    synchronized (g55.class) {
                    }
                    fArr[i4] = fCopySign;
                    fArr[b] = fC;
                }
                float f3 = fArr[b3];
                float f4 = fArr[b2];
                if (Math.abs(f3) + 1.0E-9f < 1.0f) {
                    float fCopySign2 = Math.copySign(D(i3, Math.abs(f3)), f3);
                    float fC2 = c0a.c(f3, fCopySign2, 0.5f, f4);
                    LinkedHashMap linkedHashMap3 = g55.a;
                    synchronized (g55.class) {
                    }
                    fArr[b3] = fCopySign2;
                    fArr[b2] = fC2;
                }
            }
        }
        md5 md5Var = this.f;
        md5Var.getClass();
        md5Var.h.A("uTexTransformationMatrix", this.j);
        md5 md5Var2 = this.f;
        md5Var2.getClass();
        wm7 wm7Var = this.e;
        int i8 = this.g;
        b87 b87Var2 = oc7Var.a;
        md5Var2.b(wm7Var, new dn7(i8, -1, b87Var2.u, b87Var2.v), timestamp);
        ((oc7) this.k.remove()).getClass();
        g55.a();
    }

    public final void F() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.o;
            concurrentLinkedQueue = this.k;
            if (i <= 0) {
                break;
            }
            this.o = i - 1;
            this.i.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.u == null || !concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.u.countDown();
    }

    @Override // defpackage.u7e
    public final void a() {
        this.v = true;
    }

    @Override // defpackage.u7e
    public final void b() {
        this.n = 0;
        this.q = null;
        this.k.clear();
        this.r = null;
        super.b();
    }

    @Override // defpackage.u7e
    public final Surface d() {
        return this.h;
    }

    @Override // defpackage.u7e
    public final int f() {
        return this.k.size();
    }

    @Override // defpackage.u7e
    public final void l(oc7 oc7Var) {
        this.r = oc7Var;
        if (!this.s) {
            this.k.add(oc7Var);
        }
        ((o02) this.a).q(new fj6(this, 0), true);
    }

    @Override // defpackage.u7e
    public final void m() {
        this.i.release();
        this.h.release();
        this.l.shutdownNow();
    }

    @Override // defpackage.u7e
    public final void n() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.u = countDownLatch;
        ((o02) this.a).q(new fj6(this, 2), true);
        try {
            if (!countDownLatch.await(z, TimeUnit.MILLISECONDS)) {
                lvb.G0("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            lvb.G0("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.u = null;
        if (this.w != null) {
            throw this.w;
        }
    }

    @Override // defpackage.u7e
    public final void q(oc7 oc7Var, boolean z2) {
        this.s = z2;
        if (z2) {
            this.r = oc7Var;
            b87 b87Var = oc7Var.a;
            this.i.setDefaultBufferSize(b87Var.u, b87Var.v);
        }
    }

    @Override // defpackage.u7e
    public final void s(md5 md5Var) {
        this.n = 0;
        this.f = md5Var;
    }

    @Override // defpackage.u7e
    public final void t() {
        ((o02) this.a).q(new fj6(this, 1), true);
    }

    @Override // defpackage.an7
    public final void y() {
        ((o02) this.a).q(new zo2(this, 2, this.f), true);
    }

    @Override // defpackage.an7
    public final void z(dn7 dn7Var) {
        ((o02) this.a).q(new fj6(this, 4), true);
    }
}
