package defpackage;

import android.graphics.Paint;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes.dex */
public final class jw6 {
    public static final /* synthetic */ zv8[] a;

    static {
        dwd dwdVar = new dwd(jw6.class, "sharedPaintWithAlpha", "getSharedPaintWithAlpha()Landroid/graphics/Paint;", 0);
        zfe.a.getClass();
        a = new zv8[]{dwdVar};
    }

    public static final Paint a(jw6 jw6Var) {
        jw6Var.getClass();
        return (Paint) FitFontImageSpan.sharedPaintWithAlpha$delegate.m(jw6Var, a[0]);
    }
}
