package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import one.me.android.media.service.OneMeMediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public final class t4a extends Binder implements e38 {
    public static final /* synthetic */ int i = 0;
    public final WeakReference c;
    public final gvb d;
    public final Set e;
    public fhe f;
    public int g;
    public s4a h;

    public t4a(d3a d3aVar) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(d3aVar);
        this.d = new gvb(d3aVar);
        this.e = Collections.synchronizedSet(new HashSet());
        this.f = fhe.i;
    }

    public static e89 l0(d3a d3aVar, i2a i2aVar, int i2, r4a r4aVar, qg4 qg4Var) {
        if (d3aVar.j()) {
            return h88.b;
        }
        e89 e89Var = (e89) r4aVar.k(d3aVar, i2aVar, i2);
        mof mofVarR = mof.r();
        e89Var.b(new sc2(d3aVar, mofVarR, qg4Var, e89Var, 6), im5.a);
        return mofVarR;
    }

    public static void q0(d3a d3aVar, i2a i2aVar, int i2, wmf wmfVar) {
        try {
            h2a h2aVar = i2aVar.d;
            h2aVar.getClass();
            h2aVar.h(i2, wmfVar);
            d3aVar.c.a(true, true);
        } catch (RemoteException e) {
            lvb.H0("MediaSessionStub", "Failed to send result to controller " + i2aVar, e);
        }
    }

    public static oo6 r0(qg4 qg4Var) {
        return new oo6(22, new oo6(23, qg4Var));
    }

    @Override // defpackage.e38
    public final void A(y28 y28Var, int i2, Surface surface, int i3, int i4) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 27, r0(new cv9(this, surface, i3, i4)));
    }

    @Override // defpackage.e38
    public final void B(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 3, r0(new f4a(5)));
    }

    @Override // defpackage.e38
    public final void D(y28 y28Var, int i2, Bundle bundle) {
        ad4 ad4Var;
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            wmf wmfVarA = wmf.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                gvb gvbVar = this.d;
                IBinder iBinderAsBinder = y28Var.asBinder();
                synchronized (gvbVar.b) {
                    try {
                        i2a i2aVarZ = gvbVar.z(iBinderAsBinder);
                        ad4Var = i2aVarZ != null ? (ad4) ((mw) gvbVar.d).get(i2aVarZ) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                xhf xhfVar = ad4Var != null ? ad4Var.b : null;
                if (xhfVar == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    xhfVar.d(i2, wmfVarA);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.e38
    public final void E(y28 y28Var, int i2, Bundle bundle, boolean z) {
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            o0(y28Var, i2, 35, r0(new a4a(p70.a(bundle), z, 1)));
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.e38
    public final void F(y28 y28Var, int i2, Bundle bundle, long j) {
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            o0(y28Var, i2, 31, new j4a(new fv9(new gw2(ry9.b(bundle), j, 4), 10, new f4a(14)), 1));
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void G(y28 y28Var, i2a i2aVar) {
        if (y28Var == null) {
            cqk.l(y28Var);
            return;
        }
        d3a d3aVar = (d3a) this.c.get();
        if (d3aVar == null || d3aVar.j()) {
            cqk.l(y28Var);
        } else {
            this.e.add(i2aVar);
            vqi.d0(d3aVar.l, new w77(this, i2aVar, d3aVar, y28Var, 3));
        }
    }

    @Override // defpackage.e38
    public final void H(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 24, r0(new f4a(6)));
    }

    @Override // defpackage.e38
    public final void I(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        n0(i2aVarZ, i2);
    }

    @Override // defpackage.e38
    public final void J(final y28 y28Var, final int i2, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundleN = vqi.n(bundle2);
        if (y28Var == null || bundle == null || bundleN == null) {
            return;
        }
        try {
            final emf emfVarA = emf.a(bundle);
            if (!by3.n(emfVarA.b)) {
                V(y28Var, i2, emfVarA, 0, new j4a(new ch9(z, emfVarA, bundleN), 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final d3a d3aVar = (d3a) this.c.get();
                if (d3aVar != null && !d3aVar.j()) {
                    final i2a i2aVarZ = this.d.z(y28Var.asBinder());
                    if (i2aVarZ == null) {
                        return;
                    }
                    vqi.d0(d3aVar.l, new Runnable() { // from class: k4a
                        /* JADX WARN: Code duplicated, block: B:19:0x006a  */
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zBooleanValue;
                            emf emfVar = emfVarA;
                            String str = emfVar.b;
                            d3a d3aVar2 = d3aVar;
                            int i3 = i2;
                            t4a t4aVar = this.a;
                            gvb gvbVar = t4aVar.d;
                            i2a i2aVar = i2aVarZ;
                            if (gvbVar.M(i2aVar)) {
                                try {
                                    by3 by3VarD = by3.d(emfVar);
                                    Object obj = by3VarD.j;
                                    int i4 = by3VarD.b;
                                    if (!by3VarD.b()) {
                                        lvb.G0("MediaSessionStub", "Can't execute predefined custom command: " + str);
                                        t4a.q0(d3aVar2, i2aVar, i3, new wmf(-6));
                                        return;
                                    }
                                    emf emfVar2 = by3VarD.a;
                                    if (emfVar2 != null) {
                                        lvb.b0(emfVar2.a == 40010);
                                        t4aVar.V(y28Var, i3, null, 40010, new j4a(new n4a(by3VarD), 1));
                                        return;
                                    }
                                    j4d j4dVar = d3aVar2.t;
                                    if (i4 != 1) {
                                        zBooleanValue = false;
                                    } else if (obj != null) {
                                        zBooleanValue = ((Boolean) obj).booleanValue();
                                    } else if (j4dVar.z()) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        t4aVar.n0(i2aVar, i3);
                                    } else if (i4 == 31) {
                                        obj.getClass();
                                        t4aVar.p0(i2aVar, i3, 31, new j4a(new fv9(new a4a((ry9) obj, true, 0), 10, new f4a(14)), 1));
                                    } else {
                                        t4aVar.p0(i2aVar, i3, i4, t4a.r0(new n4a(by3VarD)));
                                    }
                                    gvbVar.u(i2aVar);
                                } catch (RuntimeException e) {
                                    lvb.H0("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                                    t4a.q0(d3aVar2, i2aVar, i3, new wmf(-3));
                                }
                            }
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.e38
    public final void K(y28 y28Var, int i2, IBinder iBinder, int i3, long j) {
        if (y28Var == null || iBinder == null) {
            return;
        }
        if (i3 == -1 || i3 >= 0) {
            try {
                o0(y28Var, i2, 20, new j4a(new fv9(new c4a(j, l51.a(new f4a(13), m51.a(iBinder)), i3), 10, new f4a(14)), 1));
            } catch (RuntimeException e) {
                lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.e38
    public final void L(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 8, r0(new ch9(21)));
    }

    @Override // defpackage.e38
    public final void M(y28 y28Var, int i2, float f) {
        if (y28Var == null || f <= 0.0f) {
            return;
        }
        o0(y28Var, i2, 13, r0(new sf6(3, f)));
    }

    @Override // defpackage.e38
    public final void R(y28 y28Var, int i2, IBinder iBinder, boolean z) {
        if (y28Var == null || iBinder == null) {
            return;
        }
        try {
            o0(y28Var, i2, 20, new j4a(new fv9(new a4a(l51.a(new f4a(13), m51.a(iBinder)), z, 2), 10, new f4a(14)), 1));
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.e38
    public final void T(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 9, r0(new ch9(29)));
    }

    public final void V(y28 y28Var, final int i2, final emf emfVar, final int i3, final r4a r4aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final d3a d3aVar = (d3a) this.c.get();
            if (d3aVar != null && !d3aVar.j()) {
                final i2a i2aVarZ = this.d.z(y28Var.asBinder());
                if (i2aVarZ == null) {
                    return;
                }
                vqi.d0(d3aVar.l, new Runnable() { // from class: h4a
                    @Override // java.lang.Runnable
                    public final void run() {
                        gvb gvbVar = this.a.d;
                        i2a i2aVar = i2aVarZ;
                        if (gvbVar.M(i2aVar)) {
                            emf emfVar2 = emfVar;
                            d3a d3aVar2 = d3aVar;
                            int i4 = i2;
                            if (emfVar2 != null) {
                                if (!gvbVar.P(i2aVar, emfVar2)) {
                                    t4a.q0(d3aVar2, i2aVar, i4, new wmf(-4));
                                    return;
                                }
                            } else if (!gvbVar.O(i2aVar, i3)) {
                                t4a.q0(d3aVar2, i2aVar, i4, new wmf(-4));
                                return;
                            }
                            r4aVar.k(d3aVar2, i2aVar, i4);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.e38
    public final void W(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 4, r0(new f4a(7)));
    }

    @Override // defpackage.e38
    public final void X(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 6, r0(new ch9(26)));
    }

    @Override // defpackage.e38
    public final void Z(y28 y28Var, int i2, long j) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 5, r0(new x50(j, 11)));
    }

    @Override // defpackage.e38
    public final void a0(y28 y28Var, int i2, Bundle bundle) {
        u(y28Var, i2, bundle, true);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.e38
    public final void b0(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d3a d3aVar = (d3a) this.c.get();
            if (d3aVar != null && !d3aVar.j()) {
                vqi.d0(d3aVar.l, new su6(this, 25, y28Var));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.e38
    public final void d(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 1, r0(new ch9(20)));
    }

    @Override // defpackage.e38
    public final void f(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 24, r0(new ch9(19)));
    }

    @Override // defpackage.e38
    public final void f0(y28 y28Var, int i2, Surface surface) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 27, r0(new fv9(this, 9, surface)));
    }

    @Override // defpackage.e38
    public final void g0(y28 y28Var, int i2, Bundle bundle) {
        d3a d3aVar = (d3a) this.c.get();
        if (y28Var == null || bundle == null || d3aVar == null) {
            cqk.l(y28Var);
            return;
        }
        try {
            OneMeMediaSessionService oneMeMediaSessionService = d3aVar.f;
            ke4 ke4VarA = ke4.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = ke4VarA.c;
            if (cqk.h(callingUid, oneMeMediaSessionService, str) == 1) {
                lvb.G0("MediaSessionStub", c0a.l(callingUid, "Ignoring connection from invalid package name ", str, " (uid=", ")"));
                cqk.l(y28Var);
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ke4VarA.d;
            }
            try {
                p3a p3aVar = new p3a(str, callingPid, callingUid);
                boolean zN = t3a.m(oneMeMediaSessionService).n(p3aVar);
                int i3 = ke4VarA.a;
                int i4 = ke4VarA.b;
                G(y28Var, new i2a(p3aVar, i3, i4, zN, new o4a(y28Var, i4), ke4VarA.e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.e38
    public final void h0(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 7, r0(new ch9(25)));
    }

    @Override // defpackage.e38
    public final void i0(y28 y28Var, int i2, int i3) {
        if (y28Var == null) {
            return;
        }
        if (i3 == 2 || i3 == 0 || i3 == 1) {
            o0(y28Var, i2, 15, r0(new jn4(i3, 9)));
        }
    }

    @Override // defpackage.e38
    public final void j(y28 y28Var, int i2, float f) {
        if (y28Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        o0(y28Var, i2, 24, r0(new sf6(4, f)));
    }

    @Override // defpackage.e38
    public final void j0(y28 y28Var, int i2, boolean z) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 14, r0(new hw2(z, 7)));
    }

    @Override // defpackage.e38
    public final void k(y28 y28Var, int i2, Bundle bundle) {
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            o0(y28Var, i2, 29, r0(new fv9(this, 7, ryh.b(bundle))));
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    public final c4d k0(c4d c4dVar) {
        c98 c98Var = c4dVar.F.a;
        z88 z88VarL = c98.l();
        l88 l88Var = new l88(4);
        for (int i2 = 0; i2 < c98Var.size(); i2++) {
            ezh ezhVar = (ezh) c98Var.get(i2);
            hyh hyhVarB = ezhVar.b();
            String string = (String) this.f.get(hyhVarB);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i3 = this.g;
                this.g = i3 + 1;
                String str = vqi.a;
                sb.append(Integer.toString(i3, 36));
                sb.append("-");
                sb.append(hyhVarB.b);
                string = sb.toString();
            }
            l88Var.q(hyhVarB, string);
            z88VarL.c(ezhVar.a(string));
        }
        this.f = l88Var.p();
        c4d c4dVarB = c4dVar.b(new fzh(z88VarL.h()));
        ryh ryhVar = c4dVarB.G;
        if (ryhVar.H.isEmpty()) {
            return c4dVarB;
        }
        qyh qyhVarC = ryhVar.a().c();
        pci it = ryhVar.H.values().iterator();
        while (it.hasNext()) {
            nyh nyhVar = (nyh) it.next();
            hyh hyhVar = nyhVar.a;
            String str2 = (String) this.f.get(hyhVar);
            if (str2 != null) {
                qyhVarC.a(new nyh(new hyh(str2, hyhVar.d), nyhVar.b));
            } else {
                qyhVarC.a(nyhVar);
            }
        }
        return c4dVarB.m(qyhVarC.b());
    }

    @Override // defpackage.e38
    public final void l(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 12, r0(new ch9(28)));
    }

    @Override // defpackage.e38
    public final void m(y28 y28Var, int i2) {
        i2a i2aVarZ;
        if (y28Var == null || (i2aVarZ = this.d.z(y28Var.asBinder())) == null) {
            return;
        }
        p0(i2aVarZ, i2, 11, r0(new ch9(24)));
    }

    public final int m0(i2a i2aVar, j4d j4dVar, int i2) {
        if (j4dVar.c(17)) {
            gvb gvbVar = this.d;
            if (!gvbVar.N(i2aVar, 17) && gvbVar.N(i2aVar, 16)) {
                return j4dVar.F() + i2;
            }
        }
        return i2;
    }

    @Override // defpackage.e38
    public final void n(y28 y28Var, int i2, int i3) {
        if (y28Var == null || i3 < 0) {
            return;
        }
        o0(y28Var, i2, 20, new oo6(22, new b4a(this, i3, 4)));
    }

    public final void n0(i2a i2aVar, int i2) {
        p0(i2aVar, i2, 1, r0(new fv9(this, 8, i2aVar)));
    }

    public final void o0(y28 y28Var, int i2, int i3, r4a r4aVar) {
        i2a i2aVarZ = this.d.z(y28Var.asBinder());
        if (i2aVarZ != null) {
            p0(i2aVarZ, i2, i3, r4aVar);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        final int i4 = 1;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        final int i5 = 2;
        boolean z = false;
        switch (i2) {
            case 3002:
                j(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                y28 y28VarG = sv9.G(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                if (y28VarG != null && i7 >= 0) {
                    o0(y28VarG, i6, 25, r0(new jn4(i7, 10)));
                }
                return true;
            case 3004:
                y28 y28VarG2 = sv9.G(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                if (y28VarG2 != null) {
                    o0(y28VarG2, i8, 26, r0(new ch9(23)));
                }
                return true;
            case 3005:
                y28 y28VarG3 = sv9.G(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                if (y28VarG3 != null) {
                    o0(y28VarG3, i9, 26, r0(new f4a(1)));
                }
                return true;
            case 3006:
                y28 y28VarG4 = sv9.G(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                z = parcel.readInt() != 0;
                if (y28VarG4 != null) {
                    o0(y28VarG4, i10, 26, r0(new hw2(z, 6)));
                }
                return true;
            case 3007:
                u(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                F(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                u(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                R(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                R(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                K(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                t(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                D(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                g0(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                y28 y28VarG5 = sv9.G(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                J(y28VarG5, i11, (Bundle) j2m.a(parcel, creator), (Bundle) j2m.a(parcel, creator), false);
                return true;
            case 3017:
                i0(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                j0(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                n(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                y28 y28VarG6 = sv9.G(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                if (y28VarG6 != null && i13 >= 0 && i14 >= i13) {
                    o0(y28VarG6, i12, 20, new oo6(22, new z3a(this, i13, i14)));
                }
                return true;
            case 3021:
                y28 y28VarG7 = sv9.G(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                if (y28VarG7 != null) {
                    o0(y28VarG7, i15, 20, r0(new f4a(11)));
                }
                return true;
            case 3022:
                y28 y28VarG8 = sv9.G(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                if (y28VarG8 != null && i17 >= 0 && i18 >= 0) {
                    o0(y28VarG8, i16, 20, r0(new yu9(i17, i18, 4)));
                }
                return true;
            case 3023:
                y28 y28VarG9 = sv9.G(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                final int i20 = parcel.readInt();
                final int i21 = parcel.readInt();
                final int i22 = parcel.readInt();
                if (y28VarG9 != null && i20 >= 0 && i21 >= i20 && i22 >= 0) {
                    o0(y28VarG9, i19, 20, r0(new qg4() { // from class: e4a
                        @Override // defpackage.qg4
                        public final void accept(Object obj) {
                            j4d j4dVar = (j4d) obj;
                            j4dVar.q0();
                            j4dVar.b.n0(i20, i21, i22);
                        }
                    }));
                }
                return true;
            case 3024:
                I(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                d(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                q(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                y28 y28VarG10 = sv9.G(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                Bundle bundle = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG10 != null && bundle != null) {
                    try {
                        o0(y28VarG10, i23, 13, r0(new vu9(new s2d(bundle.getFloat(s2d.e, 1.0f), bundle.getFloat(s2d.f, 1.0f)))));
                    } catch (RuntimeException e) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e);
                    }
                }
                return true;
            case 3028:
                M(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                y28 y28VarG11 = sv9.G(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                Bundle bundle2 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG11 != null && bundle2 != null) {
                    try {
                        final ry9 ry9VarB = ry9.b(bundle2);
                        o0(y28VarG11, i24, 20, new j4a(new fv9(new r4a() { // from class: d4a
                            @Override // defpackage.r4a
                            public final Object k(d3a d3aVar, i2a i2aVar, int i25) {
                                int i26 = i5;
                                ry9 ry9Var = ry9VarB;
                                switch (i26) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return d3aVar.l(i2aVar, c98.r(ry9Var));
                            }
                        }, 11, new f4a(3)), 1));
                    } catch (RuntimeException e2) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    }
                }
                return true;
            case 3030:
                y28 y28VarG12 = sv9.G(parcel.readStrongBinder());
                int i25 = parcel.readInt();
                int i26 = parcel.readInt();
                Bundle bundle3 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG12 != null && bundle3 != null && i26 >= 0) {
                    try {
                        final ry9 ry9VarB2 = ry9.b(bundle3);
                        final int i27 = z ? 1 : 0;
                        o0(y28VarG12, i25, 20, new j4a(new fv9(new r4a() { // from class: d4a
                            @Override // defpackage.r4a
                            public final Object k(d3a d3aVar, i2a i2aVar, int i28) {
                                int i29 = i27;
                                ry9 ry9Var = ry9VarB2;
                                switch (i29) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return d3aVar.l(i2aVar, c98.r(ry9Var));
                            }
                        }, 11, new b4a(this, i26, 1)), 1));
                    } catch (RuntimeException e3) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
                    }
                }
                return true;
            case 3031:
                y28 y28VarG13 = sv9.G(parcel.readStrongBinder());
                int i28 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (y28VarG13 != null && strongBinder != null) {
                    try {
                        o0(y28VarG13, i28, 20, new j4a(new fv9(new zv2(5, l51.a(new f4a(13), m51.a(strongBinder))), 11, new f4a(2)), 1));
                    } catch (RuntimeException e4) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                    }
                }
                return true;
            case 3032:
                y28 y28VarG14 = sv9.G(parcel.readStrongBinder());
                int i29 = parcel.readInt();
                int i30 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (y28VarG14 != null && strongBinder2 != null && i30 >= 0) {
                    try {
                        o0(y28VarG14, i29, 20, new j4a(new fv9(new zv2(4, l51.a(new f4a(13), m51.a(strongBinder2))), 11, new b4a(this, i30, 3)), 1));
                    } catch (RuntimeException e5) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                    }
                }
                return true;
            case 3033:
                z(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                B(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                b0(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                W(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                r(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                Z(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                y28 y28VarG15 = sv9.G(parcel.readStrongBinder());
                int i31 = parcel.readInt();
                int i32 = parcel.readInt();
                long j = parcel.readLong();
                if (y28VarG15 != null && i32 >= 0) {
                    o0(y28VarG15, i31, 10, new oo6(22, new c4a(j, this, i32)));
                }
                return true;
            case 3040:
                m(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                l(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                X(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                L(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                f0(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Surface) j2m.a(parcel, Surface.CREATOR));
                return true;
            case 3045:
                v(sv9.G(parcel.readStrongBinder()));
                return true;
            case 3046:
                h0(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                T(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                k(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                y28 y28VarG16 = sv9.G(parcel.readStrongBinder());
                int i33 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle4 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG16 != null && string != null && bundle4 != null) {
                    if (TextUtils.isEmpty(string)) {
                        lvb.G0("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            V(y28VarG16, i33, null, 40010, new j4a(new f4a(0, z4e.a(bundle4), string), 1));
                        } catch (RuntimeException e6) {
                            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e6);
                        }
                    }
                }
                return true;
            case 3050:
                y28 y28VarG17 = sv9.G(parcel.readStrongBinder());
                int i34 = parcel.readInt();
                Bundle bundle5 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG17 != null && bundle5 != null) {
                    try {
                        V(y28VarG17, i34, null, 40010, new j4a(new ch9(16, z4e.a(bundle5)), 1));
                    } catch (RuntimeException e7) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for Rating", e7);
                    }
                }
                return true;
            case 3051:
                y28 y28VarG18 = sv9.G(parcel.readStrongBinder());
                int i35 = parcel.readInt();
                int i36 = parcel.readInt();
                int i37 = parcel.readInt();
                if (y28VarG18 != null && i36 >= 0) {
                    o0(y28VarG18, i35, 33, r0(new yu9(i36, i37, 3)));
                }
                return true;
            case 3052:
                y28 y28VarG19 = sv9.G(parcel.readStrongBinder());
                int i38 = parcel.readInt();
                int i39 = parcel.readInt();
                if (y28VarG19 != null) {
                    o0(y28VarG19, i38, 34, r0(new jn4(i39, 8)));
                }
                return true;
            case 3053:
                y28 y28VarG20 = sv9.G(parcel.readStrongBinder());
                int i40 = parcel.readInt();
                int i41 = parcel.readInt();
                if (y28VarG20 != null) {
                    o0(y28VarG20, i40, 34, r0(new jn4(i41, 7)));
                }
                return true;
            case 3054:
                y28 y28VarG21 = sv9.G(parcel.readStrongBinder());
                int i42 = parcel.readInt();
                final boolean z2 = parcel.readInt() != 0;
                final int i43 = parcel.readInt();
                if (y28VarG21 != null) {
                    o0(y28VarG21, i42, 34, r0(new qg4() { // from class: g4a
                        @Override // defpackage.qg4
                        public final void accept(Object obj) {
                            ((j4d) obj).l0(i43, z2);
                        }
                    }));
                }
                return true;
            case 3055:
                y28 y28VarG22 = sv9.G(parcel.readStrongBinder());
                int i44 = parcel.readInt();
                int i45 = parcel.readInt();
                Bundle bundle6 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                if (y28VarG22 != null && bundle6 != null && i45 >= 0) {
                    try {
                        final ry9 ry9VarB3 = ry9.b(bundle6);
                        o0(y28VarG22, i44, 20, new j4a(new fv9(new r4a() { // from class: d4a
                            @Override // defpackage.r4a
                            public final Object k(d3a d3aVar, i2a i2aVar, int i210) {
                                int i211 = i4;
                                ry9 ry9Var = ry9VarB3;
                                switch (i211) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return d3aVar.l(i2aVar, c98.r(ry9Var));
                            }
                        }, 11, new b4a(this, i45, 2)), 1));
                    } catch (RuntimeException e8) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e8);
                    }
                }
                return true;
            case 3056:
                y28 y28VarG23 = sv9.G(parcel.readStrongBinder());
                int i46 = parcel.readInt();
                int i47 = parcel.readInt();
                int i48 = parcel.readInt();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (y28VarG23 != null && strongBinder3 != null && i47 >= 0 && i48 >= i47) {
                    try {
                        o0(y28VarG23, i46, 20, new j4a(new fv9(new oo6(21, l51.a(new f4a(13), m51.a(strongBinder3))), 11, new z3a(this, i47, i48)), 1));
                    } catch (RuntimeException e9) {
                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e9);
                    }
                }
                return true;
            case 3057:
                E(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Bundle) j2m.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                f(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                H(sv9.G(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                y28 y28VarG24 = sv9.G(parcel.readStrongBinder());
                int i49 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                J(y28VarG24, i49, (Bundle) j2m.a(parcel, creator2), (Bundle) j2m.a(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                A(sv9.G(parcel.readStrongBinder()), parcel.readInt(), (Surface) j2m.a(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                p(sv9.G(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                tz9 tz9VarA = null;
                switch (i2) {
                    case 4001:
                        y28 y28VarG25 = sv9.G(parcel.readStrongBinder());
                        int i50 = parcel.readInt();
                        Bundle bundle7 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                        if (y28VarG25 != null) {
                            if (bundle7 != null) {
                                try {
                                    tz9VarA = tz9.a(bundle7);
                                } catch (RuntimeException e10) {
                                    lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                }
                            }
                            V(y28VarG25, i50, null, 50000, new j4a(new f4a(tz9VarA), 0));
                            break;
                        }
                        return true;
                    case 4002:
                        y28 y28VarG26 = sv9.G(parcel.readStrongBinder());
                        int i51 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (y28VarG26 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                lvb.G0("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            V(y28VarG26, i51, null, 50004, new j4a(new ch9(27, string2), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        y28 y28VarG27 = sv9.G(parcel.readStrongBinder());
                        int i52 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i53 = parcel.readInt();
                        int i54 = parcel.readInt();
                        Bundle bundle8 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                        if (y28VarG27 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                lvb.G0("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i53 < 0) {
                                lvb.G0("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i54 < 1) {
                                lvb.G0("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle8 != null) {
                                    try {
                                        tz9VarA = tz9.a(bundle8);
                                    } catch (RuntimeException e11) {
                                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                    }
                                }
                                V(y28VarG27, i52, null, 50003, new j4a(new ch9(string3, i53, i54, tz9VarA), 0));
                            }
                            break;
                        }
                        return true;
                    case 4004:
                        y28 y28VarG28 = sv9.G(parcel.readStrongBinder());
                        int i55 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle9 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                        if (y28VarG28 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                lvb.G0("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle9 != null) {
                                    try {
                                        tz9VarA = tz9.a(bundle9);
                                    } catch (RuntimeException e12) {
                                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                    }
                                }
                                V(y28VarG28, i55, null, 50005, new j4a(new f4a(12, tz9VarA, string4), 0));
                            }
                            break;
                        }
                        return true;
                    case 4005:
                        y28 y28VarG29 = sv9.G(parcel.readStrongBinder());
                        int i56 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i57 = parcel.readInt();
                        int i58 = parcel.readInt();
                        Bundle bundle10 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                        if (y28VarG29 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                lvb.G0("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i57 < 0) {
                                lvb.G0("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i58 < 1) {
                                lvb.G0("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle10 != null) {
                                    try {
                                        tz9VarA = tz9.a(bundle10);
                                    } catch (RuntimeException e13) {
                                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e13);
                                    }
                                }
                                V(y28VarG29, i56, null, 50006, new j4a(new f4a(string5, i57, i58, tz9VarA), 0));
                            }
                            break;
                        }
                        return true;
                    case 4006:
                        y28 y28VarG30 = sv9.G(parcel.readStrongBinder());
                        int i59 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle11 = (Bundle) j2m.a(parcel, Bundle.CREATOR);
                        if (y28VarG30 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                lvb.G0("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle11 != null) {
                                    try {
                                        tz9VarA = tz9.a(bundle11);
                                    } catch (RuntimeException e14) {
                                        lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e14);
                                    }
                                }
                                V(y28VarG30, i59, null, 50001, new j4a(new f4a(10, tz9VarA, string6), 0));
                            }
                            break;
                        }
                        return true;
                    case 4007:
                        y28 y28VarG31 = sv9.G(parcel.readStrongBinder());
                        int i60 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (y28VarG31 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                lvb.G0("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            V(y28VarG31, i60, null, 50002, new j4a(new ch9(17, string7), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
        }
    }

    @Override // defpackage.e38
    public final void p(y28 y28Var, int i2, int i3, int i4) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 27, r0(new z3a(this, i3, i4)));
    }

    public final void p0(final i2a i2aVar, final int i2, final int i3, final r4a r4aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final d3a d3aVar = (d3a) this.c.get();
            if (d3aVar != null && !d3aVar.j()) {
                vqi.d0(d3aVar.l, new Runnable() { // from class: i4a
                    @Override // java.lang.Runnable
                    public final void run() {
                        gvb gvbVar = this.a.d;
                        final i2a i2aVar2 = i2aVar;
                        int i4 = i3;
                        boolean zN = gvbVar.N(i2aVar2, i4);
                        final d3a d3aVar2 = d3aVar;
                        final int i5 = i2;
                        if (!zN) {
                            t4a.q0(d3aVar2, i2aVar2, i5, new wmf(-4));
                            return;
                        }
                        f2a f2aVar = d3aVar2.e;
                        d3aVar2.t(i2aVar2);
                        f2aVar.getClass();
                        final r4a r4aVar2 = r4aVar;
                        if (i4 != 27) {
                            gvbVar.g(i2aVar2, i4, new zc4() { // from class: m4a
                                @Override // defpackage.zc4
                                public final e89 run() {
                                    return (e89) r4aVar2.k(d3aVar2, i2aVar2, i5);
                                }
                            });
                        } else {
                            r4aVar2.k(d3aVar2, i2aVar2, i5);
                            gvbVar.g(i2aVar2, i4, new l4a());
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.e38
    public final void q(y28 y28Var, int i2) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 2, r0(new f4a(9)));
    }

    @Override // defpackage.e38
    public final void r(y28 y28Var, int i2, int i3) {
        if (y28Var == null || i3 < 0) {
            return;
        }
        o0(y28Var, i2, 10, new oo6(22, new b4a(this, i3, 0)));
    }

    @Override // defpackage.e38
    public final void t(y28 y28Var, int i2, boolean z) {
        if (y28Var == null) {
            return;
        }
        o0(y28Var, i2, 1, r0(new hw2(z, 5)));
    }

    @Override // defpackage.e38
    public final void u(y28 y28Var, int i2, Bundle bundle, boolean z) {
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            ry9 ry9VarB = ry9.b(bundle);
            i2a i2aVarZ = this.d.z(y28Var.asBinder());
            if (i2aVarZ != null) {
                p0(i2aVarZ, i2, 31, new j4a(new fv9(new a4a(ry9VarB, z, 0), 10, new f4a(14)), 1));
            }
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.e38
    public final void v(y28 y28Var) {
        if (y28Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d3a d3aVar = (d3a) this.c.get();
            if (d3aVar != null && !d3aVar.j()) {
                i2a i2aVarZ = this.d.z(y28Var.asBinder());
                if (i2aVarZ != null) {
                    vqi.d0(d3aVar.l, new su6(this, 26, i2aVarZ));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.e38
    public final void w(y28 y28Var, int i2, Bundle bundle) {
        J(y28Var, i2, bundle, Bundle.EMPTY, false);
    }

    @Override // defpackage.e38
    public final void z(y28 y28Var, int i2, Bundle bundle) {
        if (y28Var == null || bundle == null) {
            return;
        }
        try {
            o0(y28Var, i2, 19, r0(new nf6(b0a.b(bundle), 2)));
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }
}
