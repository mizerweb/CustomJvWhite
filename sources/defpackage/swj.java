package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class swj {
    public rwj a;

    public swj(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new qwj(xcg.h(i, interpolator, j));
        } else {
            this.a = new owj(i, interpolator, j);
        }
    }

    public static void a(View view, tu3 tu3Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(tu3Var != null ? new pwj(tu3Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = owj.e;
        View.OnApplyWindowInsetsListener nwjVar = tu3Var != null ? new nwj(view, tu3Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, nwjVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(nwjVar);
        }
    }
}
