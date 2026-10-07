package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class kdc implements j3d {
    public final /* synthetic */ ldc a;

    public kdc(ldc ldcVar) {
        this.a = ldcVar;
    }

    @Override // defpackage.j3d
    public final void S(ry9 ry9Var, int i) {
        if (i == 1 || i == 2 || i == 3) {
            ldc ldcVar = this.a;
            ldcVar.k.n(ldcVar, ldcVar.x());
        }
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        OneVideoExoPlaybackException oneVideoExoPlaybackException = new OneVideoExoPlaybackException(playbackException);
        ldc ldcVar = this.a;
        boolean z = nec.a;
        oneVideoExoPlaybackException.toString();
        if (ldcVar.B != 6) {
            boolean z2 = nec.a;
            int i = ldcVar.B;
            ldcVar.B = 6;
            ldcVar.z = oneVideoExoPlaybackException;
            ldcVar.k.s(ldcVar, i, 6);
        }
        ldcVar.k.q(oneVideoExoPlaybackException, ldcVar.z(), ldcVar);
    }

    @Override // defpackage.j3d
    public final void Y0(boolean z) {
        ldc ldcVar = this.a;
        ldcVar.k.m(ldcVar, z);
    }

    @Override // defpackage.j3d
    public final void Z(k3d k3dVar, k3d k3dVar2, int i) {
        ldc ldcVar = this.a;
        ldcVar.k.i(pm5.a(i), ldcVar, ldc.v(ldcVar, k3dVar), ldc.v(ldcVar, k3dVar2));
    }

    @Override // defpackage.j3d
    public final void g() {
        ldc ldcVar = this.a;
        ga7 ga7Var = ldcVar.k;
        ga7Var.b(ldcVar);
        if (ldcVar.d == null) {
            ga7Var.w(ldcVar);
        }
    }

    @Override // defpackage.j3d
    public final void i0(int i, boolean z) {
        ldc ldcVar = this.a;
        ga7 ga7Var = ldcVar.k;
        ga7Var.j(ldcVar, z);
        if (ldcVar.V.getPlaybackState() == 3) {
            if (z) {
                BaseVideoPlayer.t(ldcVar, 3);
            } else {
                BaseVideoPlayer.t(ldcVar, 4);
            }
            ga7 ga7Var2 = ldcVar.k;
            if (z) {
                ga7Var2.g(ldcVar);
            } else {
                ga7Var2.y(ldcVar);
            }
        }
        if (i == 5) {
            ga7Var.a(ldcVar);
        }
    }

    @Override // defpackage.j3d
    public final void y0(ush ushVar, int i) {
        ldc ldcVar = this.a;
        if (ldcVar.N != i) {
            ldcVar.N = i;
            if (i == 1) {
                ldcVar.C(ushVar);
            }
        }
        ldcVar.B();
    }

    @Override // defpackage.j3d
    public final void z(int i) {
        ldc ldcVar = this.a;
        bg6 bg6Var = ldcVar.V;
        ga7 ga7Var = ldcVar.k;
        if (i == 1) {
            boolean z = nec.a;
            if (ldcVar.j() != 6) {
                BaseVideoPlayer.t(ldcVar, 1);
            }
            ga7Var.l(ldcVar);
            return;
        }
        if (i == 2) {
            boolean z2 = nec.a;
            BaseVideoPlayer.t(ldcVar, 2);
            ldcVar.M = bg6Var.z();
            ga7Var.e(ldcVar);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            boolean z3 = nec.a;
            BaseVideoPlayer.t(ldcVar, 5);
            ga7Var.d(ldcVar);
            return;
        }
        boolean z4 = nec.a;
        boolean z5 = bg6Var.z();
        if (z5) {
            BaseVideoPlayer.t(ldcVar, 3);
        } else {
            BaseVideoPlayer.t(ldcVar, 4);
        }
        ga7Var.k(ldcVar);
        if (z5 != ldcVar.M) {
            ga7 ga7Var2 = ldcVar.k;
            if (z5) {
                ga7Var2.g(ldcVar);
            } else {
                ga7Var2.y(ldcVar);
            }
        }
        bg6Var.I0();
        ypl.b(bg6Var.g0);
        Iterator it = ldcVar.o.iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            throw null;
        }
    }
}
