package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class eo7 {
    public final Context a;
    public final String b;
    public final v2a c;
    public final eo d;
    public final jp e;
    public final Looper f;
    public final int g;
    public final ukk h;
    public final a8g i;
    public final jo7 j;

    public eo7(Context context, v2a v2aVar, eo eoVar, do7 do7Var) {
        yab.t(context, "Null context is not permitted.");
        yab.t(v2aVar, "Api must not be null.");
        yab.t(do7Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        yab.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = v2aVar;
        this.d = eoVar;
        this.f = do7Var.b;
        this.e = new jp(v2aVar, eoVar, attributionTag);
        this.h = new ukk(this);
        jo7 jo7VarE = jo7.e(applicationContext);
        this.j = jo7VarE;
        this.g = jo7VarE.h.getAndIncrement();
        this.i = do7Var.a;
        bmk bmkVar = jo7VarE.m;
        bmkVar.sendMessage(bmkVar.obtainMessage(7, this));
    }

    public final ki3 a() {
        ki3 ki3Var = new ki3();
        Set set = Collections.EMPTY_SET;
        if (((pw) ki3Var.b) == null) {
            ki3Var.b = new pw(0);
        }
        ((pw) ki3Var.b).addAll(set);
        Context context = this.a;
        ki3Var.c = context.getClass().getName();
        ki3Var.a = context.getPackageName();
        return ki3Var;
    }

    public final kam b(int i, njh njhVar) {
        zkk zkkVarA;
        qjh qjhVar = new qjh();
        jo7 jo7Var = this.j;
        jo7Var.getClass();
        bmk bmkVar = jo7Var.m;
        int i2 = njhVar.c;
        kam kamVar = qjhVar.a;
        if (i2 != 0 && (zkkVarA = zkk.a(jo7Var, i2, this.e)) != null) {
            bmkVar.getClass();
            kamVar.c(new ww0(bmkVar, 2), zkkVarA);
        }
        bmkVar.sendMessage(bmkVar.obtainMessage(4, new blk(new mlk(i, njhVar, qjhVar, this.i), jo7Var.i.get(), this)));
        return kamVar;
    }

    public eo7(Context context, v2a v2aVar, GoogleSignInOptions googleSignInOptions, a8g a8gVar) {
        this(context, v2aVar, googleSignInOptions, new do7(a8gVar, Looper.getMainLooper()));
    }
}
