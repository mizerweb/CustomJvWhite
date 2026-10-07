package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m86 {
    public static final Range G;
    public ScheduledFuture E;
    public int F;
    public final String a;
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final t76 f;
    public final n86 g;
    public final eif h;
    public final e89 i;
    public final r72 j;
    public final msh p;
    public final xp9 q;
    public final Rational r;
    public final boolean s;
    public final Object b = new Object();
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public w76 t = w76.m0;
    public Executor u = zjl.a();
    public Range v = G;
    public long w = 0;
    public boolean x = false;
    public Long y = null;
    public ScheduledFuture z = null;
    public k86 A = null;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;

    static {
        Long lValueOf = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
        G = Range.create(lValueOf, lValueOf);
    }

    public m86(Executor executor, y76 y76Var, int i) throws InvalidConfigException {
        boolean z = false;
        executor.getClass();
        LruCache lruCache = ru3.a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(y76Var.a());
            this.e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.h = new eif(executor);
            MediaFormat mediaFormatB = y76Var.b();
            this.d = mediaFormatB;
            msh mshVarC = y76Var.c();
            this.p = mshVarC;
            this.q = new xp9(new s63(22, this), 16, new nv8(11));
            if (y76Var instanceof qg0) {
                qg0 qg0Var = (qg0) y76Var;
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new i86(this);
                c80 c80Var = new c80(codecInfo, qg0Var.a);
                ((MediaCodecInfo.CodecCapabilities) c80Var.a).getAudioCapabilities();
                this.g = c80Var;
                this.r = new Rational(qg0Var.e, qg0Var.f);
            } else {
                if (!(y76Var instanceof kj0)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                kj0 kj0Var = (kj0) y76Var;
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new l86(this);
                cwi cwiVar = new cwi(codecInfo, kj0Var.a);
                if (mediaFormatB.containsKey("bitrate")) {
                    int integer = mediaFormatB.getInteger("bitrate");
                    int iIntValue = ((Integer) cwiVar.b.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatB.setInteger("bitrate", iIntValue);
                        tvj.a("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.g = cwiVar;
                this.r = new Rational(kj0Var.g, kj0Var.h);
            }
            tvj.a(this.a, "mInputTimebase = " + mshVarC);
            tvj.a(this.a, "mMediaFormat = " + mediaFormatB);
            tvj.a(this.a, "mCaptureToEncodeFrameRateRatio = " + this.r);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                r72 r72Var = new r72();
                r72Var.c = new gne();
                u72 u72Var = new u72(r72Var);
                r72Var.b = u72Var;
                r72Var.a = qt4.class;
                try {
                    atomicReference.set(r72Var);
                    r72Var.a = "mReleasedFuture";
                } catch (Exception e) {
                    u72Var.c(e);
                }
                this.i = o9b.g(u72Var);
                r72 r72Var2 = (r72) atomicReference.get();
                r72Var2.getClass();
                this.j = r72Var2;
                if (this.c && ((i == 1 && sk5.a.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || sk5.a.b(GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                    z = true;
                }
                this.s = z;
                j(1);
            } catch (MediaCodec.CodecException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (IOException e3) {
            throw new InvalidConfigException(e3);
        } catch (IllegalArgumentException e4) {
            throw new InvalidConfigException(e4);
        }
    }

    public final e89 a() {
        switch (qt4.D(this.F)) {
            case 0:
                return new g88(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                r72 r72Var = new r72();
                r72Var.c = new gne();
                u72 u72Var = new u72(r72Var);
                r72Var.b = u72Var;
                r72Var.a = qt4.class;
                try {
                    atomicReference.set(r72Var);
                    r72Var.a = "acquireInputBuffer";
                    break;
                } catch (Exception e) {
                    u72Var.c(e);
                }
                r72 r72Var2 = (r72) atomicReference.get();
                r72Var2.getClass();
                this.l.offer(r72Var2);
                r72Var2.a(new gf5(this, 15, r72Var2), this.h);
                c();
                return u72Var;
            case 7:
                return new g88(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new g88(1, new IllegalStateException("Encoder is released."));
            default:
                ore.k("Unknown state: ".concat(x05.r(this.F)));
                return null;
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (qt4.D(this.F)) {
            case 0:
                d(i, str, th);
                h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j(8);
                m(new c86(this, i, str, th, 0));
                break;
            case 7:
                tvj.i(this.a, c0a.l(i, "Get more than one error: ", str, "(", ")"), th);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            r72 r72Var = (r72) arrayDeque.poll();
            Objects.requireNonNull(r72Var);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                f86 f86Var = new f86(this, this.e, num.intValue());
                if (r72Var.b(f86Var)) {
                    this.m.add(f86Var);
                    o9b.g(f86Var.d).b(new gf5(this, 16, f86Var), this.h);
                } else {
                    f86Var.a();
                }
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void d(int i, String str, Throwable th) {
        w76 w76Var;
        Executor executor;
        synchronized (this.b) {
            w76Var = this.t;
            executor = this.u;
        }
        try {
            executor.execute(new i0(w76Var, i, str, th));
        } catch (RejectedExecutionException e) {
            tvj.d(this.a, "Unable to post to the supplied executor.", e);
        }
    }

    public final void e() {
        this.h.execute(new b86(this, this.q.x(), 0));
    }

    public final void f() {
        Surface surface;
        tvj.a(this.a, "releaseInternal");
        if (this.B) {
            if (!this.s) {
                tvj.a(this.a, "mMediaCodec.stop()");
                this.e.stop();
            }
            this.B = false;
        }
        tvj.a(this.a, "mMediaCodec.release()");
        this.e.release();
        t76 t76Var = this.f;
        if (t76Var instanceof l86) {
            l86 l86Var = (l86) t76Var;
            synchronized (l86Var.a) {
                surface = l86Var.b;
                l86Var.b = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        j(9);
        this.j.b(null);
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        tvj.a(this.a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.e.setParameters(bundle);
    }

    public final void h() {
        this.v = G;
        this.w = 0L;
        this.o.clear();
        this.k.clear();
        ArrayDeque arrayDeque = this.l;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((r72) it.next()).c();
        }
        arrayDeque.clear();
        String str = this.a;
        tvj.a(str, "mMediaCodec.reset()");
        MediaCodec mediaCodec = this.e;
        mediaCodec.reset();
        this.B = false;
        this.C = false;
        this.D = false;
        this.x = false;
        ScheduledFuture scheduledFuture = this.z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.z = null;
        }
        ScheduledFuture scheduledFuture2 = this.E;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.E = null;
        }
        k86 k86Var = this.A;
        if (k86Var != null) {
            k86Var.j = true;
        }
        this.A = new k86(this);
        tvj.a(str, "mMediaCodec.setCallback()");
        mediaCodec.setCallback(this.A);
        tvj.a(str, "mMediaCodec.configure()");
        mediaCodec.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        t76 t76Var = this.f;
        if (t76Var instanceof l86) {
            l86 l86Var = (l86) t76Var;
            l86Var.c.e.setInputSurface(l86Var.a());
        }
    }

    public final void i(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        tvj.a(this.a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z);
        this.e.setParameters(bundle);
    }

    public final void j(int i) {
        if (this.F == i) {
            return;
        }
        tvj.a(this.a, "Transitioning encoder internal state: " + x05.r(this.F) + " --> " + x05.r(i));
        this.F = i;
    }

    public final void k() {
        tvj.a(this.a, "signalCodecStop");
        t76 t76Var = this.f;
        int i = 0;
        if (t76Var instanceof i86) {
            ((i86) t76Var).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(o9b.g(((f86) it.next()).d));
            }
            new j79(new ArrayList(arrayList), false, zjl.a()).b(new a86(this, i), this.h);
            return;
        }
        if (t76Var instanceof l86) {
            try {
                if (sk5.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    k86 k86Var = this.A;
                    eif eifVar = this.h;
                    ScheduledFuture scheduledFuture = this.E;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.E = zjl.d().schedule(new gf5(eifVar, 14, k86Var), 1000L, TimeUnit.MILLISECONDS);
                }
                tvj.a(this.a, "mMediaCodec.signalEndOfInputStream()");
                this.e.signalEndOfInputStream();
                this.D = true;
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
            }
        }
    }

    public final void l() {
        this.h.execute(new b86(this, this.q.x(), 1));
    }

    public final void m(Runnable runnable) {
        String str = this.a;
        tvj.a(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(o9b.g(((o76) it.next()).e));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(o9b.g(((f86) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            tvj.a(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        new j79(new ArrayList(arrayList), false, zjl.a()).b(new d86(this, arrayList, runnable, 0), this.h);
    }

    public final long n(long j) {
        Rational rational = this.r;
        if (rational != null && rational.getDenominator() == rational.getNumerator()) {
            return j;
        }
        return Math.round(rational.doubleValue() * j);
    }
}
