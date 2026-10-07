package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w5c extends s1d {
    public final String E;

    public w5c(Resources resources, ag5 ag5Var, ot5 ot5Var, Executor executor, taa taaVar, b50 b50Var) {
        super(resources, ag5Var, ot5Var, executor, taaVar, b50Var);
        this.E = w5c.class.getName();
    }

    @Override // defpackage.s1d, defpackage.u0
    /* JADX INFO: renamed from: s */
    public final Drawable b(au3 au3Var) {
        Drawable drawableB = super.b(au3Var);
        au3 au3VarY = au3Var.y();
        return au3VarY == null ? drawableB : new yfe(drawableB, au3VarY);
    }

    @Override // defpackage.s1d, defpackage.u0
    /* JADX INFO: renamed from: u */
    public final l68 d(au3 au3Var) {
        if (au3Var != null) {
            try {
                if (au3Var.P()) {
                    return ((xt3) au3Var.K()).getImageInfo();
                }
            } catch (IllegalStateException unused) {
                gm0.Y(this.E, "IllegalStateException in getImageInfo");
            }
        }
        return null;
    }
}
