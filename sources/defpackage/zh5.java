package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zh5 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final ThreadLocal b = new ThreadLocal();

    public static void a(rw3 rw3Var, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != rw3Var) {
            View view2 = (View) parent;
            a(rw3Var, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
