package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ic0 {
    public static final Object p = new Object();
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final ta0 b;
    public final w4 c;
    public ljf d;
    public final lc0 e;
    public final boolean f;
    public final int g;
    public final dc9 h;
    public final u89 i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    public ic0(AudioTrack audioTrack, ta0 ta0Var, w4 w4Var, qt3 qt3Var) {
        this.a = audioTrack;
        this.b = ta0Var;
        this.c = w4Var;
        u89 u89Var = new u89(Thread.currentThread());
        this.i = u89Var;
        u89Var.i = false;
        boolean zO = vqi.O(ta0Var.a);
        this.f = zO;
        if (zO) {
            this.g = vqi.v(ta0Var.a) * Integer.bitCount(ta0Var.c);
        } else {
            this.g = -1;
        }
        this.e = new lc0(new c7k(2, this), qt3Var, audioTrack, ta0Var.a, this.g, ta0Var.f);
        if (w4Var != null) {
            this.d = new ljf(audioTrack, w4Var);
        }
        this.h = h() ? new dc9(this) : null;
    }

    public final void a(y75 y75Var) {
        this.i.a(y75Var);
    }

    public final int b() {
        return this.a.getAudioSessionId();
    }

    public final long c() {
        return this.a.getBufferSizeInFrames();
    }

    public final s2d d() {
        PlaybackParams playbackParams = this.a.getPlaybackParams();
        return new s2d(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:112:0x0318  */
    /* JADX WARN: Code duplicated, block: B:115:0x0325  */
    /* JADX WARN: Code duplicated, block: B:116:0x0327  */
    /* JADX WARN: Code duplicated, block: B:121:0x032f  */
    /* JADX WARN: Code duplicated, block: B:124:0x033d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0356  */
    /* JADX WARN: Code duplicated, block: B:130:0x0372  */
    /* JADX WARN: Code duplicated, block: B:132:0x0375  */
    public final long e() {
        long j;
        long j2;
        boolean z;
        long jNanoTime;
        boolean z2;
        lc0 lc0Var;
        long jB;
        int playState;
        long j3;
        long j4;
        long jF;
        long j5;
        int i;
        boolean z3;
        AudioTimestamp audioTimestamp;
        float f;
        cc0 cc0Var;
        int i2;
        long j6;
        Method method;
        long j7;
        Method method2;
        lc0 lc0Var2 = this.e;
        qt3 qt3Var = lc0Var2.b;
        dc0 dc0Var = lc0Var2.h;
        AudioTrack audioTrack = lc0Var2.d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = lc0Var2.c;
            ((nfh) qt3Var).getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - lc0Var2.l >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                j = 1000;
                long jG0 = vqi.g0(lc0Var2.e, lc0Var2.a());
                if (jG0 != 0) {
                    jArr[lc0Var2.s] = vqi.I(lc0Var2.i, jG0) - jNanoTime2;
                    lc0Var2.s = (lc0Var2.s + 1) % 10;
                    int i3 = lc0Var2.t;
                    if (i3 < 10) {
                        lc0Var2.t = i3 + 1;
                    }
                    lc0Var2.l = jNanoTime2;
                    lc0Var2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = lc0Var2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        int i6 = i4;
                        lc0Var2.k = (jArr[i6] / ((long) i5)) + lc0Var2.k;
                        i4 = i6 + 1;
                    }
                }
            } else {
                j = 1000;
            }
            long j8 = lc0Var2.n;
            if (lc0Var2.g && (method = lc0Var2.m) != null && jNanoTime2 - lc0Var2.o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = vqi.a;
                    j7 = jNanoTime2;
                    try {
                        long jIntValue = (((long) num.intValue()) * j) - lc0Var2.f;
                        lc0Var2.n = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        lc0Var2.n = jMax;
                        if (jMax > 10000000) {
                            lvb.G0("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            lc0Var2.n = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        lc0Var2.m = method2;
                    }
                } catch (Exception unused2) {
                    j7 = jNanoTime2;
                    method2 = null;
                }
                jNanoTime2 = j7;
                lc0Var2.o = jNanoTime2;
            }
            boolean z4 = j8 != lc0Var2.n;
            float f2 = lc0Var2.i;
            long jB2 = lc0Var2.b(jNanoTime2);
            cc0 cc0Var2 = dc0Var.a;
            cc0 cc0Var3 = dc0Var.a;
            j2 = 0;
            int i7 = dc0Var.b;
            if (z4 || jNanoTime2 - dc0Var.g >= dc0Var.f) {
                dc0Var.g = jNanoTime2;
                AudioTrack audioTrack2 = cc0Var2.a;
                AudioTimestamp audioTimestamp2 = cc0Var2.b;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j9 = audioTimestamp2.framePosition;
                    long j10 = cc0Var2.d;
                    if (j10 > j9) {
                        if (cc0Var2.f) {
                            cc0Var2.g += j10;
                            cc0Var2.f = false;
                        } else {
                            cc0Var2.c++;
                        }
                    }
                    cc0Var2.d = j9;
                    cc0Var2.e = j9 + cc0Var2.g + (cc0Var2.c << 32);
                }
                if (timestamp) {
                    c7k c7kVar = dc0Var.c;
                    long j11 = audioTimestamp2.nanoTime / j;
                    audioTrack = audioTrack;
                    cc0Var = cc0Var3;
                    long jF2 = vqi.F(f2, jNanoTime2 - (cc0Var3.b.nanoTime / j)) + vqi.g0(i7, cc0Var3.e);
                    if (Math.abs(j11 - jNanoTime2) > 5000000) {
                        long j12 = cc0Var2.e;
                        c7kVar.getClass();
                        StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb.append(j12);
                        sb.append(", ");
                        sb.append(j11);
                        qt4.z(jNanoTime2, ", ", ", ", sb);
                        sb.append(jB2);
                        sb.append(", ");
                        sb.append(((ic0) c7kVar.b).g());
                        lvb.G0("AudioTrackAudioOutput", sb.toString());
                        i2 = 4;
                        dc0Var.a(4);
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                    } else if (Math.abs(jF2 - jB2) > 5000000) {
                        z3 = timestamp;
                        long j13 = cc0Var2.e;
                        c7kVar.getClass();
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                        sb2.append(j13);
                        sb2.append(", ");
                        sb2.append(j11);
                        qt4.z(jNanoTime2, ", ", ", ", sb2);
                        sb2.append(jB2);
                        sb2.append(", ");
                        sb2.append(((ic0) c7kVar.b).g());
                        lvb.G0("AudioTrackAudioOutput", sb2.toString());
                        i2 = 4;
                        dc0Var.a(4);
                    } else {
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        i2 = 4;
                        if (dc0Var.d == 4) {
                            dc0Var.a(0);
                        }
                    }
                } else {
                    z3 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    f = f2;
                    audioTrack = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0222: MOVE (r31v4 'audioTrack' android.media.AudioTrack) = (r9v6 android.media.AudioTrack) in method: ic0.e():long, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v6 android.media.AudioTrack
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 889
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ic0.e():long");
                }

                public final int f() {
                    return this.a.getSampleRate();
                }

                public final long g() {
                    if (!this.f) {
                        return this.l;
                    }
                    long j = this.k;
                    long j2 = this.g;
                    String str = vqi.a;
                    return ((j + j2) - 1) / j2;
                }

                public final boolean h() {
                    return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
                }

                public final boolean i() {
                    long jG = g();
                    lc0 lc0Var = this.e;
                    if (lc0Var.v == -9223372036854775807L || jG <= 0) {
                        return false;
                    }
                    ((nfh) lc0Var.b).getClass();
                    return SystemClock.elapsedRealtime() - lc0Var.v >= 200;
                }

                public final void j() {
                    lc0 lc0Var = this.e;
                    lc0Var.k = 0L;
                    lc0Var.t = 0;
                    lc0Var.s = 0;
                    lc0Var.l = 0L;
                    lc0Var.y = -9223372036854775807L;
                    lc0Var.z = -9223372036854775807L;
                    if (lc0Var.u == -9223372036854775807L) {
                        lc0Var.h.a(0);
                    }
                    lc0Var.w = lc0Var.a();
                    if (!this.j || h()) {
                        this.a.pause();
                    }
                }

                public final void k() {
                    lc0 lc0Var = this.e;
                    if (lc0Var.u != -9223372036854775807L) {
                        ((nfh) lc0Var.b).getClass();
                        lc0Var.u = vqi.X(SystemClock.elapsedRealtime());
                    }
                    lc0Var.j = vqi.g0(lc0Var.e, lc0Var.a());
                    lc0Var.h.a(0);
                    if (!this.j || h()) {
                        this.a.play();
                    }
                }

                public final void l() {
                    if (this.e.d.getPlayState() == 3) {
                        this.a.pause();
                    }
                    if (Build.VERSION.SDK_INT >= 29 && h()) {
                        dc9 dc9Var = this.h;
                        dc9Var.getClass();
                        ((ic0) dc9Var.d).a.unregisterStreamEventCallback((hc0) dc9Var.c);
                        ((Handler) dc9Var.b).removeCallbacksAndMessages(null);
                    }
                    ljf ljfVar = this.d;
                    if (ljfVar != null) {
                        AudioTrack audioTrack = (AudioTrack) ljfVar.b;
                        fc0 fc0Var = (fc0) ljfVar.e;
                        fc0Var.getClass();
                        audioTrack.removeOnRoutingChangedListener(fc0Var);
                        ljfVar.e = null;
                        this.d = null;
                    }
                    AudioTrack audioTrack2 = this.a;
                    u89 u89Var = this.i;
                    Handler handlerP = vqi.p(null);
                    synchronized (p) {
                        try {
                            if (q == null) {
                                q = Executors.newSingleThreadScheduledExecutor(new g94("ExoPlayer:AudioTrackReleaseThread", 1));
                            }
                            r++;
                            q.schedule(new i0(audioTrack2, handlerP, u89Var, 5), 20L, TimeUnit.MILLISECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                public final void m(int i, int i2) {
                    if (Build.VERSION.SDK_INT < 29) {
                        return;
                    }
                    this.a.setOffloadDelayPadding(i, i2);
                }

                public final void n() {
                    if (Build.VERSION.SDK_INT < 29) {
                        return;
                    }
                    AudioTrack audioTrack = this.a;
                    if (audioTrack.getPlayState() != 3) {
                        return;
                    }
                    audioTrack.setOffloadEndOfStream();
                    lc0 lc0Var = this.e;
                    lc0Var.A = true;
                    lc0Var.h.a.f = true;
                }

                public final void o(s2d s2dVar) {
                    AudioTrack audioTrack = this.a;
                    try {
                        audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(s2dVar.a).setPitch(s2dVar.b).setAudioFallbackMode(2));
                    } catch (IllegalArgumentException e) {
                        lvb.H0("AudioTrackAudioOutput", "Failed to set playback params", e);
                    }
                    float speed = audioTrack.getPlaybackParams().getSpeed();
                    lc0 lc0Var = this.e;
                    lc0Var.i = speed;
                    lc0Var.h.a(0);
                    lc0Var.k = 0L;
                    lc0Var.t = 0;
                    lc0Var.s = 0;
                    lc0Var.l = 0L;
                    lc0Var.y = -9223372036854775807L;
                    lc0Var.z = -9223372036854775807L;
                }

                public final void p(z3d z3dVar) {
                    if (Build.VERSION.SDK_INT < 31) {
                        return;
                    }
                    LogSessionId logSessionIdA = z3dVar.a();
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                        return;
                    }
                    this.a.setLogSessionId(logSessionIdA);
                }

                public final void q(AudioDeviceInfo audioDeviceInfo) {
                    this.a.setPreferredDevice(audioDeviceInfo);
                }

                public final void r(float f) {
                    this.a.setVolume(f);
                }

                public final void s() {
                    if (this.j) {
                        return;
                    }
                    this.j = true;
                    long jG = g();
                    lc0 lc0Var = this.e;
                    lc0Var.w = lc0Var.a();
                    ((nfh) lc0Var.b).getClass();
                    lc0Var.u = vqi.X(SystemClock.elapsedRealtime());
                    lc0Var.x = jG;
                    this.a.stop();
                }

                public final boolean t(int i, long j, ByteBuffer byteBuffer) throws AudioOutput$WriteException {
                    int iWrite;
                    boolean z;
                    w4 w4Var;
                    jc0 jc0Var;
                    x70 x70Var;
                    ta0 ta0Var = this.b;
                    boolean z2 = this.f;
                    if (!z2 && this.n == 0) {
                        this.n = b85.i(ta0Var.a, byteBuffer);
                    }
                    g();
                    AudioTrack audioTrack = this.a;
                    int underrunCount = audioTrack.getUnderrunCount();
                    boolean z3 = underrunCount > this.o;
                    this.o = underrunCount;
                    if (z3) {
                        this.i.f(-1, new p51(9));
                    }
                    int iRemaining = byteBuffer.remaining();
                    if (ta0Var.d) {
                        if (j == Long.MIN_VALUE) {
                            j = this.m;
                        } else {
                            this.m = j;
                        }
                        iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
                    } else {
                        iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
                    }
                    if (iWrite >= 0) {
                        z = iWrite == iRemaining;
                        if (z2) {
                            this.k += (long) iWrite;
                            return z;
                        }
                        if (z) {
                            this.l = (((long) this.n) * ((long) i)) + this.l;
                        }
                        return z;
                    }
                    z = iWrite == -6 || iWrite == -32;
                    if (z && (w4Var = this.c) != null && (x70Var = (jc0Var = (jc0) w4Var.a).h) != null) {
                        u70 u70Var = u70.c;
                        jc0Var.g = u70Var;
                        x70Var.h(u70Var);
                    }
                    throw new AudioOutput$WriteException(iWrite, z);
                }
            }
