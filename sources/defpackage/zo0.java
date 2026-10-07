package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zo0 extends a8j {
    public static final /* synthetic */ zv8[] k;
    public static final long l;
    public final af7 c;
    public final xhh d;
    public final jp0 e;
    public final ny8 f;
    public final mjg g;
    public final mjg h;
    public final r8e i;
    public final p3c j;

    static {
        z8b z8bVar = new z8b(zo0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
        l = new dul(16).hashCode();
    }

    public zo0(ny8 ny8Var, boolean z, af7 af7Var, uo0 uo0Var, xhh xhhVar, jp0 jp0Var) {
        this.c = af7Var;
        this.d = xhhVar;
        this.e = jp0Var;
        this.f = ny8Var;
        mjg mjgVarA = p90.a(Boolean.valueOf(z));
        this.g = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        boolean z2 = jp0Var.e;
        r66 r66Var = r66.a;
        mjg mjgVarA2 = p90.a((z2 || jp0Var.g || jp0Var.f) ? B(z) : r66Var);
        this.h = mjgVarA2;
        this.i = e9i.G0(new yo0(mjgVarA2, 0), this.b, j0g.a, r66Var);
        this.j = qyj.S();
        e9i.j0(new fz6(new r07(new dz6(new fz6(e9i.S(new tz(6, new xx6[]{new q8e(uo0Var.b), new p5(uo0Var.d, 3), new p5(uo0Var.e, 4)}), zz6.a), new jhc(uo0Var, null, 9)), new zu(uo0Var, (lq4) null, 1)), r8eVar, new vo0(3, null), 0), new wo0(this, ny8Var, (lq4) null, 0), 3), this.b);
    }

    public final List B(boolean z) {
        wm4 wm4Var;
        wm4 wm4Var2;
        ps0 ps0Var;
        cf7 cf7Var;
        c79 c79VarW = yab.w();
        jp0 jp0Var = this.e;
        wm4 wm4Var3 = null;
        if (jp0Var.e) {
            wm4Var = new wm4(((Boolean) this.c.invoke()).booleanValue() ? 1 : z ? 2 : 3);
        } else {
            wm4Var = null;
        }
        c79VarW.add(wm4Var);
        if (jp0Var.g) {
            wm4Var2 = new wm4(z ? 5 : 4);
        } else {
            gm0.Y(zo0.class.getName(), "Early return in updateNotificationsBanner cuz of !hasNoNotificationsPermission");
            wm4Var2 = null;
        }
        c79VarW.add(wm4Var2);
        if (jp0Var.f) {
            wm4Var3 = new wm4(z ? 7 : 6);
        } else {
            gm0.Y(zo0.class.getName(), "Early return in updateMicBanner cuz of !hasNoMicPermission");
        }
        c79VarW.add(wm4Var3);
        List listO1 = ww3.o1(yab.j(c79VarW));
        if (!listO1.isEmpty()) {
            ym4 ym4VarC = C();
            switch (ym4VarC.a) {
                case 0:
                    cf7Var = (w83) ym4VarC.d;
                    break;
                case 1:
                    cf7Var = (w83) ym4VarC.d;
                    break;
                default:
                    cf7Var = (s9a) ym4VarC.d;
                    break;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listO1) {
                if (((Boolean) cf7Var.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            listO1 = arrayList;
        }
        if (listO1.isEmpty()) {
            return listO1;
        }
        ym4 ym4VarC2 = C();
        switch (ym4VarC2.a) {
            case 0:
                ps0Var = ym4VarC2.b;
                break;
            case 1:
                ps0Var = ym4VarC2.b;
                break;
            default:
                ps0Var = ym4VarC2.b;
                break;
        }
        return ww3.M1(listO1, ps0Var);
    }

    public final ym4 C() {
        return (ym4) this.f.getValue();
    }
}
