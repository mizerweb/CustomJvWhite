package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lti implements q5j {
    public final String a;
    public final long b;
    public final e3j c;
    public final y3d d;
    public final rui e;
    public final WeakReference f;
    public final mj9 g;
    public final boolean h;
    public final e5d i;
    public final et3 j;

    public lti(String str, long j, e3j e3jVar, y3d y3dVar, rui ruiVar, WeakReference weakReference, ze4 ze4Var, boolean z, e5d e5dVar, et3 et3Var) {
        this.a = str;
        this.b = j;
        this.c = e3jVar;
        this.d = y3dVar;
        this.e = ruiVar;
        this.f = weakReference;
        this.g = ze4Var;
        this.h = z;
        this.i = e5dVar;
        this.j = et3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lti)) {
            return false;
        }
        lti ltiVar = (lti) obj;
        return cqk.d(this.a, ltiVar.a) && this.b == ltiVar.b && cqk.d(this.c, ltiVar.c) && cqk.d(this.d, ltiVar.d) && this.e.equals(ltiVar.e) && this.f.equals(ltiVar.f) && cqk.d(this.g, ltiVar.g) && this.h == ltiVar.h && cqk.d(this.i, ltiVar.i) && cqk.d(this.j, ltiVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + nbh.n((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + qt4.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 31);
    }

    @Override // defpackage.q5j
    public final boolean isDebugEnabled() {
        return ((xb9) this.j).g0() && ((Boolean) this.i.x().i()).booleanValue();
    }

    @Override // defpackage.q5j
    public final int k() {
        return this.e.getHeight();
    }

    @Override // defpackage.q5j
    public final int n() {
        return this.e.getWidth();
    }

    @Override // defpackage.q5j
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = lti.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                long j = this.b;
                String str = this.a;
                boolean zD = this.c.d();
                int iG = this.g.g();
                StringBuilder sbT = qt4.t(j, "Player autoplay. Surface destroyed, \n                            |msgId:", ", \n                            |attachId:", str);
                sbT.append("\n                            |playing:");
                sbT.append(zD);
                sbT.append("\n                            |states:");
                sbT.append(iG);
                a4cVar.c(je9Var, name, s5h.y0(sbT.toString()), null);
            }
        }
        this.d.a(this.c);
        z5j z5jVar = (z5j) this.f.get();
        if (z5jVar != null) {
            z5jVar.J();
        }
        this.g.e(this.a);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "PlayingState(attachId=", this.a, ", messageId=");
        sbB.append(", player=");
        sbB.append(this.c);
        sbB.append(", playerHolder=");
        sbB.append(this.d);
        sbB.append(", videoContent=");
        sbB.append(this.e);
        sbB.append(", weakViewRef=");
        sbB.append(this.f);
        sbB.append(", states=");
        sbB.append(this.g);
        sbB.append(", isGif=");
        sbB.append(this.h);
        sbB.append(", pmsProperties=");
        sbB.append(this.i);
        sbB.append(", clientPrefs=");
        sbB.append(this.j);
        sbB.append(")");
        return sbB.toString();
    }

    @Override // defpackage.q5j
    public final int v() {
        return 2;
    }

    @Override // defpackage.q5j
    public final void x(Surface surface, uvi uviVar) {
        String name = lti.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                long j = this.b;
                String str = this.a;
                boolean zD = this.c.d();
                StringBuilder sbT = qt4.t(j, "Player autoplay. Surface created, \n                            |msgId:", ", \n                            |attachId:", str);
                sbT.append("\n                            |playing:");
                sbT.append(zD);
                a4cVar.c(je9Var, name, s5h.y0(sbT.toString()), null);
            }
        }
        this.c.H(surface);
        this.c.C(uviVar);
    }
}
