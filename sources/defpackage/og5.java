package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class og5 extends gr4 {
    public static final /* synthetic */ int g = 0;
    public final long d = 1000;
    public final Handler e = new Handler(Looper.getMainLooper());
    public sc2 f;

    @Override // defpackage.gr4
    public final void a() throws JSONException, IOException {
        sc2 sc2Var = this.f;
        if (sc2Var != null) {
            this.e.removeCallbacks(sc2Var);
        }
        sc2 sc2Var2 = this.f;
        if (sc2Var2 != null) {
            sc2Var2.run();
        }
        this.f = null;
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        sc2 sc2Var = this.f;
        if (sc2Var != null) {
            this.e.removeCallbacks(sc2Var);
        }
        this.f = null;
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        sc2 sc2Var = this.f;
        Handler handler = this.e;
        if (sc2Var != null) {
            handler.removeCallbacks(sc2Var);
        }
        sc2 sc2Var2 = new sc2(view, z, this, viewGroup, view2, er4Var);
        handler.postDelayed(sc2Var2, this.d);
        this.f = sc2Var2;
    }
}
