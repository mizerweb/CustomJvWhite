package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gf5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w76 w76Var;
        Executor executor;
        boolean z;
        int i;
        long j;
        int iF = -1;
        long j2 = -9223372036854775807L;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((nf5) this.b).h.l(((b87) ((mf5) this.c).c).y);
                return;
            case 1:
                ((rf5) ((xp9) this.b).c).h.c((k4j) this.c);
                return;
            case 2:
                wf5 wf5Var = (wf5) this.b;
                String str = (String) this.c;
                try {
                    wf5Var.e.get();
                    wf5Var.e(wf5.m.decrementAndGet(), wf5.l.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    tvj.c("DeferrableSurface", "Unexpected surface termination for " + wf5Var + "\nStack Trace:\n" + str);
                    synchronized (wf5Var.a) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", wf5Var, Boolean.valueOf(wf5Var.c), Integer.valueOf(wf5Var.b)), e);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case 3:
                Callable callable = (Callable) this.b;
                dh5 dh5Var = (dh5) ((rj5) this.c).b;
                try {
                    dh5Var.q(callable.call());
                    return;
                } catch (Exception e2) {
                    dh5Var.r(e2);
                    return;
                }
            case 4:
                kzi kziVar = (kzi) this.b;
                l81 l81VarO = ((tw5) kziVar.a).o(((ym5) this.c).d);
                if (l81VarO != null) {
                    ss5 ss5Var = l81VarO.d;
                    int i2 = l81VarO.e;
                    long j3 = l81VarO.c;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j4 = l81VarO.b;
                    int i3 = l81VarO.f;
                    int i4 = l81VarO.g;
                    ps5 ps5Var = new ps5();
                    ps5Var.a = l81VarO.a;
                    ps5Var.b = -1.0f;
                    ((tw5) kziVar.a).x(new rp5(ss5Var, i2, j3, jCurrentTimeMillis, j4, i3, i4, ps5Var));
                    return;
                }
                return;
            case 5:
                on5 on5Var = (on5) this.b;
                if (on5Var.d.offer((Runnable) this.c)) {
                    on5Var.a();
                    return;
                } else {
                    ore.k("cannot enqueue any more runnables");
                    return;
                }
            case 6:
                pn5 pn5Var = (pn5) this.b;
                nn5 nn5Var = (nn5) this.c;
                pn5Var.g--;
                SparseIntArray sparseIntArray = pn5Var.b;
                int i5 = nn5Var.d;
                int i6 = sparseIntArray.get(i5) - 1;
                if (i6 != 0) {
                    sparseIntArray.put(i5, i6);
                    return;
                }
                sparseIntArray.delete(i5);
                pn5Var.c.remove(nn5Var);
                pn5Var.a.add(nn5Var);
                return;
            case 7:
                rn5 rn5Var = (rn5) this.b;
                nn5 nn5Var2 = (nn5) this.c;
                rn5Var.g--;
                SparseIntArray sparseIntArray2 = rn5Var.b;
                int i7 = nn5Var2.d;
                int i8 = sparseIntArray2.get(i7) - 1;
                if (i8 != 0) {
                    sparseIntArray2.put(i7, i8);
                    return;
                }
                sparseIntArray2.delete(i7);
                rn5Var.c.remove(nn5Var2);
                rn5Var.a.add(nn5Var2);
                return;
            case 8:
                gs5 gs5Var = (gs5) this.b;
                IOException iOException = (IOException) this.c;
                g85 g85Var = gs5Var.j;
                g85Var.getClass();
                if (((AtomicBoolean) g85Var.a).get()) {
                    return;
                }
                ((AtomicReference) g85Var.d).set(iOException);
                ((CountDownLatch) g85Var.e).countDown();
                return;
            case 9:
                ((g85) this.c).L((gs5) this.b, false);
                return;
            case 10:
                final zv5 zv5Var = (zv5) this.b;
                ich ichVar = (ich) this.c;
                zv5Var.e++;
                xv5 xv5Var = zv5Var.a;
                boolean z3 = ichVar.f;
                Size size = ichVar.b;
                xg7.d((AtomicBoolean) xv5Var.b, true);
                xg7.c((Thread) xv5Var.d);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? xv5Var.n : xv5Var.o);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ichVar.b(surface, zv5Var.c, new ug4() { // from class: yv5
                    @Override // defpackage.ug4
                    public final void accept(Object obj) {
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        zv5 zv5Var2 = zv5Var;
                        zv5Var2.e--;
                        zv5Var2.a();
                    }
                });
                if (z3) {
                    zv5Var.i = surfaceTexture;
                    return;
                } else {
                    zv5Var.j = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(zv5Var, zv5Var.d);
                    return;
                }
            case 11:
                zv5 zv5Var2 = (zv5) this.b;
                cch cchVar = (cch) this.c;
                Surface surfaceG = cchVar.g(zv5Var2.c, new ro7(zv5Var2, 3, cchVar));
                zv5Var2.a.p(surfaceG);
                zv5Var2.h.put(cchVar, surfaceG);
                return;
            case 12:
                ((EglRenderer) this.b).lambda$releaseEglSurface$4((Runnable) this.c);
                return;
            case 13:
                ((EglRenderer) this.b).lambda$release$0((CountDownLatch) this.c);
                return;
            case 14:
                Executor executor2 = (Executor) this.b;
                k86 k86Var = (k86) this.c;
                Objects.requireNonNull(k86Var);
                executor2.execute(new k36(4, k86Var));
                return;
            case 15:
                ((m86) this.b).l.remove((r72) this.c);
                return;
            case 16:
                ((m86) this.b).m.remove((f86) this.c);
                return;
            case 17:
                ((eqb) ((Map.Entry) this.b).getKey()).a((w31) this.c);
                return;
            case 18:
                ((eqb) this.b).a((w31) this.c);
                return;
            case 19:
                i86 i86Var = (i86) this.b;
                eqb eqbVar = (eqb) this.c;
                LinkedHashMap linkedHashMap = i86Var.a;
                eqbVar.getClass();
                linkedHashMap.remove(eqbVar);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                k86 k86Var2 = (k86) this.b;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.c;
                m86 m86Var = k86Var2.l;
                switch (qt4.D(m86Var.F)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        m86Var.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        ore.k("Unknown state: ".concat(x05.r(m86Var.F)));
                        return;
                }
            case 21:
                k86 k86Var3 = (k86) this.b;
                MediaFormat mediaFormat = (MediaFormat) this.c;
                boolean z4 = k86Var3.j;
                m86 m86Var2 = k86Var3.l;
                if (z4) {
                    tvj.g(m86Var2.a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (qt4.D(m86Var2.F)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (k86Var3.l.b) {
                            m86 m86Var3 = k86Var3.l;
                            w76Var = m86Var3.t;
                            executor = m86Var3.u;
                            break;
                        }
                        try {
                            executor.execute(new gf5(w76Var, 22, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e3) {
                            tvj.d(k86Var3.l.a, "Unable to post to the supplied executor.", e3);
                            return;
                        }
                    default:
                        ore.k("Unknown state: ".concat(x05.r(k86Var3.l.F)));
                        return;
                }
            case 22:
                ((w76) this.b).m(new s63(23, (MediaFormat) this.c));
                return;
            case 23:
                ((w76) this.b).c((o76) this.c);
                return;
            case 24:
                bg6 bg6Var = (bg6) this.b;
                hg6 hg6Var = (hg6) this.c;
                int i9 = bg6Var.K - hg6Var.b;
                bg6Var.K = i9;
                if (hg6Var.e) {
                    bg6Var.L = hg6Var.c;
                    bg6Var.M = true;
                }
                if (i9 == 0) {
                    ush ushVar = ((r2d) hg6Var.f).a;
                    if (!bg6Var.t0.a.p() && ushVar.p()) {
                        bg6Var.u0 = -1;
                        bg6Var.v0 = 0L;
                    }
                    if (!ushVar.p()) {
                        List listAsList = Arrays.asList(((r4d) ushVar).l);
                        lvb.b0(listAsList.size() == bg6Var.q.size());
                        for (int i10 = 0; i10 < listAsList.size(); i10++) {
                            ((zf6) bg6Var.q.get(i10)).c = (ush) listAsList.get(i10);
                        }
                    }
                    if (bg6Var.M) {
                        boolean z5 = ((r2d) hg6Var.f).a.p() && bg6Var.t0.a.p();
                        boolean zEquals = ((r2d) hg6Var.f).b.equals(bg6Var.t0.b);
                        boolean z6 = ((r2d) hg6Var.f).d == bg6Var.t0.s;
                        if (z5 || (zEquals && z6)) {
                            z2 = false;
                        }
                        if (z2) {
                            iF = bg6Var.F();
                            if (ushVar.p() || ((r2d) hg6Var.f).b.b()) {
                                j2 = ((r2d) hg6Var.f).d;
                            } else {
                                r2d r2dVar = (r2d) hg6Var.f;
                                x4a x4aVar = r2dVar.b;
                                long j5 = r2dVar.d;
                                Object obj = x4aVar.a;
                                rsh rshVar = bg6Var.p;
                                ushVar.g(obj, rshVar);
                                j2 = j5 + rshVar.e;
                            }
                        }
                        i = iF;
                        j = j2;
                        z = z2;
                    } else {
                        z = false;
                        i = -1;
                        j = -9223372036854775807L;
                    }
                    bg6Var.M = false;
                    bg6Var.G0((r2d) hg6Var.f, 1, z, bg6Var.L, j, i, false);
                    return;
                }
                return;
            case 25:
                g85 g85Var2 = (g85) this.b;
                ((u89) g85Var2.a).f(-1, new s63(g85Var2, (b2i) this.c));
                return;
            case 26:
                ((FeedbackListenerManagerImpl) this.b).notifyResolvedFeedbackItems((ArrayList) this.c);
                return;
            case 27:
                ((uu6) this.b).j.a(VideoFrameProcessingException.a(-9223372036854775807L, (InterruptedException) this.c));
                return;
            case 28:
                ((uu6) this.b).j.a(VideoFrameProcessingException.a(-9223372036854775807L, (GlUtil$GlException) this.c));
                return;
            default:
                ((uu6) this.b).j.a((VideoFrameProcessingException) this.c);
                return;
        }
    }
}
