package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tba implements ComponentCallbacks2 {
    public final String a = tba.class.getName();
    public final ny8 b;
    public final ny8 c;

    public tba(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        int i2;
        String strK;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (i == 5) {
                    strK = "TRIM_MEMORY_RUNNING_MODERATE";
                } else if (i == 10) {
                    strK = "TRIM_MEMORY_RUNNING_LOW";
                } else if (i == 15) {
                    strK = "TRIM_MEMORY_RUNNING_CRITICAL";
                } else if (i == 20) {
                    strK = "TRIM_MEMORY_UI_HIDDEN";
                } else if (i == 40) {
                    strK = "TRIM_MEMORY_BACKGROUND";
                } else if (i != 60) {
                    strK = i != 80 ? c0a.k(i, "UNKNOWN_TRIM_MEMORY_LEVEL(", ")") : "TRIM_MEMORY_COMPLETE";
                } else {
                    strK = "TRIM_MEMORY_MODERATE";
                }
                a4cVar.c(je9Var, str, nbh.r(((List) this.b.getValue()).size(), "onTrimMemory, currentLevel->", strK, ", trimListeners->"), null);
            }
        }
        ((lba) this.c.getValue()).d(oba.TRIM, i);
        for (rba rbaVar : (List) this.b.getValue()) {
            if (i == 20) {
                i2 = 1;
            } else if (i == 40) {
                i2 = 2;
            } else {
                i2 = i >= 40 ? 4 : 3;
            }
            rbaVar.a(i2);
        }
    }
}
