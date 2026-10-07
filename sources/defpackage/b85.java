package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b85 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public nj0 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final ks6 b;
    public Handler b0;
    public final vr2 c;
    public final d5i d;
    public final tuh e;
    public final suh f;
    public final ghe g;
    public final ArrayDeque h;
    public int i;
    public y75 j;
    public final a85 k;
    public final a85 l;
    public z3d m;
    public v56 n;
    public xkg o;
    public xkg p;
    public bb0 q;
    public jc0 r;
    public x75 s;
    public ic0 t;
    public p70 u;
    public z75 v;
    public z75 w;
    public s2d x;
    public boolean y;
    public long z;

    public b85(qz4 qz4Var) {
        int deviceId;
        Context context = (Context) qz4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = p70.i;
        this.b = (ks6) qz4Var.d;
        this.i = 0;
        this.r = (jc0) qz4Var.f;
        vr2 vr2Var = new vr2(0);
        this.c = vr2Var;
        d5i d5iVar = new d5i();
        d5iVar.m = vqi.b;
        this.d = d5iVar;
        this.e = new tuh();
        this.f = new suh();
        this.g = c98.s(d5iVar, vr2Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new nj0();
        s2d s2dVar = s2d.d;
        this.w = new z75(s2dVar, 0L, 0L);
        this.x = s2dVar;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new a85();
        this.l = new a85();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    public static int i(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return uel.f(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = vqi.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    int iD = xjg.d(iReverseBytes);
                    if (iD != -1) {
                        return iD;
                    }
                    ore.a();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return np0.q;
                default:
                    switch (i) {
                        case 14:
                            int iB = t01.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return t01.f(iB, byteBuffer) * 16;
                        case 15:
                            return np0.o;
                        case 16:
                            return 1024;
                        case 17:
                            return h21.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            ore.k(zo5.h(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            return t01.e(byteBuffer);
        }
        return a05.g(byteBuffer);
    }

    public final void a(long j) {
        s2d s2dVar;
        boolean z;
        boolean zT = t();
        int i = 0;
        ks6 ks6Var = this.b;
        if (zT) {
            s2dVar = s2d.d;
        } else {
            if (s()) {
                s2dVar = this.x;
                fdg fdgVar = (fdg) ks6Var.c;
                float f = s2dVar.a;
                fdgVar.getClass();
                lvb.R(f > 0.0f);
                if (fdgVar.d != f) {
                    fdgVar.d = f;
                    fdgVar.j = true;
                }
                float f2 = s2dVar.b;
                lvb.R(f2 > 0.0f);
                if (fdgVar.e != f2) {
                    fdgVar.e = f2;
                    fdgVar.j = true;
                }
            } else {
                s2dVar = s2d.d;
            }
            this.x = s2dVar;
        }
        s2d s2dVar2 = s2dVar;
        if (s()) {
            z = this.y;
            ((d6g) ks6Var.b).o = z;
        } else {
            z = false;
        }
        this.y = z;
        this.h.add(new z75(s2dVar2, Math.max(0L, j), xkg.l(this.p, j())));
        bb0 bb0VarA = xkg.a(this.p);
        this.q = bb0VarA;
        bb0VarA.b();
        v56 v56Var = this.n;
        if (v56Var != null) {
            boolean z2 = this.y;
            v2a v2aVar = ((lt9) v56Var.b).h2;
            Handler handler = (Handler) v2aVar.b;
            if (handler != null) {
                handler.post(new nb0(v2aVar, z2, i));
            }
        }
    }

    public final ic0 b(ta0 ta0Var) throws AudioSink$InitializationException {
        try {
            return this.r.a(ta0Var);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(ta0Var.b, ta0Var.c, ta0Var.a, ta0Var.f, xkg.c(this.p), ta0Var.e, e);
            v56 v56Var = this.n;
            if (v56Var == null) {
                throw audioSink$InitializationException;
            }
            v56Var.I(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(b87 b87Var, int[] iArr) {
        bb0 bb0Var;
        b87 b87VarA;
        int i;
        int iV;
        if (this.s == null && this.a != null) {
            x75 x75Var = new x75(this);
            this.s = x75Var;
            jc0 jc0Var = this.r;
            jc0Var.e();
            if (jc0Var.e == null) {
                u89 u89Var = new u89(Thread.currentThread());
                jc0Var.e = u89Var;
                u89Var.i = false;
            }
            jc0Var.e.a(x75Var);
        }
        String str = b87Var.n;
        int i2 = b87Var.H;
        if ("audio/raw".equals(str)) {
            lvb.R(vqi.O(i2));
            int iV2 = vqi.v(i2) * b87Var.F;
            z88 z88Var = new z88(4);
            z88Var.f(this.g);
            z88Var.c(this.e);
            z88Var.d((fb0[]) this.b.a);
            bb0Var = new bb0(z88Var.h());
            if (bb0Var.equals(this.q)) {
                bb0Var = this.q;
            }
            int i3 = b87Var.I;
            int i4 = b87Var.J;
            d5i d5iVar = this.d;
            d5iVar.i = i3;
            d5iVar.j = i4;
            this.c.j = iArr;
            try {
                cb0 cb0VarA = bb0Var.a(new cb0(b87Var));
                int i5 = cb0VarA.b;
                int i6 = cb0VarA.c;
                a87 a87VarA = b87Var.a();
                a87VarA.o(i6);
                a87VarA.s(cb0VarA.a);
                a87VarA.b(i5);
                b87VarA = a87VarA.a();
                i = iV2;
                iV = vqi.v(i6) * i5;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, b87Var);
            }
        } else {
            bb0Var = new bb0(ghe.e);
            b87VarA = b87Var;
            i = -1;
            iV = -1;
        }
        bb0 bb0Var2 = bb0Var;
        pa0 pa0VarG = g(b87VarA);
        b87 b87Var2 = (b87) pa0VarG.a;
        try {
            ta0 ta0VarC = this.r.c(pa0VarG);
            boolean z = ta0VarC.e;
            if (ta0VarC.a == 0) {
                throw new AudioSink$ConfigurationException(b87Var2, qv1.m("Invalid output encoding (isOffload=", ")", z));
            }
            if (ta0VarC.c == 0) {
                throw new AudioSink$ConfigurationException(b87Var2, qv1.m("Invalid output channel config (isOffload=", ")", z));
            }
            this.X = false;
            xkg xkgVar = new xkg(b87Var, b87VarA, i, iV, ta0VarC, bb0Var2, 0);
            if (n()) {
                this.o = xkgVar;
            } else {
                this.p = xkgVar;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, b87Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    public final void d(long j) throws Exception {
        v56 v56Var;
        eg6 eg6Var;
        if (this.K == null) {
            return;
        }
        a85 a85Var = this.l;
        if (((Exception) a85Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < a85Var.b)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z = true;
        try {
            boolean zT = this.t.t(this.J, j, this.K);
            this.W = SystemClock.elapsedRealtime();
            a85Var.c = null;
            a85Var.a = -9223372036854775807L;
            a85Var.b = -9223372036854775807L;
            if (this.t.h()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (v56Var = this.n) != null && !zT && !this.Y && (eg6Var = ((lt9) v56Var.b).J) != null) {
                    eg6Var.a();
                }
            }
            if (xkg.g(this.p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zT) {
                if (!xkg.g(this.p)) {
                    lvb.b0(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z2 = e.b;
            if (!z2) {
                z = false;
            } else if (j() <= 0) {
                if (!this.t.h()) {
                    z = false;
                } else if (xkg.b(this.p).e) {
                    this.X = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.a, xkg.c(this.p), z);
            v56 v56Var2 = this.n;
            if (v56Var2 != null) {
                v56Var2.I(audioSink$WriteException);
            }
            if (z2) {
                throw audioSink$WriteException;
            }
            a85Var.e(audioSink$WriteException);
        }
    }

    public final boolean e() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.q.g()) {
            d(Long.MIN_VALUE);
            return this.K == null;
        }
        this.q.i();
        o(Long.MIN_VALUE);
        return this.q.f() && ((byteBuffer = this.K) == null || !byteBuffer.hasRemaining());
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new z75(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            bb0 bb0VarA = xkg.a(this.p);
            this.q = bb0VarA;
            bb0VarA.b();
            this.j = null;
            xkg xkgVar = this.o;
            if (xkgVar != null) {
                this.p = xkgVar;
                this.o = null;
            }
            c0.incrementAndGet();
            this.t.l();
            this.t = null;
        }
        a85 a85Var = this.l;
        a85Var.c = null;
        a85Var.a = -9223372036854775807L;
        a85Var.b = -9223372036854775807L;
        a85 a85Var2 = this.k;
        a85Var2.c = null;
        a85Var2.a = -9223372036854775807L;
        a85Var2.b = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final pa0 g(b87 b87Var) {
        pa0 pa0Var = new pa0(b87Var);
        pa0Var.e(this.u);
        pa0Var.g(this.i != 0);
        pa0Var.j(this.T);
        pa0Var.f(this.Q);
        pa0Var.h(this.V);
        pa0Var.i();
        pa0Var.k(this.U);
        return pa0Var.a();
    }

    public final int h(b87 b87Var) {
        boolean z;
        if (!vqi.O(b87Var.H) || b87Var.H == 2) {
            z = false;
        } else {
            a87 a87VarA = b87Var.a();
            a87VarA.o(2);
            b87Var = a87VarA.a();
            z = true;
        }
        int i = this.r.b(g(b87Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!xkg.g(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011f, code lost:
    
        if (r5 == 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r19, final long r20, java.nio.ByteBuffer r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b85.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.h() && this.N) {
            return false;
        }
        long j = j();
        long jE = this.t.e();
        ic0 ic0Var = this.t;
        ic0Var.getClass();
        return j > vqi.r(ic0Var.f(), jE);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    public final boolean m() throws AudioSink$InitializationException {
        ic0 ic0VarB;
        euc eucVar;
        a85 a85Var = this.k;
        if (((Exception) a85Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < a85Var.b)) {
            return false;
        }
        int i = 1;
        try {
            ic0VarB = b(xkg.b(this.p));
        } catch (AudioSink$InitializationException e) {
            if (xkg.b(this.p).f > 1000000) {
                sa0 sa0VarA = xkg.b(this.p).a();
                sa0VarA.d(1000000);
                ta0 ta0VarA = sa0VarA.a();
                try {
                    ic0 ic0VarB2 = b(ta0VarA);
                    this.p = xkg.e(this.p, ta0VarA);
                    ic0VarB = ic0VarB2;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                    if (!xkg.b(this.p).e) {
                        throw e;
                    }
                    this.X = true;
                    throw e;
                }
            }
            if (!xkg.b(this.p).e) {
                throw e;
            }
            this.X = true;
            throw e;
        }
        this.t = ic0VarB;
        y75 y75Var = new y75(this, xkg.b(this.p));
        this.j = y75Var;
        this.t.a(y75Var);
        if (this.t.h() && xkg.b(this.p).k) {
            this.t.m(xkg.c(this.p).I, xkg.c(this.p).J);
        }
        z3d z3dVar = this.m;
        if (z3dVar != null) {
            this.t.p(z3dVar);
        }
        if (n()) {
            this.t.r(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.q(audioDeviceInfo);
        }
        this.F = true;
        int iB = this.t.b();
        boolean z = iB != this.Q;
        this.Q = iB;
        v56 v56Var = this.n;
        if (v56Var != null) {
            tb0 tb0VarD = xkg.d(this.p);
            v2a v2aVar = ((lt9) v56Var.b).h2;
            Handler handler = (Handler) v2aVar.b;
            if (handler != null) {
                handler.post(new lb0(v2aVar, tb0VarD, i));
            }
            if (z) {
                this.R = true;
                xkg xkgVar = this.p;
                sa0 sa0VarA2 = xkg.b(xkgVar).a();
                sa0VarA2.c(this.Q);
                this.p = xkg.e(xkgVar, sa0VarA2.a());
                xkg xkgVar2 = this.o;
                if (xkgVar2 != null) {
                    sa0 sa0VarA3 = xkg.b(xkgVar2).a();
                    sa0VarA3.c(this.Q);
                    this.o = xkg.e(xkgVar2, sa0VarA3.a());
                }
                v56 v56Var2 = this.n;
                int i2 = this.Q;
                lt9 lt9Var = (lt9) v56Var2.b;
                if (Build.VERSION.SDK_INT >= 35 && (eucVar = lt9Var.j2) != null) {
                    eucVar.J(i2);
                }
                v2a v2aVar2 = lt9Var.h2;
                Handler handler2 = (Handler) v2aVar2.b;
                if (handler2 != null) {
                    handler2.post(new ai(v2aVar2, i2, i));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o(long j) throws Exception {
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.g()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer != null) {
                r(byteBuffer);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.f()) {
            do {
                ByteBuffer byteBufferE = this.q.e();
                if (byteBufferE.hasRemaining()) {
                    r(byteBufferE);
                    d(j);
                } else {
                    ByteBuffer byteBuffer2 = this.I;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.q.j(this.I);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void p() {
        if (this.p != null) {
            xkg xkgVar = this.o;
            if (xkgVar != null) {
                this.p = xkgVar;
                this.o = null;
            }
            try {
                this.p = new xkg(xkg.c(this.p), xkg.i(this.p), this.p.a, this.p.b, this.r.c(g(xkg.i(this.p))), xkg.a(this.p), 0);
            } catch (AudioOutputProvider$ConfigurationException e) {
                qr7.w(new AudioSink$ConfigurationException(e, xkg.c(this.p)));
                return;
            }
        }
        f();
    }

    public final void q() {
        f();
        a98 a98VarListIterator = this.g.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            ((fb0) a98VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        bb0 bb0Var = this.q;
        if (bb0Var != null) {
            bb0Var.k();
        }
        this.O = false;
        this.X = false;
    }

    public final void r(ByteBuffer byteBuffer) {
        lvb.b0(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (xkg.g(this.p)) {
                int iR = (int) vqi.r(xkg.b(this.p).b, vqi.X(20L));
                long j = j();
                if (j < iR) {
                    byteBuffer = hgl.a(byteBuffer, xkg.b(this.p).a, this.p.b, (int) j, iR);
                }
            }
            this.K = byteBuffer;
        }
    }

    public final boolean s() {
        if (this.V || !xkg.g(this.p)) {
            return false;
        }
        int i = xkg.c(this.p).H;
        return true;
    }

    public final boolean t() {
        xkg xkgVar = this.p;
        return xkgVar != null && xkg.b(xkgVar).j;
    }
}
