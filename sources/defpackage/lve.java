package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lve {
    public final br4 a;
    public String b;
    public gr4 c;
    public gr4 d;
    public boolean e;
    public int f;

    public lve(br4 br4Var, String str, gr4 gr4Var, gr4 gr4Var2, boolean z, int i) {
        this.a = br4Var;
        this.b = str;
        this.c = gr4Var;
        this.d = gr4Var2;
        this.e = z;
        this.f = i;
    }

    public final void a(gr4 gr4Var) {
        if (this.e) {
            ore.q(lve.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        } else {
            this.d = gr4Var;
        }
    }

    public final gr4 b() {
        gr4 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(gr4 gr4Var) {
        if (this.e) {
            ore.q(lve.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        } else {
            this.c = gr4Var;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBundle("RouterTransaction.controller.bundle", this.a.saveInstanceState());
        gr4 gr4Var = this.c;
        if (gr4Var != null) {
            bundle.putBundle("RouterTransaction.pushControllerChangeHandler", gr4Var.j());
        }
        gr4 gr4Var2 = this.d;
        if (gr4Var2 != null) {
            bundle.putBundle("RouterTransaction.popControllerChangeHandler", gr4Var2.j());
        }
        bundle.putString("RouterTransaction.tag", this.b);
        bundle.putInt("RouterTransaction.transactionIndex", this.f);
        bundle.putBoolean("RouterTransaction.attachedToRouter", this.e);
        return bundle;
    }

    public final void e(String str) {
        if (this.e) {
            ore.q(lve.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        } else {
            this.b = str;
        }
    }
}
