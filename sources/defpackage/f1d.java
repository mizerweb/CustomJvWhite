package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f1d {
    public static final void a(f1d f1dVar, View view, ev1 ev1Var, RectF rectF) {
        view.setPivotX(rectF.top);
        view.setPivotY(rectF.left);
        view.setX(rectF.top);
        view.setY(rectF.left);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        o7j.f(0.0f, view);
        ev1Var.setAlpha(1.0f);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (r5h.L0(lowerCase, "huawei", false) || r5h.L0(lowerCase, "honor", false)) {
                return true;
            }
        }
        return false;
    }
}
