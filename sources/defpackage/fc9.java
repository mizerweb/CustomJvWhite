package defpackage;

import android.app.LocaleManager;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class fc9 {
    public final String a = fc9.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public volatile boolean i;
    public final ny8 j;

    public fc9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.j = rx8.P(3, new fu(ny8Var, 5));
    }

    public final void a(String str) {
        LocaleManager localeManagerA;
        LocaleList applicationLocales;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 33 && (localeManagerA = q4.a(this.j.getValue())) != null && (applicationLocales = localeManagerA.getApplicationLocales()) != null && !applicationLocales.isEmpty()) {
            z = true;
        }
        ((pc9) this.g.getValue()).a(z ? 2 : 1, str);
    }
}
