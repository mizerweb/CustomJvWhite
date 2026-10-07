package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ojd {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final uj7 d;
    public final e68 e;
    public final t3a f;
    public final at5 g;
    public final boolean h;
    public final ee6 i;
    public final qg7 j;
    public final oah k;
    public final taa l;
    public final taa m;
    public final j85 n;
    public final k2d o;
    public final w4 p;
    public final int q;

    public ojd(Context context, uj7 uj7Var, e68 e68Var, t3a t3aVar, at5 at5Var, boolean z, ee6 ee6Var, qg7 qg7Var, taa taaVar, taa taaVar2, oah oahVar, j85 j85Var, k2d k2dVar, w4 w4Var) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = uj7Var;
        this.e = e68Var;
        this.f = t3aVar;
        this.g = at5Var;
        this.h = z;
        this.i = ee6Var;
        this.j = qg7Var;
        this.m = taaVar;
        this.l = taaVar2;
        this.k = oahVar;
        this.n = j85Var;
        this.o = k2dVar;
        new nhb();
        new nhb();
        this.q = np0.q;
        this.p = w4Var;
    }

    public final ane a(mjd mjdVar, boolean z, y78 y78Var) {
        return new ane(this.i.l(), this.j, mjdVar, z, y78Var);
    }
}
