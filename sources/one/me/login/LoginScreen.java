package one.me.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ca2;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.et3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.khb;
import defpackage.lq4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p90;
import defpackage.t3f;
import defpackage.tg9;
import defpackage.tp2;
import defpackage.ur8;
import defpackage.wg9;
import defpackage.xb9;
import defpackage.xg9;
import defpackage.xme;
import defpackage.y73;
import defpackage.yab;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LoginScreen extends Widget {
    public static final /* synthetic */ zv8[] f;
    public final j8e a;
    public final t3f b;
    public final ca2 c;
    public final xme d;
    public final ny8 e;

    static {
        dwd dwdVar = new dwd(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0);
        zfe.a.getClass();
        f = new zv8[]{dwdVar};
    }

    public LoginScreen(Bundle bundle) {
        super(bundle);
        this.a = Widget.childRouter$default(this, R.id.oneme_login_conductor, null, 2, null);
        this.b = t3f.a(super.getB(), 0, 2);
        this.c = new ca2(m35getAccountScopeuqN4xOY());
        this.d = p90.M(new tg9(this, 0));
        this.e = createViewModelLazy(wg9.class, new ei3(9, new tg9(this, 1)));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tp2 tp2Var = new tp2(getContext());
        tp2Var.setId(R.id.oneme_login_conductor);
        tp2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return tp2Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.d.b = khb.k;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ny8 ny8Var = this.e;
        wg9 wg9Var = (wg9) ny8Var.getValue();
        mjg mjgVar = wg9Var.g;
        xb9 xb9Var = (xb9) ((et3) wg9Var.d.getValue());
        int i = 3;
        lq4 lq4Var = null;
        if (((Boolean) xb9Var.f1.m(xb9Var, xb9.g1[51])).booleanValue()) {
            gm0.V(wg9.class.getName(), "Logout not fully completed", new a("Logout not fully completed"));
            mjgVar.getClass();
            mjgVar.j(null, xg9.b);
            yab.i0(wg9Var.b, null, 0, new ur8(wg9Var, lq4Var, 5), 3);
        } else {
            mjgVar.getClass();
            mjgVar.j(null, xg9.c);
        }
        e9i.j0(new fz6(n1g.v(((wg9) ny8Var.getValue()).h, getViewLifecycleOwner().f(), n09.d), new y73(null, this), i), getViewLifecycleScope());
    }
}
