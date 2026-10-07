package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public class jv9 implements hu9 {
    public Surface A;
    public SurfaceHolder B;
    public e38 D;
    public MediaController E;
    public long F;
    public long G;
    public c4d H;
    public Bundle I;
    public final iu9 a;
    public final xhf b;
    public final sv9 c;
    public final Context d;
    public final xnf e;
    public final Bundle f;
    public final xu9 g;
    public final iv9 h;
    public final u89 i;
    public final qg7 j;
    public final pw k;
    public final SparseArray l;
    public final Handler m;
    public xnf n;
    public hv9 o;
    public boolean p;
    public PendingIntent r;
    public c98 s;
    public c98 t;
    public ghe u;
    public ghe v;
    public h3d x;
    public h3d y;
    public h3d z;
    public c4d q = c4d.H;
    public lag C = lag.c;
    public fmf w = fmf.b;

    /* JADX WARN: Type inference failed for: r4v4, types: [xu9] */
    public jv9(Context context, iu9 iu9Var, xnf xnfVar, Bundle bundle, Looper looper) {
        ghe gheVar = ghe.e;
        this.s = gheVar;
        this.t = gheVar;
        this.u = gheVar;
        this.v = gheVar;
        h3d h3dVar = h3d.b;
        this.x = h3dVar;
        this.y = h3dVar;
        this.z = Y(h3dVar, h3dVar);
        this.i = new u89(looper, qt3.a, new gve(this));
        this.m = new Handler(looper);
        this.a = iu9Var;
        lvb.W(context, "context must not be null");
        lvb.W(xnfVar, "token must not be null");
        this.d = context;
        this.b = new xhf();
        this.c = new sv9(this);
        this.k = new pw(0);
        this.e = xnfVar;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: xu9
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                iu9 iu9Var2 = this.a.a;
                Objects.requireNonNull(iu9Var2);
                iu9Var2.S(new e6(21, iu9Var2));
            }
        };
        this.h = new iv9(this);
        this.I = Bundle.EMPTY;
        this.o = xnfVar.a.getType() == 0 ? null : new hv9(this, bundle);
        this.j = new qg7(this, looper);
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.l = new SparseArray();
    }

    public static h3d Y(h3d h3dVar, h3d h3dVar2) {
        h3d h3dVarB = gm0.B(h3dVar, h3dVar2);
        if (h3dVarB.a(32)) {
            return h3dVarB;
        }
        s74 s74Var = new s74(1);
        s74Var.b(h3dVarB.a);
        s74Var.a(32);
        return new h3d(s74Var.d());
    }

    public static ssh Z(ArrayList arrayList, ArrayList arrayList2) {
        z88 z88Var = new z88(4);
        z88Var.f(arrayList);
        ghe gheVarH = z88Var.h();
        z88 z88Var2 = new z88(4);
        z88Var2.f(arrayList2);
        ghe gheVarH2 = z88Var2.h();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new ssh(gheVarH, gheVarH2, iArr);
    }

    public static int e0(c4d c4dVar) {
        return c4dVar.c.a.b;
    }

    public static c4d h0(c4d c4dVar, ssh sshVar, int i, int i2, long j, long j2, int i3) {
        tsh tshVar = new tsh();
        sshVar.m(i, tshVar, 0L);
        ry9 ry9Var = tshVar.b;
        k3d k3dVar = c4dVar.c.a;
        k3d k3dVar2 = new k3d(null, i, ry9Var, null, i2, j, j2, k3dVar.h, k3dVar.i);
        umf umfVar = c4dVar.c;
        return i0(c4dVar, sshVar, k3dVar2, new umf(k3dVar2, umfVar.b, SystemClock.elapsedRealtime(), umfVar.d, umfVar.e, umfVar.f, umfVar.g, umfVar.h, umfVar.i, umfVar.j), i3);
    }

    public static c4d i0(c4d c4dVar, ush ushVar, k3d k3dVar, umf umfVar, int i) {
        umf umfVar2;
        ryh ryhVar;
        fzh fzhVar;
        boolean z;
        PlaybackException playbackException = c4dVar.a;
        int i2 = c4dVar.b;
        umf umfVar3 = c4dVar.c;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z2 = c4dVar.i;
        int i4 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i5 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        int i6 = c4dVar.t;
        boolean z3 = c4dVar.u;
        boolean z4 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z5 = c4dVar.x;
        boolean z6 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar2 = c4dVar.F;
        ryh ryhVar2 = c4dVar.G;
        k3d k3dVar2 = umfVar3.a;
        if (!ushVar.p()) {
            umfVar2 = umfVar;
            ryhVar = ryhVar2;
            fzhVar = fzhVar2;
            if (umfVar2.a.b >= ushVar.o()) {
                z = false;
            }
            lvb.b0(z);
            return new c4d(playbackException, i2, umfVar2, k3dVar2, k3dVar, i, s2dVar, i3, z2, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z3, z4, i7, i8, i9, z5, z6, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        }
        umfVar2 = umfVar;
        ryhVar = ryhVar2;
        fzhVar = fzhVar2;
        z = true;
        lvb.b0(z);
        return new c4d(playbackException, i2, umfVar2, k3dVar2, k3dVar, i, s2dVar, i3, z2, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z3, z4, i7, i8, i9, z5, z6, b0aVar2, j, j2, j3, fzhVar, ryhVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static ghe m0(ghe gheVar, List list, Bundle bundle, fmf fmfVar, h3d h3dVar) {
        boolean z;
        if (!list.isEmpty()) {
            return by3.g(list, fmfVar, h3dVar);
        }
        boolean z2 = false;
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            z = false;
        } else {
            if (h3dVar.a.a(6, 7)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            if (!h3dVar.a.a(8, 9)) {
                z2 = true;
            }
        }
        return by3.j(gheVar, z, z2);
    }

    public static ghe n0(List list, List list2, fmf fmfVar, h3d h3dVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = by3.k(list2, h3dVar, bundle);
        }
        return by3.g(list, fmfVar, h3dVar);
    }

    @Override // defpackage.hu9
    public final void A(boolean z) {
        if (g0(14)) {
            b0(new wu9(this, z, 0));
            c4d c4dVar = this.q;
            if (c4dVar.i != z) {
                this.q = c4dVar.j(z);
                hw2 hw2Var = new hw2(z, 4);
                u89 u89Var = this.i;
                u89Var.c(9, hw2Var);
                u89Var.b();
            }
        }
    }

    @Override // defpackage.hu9
    public final int B() {
        return this.q.c.a.e;
    }

    @Override // defpackage.hu9
    public final int C() {
        return this.q.c.a.i;
    }

    @Override // defpackage.hu9
    public final void D(int i) {
        if (g0(10)) {
            lvb.R(i >= 0);
            b0(new ru9(this, i, 0));
            o0(i, -9223372036854775807L);
        }
    }

    @Override // defpackage.hu9
    public final long E() {
        umf umfVar = this.q.c;
        return !umfVar.b ? e() : umfVar.a.g;
    }

    @Override // defpackage.hu9
    public final int F() {
        return e0(this.q);
    }

    @Override // defpackage.hu9
    public final void G(ry9 ry9Var) {
        if (g0(31)) {
            b0(new zu9(this, ry9Var, 1));
            q0(Collections.singletonList(ry9Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.hu9
    public final boolean H() {
        return this.q.i;
    }

    @Override // defpackage.hu9
    public final void I() {
        if (g0(12)) {
            b0(new tu9(this, 12));
            p0(this.q.D);
        }
    }

    @Override // defpackage.hu9
    public final void J() {
        if (g0(11)) {
            b0(new tu9(this, 3));
            p0(-this.q.C);
        }
    }

    @Override // defpackage.hu9
    public final void K(List list) {
        if (g0(20)) {
            b0(new fv9(this, 0, list));
            q0(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.hu9
    public final fmf L() {
        return this.w;
    }

    @Override // defpackage.hu9
    public final int M() {
        if (this.q.j.p()) {
            return -1;
        }
        c4d c4dVar = this.q;
        ush ushVar = c4dVar.j;
        int iE0 = e0(c4dVar);
        c4d c4dVar2 = this.q;
        int i = c4dVar2.h;
        if (i == 1) {
            i = 0;
        }
        return ushVar.k(iE0, i, c4dVar2.i);
    }

    @Override // defpackage.hu9
    public final void N(int i) {
        long j;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        c4d c4dVarH0;
        c4d c4dVarI0;
        int i4;
        if (g0(20)) {
            lvb.R(i >= 0);
            b0(new ru9(this, i, 1));
            int iO = this.q.j.o();
            int iMin = Math.min(i + 1, iO);
            if (i >= iO || i == iMin || iO == 0) {
                return;
            }
            boolean z3 = e0(this.q) >= i && e0(this.q) < iMin;
            c4d c4dVar = this.q;
            long jE = e();
            long jE2 = E();
            ush ushVar = c4dVar.j;
            boolean z4 = c4dVar.i;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (true) {
                j = jE;
                if (i5 >= ushVar.o()) {
                    break;
                }
                if (i5 < i || i5 >= iMin) {
                    arrayList.add(ushVar.m(i5, new tsh(), 0L));
                }
                i5++;
                jE = j;
            }
            int i6 = 0;
            while (i6 < arrayList.size()) {
                tsh tshVar = (tsh) arrayList.get(i6);
                int i7 = tshVar.m;
                int i8 = tshVar.n;
                if (i7 == -1 || i8 == -1) {
                    tshVar.m = arrayList2.size();
                    tshVar.n = arrayList2.size();
                    rsh rshVar = new rsh();
                    i4 = i6;
                    rshVar.i(null, null, i4, -9223372036854775807L, 0L, fa.f, true);
                    arrayList2.add(rshVar);
                } else {
                    tshVar.m = arrayList2.size();
                    tshVar.n = (i8 - i7) + arrayList2.size();
                    while (i7 <= i8) {
                        rsh rshVar2 = new rsh();
                        ushVar.f(i7, rshVar2, false);
                        rshVar2.c = i6;
                        arrayList2.add(rshVar2);
                        i7++;
                    }
                    i4 = i6;
                }
                i6 = i4 + 1;
            }
            ssh sshVarZ = Z(arrayList, arrayList2);
            k3d k3dVar = c4dVar.c.a;
            int i9 = k3dVar.b;
            int i10 = k3dVar.e;
            tsh tshVar2 = new tsh();
            boolean z5 = i9 >= i && i9 < iMin;
            if (sshVarZ.p()) {
                z = z3;
                z2 = z5;
                i2 = -1;
                i3 = 0;
            } else {
                if (z5) {
                    int i11 = c4dVar.h;
                    int iO2 = ushVar.o();
                    z = z3;
                    int iA = i9;
                    int i12 = 0;
                    while (true) {
                        if (i12 < iO2) {
                            iA = ushVar.e(iA, i11, z4);
                            z2 = z5;
                            if (iA != -1) {
                                if (iA < i || iA >= iMin) {
                                    break;
                                }
                                i12++;
                                z5 = z2;
                            }
                        } else {
                            z2 = z5;
                        }
                        iA = -1;
                        break;
                    }
                    if (iA == -1) {
                        iA = sshVarZ.a(z4);
                    } else if (iA >= iMin) {
                        iA -= iMin - i;
                    }
                    sshVarZ.m(iA, tshVar2, 0L);
                    i10 = tshVar2.m;
                    i2 = iA;
                } else {
                    z = z3;
                    z2 = z5;
                    if (i9 >= iMin) {
                        i2 = i9 - (iMin - i);
                        if (i10 != -1) {
                            for (int i13 = i; i13 < iMin; i13++) {
                                tsh tshVar3 = new tsh();
                                ushVar.n(i13, tshVar3);
                                i10 -= (tshVar3.n - tshVar3.m) + 1;
                            }
                        }
                    } else {
                        i2 = i9;
                    }
                }
                i3 = i10;
            }
            if (z2) {
                if (i2 == -1) {
                    c4dVarI0 = i0(c4dVar, sshVarZ, umf.k, umf.l, 4);
                } else {
                    tsh tshVar4 = new tsh();
                    sshVarZ.m(i2, tshVar4, 0L);
                    long jP0 = vqi.p0(tshVar4.k);
                    long jP1 = vqi.p0(tshVar4.l);
                    k3d k3dVar2 = new k3d(null, i2, tshVar4.b, null, i3, jP0, jP0, -1, -1);
                    c4dVarI0 = i0(c4dVar, sshVarZ, k3dVar2, new umf(k3dVar2, false, SystemClock.elapsedRealtime(), jP1, jP0, gm0.e(jP0, jP1), 0L, -9223372036854775807L, jP1, jP0), 4);
                }
                c4dVarH0 = c4dVarI0;
            } else {
                c4dVarH0 = h0(c4dVar, sshVarZ, i2, i3, j, jE2, 4);
            }
            int i14 = c4dVarH0.A;
            if (i14 != 1 && i14 != 4 && i < iMin && iMin == ushVar.o() && i9 >= i) {
                c4dVarH0 = c4dVarH0.e(4, null);
            }
            int i15 = this.q.c.a.b;
            t0(c4dVarH0, 0, null, z ? 4 : null, i15 >= i && i15 < iMin ? 3 : null);
        }
    }

    @Override // defpackage.hu9
    public final int O() {
        if (this.q.j.p()) {
            return -1;
        }
        c4d c4dVar = this.q;
        ush ushVar = c4dVar.j;
        int iE0 = e0(c4dVar);
        c4d c4dVar2 = this.q;
        int i = c4dVar2.h;
        if (i == 1) {
            i = 0;
        }
        return ushVar.e(iE0, i, c4dVar2.i);
    }

    @Override // defpackage.hu9
    public final void P(p70 p70Var, boolean z) {
        if (g0(35)) {
            b0(new jn6(this, p70Var, z));
            if (this.q.q.equals(p70Var)) {
                return;
            }
            this.q = this.q.a(p70Var);
            tf6 tf6Var = new tf6(p70Var, 1);
            u89 u89Var = this.i;
            u89Var.c(20, tf6Var);
            u89Var.b();
        }
    }

    @Override // defpackage.hu9
    public final h3d Q() {
        return this.z;
    }

    @Override // defpackage.hu9
    public final c98 R() {
        return this.u;
    }

    @Override // defpackage.hu9
    public final void S(j3d j3dVar) {
        this.i.a(j3dVar);
    }

    @Override // defpackage.hu9
    public final Bundle T() {
        return this.f;
    }

    @Override // defpackage.hu9
    public final long U() {
        return this.q.c.e;
    }

    @Override // defpackage.hu9
    public final void V(j3d j3dVar) {
        this.i.e(j3dVar);
    }

    @Override // defpackage.hu9
    public final e89 W(final emf emfVar) {
        Bundle bundle = Bundle.EMPTY;
        xnf xnfVar = this.n;
        xnfVar.getClass();
        if (xnfVar.a.e() < 7) {
            final int i = 0;
            return d0(emfVar, new gv9(this, emfVar, i) { // from class: su9
                public final /* synthetic */ int a;
                public final /* synthetic */ jv9 b;
                public final /* synthetic */ emf c;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                {
                    this.a = i;
                    switch (i) {
                    }
                    Bundle bundle2 = Bundle.EMPTY;
                    this.b = this;
                }

                @Override // defpackage.gv9
                public final void c(e38 e38Var, int i2) {
                    int i3 = this.a;
                    emf emfVar2 = this.c;
                    jv9 jv9Var = this.b;
                    switch (i3) {
                        case 0:
                            Bundle bundle2 = Bundle.EMPTY;
                            e38Var.w(jv9Var.c, i2, emfVar2.b());
                            break;
                        default:
                            e38Var.J(jv9Var.c, i2, emfVar2.b(), Bundle.EMPTY, false);
                            break;
                    }
                }
            });
        }
        xnf xnfVar2 = this.n;
        xnfVar2.getClass();
        if (xnfVar2.a.e() < 7) {
            return W(emfVar);
        }
        final int i2 = 1;
        return d0(emfVar, new gv9(this, emfVar, i2) { // from class: su9
            public final /* synthetic */ int a;
            public final /* synthetic */ jv9 b;
            public final /* synthetic */ emf c;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            {
                this.a = i2;
                switch (i2) {
                }
                Bundle bundle2 = Bundle.EMPTY;
                this.b = this;
            }

            @Override // defpackage.gv9
            public final void c(e38 e38Var, int i3) {
                int i4 = this.a;
                emf emfVar2 = this.c;
                jv9 jv9Var = this.b;
                switch (i4) {
                    case 0:
                        Bundle bundle2 = Bundle.EMPTY;
                        e38Var.w(jv9Var.c, i3, emfVar2.b());
                        break;
                    default:
                        e38Var.J(jv9Var.c, i3, emfVar2.b(), Bundle.EMPTY, false);
                        break;
                }
            }
        });
    }

    @Override // defpackage.hu9
    public final b0a X() {
        return this.q.B;
    }

    @Override // defpackage.hu9
    public final float a() {
        return this.q.n;
    }

    public final e89 a0(e38 e38Var, gv9 gv9Var, boolean z) {
        MediaController mediaController;
        if (e38Var == null) {
            return rx8.J(new wmf(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.E) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        wmf wmfVar = new wmf(1);
        xhf xhfVar = this.b;
        whf whfVarA = xhfVar.a(wmfVar);
        int iT = whfVarA.t();
        pw pwVar = this.k;
        if (z) {
            if (pwVar.isEmpty()) {
                this.H = this.q;
            }
            pwVar.add(Integer.valueOf(iT));
        }
        try {
            gv9Var.c(e38Var, iT);
            return whfVarA;
        } catch (RemoteException e) {
            lvb.H0("MCImplBase", "Cannot connect to the service or the session is gone", e);
            pwVar.remove(Integer.valueOf(iT));
            xhfVar.d(iT, new wmf(-100));
            return whfVarA;
        }
    }

    @Override // defpackage.hu9
    public final void b(float f) {
        if (g0(24)) {
            b0(new uu9(this, f, 1));
            c4d c4dVar = this.q;
            if (c4dVar.n != f) {
                this.q = c4dVar.n(f);
                sf6 sf6Var = new sf6(1, f);
                u89 u89Var = this.i;
                u89Var.c(22, sf6Var);
                u89Var.b();
            }
        }
    }

    public final void b0(gv9 gv9Var) {
        qg7 qg7Var = this.j;
        Handler handler = (Handler) qg7Var.b;
        if (((jv9) qg7Var.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        a0(this.D, gv9Var, true);
    }

    @Override // defpackage.hu9
    public final s2d c() {
        return this.q.g;
    }

    public final void c0(gv9 gv9Var) {
        qg7 qg7Var = this.j;
        Handler handler = (Handler) qg7Var.b;
        if (((jv9) qg7Var.c).D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        e89 e89VarA0 = a0(this.D, gv9Var, true);
        try {
            mz8.s(e89VarA0);
        } catch (ExecutionException e) {
            qr7.w(e);
        } catch (TimeoutException e2) {
            if (e89VarA0 instanceof whf) {
                int iT = ((whf) e89VarA0).t();
                this.k.remove(Integer.valueOf(iT));
                this.b.d(iT, new wmf(-1));
            }
            lvb.H0("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.hu9
    public final void connect() {
        xnf xnfVar = this.e;
        wnf wnfVar = xnfVar.a;
        wnf wnfVar2 = xnfVar.a;
        int type = wnfVar.getType();
        iu9 iu9Var = this.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.o = null;
            Object objD = wnfVar2.d();
            objD.getClass();
            IBinder iBinder = (IBinder) objD;
            int i = t4a.i;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            e38 c38Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e38)) ? new c38(iBinder) : (e38) iInterfaceQueryLocalInterface;
            int iB = this.b.b();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            iu9Var.getClass();
            try {
                c38Var.g0(this.c, iB, new ke4(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e) {
                lvb.H0("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.o = new hv9(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(wnfVar2.getPackageName(), wnfVar2.b());
            try {
                if (context.bindService(intent, this.o, i2)) {
                    return;
                }
                lvb.G0("MCImplBase", "bind to " + xnfVar + " failed");
            } catch (SecurityException e2) {
                lvb.H0("MCImplBase", "bind to " + xnfVar + " not allowed", e2);
            }
        }
        Objects.requireNonNull(iu9Var);
        iu9Var.S(new e6(21, iu9Var));
    }

    @Override // defpackage.hu9
    public final boolean d() {
        return this.q.x;
    }

    public final e89 d0(emf emfVar, gv9 gv9Var) {
        e38 e38Var;
        int i = emfVar.a;
        String str = emfVar.b;
        lvb.R(i == 0);
        if (this.w.a.contains(emfVar) || by3.n(str)) {
            e38Var = this.D;
        } else {
            lvb.G0("MCImplBase", "Controller isn't allowed to call custom session command:".concat(str));
            e38Var = null;
        }
        return a0(e38Var, gv9Var, false);
    }

    @Override // defpackage.hu9
    public final long e() {
        long jV = gm0.v(this.q, this.F, this.G, this.a.g);
        this.F = jV;
        return jV;
    }

    @Override // defpackage.hu9
    public final boolean f() {
        return this.q.c.b;
    }

    public final dc1 f0(ush ushVar, int i, long j) {
        if (ushVar.p()) {
            return null;
        }
        tsh tshVar = new tsh();
        rsh rshVar = new rsh();
        if (i == -1 || i >= ushVar.o()) {
            i = ushVar.a(this.q.i);
            j = vqi.p0(ushVar.m(i, tshVar, 0L).k);
        }
        long jX = vqi.X(j);
        lvb.U(i, ushVar.o());
        ushVar.n(i, tshVar);
        if (jX == -9223372036854775807L) {
            jX = tshVar.k;
            if (jX == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = tshVar.m;
        ushVar.f(i2, rshVar, false);
        while (i2 < tshVar.n && rshVar.e != jX) {
            int i3 = i2 + 1;
            if (ushVar.f(i3, rshVar, false).e > jX) {
                break;
            }
            i2 = i3;
        }
        ushVar.f(i2, rshVar, false);
        return new dc1(i2, jX - rshVar.e, false);
    }

    @Override // defpackage.hu9
    public final long g() {
        return this.q.c.g;
    }

    public final boolean g0(int i) {
        if (this.z.a(i)) {
            return true;
        }
        qt4.y(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    @Override // defpackage.hu9
    public final long getDuration() {
        return this.q.c.d;
    }

    @Override // defpackage.hu9
    public final int getPlaybackState() {
        return this.q.A;
    }

    @Override // defpackage.hu9
    public final int getRepeatMode() {
        return this.q.h;
    }

    @Override // defpackage.hu9
    public final void h(ry9 ry9Var, long j) {
        if (g0(31)) {
            b0(new jw2(this, ry9Var, j, 3));
            q0(Collections.singletonList(ry9Var), -1, j, false);
        }
    }

    @Override // defpackage.hu9
    public final void i() {
        if (g0(6)) {
            b0(new tu9(this, 2));
            if (M() != -1) {
                o0(M(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.hu9
    public final boolean isConnected() {
        return this.D != null;
    }

    @Override // defpackage.hu9
    public final void j() {
        if (g0(4)) {
            b0(new tu9(this, 0));
            o0(e0(this.q), -9223372036854775807L);
        }
    }

    public final void j0(c4d c4dVar, final c4d c4dVar2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        final int i = 0;
        u89 u89Var = this.i;
        if (num != null) {
            u89Var.c(0, new r89() { // from class: av9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i2 = i;
                    Integer num5 = num;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i2) {
                        case 0:
                            j3dVar.y0(c4dVar3.j, num5.intValue());
                            break;
                        case 1:
                            j3dVar.Z(c4dVar3.d, c4dVar3.e, num5.intValue());
                            break;
                        default:
                            j3dVar.i0(num5.intValue(), c4dVar3.v);
                            break;
                    }
                }
            });
        }
        final int i2 = 11;
        final int i3 = 1;
        if (num3 != null) {
            u89Var.c(11, new r89() { // from class: av9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i4 = i3;
                    Integer num5 = num3;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i4) {
                        case 0:
                            j3dVar.y0(c4dVar3.j, num5.intValue());
                            break;
                        case 1:
                            j3dVar.Z(c4dVar3.d, c4dVar3.e, num5.intValue());
                            break;
                        default:
                            j3dVar.i0(num5.intValue(), c4dVar3.v);
                            break;
                    }
                }
            });
        }
        ry9 ry9VarQ = c4dVar2.q();
        if (num4 != null) {
            u89Var.c(1, new hu(ry9VarQ, 28, num4));
        }
        PlaybackException playbackException = c4dVar.a;
        PlaybackException playbackException2 = c4dVar2.a;
        final int i4 = 10;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            u89Var.c(10, new dv9(0, playbackException2));
            if (playbackException2 != null) {
                u89Var.c(10, new dv9(1, playbackException2));
            }
        }
        final int i5 = 18;
        final int i6 = 2;
        if (!c4dVar.F.equals(c4dVar2.F)) {
            u89Var.c(2, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i7 = i5;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i7) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i7 = 19;
        if (!c4dVar.B.equals(c4dVar2.B)) {
            u89Var.c(14, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i8 = i7;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i8) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i8 = 20;
        final int i9 = 3;
        if (c4dVar.y != c4dVar2.y) {
            u89Var.c(3, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i10 = i8;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i10) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i10 = 21;
        final int i11 = 4;
        if (c4dVar.A != c4dVar2.A) {
            u89Var.c(4, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i12 = i10;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i12) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i12 = 5;
        if (num2 != null) {
            u89Var.c(5, new r89() { // from class: av9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i13 = i6;
                    Integer num5 = num2;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i13) {
                        case 0:
                            j3dVar.y0(c4dVar3.j, num5.intValue());
                            break;
                        case 1:
                            j3dVar.Z(c4dVar3.d, c4dVar3.e, num5.intValue());
                            break;
                        default:
                            j3dVar.i0(num5.intValue(), c4dVar3.v);
                            break;
                    }
                }
            });
        }
        final int i13 = 6;
        if (c4dVar.z != c4dVar2.z) {
            u89Var.c(6, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i14 = i;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i14) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i14 = 7;
        if (c4dVar.x != c4dVar2.x) {
            u89Var.c(7, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i15 = i3;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i15) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i15 = 12;
        if (!c4dVar.g.equals(c4dVar2.g)) {
            u89Var.c(12, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i16 = i6;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i16) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i16 = 8;
        if (c4dVar.h != c4dVar2.h) {
            u89Var.c(8, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i17 = i9;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i17) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i17 = 9;
        if (c4dVar.i != c4dVar2.i) {
            u89Var.c(9, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i18 = i11;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i18) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i18 = 15;
        if (!c4dVar.m.equals(c4dVar2.m)) {
            u89Var.c(15, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i12;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (c4dVar.n != c4dVar2.n) {
            u89Var.c(22, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i13;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (!c4dVar.q.equals(c4dVar2.q)) {
            u89Var.c(20, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i14;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (c4dVar.p != c4dVar2.p) {
            u89Var.c(21, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i16;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        ghe gheVar = c4dVar.r.a;
        ghe gheVar2 = c4dVar2.r.a;
        gheVar.getClass();
        if (!j8f.a(gheVar, gheVar2)) {
            u89Var.c(27, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i17;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
            u89Var.c(27, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i4;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (!c4dVar.s.equals(c4dVar2.s)) {
            u89Var.c(29, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i2;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (c4dVar.t != c4dVar2.t || c4dVar.u != c4dVar2.u) {
            u89Var.c(30, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i19 = i15;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i19) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (!c4dVar.l.equals(c4dVar2.l)) {
            final int i19 = 13;
            u89Var.c(25, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i110 = i19;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i110) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i20 = 16;
        if (c4dVar.C != c4dVar2.C) {
            final int i21 = 14;
            u89Var.c(16, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i110 = i21;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i110) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        final int i22 = 17;
        if (c4dVar.D != c4dVar2.D) {
            u89Var.c(17, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i110 = i18;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i110) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (c4dVar.E != c4dVar2.E) {
            u89Var.c(18, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i110 = i20;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i110) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        if (!c4dVar.G.equals(c4dVar2.G)) {
            u89Var.c(19, new r89() { // from class: bv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i110 = i22;
                    c4d c4dVar3 = c4dVar2;
                    j3d j3dVar = (j3d) obj;
                    switch (i110) {
                        case 0:
                            j3dVar.l(c4dVar3.z);
                            break;
                        case 1:
                            j3dVar.Y0(c4dVar3.x);
                            break;
                        case 2:
                            j3dVar.K0(c4dVar3.g);
                            break;
                        case 3:
                            j3dVar.onRepeatModeChanged(c4dVar3.h);
                            break;
                        case 4:
                            j3dVar.E(c4dVar3.i);
                            break;
                        case 5:
                            j3dVar.K(c4dVar3.m);
                            break;
                        case 6:
                            j3dVar.j0(c4dVar3.n);
                            break;
                        case 7:
                            j3dVar.b0(c4dVar3.q);
                            break;
                        case 8:
                            j3dVar.f(c4dVar3.p);
                            break;
                        case 9:
                            j3dVar.M(c4dVar3.r.a);
                            break;
                        case 10:
                            j3dVar.k(c4dVar3.r);
                            break;
                        case 11:
                            j3dVar.Q(c4dVar3.s);
                            break;
                        case 12:
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 13:
                            j3dVar.c(c4dVar3.l);
                            break;
                        case 14:
                            j3dVar.J(c4dVar3.C);
                            break;
                        case 15:
                            j3dVar.x0(c4dVar3.D);
                            break;
                        case 16:
                            j3dVar.N0(c4dVar3.E);
                            break;
                        case 17:
                            j3dVar.e0(c4dVar3.G);
                            break;
                        case 18:
                            j3dVar.t0(c4dVar3.F);
                            break;
                        case 19:
                            j3dVar.w0(c4dVar3.B);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            j3dVar.g0(c4dVar3.y);
                            break;
                        default:
                            j3dVar.z(c4dVar3.A);
                            break;
                    }
                }
            });
        }
        u89Var.b();
    }

    @Override // defpackage.hu9
    public final void k(ryh ryhVar) {
        if (g0(29)) {
            b0(new hu(this, 27, ryhVar));
            c4d c4dVar = this.q;
            if (ryhVar != c4dVar.G) {
                this.q = c4dVar.m(ryhVar);
                uf6 uf6Var = new uf6(ryhVar, 1);
                u89 u89Var = this.i;
                u89Var.c(19, uf6Var);
                u89Var.b();
            }
        }
    }

    public final void k0(c4d c4dVar, a4d a4dVar) {
        if (isConnected()) {
            xnf xnfVar = this.n;
            xnfVar.getClass();
            boolean z = xnfVar.a.e() < 6;
            c4d c4dVar2 = this.H;
            if (c4dVar2 != null) {
                h3d h3dVar = this.z;
                xnf xnfVar2 = this.n;
                xnfVar2.getClass();
                this.H = gm0.E(c4dVar2, c4dVar, a4dVar, h3dVar, z, xnfVar2);
                if (!this.k.isEmpty()) {
                    return;
                }
                c4dVar = this.H;
                a4dVar = a4d.c;
                this.H = null;
            }
            c4d c4dVar3 = c4dVar;
            a4d a4dVar2 = a4dVar;
            c4d c4dVar4 = this.q;
            h3d h3dVar2 = this.z;
            xnf xnfVar3 = this.n;
            xnfVar3.getClass();
            c4d c4dVarE = gm0.E(c4dVar4, c4dVar3, a4dVar2, h3dVar2, z, xnfVar3);
            this.q = c4dVarE;
            Integer numValueOf = (c4dVar4.d.equals(c4dVar3.d) && c4dVar4.e.equals(c4dVar3.e)) ? null : Integer.valueOf(c4dVarE.f);
            Integer numValueOf2 = !Objects.equals(c4dVar4.q(), c4dVarE.q()) ? Integer.valueOf(c4dVarE.b) : null;
            Integer numValueOf3 = !c4dVar4.j.equals(c4dVarE.j) ? Integer.valueOf(c4dVarE.k) : null;
            int i = c4dVar4.w;
            int i2 = c4dVarE.w;
            j0(c4dVar4, c4dVarE, numValueOf3, (i == i2 && c4dVar4.v == c4dVarE.v) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    @Override // defpackage.hu9
    public final void l() {
        if (g0(7)) {
            b0(new tu9(this, 1));
            ush ushVar = this.q.j;
            if (ushVar.p() || f()) {
                return;
            }
            boolean z = M() != -1;
            tsh tshVarM = ushVar.m(e0(this.q), new tsh(), 0L);
            if (tshVarM.h && tshVarM.a()) {
                if (z) {
                    o0(M(), -9223372036854775807L);
                }
            } else if (!z || e() > this.q.E) {
                o0(e0(this.q), 0L);
            } else {
                o0(M(), -9223372036854775807L);
            }
        }
    }

    public final void l0(int i, int i2) {
        lag lagVar = this.C;
        if (lagVar.a == i && lagVar.b == i2) {
            return;
        }
        this.C = new lag(i, i2);
        this.i.f(24, new yu9(i, i2, 0));
    }

    @Override // defpackage.hu9
    public final PlaybackException m() {
        return this.q.a;
    }

    @Override // defpackage.hu9
    public final void n(boolean z) {
        if (g0(1)) {
            b0(new wu9(this, z, 1));
            r0(z);
        } else if (z) {
            lvb.G0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // defpackage.hu9
    public final void o() {
        if (g0(24)) {
            float f = this.q.o;
            b0(new uu9(this, f, 2));
            c4d c4dVar = this.q;
            float f2 = c4dVar.n;
            if (f2 == c4dVar.o || f2 != 0.0f) {
                return;
            }
            this.q = c4dVar.n(f);
            sf6 sf6Var = new sf6(2, f);
            u89 u89Var = this.i;
            u89Var.c(22, sf6Var);
            u89Var.b();
        }
    }

    public final void o0(int i, long j) {
        int i2;
        int i3;
        c4d c4dVarI0;
        ush ushVar = this.q.j;
        if ((ushVar.p() || i < ushVar.o()) && !f()) {
            c4d c4dVar = this.q;
            c4d c4dVarE = c4dVar.e(c4dVar.A == 1 ? 1 : 2, c4dVar.a);
            dc1 dc1VarF0 = f0(ushVar, i, j);
            if (dc1VarF0 == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                k3d k3dVar = new k3d(null, i, null, null, i, j3, j2, -1, -1);
                c4d c4dVar2 = this.q;
                ush ushVar2 = c4dVar2.j;
                boolean z = this.q.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                umf umfVar = this.q.c;
                c4dVarI0 = i0(c4dVar2, ushVar2, k3dVar, new umf(k3dVar, z, jElapsedRealtime, umfVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, umfVar.h, umfVar.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                umf umfVar2 = c4dVarE.c;
                k3d k3dVar2 = umfVar2.a;
                k3d k3dVar3 = umfVar2.a;
                int i4 = k3dVar2.e;
                int i5 = dc1VarF0.a;
                rsh rshVar = new rsh();
                ushVar.f(i4, rshVar, false);
                rsh rshVar2 = new rsh();
                ushVar.f(i5, rshVar2, false);
                boolean z2 = i4 != i5;
                long j4 = dc1VarF0.b;
                long jX = vqi.X(e()) - rshVar.e;
                if (z2 || j4 != jX) {
                    lvb.b0(k3dVar3.h == -1);
                    k3d k3dVar4 = new k3d(null, rshVar.c, k3dVar3.c, null, i4, vqi.p0(rshVar.e + jX), vqi.p0(rshVar.e + jX), -1, -1);
                    ushVar.f(i5, rshVar2, false);
                    tsh tshVar = new tsh();
                    ushVar.n(rshVar2.c, tshVar);
                    long jP0 = vqi.p0(rshVar2.e + j4);
                    k3d k3dVar5 = new k3d(null, rshVar2.c, tshVar.b, null, i5, jP0, jP0, -1, -1);
                    c4d c4dVarG = c4dVarE.g(k3dVar4, k3dVar5, 1);
                    if (z2 || j4 < jX) {
                        c4dVarE = c4dVarG.i(new umf(k3dVar5, false, SystemClock.elapsedRealtime(), vqi.p0(tshVar.l), jP0, gm0.e(jP0, vqi.p0(tshVar.l)), 0L, -9223372036854775807L, -9223372036854775807L, jP0));
                    } else {
                        long jMax = Math.max(0L, vqi.X(c4dVarG.c.g) - (j4 - jX));
                        long jP1 = vqi.p0(rshVar2.e + j4 + jMax);
                        c4dVarE = c4dVarG.i(new umf(k3dVar5, false, SystemClock.elapsedRealtime(), vqi.p0(tshVar.l), jP1, gm0.e(jP1, vqi.p0(tshVar.l)), vqi.p0(jMax), -9223372036854775807L, -9223372036854775807L, jP1));
                    }
                }
                c4dVarI0 = c4dVarE;
            }
            umf umfVar3 = c4dVarI0.c;
            int i6 = (this.q.j.p() || umfVar3.a.b == this.q.c.a.b) ? 0 : i2;
            if (i6 == 0 && umfVar3.a.f == this.q.c.a.f) {
                return;
            }
            t0(c4dVarI0, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.hu9
    public final void p() {
        if (g0(8)) {
            b0(new tu9(this, 9));
            if (O() != -1) {
                o0(O(), -9223372036854775807L);
            }
        }
    }

    public final void p0(long j) {
        long jE = e() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jE = Math.min(jE, duration);
        }
        o0(e0(this.q), Math.max(jE, 0L));
    }

    @Override // defpackage.hu9
    public final void pause() {
        if (g0(1)) {
            b0(new tu9(this, 4));
            r0(false);
        }
    }

    @Override // defpackage.hu9
    public final void play() {
        if (!g0(1)) {
            lvb.G0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            b0(new tu9(this, 10));
            r0(true);
        }
    }

    @Override // defpackage.hu9
    public final void prepare() {
        if (g0(2)) {
            b0(new tu9(this, 6));
            c4d c4dVar = this.q;
            if (c4dVar.A == 1) {
                t0(c4dVar.e(c4dVar.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.hu9
    public final fzh q() {
        return this.q.F;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    public final void q0(List list, int i, long j, boolean z) {
        long j2;
        int iA;
        dc1 dc1VarF0;
        umf umfVar;
        k3d k3dVar;
        int i2;
        Integer num;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        int i3 = 0;
        while (i3 < list.size()) {
            ry9 ry9Var = (ry9) list.get(i3);
            u98 u98Var = mz8.a;
            tsh tshVar = new tsh();
            int i4 = i3;
            tshVar.b(0, ry9Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(tshVar);
            rsh rshVar = new rsh();
            rshVar.i(null, null, i4, -9223372036854775807L, 0L, fa.f, true);
            arrayList2.add(rshVar);
            i3 = i4 + 1;
        }
        ssh sshVarZ = Z(arrayList, arrayList2);
        if (!sshVarZ.p() && i >= sshVarZ.o()) {
            throw new IllegalSeekPositionException();
        }
        if (!z) {
            if (i == -1) {
                k3d k3dVar2 = this.q.c.a;
                int i5 = k3dVar2.b;
                long j8 = k3dVar2.f;
                if (sshVarZ.p() || i5 < sshVarZ.o()) {
                    iA = i5;
                    j2 = j8;
                } else {
                    iA = sshVarZ.a(this.q.i);
                    z2 = true;
                }
            } else {
                j2 = j;
                iA = i;
            }
            dc1VarF0 = f0(sshVarZ, iA, j2);
            if (dc1VarF0 == null) {
                if (j2 == -9223372036854775807L) {
                    j3 = 0;
                } else {
                    j3 = j2;
                }
                if (j2 == -9223372036854775807L) {
                    j4 = 0;
                } else {
                    j4 = j2;
                }
                j5 = j2;
                k3d k3dVar3 = new k3d(null, iA, null, null, iA, j3, j4, -1, -1);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (j2 == -9223372036854775807L) {
                    j6 = 0;
                } else {
                    j6 = j5;
                }
                if (j2 == -9223372036854775807L) {
                    j7 = 0;
                } else {
                    j7 = j5;
                }
                k3dVar = k3dVar3;
                umfVar = new umf(k3dVar, false, jElapsedRealtime, -9223372036854775807L, j6, 0, 0L, -9223372036854775807L, -9223372036854775807L, j7);
            } else {
                k3d k3dVar4 = new k3d(null, iA, (ry9) list.get(iA), null, dc1VarF0.a, vqi.p0(dc1VarF0.b), vqi.p0(dc1VarF0.b), -1, -1);
                umfVar = new umf(k3dVar4, false, SystemClock.elapsedRealtime(), -9223372036854775807L, vqi.p0(dc1VarF0.b), 0, 0L, -9223372036854775807L, -9223372036854775807L, vqi.p0(dc1VarF0.b));
                k3dVar = k3dVar4;
            }
            c4d c4dVarI0 = i0(this.q, sshVarZ, k3dVar, umfVar, 4);
            i2 = c4dVarI0.A;
            if (iA != -1 && i2 != 1) {
                if (!sshVarZ.p() || z2) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
            }
            c4d c4dVarE = c4dVarI0.e(i2, this.q.a);
            if (this.q.j.p()) {
                num = null;
            } else {
                num = 4;
            }
            t0(c4dVarE, 0, null, num, (this.q.j.p() || !c4dVarE.j.p()) ? 3 : null);
        }
        iA = sshVarZ.p() ? 0 : sshVarZ.a(this.q.i);
        j2 = -9223372036854775807L;
        dc1VarF0 = f0(sshVarZ, iA, j2);
        if (dc1VarF0 == null) {
            if (j2 == -9223372036854775807L) {
                j3 = 0;
            } else {
                j3 = j2;
            }
            if (j2 == -9223372036854775807L) {
                j4 = 0;
            } else {
                j4 = j2;
            }
            j5 = j2;
            k3d k3dVar5 = new k3d(null, iA, null, null, iA, j3, j4, -1, -1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (j2 == -9223372036854775807L) {
                j6 = 0;
            } else {
                j6 = j5;
            }
            if (j2 == -9223372036854775807L) {
                j7 = 0;
            } else {
                j7 = j5;
            }
            k3dVar = k3dVar5;
            umfVar = new umf(k3dVar, false, jElapsedRealtime2, -9223372036854775807L, j6, 0, 0L, -9223372036854775807L, -9223372036854775807L, j7);
        } else {
            k3d k3dVar6 = new k3d(null, iA, (ry9) list.get(iA), null, dc1VarF0.a, vqi.p0(dc1VarF0.b), vqi.p0(dc1VarF0.b), -1, -1);
            umfVar = new umf(k3dVar6, false, SystemClock.elapsedRealtime(), -9223372036854775807L, vqi.p0(dc1VarF0.b), 0, 0L, -9223372036854775807L, -9223372036854775807L, vqi.p0(dc1VarF0.b));
            k3dVar = k3dVar6;
        }
        c4d c4dVarI1 = i0(this.q, sshVarZ, k3dVar, umfVar, 4);
        i2 = c4dVarI1.A;
        if (iA != -1) {
            if (sshVarZ.p()) {
                i2 = 4;
            } else {
                i2 = 4;
            }
        }
        c4d c4dVarE2 = c4dVarI1.e(i2, this.q.a);
        if (this.q.j.p()) {
            num = 4;
        } else {
            num = null;
        }
        t0(c4dVarE2, 0, null, num, (this.q.j.p() || !c4dVarE2.j.p()) ? 3 : null);
    }

    @Override // defpackage.hu9
    public final void r(b0a b0aVar) {
        if (g0(19)) {
            b0(new fv9(this, 1, b0aVar));
            if (this.q.m.equals(b0aVar)) {
                return;
            }
            this.q = this.q.f(b0aVar);
            nf6 nf6Var = new nf6(b0aVar, 1);
            u89 u89Var = this.i;
            u89Var.c(15, nf6Var);
            u89Var.b();
        }
    }

    public final void r0(boolean z) {
        c4d c4dVar = this.q;
        int i = c4dVar.z;
        int i2 = i == 1 ? 0 : i;
        if (c4dVar.v == z && i == i2) {
            return;
        }
        this.F = gm0.v(c4dVar, this.F, this.G, this.a.g);
        this.G = SystemClock.elapsedRealtime();
        t0(this.q.c(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.hu9
    public final void release() {
        e38 e38Var = this.D;
        if (this.p) {
            return;
        }
        this.p = true;
        this.n = null;
        this.m.removeCallbacksAndMessages(null);
        SurfaceHolder surfaceHolder = this.B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        qg7 qg7Var = this.j;
        Handler handler = (Handler) qg7Var.b;
        if (handler.hasMessages(1)) {
            try {
                jv9 jv9Var = (jv9) qg7Var.c;
                jv9Var.D.v(jv9Var.c);
            } catch (RemoteException unused) {
                lvb.G0("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.D = null;
        if (e38Var != null) {
            int iB = this.b.b();
            try {
                e38Var.asBinder().unlinkToDeath(this.g, 0);
                e38Var.b0(this.c, iB);
            } catch (RemoteException unused2) {
            }
        }
        this.i.d();
        xhf xhfVar = this.b;
        ev9 ev9Var = new ev9(this, 0);
        synchronized (xhfVar.a) {
            try {
                Handler handlerP = vqi.p(null);
                xhfVar.e = handlerP;
                xhfVar.d = ev9Var;
                if (xhfVar.c.isEmpty()) {
                    xhfVar.c();
                } else {
                    handlerP.postDelayed(new h7b(26, xhfVar), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hu9
    public final int s() {
        return this.q.c.a.h;
    }

    public final void s0(Surface surface, int i, int i2) {
        if (isConnected()) {
            xnf xnfVar = this.n;
            xnfVar.getClass();
            if (xnfVar.a.e() >= 8) {
                c0(new cv9(this, surface, i, i2));
            } else {
                c0(new hu(this, 29, surface));
            }
        }
    }

    @Override // defpackage.hu9
    public final void seekTo(long j) {
        if (g0(5)) {
            b0(new gw2(this, j, 2));
            o0(e0(this.q), j);
        }
    }

    @Override // defpackage.hu9
    public final void setPlaybackSpeed(float f) {
        if (g0(13)) {
            b0(new uu9(this, f, 0));
            s2d s2dVar = this.q.g;
            if (s2dVar.a != f) {
                s2d s2dVar2 = new s2d(f, s2dVar.b);
                this.q = this.q.d(s2dVar2);
                vu9 vu9Var = new vu9(s2dVar2);
                u89 u89Var = this.i;
                u89Var.c(12, vu9Var);
                u89Var.b();
            }
        }
    }

    @Override // defpackage.hu9
    public final void setRepeatMode(int i) {
        if (g0(15)) {
            b0(new ru9(this, i, 2));
            c4d c4dVar = this.q;
            if (c4dVar.h != i) {
                this.q = c4dVar.h(i);
                jn4 jn4Var = new jn4(i, 3);
                u89 u89Var = this.i;
                u89Var.c(8, jn4Var);
                u89Var.b();
            }
        }
    }

    @Override // defpackage.hu9
    public final void stop() {
        if (g0(3)) {
            b0(new tu9(this, 5));
            c4d c4dVar = this.q;
            umf umfVar = this.q.c;
            k3d k3dVar = umfVar.a;
            boolean z = umfVar.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            umf umfVar2 = this.q.c;
            long j = umfVar2.d;
            long j2 = umfVar2.a.f;
            int iE = gm0.e(j2, j);
            umf umfVar3 = this.q.c;
            c4d c4dVarI = c4dVar.i(new umf(k3dVar, z, jElapsedRealtime, j, j2, iE, 0L, umfVar3.h, umfVar3.i, umfVar3.a.f));
            this.q = c4dVarI;
            if (c4dVarI.A != 1) {
                this.q = c4dVarI.e(1, c4dVarI.a);
                ch9 ch9Var = new ch9(3);
                u89 u89Var = this.i;
                u89Var.c(4, ch9Var);
                u89Var.b();
            }
        }
    }

    @Override // defpackage.hu9
    public final void t(ry9 ry9Var) {
        if (g0(31)) {
            b0(new zu9(this, ry9Var, 0));
            q0(Collections.singletonList(ry9Var), -1, -9223372036854775807L, true);
        }
    }

    public final void t0(c4d c4dVar, Integer num, Integer num2, Integer num3, Integer num4) {
        c4d c4dVar2 = this.q;
        this.q = c4dVar;
        j0(c4dVar2, c4dVar, num, num2, num3, num4);
    }

    @Override // defpackage.hu9
    public final int u() {
        return this.q.z;
    }

    @Override // defpackage.hu9
    public final ush v() {
        return this.q.j;
    }

    @Override // defpackage.hu9
    public final void w() {
        if (g0(24)) {
            b0(new tu9(this, 8));
            c4d c4dVar = this.q;
            if (c4dVar.n != 0.0f) {
                this.q = c4dVar.n(0.0f);
                ch9 ch9Var = new ch9(4);
                u89 u89Var = this.i;
                u89Var.c(22, ch9Var);
                u89Var.b();
            }
        }
    }

    @Override // defpackage.hu9
    public final void x(int i, long j, List list) {
        if (g0(20)) {
            b0(new ad9(this, list, i, j));
            q0(list, i, j, false);
        }
    }

    @Override // defpackage.hu9
    public final void y() {
        if (g0(9)) {
            b0(new tu9(this, 7));
            ush ushVar = this.q.j;
            if (ushVar.p() || f()) {
                return;
            }
            if (O() != -1) {
                o0(O(), -9223372036854775807L);
                return;
            }
            tsh tshVarM = ushVar.m(e0(this.q), new tsh(), 0L);
            if (tshVarM.h && tshVarM.a()) {
                o0(e0(this.q), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.hu9
    public final boolean z() {
        return this.q.v;
    }
}
