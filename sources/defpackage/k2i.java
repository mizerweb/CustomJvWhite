package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.DefaultAssetLoaderFactory;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException;
import java.io.File;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k2i {
    public RuntimeException A;
    public int B;
    public int C;
    public boolean D;
    public final Context a;
    public final k84 b;
    public final boolean c;
    public final dc9 d;
    public final vog e;
    public final sfh f;
    public final qt3 g;
    public final long h;
    public final HandlerThread i;
    public final sfh j;
    public final ArrayList k;
    public final Object l;
    public final xde m;
    public final ArrayList n;
    public final t9b o;
    public final r94 p;
    public final Object q;
    public final Object r;
    public final ww6 s;
    public final Object t;
    public final c98 u;
    public final int v;
    public final boolean w;
    public boolean x;
    public long y;
    public int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k2i] */
    public k2i(Context context, k84 k84Var, b2i b2iVar, so2 so2Var, rwi rwiVar, iu3 iu3Var, c98 c98Var, int i, t9b t9bVar, vog vogVar, g85 g85Var, sfh sfhVar, p51 p51Var, qt3 qt3Var, long j, LogSessionId logSessionId, boolean z) {
        k84 k84Var2 = k84Var;
        qt3 qt3Var2 = qt3Var;
        ?? obj = new Object();
        obj.a = context;
        obj.b = k84Var2;
        obj.d = new dc9(iu3Var);
        obj.u = c98Var;
        obj.v = i;
        obj.e = vogVar;
        obj.f = sfhVar;
        obj.g = qt3Var2;
        obj.h = j;
        obj.o = t9bVar;
        obj.w = z;
        StringBuilder sbV = qt4.v("Init ", Integer.toHexString(System.identityHashCode(obj)), " [AndroidXMedia3/1.9.3] [");
        sbV.append(vqi.a);
        sbV.append("]");
        lvb.r0("TransformerInternal", sbV.toString());
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        obj.i = handlerThread;
        handlerThread.start();
        obj.k = new ArrayList();
        Looper looper = handlerThread.getLooper();
        obj.l = new Object();
        xde xdeVar = new xde(k84Var2);
        c98 c98Var2 = (c98) k84Var2.b;
        obj.m = xdeVar;
        LogSessionId logSessionId2 = logSessionId;
        DefaultAssetLoaderFactory defaultAssetLoaderFactory = new DefaultAssetLoaderFactory(context, new s95(new a9m(context)), qt3Var2, logSessionId2);
        int i2 = 0;
        k2i k2iVar = obj;
        while (i2 < c98Var2.size()) {
            j2i j2iVar = new j2i(k2iVar, i2, k84Var2, b2iVar, so2Var, rwiVar, g85Var, p51Var, logSessionId2);
            k2i k2iVar2 = k2iVar;
            int i3 = i2;
            k84 k84Var3 = k84Var2;
            k2iVar2.k.add(new shf((t26) c98Var2.get(i3), defaultAssetLoaderFactory, new ay(b2iVar.d, k84Var3.h), j2iVar, qt3Var2, looper));
            k2iVar2.z++;
            int i4 = i3 + 1;
            qt3Var2 = qt3Var;
            logSessionId2 = logSessionId;
            k2iVar = k2iVar2;
            k84Var2 = k84Var3;
            i2 = i4;
        }
        k2i k2iVar3 = k2iVar;
        k2iVar3.c = k2iVar3.z != c98Var2.size();
        k2iVar3.q = new Object();
        k2iVar3.p = new r94();
        k2iVar3.r = new Object();
        k2iVar3.s = new ww6(15);
        k2iVar3.t = new Object();
        k2iVar3.n = new ArrayList();
        k2iVar3.j = ((nfh) qt3Var).a(looper, new w84(7, k2iVar3));
    }

    public final void a() {
        synchronized (this.t) {
            try {
                if (this.D) {
                    return;
                }
                e();
                this.j.d(null, 4, 1, 0).b();
                this.g.getClass();
                this.p.b();
                this.p.d();
                RuntimeException runtimeException = this.A;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0184 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x018b  */
    /* JADX WARN: Code duplicated, block: B:107:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    /* JADX WARN: Code duplicated, block: B:109:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01da  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:141:0x0226  */
    /* JADX WARN: Code duplicated, block: B:187:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final void b() {
        int i;
        u55 u55VarJ;
        t9b t9bVar;
        int i2;
        ByteBuffer byteBuffer;
        t9b t9bVar2;
        int iI0;
        int i3;
        g2i g2iVar;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        long jP0;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        int i8 = 0;
        while (i8 < this.n.size()) {
            while (true) {
                tye tyeVar = (tye) this.n.get(i8);
                if (!tyeVar.d) {
                    b87 b87VarK = tyeVar.k();
                    if (b87VarK != null) {
                        if (tyeVar.c != null) {
                            a87 a87VarA = b87VarK.a();
                            a87VarA.k = tyeVar.c;
                            b87VarK = new b87(a87VarA);
                        }
                        if (!tyeVar.a.d(b87VarK.n)) {
                            String strC = ut9.c(b87VarK);
                            if (tyeVar.a.d(strC)) {
                                a87 a87VarA2 = b87VarK.a();
                                a87VarA2.m = uya.n(strC);
                                b87VarK = new b87(a87VarA2);
                            }
                        }
                        try {
                            tyeVar.a.a(b87VarK);
                            tyeVar.d = true;
                            if (tyeVar.l()) {
                                t9bVar2 = tyeVar.a;
                                int i9 = tyeVar.b;
                                if (t9bVar2.f) {
                                    i = i8;
                                } else {
                                    i = i8;
                                }
                            } else {
                                i = i8;
                                u55VarJ = tyeVar.j();
                                if (u55VarJ == null) {
                                    t9bVar = tyeVar.a;
                                    i2 = tyeVar.b;
                                    byteBuffer = u55VarJ.d;
                                    byteBuffer.getClass();
                                    if (!t9bVar.e(i2, byteBuffer, u55VarJ.d(1), u55VarJ.f)) {
                                        tyeVar.o();
                                    }
                                }
                            }
                        } catch (MuxerException e) {
                            throw new ExportException("Muxer error", e, 7001, null);
                        } catch (MuxerWrapper$AppendTrackFormatException e2) {
                            throw new ExportException("Muxer error", e2, 7003, null);
                        }
                    } else {
                        i = i8;
                    }
                    if (!tyeVar.l()) {
                        break;
                        break;
                    }
                    break;
                }
                if (tyeVar.l()) {
                    t9bVar2 = tyeVar.a;
                    int i10 = tyeVar.b;
                    if (t9bVar2.f || !vqi.l(t9bVar2.d, i10)) {
                        i = i8;
                    } else {
                        s9b s9bVar = (s9b) t9bVar2.d.get(i10);
                        t9bVar2.j = Math.max(0L, Math.min(t9bVar2.j, s9bVar.c));
                        t9bVar2.k = Math.max(t9bVar2.k, s9bVar.f);
                        vog vogVar = t9bVar2.c;
                        b87 b87Var = s9bVar.a;
                        long j = s9bVar.f;
                        if (j > 0) {
                            i = i8;
                            long j2 = s9bVar.d;
                            if (j2 > 0) {
                                long j3 = s9bVar.c;
                                if (j != j3) {
                                    iI0 = (int) vqi.i0(j2, 8000000L, j - j3, RoundingMode.DOWN);
                                }
                            }
                            i3 = s9bVar.e;
                            g2iVar = (g2i) vogVar.a;
                            if (i10 == 1) {
                                wv5 wv5Var = g2iVar.q;
                                wv5Var.g = b87Var.n;
                                if (iI0 <= 0 || iI0 == -2147483647) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                lvb.R(z5);
                                wv5Var.c = iI0;
                                i6 = b87Var.F;
                                if (i6 != -1) {
                                    wv5 wv5Var2 = g2iVar.q;
                                    wv5Var2.getClass();
                                    if (i6 <= 0 || i6 == -1) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    lvb.R(z7);
                                    wv5Var2.d = i6;
                                }
                                i7 = b87Var.G;
                                if (i7 != -1) {
                                    wv5 wv5Var3 = g2iVar.q;
                                    wv5Var3.getClass();
                                    if (i7 <= 0 || i7 == -2147483647) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    lvb.R(z6);
                                    wv5Var3.e = i7;
                                }
                            } else if (i10 == 2) {
                                wv5 wv5Var4 = g2iVar.q;
                                wv5Var4.p = b87Var.n;
                                if (iI0 <= 0 || iI0 == -2147483647) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                lvb.R(z);
                                wv5Var4.h = iI0;
                                wv5Var4.o = b87Var.D;
                                if (i3 >= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                lvb.R(z2);
                                wv5Var4.k = i3;
                                i4 = b87Var.v;
                                if (i4 != -1) {
                                    wv5 wv5Var5 = g2iVar.q;
                                    wv5Var5.getClass();
                                    if (i4 <= 0 || i4 == -1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    lvb.R(z4);
                                    wv5Var5.i = i4;
                                }
                                i5 = b87Var.u;
                                if (i5 != -1) {
                                    wv5 wv5Var6 = g2iVar.q;
                                    wv5Var6.getClass();
                                    if (i5 <= 0 || i5 == -1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    lvb.R(z3);
                                    wv5Var6.j = i5;
                                }
                            }
                            vqi.K(i10);
                            LinkedHashMap linkedHashMap = g55.a;
                            synchronized (g55.class) {
                            }
                            if (t9bVar2.m == 1) {
                                t9bVar2.d.delete(i10);
                                if (t9bVar2.d.size() == 0) {
                                    t9bVar2.g = true;
                                    g55.a();
                                }
                            } else if (i10 == 2) {
                                t9bVar2.n = true;
                            } else if (i10 == 1) {
                                t9bVar2.o = true;
                            }
                            jP0 = vqi.p0(t9bVar2.k - t9bVar2.j);
                            if (t9bVar2.m != 1 && t9bVar2.n && (t9bVar2.o || t9bVar2.s == 1)) {
                                vog vogVar2 = t9bVar2.c;
                                long length = new File(t9bVar2.a).length();
                                vogVar2.c(jP0, length > 0 ? length : -1L);
                            } else if (t9bVar2.g) {
                                vog vogVar3 = t9bVar2.c;
                                long length2 = new File(t9bVar2.a).length();
                                vogVar3.c(jP0, length2 > 0 ? length2 : -1L);
                            }
                        } else {
                            i = i8;
                        }
                        iI0 = -2147483647;
                        i3 = s9bVar.e;
                        g2iVar = (g2i) vogVar.a;
                        if (i10 == 1) {
                            wv5 wv5Var7 = g2iVar.q;
                            wv5Var7.g = b87Var.n;
                            if (iI0 <= 0) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            lvb.R(z5);
                            wv5Var7.c = iI0;
                            i6 = b87Var.F;
                            if (i6 != -1) {
                                wv5 wv5Var8 = g2iVar.q;
                                wv5Var8.getClass();
                                if (i6 <= 0) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                lvb.R(z7);
                                wv5Var8.d = i6;
                            }
                            i7 = b87Var.G;
                            if (i7 != -1) {
                                wv5 wv5Var9 = g2iVar.q;
                                wv5Var9.getClass();
                                if (i7 <= 0) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                lvb.R(z6);
                                wv5Var9.e = i7;
                            }
                        } else if (i10 == 2) {
                            wv5 wv5Var10 = g2iVar.q;
                            wv5Var10.p = b87Var.n;
                            if (iI0 <= 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            lvb.R(z);
                            wv5Var10.h = iI0;
                            wv5Var10.o = b87Var.D;
                            if (i3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            lvb.R(z2);
                            wv5Var10.k = i3;
                            i4 = b87Var.v;
                            if (i4 != -1) {
                                wv5 wv5Var11 = g2iVar.q;
                                wv5Var11.getClass();
                                if (i4 <= 0) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                lvb.R(z4);
                                wv5Var11.i = i4;
                            }
                            i5 = b87Var.u;
                            if (i5 != -1) {
                                wv5 wv5Var12 = g2iVar.q;
                                wv5Var12.getClass();
                                if (i5 <= 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                lvb.R(z3);
                                wv5Var12.j = i5;
                            }
                        }
                        vqi.K(i10);
                        LinkedHashMap linkedHashMap2 = g55.a;
                        synchronized (g55.class) {
                            if (t9bVar2.m == 1) {
                                t9bVar2.d.delete(i10);
                                if (t9bVar2.d.size() == 0) {
                                    t9bVar2.g = true;
                                    g55.a();
                                }
                            } else if (i10 == 2) {
                                t9bVar2.n = true;
                            } else if (i10 == 1) {
                                t9bVar2.o = true;
                            }
                            jP0 = vqi.p0(t9bVar2.k - t9bVar2.j);
                            if (t9bVar2.m != 1) {
                                if (t9bVar2.g) {
                                    vog vogVar4 = t9bVar2.c;
                                    long length3 = new File(t9bVar2.a).length();
                                    vogVar4.c(jP0, length3 > 0 ? length3 : -1L);
                                }
                            } else if (t9bVar2.g) {
                                vog vogVar5 = t9bVar2.c;
                                long length4 = new File(t9bVar2.a).length();
                                vogVar5.c(jP0, length4 > 0 ? length4 : -1L);
                            }
                        }
                    }
                } else {
                    i = i8;
                    u55VarJ = tyeVar.j();
                    if (u55VarJ == null) {
                        try {
                            t9bVar = tyeVar.a;
                            i2 = tyeVar.b;
                            byteBuffer = u55VarJ.d;
                            byteBuffer.getClass();
                            if (!t9bVar.e(i2, byteBuffer, u55VarJ.d(1), u55VarJ.f)) {
                                tyeVar.o();
                            }
                        } catch (MuxerException e3) {
                            throw new ExportException("Muxer error", e3, 7001, null);
                        }
                    }
                }
                if (!tyeVar.l() || !tyeVar.m()) {
                    break;
                }
                i8 = i;
            }
            i8 = i + 1;
        }
        if (!this.D) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i11 >= this.k.size()) {
                    synchronized (this.r) {
                        this.B = 2;
                        this.C = i12 / i13;
                        break;
                    }
                }
                ((t26) ((c98) this.b.b).get(i11)).getClass();
                this.s.b = 0;
                int iC = ((shf) this.k.get(i11)).c(this.s);
                if (iC != 2) {
                    synchronized (this.r) {
                        this.B = iC;
                        this.C = 0;
                    }
                    break;
                } else {
                    i12 += this.s.b;
                    i13++;
                    i11++;
                }
            }
        }
        t9b t9bVar3 = this.o;
        if (t9bVar3.g) {
            return;
        }
        if (t9bVar3.m == 1 && t9bVar3.n && (t9bVar3.o || t9bVar3.s == 1)) {
            return;
        }
        this.j.j(3, 10);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final void c(int i, ExportException exportException) {
        z88 z88Var = new z88(4);
        int i2 = 0;
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            shf shfVar = (shf) this.k.get(i3);
            shfVar.h();
            z88Var.f(shfVar.i.h());
        }
        boolean z = i == 1;
        boolean z2 = this.D;
        ExportException exportException2 = null;
        if (!z2) {
            synchronized (this.t) {
                this.D = true;
            }
            lvb.r0("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "] [" + sz9.b() + "]");
            ExportException exportException3 = null;
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                try {
                    ((tye) this.n.get(i4)).n();
                } catch (RuntimeException e) {
                    if (exportException3 == null) {
                        exportException3 = ExportException.d(e);
                        this.A = e;
                    }
                }
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                try {
                    ((shf) this.k.get(i5)).release();
                } catch (RuntimeException e2) {
                    if (exportException3 == null) {
                        exportException3 = ExportException.d(e2);
                        this.A = e2;
                    }
                }
            }
            try {
                t9b t9bVar = this.o;
                if (i != 0) {
                    if (i == 1) {
                        i2 = 1;
                    } else if (i == 2) {
                        i2 = 2;
                    } else {
                        ore.k(zo5.h(i, "Unexpected end reason "));
                    }
                }
                t9bVar.b(i2);
            } catch (MuxerException e3) {
                if (exportException3 == null) {
                    exportException3 = new ExportException("Muxer error", e3, 7001, null);
                }
            } catch (RuntimeException e4) {
                if (exportException3 == null) {
                    ExportException exportExceptionD = ExportException.d(e4);
                    this.A = e4;
                    exportException2 = exportExceptionD;
                }
                sfh sfhVar = this.j;
                HandlerThread handlerThread = this.i;
                Objects.requireNonNull(handlerThread);
                sfhVar.f(new hqh(handlerThread, 1));
                if (z) {
                    this.p.f();
                    return;
                }
                if (exportException == null) {
                    exportException = exportException2;
                }
                if (exportException != null) {
                    if (z2) {
                        return;
                    }
                    lvb.b0(this.f.a.post(new ewg(this, 11, z88Var)));
                    return;
                }
                if (z2) {
                    lvb.H0("TransformerInternal", "Export error after export ended", exportException);
                } else {
                    lvb.b0(this.f.a.post(new alg(this, z88Var, exportException, 3)));
                }
            }
            exportException2 = exportException3;
            sfh sfhVar2 = this.j;
            HandlerThread handlerThread2 = this.i;
            Objects.requireNonNull(handlerThread2);
            sfhVar2.f(new hqh(handlerThread2, 1));
        }
        if (z) {
            this.p.f();
            return;
        }
        if (exportException == null) {
            exportException = exportException2;
        }
        if (exportException != null) {
            if (z2) {
                return;
            }
            lvb.b0(this.f.a.post(new ewg(this, 11, z88Var)));
            return;
        }
        if (z2) {
            lvb.H0("TransformerInternal", "Export error after export ended", exportException);
        } else {
            lvb.b0(this.f.a.post(new alg(this, z88Var, exportException, 3)));
        }
    }

    public final void d(ExportException exportException) {
        synchronized (this.t) {
            try {
                if (this.D) {
                    lvb.H0("TransformerInternal", "Export error after export ended", exportException);
                } else {
                    e();
                    this.j.d(exportException, 4, 2, 0).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        lvb.Z("Internal thread is dead.", this.i.isAlive());
    }
}
