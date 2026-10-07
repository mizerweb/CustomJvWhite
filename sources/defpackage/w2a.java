package defpackage;

import androidx.media3.session.MediaSessionService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w2a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3a b;

    public /* synthetic */ w2a(d3a d3aVar, int i) {
        this.a = i;
        this.b = d3aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d3a d3aVar = this.b;
        switch (i) {
            case 0:
                j3d j3dVar = d3aVar.v;
                if (j3dVar != null) {
                    j4d j4dVar = d3aVar.t;
                    j4dVar.q0();
                    synchronized (j4dVar.c) {
                        j3d j3dVar2 = (j3d) j4dVar.c.remove(j3dVar);
                        bg6 bg6Var = j4dVar.b;
                        if (j3dVar2 != null) {
                            j3dVar = j3dVar2;
                        }
                        bg6Var.p0(j3dVar);
                        break;
                    }
                    return;
                }
                return;
            default:
                w4 w4Var = d3aVar.w;
                if (w4Var != null) {
                    ((MediaSessionService) w4Var.a).g(d3aVar.k, false);
                    return;
                }
                return;
        }
    }
}
