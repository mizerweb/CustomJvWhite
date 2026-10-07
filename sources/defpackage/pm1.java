package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements ComponentCallbacks {
    public final /* synthetic */ ufe a;
    public final /* synthetic */ ym1 b;
    public final /* synthetic */ MainActivity c;

    public pm1(ufe ufeVar, ym1 ym1Var, MainActivity mainActivity) {
        this.a = ufeVar;
        this.b = ym1Var;
        this.c = mainActivity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        ufe ufeVar = this.a;
        if (i == ufeVar.a || i == 0) {
            return;
        }
        ufeVar.a = i;
        ym1 ym1Var = this.b;
        if (ym1Var.g()) {
            ((bn1) ym1Var.k.getValue()).f(f55.o(this.c));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
