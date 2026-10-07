package defpackage;

import android.media.AudioRecord;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.video.calls.audio.opus.FileWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class khc implements zce {
    public static final /* synthetic */ zv8[] y;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final xt4 h;
    public final xt4 i;
    public final ifh j;
    public final ifh k;
    public volatile AudioRecord l;
    public volatile String m;
    public volatile int n;
    public volatile long p;
    public volatile hhc s;
    public volatile jce t;
    public final String a = khc.class.getName();
    public final mjg o = p90.a(0L);
    public final AtomicInteger q = new AtomicInteger(0);
    public final AtomicBoolean r = new AtomicBoolean();
    public final ByteBuffer u = ByteBuffer.allocateDirect(1920);
    public final ConcurrentLinkedDeque v = new ConcurrentLinkedDeque();
    public final short[] w = new short[1024];
    public final p3c x = qyj.S();

    static {
        z8b z8bVar = new z8b(khc.class, "recordJob", "getRecordJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        y = new zv8[]{z8bVar};
    }

    public khc(xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        n0c n0cVar = (n0c) xhhVar;
        final int i = 1;
        this.h = n0cVar.b().R0(1, "opus-audio-record-record");
        this.i = n0cVar.b().R0(1, "opus-audio-record-encode");
        final int i2 = 0;
        this.j = new ifh(new af7(this) { // from class: fhc
            public final /* synthetic */ khc b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0042  */
            /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 java.lang.Object, still in use, count: 2, list:
                  (r1v7 java.lang.Object) from 0x003e: PHI (r1 I:??) = (r1v3 java.lang.Object), (r1v7 java.lang.Object) binds: [B:10:0x003d, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
                  (r1v7 java.lang.Object) from 0x0036: CHECK_CAST (hhc) (r1v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // defpackage.af7
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    int r0 = r2
                    khc r3 = r3.b
                    switch(r0) {
                        case 0: goto L45;
                        default: goto L7;
                    }
                L7:
                    ny8 r3 = r3.d
                    java.lang.Object r3 = r3.getValue()
                    e5d r3 = (defpackage.e5d) r3
                    b5d r3 = r3.a5
                    zv8[] r0 = defpackage.e5d.S6
                    r1 = 314(0x13a, float:4.4E-43)
                    r0 = r0[r1]
                    i5d r3 = r3.a(r0)
                    java.lang.Object r3 = r3.i()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    ma6 r0 = defpackage.hhc.d
                    java.util.Iterator r0 = r0.iterator()
                L2b:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L3d
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    hhc r2 = (defpackage.hhc) r2
                    int r2 = r2.a
                    if (r2 != r3) goto L2b
                    goto L3e
                L3d:
                    r1 = 0
                L3e:
                    hhc r1 = (defpackage.hhc) r1
                    if (r1 != 0) goto L44
                    hhc r1 = defpackage.hhc.RATE_48000_HZ
                L44:
                    return r1
                L45:
                    ny8 r3 = r3.d
                    java.lang.Object r3 = r3.getValue()
                    e5d r3 = (defpackage.e5d) r3
                    b5d r3 = r3.Z4
                    zv8[] r0 = defpackage.e5d.S6
                    r1 = 313(0x139, float:4.39E-43)
                    r0 = r0[r1]
                    i5d r3 = r3.a(r0)
                    java.lang.Object r3 = r3.i()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fhc.invoke():java.lang.Object");
            }
        });
        this.k = new ifh(new af7(this) { // from class: fhc
            public final /* synthetic */ khc b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 java.lang.Object, still in use, count: 2, list:
                  (r1v7 java.lang.Object) from 0x003e: PHI (r1 I:??) = (r1v3 java.lang.Object), (r1v7 java.lang.Object) binds: [B:10:0x003d, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
                  (r1v7 java.lang.Object) from 0x0036: CHECK_CAST (hhc) (r1v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // defpackage.af7
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    int r0 = r2
                    khc r3 = r3.b
                    switch(r0) {
                        case 0: goto L45;
                        default: goto L7;
                    }
                L7:
                    ny8 r3 = r3.d
                    java.lang.Object r3 = r3.getValue()
                    e5d r3 = (defpackage.e5d) r3
                    b5d r3 = r3.a5
                    zv8[] r0 = defpackage.e5d.S6
                    r1 = 314(0x13a, float:4.4E-43)
                    r0 = r0[r1]
                    i5d r3 = r3.a(r0)
                    java.lang.Object r3 = r3.i()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    ma6 r0 = defpackage.hhc.d
                    java.util.Iterator r0 = r0.iterator()
                L2b:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L3d
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    hhc r2 = (defpackage.hhc) r2
                    int r2 = r2.a
                    if (r2 != r3) goto L2b
                    goto L3e
                L3d:
                    r1 = 0
                L3e:
                    hhc r1 = (defpackage.hhc) r1
                    if (r1 != 0) goto L44
                    hhc r1 = defpackage.hhc.RATE_48000_HZ
                L44:
                    return r1
                L45:
                    ny8 r3 = r3.d
                    java.lang.Object r3 = r3.getValue()
                    e5d r3 = (defpackage.e5d) r3
                    b5d r3 = r3.Z4
                    zv8[] r0 = defpackage.e5d.S6
                    r1 = 313(0x139, float:4.39E-43)
                    r0 = r0[r1]
                    i5d r3 = r3.a(r0)
                    java.lang.Object r3 = r3.i()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fhc.invoke():java.lang.Object");
            }
        });
    }

    public static final void n(khc khcVar, int i, int i2, ByteBuffer byteBuffer, float f) {
        int i3 = i2 / 2;
        double d = 0.0d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            short s = byteBuffer.getShort();
            d += (double) (s * s);
            if (i5 == i4) {
                short[] sArr = khcVar.w;
                if (i < sArr.length) {
                    sArr[i] = s;
                    i4 += (int) f;
                    i++;
                }
            }
        }
        khcVar.q.updateAndGet(new ehc((int) Math.sqrt(d / ((double) i3)), 0));
    }

    public static final void o(khc khcVar, ByteBuffer byteBuffer, boolean z, ihc ihcVar) {
        int iLimit;
        while (byteBuffer.hasRemaining()) {
            vd7.q(ihcVar.getContext());
            if (byteBuffer.remaining() > khcVar.u.remaining()) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + khcVar.u.remaining());
            } else {
                iLimit = -1;
            }
            khcVar.u.put(byteBuffer);
            vd7.q(ihcVar.getContext());
            if (khcVar.u.position() == khcVar.u.limit() || z) {
                int iPosition = z ? byteBuffer.position() : khcVar.u.limit();
                if (iPosition > khcVar.u.capacity()) {
                    iPosition = khcVar.u.capacity();
                }
                vd7.q(ihcVar.getContext());
                lhc lhcVar = (lhc) khcVar.g.getValue();
                ByteBuffer byteBuffer2 = khcVar.u;
                FileWriter fileWriter = lhcVar.c;
                if (fileWriter == null) {
                    ore.p("Writer didn't exist. Call start before write");
                    return;
                }
                if (fileWriter.writeFrame(byteBuffer2, iPosition)) {
                    khcVar.u.rewind();
                    mjg mjgVar = khcVar.o;
                    long jLongValue = ((Number) mjgVar.getValue()).longValue();
                    ByteBuffer byteBuffer3 = khcVar.u;
                    hhc hhcVar = khcVar.s;
                    if (hhcVar == null) {
                        ore.p("Required value was null.");
                        return;
                    }
                    mjgVar.j(null, new Long(gm0.L((byteBuffer3.limit() / 2) * (1000.0f / hhcVar.a)) + jLongValue));
                }
            }
            if (iLimit != -1) {
                byteBuffer.limit(iLimit);
            }
        }
        khcVar.v.add(byteBuffer);
    }

    @Override // defpackage.zce
    public final boolean a() {
        return this.l != null;
    }

    @Override // defpackage.zce
    public final Object b(long j, lq4 lq4Var) {
        sbi sbiVar = sbi.a;
        this.p = 0L;
        mjg mjgVar = this.o;
        Long l = new Long(0L);
        mjgVar.getClass();
        lq4 lq4Var2 = null;
        mjgVar.j(null, l);
        this.q.set(0);
        this.m = null;
        String absolutePath = ((ju6) ((rs6) this.f.getValue())).f(j).getAbsolutePath();
        if (absolutePath == null) {
            gm0.V(this.a, "Couldn't create a file for the audio message", new ghc("Couldn't create a file for the audio message", null, 2, null));
            jce jceVar = this.t;
            if (jceVar != null) {
                jceVar.Q(new IllegalStateException("Couldn't create a file for the audio message"));
                return sbiVar;
            }
        } else {
            vd7.q(lq4Var.getContext());
            hhc hhcVar = (hhc) this.k.getValue();
            int iIntValue = ((Number) this.j.getValue()).intValue();
            while (hhcVar != null) {
                this.n = AudioRecord.getMinBufferSize(hhcVar.a, 16, 2);
                if (this.n > 0) {
                    break;
                }
                vd7.q(lq4Var.getContext());
                int iOrdinal = hhcVar.ordinal() - 1;
                hhcVar = iOrdinal >= 0 ? (hhc) hhc.d.get(iOrdinal) : null;
            }
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    Integer num = hhcVar != null ? new Integer(hhcVar.a) : null;
                    a4cVar.c(je9Var, str, s5h.y0("Start record with params. \n            |sampleRate:" + num + ", \n            |bitrate:" + iIntValue + ", \n            |bufferSize:" + this.n + "\n            |"), null);
                }
            }
            this.s = hhcVar;
            if (hhcVar == null) {
                gm0.V(this.a, "Couldn't find correct samplingRate for audioRecord", new ghc("Couldn't find correct samplingRate for audioRecord", null, 2, null));
                jce jceVar2 = this.t;
                if (jceVar2 != null) {
                    jceVar2.Q(new IllegalStateException("Couldn't find correct samplingRate for audioRecord"));
                    return sbiVar;
                }
            } else {
                vd7.q(lq4Var.getContext());
                try {
                    lhc lhcVar = (lhc) this.g.getValue();
                    int i = hhcVar.a;
                    if (!lhcVar.b) {
                        if (!lhcVar.a.a(vab.WEBRTC)) {
                            throw new IllegalStateException("Failed to load native opus lib");
                        }
                        lhcVar.b = true;
                    }
                    lhcVar.c = FileWriter.startRecord(absolutePath, iIntValue, i);
                    this.m = absolutePath;
                    try {
                        AudioRecord audioRecord = new AudioRecord(1, hhcVar.a, 16, 2, this.n * 4);
                        if (audioRecord.getState() != 0) {
                            this.l = audioRecord;
                            this.r.set(false);
                            this.u.rewind();
                            vd7.q(lq4Var.getContext());
                            audioRecord.startRecording();
                            this.x.B(this, y[0], yab.h0((wmi) this.b.getValue(), this.h, 2, new wz6(this, audioRecord, lq4Var2, 28)));
                            return sbiVar;
                        }
                        gm0.V(this.a, "Couldn't create audioRecord because state is STATE_UNINITIALIZED", new ghc("Couldn't create audioRecord because state is STATE_UNINITIALIZED", null, 2, null));
                        jce jceVar3 = this.t;
                        if (jceVar3 != null) {
                            jceVar3.Q(new IllegalStateException("Couldn't create audioRecord because state is STATE_UNINITIALIZED"));
                            return sbiVar;
                        }
                    } catch (IllegalArgumentException e) {
                        ghc ghcVar = new ghc("Can't start record audio", e);
                        gm0.V(this.a, ghcVar.getMessage(), ghcVar);
                        jce jceVar4 = this.t;
                        if (jceVar4 != null) {
                            jceVar4.Q(e);
                        }
                    } catch (CancellationException e2) {
                        gm0.n(this.a, "Start recording in opus was cancelled");
                        throw e2;
                    } catch (IllegalStateException e3) {
                        ghc ghcVar2 = new ghc("Can't start record audio", e3);
                        gm0.V(this.a, ghcVar2.getMessage(), ghcVar2);
                        jce jceVar5 = this.t;
                        if (jceVar5 != null) {
                            jceVar5.Q(e3);
                        }
                    }
                } catch (IOException e4) {
                    ghc ghcVar3 = new ghc("Couldn't start native writer", e4);
                    gm0.V(this.a, ghcVar3.getMessage(), ghcVar3);
                    jce jceVar6 = this.t;
                    if (jceVar6 != null) {
                        jceVar6.Q(e4);
                    }
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.zce
    public final Object c(yce yceVar, lq4 lq4Var) {
        String str;
        if (!(yceVar instanceof wce) || (str = this.m) == null) {
            return null;
        }
        wce wceVar = (wce) yceVar;
        return new q90(str, wceVar.a, wceVar.b);
    }

    @Override // defpackage.zce
    public final void d() {
        try {
            f();
            AudioRecord audioRecord = this.l;
            if (audioRecord != null) {
                audioRecord.stop();
            }
            AudioRecord audioRecord2 = this.l;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
        } catch (Exception e) {
            ghc ghcVar = new ghc("Couldn't stop audio recorder", e);
            gm0.V(this.a, ghcVar.getMessage(), ghcVar);
        }
        lq4 lq4Var = null;
        this.l = null;
        p3c p3cVar = this.x;
        zv8[] zv8VarArr = y;
        int i = 0;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.x.B(this, zv8VarArr[0], null);
        yab.i0((wmi) this.b.getValue(), this.i, 0, new jhc(this, lq4Var, i), 2);
    }

    @Override // defpackage.zce
    public final float e() {
        return 0.0f;
    }

    @Override // defpackage.zce
    public final void f() {
        this.r.compareAndSet(false, true);
    }

    @Override // defpackage.zce
    public final boolean g() {
        return ((wsc) this.e.getValue()).c(wsc.i);
    }

    @Override // defpackage.zce
    public final String h() {
        return null;
    }

    @Override // defpackage.zce
    public final void i(jce jceVar) {
        this.t = jceVar;
    }

    @Override // defpackage.zce
    public final int j() {
        return this.q.getAndSet(0);
    }

    @Override // defpackage.zce
    public final mjg k() {
        return this.o;
    }

    @Override // defpackage.zce
    public final void l() {
        this.r.compareAndSet(true, false);
    }

    @Override // defpackage.zce
    public final float m() {
        return 1.0f;
    }
}
