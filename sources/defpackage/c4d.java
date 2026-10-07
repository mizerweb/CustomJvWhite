package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c4d {
    public static final c4d H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public final int A;
    public final b0a B;
    public final long C;
    public final long D;
    public final long E;
    public final fzh F;
    public final ryh G;
    public final PlaybackException a;
    public final int b;
    public final umf c;
    public final k3d d;
    public final k3d e;
    public final int f;
    public final s2d g;
    public final int h;
    public final boolean i;
    public final ush j;
    public final int k;
    public final k4j l;
    public final b0a m;
    public final float n;
    public final float o;
    public final int p;
    public final p70 q;
    public final zy4 r;
    public final ok5 s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        umf umfVar = umf.l;
        k3d k3dVar = umf.k;
        s2d s2dVar = s2d.d;
        k4j k4jVar = k4j.d;
        qsh qshVar = ush.a;
        b0a b0aVar = b0a.K;
        H = new c4d(null, 0, umfVar, k3dVar, k3dVar, 0, s2dVar, 0, false, k4jVar, qshVar, 0, b0aVar, 1.0f, 1.0f, p70.i, 0, zy4.d, ok5.e, 0, false, false, 1, 0, 1, false, false, b0aVar, 5000L, BuildConfig.SILENCE_TIME_TO_UPLOAD, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, fzh.b, ryh.J);
        String str = vqi.a;
        I = Integer.toString(1, 36);
        J = Integer.toString(2, 36);
        K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        M = Integer.toString(5, 36);
        N = Integer.toString(6, 36);
        O = Integer.toString(7, 36);
        P = Integer.toString(33, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        a0 = Integer.toString(18, 36);
        b0 = Integer.toString(19, 36);
        c0 = Integer.toString(20, 36);
        d0 = Integer.toString(21, 36);
        e0 = Integer.toString(22, 36);
        f0 = Integer.toString(23, 36);
        g0 = Integer.toString(24, 36);
        h0 = Integer.toString(25, 36);
        i0 = Integer.toString(26, 36);
        j0 = Integer.toString(27, 36);
        k0 = Integer.toString(28, 36);
        l0 = Integer.toString(29, 36);
        m0 = Integer.toString(30, 36);
        n0 = Integer.toString(31, 36);
        o0 = Integer.toString(32, 36);
        p0 = Integer.toString(34, 36);
    }

    public c4d(PlaybackException playbackException, int i, umf umfVar, k3d k3dVar, k3d k3dVar2, int i2, s2d s2dVar, int i3, boolean z, k4j k4jVar, ush ushVar, int i4, b0a b0aVar, float f, float f2, p70 p70Var, int i5, zy4 zy4Var, ok5 ok5Var, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, b0a b0aVar2, long j, long j2, long j3, fzh fzhVar, ryh ryhVar) {
        this.a = playbackException;
        this.b = i;
        this.c = umfVar;
        this.d = k3dVar;
        this.e = k3dVar2;
        this.f = i2;
        this.g = s2dVar;
        this.h = i3;
        this.i = z;
        this.l = k4jVar;
        this.j = ushVar;
        this.k = i4;
        this.m = b0aVar;
        this.n = f;
        this.o = f2;
        this.p = i5;
        this.q = p70Var;
        this.r = zy4Var;
        this.s = ok5Var;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = b0aVar2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = fzhVar;
        this.G = ryhVar;
    }

    public static c4d p(int i, Bundle bundle) {
        PlaybackException playbackException;
        ghe gheVarA;
        ghe gheVarA2;
        ush sshVar;
        zy4 zy4Var;
        ok5 ok5VarB;
        fzh fzhVar;
        IBinder binder = bundle.getBinder(o0);
        if (binder instanceof b4d) {
            return ((b4d) binder).a();
        }
        Bundle bundle2 = bundle.getBundle(a0);
        Throwable remoteException = null;
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.f);
            String string2 = bundle2.getString(PlaybackException.g);
            String string3 = bundle2.getString(PlaybackException.h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i2 = bundle2.getInt(PlaybackException.d, 1000);
            Bundle bundleN = vqi.n(bundle2.getBundle(PlaybackException.i));
            if (bundleN == null) {
                bundleN = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i2, bundleN, bundle2.getLong(PlaybackException.e, SystemClock.elapsedRealtime()));
        }
        int i3 = bundle.getInt(c0, 0);
        Bundle bundle3 = bundle.getBundle(b0);
        umf umfVarB = bundle3 == null ? umf.l : umf.b(bundle3);
        Bundle bundle4 = bundle.getBundle(d0);
        k3d k3dVarC = bundle4 == null ? umf.k : k3d.c(bundle4);
        Bundle bundle5 = bundle.getBundle(e0);
        k3d k3dVarC2 = bundle5 == null ? umf.k : k3d.c(bundle5);
        int i4 = bundle.getInt(f0, 0);
        Bundle bundle6 = bundle.getBundle(I);
        s2d s2dVar = bundle6 == null ? s2d.d : new s2d(bundle6.getFloat(s2d.e, 1.0f), bundle6.getFloat(s2d.f, 1.0f));
        int i5 = bundle.getInt(J, 0);
        boolean z = bundle.getBoolean(K, false);
        Bundle bundle7 = bundle.getBundle(L);
        if (bundle7 == null) {
            sshVar = ush.a;
        } else {
            ahc ahcVar = new ahc(24);
            IBinder binder2 = bundle7.getBinder(ush.b);
            if (binder2 == null) {
                a98 a98Var = c98.b;
                gheVarA = ghe.e;
            } else {
                gheVarA = l51.a(ahcVar, m51.a(binder2));
            }
            ahc ahcVar2 = new ahc(25);
            IBinder binder3 = bundle7.getBinder(ush.c);
            if (binder3 == null) {
                a98 a98Var2 = c98.b;
                gheVarA2 = ghe.e;
            } else {
                gheVarA2 = l51.a(ahcVar2, m51.a(binder3));
            }
            int[] intArray = bundle7.getIntArray(ush.d);
            if (intArray == null) {
                int i6 = gheVarA.d;
                int[] iArr = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            sshVar = new ssh(gheVarA, gheVarA2, intArray);
        }
        int i8 = bundle.getInt(n0, 0);
        Bundle bundle8 = bundle.getBundle(M);
        k4j k4jVar = bundle8 == null ? k4j.d : new k4j(bundle8.getInt(k4j.e, 0), bundle8.getFloat(k4j.g, 1.0f), bundle8.getInt(k4j.f, 0));
        Bundle bundle9 = bundle.getBundle(N);
        b0a b0aVarB = bundle9 == null ? b0a.K : b0a.b(bundle9);
        float f = bundle.getFloat(O, 1.0f);
        float f2 = bundle.getFloat(P, 1.0f);
        int i9 = bundle.getInt(p0, 0);
        Bundle bundle10 = bundle.getBundle(Q);
        p70 p70VarA = bundle10 == null ? p70.i : p70.a(bundle10);
        Bundle bundle11 = bundle.getBundle(g0);
        if (bundle11 == null) {
            zy4Var = zy4.d;
            b0aVarB = b0aVarB;
            f = f;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(zy4.e);
            zy4Var = new zy4(bundle11.getLong(zy4.f), parcelableArrayList == null ? ghe.e : l51.a(new hs4(10), parcelableArrayList));
        }
        Bundle bundle12 = bundle.getBundle(R);
        if (bundle12 == null) {
            ok5VarB = ok5.e;
        } else {
            int i10 = bundle12.getInt(ok5.f, 0);
            int i11 = bundle12.getInt(ok5.g, 0);
            int i12 = bundle12.getInt(ok5.h, 0);
            String string4 = bundle12.getString(ok5.i);
            nk5 nk5Var = new nk5(i10);
            nk5Var.b = i11;
            nk5Var.c = i12;
            lvb.R(i10 != 0 || string4 == null);
            nk5Var.d = string4;
            ok5VarB = nk5Var.b();
        }
        int i13 = bundle.getInt(S, 0);
        boolean z2 = bundle.getBoolean(T, false);
        boolean z3 = bundle.getBoolean(U, false);
        int i14 = bundle.getInt(V, 1);
        int i15 = bundle.getInt(W, 0);
        int i16 = bundle.getInt(X, 1);
        boolean z4 = bundle.getBoolean(Y, false);
        boolean z5 = bundle.getBoolean(Z, false);
        Bundle bundle13 = bundle.getBundle(h0);
        b0a b0aVarB2 = bundle13 == null ? b0a.K : b0a.b(bundle13);
        ok5 ok5Var = ok5VarB;
        long j = bundle.getLong(i0, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(j0, i < 4 ? 0L : BuildConfig.SILENCE_TIME_TO_UPLOAD);
        long j3 = bundle.getLong(k0, i < 4 ? 0L : 3000L);
        Bundle bundle14 = bundle.getBundle(m0);
        if (bundle14 == null) {
            fzhVar = fzh.b;
        } else {
            ArrayList parcelableArrayList2 = bundle14.getParcelableArrayList(fzh.c);
            fzhVar = new fzh(parcelableArrayList2 == null ? ghe.e : l51.a(new dzh(1), parcelableArrayList2));
        }
        Bundle bundle15 = bundle.getBundle(l0);
        return new c4d(playbackException, i3, umfVarB, k3dVarC, k3dVarC2, i4, s2dVar, i5, z, k4jVar, sshVar, i8, b0aVarB, f, f2, p70VarA, i9, zy4Var, ok5Var, i13, z2, z3, i14, i15, i16, z4, z5, b0aVarB2, j, j2, j3, fzhVar, bundle15 == null ? ryh.J : ryh.b(bundle15));
    }

    public final c4d a(p70 p70Var) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, p70Var, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d b(fzh fzhVar) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, fzhVar, this.G);
    }

    public final c4d c(int i, int i2, boolean z) {
        int i3 = this.A;
        boolean z2 = i3 == 3 && z && i2 == 0;
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d d(s2d s2dVar) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, s2dVar, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d e(int i, PlaybackException playbackException) {
        boolean z = this.v;
        int i2 = this.z;
        boolean z2 = i == 3 && z && i2 == 0;
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(playbackException, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, z, this.w, i2, i, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d f(b0a b0aVar) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, b0aVar, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d g(k3d k3dVar, k3d k3dVar2, int i) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, k3dVar, k3dVar2, i, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d h(int i) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, i, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d i(umf umfVar) {
        ush ushVar = this.j;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d j(boolean z) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, z, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d k(ush ushVar) {
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d l(ush ushVar, umf umfVar, int i) {
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, i, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d m(ryh ryhVar) {
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, ryhVar);
    }

    public final c4d n(float f) {
        float f2 = f != 0.0f ? f : this.n;
        ush ushVar = this.j;
        boolean zP = ushVar.p();
        umf umfVar = this.c;
        lvb.b0(zP || umfVar.a.b < ushVar.o());
        return new c4d(this.a, this.b, umfVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, this.m, f, f2, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final c4d o(h3d h3dVar, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zA = h3dVar.a(16);
        boolean zA2 = h3dVar.a(17);
        umf umfVar = this.c;
        umf umfVarA = umfVar.a(zA, zA2);
        k3d k3dVarB = this.d.b(zA, zA2);
        k3d k3dVarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        ush sshVar = this.j;
        if (!zA2 && zA && !sshVar.p()) {
            int i3 = umfVar.a.b;
            if (sshVar.o() != 1) {
                tsh tshVarM = sshVar.m(i3, new tsh(), 0L);
                z88 z88VarL = c98.l();
                int i4 = tshVarM.m;
                while (true) {
                    i2 = tshVarM.n;
                    if (i4 > i2) {
                        break;
                    }
                    rsh rshVarF = sshVar.f(i4, new rsh(), true);
                    rshVarF.c = 0;
                    z88VarL.c(rshVarF);
                    i4++;
                }
                tshVarM.n = i2 - tshVarM.m;
                tshVarM.m = 0;
                sshVar = new ssh(c98.r(tshVarM), z88VarL.h(), new int[]{0});
            }
        } else if (z || !zA2) {
            sshVar = ush.a;
        }
        ush ushVar = sshVar;
        b0a b0aVar = !h3dVar.a(18) ? b0a.K : this.m;
        if (h3dVar.a(22)) {
            f = this.n;
            f2 = this.o;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        p70 p70Var = !h3dVar.a(21) ? p70.i : this.q;
        zy4 zy4Var = !h3dVar.a(28) ? zy4.d : this.r;
        if (h3dVar.a(23)) {
            i = this.t;
            z3 = this.u;
        } else {
            i = 0;
            z3 = false;
        }
        b0a b0aVar2 = !h3dVar.a(18) ? b0a.K : this.B;
        fzh fzhVar = (z2 || !h3dVar.a(30)) ? fzh.b : this.F;
        if (!ushVar.p() && umfVarA.a.b >= ushVar.o()) {
            z4 = false;
        }
        lvb.b0(z4);
        return new c4d(this.a, this.b, umfVarA, k3dVarB, k3dVarB2, this.f, this.g, this.h, this.i, this.l, ushVar, this.k, b0aVar, f, f2, p70Var, this.p, zy4Var, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, b0aVar2, this.C, this.D, this.E, fzhVar, this.G);
    }

    public final ry9 q() {
        ush ushVar = this.j;
        if (ushVar.p()) {
            return null;
        }
        return ushVar.m(this.c.a.b, new tsh(), 0L).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Bundle r(int i) {
        long j;
        Bundle bundle;
        ArrayList arrayList;
        ush ushVar;
        rsh rshVar;
        int i2;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(PlaybackException.d, playbackException.a);
            bundle4.putLong(PlaybackException.e, playbackException.b);
            bundle4.putString(PlaybackException.f, playbackException.getMessage());
            bundle4.putBundle(PlaybackException.i, playbackException.c);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle4.putString(PlaybackException.g, cause.getClass().getName());
                bundle4.putString(PlaybackException.h, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle3.putInt(c0, i3);
        }
        umf umfVar = this.c;
        if (i < 3 || !umfVar.equals(umf.l)) {
            bundle3.putBundle(b0, umfVar.c(i));
        }
        k3d k3dVar = this.d;
        if (i < 3 || !umf.k.a(k3dVar)) {
            bundle3.putBundle(d0, k3dVar.d(i));
        }
        k3d k3dVar2 = this.e;
        if (i < 3 || !umf.k.a(k3dVar2)) {
            bundle3.putBundle(e0, k3dVar2.d(i));
        }
        int i4 = this.f;
        if (i4 != 0) {
            bundle3.putInt(f0, i4);
        }
        s2d s2dVar = s2d.d;
        s2d s2dVar2 = this.g;
        if (!s2dVar2.equals(s2dVar)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(s2d.e, s2dVar2.a);
            bundle5.putFloat(s2d.f, s2dVar2.b);
            bundle3.putBundle(I, bundle5);
        }
        int i5 = this.h;
        if (i5 != 0) {
            bundle3.putInt(J, i5);
        }
        boolean z = this.i;
        if (z) {
            bundle3.putBoolean(K, z);
        }
        qsh qshVar = ush.a;
        ush ushVar2 = this.j;
        boolean z2 = false;
        long j2 = 0;
        if (ushVar2.equals(qshVar)) {
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int iO = ushVar2.o();
            tsh tshVar = new tsh();
            int i6 = 0;
            while (i6 < iO) {
                tsh tshVarM = ushVar2.m(i6, tshVar, j2);
                tshVarM.getClass();
                Bundle bundle6 = new Bundle();
                long j3 = j2;
                if (!ry9.g.equals(tshVarM.b)) {
                    bundle6.putBundle(tsh.s, tshVarM.b.d(false));
                }
                long j4 = tshVarM.d;
                if (j4 != -9223372036854775807L) {
                    bundle6.putLong(tsh.t, j4);
                }
                long j5 = tshVarM.e;
                if (j5 != r12) {
                    bundle6.putLong(tsh.u, j5);
                }
                long j6 = tshVarM.f;
                if (j6 != r12) {
                    bundle6.putLong(tsh.v, j6);
                }
                boolean z3 = tshVarM.g;
                if (z3) {
                    bundle6.putBoolean(tsh.w, z3);
                }
                boolean z4 = tshVarM.h;
                if (z4) {
                    bundle6.putBoolean(tsh.x, z4);
                }
                iy9 iy9Var = tshVarM.i;
                if (iy9Var != null) {
                    bundle6.putBundle(tsh.y, iy9Var.c());
                }
                boolean z5 = tshVarM.j;
                if (z5) {
                    bundle6.putBoolean(tsh.z, z5);
                }
                long j7 = tshVarM.k;
                if (j7 != j3) {
                    bundle6.putLong(tsh.A, j7);
                }
                long j8 = tshVarM.l;
                if (j8 != -9223372036854775807) {
                    bundle6.putLong(tsh.B, j8);
                }
                int i7 = tshVarM.m;
                if (i7 != 0) {
                    bundle6.putInt(tsh.C, i7);
                }
                int i8 = tshVarM.n;
                if (i8 != 0) {
                    bundle6.putInt(tsh.D, i8);
                }
                long j9 = tshVarM.o;
                if (j9 != j3) {
                    bundle6.putLong(tsh.E, j9);
                }
                arrayList2.add(bundle6);
                i6++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList3 = new ArrayList();
            int iH = ushVar2.h();
            rsh rshVar2 = new rsh();
            int i9 = 0;
            while (i9 < iH) {
                rsh rshVarF = ushVar2.f(i9, rshVar2, z2);
                rshVarF.getClass();
                Bundle bundle7 = new Bundle();
                int i10 = rshVarF.c;
                if (i10 != 0) {
                    bundle7.putInt(rsh.h, i10);
                }
                long j10 = rshVarF.d;
                if (j10 != -9223372036854775807L) {
                    bundle7.putLong(rsh.i, j10);
                }
                long j11 = rshVarF.e;
                if (j11 != j) {
                    bundle7.putLong(rsh.j, j11);
                }
                boolean z6 = rshVarF.f;
                if (z6) {
                    bundle7.putBoolean(rsh.k, z6);
                }
                if (rshVarF.g.equals(fa.f)) {
                    bundle = bundle3;
                    arrayList = arrayList2;
                    ushVar = ushVar2;
                    rshVar = rshVar2;
                    i2 = i9;
                } else {
                    String str = rsh.l;
                    fa faVar = rshVarF.g;
                    faVar.getClass();
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    da[] daVarArr = faVar.e;
                    int length = daVarArr.length;
                    ?? r6 = z2;
                    while (r6 < length) {
                        ?? r23 = r6;
                        da daVar = daVarArr[r23 == true ? 1 : 0];
                        daVar.getClass();
                        int i11 = length;
                        Bundle bundle9 = new Bundle();
                        rsh rshVar3 = rshVar2;
                        bundle9.putLong(da.m, daVar.a);
                        bundle9.putInt(da.n, daVar.b);
                        bundle9.putInt(da.t, daVar.c);
                        bundle9.putParcelableArrayList(da.o, new ArrayList<>(Arrays.asList(daVar.d)));
                        String str2 = da.u;
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        ry9[] ry9VarArr = daVar.e;
                        int i12 = i9;
                        int length2 = ry9VarArr.length;
                        ?? r10 = z2;
                        while (true) {
                            Bundle bundleD = null;
                            if (r10 >= length2) {
                                break;
                            }
                            ?? r29 = r10;
                            ry9 ry9Var = ry9VarArr[r29 == true ? 1 : 0];
                            if (ry9Var != null) {
                                bundleD = ry9Var.d(true);
                            }
                            arrayList5.add(bundleD);
                            length2 = length2;
                            r10 = (r29 == true ? 1 : 0) + 1;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList5);
                        bundle9.putIntArray(da.p, daVar.f);
                        bundle9.putLongArray(da.q, daVar.g);
                        bundle9.putLong(da.r, daVar.j);
                        bundle9.putBoolean(da.s, daVar.k);
                        bundle9.putStringArrayList(da.v, new ArrayList<>(Arrays.asList(daVar.h)));
                        String str3 = da.x;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        ea[] eaVarArr = daVar.i;
                        int length3 = eaVarArr.length;
                        ?? r11 = z2;
                        while (r11 < length3) {
                            ?? r210 = r11;
                            ea eaVar = eaVarArr[r210 == true ? 1 : 0];
                            if (eaVar == null) {
                                bundle2 = null;
                            } else {
                                bundle2 = new Bundle();
                                bundle2.putLong(ea.d, eaVar.a);
                                bundle2.putLong(ea.e, eaVar.b);
                                bundle2.putString(ea.f, eaVar.c);
                            }
                            arrayList6.add(bundle2);
                            length3 = length3;
                            bundle3 = bundle3;
                            ushVar2 = ushVar2;
                            arrayList2 = arrayList2;
                            r11 = (r210 == true ? 1 : 0) + 1;
                        }
                        bundle9.putParcelableArrayList(str3, arrayList6);
                        bundle9.putBoolean(da.w, daVar.l);
                        arrayList4.add(bundle9);
                        length = i11;
                        rshVar2 = rshVar3;
                        i9 = i12;
                        r6 = (r23 == true ? 1 : 0) + 1;
                    }
                    bundle = bundle3;
                    arrayList = arrayList2;
                    ushVar = ushVar2;
                    rshVar = rshVar2;
                    i2 = i9;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(fa.h, arrayList4);
                    }
                    long j12 = faVar.b;
                    if (j12 != j) {
                        bundle8.putLong(fa.i, j12);
                    }
                    long j13 = faVar.c;
                    if (j13 != -9223372036854775807L) {
                        bundle8.putLong(fa.j, j13);
                    }
                    int i13 = faVar.d;
                    if (i13 != 0) {
                        bundle8.putInt(fa.k, i13);
                    }
                    bundle7.putBundle(str, bundle8);
                }
                arrayList3.add(bundle7);
                i9 = i2 + 1;
                z2 = z2;
                iH = iH;
                rshVar2 = rshVar;
                bundle3 = bundle;
                ushVar2 = ushVar;
                arrayList2 = arrayList;
            }
            Bundle bundle10 = bundle3;
            ArrayList arrayList7 = arrayList2;
            ush ushVar3 = ushVar2;
            boolean z7 = z2;
            int[] iArr = new int[iO];
            boolean z8 = true;
            if (iO > 0) {
                iArr[z7 ? 1 : 0] = ushVar3.a(true);
            }
            int i14 = 1;
            while (i14 < iO) {
                iArr[i14] = ushVar3.e(iArr[i14 - 1], z7 ? 1 : 0, z8);
                i14++;
                z8 = true;
                z7 = false;
            }
            Bundle bundle11 = new Bundle();
            bundle11.putBinder(ush.b, new m51(arrayList7));
            bundle11.putBinder(ush.c, new m51(arrayList3));
            bundle11.putIntArray(ush.d, iArr);
            bundle3 = bundle10;
            bundle3.putBundle(L, bundle11);
        }
        int i15 = this.k;
        if (i15 != 0) {
            bundle3.putInt(n0, i15);
        }
        k4j k4jVar = k4j.d;
        k4j k4jVar2 = this.l;
        if (!k4jVar2.equals(k4jVar)) {
            Bundle bundle12 = new Bundle();
            int i16 = k4jVar2.a;
            if (i16 != 0) {
                bundle12.putInt(k4j.e, i16);
            }
            int i17 = k4jVar2.b;
            if (i17 != 0) {
                bundle12.putInt(k4j.f, i17);
            }
            float f = k4jVar2.c;
            if (f != 1.0f) {
                bundle12.putFloat(k4j.g, f);
            }
            bundle3.putBundle(M, bundle12);
        }
        b0a b0aVar = b0a.K;
        b0a b0aVar2 = this.m;
        if (!b0aVar2.equals(b0aVar)) {
            bundle3.putBundle(N, b0aVar2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(O, f2);
        }
        float f3 = this.o;
        if (f3 != 1.0f) {
            bundle3.putFloat(P, f3);
        }
        int i18 = this.p;
        if (i18 != 0) {
            bundle3.putInt(p0, i18);
        }
        p70 p70Var = p70.i;
        p70 p70Var2 = this.q;
        if (!p70Var2.equals(p70Var)) {
            bundle3.putBundle(Q, p70Var2.d());
        }
        zy4 zy4Var = zy4.d;
        zy4 zy4Var2 = this.r;
        if (!zy4Var2.equals(zy4Var)) {
            Bundle bundle13 = new Bundle();
            String str4 = zy4.e;
            ghe gheVar = zy4Var2.a;
            z88 z88VarL = c98.l();
            for (int i19 = 0; i19 < gheVar.d; i19++) {
                if (((yy4) gheVar.get(i19)).d == null) {
                    z88VarL.c((yy4) gheVar.get(i19));
                }
            }
            bundle13.putParcelableArrayList(str4, l51.e(z88VarL.h(), new hs4(9)));
            bundle13.putLong(zy4.f, zy4Var2.b);
            bundle3.putBundle(g0, bundle13);
        }
        ok5 ok5Var = ok5.e;
        ok5 ok5Var2 = this.s;
        if (!ok5Var2.equals(ok5Var)) {
            Bundle bundle14 = new Bundle();
            int i20 = ok5Var2.a;
            if (i20 != 0) {
                bundle14.putInt(ok5.f, i20);
            }
            int i21 = ok5Var2.b;
            if (i21 != 0) {
                bundle14.putInt(ok5.g, i21);
            }
            int i22 = ok5Var2.c;
            if (i22 != 0) {
                bundle14.putInt(ok5.h, i22);
            }
            String str5 = ok5Var2.d;
            if (str5 != null) {
                bundle14.putString(ok5.i, str5);
            }
            bundle3.putBundle(R, bundle14);
        }
        int i23 = this.t;
        if (i23 != 0) {
            bundle3.putInt(S, i23);
        }
        boolean z9 = this.u;
        if (z9) {
            bundle3.putBoolean(T, z9);
        }
        boolean z10 = this.v;
        if (z10) {
            bundle3.putBoolean(U, z10);
        }
        int i24 = this.w;
        if (i24 != 1) {
            bundle3.putInt(V, i24);
        }
        int i25 = this.z;
        if (i25 != 0) {
            bundle3.putInt(W, i25);
        }
        int i26 = this.A;
        if (i26 != 1) {
            bundle3.putInt(X, i26);
        }
        boolean z11 = this.x;
        if (z11) {
            bundle3.putBoolean(Y, z11);
        }
        boolean z12 = this.y;
        if (z12) {
            bundle3.putBoolean(Z, z12);
        }
        b0a b0aVar3 = b0a.K;
        b0a b0aVar4 = this.B;
        if (!b0aVar4.equals(b0aVar3)) {
            bundle3.putBundle(h0, b0aVar4.c());
        }
        long j14 = i < 6 ? j : 5000L;
        long j15 = this.C;
        if (j15 != j14) {
            bundle3.putLong(i0, j15);
        }
        long j16 = i < 6 ? j : BuildConfig.SILENCE_TIME_TO_UPLOAD;
        long j17 = this.D;
        if (j17 != j16) {
            bundle3.putLong(j0, j17);
        }
        long j18 = i < 6 ? j : CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        long j19 = this.E;
        if (j19 != j18) {
            bundle3.putLong(k0, j19);
        }
        fzh fzhVar = fzh.b;
        fzh fzhVar2 = this.F;
        if (!fzhVar2.equals(fzhVar)) {
            Bundle bundle15 = new Bundle();
            bundle15.putParcelableArrayList(fzh.c, l51.e(fzhVar2.a, new dzh(0)));
            bundle3.putBundle(m0, bundle15);
        }
        ryh ryhVar = ryh.J;
        ryh ryhVar2 = this.G;
        if (!ryhVar2.equals(ryhVar)) {
            bundle3.putBundle(l0, ryhVar2.c());
        }
        return bundle3;
    }
}
