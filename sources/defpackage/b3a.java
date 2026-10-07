package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b3a implements j3d {
    public final WeakReference a;
    public final WeakReference b;

    public b3a(d3a d3aVar, j4d j4dVar) {
        this.a = new WeakReference(d3aVar);
        this.b = new WeakReference(j4dVar);
    }

    @Override // defpackage.j3d
    public final void E(boolean z) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.j(z);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.o(z);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void I(int i, boolean z) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i2 = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i3 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i4 = c4dVar.h;
        boolean z2 = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i5 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i6 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i2, umfVar, k3dVar, k3dVar2, i3, s2dVar, i4, z2, k4jVar, ushVar, i5, b0aVar, f, f2, p70Var, i6, zy4Var, ok5Var, i, z, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            k3a k3aVar = ((o3a) d3aVarA.h.i.e).p;
            if (k3aVar != null) {
                k3aVar.b(z ? 0 : i);
            }
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void J(long j) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void K(b0a b0aVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        d3aVarA.s = d3aVarA.s.f(b0aVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.m(b0aVar);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void K0(s2d s2dVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.d(s2dVar);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void L0(h3d h3dVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.f(h3dVar);
    }

    @Override // defpackage.j3d
    public final void N0(long j) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j2 = c4dVar.C;
        long j3 = c4dVar.D;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j2, j3, j, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
    }

    @Override // defpackage.j3d
    public final void Q(ok5 ok5Var) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i4 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i5 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        int i6 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.j();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void S(ry9 ry9Var, int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.k(ry9Var);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void U(int i, int i2) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.d(new yu9(i, i2, 2));
    }

    @Override // defpackage.j3d
    public final void Y0(boolean z) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z2 = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z2, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z3, z4, i7, i8, i9, z, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
        d3aVarA.u();
    }

    @Override // defpackage.j3d
    public final void Z(k3d k3dVar, k3d k3dVar2, int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.g(k3dVar, k3dVar2, i);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final d3a a() {
        return (d3a) this.a.get();
    }

    @Override // defpackage.j3d
    public final void b0(p70 p70Var) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.a(p70Var);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            if (o3aVar.g.t.X().a == 0) {
                ((q2a) o3aVar.m.b).a.setPlaybackToLocal(p70Var.c());
            }
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void c(k4j k4jVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i4 = c4dVar.k;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i5 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        int i6 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void e0(ryh ryhVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.m(ryhVar);
        d3aVarA.c.a(true, true);
        d3aVarA.d(new ch9(15, ryhVar));
    }

    @Override // defpackage.j3d
    public final void f(int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i2 = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i3 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i4 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i5 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        int i6 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i2, umfVar, k3dVar, k3dVar2, i3, s2dVar, i4, z, k4jVar, ushVar, i5, b0aVar, f, f2, p70Var, i, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void g() {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        gvb gvbVar = d3aVarA.g.d;
        c98 c98VarX = gvbVar.x();
        for (int i = 0; i < c98VarX.size(); i++) {
            i2a i2aVar = (i2a) c98VarX.get(i);
            gvbVar.G(i2aVar);
            d3aVarA.c(i2aVar, new ch9(14));
        }
    }

    @Override // defpackage.j3d
    public final void g0(boolean z) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z2 = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z2, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z3, z4, i7, i8, i9, z5, z, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
        d3aVarA.u();
    }

    @Override // defpackage.j3d
    public final void i0(int i, boolean z) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        d3aVarA.s = c4dVar.c(i, c4dVar.z, z);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void j0(float f) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        d3aVarA.s = d3aVarA.s.n(f);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void k(zy4 zy4Var) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i4 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i5 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        ok5 ok5Var = c4dVar.s;
        int i6 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
    }

    @Override // defpackage.j3d
    public final void l(int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        d3aVarA.s = c4dVar.c(c4dVar.w, i, c4dVar.v);
        d3aVarA.c.a(true, true);
        try {
            o3a o3aVar = (o3a) d3aVarA.h.i.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void onRepeatModeChanged(int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.h(i);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.n(i);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void t0(fzh fzhVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.b(fzhVar);
        d3aVarA.c.a(true, false);
        d3aVarA.d(new ch9(13, fzhVar));
    }

    @Override // defpackage.j3d
    public final void w0(b0a b0aVar) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
        int i4 = c4dVar.k;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar2 = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i5 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        int i6 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar2, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar, j, j2, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.q();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void x0(long j) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        if (((j4d) this.b.get()) == null) {
            return;
        }
        c4d c4dVar = d3aVarA.s;
        PlaybackException playbackException = c4dVar.a;
        int i = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i2 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i3 = c4dVar.h;
        boolean z = c4dVar.i;
        ush ushVar = c4dVar.j;
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
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i7 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i8 = c4dVar.z;
        int i9 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j2 = c4dVar.C;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        lvb.b0(ushVar.p() || umfVar.a.b < ushVar.o());
        d3aVarA.s = new c4d(playbackException, i, umfVar, k3dVar, k3dVar2, i2, s2dVar, i3, z, k4jVar, ushVar, i4, b0aVar, f, f2, p70Var, i5, zy4Var, ok5Var, i6, z2, z3, i7, i8, i9, z4, z5, b0aVar2, j2, j, j3, fzhVar, ryhVar);
        d3aVarA.c.a(true, true);
        try {
            d3aVarA.h.i.getClass();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void y0(ush ushVar, int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        j4d j4dVar = (j4d) this.b.get();
        if (j4dVar == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.l(ushVar, j4dVar.N(), i);
        d3aVarA.c.a(false, true);
        try {
            d3aVarA.h.i.p(ushVar);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.j3d
    public final void z(int i) {
        d3a d3aVarA = a();
        if (d3aVarA == null) {
            return;
        }
        d3aVarA.v();
        j4d j4dVar = (j4d) this.b.get();
        if (j4dVar == null) {
            return;
        }
        d3aVarA.s = d3aVarA.s.e(i, j4dVar.m());
        d3aVarA.c.a(true, true);
        try {
            m3a m3aVar = d3aVarA.h.i;
            j4dVar.m();
            o3a o3aVar = (o3a) m3aVar.e;
            o3aVar.M(o3aVar.g.t);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }
}
