package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.logging.LogFactory;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class lt9 extends pt9 implements it9 {
    public final Context g2;
    public final v2a h2;
    public final b85 i2;
    public final euc j2;
    public int k2;
    public boolean l2;
    public b87 m2;
    public b87 n2;
    public long o2;
    public boolean p2;
    public boolean q2;
    public boolean r2;
    public boolean s2;
    public int t2;
    public boolean u2;
    public long v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt9(Context context, jt9 jt9Var, qt9 qt9Var, boolean z, Handler handler, ob0 ob0Var, b85 b85Var) {
        super(context.getApplicationContext(), 1, jt9Var, qt9Var, z, 44100.0f);
        euc eucVar = Build.VERSION.SDK_INT >= 35 ? new euc(10) : null;
        this.g2 = context.getApplicationContext();
        this.i2 = b85Var;
        this.j2 = eucVar;
        this.t2 = -1000;
        this.h2 = new v2a(handler, 10, ob0Var);
        this.v2 = -9223372036854775807L;
        b85Var.n = new v56(10, this);
    }

    @Override // defpackage.it9
    public final long A() {
        if (this.h == 2) {
            F0();
        }
        return this.o2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    @Override // defpackage.pt9
    public final int A0(qt9 qt9Var, b87 b87Var) {
        int iE0;
        ghe gheVarG;
        boolean z;
        boolean z2;
        int iB = ks0.b(1, 0, 0, 0);
        String str = b87Var.n;
        String str2 = b87Var.n;
        if (!uya.i(str)) {
            return ks0.b(0, 0, 0, 0);
        }
        int i = b87Var.O;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        b85 b85Var = this.i2;
        if (z4) {
            if (z3) {
                List listE = ut9.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : (nt9) listE.get(0)) == null) {
                    iE0 = 0;
                }
            }
            iE0 = E0(b87Var);
            if (b85Var.h(b87Var) != 0) {
                return ks0.b(4, 8, 32, iE0);
            }
        } else {
            iE0 = 0;
        }
        if (!"audio/raw".equals(str2) || b85Var.h(b87Var) != 0) {
            int i3 = b87Var.F;
            int i4 = b87Var.G;
            a87 a87Var = new a87();
            a87Var.r("audio/raw");
            a87Var.b(i3);
            a87Var.s(i4);
            a87Var.o(2);
            if (b85Var.h(a87Var.a()) != 0) {
                if (str2 == null) {
                    gheVarG = ghe.e;
                } else if (b85Var.h(b87Var) != 0) {
                    List listE2 = ut9.e("audio/raw", false, false);
                    nt9 nt9Var = listE2.isEmpty() ? null : (nt9) listE2.get(0);
                    if (nt9Var != null) {
                        gheVarG = c98.r(nt9Var);
                    } else {
                        gheVarG = ut9.g(qt9Var, b87Var, false, false);
                    }
                } else {
                    gheVarG = ut9.g(qt9Var, b87Var, false, false);
                }
                if (!gheVarG.isEmpty()) {
                    if (!z4) {
                        return ks0.b(2, 0, 0, 0);
                    }
                    nt9 nt9Var2 = (nt9) gheVarG.get(0);
                    Context context = this.g2;
                    boolean zE = nt9Var2.e(context, b87Var);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= gheVarG.d) {
                                z = zE;
                                z2 = true;
                                break;
                            }
                            nt9 nt9Var3 = (nt9) gheVarG.get(i5);
                            if (nt9Var3.e(context, b87Var)) {
                                z2 = false;
                                nt9Var2 = nt9Var3;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zE;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && nt9Var2.g(b87Var)) {
                        i2 = 16;
                    }
                    return (nt9Var2.h ? 64 : 0) | i6 | i2 | 32 | (z2 ? np0.m : 0) | iE0;
                }
            }
        }
        return iB;
    }

    public final int E0(b87 b87Var) {
        oa0 oa0VarA;
        b85 b85Var = this.i2;
        if (b85Var.X) {
            oa0VarA = oa0.d;
        } else {
            ra0 ra0VarB = b85Var.r.b(b85Var.g(b87Var));
            na0 na0Var = new na0();
            na0Var.b(ra0VarB.a);
            na0Var.c(ra0VarB.b);
            na0Var.d(ra0VarB.c);
            oa0VarA = na0Var.a();
        }
        if (!oa0VarA.a) {
            return 0;
        }
        int i = oa0VarA.b ? 1536 : np0.o;
        return oa0VarA.c ? i | np0.q : i;
    }

    public final void F0() {
        long j;
        long jMax;
        long j2;
        j();
        b85 b85Var = this.i2;
        ks6 ks6Var = b85Var.b;
        if (!b85Var.n() || b85Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(b85Var.t.e(), xkg.l(b85Var.p, b85Var.j()));
            ArrayDeque arrayDeque = b85Var.h;
            while (!arrayDeque.isEmpty() && jMin >= ((z75) arrayDeque.getFirst()).c) {
                b85Var.w = (z75) arrayDeque.remove();
            }
            z75 z75Var = b85Var.w;
            long jI0 = jMin - z75Var.c;
            long jF = vqi.F(z75Var.a.a, jI0);
            if (arrayDeque.isEmpty()) {
                fdg fdgVar = (fdg) ks6Var.c;
                if (!fdgVar.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (fdgVar.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    long j3 = fdgVar.n;
                    edg edgVar = fdgVar.k;
                    edgVar.getClass();
                    long jE = j3 - ((long) edgVar.e());
                    int i = fdgVar.i.a;
                    int i2 = fdgVar.h.a;
                    j = Long.MIN_VALUE;
                    long j4 = fdgVar.o;
                    jI0 = i == i2 ? vqi.i0(jI0, jE, j4, RoundingMode.DOWN) : vqi.i0(jI0, jE * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jI0 = (long) (((double) fdgVar.d) * jI0);
                }
                z75 z75Var2 = b85Var.w;
                j2 = z75Var2.b + jI0;
                z75Var2.d = jI0 - jF;
            } else {
                j = Long.MIN_VALUE;
                z75 z75Var3 = b85Var.w;
                j2 = z75Var3.b + jF + z75Var3.d;
            }
            long j5 = ((d6g) ks6Var.b).q;
            jMax = xkg.l(b85Var.p, j5) + j2;
            long j6 = b85Var.Z;
            if (j5 > j6) {
                long jL = xkg.l(b85Var.p, j5 - j6);
                b85Var.Z = j5;
                b85Var.a0 += jL;
                if (b85Var.b0 == null) {
                    b85Var.b0 = new Handler(Looper.myLooper());
                }
                b85Var.b0.removeCallbacksAndMessages(null);
                b85Var.b0.postDelayed(new jj2(14, b85Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.p2) {
                jMax = Math.max(this.o2, jMax);
            }
            this.o2 = jMax;
            this.p2 = false;
        }
    }

    @Override // defpackage.pt9
    public final w55 I(nt9 nt9Var, b87 b87Var, b87 b87Var2) {
        w55 w55VarB = nt9Var.b(b87Var, b87Var2);
        int i = w55VarB.e;
        if (this.I == null && z0(b87Var2)) {
            i |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        }
        "OMX.google.raw.decoder".equals(nt9Var.a);
        if (b87Var2.o > this.k2) {
            i |= 64;
        }
        int i2 = i;
        return new w55(nt9Var.a, b87Var, b87Var2, i2 != 0 ? 0 : w55VarB.d, i2);
    }

    @Override // defpackage.pt9
    public final float Q(float f, b87 b87Var, b87[] b87VarArr) {
        int iMax = -1;
        for (b87 b87Var2 : b87VarArr) {
            int i = b87Var2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // defpackage.pt9
    public final ArrayList R(qt9 qt9Var, b87 b87Var, boolean z) {
        ghe gheVarG;
        if (b87Var.n == null) {
            gheVarG = ghe.e;
        } else if (this.i2.h(b87Var) != 0) {
            List listE = ut9.e("audio/raw", false, false);
            nt9 nt9Var = listE.isEmpty() ? null : (nt9) listE.get(0);
            if (nt9Var != null) {
                gheVarG = c98.r(nt9Var);
            } else {
                gheVarG = ut9.g(qt9Var, b87Var, z, false);
            }
        } else {
            gheVarG = ut9.g(qt9Var, b87Var, z, false);
        }
        HashMap map = ut9.a;
        ArrayList arrayList = new ArrayList(gheVarG);
        Collections.sort(arrayList, new z70(4, new rt9(this.g2, b87Var, 0)));
        return arrayList;
    }

    @Override // defpackage.pt9
    public final long S(long j, long j2) {
        long jI0;
        b85 b85Var = this.i2;
        boolean z = b85Var.l() && this.v2 != -9223372036854775807L;
        if (this.u2) {
            if (!b85Var.n()) {
                jI0 = -9223372036854775807L;
            } else if (xkg.g(b85Var.p)) {
                jI0 = xkg.l(b85Var.p, b85Var.t.c());
            } else {
                long jC = b85Var.t.c();
                int iB = gxl.b(xkg.b(b85Var.p).a);
                lvb.b0(iB != -2147483647);
                jI0 = vqi.i0(jC, 1000000L, iB, RoundingMode.DOWN);
            }
            if (this.s2 && z && jI0 != -9223372036854775807L) {
                float fMin = Math.min(jI0, this.v2 - j);
                s2d s2dVar = b85Var.x;
                return Math.max(10000L, (long) ((fMin / (s2dVar != null ? s2dVar.a : 1.0f)) / 2.0f));
            }
        } else if (z || this.R1) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.pt9
    public final yfj U(nt9 nt9Var, b87 b87Var, MediaCrypto mediaCrypto, float f) {
        b87[] b87VarArr = this.j;
        b87VarArr.getClass();
        String str = nt9Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = b87Var.o;
        String str2 = b87Var.n;
        int i = b87Var.F;
        if (b87VarArr.length != 1) {
            for (b87 b87Var2 : b87VarArr) {
                if (nt9Var.b(b87Var, b87Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, b87Var2.o);
                }
            }
        }
        this.k2 = iMax;
        this.l2 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = nt9Var.c;
        int i2 = this.k2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = b87Var.G;
        mediaFormat.setInteger("sample-rate", i3);
        trk.h(mediaFormat, b87Var.q);
        trk.g(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = qu3.b(b87Var);
            if (pairB != null) {
                trk.g(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                trk.g(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        a87 a87Var = new a87();
        a87Var.r("audio/raw");
        a87Var.b(i);
        a87Var.s(i3);
        a87Var.o(4);
        if (this.i2.h(a87Var.a()) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.t2));
        }
        G(mediaFormat);
        this.n2 = (!"audio/raw".equals(nt9Var.b) || "audio/raw".equals(str2)) ? null : b87Var;
        return yfj.i(nt9Var, mediaFormat, b87Var, mediaCrypto, this.j2);
    }

    @Override // defpackage.pt9
    public final void V(u55 u55Var) {
        b87 b87Var;
        xkg xkgVar;
        if (Build.VERSION.SDK_INT < 29 || (b87Var = u55Var.b) == null || !Objects.equals(b87Var.n, "audio/opus") || !this.F1) {
            return;
        }
        ByteBuffer byteBuffer = u55Var.g;
        byteBuffer.getClass();
        b87 b87Var2 = u55Var.b;
        b87Var2.getClass();
        int i = b87Var2.I;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            b85 b85Var = this.i2;
            ic0 ic0Var = b85Var.t;
            if (ic0Var == null || !ic0Var.h() || (xkgVar = b85Var.p) == null || !xkg.b(xkgVar).k) {
                return;
            }
            b85Var.t.m(i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    @Override // defpackage.pt9, defpackage.ks0, defpackage.e4d
    public final void a(int i, Object obj) {
        euc eucVar;
        b85 b85Var = this.i2;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (b85Var.H != fFloatValue) {
                b85Var.H = fFloatValue;
                if (b85Var.n()) {
                    b85Var.t.r(b85Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            p70 p70Var = (p70) obj;
            p70Var.getClass();
            if (b85Var.u.equals(p70Var)) {
                return;
            }
            b85Var.u = p70Var;
            if (b85Var.V) {
                return;
            }
            b85Var.p();
            return;
        }
        if (i == 6) {
            nj0 nj0Var = (nj0) obj;
            nj0Var.getClass();
            if (b85Var.S.equals(nj0Var)) {
                return;
            }
            if (b85Var.t != null) {
                b85Var.S.getClass();
            }
            b85Var.S = nj0Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            b85Var.T = audioDeviceInfo;
            ic0 ic0Var = b85Var.t;
            if (ic0Var != null) {
                ic0Var.q(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.t2 = ((Integer) obj).intValue();
            kt9 kt9Var = this.n1;
            if (kt9Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.t2));
                kt9Var.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            b85Var.y = ((Boolean) obj).booleanValue();
            z75 z75Var = new z75(b85Var.t() ? s2d.d : b85Var.x, -9223372036854775807L, -9223372036854775807L);
            if (b85Var.n()) {
                b85Var.v = z75Var;
                return;
            } else {
                b85Var.w = z75Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (b85Var.R) {
                if (b85Var.Q == iIntValue) {
                    b85Var.R = false;
                    if (b85Var.Q != iIntValue) {
                        b85Var.Q = iIntValue;
                        b85Var.P = iIntValue != 0;
                        b85Var.p();
                    }
                }
            } else if (b85Var.Q != iIntValue) {
                b85Var.Q = iIntValue;
                b85Var.P = iIntValue != 0;
                b85Var.p();
            }
            if (Build.VERSION.SDK_INT < 35 || (eucVar = this.j2) == null) {
                return;
            }
            eucVar.J(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = b85.c0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (b85Var.U == iIntValue2) {
                return;
            }
            b85Var.U = iIntValue2;
            b85Var.p();
            return;
        }
        if (i != 20) {
            super.a(i, obj);
            return;
        }
        obj.getClass();
        jc0 jc0Var = (jc0) obj;
        jc0 jc0Var2 = b85Var.r;
        if (jc0Var != jc0Var2) {
            u89 u89Var = jc0Var2.e;
            if (u89Var != null) {
                u89Var.d();
            }
            x70 x70Var = jc0Var2.h;
            if (x70Var != null) {
                x70Var.p();
            }
            b85Var.r = jc0Var;
            x75 x75Var = b85Var.s;
            if (x75Var != null) {
                jc0Var.e();
                if (jc0Var.e == null) {
                    u89 u89Var2 = new u89(Thread.currentThread());
                    jc0Var.e = u89Var2;
                    u89Var2.i = false;
                }
                jc0Var.e.a(x75Var);
            }
            b85Var.p();
        }
    }

    @Override // defpackage.pt9
    public final void b0(Exception exc) {
        lvb.l0("MediaCodecAudioRenderer", "Audio codec error", exc);
        v2a v2aVar = this.h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new hb0(v2aVar, exc, 0));
        }
    }

    @Override // defpackage.it9
    public final s2d c() {
        return this.i2.x;
    }

    @Override // defpackage.pt9
    public final void c0(long j, long j2, String str) {
        v2a v2aVar = this.h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new mb0(v2aVar, str, j, j2, 0));
        }
    }

    @Override // defpackage.pt9
    public final void d0(pu3 pu3Var) {
        v2a v2aVar = this.h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new qe(v2aVar, 8, pu3Var));
        }
    }

    @Override // defpackage.pt9
    public final void e0(String str) {
        v2a v2aVar = this.h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new qe(v2aVar, 7, str));
        }
    }

    @Override // defpackage.pt9
    public final w55 f0(v2a v2aVar) throws ExoPlaybackException {
        b87 b87Var = (b87) v2aVar.c;
        b87Var.getClass();
        this.m2 = b87Var;
        w55 w55VarF0 = super.f0(v2aVar);
        v2a v2aVar2 = this.h2;
        Handler handler = (Handler) v2aVar2.b;
        if (handler != null) {
            handler.post(new i0(v2aVar2, b87Var, w55VarF0, 3));
        }
        return w55VarF0;
    }

    @Override // defpackage.ks0
    public final it9 g() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c4 A[Catch: AudioSink$ConfigurationException -> 0x00c2, TryCatch #0 {AudioSink$ConfigurationException -> 0x00c2, blocks: (B:22:0x0098, B:25:0x00a0, B:27:0x00a5, B:29:0x00ae, B:33:0x00bc, B:36:0x00c4, B:40:0x00cb, B:41:0x00d0), top: B:45:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    @Override // defpackage.pt9
    public final void g0(b87 b87Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iH;
        b87 b87Var2 = this.n2;
        int[] iArrD = null;
        if (b87Var2 != null) {
            b87Var = b87Var2;
        } else if (this.n1 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(b87Var.n)) {
                iH = b87Var.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iH = mediaFormat.getInteger("pcm-encoding");
            } else {
                iH = mediaFormat.containsKey("v-bits-per-sample") ? vqi.H(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            a87 a87Var = new a87();
            a87Var.r("audio/raw");
            a87Var.o(iH);
            a87Var.f(b87Var.I);
            a87Var.g(b87Var.J);
            a87Var.n(b87Var.l);
            a87Var.i(b87Var.a);
            a87Var.k(b87Var.b);
            a87Var.l(b87Var.c);
            a87Var.m(b87Var.d);
            a87Var.t(b87Var.e);
            a87Var.q(b87Var.f);
            a87Var.b(mediaFormat.getInteger("channel-count"));
            a87Var.s(mediaFormat.getInteger("sample-rate"));
            b87Var = a87Var.a();
            if (this.l2) {
                iArrD = t01.d(b87Var.F);
            }
        }
        try {
            int i = Build.VERSION.SDK_INT;
            b85 b85Var = this.i2;
            if (i >= 29) {
                boolean z = true;
                if (this.F1) {
                    mje mjeVar = this.d;
                    mjeVar.getClass();
                    if (mjeVar.a != 0) {
                        mje mjeVar2 = this.d;
                        mjeVar2.getClass();
                        int i2 = mjeVar2.a;
                        b85Var.getClass();
                        if (i < 29) {
                            z = false;
                        }
                        lvb.b0(z);
                        b85Var.i = i2;
                    } else {
                        b85Var.getClass();
                        if (i >= 29) {
                            z = false;
                        }
                        lvb.b0(z);
                        b85Var.i = 0;
                    }
                } else {
                    b85Var.getClass();
                    if (i >= 29) {
                        z = false;
                    }
                    lvb.b0(z);
                    b85Var.i = 0;
                }
            }
            b85Var.c(b87Var, iArrD);
        } catch (AudioSink$ConfigurationException e) {
            throw d(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.ks0
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.pt9
    public final void h0() {
        this.i2.getClass();
    }

    @Override // defpackage.ks0
    public final boolean j() {
        if (!this.R1) {
            return false;
        }
        b85 b85Var = this.i2;
        if (b85Var.n()) {
            return b85Var.L && !b85Var.l();
        }
        return true;
    }

    @Override // defpackage.pt9
    public final void j0() {
        this.i2.E = true;
    }

    @Override // defpackage.ks0
    public final boolean l() {
        return this.i2.l();
    }

    @Override // defpackage.pt9, defpackage.ks0
    public final void m() {
        v2a v2aVar = this.h2;
        this.q2 = true;
        this.m2 = null;
        this.v2 = -9223372036854775807L;
        this.s2 = false;
        try {
            this.i2.f();
            try {
                super.m();
            } finally {
                v2aVar.q(this.V1);
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
                v2aVar.q(this.V1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // defpackage.pt9
    public final boolean m0(long j, long j2, kt9 kt9Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b87 b87Var) throws ExoPlaybackException {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.v2 = -9223372036854775807L;
        if (this.n2 != null && (i2 & 2) != 0) {
            kt9Var.getClass();
            kt9Var.m(i);
            return true;
        }
        b85 b85Var = this.i2;
        if (z) {
            if (kt9Var != null) {
                kt9Var.m(i);
            }
            this.V1.f += i3;
            b85Var.E = true;
            return true;
        }
        try {
            if (!b85Var.k(i3, j3, byteBuffer)) {
                this.v2 = j3;
                return false;
            }
            if (kt9Var != null) {
                kt9Var.m(i);
            }
            this.V1.e += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            b87 b87Var2 = this.m2;
            if (this.F1) {
                mje mjeVar = this.d;
                mjeVar.getClass();
                if (mjeVar.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw d(e, b87Var2, e.a, i5);
        } catch (AudioSink$WriteException e2) {
            if (this.F1) {
                mje mjeVar2 = this.d;
                mjeVar2.getClass();
                if (mjeVar2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw d(e2, b87Var, e2.b, i4);
        }
    }

    @Override // defpackage.ks0
    public final void n(boolean z, boolean z2) {
        t55 t55Var = new t55();
        this.V1 = t55Var;
        v2a v2aVar = this.h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new ib0(v2aVar, t55Var, 1));
        }
        mje mjeVar = this.d;
        mjeVar.getClass();
        boolean z3 = mjeVar.b;
        b85 b85Var = this.i2;
        if (z3) {
            lvb.b0(b85Var.P);
            if (!b85Var.V) {
                b85Var.V = true;
                b85Var.p();
            }
        } else if (b85Var.V) {
            b85Var.V = false;
            b85Var.p();
        }
        z3d z3dVar = this.f;
        z3dVar.getClass();
        b85Var.m = z3dVar;
        qt3 qt3Var = this.g;
        qt3Var.getClass();
        b85Var.r.f = qt3Var;
    }

    @Override // defpackage.it9
    public final boolean o() {
        boolean z = this.r2;
        this.r2 = false;
        return z;
    }

    @Override // defpackage.pt9, defpackage.ks0
    public final void p(long j, boolean z, boolean z2) throws ExoPlaybackException {
        super.p(j, z, z2);
        this.i2.f();
        this.o2 = j;
        this.v2 = -9223372036854775807L;
        this.r2 = false;
        this.s2 = false;
        this.p2 = true;
    }

    @Override // defpackage.pt9
    public final void p0() throws ExoPlaybackException {
        try {
            b85 b85Var = this.i2;
            if (!b85Var.L && b85Var.n() && b85Var.e()) {
                if (!b85Var.M) {
                    b85Var.M = true;
                    if (b85Var.t.h()) {
                        b85Var.N = false;
                    }
                    b85Var.t.s();
                }
                b85Var.L = true;
            }
            long j = this.W1.e;
            if (j != -9223372036854775807L) {
                this.v2 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw d(e, e.c, e.b, this.F1 ? 5003 : 5002);
        }
    }

    @Override // defpackage.ks0
    public final void q() {
        euc eucVar;
        jc0 jc0Var = this.i2.r;
        u89 u89Var = jc0Var.e;
        if (u89Var != null) {
            u89Var.d();
        }
        x70 x70Var = jc0Var.h;
        if (x70Var != null) {
            x70Var.p();
        }
        if (Build.VERSION.SDK_INT < 35 || (eucVar = this.j2) == null) {
            return;
        }
        eucVar.release();
    }

    @Override // defpackage.ks0
    public final void r() {
        b85 b85Var = this.i2;
        this.r2 = false;
        this.s2 = false;
        this.v2 = -9223372036854775807L;
        try {
            try {
                this.F1 = false;
                q0();
                o0();
                xu5.e(this.I, null);
                this.I = null;
                if (this.q2) {
                    this.q2 = false;
                    b85Var.q();
                }
            } catch (Throwable th) {
                xu5.e(this.I, null);
                this.I = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.q2) {
                this.q2 = false;
                b85Var.q();
            }
            throw th2;
        }
    }

    @Override // defpackage.ks0
    public final void s() {
        b85 b85Var = this.i2;
        b85Var.O = true;
        if (b85Var.n()) {
            b85Var.t.k();
        }
        this.u2 = true;
    }

    @Override // defpackage.ks0
    public final void t() {
        F0();
        this.u2 = false;
        b85 b85Var = this.i2;
        b85Var.O = false;
        if (b85Var.n()) {
            b85Var.t.j();
        }
        this.s2 = false;
    }

    @Override // defpackage.it9
    public final void x(s2d s2dVar) {
        b85 b85Var = this.i2;
        b85Var.getClass();
        b85Var.x = new s2d(vqi.i(s2dVar.a, 0.1f, 8.0f), vqi.i(s2dVar.b, 0.1f, 8.0f));
        if (b85Var.t()) {
            if (b85Var.n()) {
                b85Var.t.o(b85Var.x);
                b85Var.x = b85Var.t.d();
                return;
            }
            return;
        }
        z75 z75Var = new z75(s2dVar, -9223372036854775807L, -9223372036854775807L);
        if (b85Var.n()) {
            b85Var.v = z75Var;
        } else {
            b85Var.w = z75Var;
        }
    }

    @Override // defpackage.pt9
    public final boolean z0(b87 b87Var) {
        mje mjeVar = this.d;
        mjeVar.getClass();
        if (mjeVar.a != 0) {
            int iE0 = E0(b87Var);
            if ((iE0 & np0.o) != 0) {
                mje mjeVar2 = this.d;
                mjeVar2.getClass();
                if (mjeVar2.a == 2 || (iE0 & 1024) != 0 || (b87Var.I == 0 && b87Var.J == 0)) {
                    return true;
                }
            }
        }
        return this.i2.h(b87Var) != 0;
    }
}
