package defpackage;

import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;

/* JADX INFO: loaded from: classes4.dex */
public final class u05 implements vwd {
    public final r05 a;
    public final t05 b;
    public final v05 c;
    public final int d;

    public u05(r05 r05Var, t05 t05Var, v05 v05Var, int i) {
        this.a = r05Var;
        this.b = t05Var;
        this.c = v05Var;
        this.d = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r05 r05Var = this.a;
        v05 v05Var = this.c;
        t05 t05Var = this.b;
        int i = this.d;
        switch (i) {
            case 0:
                hmi hmiVar = (hmi) ((vwd) v05Var.b).get();
                omi omiVar = (omi) t05Var.j.get();
                if (((vwd) v05Var.c).get() == null) {
                    return new hli(hmiVar, omiVar, (kli) ((vwd) v05Var.l).get(), (vwd) v05Var.j, (vwd) v05Var.i, (vwd) v05Var.h);
                }
                ore.m();
                return null;
            case 1:
                eli eliVar = (eli) v05Var.a;
                lh2 lh2Var = (lh2) t05Var.x.get();
                eliVar.getClass();
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                }
                return new hmi(new dli(0, eliVar), lh2Var, eliVar.b, new dli(1, eliVar));
            case 2:
                ((eli) v05Var.a).getClass();
                return null;
            case 3:
                return new fg5((vwd) v05Var.k, (omi) t05Var.j.get());
            case 4:
                return new uli((vwd) v05Var.h, (vwd) v05Var.e, (hmi) ((vwd) v05Var.b).get(), (vwd) v05Var.j, (omi) t05Var.j.get(), (ui2) r05Var.a.f);
            case 5:
                return rm2.f ? (pl2) ((vwd) v05Var.g).get() : (pl2) ((vwd) v05Var.f).get();
            case 6:
                jl2 jl2Var = (jl2) ((vwd) v05Var.d).get();
                ix6 ix6Var = (ix6) t05Var.q.get();
                iwh iwhVar = (iwh) t05Var.p.get();
                p5j p5jVar = (p5j) t05Var.t.get();
                omi omiVar2 = (omi) t05Var.j.get();
                zx3 zx3Var = (zx3) t05Var.l.get();
                ch2 ch2Var = (ch2) t05Var.i.get();
                return new pm2(jl2Var, ix6Var, iwhVar, p5jVar, omiVar2, zx3Var, ch2Var.a().a(UseTorchAsFlashQuirk.class) ? new xde(ch2Var, t05Var.b.a(), (vk8) t05Var.D.get()) : er3.j, (kg2) t05Var.d.get(), (vwd) v05Var.e, (hmi) ((vwd) v05Var.b).get());
            case 7:
                return new jl2((kg2) t05Var.d.get(), (hmi) ((vwd) v05Var.b).get(), (a2k) t05Var.e.get(), (omi) t05Var.j.get(), t05Var.a());
            case 8:
                return new zli((hmi) ((vwd) v05Var.b).get(), t05Var.a());
            case 9:
                return new rm2((kg2) t05Var.d.get(), (vwd) v05Var.f, (omi) t05Var.j.get(), (iwh) t05Var.p.get());
            case 10:
                omi omiVar3 = (omi) t05Var.j.get();
                lg2 lg2Var = (lg2) r05Var.a.c;
                n1g.l(lg2Var);
                s2e s2eVarA = ((ch2) t05Var.i.get()).a();
                return new nmi(omiVar3, lg2Var, (s2eVarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || s2eVarA.a(PreviewOrientationIncorrectQuirk.class) || s2eVarA.a(TextureViewIsClosedQuirk.class)) ? new xp9(20) : dul.j, (nmf) ((vwd) v05Var.i).get());
            case 11:
                return ((eli) v05Var.a).c;
            default:
                throw new AssertionError(i);
        }
    }
}
