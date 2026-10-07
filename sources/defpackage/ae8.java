package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import one.me.rlottie.RLottieDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ae8 extends ye8 {
    public static final /* synthetic */ zv8[] u;
    public final gu4 n;
    public final gu o;
    public final Context p;
    public final String q;
    public final ny8 r;
    public final p3c s;
    public String t;

    static {
        z8b z8bVar = new z8b(ae8.class, "autohideJob", "getAutohideJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        u = new zv8[]{z8bVar};
    }

    public ae8(dq4 dq4Var, wd8 wd8Var, xm xmVar, gu guVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, jz jzVar, sib sibVar, Context context) {
        super(dq4Var, wd8Var, xmVar, ny8Var, ny8Var2, ny8Var3);
        this.n = dq4Var;
        this.o = guVar;
        this.p = context;
        this.q = ae8.class.getName();
        this.r = ny8Var;
        this.s = qyj.S();
        int i = 2;
        lq4 lq4Var = null;
        tre.m0(new fz6(new r07(new fz6(e9i.I(jzVar), new l3(i, lq4Var, 4)), new fz6(sibVar.b, new l3(i, lq4Var, 5)), new xd8(3, null), 0), new yd8(this, null), 3), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ye8
    public final Object a(ge8 ge8Var, lq4 lq4Var) {
        zd8 zd8Var;
        boolean zF;
        boolean zD;
        boolean z;
        if (lq4Var instanceof zd8) {
            zd8Var = (zd8) lq4Var;
            int i = zd8Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zd8Var.g = i - Integer.MIN_VALUE;
            } else {
                zd8Var = new zd8(this, (nq4) lq4Var);
            }
        } else {
            zd8Var = new zd8(this, (nq4) lq4Var);
        }
        Object obj = zd8Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = zd8Var.g;
        lq4 lq4Var2 = null;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((ge8Var.q() instanceof ee8) || ge8Var.u()) {
                String str = this.q;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Unsupported informer type '" + ge8Var.q() + "', splash: " + ge8Var.u(), null);
                    }
                }
                return Boolean.FALSE;
            }
            zF = f(ge8Var);
            if (ge8Var.q() instanceof ce8) {
                ghb ghbVar = ew5.b;
                long jO = qe7.O(5, lw5.SECONDS);
                qy3 qy3Var = new qy3(this, lq4Var2, 26);
                zd8Var.d = zF;
                zd8Var.g = 1;
                Object objM0 = lvb.M0(jO, qy3Var, zd8Var);
                if (objM0 == hu4Var) {
                    return hu4Var;
                }
                obj = objM0;
                z = zF;
            } else {
                zD = true;
            }
            return Boolean.valueOf(!zD && zF);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = zd8Var.d;
        ch3.d0(obj);
        zD = cqk.d(obj, Boolean.TRUE);
        zF = z;
        return Boolean.valueOf(!zD && zF);
    }

    @Override // defpackage.ye8
    public final Drawable b(RLottieDrawable rLottieDrawable, boolean z, boolean z2) {
        if (z2) {
            rLottieDrawable.setAutoRepeatCount(3);
        }
        Context context = this.p;
        if (z2) {
            return new gph(rLottieDrawable, z ? Integer.valueOf(R.attr.icon_primary_inverse_static) : null, context);
        }
        return z ? new fph(rLottieDrawable, context) : rLottieDrawable;
    }

    @Override // defpackage.ye8
    public final int d() {
        return ((Boolean) ((e5d) this.f.getValue()).u().i()).booleanValue() ? 20 : 24;
    }
}
