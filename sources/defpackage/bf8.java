package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicReference;
import one.me.rlottie.RLottieDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bf8 extends ye8 {
    public static final /* synthetic */ int s = 0;
    public final Context n;
    public final String o;
    public final ny8 p;
    public final AtomicReference q;
    public sgg r;

    public bf8(ite iteVar, wd8 wd8Var, xm xmVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, sib sibVar, Context context) {
        super(iteVar, wd8Var, xmVar, ny8Var, ny8Var2, ny8Var3);
        this.n = context;
        this.o = bf8.class.getName();
        this.p = ny8Var4;
        ne8 ne8Var = new ne8(ny8Var5, ny8Var6);
        this.q = new AtomicReference(null);
        tre.m0(new fz6(new q8e(ne8Var.a), new el6(this, (lq4) null, 12), 3), iteVar);
        tre.m0(new fz6(new fz6(sibVar.b, new dk3(2, null, 4)), new qy3(this, null, 28), 3), iteVar);
    }

    public static final Object j(bf8 bf8Var, ge8 ge8Var, vk4 vk4Var) {
        Object objC = bf8Var.b.c(ge8.a(ge8Var, System.currentTimeMillis(), 0L, System.currentTimeMillis(), 0, 27647), vk4Var);
        return objC == hu4.a ? objC : sbi.a;
    }

    @Override // defpackage.ye8
    public final Object a(ge8 ge8Var, lq4 lq4Var) {
        je9 je9Var = je9.d;
        if (!(ge8Var.j instanceof ee8) && ge8Var.u()) {
            boolean zF = f(ge8Var);
            String str = this.o;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("Informer splash try show, timeCondition:", zF), null);
            }
            return Boolean.valueOf(zF);
        }
        String str2 = this.o;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Unsupported informer type '" + ge8Var.j + "', banner: " + (!ge8Var.u()), null);
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.ye8
    public final Drawable b(RLottieDrawable rLottieDrawable, boolean z, boolean z2) {
        return new gph(rLottieDrawable, Integer.valueOf(R.attr.icon_themed), this.n, 80, 41);
    }

    @Override // defpackage.ye8
    public final int d() {
        return 36;
    }

    @Override // defpackage.ye8
    public final Object g(qy3 qy3Var) {
        Object value = this.i.a.getValue();
        gf8 gf8Var = value instanceof gf8 ? (gf8) value : null;
        int i = gf8Var != null ? gf8Var.j : 0;
        sbi sbiVar = sbi.a;
        if (i == 1) {
            gm0.n(this.o, "We don't need process close informer if we in download state");
            return sbiVar;
        }
        Object objH = ye8.h(this, qy3Var);
        return objH == hu4.a ? objH : sbiVar;
    }

    public final ef8 k() {
        return (ef8) ((e5d) this.f.getValue()).P5.a(e5d.S6[355]).i();
    }
}
