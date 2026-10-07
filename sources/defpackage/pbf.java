package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pbf {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i = rx8.P(3, new tyd(23));

    public pbf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
        this.h = ny8Var8;
    }

    public static void c(c79 c79Var, rt2 rt2Var) {
        if (rt2Var != null) {
            int i = 1;
            if (h(rt2Var)) {
                if (rt2Var.d0()) {
                    i = 3;
                } else if (rt2Var.h0()) {
                    i = 2;
                } else if (!rt2Var.e0()) {
                    i = 4;
                }
                c79Var.add(new drd(i));
            }
        }
    }

    public static boolean h(rt2 rt2Var) {
        if (!rt2Var.r0() || rt2Var.b.n0 <= 0) {
            return false;
        }
        return rt2Var.d0() || rt2Var.h0() || rt2Var.e0();
    }

    public final void a(rt2 rt2Var, vg4 vg4Var, c79 c79Var) {
        if (g().c(rt2Var, vg4Var)) {
            return;
        }
        c79Var.add(new jqd((rt2Var == null || !h(rt2Var)) ? np0.n : 536871168));
    }

    public final void b(rt2 rt2Var, vg4 vg4Var, c79 c79Var) {
        boolean zC = g().c(rt2Var, vg4Var);
        boolean z = vg4Var != null;
        if (zC) {
            if (z || ((rt2Var != null && rt2Var.e0()) || (rt2Var != null && rt2Var.h0()))) {
                int i = (rt2Var == null || !h(rt2Var)) ? 8388608 : 545259520;
                g().getClass();
                c79Var.add(new brd(i, ((rt2Var == null || !rt2Var.h0()) && !z) ? R.string.portal_blocked_chat_with_reason : R.string.portal_blocked_profile_with_reason));
            }
        }
    }

    public final et3 d() {
        return (et3) this.c.getValue();
    }

    public final p4c e() {
        return (p4c) this.a.getValue();
    }

    public final e5d f() {
        return (e5d) this.f.getValue();
    }

    public final jcd g() {
        return (jcd) this.g.getValue();
    }

    public final void i(rt2 rt2Var, vg4 vg4Var, c79 c79Var) {
        tqd tqdVar;
        if (!((Boolean) ((g5d) ((gjf) this.d.getValue())).a.t0.a(e5d.S6[69]).i()).booleanValue()) {
            xb9 xb9Var = (xb9) d();
            if (!((Boolean) xb9Var.z0.m(xb9Var, xb9.g1[16])).booleanValue()) {
                return;
            }
        }
        if (vg4Var == null) {
            vg4Var = rt2Var != null ? rt2Var.w() : null;
        }
        if (vg4Var != null) {
            tqdVar = new tqd(vg4Var.v());
        } else {
            if (rt2Var == null) {
                gm0.Y(c79.class.getName(), "Early return in tryToAddDebugProfileItem cuz of indefined item");
                return;
            }
            tqdVar = new tqd(rt2Var.A());
        }
        c79Var.add(tqdVar);
    }
}
