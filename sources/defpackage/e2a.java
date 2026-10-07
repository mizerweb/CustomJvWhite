package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import one.me.android.media.service.OneMeMediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public final class e2a {
    public final OneMeMediaSessionService a;
    public final bg6 b;
    public final String c;
    public f2a d;
    public final Bundle e;
    public final Bundle f;
    public xx0 g;
    public final boolean h;
    public final ghe i;
    public final ghe j;
    public final ghe k;
    public final boolean l;

    public e2a(OneMeMediaSessionService oneMeMediaSessionService, bg6 bg6Var) {
        iw8 iw8Var = new iw8(1);
        this.a = oneMeMediaSessionService;
        this.b = bg6Var;
        this.c = "";
        this.d = iw8Var;
        this.e = new Bundle();
        this.f = new Bundle();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        this.i = gheVar;
        this.j = gheVar;
        this.h = true;
        this.l = true;
        this.k = gheVar;
    }

    public final k2a a() {
        Object obj = k2a.b;
        int iIntValue = ((Integer) d3a.F.get()).intValue();
        int i = Build.VERSION.SDK_INT;
        OneMeMediaSessionService oneMeMediaSessionService = this.a;
        if (i < 27) {
            iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, oneMeMediaSessionService.getResources().getDisplayMetrics()));
        }
        xx0 xx0Var = this.g;
        if (xx0Var == null) {
            s84 s84Var = new s84(oneMeMediaSessionService);
            s84Var.a = iIntValue;
            s84Var.b = true;
            this.g = new v2a(11, new w25(s84Var));
        } else {
            this.g = new mf(xx0Var, iIntValue, 9);
        }
        return new k2a(oneMeMediaSessionService, this.c, this.b, this.i, this.j, this.k, this.d, this.e, this.f, this.g, this.h, this.l);
    }
}
