package defpackage;

import org.webrtc.PeerConnection;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zig implements oj7 {
    public static final zig a;
    private static final fif descriptor;

    static {
        zig zigVar = new zig();
        a = zigVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.prefs.StatPrefs.FrescoStats", zigVar, 17);
        t4dVar.k("imageTotal", false);
        t4dVar.k("imageCache", false);
        t4dVar.k("imageError", false);
        t4dVar.k("imageCdnTotal", true);
        t4dVar.k("imageCdnSuccess", true);
        t4dVar.k("imageCdnMinTimeFb", true);
        t4dVar.k("imageCdnMaxTimeFb", true);
        t4dVar.k("imageCdnMinTimeIntegral", true);
        t4dVar.k("imageCdnMaxTimeIntegral", true);
        t4dVar.k("imageHomeTotal", true);
        t4dVar.k("imageHomeSuccess", true);
        t4dVar.k("imageHomeMinTimeFb", true);
        t4dVar.k("imageHomeMaxTimeFb", true);
        t4dVar.k("imageHomeMinTimeIntegral", true);
        t4dVar.k("imageHomeMaxTimeIntegral", true);
        t4dVar.k("imageCacheTotal", true);
        t4dVar.k("imageCacheSuccess", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        bjg bjgVar = (bjg) obj;
        long j = bjgVar.q;
        long j2 = bjgVar.p;
        long j3 = bjgVar.o;
        long j4 = bjgVar.n;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        long j5 = bjgVar.a;
        long j6 = bjgVar.m;
        long j7 = bjgVar.l;
        long j8 = bjgVar.k;
        long j9 = bjgVar.j;
        long j10 = bjgVar.i;
        long j11 = bjgVar.h;
        long j12 = bjgVar.g;
        long j13 = bjgVar.f;
        long j14 = bjgVar.e;
        long j15 = bjgVar.d;
        x74VarA.e(fifVar, 0, j5);
        x74VarA.e(fifVar, 1, bjgVar.b);
        x74VarA.e(fifVar, 2, bjgVar.c);
        if (x74VarA.B() || j15 != 0) {
            x74VarA.e(fifVar, 3, j15);
        }
        if (x74VarA.B() || j14 != 0) {
            x74VarA.e(fifVar, 4, j14);
        }
        if (x74VarA.B() || j13 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 5, j13);
        }
        if (x74VarA.B() || j12 != 0) {
            x74VarA.e(fifVar, 6, j12);
        }
        if (x74VarA.B() || j11 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 7, j11);
        }
        if (x74VarA.B() || j10 != 0) {
            x74VarA.e(fifVar, 8, j10);
        }
        if (x74VarA.B() || j9 != 0) {
            x74VarA.e(fifVar, 9, j9);
        }
        if (x74VarA.B() || j8 != 0) {
            x74VarA.e(fifVar, 10, j8);
        }
        if (x74VarA.B() || j7 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 11, j7);
        }
        if (x74VarA.B() || j6 != 0) {
            x74VarA.e(fifVar, 12, j6);
        }
        if (x74VarA.B() || j4 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 13, j4);
        }
        if (x74VarA.B() || j3 != 0) {
            x74VarA.e(fifVar, 14, j3);
        }
        if (x74VarA.B() || j2 != 0) {
            x74VarA.e(fifVar, 15, j2);
        }
        if (x74VarA.B() || j != 0) {
            x74VarA.e(fifVar, 16, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var, ti9Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        int i;
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i2 = 0;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        long jQ5 = 0;
        long jQ6 = 0;
        long jQ7 = 0;
        long jQ8 = 0;
        long jQ9 = 0;
        long jQ10 = 0;
        long jQ11 = 0;
        long jQ12 = 0;
        long jQ13 = 0;
        long jQ14 = 0;
        long jQ15 = 0;
        long jQ16 = 0;
        long jQ17 = 0;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jQ = v74VarA.q(fifVar, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    jQ2 = v74VarA.q(fifVar, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    jQ3 = v74VarA.q(fifVar, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    jQ4 = v74VarA.q(fifVar, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    jQ5 = v74VarA.q(fifVar, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    jQ6 = v74VarA.q(fifVar, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    jQ7 = v74VarA.q(fifVar, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    jQ8 = v74VarA.q(fifVar, 7);
                    i2 |= np0.m;
                    continue;
                case 8:
                    jQ9 = v74VarA.q(fifVar, 8);
                    i2 |= np0.n;
                    continue;
                case 9:
                    jQ10 = v74VarA.q(fifVar, 9);
                    i2 |= np0.o;
                    continue;
                case 10:
                    jQ11 = v74VarA.q(fifVar, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    jQ12 = v74VarA.q(fifVar, 11);
                    i2 |= np0.q;
                    continue;
                case 12:
                    jQ13 = v74VarA.q(fifVar, 12);
                    i2 |= np0.r;
                    continue;
                case 13:
                    jQ14 = v74VarA.q(fifVar, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    jQ15 = v74VarA.q(fifVar, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    jQ16 = v74VarA.q(fifVar, 15);
                    i = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    break;
                case 16:
                    jQ17 = v74VarA.q(fifVar, 16);
                    i = 65536;
                    break;
                default:
                    qr7.e(iV);
                    return null;
            }
            i2 |= i;
        }
        v74VarA.j(fifVar);
        return new bjg(i2, jQ, jQ2, jQ3, jQ4, jQ5, jQ6, jQ7, jQ8, jQ9, jQ10, jQ11, jQ12, jQ13, jQ14, jQ15, jQ16, jQ17);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
