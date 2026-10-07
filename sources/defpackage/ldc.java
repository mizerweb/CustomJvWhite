package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ldc extends BaseVideoPlayer {
    public static final ifh a0 = new ifh(new yxb(6));
    public static final ifh b0 = new ifh(new yxb(7));
    public final Context E;
    public final pgg F;
    public final yxb G;
    public dfd H;
    public final String I;
    public volatile r66 J;
    public final gzh K;
    public final sg6 L;
    public boolean M;
    public int N;
    public final ifh O;
    public final kdc P;
    public final jdc Q;
    public String R;
    public long S;
    public long T;
    public long U;
    public final bg6 V;
    public final p3c W;
    public udc X;
    public final pgg Y;
    public final gve Z;

    public ldc(Context context, Looper looper, odc odcVar, pgg pggVar, z55 z55Var, ybf ybfVar, m6h m6hVar) {
        myh myhVar = myh.c;
        this.E = context;
        this.F = pggVar;
        boolean z = nec.a;
        if (myhVar.a.compareTo(myhVar.b) > 0) {
            Log.e("OneVideoExoPlayer", "trackSelectionConfig is invalid!!!");
        }
        this.G = new yxb(8);
        this.I = np4.s(context);
        final int i = 1;
        af7 af7Var = new af7(this) { // from class: hdc
            public final /* synthetic */ ldc b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ldc ldcVar = this.b;
                switch (i2) {
                    case 0:
                        return ldcVar.J;
                    default:
                        return ldcVar.v;
                }
            }
        };
        yxb yxbVar = new yxb(this);
        boolean z2 = nec.a;
        qec qecVar = new qec(context, new ks6(myhVar, af7Var, yxbVar), z55Var);
        this.J = r66.a;
        gzh gzhVar = new gzh(qecVar, this.a);
        gzhVar.b.add(new hzh(this, this.k));
        this.K = gzhVar;
        this.L = new sg6(this, this.m);
        vr2 vr2Var = new vr2(1);
        edc edcVarR = ku6.m.r(context);
        vb5 vb5Var = new vb5(vqi.X(20L), vqi.X(500L));
        this.N = -1;
        this.O = new ifh(new yxb(10));
        kdc kdcVar = new kdc(this);
        this.P = kdcVar;
        jdc jdcVar = new jdc(this);
        this.Q = jdcVar;
        final int i2 = 0;
        af7 af7Var2 = new af7(this) { // from class: hdc
            public final /* synthetic */ ldc b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ldc ldcVar = this.b;
                switch (i3) {
                    case 0:
                        return ldcVar.J;
                    default:
                        return ldcVar.v;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(vr2Var);
        jec jecVar = new jec(context, arrayList);
        jecVar.c = true;
        jecVar.d = new t3a(af7Var2);
        if6 if6Var = new if6(context, jecVar);
        if6Var.c(qecVar);
        lvb.b0(!if6Var.B);
        if6Var.s = vb5Var;
        lvb.b0(!if6Var.B);
        edcVarR.getClass();
        if6Var.g = new hf6(2, edcVarR);
        Looper looper2 = (Looper) b0.getValue();
        lvb.b0((if6Var.B || looper2 == Looper.getMainLooper()) ? false : true);
        if6Var.A = new ga4(looper2);
        lvb.b0(!if6Var.B);
        if6Var.u = 2000L;
        lvb.b0(!if6Var.B);
        if6Var.z = false;
        lvb.b0(!if6Var.B);
        if6Var.v = 600000;
        lvb.b0(!if6Var.B);
        if6Var.y = 600000;
        lvb.b0(!if6Var.B);
        if6Var.i = looper;
        if6Var.b(odcVar);
        bg6 bg6VarA = if6Var.a();
        bg6VarA.I0();
        if (!bg6VarA.Q.equals(ybfVar)) {
            bg6VarA.Q = ybfVar;
            bg6VarA.m.h.c(5, ybfVar).b();
        }
        bg6VarA.n.a(kdcVar);
        bg6VarA.d(jdcVar);
        bg6VarA.n.a(gzhVar);
        bg6VarA.d(gzhVar);
        hle hleVar = zhd.a;
        int i3 = bg6VarA.j0;
        bg6VarA.I0();
        hle hleVar2 = bg6VarA.k0;
        if (hleVar2 != hleVar) {
            if (bg6VarA.l0) {
                hleVar2.getClass();
                hleVar2.n(i3);
            }
            if (hleVar == null || !bg6VarA.h0()) {
                bg6VarA.l0 = false;
            } else {
                hleVar.a(i3);
                bg6VarA.l0 = true;
            }
            bg6VarA.k0 = hleVar;
        }
        wje wjeVar = this.d;
        if (wjeVar != null) {
            wjeVar.a(this, new fbc(bg6VarA, 6, this), new Handler(bg6VarA.u));
        }
        this.V = bg6VarA;
        this.W = new p3c(8, new oo3(1, this, ldc.class, "createMediaSource", "createMediaSource(Lone/video/player/model/source/VideoSource;)Landroidx/media3/exoplayer/source/MediaSource;", 0, 6));
        this.Y = new pgg(this);
        this.Z = new gve(this);
    }

    public static final p4d v(ldc ldcVar, k3d k3dVar) {
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        m4d m4dVar = ldcVar.u;
        m4j m4jVarB = m4dVar != null ? m4dVar.b(k3dVar.b) : null;
        boolean z = nec.a;
        int i = k3dVar.b;
        Objects.toString(m4jVarB);
        if (m4jVarB instanceof q99) {
            boolean z2 = nec.a;
        } else {
            boolean z3 = nec.a;
        }
        return new p4d(k3dVar.b, k3dVar.f);
    }

    public static void w(af7 af7Var) {
        boolean z = nec.a;
        if (af7Var != null) {
        }
    }

    public final long A(m4j m4jVar) {
        if (m4jVar instanceof q99) {
            B();
            return 0L;
        }
        bg6 bg6Var = this.V;
        if (bg6Var.getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return bg6Var.getDuration();
    }

    public final void B() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isStandardLiveSeekSupported");
        if (z() instanceof j15) {
            boolean z = nec.a;
        }
    }

    public final void C(ush ushVar) {
        boolean z = nec.a;
        Objects.toString(ushVar);
        bg6 bg6Var = this.V;
        if (ushVar == null) {
            ushVar = bg6Var.v();
        }
        if (ushVar.p()) {
            boolean z2 = nec.a;
            return;
        }
        tsh tshVar = new tsh();
        ushVar.n(0, tshVar);
        iy9 iy9Var = tshVar.i;
        if (iy9Var != null) {
            long jE = bg6Var.e();
            long jP0 = vqi.p0(tshVar.k);
            idc idcVar = new idc(this, jP0, jE, tshVar, iy9Var);
            boolean z3 = nec.a;
            if (jP0 == -9223372036854775807L || jE >= jP0) {
                return;
            }
            boolean z4 = nec.a;
            bg6Var.v0(jP0);
        }
    }

    public final void D(p4d p4dVar, boolean z) {
        boolean z2 = nec.a;
        int i = p4dVar.a;
        this.q = 0.0d;
        this.r = 0L;
        SystemClock.elapsedRealtime();
        verifyThread("one.video.exo.OneVideoExoPlayer.editPlaylist");
        w(this.G);
        verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        mg6 mg6Var = (mg6) this.u;
        if (mg6Var == null) {
            return;
        }
        mg6Var.b(p4dVar.a());
        boolean z3 = nec.a;
        mg6Var.toString();
        Objects.toString(p4dVar);
        f94 f94VarD = mg6Var.d();
        if (f94VarD != null) {
            long jB = p4dVar.b();
            if (mg6Var.b(p4dVar.a()) instanceof q99) {
                jB = -9223372036854775807L;
            }
            this.k.o(this);
            List listSingletonList = Collections.singletonList(f94VarD);
            int iA = p4dVar.a();
            bg6 bg6Var = this.V;
            bg6Var.I0();
            bg6Var.y0(listSingletonList, iA, jB, false);
            this.M = z;
            bg6Var.n(z);
            bg6Var.prepare();
            wje wjeVar = this.d;
            if (wjeVar != null) {
                wjeVar.f(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    @Override // one.video.player.BaseVideoPlayer, defpackage.aec
    public final String a() {
        tg6 tg6Var;
        tg6 tg6Var2;
        tg6 tg6VarP;
        tg6 tg6VarP2;
        fzh fzhVar;
        verifyThread("one.video.exo.OneVideoExoPlayer.getDebugInfoString");
        long jY = y();
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPositionReal");
        bg6 bg6Var = this.V;
        long jE = bg6Var.e();
        StringBuilder sb = new StringBuilder();
        sb.append(super.a());
        sb.append("host: " + this.R);
        sb.append('\n');
        long j = this.S;
        long j2 = this.T / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        long j3 = this.U / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        StringBuilder sbS = qt4.s(j, "chunk: [D]=", " ms, size: [V]=");
        sbS.append(j2);
        sb.append(zo5.k(j3, " kB, [A]=", " kB", sbS));
        sb.append('\n');
        tg6 tg6Var3 = new tg6();
        tg6 tg6Var4 = new tg6();
        ush ushVarV = bg6Var.v();
        if (ushVarV.p()) {
            tg6Var = tg6Var3;
            tg6Var2 = tg6Var4;
            tg6VarP2 = tg6Var;
        } else {
            long jE2 = bg6Var.e();
            tsh tshVar = new tsh();
            ushVarV.i(tshVar, new rsh(), 0, jE2);
            Object obj = tshVar.c;
            if (obj == null || !(obj instanceof k15)) {
                tg6Var = tg6Var3;
                tg6Var2 = tg6Var4;
                tg6VarP2 = tg6Var;
            } else {
                k15 k15Var = (k15) obj;
                long j4 = k15Var.a;
                if (-9223372036854775807L == j4) {
                    j4 = 0;
                }
                int iC = k15Var.c();
                if (iC > 0) {
                    tg6Var = tg6Var3;
                    tg6Var2 = tg6Var4;
                    long j5 = tshVar.e;
                    long j6 = (-9223372036854775807L != j5 ? j5 : 0L) + jE2;
                    fzh fzhVarQ = bg6Var.q();
                    if (fzhVarQ.a(2) || fzhVarQ.a(1)) {
                        int i = 0;
                        while (true) {
                            if (i < iC) {
                                fsc fscVarB = k15Var.b(i);
                                List list = fscVarB.c;
                                long jD = k15Var.d(i);
                                k15 k15Var2 = k15Var;
                                long j7 = fscVarB.b;
                                long j8 = j4 + j7;
                                if (j8 > j6 || (-9223372036854775807L != jD && j6 - j8 >= jD)) {
                                    i++;
                                    k15Var = k15Var2;
                                    fzhVarQ = fzhVarQ;
                                } else {
                                    long j9 = (j6 - j4) - j7;
                                    int iA = fscVarB.a(2);
                                    if (-1 != iA) {
                                        fzhVar = fzhVarQ;
                                        tg6VarP2 = np4.p((ga) list.get(iA), fzhVar, j9, jD);
                                    } else {
                                        fzhVar = fzhVarQ;
                                        tg6VarP2 = tg6Var;
                                    }
                                    int iA2 = fscVarB.a(1);
                                    tg6VarP = -1 != iA2 ? np4.p((ga) list.get(iA2), fzhVar, j9, jD) : tg6Var2;
                                }
                            }
                        }
                    }
                } else {
                    tg6Var = tg6Var3;
                    tg6Var2 = tg6Var4;
                }
                tg6VarP2 = tg6Var;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (!tg6VarP2.a() || !tg6VarP.a()) {
            sb2.append("Segment");
            if (!tg6VarP2.a()) {
                sb2.append(" V: ");
                sb2.append(tg6VarP2);
            }
            if (!tg6VarP.a()) {
                sb2.append(" A: ");
                sb2.append(tg6VarP);
            }
        }
        String string = sb2.toString();
        if (r5h.X0(string)) {
            string = null;
        }
        if (string != null) {
            sb.append(string);
            sb.append('\n');
        }
        String strS = jY != jE ? nbh.s(jE, " (", ")") : "";
        verifyThread("one.video.exo.OneVideoExoPlayer.getDuration");
        long jA = A(z());
        StringBuilder sbT = qt4.t(jY, "Position: ", strS, " ms, duration: ");
        sbT.append(jA);
        sbT.append(" ms");
        sb.append(sbT.toString());
        sb.append('\n');
        sb.append("vfpo: " + k());
        sb.append('\n');
        sb.append("SegmentsToLoad: " + ((ucf) this.F.a));
        sb.append('\n');
        if (Build.VERSION.SDK_INT >= 31) {
            sb.append("SoC: " + Build.SOC_MODEL + ", Manufacturer: " + Build.SOC_MANUFACTURER);
            sb.append('\n');
        }
        long jV = bg6Var.V();
        StringBuilder sb3 = new StringBuilder();
        if (jV != -9223372036854775807L) {
            long jE3 = bg6Var.e();
            long duration = bg6Var.getDuration();
            StringBuilder sbS2 = qt4.s(jV, "Live offset: ", ", pos: ");
            sbS2.append(jE3);
            sb3.append(zo5.k(duration, ", dur: ", " ms", sbS2));
            sb3.append('\n');
            ush ushVarV2 = bg6Var.v();
            if (!ushVarV2.p()) {
                tsh tshVar2 = new tsh();
                ushVarV2.n(0, tshVar2);
                iy9 iy9Var = tshVar2.i;
                if (iy9Var != null) {
                    long j10 = iy9Var.a;
                    String strValueOf = j10 == -9223372036854775807L ? "-" : String.valueOf(j10);
                    long j11 = iy9Var.b;
                    String strValueOf2 = j11 == -9223372036854775807L ? "-" : String.valueOf(j11);
                    long j12 = iy9Var.c;
                    String strValueOf3 = j12 != -9223372036854775807L ? String.valueOf(j12) : "-";
                    StringBuilder sbQ = qv1.q("Target: ", strValueOf, " min: ", strValueOf2, " max: ");
                    sbQ.append(strValueOf3);
                    sb3.append(sbQ.toString());
                    sb3.append('\n');
                }
            }
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    @Override // defpackage.aec
    public final t4j b() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getSelectedVideoTrack");
        return this.K.f;
    }

    @Override // defpackage.aec
    public final edc c() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getBandwidthMeter");
        return ku6.m.r(this.E);
    }

    @Override // defpackage.aec
    public final stl d() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getDroppedFramesInfo");
        return null;
    }

    @Override // defpackage.aec
    public final ec0 e() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentAudioTrack");
        return this.K.e;
    }

    @Override // defpackage.aec
    public final t4j f() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentVideoTrack");
        return this.K.g;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final o4d i() {
        return this.W;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final long k() {
        kwi kwiVarB;
        verifyThread("one.video.exo.OneVideoExoPlayer.getVideoFrameProcessingOffsetAverage");
        t4j t4jVarF = f();
        if (t4jVarF == null || (kwiVarB = t4jVarF.b()) == null) {
            return 100L;
        }
        long j = this.r;
        if (j == 0) {
            return 100L;
        }
        return (long) (((this.q / j) / (1000.0d / ((double) (Double.compare((double) kwiVarB.b(), 0.0d) != 0 ? kwiVarB.b() : 1.0f)))) * 100.0d);
    }

    @Override // one.video.player.BaseVideoPlayer
    public final Float l(float f) {
        bg6 bg6Var = this.V;
        s2d s2dVarZ = bg6Var.Z();
        if (f == 1.0f) {
            boolean z = nec.a;
        }
        if (s2dVarZ.a == f) {
            return Float.valueOf(f);
        }
        bg6Var.z0(new s2d(f, s2dVarZ.b));
        return Float.valueOf(bg6Var.Z().a);
    }

    @Override // one.video.player.BaseVideoPlayer
    public final int m(int i) {
        int iD = qt4.D(i);
        int i2 = 0;
        if (iD != 0) {
            int i3 = 1;
            if (iD != 1) {
                i3 = 2;
                if (iD != 2) {
                    ore.o();
                    return 0;
                }
            }
            i2 = i3;
        }
        bg6 bg6Var = this.V;
        bg6Var.I0();
        if (i2 != bg6Var.I) {
            bg6Var.setRepeatMode(i2);
        }
        return i;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final Float n(float f) {
        bg6 bg6Var = this.V;
        bg6Var.I0();
        if (bg6Var.d0 != f) {
            bg6Var.b(f);
        }
        bg6Var.I0();
        return Float.valueOf(bg6Var.d0);
    }

    @Override // one.video.player.BaseVideoPlayer
    public final void p(m4d m4dVar, p4d p4dVar, boolean z) {
        boolean z2 = nec.a;
        m4dVar.toString();
        p4dVar.toString();
        gzh gzhVar = this.K;
        gzhVar.getClass();
        boolean z3 = nec.a;
        r66 r66Var = r66.a;
        gzhVar.c = r66Var;
        gzhVar.d = r66Var;
        gzhVar.e = null;
        gzhVar.l = null;
        gzhVar.f = null;
        gzhVar.g = null;
        gzhVar.k = null;
        gzhVar.h = null;
        D(p4dVar, z);
    }

    public final int x() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPlaylistItemIndex");
        int iF = this.V.F();
        verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        m4d m4dVar = this.u;
        if (m4dVar == null || iF >= m4dVar.c()) {
            return -1;
        }
        return iF;
    }

    public final long y() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPosition");
        if (z() instanceof q99) {
            B();
            return 0L;
        }
        bg6 bg6Var = this.V;
        if (bg6Var.getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return bg6Var.e();
    }

    public final m4j z() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentSource");
        verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        m4d m4dVar = this.u;
        if (m4dVar != null) {
            return m4dVar.b(this.V.F());
        }
        return null;
    }
}
