package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class owj extends rwj {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final kl6 f = new kl6();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, swj swjVar) {
        tu3 tu3VarI = i(view);
        if (tu3VarI != null) {
            tu3VarI.e(swjVar);
            if (tu3VarI.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), swjVar);
            }
        }
    }

    public static void f(View view, swj swjVar, ixj ixjVar, boolean z) {
        tu3 tu3VarI = i(view);
        if (tu3VarI != null) {
            tu3VarI.b = ixjVar;
            if (!z) {
                tu3VarI.f(swjVar);
                z = tu3VarI.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), swjVar, ixjVar, z);
            }
        }
    }

    public static void g(View view, ixj ixjVar, List list) {
        tu3 tu3VarI = i(view);
        if (tu3VarI != null) {
            ixjVar = tu3VarI.g(ixjVar, list);
            if (tu3VarI.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ixjVar, list);
            }
        }
    }

    public static void h(View view, swj swjVar, wze wzeVar) {
        tu3 tu3VarI = i(view);
        if (tu3VarI != null) {
            tu3VarI.h(swjVar, wzeVar);
            if (tu3VarI.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), swjVar, wzeVar);
            }
        }
    }

    public static tu3 i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof nwj) {
            return ((nwj) tag).a;
        }
        return null;
    }
}
