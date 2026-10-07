package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c6a implements oj7 {
    public static final c6a a;
    private static final fif descriptor;

    static {
        c6a c6aVar = new c6a();
        a = c6aVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.MediaTransformModel", c6aVar, 10);
        t4dVar.k("hevc_enabled", true);
        t4dVar.k("hdr_enabled", true);
        t4dVar.k("hdr_to_sdr_codec_enabled", true);
        t4dVar.k("portrait_encoding_allowed", true);
        t4dVar.k("stream_mp4", true);
        t4dVar.k("platform_muxer", true);
        t4dVar.k("max_enc_frames", true);
        t4dVar.k("bppf", true);
        t4dVar.k("b_frames_disabled", true);
        t4dVar.k("enc_perf_params", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        h6a h6aVar = (h6a) obj;
        boolean z = h6aVar.j;
        boolean z2 = h6aVar.i;
        double d = h6aVar.h;
        g6a g6aVar = h6aVar.g;
        boolean z3 = h6aVar.f;
        boolean z4 = h6aVar.e;
        boolean z5 = h6aVar.d;
        boolean z6 = h6aVar.c;
        boolean z7 = h6aVar.b;
        boolean z8 = h6aVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z8) {
            x74VarA.h(fifVar, 0, z8);
        }
        if (x74VarA.B() || z7) {
            x74VarA.h(fifVar, 1, z7);
        }
        if (x74VarA.B() || z6) {
            x74VarA.h(fifVar, 2, z6);
        }
        if (x74VarA.B() || z5) {
            x74VarA.h(fifVar, 3, z5);
        }
        if (x74VarA.B() || z4) {
            x74VarA.h(fifVar, 4, z4);
        }
        if (x74VarA.B() || z3) {
            x74VarA.h(fifVar, 5, z3);
        }
        if (x74VarA.B() || !cqk.d(g6aVar, new g6a())) {
            x74VarA.i(fifVar, 6, e6a.a, g6aVar);
        }
        if (x74VarA.B() || Double.compare(d, 0.1d) != 0) {
            x74VarA.j(fifVar, 7, d);
        }
        if (x74VarA.B() || z2) {
            x74VarA.h(fifVar, 8, z2);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 9, z);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, b01Var, b01Var, b01Var, b01Var, b01Var, e6a.a, hp5.a, b01Var, b01Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        boolean zC4 = false;
        boolean zC5 = false;
        boolean zC6 = false;
        boolean zC7 = false;
        boolean zC8 = false;
        g6a g6aVar = null;
        double dE = 0.0d;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zC = v74VarA.C(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    zC2 = v74VarA.C(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    zC3 = v74VarA.C(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    zC4 = v74VarA.C(fifVar, 3);
                    i |= 8;
                    break;
                case 4:
                    zC5 = v74VarA.C(fifVar, 4);
                    i |= 16;
                    break;
                case 5:
                    zC6 = v74VarA.C(fifVar, 5);
                    i |= 32;
                    break;
                case 6:
                    g6aVar = (g6a) v74VarA.x(fifVar, 6, e6a.a, g6aVar);
                    i |= 64;
                    break;
                case 7:
                    dE = v74VarA.E(fifVar, 7);
                    i |= np0.m;
                    break;
                case 8:
                    zC7 = v74VarA.C(fifVar, 8);
                    i |= np0.n;
                    break;
                case 9:
                    zC8 = v74VarA.C(fifVar, 9);
                    i |= np0.o;
                    break;
                default:
                    qr7.e(iV);
                    return null;
            }
        }
        v74VarA.j(fifVar);
        return new h6a(i, zC, zC2, zC3, zC4, zC5, zC6, g6aVar, dE, zC7, zC8);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
