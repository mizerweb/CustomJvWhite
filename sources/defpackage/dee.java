package defpackage;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.LruCache;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.muxer.MuxerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class dee implements u2j {
    public static final long A0;
    public static final Set o0 = Collections.unmodifiableSet(EnumSet.of(cee.b, cee.c));
    public static final Set p0 = Collections.unmodifiableSet(EnumSet.of(cee.a, cee.d, cee.h, cee.g, cee.i));
    public static final m1e q0;
    public static final n4j r0;
    public static final o5a s0;
    public static final RuntimeException t0;
    public static final ude u0;
    public static final bwi v0;
    public static final vde w0;
    public static final ahc x0;
    public static final eif y0;
    public static final int z0;
    public ich A;
    public msh B;
    public final v30 F;
    public final v30 a;
    public final v30 b;
    public final Executor c;
    public final Executor d;
    public i5b d0;
    public final eif e;
    public final z76 f;
    public final z76 g;
    public final vde h;
    public final ujc i;
    public final long k;
    public final Object j = new Object();
    public final v30 l = new v30(null);
    public cee m = cee.a;
    public cee n = null;
    public int o = 0;
    public qi0 p = null;
    public qi0 q = null;
    public long r = 0;
    public qi0 s = null;
    public boolean t = false;
    public dj0 u = null;
    public dj0 v = null;
    public mj0 w = null;
    public final ArrayList x = new ArrayList();
    public Integer y = null;
    public Integer z = null;
    public Surface C = null;
    public Surface D = null;
    public r9b E = null;
    public wb0 G = null;
    public m86 H = null;
    public s63 I = null;
    public m86 J = null;
    public s63 K = null;
    public int m0 = 1;
    public Uri L = Uri.EMPTY;
    public long M = 0;
    public long N = 0;
    public long O = 0;
    public long P = BuildConfig.MAX_TIME_TO_UPLOAD;
    public long Q = BuildConfig.MAX_TIME_TO_UPLOAD;
    public long R = BuildConfig.MAX_TIME_TO_UPLOAD;
    public long S = BuildConfig.MAX_TIME_TO_UPLOAD;
    public long T = 0;
    public long U = 0;
    public int V = 1;
    public Throwable W = null;
    public n76 X = null;
    public final a9m Y = new a9m(60, (dzh) null);
    public Throwable Z = null;
    public boolean a0 = false;
    public int n0 = 3;
    public ScheduledFuture b0 = null;
    public boolean c0 = false;
    public kj0 e0 = null;
    public i5b f0 = null;
    public double g0 = 0.0d;
    public boolean h0 = false;
    public bee i0 = null;
    public i1m j0 = null;
    public long k0 = BuildConfig.MAX_TIME_TO_UPLOAD;
    public boolean l0 = false;

    static {
        pi0 pi0Var = pi0.g;
        m1e m1eVarB = m1e.b(Arrays.asList(pi0Var, pi0.f, pi0.e), new mh0(pi0Var, 1));
        q0 = m1eVarB;
        n4j n4jVar = new n4j(m1eVarB, 0, -1, "video/*");
        r0 = n4jVar;
        s0 = new o5a(n4jVar, xb0.c, -1);
        t0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        u0 = new ude(0);
        v0 = cwi.c;
        w0 = new vde(0);
        x0 = new ahc(9);
        y0 = new eif(zjl.c());
        z0 = 3;
        A0 = 1000L;
    }

    public dee(ExecutorService executorService, o5a o5aVar, z76 z76Var, z76 z76Var2, vde vdeVar, ujc ujcVar, long j) {
        this.c = executorService;
        Executor executorC = executorService == null ? zjl.c() : executorService;
        this.d = executorC;
        eif eifVar = new eif(executorC);
        this.e = eifVar;
        n4j n4jVar = n4j.e;
        n4j n4jVar2 = n4j.e;
        n4j n4jVar3 = o5aVar.a;
        xb0 xb0Var = o5aVar.b;
        int i = o5aVar.c;
        if (n4jVar3.c == -1) {
            n4j n4jVar4 = n4j.e;
            n4jVar3 = new n4j(n4jVar3.a, n4jVar3.b, r0.c, n4jVar3.d);
        }
        this.F = new v30(new o5a(n4jVar3, xb0Var, i));
        this.a = new v30(new xi0(this.o, q(this.m), null));
        this.b = new v30(Boolean.FALSE);
        this.f = z76Var;
        this.g = z76Var2;
        this.h = vdeVar;
        this.i = ujcVar;
        this.d0 = new i5b(z76Var, eifVar, executorC);
        long j2 = j != -1 ? j : 52428800L;
        this.k = j2;
        tvj.a("Recorder", "mRequiredFreeStorageBytes = " + url.a(j2));
    }

    public static s86 m(int i, nf2 nf2Var) {
        s86 s86Var;
        bwi bwiVar = v0;
        LruCache lruCache = v86.a;
        ifh ifhVar = new ifh(new t86(nf2Var, i, bwiVar, 0));
        if (nf2Var instanceof ja) {
            ja jaVar = (ja) nf2Var;
            nf2 nf2Var2 = jaVar.a;
            if (!nf2Var2.e() && nf2Var2.j() != -1) {
                u86 u86Var = new u86(jaVar.a.g(), jaVar.c, i, bwiVar);
                LruCache lruCache2 = v86.a;
                synchronized (lruCache2) {
                    s86Var = (s86) lruCache2.get(u86Var);
                    if (s86Var == null) {
                        s86Var = (s86) ifhVar.getValue();
                        lruCache2.put(u86Var, s86Var);
                    }
                }
                return s86Var;
            }
        }
        return (s86) ifhVar.getValue();
    }

    public static Object o(v30 v30Var) {
        try {
            return v30Var.f().get();
        } catch (InterruptedException | ExecutionException e) {
            qr7.w(e);
            return null;
        }
    }

    public static int q(cee ceeVar) {
        return (ceeVar == cee.e || ceeVar == cee.g) ? 1 : 2;
    }

    public static boolean t(fee feeVar, qi0 qi0Var) {
        return qi0Var != null && feeVar.c == qi0Var.m;
    }

    public static void v(m86 m86Var) {
        if (m86Var != null) {
            tvj.a(m86Var.a, "signalSourceStopped");
            m86Var.h.execute(new a86(m86Var, 5));
        }
    }

    public final void A() {
        if (this.J != null) {
            tvj.a("Recorder", "Releasing audio encoder.");
            m86 m86Var = this.J;
            m86Var.h.execute(new a86(m86Var, 4));
            this.J = null;
            this.K = null;
        }
        if (this.G != null) {
            y();
        }
        E(1);
        B();
    }

    public final void B() {
        ich ichVar;
        boolean z = true;
        if (this.H != null) {
            tvj.a("Recorder", "Releasing video encoder.");
            i5b i5bVar = this.f0;
            if (i5bVar != null) {
                qyj.l(null, ((m86) i5bVar.f) == this.H);
                tvj.a("Recorder", "Releasing video encoder: " + this.H);
                this.f0.e();
                this.f0 = null;
                this.H = null;
                this.I = null;
                G(null);
            } else {
                D();
            }
        }
        synchronized (this.j) {
            try {
                switch (this.m.ordinal()) {
                    case 1:
                    case 2:
                        P(cee.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (s()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        H(cee.a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c0 = false;
        if (!z || (ichVar = this.A) == null || ichVar.h.b.isDone()) {
            return;
        }
        j(this.A, this.B, false);
    }

    public final void C() {
        if (o0.contains(this.m)) {
            H(this.n);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.m);
    }

    public final e89 D() {
        tvj.a("Recorder", "Try to safely release video encoder: " + this.H);
        i5b i5bVar = this.d0;
        i5bVar.a();
        return o9b.g((e89) i5bVar.i);
    }

    public final void E(int i) {
        tvj.a("Recorder", "Transitioning audio state: " + iic.q(this.m0) + " --> " + iic.q(i));
        this.m0 = i;
    }

    public final void F(dj0 dj0Var) {
        tvj.a("Recorder", "Update stream transformation info: " + dj0Var);
        this.u = dj0Var;
        synchronized (this.j) {
            this.a.D(new xi0(this.o, q(this.m), dj0Var));
        }
    }

    public final void G(Surface surface) {
        int iHashCode;
        if (this.C == surface) {
            return;
        }
        this.C = surface;
        synchronized (this.j) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            I(iHashCode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    public final void H(cee ceeVar) {
        int iQ;
        if (this.m == ceeVar) {
            throw new AssertionError("Attempted to transition to state " + ceeVar + ", but Recorder is already in state " + ceeVar);
        }
        tvj.a("Recorder", "Transitioning Recorder internal state: " + this.m + " --> " + ceeVar);
        Set set = o0;
        if (set.contains(ceeVar)) {
            if (!set.contains(this.m)) {
                boolean zContains = p0.contains(this.m);
                cee ceeVar2 = this.m;
                if (!zContains) {
                    ahc.f(ceeVar2, "Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    return;
                } else {
                    this.n = ceeVar2;
                    iQ = q(ceeVar2);
                }
            }
            this.m = ceeVar;
            if (iQ == 0) {
                iQ = q(ceeVar);
            }
            this.a.D(new xi0(this.o, iQ, this.u));
        }
        if (this.n != null) {
            this.n = null;
        }
        iQ = 0;
        this.m = ceeVar;
        if (iQ == 0) {
            iQ = q(ceeVar);
        }
        this.a.D(new xi0(this.o, iQ, this.u));
    }

    public final void I(int i) {
        if (this.o == i) {
            return;
        }
        tvj.a("Recorder", "Transitioning streamId: " + this.o + " --> " + i);
        this.o = i;
        this.a.D(new xi0(i, q(this.m), this.u));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    public final void J(qi0 qi0Var) {
        int i;
        if (this.E != null) {
            c.e("Unable to set up muxer when one already exists.");
            return;
        }
        boolean zR = r();
        a9m a9mVar = this.Y;
        if (zR && a9mVar.g()) {
            c.e("Audio is enabled but no audio sample is ready. Cannot start muxer.");
            return;
        }
        n76 n76Var = this.X;
        if (n76Var == null) {
            c.e("Muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            this.X = null;
            long jU = n76Var.U();
            ArrayList arrayList = new ArrayList();
            while (!a9mVar.g()) {
                n76 n76Var2 = (n76) a9mVar.d();
                if (n76Var2.U() >= jU) {
                    arrayList.add(n76Var2);
                }
            }
            long size = n76Var.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((n76) it.next()).size();
            }
            long j = this.T;
            if (j != 0 && size > j) {
                tvj.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T)));
                w(qi0Var, 2, null);
                n76Var.close();
                return;
            }
            int i2 = 3;
            try {
                int i3 = ((o5a) o(this.F)).c;
                if (i3 == -1) {
                    mj0 mj0Var = this.w;
                    i = s0.c == 1 ? 1 : 0;
                    if (mj0Var != null) {
                        int i4 = mj0Var.b;
                        if (i4 == 1) {
                            i = 2;
                        } else if (i4 == 2) {
                            i = 0;
                        } else if (i4 == 9) {
                            i = 1;
                        }
                    }
                } else if (i3 == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                r9b r9bVarY = qi0Var.y(i, new mx1(2, this));
                dj0 dj0Var = this.v;
                if (dj0Var != null) {
                    F(dj0Var);
                    try {
                        r9bVarY.b(dj0Var.b);
                    } catch (IllegalArgumentException e) {
                        r9bVarY.release();
                        w(qi0Var, 5, e);
                        n76Var.close();
                        return;
                    }
                }
                nh0 nh0Var = qi0Var.h.a;
                kj0 kj0Var = this.e0;
                kj0Var.getClass();
                int i5 = kj0Var.g;
                if (i5 > kj0Var.h) {
                    try {
                        r9bVarY.j(i5);
                    } catch (IllegalArgumentException e2) {
                        r9bVarY.release();
                        w(qi0Var, 5, e2);
                        n76Var.close();
                        return;
                    }
                }
                try {
                    tvj.a("Recorder", "Muxer.addTrack() for video " + ((MediaFormat) this.I.b));
                    this.z = Integer.valueOf(r9bVarY.i((MediaFormat) this.I.b));
                    if (r()) {
                        tvj.a("Recorder", "Muxer.addTrack() for audio " + ((MediaFormat) this.K.b));
                        this.y = Integer.valueOf(r9bVarY.i((MediaFormat) this.K.b));
                    }
                    tvj.a("Recorder", "Muxer.start()");
                    r9bVarY.start();
                    this.E = r9bVarY;
                    R(n76Var, qi0Var);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Q((n76) it2.next(), qi0Var);
                    }
                    n76Var.close();
                } catch (MuxerException e3) {
                    tvj.i("Recorder", "Failed to setup and start muxer", e3);
                    r9bVarY.release();
                    if (!p(e3)) {
                        i2 = 1;
                    }
                    w(qi0Var, i2, e3);
                    n76Var.close();
                }
            } catch (IOException e4) {
                if (!p(e4)) {
                    i2 = 5;
                }
                w(qi0Var, i2, e4);
                n76Var.close();
            }
        } catch (Throwable th) {
            try {
                n76Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void K(qi0 qi0Var) {
        gh0 gh0Var;
        gh0 gh0Var2;
        o5a o5aVar = (o5a) o(this.F);
        mj0 mj0Var = this.w;
        xb0 xb0Var = o5aVar.b;
        int i = o5aVar.c;
        String str = i == 1 ? "audio/vorbis" : "audio/mp4a-latm";
        int i2 = (i != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (mj0Var == null || (gh0Var2 = mj0Var.e) == null) {
            gh0Var = null;
        } else {
            String str2 = gh0Var2.b;
            int i3 = gh0Var2.f;
            if (str2.equals("audio/none")) {
                tvj.a("AudioConfigUtil", c0a.l(i2, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: ", str, "(profile: ", ")]"));
            } else {
                if (i == -1) {
                    tvj.a("AudioConfigUtil", c0a.l(i3, "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using EncoderProfiles to derive AUDIO settings [mime type: ", str2, "(profile: ", ")]"));
                    str = str2;
                    i2 = i3;
                } else if (str.equals(str2) && i2 == i3) {
                    tvj.a("AudioConfigUtil", c0a.l(i2, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: ", str2, "(profile: ", ")]"));
                    str = str2;
                } else {
                    StringBuilder sbR = c0a.r(i3, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ", str2, "(profile: ", "), chosen mime type: ");
                    sbR.append(str);
                    sbR.append("(profile: ");
                    sbR.append(i2);
                    sbR.append(")]");
                    tvj.a("AudioConfigUtil", sbR.toString());
                }
                gh0Var = gh0Var2;
            }
            gh0Var2 = null;
            gh0Var = gh0Var2;
        }
        String str3 = str;
        kj0 kj0Var = this.e0;
        kj0Var.getClass();
        int i4 = kj0Var.h;
        int i5 = kj0Var.g;
        Rational rational = i5 > i4 ? new Rational(i5, i4) : null;
        rg0 rg0Var = (rg0) (gh0Var != null ? new kr6(xb0Var, gh0Var, rational) : new fik(xb0Var, 4, rational)).get();
        if (this.G != null) {
            y();
        }
        if (!qi0Var.k) {
            ahc.f(qi0Var, "Recording does not have audio enabled. Unable to create audio source for recording ");
            return;
        }
        aee aeeVar = (aee) qi0Var.d.getAndSet(null);
        if (aeeVar == null) {
            ahc.f(qi0Var, "One-time audio source creation has already occurred for recording ");
            return;
        }
        wb0 wb0Var = new wb0(rg0Var, y0, aeeVar.a);
        this.G = wb0Var;
        tvj.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(wb0Var.hashCode())));
        qg0 qg0Var = (qg0) (gh0Var != null ? new a9m(str3, i2, xb0Var, rg0Var, gh0Var) : new ed7(str3, i2, xb0Var, rg0Var)).get();
        ich ichVar = this.A;
        ichVar.getClass();
        m86 m86VarA = this.g.a(this.d, qg0Var, ichVar.g);
        this.J = m86VarA;
        t76 t76Var = m86VarA.f;
        if (!(t76Var instanceof i86)) {
            c.e("The EncoderInput of audio isn't a ByteBufferInput.");
        } else {
            wb0 wb0Var2 = this.G;
            wb0Var2.a.execute(new qe(wb0Var2, 9, (i86) t76Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    public final void L(qi0 qi0Var, boolean z) {
        if (this.s != null) {
            c.e("Attempted to start a new recording while another was in progress.");
            return;
        }
        this.s = qi0Var;
        xr6 xr6Var = qi0Var.h;
        boolean z2 = qi0Var.k;
        i1m i1mVarA = this.i.a(xr6Var);
        this.j0 = i1mVarA;
        long jZ = i1mVarA.Z();
        tvj.a("Recorder", "availableBytes = " + url.a(jZ));
        long j = this.k;
        if (jZ < j) {
            k(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jZ), Long.valueOf(j))));
        } else {
            this.k0 = jZ - j;
            long j2 = xr6Var.a.a;
            if (j2 > 0) {
                this.T = Math.round(j2 * 0.95d);
                tvj.a("Recorder", "File size limit in bytes: " + this.T);
            } else {
                this.T = 0L;
            }
            long j3 = xr6Var.a.b;
            if (j3 > 0) {
                this.U = TimeUnit.MILLISECONDS.toMicros(j3);
                tvj.a("Recorder", "Duration limit in microseconds: " + this.U);
            } else {
                this.U = 0L;
            }
            int iD = qt4.D(this.m0);
            if (iD != 0) {
                if (iD == 1) {
                    E(z2 ? 4 : 3);
                } else if (iD == 2 || iD == 3 || iD == 4 || iD == 5) {
                    c.e("Incorrectly invoke startInternal in audio state ".concat(iic.q(this.m0)));
                    return;
                }
            } else if (z2) {
                xb0 xb0Var = ((o5a) o(this.F)).b;
                try {
                    if (!this.s.l || this.J == null) {
                        K(qi0Var);
                    }
                    E(4);
                } catch (AudioSourceAccessException e) {
                    e = e;
                    tvj.d("Recorder", "Unable to create audio resource with error: ", e);
                    E(e instanceof InvalidConfigException ? 5 : 6);
                    this.Z = e;
                } catch (InvalidConfigException e2) {
                    e = e2;
                    tvj.d("Recorder", "Unable to create audio resource with error: ", e);
                    E(e instanceof InvalidConfigException ? 5 : 6);
                    this.Z = e;
                }
            }
            N(qi0Var, false);
            if (r()) {
                wb0 wb0Var = this.G;
                wb0Var.a.execute(new ub0(wb0Var, qi0Var.f.get(), 0));
                this.J.l();
            }
            this.H.l();
            qi0 qi0Var2 = this.s;
            qi0Var2.A(new t3j(qi0Var2.h, n()), true);
        }
        if (z) {
            x(qi0Var);
        }
    }

    public final void M(qi0 qi0Var, long j, int i, Throwable th) throws Exception {
        if (this.s != qi0Var || this.t) {
            return;
        }
        this.t = true;
        this.V = i;
        this.W = th;
        if (r()) {
            while (true) {
                a9m a9mVar = this.Y;
                if (a9mVar.g()) {
                    break;
                } else {
                    ((n76) a9mVar.d()).close();
                }
            }
            m86 m86Var = this.J;
            m86Var.h.execute(new e86(0, j, m86Var.q.x(), m86Var));
        }
        n76 n76Var = this.X;
        if (n76Var != null) {
            n76Var.close();
            this.X = null;
        }
        if (this.n0 != 2) {
            this.b0 = zjl.d().schedule(new i7b(this.e, 29, new ff(11)), 1000L, TimeUnit.MILLISECONDS);
        } else {
            v(this.H);
        }
        m86 m86Var2 = this.H;
        m86Var2.h.execute(new e86(0, j, m86Var2.q.x(), m86Var2));
    }

    public final void N(final qi0 qi0Var, boolean z) {
        ArrayList arrayList = this.x;
        final int i = 1;
        if (!arrayList.isEmpty()) {
            j79 j79Var = new j79(new ArrayList(arrayList), true, zjl.a());
            if (!j79Var.isDone()) {
                j79Var.cancel(true);
            }
            arrayList.clear();
        }
        final int i2 = 0;
        arrayList.add(f55.m(new s72(this) { // from class: sde
            public final /* synthetic */ dee b;

            {
                this.b = this;
            }

            @Override // defpackage.s72
            public final Object Q(r72 r72Var) {
                switch (i2) {
                    case 0:
                        dee deeVar = this.b;
                        qi0 qi0Var2 = qi0Var;
                        m86 m86Var = deeVar.H;
                        r6a r6aVar = new r6a(false, deeVar, r72Var, qi0Var2);
                        eif eifVar = deeVar.e;
                        synchronized (m86Var.b) {
                            m86Var.t = r6aVar;
                            m86Var.u = eifVar;
                            break;
                        }
                        return "videoEncodingFuture";
                    default:
                        dee deeVar2 = this.b;
                        qi0 qi0Var3 = qi0Var;
                        ro7 ro7Var = new ro7(deeVar2, 4, r72Var);
                        wb0 wb0Var = deeVar2.G;
                        eif eifVar2 = deeVar2.e;
                        wb0Var.a.execute(new i0(wb0Var, eifVar2, new kzi(deeVar2, ro7Var), 4));
                        m86 m86Var2 = deeVar2.J;
                        xde xdeVar = new xde(deeVar2, r72Var, ro7Var, qi0Var3);
                        synchronized (m86Var2.b) {
                            m86Var2.t = xdeVar;
                            m86Var2.u = eifVar2;
                            break;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (r() && !z) {
            arrayList.add(f55.m(new s72(this) { // from class: sde
                public final /* synthetic */ dee b;

                {
                    this.b = this;
                }

                @Override // defpackage.s72
                public final Object Q(r72 r72Var) {
                    switch (i) {
                        case 0:
                            dee deeVar = this.b;
                            qi0 qi0Var2 = qi0Var;
                            m86 m86Var = deeVar.H;
                            r6a r6aVar = new r6a(false, deeVar, r72Var, qi0Var2);
                            eif eifVar = deeVar.e;
                            synchronized (m86Var.b) {
                                m86Var.t = r6aVar;
                                m86Var.u = eifVar;
                                break;
                            }
                            return "videoEncodingFuture";
                        default:
                            dee deeVar2 = this.b;
                            qi0 qi0Var3 = qi0Var;
                            ro7 ro7Var = new ro7(deeVar2, 4, r72Var);
                            wb0 wb0Var = deeVar2.G;
                            eif eifVar2 = deeVar2.e;
                            wb0Var.a.execute(new i0(wb0Var, eifVar2, new kzi(deeVar2, ro7Var), 4));
                            m86 m86Var2 = deeVar2.J;
                            xde xdeVar = new xde(deeVar2, r72Var, ro7Var, qi0Var3);
                            synchronized (m86Var2.b) {
                                m86Var2.t = xdeVar;
                                m86Var2.u = eifVar2;
                                break;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        o9b.a(new j79(new ArrayList(arrayList), true, zjl.a()), new vn7(26, this), zjl.a());
    }

    public final void O(boolean z) {
        qi0 qi0Var = this.s;
        if (qi0Var != null) {
            qi0Var.A(new u3j(qi0Var.h, n()), z);
        }
    }

    public final void P(cee ceeVar) {
        if (!o0.contains(this.m)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.m);
        }
        if (!p0.contains(ceeVar)) {
            ahc.f(ceeVar, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
        } else if (this.n != ceeVar) {
            this.n = ceeVar;
            this.a.D(new xi0(this.o, q(ceeVar), this.u));
        }
    }

    public final void Q(n76 n76Var, qi0 qi0Var) {
        if (this.J == null) {
            tvj.a("Recorder", "Ignore the audio data since the audio encoder has been released.");
            return;
        }
        if (n76Var.U() < this.P) {
            tvj.a("Recorder", "Skipping audio data: timestamp precedes first video frame.");
            return;
        }
        long size = n76Var.size() + this.M;
        long j = this.T;
        if (j != 0 && size > j) {
            tvj.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T)));
            w(qi0Var, 2, null);
            return;
        }
        long jU = n76Var.U();
        long j2 = jU - this.P;
        if (this.Q == BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.Q = jU;
            tvj.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jU), vql.c(this.Q)));
        } else if (this.U != 0) {
            qyj.l("There should be a previous data for adjusting the duration.", this.S != BuildConfig.MAX_TIME_TO_UPLOAD);
            long j3 = (jU - this.S) + j2;
            if (j3 > this.U) {
                tvj.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(j3), Long.valueOf(this.U)));
                w(qi0Var, 9, null);
                return;
            }
        }
        n76Var.C().presentationTimeUs = j2;
        try {
            this.E.h(this.y.intValue(), n76Var.o(), n76Var.C());
            this.M = size;
            this.N = n76Var.size() + this.N;
            this.S = jU;
        } catch (MuxerException e) {
            tvj.i("Recorder", "writeAudioData failed", e);
            w(qi0Var, p(e) ? 3 : 1, e);
        }
    }

    public final void R(n76 n76Var, qi0 qi0Var) {
        if (this.H == null) {
            tvj.a("Recorder", "Ignore the video data since the video encoder has been released.");
            return;
        }
        if (this.z == null) {
            c.e("Video data comes before the track is added to Muxer.");
            return;
        }
        long size = n76Var.size() + this.M;
        long j = this.T;
        long j2 = 0;
        if (j != 0 && size > j) {
            tvj.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T)));
            w(qi0Var, 2, null);
            return;
        }
        long jU = n76Var.U();
        long j3 = this.P;
        if (j3 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.P = jU;
            tvj.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jU), vql.c(this.P)));
        } else {
            long j4 = jU - j3;
            if (this.U != 0) {
                qyj.l("There should be a previous data for adjusting the duration.", this.R != BuildConfig.MAX_TIME_TO_UPLOAD);
                long j5 = (jU - this.R) + j4;
                if (j5 > this.U) {
                    tvj.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(j5), Long.valueOf(this.U)));
                    w(qi0Var, 9, null);
                    return;
                }
            }
            j2 = j4;
        }
        n76Var.C().presentationTimeUs = j2;
        try {
            this.E.h(this.z.intValue(), n76Var.o(), n76Var.C());
            this.M = size;
            this.O = j2;
            this.R = jU;
            O(n76Var.H());
            if (size > this.k0) {
                i1m i1mVar = this.j0;
                i1mVar.getClass();
                long jZ = i1mVar.Z();
                tvj.a("Recorder", "availableBytes = " + url.a(jZ));
                long j6 = this.k;
                if (jZ < j6) {
                    w(qi0Var, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jZ), Long.valueOf(j6))));
                } else {
                    this.k0 = jZ - j6;
                }
            }
        } catch (MuxerException e) {
            tvj.i("Recorder", "writeVideoData failed", e);
            w(qi0Var, p(e) ? 3 : 1, e);
        }
    }

    @Override // defpackage.u2j
    public final uti a(int i, nf2 nf2Var) {
        int i2 = i == 1 ? 2 : 1;
        String str = ((o5a) o(this.F)).a.d;
        nf2 nf2Var2 = nf2Var;
        return "video/*".equals(str) ? new eee(m(i2, nf2Var), nf2Var2) : new rya(str, nf2Var2, v0);
    }

    @Override // defpackage.u2j
    public final void b(ich ichVar) {
        f(ichVar, msh.a, false);
    }

    @Override // defpackage.u2j
    public final gqb c() {
        return this.F;
    }

    @Override // defpackage.u2j
    public final gqb d() {
        return this.a;
    }

    @Override // defpackage.u2j
    public final boolean e() {
        return ((o5a) o(this.F)).a.a == q0;
    }

    @Override // defpackage.u2j
    public final void f(ich ichVar, msh mshVar, boolean z) {
        synchronized (this.j) {
            try {
                tvj.a("Recorder", "Surface is requested in state: " + this.m + ", Current surface: " + this.o);
                if (this.m == cee.i) {
                    H(cee.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.execute(new j0a(2, this, ichVar, mshVar, z));
    }

    @Override // defpackage.u2j
    public final s86 g(int i, nf2 nf2Var) {
        return m(i == 1 ? 2 : 1, nf2Var);
    }

    @Override // defpackage.u2j
    public final void h(int i) {
        this.e.execute(new ai(this, i, 18));
    }

    @Override // defpackage.u2j
    public final gqb i() {
        return this.b;
    }

    public final void j(ich ichVar, msh mshVar, boolean z) {
        if (ichVar.h.b.isDone()) {
            tvj.g("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        qyb qybVar = new qyb(17, this);
        eif eifVar = this.e;
        ichVar.c(eifVar, qybVar);
        Size size = ichVar.b;
        al2 al2VarA = g(ichVar.g, ichVar.e.a()).a(ichVar.c);
        this.w = al2VarA != null ? al2VarA.a(size) : null;
        tvj.a("Recorder", "mResolvedEncoderProfiles = " + this.w);
        bee beeVar = this.i0;
        if (beeVar != null && !beeVar.d) {
            beeVar.d = true;
            ScheduledFuture scheduledFuture = beeVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                beeVar.f = null;
            }
        }
        bee beeVar2 = new bee(this, ichVar, mshVar, this.l0, z ? z0 : 0);
        this.i0 = beeVar2;
        D().b(new d86(beeVar2, ichVar, mshVar, 24), eifVar);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119 A[LOOP:0: B:43:0x0113->B:45:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0156 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0172 A[Catch: all -> 0x017c, LOOP:1: B:62:0x016c->B:64:0x0172, LOOP_END, TryCatch #3 {all -> 0x017c, blocks: (B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:108:0x015b, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b0 A[Catch: all -> 0x0198, FALL_THROUGH, PHI: r7
  0x01b0: PHI (r7v1 boolean) = (r7v0 boolean), (r7v4 boolean) binds: [B:69:0x0188, B:79:0x01af] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b4 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f0 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:57:0x0152, B:59:0x0156, B:60:0x015a, B:68:0x0180, B:69:0x0188, B:88:0x01db, B:73:0x0190, B:77:0x019b, B:78:0x01ae, B:80:0x01b0, B:82:0x01b4, B:83:0x01c5, B:85:0x01c9, B:97:0x01ef, B:98:0x01f0, B:99:0x01f7, B:61:0x015b, B:62:0x016c, B:64:0x0172, B:67:0x017f), top: B:107:0x0152, inners: #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x019b, please report this as an issue */
    public final void k(int i, Throwable th) {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        int i2;
        xr6 xr6Var;
        ri0 ri0VarN;
        fi0 fi0Var;
        boolean z;
        q3j q3jVar;
        qi0 qi0Var;
        a9m a9mVar;
        int iD;
        int i3;
        qi0 qi0Var2;
        v30 v30Var;
        Iterator it;
        qi0 qi0Var3;
        RuntimeException runtimeException;
        boolean z2;
        if (this.s == null) {
            c.e("Attempted to finalize in-progress recording, but no recording is in progress.");
            return;
        }
        int i4 = 8;
        boolean z3 = true;
        boolean z4 = true;
        qi0 qi0VarU = null;
        try {
            if (this.E == null) {
                if (i == 0) {
                    th4 = th;
                } else {
                    i2 = i;
                    th5 = th;
                }
                this.s.b(this.L);
                xr6Var = this.s.h;
                ri0VarN = n();
                Uri uri = this.L;
                qyj.k(uri, "OutputUri cannot be null.");
                fi0Var = new fi0(uri);
                qi0 qi0Var4 = this.s;
                z3 = false;
                i3 = 0;
                if (i2 == 0) {
                    q3jVar = new q3j(xr6Var, ri0VarN, fi0Var, 0, null);
                } else {
                    if (i2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qyj.h("An error type is required.", z);
                    q3jVar = new q3j(xr6Var, ri0VarN, fi0Var, i2, th5);
                }
                qi0Var4.A(q3jVar, true);
                qi0Var = this.s;
                this.s = null;
                this.t = false;
                this.y = null;
                this.z = null;
                this.x.clear();
                this.L = Uri.EMPTY;
                this.M = 0L;
                this.N = 0L;
                this.O = 0L;
                this.P = BuildConfig.MAX_TIME_TO_UPLOAD;
                this.Q = BuildConfig.MAX_TIME_TO_UPLOAD;
                this.R = BuildConfig.MAX_TIME_TO_UPLOAD;
                this.S = BuildConfig.MAX_TIME_TO_UPLOAD;
                this.V = 1;
                this.W = null;
                this.Z = null;
                this.g0 = 0.0d;
                this.j0 = null;
                this.k0 = BuildConfig.MAX_TIME_TO_UPLOAD;
                a9mVar = this.Y;
                while (!a9mVar.g()) {
                    ((n76) a9mVar.d()).close();
                }
                F(null);
                iD = qt4.D(this.m0);
                i3 = 4;
                if (iD != 2 || iD == 3) {
                    E(2);
                    wb0 wb0Var = this.G;
                    wb0Var.a.execute(new c3(11, wb0Var));
                } else if (iD == 4 || iD == 5) {
                    E(1);
                }
                synchronized (this.j) {
                    try {
                        qi0Var2 = this.p;
                        if (qi0Var2 == qi0Var) {
                            throw new AssertionError("Active recording did not match finalized recording on finalize.");
                        }
                        v30Var = qi0Var2.g;
                        synchronized (v30Var.d) {
                            try {
                                it = new HashSet(((HashMap) v30Var.f).keySet()).iterator();
                                while (it.hasNext()) {
                                    v30Var.x((eqb) it.next());
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        this.p = null;
                        switch (this.m.ordinal()) {
                            case 1:
                                z3 = false;
                            case 2:
                                if (this.n0 == 3) {
                                    qi0Var3 = this.q;
                                    this.q = null;
                                    H(cee.a);
                                    runtimeException = t0;
                                    boolean z5 = z3;
                                    z2 = false;
                                    z3 = z5;
                                } else {
                                    if (this.H != null) {
                                        runtimeException = null;
                                        qi0VarU = u(this.m);
                                        qi0Var3 = null;
                                    } else {
                                        qi0Var3 = null;
                                        runtimeException = null;
                                    }
                                    z2 = z3;
                                }
                                break;
                            case 3:
                                throw new AssertionError("Unexpected state on finalize of recording: " + this.m);
                            case 4:
                            case 5:
                            case 6:
                                H(cee.d);
                                i3 = 0;
                                z4 = false;
                                qi0Var3 = null;
                                runtimeException = null;
                                z2 = z4;
                                break;
                            case 7:
                                i3 = 0;
                                qi0Var3 = null;
                                runtimeException = null;
                                z2 = z4;
                                break;
                            default:
                                i3 = 0;
                                z4 = false;
                                qi0Var3 = null;
                                runtimeException = null;
                                z2 = z4;
                                break;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                if (z2) {
                    A();
                    return;
                } else if (qi0VarU != null) {
                    L(qi0VarU, z3);
                    return;
                } else {
                    if (qi0Var3 != null) {
                        l(qi0Var3, i3, runtimeException);
                        return;
                    }
                    return;
                }
            }
            try {
                tvj.a("Recorder", "Muxer.stop()");
                this.E.stop();
                tvj.a("Recorder", "Muxer.release()");
                this.E.release();
                this.E = null;
                i4 = i;
                th3 = th;
            } catch (MuxerException e) {
                tvj.i("Recorder", "Muxer failed to stop with error: " + e, e);
                if (i != 0) {
                    i4 = i;
                    th2 = th;
                } else if (p(e)) {
                    i4 = 3;
                    th2 = e;
                } else if (this.M > 0) {
                    if (r()) {
                        th2 = e;
                        th2 = e;
                        if (this.N > 0) {
                            th2 = e;
                            i4 = 1;
                            th2 = e;
                        }
                    } else {
                        th2 = e;
                        i4 = 1;
                        th2 = e;
                    }
                }
                th2 = e;
                tvj.a("Recorder", "Muxer.release()");
                this.E.release();
                this.E = null;
                th3 = th2;
            }
            th4 = th3;
            i2 = i4;
            th5 = th4;
            this.s.b(this.L);
            xr6Var = this.s.h;
            ri0VarN = n();
            Uri uri2 = this.L;
            qyj.k(uri2, "OutputUri cannot be null.");
            fi0Var = new fi0(uri2);
            qi0 qi0Var5 = this.s;
            z3 = false;
            i3 = 0;
            if (i2 == 0) {
                q3jVar = new q3j(xr6Var, ri0VarN, fi0Var, 0, null);
            } else {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                qyj.h("An error type is required.", z);
                q3jVar = new q3j(xr6Var, ri0VarN, fi0Var, i2, th5);
            }
            qi0Var5.A(q3jVar, true);
            qi0Var = this.s;
            this.s = null;
            this.t = false;
            this.y = null;
            this.z = null;
            this.x.clear();
            this.L = Uri.EMPTY;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = BuildConfig.MAX_TIME_TO_UPLOAD;
            this.Q = BuildConfig.MAX_TIME_TO_UPLOAD;
            this.R = BuildConfig.MAX_TIME_TO_UPLOAD;
            this.S = BuildConfig.MAX_TIME_TO_UPLOAD;
            this.V = 1;
            this.W = null;
            this.Z = null;
            this.g0 = 0.0d;
            this.j0 = null;
            this.k0 = BuildConfig.MAX_TIME_TO_UPLOAD;
            a9mVar = this.Y;
            while (!a9mVar.g()) {
                ((n76) a9mVar.d()).close();
            }
            F(null);
            iD = qt4.D(this.m0);
            i3 = 4;
            if (iD != 2) {
                E(2);
                wb0 wb0Var2 = this.G;
                wb0Var2.a.execute(new c3(11, wb0Var2));
            } else {
                E(2);
                wb0 wb0Var3 = this.G;
                wb0Var3.a.execute(new c3(11, wb0Var3));
            }
            synchronized (this.j) {
                qi0Var2 = this.p;
                if (qi0Var2 == qi0Var) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                v30Var = qi0Var2.g;
                synchronized (v30Var.d) {
                    it = new HashSet(((HashMap) v30Var.f).keySet()).iterator();
                    while (it.hasNext()) {
                        v30Var.x((eqb) it.next());
                    }
                    this.p = null;
                    switch (this.m.ordinal()) {
                        case 1:
                            z3 = false;
                        case 2:
                            if (this.n0 == 3) {
                                qi0Var3 = this.q;
                                this.q = null;
                                H(cee.a);
                                runtimeException = t0;
                                boolean z6 = z3;
                                z2 = false;
                                z3 = z6;
                            } else {
                                if (this.H != null) {
                                    runtimeException = null;
                                    qi0VarU = u(this.m);
                                    qi0Var3 = null;
                                } else {
                                    qi0Var3 = null;
                                    runtimeException = null;
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                A();
                                return;
                            } else if (qi0VarU != null) {
                                L(qi0VarU, z3);
                                return;
                            } else {
                                if (qi0Var3 != null) {
                                    l(qi0Var3, i3, runtimeException);
                                    return;
                                }
                                return;
                            }
                        case 3:
                            throw new AssertionError("Unexpected state on finalize of recording: " + this.m);
                        case 4:
                        case 5:
                        case 6:
                            H(cee.d);
                            i3 = 0;
                            z4 = false;
                            qi0Var3 = null;
                            runtimeException = null;
                            z2 = z4;
                            if (z2) {
                                A();
                                return;
                            } else if (qi0VarU != null) {
                                L(qi0VarU, z3);
                                return;
                            } else {
                                if (qi0Var3 != null) {
                                    l(qi0Var3, i3, runtimeException);
                                    return;
                                }
                                return;
                            }
                        case 7:
                            i3 = 0;
                            qi0Var3 = null;
                            runtimeException = null;
                            z2 = z4;
                            if (z2) {
                                A();
                                return;
                            } else if (qi0VarU != null) {
                                L(qi0VarU, z3);
                                return;
                            } else {
                                if (qi0Var3 != null) {
                                    l(qi0Var3, i3, runtimeException);
                                    return;
                                }
                                return;
                            }
                        default:
                            i3 = 0;
                            z4 = false;
                            qi0Var3 = null;
                            runtimeException = null;
                            z2 = z4;
                            if (z2) {
                                A();
                                return;
                            } else if (qi0VarU != null) {
                                L(qi0VarU, z3);
                                return;
                            } else {
                                if (qi0Var3 != null) {
                                    l(qi0Var3, i3, runtimeException);
                                    return;
                                }
                                return;
                            }
                    }
                }
            }
        } catch (Throwable th8) {
            tvj.a("Recorder", "Muxer.release()");
            this.E.release();
            this.E = null;
            throw th8;
        }
    }

    public final void l(qi0 qi0Var, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        qi0Var.b(uri);
        xr6 xr6Var = qi0Var.h;
        ri0 ri0VarA = ri0.a(0L, 0L, new sg0(1, 0.0d, 0L, this.Z));
        qyj.k(uri, "OutputUri cannot be null.");
        fi0 fi0Var = new fi0(uri);
        qyj.h("An error type is required.", i != 0);
        qi0Var.A(new q3j(xr6Var, ri0VarA, fi0Var, i, th), true);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e A[PHI: r6
  0x003e: PHI (r6v1 int) = (r6v0 int), (r6v0 int), (r6v0 int), (r6v3 int), (r6v2 int) binds: [B:3:0x0011, B:4:0x0013, B:6:0x0016, B:23:0x0045, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public final ri0 n() {
        int i;
        long nanos = TimeUnit.MICROSECONDS.toNanos(this.O);
        long j = this.M;
        int i2 = this.m0;
        int iD = qt4.D(i2);
        int i3 = 1;
        if (iD == 0 || iD == 1) {
            i = i3;
        } else {
            int i4 = 2;
            if (iD != 2) {
                i3 = 5;
                i = 3;
                if (iD != 3) {
                    i4 = 4;
                    if (iD != 4) {
                        if (iD != 5) {
                            c.e("Invalid internal audio state: ".concat(iic.q(i2)));
                            return null;
                        }
                    }
                } else {
                    qi0 qi0Var = this.s;
                    if (qi0Var == null || !qi0Var.f.get()) {
                        if (!this.a0) {
                            i3 = 0;
                        }
                    }
                    i = i3;
                }
                i = i4;
            } else {
                i = i3;
            }
        }
        return ri0.a(nanos, j, new sg0(i, this.g0, this.N, this.Z));
    }

    public final boolean p(Exception exc) {
        if (url.b(exc)) {
            return true;
        }
        i1m i1mVar = this.j0;
        i1mVar.getClass();
        return i1mVar.Z() < this.k;
    }

    public final boolean r() {
        return this.m0 == 4;
    }

    public final boolean s() {
        qi0 qi0Var = this.s;
        return qi0Var != null && qi0Var.l;
    }

    public final qi0 u(cee ceeVar) {
        boolean z;
        if (ceeVar == cee.c) {
            z = true;
        } else {
            if (ceeVar != cee.b) {
                c.e("makePendingRecordingActiveLocked() can only be called from a pending state.");
                return null;
            }
            z = false;
        }
        if (this.p != null) {
            c.e("Cannot make pending recording active because another recording is already active.");
            return null;
        }
        qi0 qi0Var = this.q;
        if (qi0Var == null) {
            c.e("Pending recording should exist when in a PENDING state.");
            return null;
        }
        this.p = qi0Var;
        qi0Var.g.n(zjl.a(), new xg2(2, this));
        this.q = null;
        if (z) {
            H(cee.f);
            return qi0Var;
        }
        H(cee.e);
        return qi0Var;
    }

    public final void w(qi0 qi0Var, int i, Exception exc) {
        boolean z;
        if (qi0Var != this.s) {
            c.e("Internal error occurred on recording that is not the current in-progress recording.");
            return;
        }
        synchronized (this.j) {
            try {
                z = false;
                switch (this.m.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.m);
                    case 4:
                    case 5:
                        H(cee.g);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (qi0Var != this.p) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            M(qi0Var, -1L, i, exc);
        }
    }

    public final void x(qi0 qi0Var) {
        if (this.s != qi0Var || this.t) {
            return;
        }
        if (r()) {
            this.J.e();
        }
        this.H.e();
        qi0 qi0Var2 = this.s;
        qi0Var2.A(new r3j(qi0Var2.h, n()), true);
    }

    public final void y() {
        wb0 wb0Var = this.G;
        if (wb0Var == null) {
            c.e("Cannot release null audio source.");
            return;
        }
        this.G = null;
        tvj.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(wb0Var.hashCode())));
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            wb0Var.a.execute(new qe(wb0Var, 10, r72Var));
            r72Var.a = "AudioSource-release";
        } catch (Exception e) {
            u72Var.c(e);
        }
        o9b.a(u72Var, new c7k(22, wb0Var), zjl.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void z(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.j) {
            try {
                z2 = true;
                z3 = false;
                switch (this.m.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        P(cee.h);
                        break;
                    case 4:
                    case 5:
                        qyj.l("In-progress recording shouldn't be null when in state " + this.m, this.s != null);
                        if (this.p != this.s) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!s()) {
                            H(cee.h);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                        break;
                    case 6:
                        H(cee.h);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                M(this.s, -1L, 4, null);
            }
        } else if (z) {
            B();
        } else {
            A();
        }
    }
}
