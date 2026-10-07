package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.Range;
import android.util.Rational;
import android.util.SparseBooleanArray;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c86(z18 z18Var, ij0 ij0Var, int i, Runnable runnable) {
        this.a = 4;
        this.c = z18Var;
        this.d = ij0Var;
        this.b = i;
        this.e = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0468  */
    /* JADX WARN: Code duplicated, block: B:179:0x047a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0514 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0516 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x052a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0539  */
    /* JADX WARN: Code duplicated, block: B:225:0x0541  */
    /* JADX WARN: Code duplicated, block: B:227:0x054b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0552  */
    /* JADX WARN: Code duplicated, block: B:236:0x056a  */
    /* JADX WARN: Code duplicated, block: B:245:0x057d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0582  */
    /* JADX WARN: Code duplicated, block: B:248:0x0587  */
    /* JADX WARN: Code duplicated, block: B:254:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:257:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:261:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:263:0x0604  */
    /* JADX WARN: Code duplicated, block: B:265:0x0607  */
    /* JADX WARN: Code duplicated, block: B:271:0x0632  */
    /* JADX WARN: Code duplicated, block: B:273:0x0638  */
    /* JADX WARN: Code duplicated, block: B:277:0x0646  */
    /* JADX WARN: Code duplicated, block: B:279:0x064a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0650  */
    /* JADX WARN: Code duplicated, block: B:283:0x0662  */
    /* JADX WARN: Code duplicated, block: B:286:0x0669  */
    /* JADX WARN: Code duplicated, block: B:318:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[LOOP:2: B:174:0x0462->B:321:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:254:0x05ac, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        m86 m86Var;
        w76 w76Var;
        Executor executor;
        long j;
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        m86 m86Var2;
        long j2;
        long j3;
        boolean z4;
        boolean z5;
        long j4;
        long j5;
        long j6;
        boolean z6;
        MediaCodec.BufferInfo bufferInfo;
        Executor executor2;
        w76 w76Var2;
        Range range;
        boolean z7;
        m86 m86Var3;
        switch (this.a) {
            case 0:
                ((m86) this.c).d(this.b, (String) this.d, (Throwable) this.e);
                return;
            case 1:
                k86 k86Var = (k86) this.c;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.d;
                MediaCodec mediaCodec = (MediaCodec) this.e;
                int i = this.b;
                boolean z8 = k86Var.j;
                m86 m86Var4 = k86Var.l;
                if (z8) {
                    tvj.g(m86Var4.a, "Receives frame after codec is reset.");
                    return;
                }
                switch (qt4.D(m86Var4.F)) {
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
                        synchronized (k86Var.l.b) {
                            m86Var = k86Var.l;
                            w76Var = m86Var.t;
                            executor = m86Var.u;
                            break;
                        }
                        if (Build.VERSION.SDK_INT < 30 && m86Var.c) {
                            Rational rational = m86Var.r;
                            if (!(rational != null && rational.getDenominator() == rational.getNumerator())) {
                                bufferInfo2.presentationTimeUs = k86Var.l.n(bufferInfo2.presentationTimeUs);
                            }
                        }
                        if (!k86Var.c) {
                            k86Var.c = true;
                            try {
                                Objects.requireNonNull(w76Var);
                                executor.execute(new j86(w76Var, 0));
                            } catch (RejectedExecutionException e) {
                                tvj.d(k86Var.l.a, "Unable to post to the supplied executor.", e);
                            }
                        }
                        try {
                            if (k86Var.e) {
                                tvj.a(k86Var.l.a, "Drop buffer by already reach end of stream.");
                            } else if (bufferInfo2.size <= 0) {
                                tvj.a(k86Var.l.a, "Drop buffer by invalid buffer size.");
                            } else if ((bufferInfo2.flags & 2) != 0) {
                                tvj.a(k86Var.l.a, "Drop buffer by codec config.");
                            } else {
                                uj6 uj6Var = k86Var.a;
                                if (uj6Var != null) {
                                    long j7 = bufferInfo2.presentationTimeUs;
                                    fsh fshVar = (fsh) uj6Var.c;
                                    if (((msh) uj6Var.e) == null) {
                                        msh mshVar = (msh) uj6Var.a;
                                        if (((CameraUseInconsistentTimebaseQuirk) uj6Var.d) != null) {
                                            tvj.g("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
                                        } else {
                                            z7 = fshVar.m() - fshVar.x() > 3000000;
                                            uj6Var.e = mshVar;
                                        }
                                        msh mshVar2 = Math.abs(j7 - fshVar.m()) < Math.abs(j7 - fshVar.x()) ? msh.b : msh.a;
                                        if (!z7 || mshVar2 == mshVar) {
                                            tvj.a("VideoTimebaseConverter", "Detect input timebase = " + mshVar2);
                                        } else {
                                            int i2 = Build.VERSION.SDK_INT;
                                            tvj.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i2), i2 >= 31 ? ", SOC: " + Build.SOC_MODEL : "", (msh) uj6Var.a, mshVar2));
                                        }
                                        mshVar = mshVar2;
                                        uj6Var.e = mshVar;
                                    }
                                    int iOrdinal = ((msh) uj6Var.e).ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            throw new AssertionError("Unknown timebase: " + ((msh) uj6Var.e));
                                        }
                                        if (uj6Var.b == -1) {
                                            long j8 = Long.MAX_VALUE;
                                            long j9 = 0;
                                            for (int i3 = 0; i3 < 3; i3++) {
                                                long jX = fshVar.x();
                                                long jM = fshVar.m();
                                                long jX2 = fshVar.x();
                                                long j10 = jX2 - jX;
                                                if (i3 == 0 || j10 < j8) {
                                                    j9 = jM - ((jX + jX2) >> 1);
                                                    j8 = j10;
                                                }
                                            }
                                            uj6Var.b = Math.max(0L, j9);
                                            tvj.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + uj6Var.b);
                                        }
                                        j7 -= uj6Var.b;
                                    }
                                    bufferInfo2.presentationTimeUs = j7;
                                }
                                long j11 = bufferInfo2.presentationTimeUs;
                                if (j11 <= k86Var.f) {
                                    tvj.a(k86Var.l.a, "Drop buffer by out of order buffer from MediaCodec.");
                                } else {
                                    k86Var.f = j11;
                                    boolean zContains = k86Var.l.v.contains(Long.valueOf(j11));
                                    m86 m86Var5 = k86Var.l;
                                    if (zContains) {
                                        long j12 = bufferInfo2.presentationTimeUs;
                                        ArrayDeque arrayDeque = m86Var5.o;
                                        while (!arrayDeque.isEmpty()) {
                                            Range range2 = (Range) arrayDeque.getFirst();
                                            if (j12 > ((Long) range2.getUpper()).longValue()) {
                                                arrayDeque.removeFirst();
                                                long jLongValue = (((Long) range2.getUpper()).longValue() - ((Long) range2.getLower()).longValue()) + m86Var5.w;
                                                m86Var5.w = jLongValue;
                                                tvj.a(m86Var5.a, "Total paused duration = ".concat(vql.c(jLongValue)));
                                            } else {
                                                m86 m86Var6 = k86Var.l;
                                                j = bufferInfo2.presentationTimeUs;
                                                it = m86Var6.o.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        range = (Range) it.next();
                                                        if (range.contains(Long.valueOf(j))) {
                                                            z = true;
                                                        } else if (j < ((Long) range.getLower()).longValue()) {
                                                        }
                                                    }
                                                    z = false;
                                                }
                                                z2 = k86Var.h;
                                                if (z2 && z) {
                                                    tvj.a(k86Var.l.a, "Switch to pause state");
                                                    k86Var.h = true;
                                                    synchronized (k86Var.l.b) {
                                                        m86 m86Var7 = k86Var.l;
                                                        executor2 = m86Var7.u;
                                                        w76Var2 = m86Var7.t;
                                                        break;
                                                    }
                                                    Objects.requireNonNull(w76Var2);
                                                    executor2.execute(new j86(w76Var2, 0));
                                                    m86 m86Var8 = k86Var.l;
                                                    if (m86Var8.F == 3 && ((m86Var8.c || sk5.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!k86Var.l.c || sk5.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                        t76 t76Var = k86Var.l.f;
                                                        if (t76Var instanceof i86) {
                                                            ((i86) t76Var).a(false);
                                                        }
                                                        k86Var.l.i(true);
                                                    }
                                                    k86Var.l.y = Long.valueOf(bufferInfo2.presentationTimeUs);
                                                    m86 m86Var9 = k86Var.l;
                                                    if (m86Var9.x) {
                                                        ScheduledFuture scheduledFuture = m86Var9.z;
                                                        if (scheduledFuture != null) {
                                                            scheduledFuture.cancel(true);
                                                        }
                                                        k86Var.l.k();
                                                        k86Var.l.x = false;
                                                    }
                                                } else if (z2 && !z) {
                                                    tvj.a(k86Var.l.a, "Switch to resume state");
                                                    k86Var.h = false;
                                                    if (k86Var.l.c && (bufferInfo2.flags & 1) == 0) {
                                                        k86Var.i = true;
                                                    }
                                                }
                                                z3 = k86Var.h;
                                                m86Var2 = k86Var.l;
                                                if (z3) {
                                                    tvj.a(m86Var2.a, "Drop buffer by pause.");
                                                } else {
                                                    j2 = m86Var2.w;
                                                    j3 = bufferInfo2.presentationTimeUs;
                                                    if (j2 > 0) {
                                                        j3 -= j2;
                                                    }
                                                    if (j3 <= k86Var.g) {
                                                        z4 = true;
                                                        z5 = k86Var.d;
                                                        if (!z5 && !k86Var.i && m86Var2.c) {
                                                            k86Var.i = true;
                                                        }
                                                        if (k86Var.i) {
                                                            if ((bufferInfo2.flags & 1) != 0) {
                                                                k86Var.i = false;
                                                                z4 = true;
                                                            } else {
                                                                tvj.a(m86Var2.a, "Drop buffer by not a key frame.");
                                                                k86Var.l.g();
                                                            }
                                                        }
                                                        if (!z5) {
                                                            k86Var.d = z4;
                                                            tvj.a(m86Var2.a, "data timestampUs = " + bufferInfo2.presentationTimeUs + ", data timebase = " + k86Var.l.p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                                                        }
                                                        j4 = k86Var.l.w;
                                                        j5 = bufferInfo2.presentationTimeUs;
                                                        if (j4 > 0) {
                                                            j5 -= j4;
                                                        }
                                                        j6 = j5;
                                                        if (bufferInfo2.presentationTimeUs == j6) {
                                                            bufferInfo = bufferInfo2;
                                                        } else {
                                                            if (j6 > k86Var.g) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            qyj.l(null, z6);
                                                            MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                                                            bufferInfo3.set(bufferInfo2.offset, bufferInfo2.size, j6, bufferInfo2.flags);
                                                            bufferInfo = bufferInfo3;
                                                        }
                                                        k86Var.g = bufferInfo.presentationTimeUs;
                                                        try {
                                                            k86Var.b(new o76(mediaCodec, i, bufferInfo), w76Var, executor);
                                                            if (!k86Var.e) {
                                                                if ((bufferInfo2.flags & 4) == 0 && (!k86Var.k || sk5.a.b(PrematureEndOfStreamVideoQuirk.class) == null)) {
                                                                    k86Var.a();
                                                                } else if (k86Var.b) {
                                                                    m86Var3 = k86Var.l;
                                                                    if (m86Var3.D && bufferInfo2.presentationTimeUs > ((Long) m86Var3.v.getUpper()).longValue()) {
                                                                        k86Var.a();
                                                                    }
                                                                }
                                                            }
                                                            if (k86Var.k) {
                                                                k86Var.k = false;
                                                                return;
                                                            }
                                                            return;
                                                        } catch (MediaCodec.CodecException e2) {
                                                            k86Var.l.b(1, e2.getMessage(), e2);
                                                            return;
                                                        }
                                                    }
                                                    tvj.a(m86Var2.a, "Drop buffer by adjusted time is less than the last sent time.");
                                                    if (k86Var.l.c && (bufferInfo2.flags & 1) != 0) {
                                                        k86Var.i = true;
                                                    }
                                                }
                                            }
                                        }
                                        m86 m86Var10 = k86Var.l;
                                        j = bufferInfo2.presentationTimeUs;
                                        it = m86Var10.o.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                range = (Range) it.next();
                                                if (range.contains(Long.valueOf(j))) {
                                                    z = true;
                                                } else if (j < ((Long) range.getLower()).longValue()) {
                                                }
                                            }
                                            z = false;
                                        }
                                        z2 = k86Var.h;
                                        if (z2) {
                                            if (z2) {
                                                tvj.a(k86Var.l.a, "Switch to resume state");
                                                k86Var.h = false;
                                                if (k86Var.l.c) {
                                                    k86Var.i = true;
                                                }
                                            }
                                        } else if (z2) {
                                            tvj.a(k86Var.l.a, "Switch to resume state");
                                            k86Var.h = false;
                                            if (k86Var.l.c) {
                                                k86Var.i = true;
                                            }
                                        }
                                        z3 = k86Var.h;
                                        m86Var2 = k86Var.l;
                                        if (z3) {
                                            tvj.a(m86Var2.a, "Drop buffer by pause.");
                                        } else {
                                            j2 = m86Var2.w;
                                            j3 = bufferInfo2.presentationTimeUs;
                                            if (j2 > 0) {
                                                j3 -= j2;
                                            }
                                            if (j3 <= k86Var.g) {
                                                z4 = true;
                                                z5 = k86Var.d;
                                                if (!z5) {
                                                    k86Var.i = true;
                                                }
                                                if (k86Var.i) {
                                                    if ((bufferInfo2.flags & 1) != 0) {
                                                        k86Var.i = false;
                                                        z4 = true;
                                                    } else {
                                                        tvj.a(m86Var2.a, "Drop buffer by not a key frame.");
                                                        k86Var.l.g();
                                                    }
                                                }
                                                if (!z5) {
                                                    k86Var.d = z4;
                                                    tvj.a(m86Var2.a, "data timestampUs = " + bufferInfo2.presentationTimeUs + ", data timebase = " + k86Var.l.p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                                                }
                                                j4 = k86Var.l.w;
                                                j5 = bufferInfo2.presentationTimeUs;
                                                if (j4 > 0) {
                                                    j5 -= j4;
                                                }
                                                j6 = j5;
                                                if (bufferInfo2.presentationTimeUs == j6) {
                                                    bufferInfo = bufferInfo2;
                                                } else {
                                                    if (j6 > k86Var.g) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    qyj.l(null, z6);
                                                    MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                                                    bufferInfo4.set(bufferInfo2.offset, bufferInfo2.size, j6, bufferInfo2.flags);
                                                    bufferInfo = bufferInfo4;
                                                }
                                                k86Var.g = bufferInfo.presentationTimeUs;
                                                k86Var.b(new o76(mediaCodec, i, bufferInfo), w76Var, executor);
                                                if (!k86Var.e) {
                                                    if ((bufferInfo2.flags & 4) == 0) {
                                                        if (k86Var.b) {
                                                            m86Var3 = k86Var.l;
                                                            if (m86Var3.D) {
                                                                k86Var.a();
                                                            }
                                                        }
                                                    } else if (k86Var.b) {
                                                        m86Var3 = k86Var.l;
                                                        if (m86Var3.D) {
                                                            k86Var.a();
                                                        }
                                                    }
                                                }
                                                if (k86Var.k) {
                                                    k86Var.k = false;
                                                    return;
                                                }
                                                return;
                                            }
                                            tvj.a(m86Var2.a, "Drop buffer by adjusted time is less than the last sent time.");
                                            if (k86Var.l.c) {
                                                k86Var.i = true;
                                            }
                                        }
                                    } else {
                                        tvj.a(m86Var5.a, "Drop buffer by not in start-stop range.");
                                        m86 m86Var11 = k86Var.l;
                                        if (m86Var11.x && bufferInfo2.presentationTimeUs >= ((Long) m86Var11.v.getUpper()).longValue()) {
                                            ScheduledFuture scheduledFuture2 = k86Var.l.z;
                                            if (scheduledFuture2 != null) {
                                                scheduledFuture2.cancel(true);
                                            }
                                            k86Var.l.y = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            k86Var.l.k();
                                            k86Var.l.x = false;
                                        }
                                    }
                                }
                            }
                            k86Var.l.e.releaseOutputBuffer(i, false);
                            if (!k86Var.e) {
                                if ((bufferInfo2.flags & 4) == 0) {
                                    if (k86Var.b) {
                                        m86Var3 = k86Var.l;
                                        if (m86Var3.D) {
                                            k86Var.a();
                                        }
                                    }
                                } else if (k86Var.b) {
                                    m86Var3 = k86Var.l;
                                    if (m86Var3.D) {
                                        k86Var.a();
                                    }
                                }
                            }
                            if (k86Var.k) {
                                k86Var.k = false;
                                return;
                            }
                            return;
                        } catch (MediaCodec.CodecException e3) {
                            k86Var.l.b(1, e3.getMessage(), e3);
                            return;
                        }
                    default:
                        ore.k("Unknown state: ".concat(x05.r(k86Var.l.F)));
                        return;
                }
            case 2:
                m0a m0aVar = (m0a) this.c;
                int i4 = this.b;
                k2a k2aVar = (k2a) this.d;
                ex8 ex8Var = (ex8) this.e;
                if (i4 == m0aVar.i) {
                    m0aVar.e(k2aVar, ex8Var, m0aVar.c(false));
                    return;
                }
                return;
            case 3:
                ed7 ed7Var = (ed7) this.c;
                int i5 = this.b;
                List list = (List) this.d;
                i2a i2aVar = (i2a) this.e;
                d3a d3aVar = ((o3a) ed7Var.d).g;
                if (i5 == -1) {
                    d3aVar.t.L(list);
                } else {
                    d3aVar.t.d(i5, list);
                }
                new SparseBooleanArray().append(20, true);
                d3aVar.q(i2aVar);
                return;
            case 4:
                z18 z18Var = (z18) this.c;
                ij0 ij0Var = (ij0) this.d;
                int i6 = this.b;
                Runnable runnable = (Runnable) this.e;
                uxe uxeVar = (uxe) z18Var.f;
                try {
                    try {
                        uxe uxeVar2 = (uxe) z18Var.c;
                        Objects.requireNonNull(uxeVar2);
                        uxeVar.K(new yji(uxeVar2, 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) z18Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            uxeVar.K(new vf6(z18Var, ij0Var, i6, 6));
                        } else {
                            z18Var.o(ij0Var, i6);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((kr6) z18Var.d).N(ij0Var, i6 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 5:
                p3k p3kVar = (p3k) this.c;
                f25 f25Var = (f25) this.d;
                byte[] bArr = (byte[]) this.e;
                int i7 = this.b;
                z18 z18Var2 = (z18) p3kVar.b;
                AtomicReference atomicReference = (AtomicReference) z18Var2.h;
                Handler handler = (Handler) z18Var2.f;
                f25 f25Var2 = (f25) atomicReference.get();
                if (((AtomicBoolean) z18Var2.g).get() || f25Var2 != f25Var) {
                    return;
                }
                handler.post(new uc2(z18Var2, bArr, i7, 11));
                try {
                    vve vveVarX = ((r6a) z18Var2.a).x(i7, bArr);
                    if (vveVarX != null) {
                        handler.post(new yde(z18Var2, 6, vveVarX));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    handler.post(new yde(z18Var2, 5, th));
                    return;
                }
            default:
                p3k p3kVar2 = (p3k) this.c;
                f25 f25Var3 = (f25) this.d;
                byte[] bArr2 = (byte[]) this.e;
                int i8 = this.b;
                rve rveVar = (rve) p3kVar2.b;
                Handler handler2 = rveVar.h;
                LongSparseArray longSparseArray = rveVar.l;
                dc9 dc9Var = rveVar.n;
                f25 f25Var4 = (f25) rveVar.b.get();
                if (rveVar.j.get() || f25Var4 != f25Var3) {
                    return;
                }
                dc9Var.getClass();
                Handler handler3 = (Handler) dc9Var.d;
                handler3.post(new ofk(dc9Var, bArr2, i8, 0));
                try {
                    gj2 gj2VarA = rveVar.a.A(i8, bArr2);
                    if (gj2VarA == null) {
                        return;
                    }
                    long j13 = gj2VarA.b;
                    yve yveVar = (yve) gj2VarA.c;
                    vek vekVar = (vek) longSparseArray.get(j13);
                    if (vekVar == null) {
                        return;
                    }
                    pve pveVar = vekVar.c;
                    handler3.post(new alg(dc9Var, pveVar, yveVar, 12));
                    dc9Var.s(pveVar);
                    handler2.post(new v1k(vekVar, 8, yveVar));
                    longSparseArray.remove(j13);
                    return;
                } catch (RtcCommandException e4) {
                    Long l = e4.a;
                    vek vekVar2 = l == null ? null : (vek) longSparseArray.get(l.longValue());
                    boolean z9 = e4.b;
                    if (l == null || vekVar2 == null) {
                        handler3.post(new v1k(dc9Var, 10, e4));
                        return;
                    }
                    pve pveVar2 = vekVar2.c;
                    handler3.post(new alg(dc9Var, pveVar2, e4, 11));
                    if (z9) {
                        rveVar.c(l.longValue());
                        return;
                    }
                    dc9Var.s(pveVar2);
                    handler2.post(new v1k(vekVar2, 9, e4));
                    longSparseArray.remove(l.longValue());
                    return;
                } catch (Throwable th2) {
                    handler3.post(new v1k(dc9Var, 10, th2));
                    return;
                }
        }
    }

    public /* synthetic */ c86(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c86(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
