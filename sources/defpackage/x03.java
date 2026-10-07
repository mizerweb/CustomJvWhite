package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class x03 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x03(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ix3 ix3Var;
        switch (this.a) {
            case 0:
                e13 e13Var = (e13) this.b;
                e13Var.G.i(-1);
                e13Var.I.i(-1);
                e13Var.A.a();
                break;
            default:
                int i = configuration.uiMode & 48;
                if (i != 16) {
                    ix3Var = i != 32 ? ix3.c : ix3.b;
                } else {
                    ix3Var = ix3.a;
                }
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "SystemThemeObserver", "onConfigurationChanged scheme=" + ix3Var + ", uiMode=0x" + Integer.toHexString(configuration.uiMode & 48), null);
                    }
                }
                mjg mjgVar = (mjg) ((fbc) this.b).b;
                mjgVar.getClass();
                mjgVar.j(null, ix3Var);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                e13 e13Var = (e13) this.b;
                e13Var.G.i(-1);
                e13Var.I.i(-1);
                break;
        }
    }
}
