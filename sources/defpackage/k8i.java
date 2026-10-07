package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class k8i extends a8j {
    public static final /* synthetic */ zv8[] o = {new z8b(k8i.class, "disableTwoFAJob", "getDisableTwoFAJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, k8i.class, "loadDetailsJob", "getLoadDetailsJob()Lkotlinx/coroutines/Job;")};
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final ic6 j;
    public final ic6 k;
    public final AtomicReference l;
    public final p3c m;
    public final p3c n;

    public k8i(String str, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = str;
        this.d = ny8Var;
        this.e = ny8Var3;
        this.f = ny8Var2;
        this.g = ny8Var4;
        mjg mjgVarA = p90.a(r66.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        this.j = new ic6(null);
        this.k = new ic6(null);
        this.l = new AtomicReference(null);
        this.m = qyj.S();
        this.n = qyj.S();
        e9i.j0(new fz6(((utd) ny8Var4.getValue()).c(((s7f) ((et3) ny8Var2.getValue())).t()), new h8i(this, null, 0), 3), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [xnh] */
    /* JADX WARN: Type inference failed for: r3v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final Object B(k8i k8iVar, c79 c79Var, nq4 nq4Var) {
        i8i i8iVar;
        if (nq4Var instanceof i8i) {
            i8iVar = (i8i) nq4Var;
            int i = i8iVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8iVar.g = i - Integer.MIN_VALUE;
            } else {
                i8iVar = new i8i(k8iVar, nq4Var);
            }
        } else {
            i8iVar = new i8i(k8iVar, nq4Var);
        }
        Object objK0 = i8iVar.e;
        int i2 = i8iVar.g;
        int i3 = 1;
        ?? xnhVar = 0;
        xnhVar = 0;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarB = ((n0c) ((xhh) k8iVar.d.getValue())).b();
            h8i h8iVar = new h8i(k8iVar, xnhVar, i3);
            i8iVar.d = c79Var;
            i8iVar.g = 1;
            objK0 = yab.K0(xt4VarB, h8iVar, i8iVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c79Var = i8iVar.d;
            ch3.d0(objK0);
        }
        vjd vjdVar = (vjd) objK0;
        cd0 cd0Var = (cd0) k8iVar.l.get();
        String str = cd0Var != null ? cd0Var.c : null;
        if (vjdVar.c.contains(tsd.SECOND_FACTOR_HAS_EMAIL) && str != null) {
            xnhVar = new xnh(str);
        }
        c79Var.add(new b8i(new tnh(R.string.menu_settings)));
        c79Var.add(new c8i(1, new tnh(R.string.oneme_settings_twofa_change_password_title), 0, R.id.oneme_settings_twofa_configuration_setting_password, null, 112));
        c79Var.add(new c8i(3, new tnh(R.string.oneme_settings_twofa_change_email_title), 0, R.id.oneme_settings_twofa_configuration_setting_email, xnhVar, 80));
        c79Var.add(new a8i(new tnh(R.string.oneme_settings_twofa_configuration_description)));
        return sbi.a;
    }
}
