package defpackage;

import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afc implements oj7 {
    public static final afc a;
    private static final fif descriptor;

    static {
        afc afcVar = new afc();
        a = afcVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.pms.OneVideoUploaderConfig", afcVar, 3);
        t4dVar.k(MediaStreamTrack.VIDEO_TRACK_KIND, true);
        t4dVar.k("video_connections", true);
        t4dVar.k(MediaStreamTrack.AUDIO_TRACK_KIND, true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        cfc cfcVar = (cfc) obj;
        int i = cfcVar.c;
        int i2 = cfcVar.b;
        int i3 = cfcVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i3 != 0) {
            x74VarA.y(0, i3, fifVar);
        }
        if (x74VarA.B() || i2 != 4) {
            x74VarA.y(1, i2, fifVar);
        }
        if (x74VarA.B() || i != 0) {
            x74VarA.y(2, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var, ij8Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                iL = v74VarA.l(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                iL2 = v74VarA.l(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                iL3 = v74VarA.l(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new cfc(i, iL, iL2, iL3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
