package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pvk {
    public static final long a(g58 g58Var) {
        try {
            return u1m.b(g58Var.b).length();
        } catch (Throwable th) {
            gm0.l(g58Var.getClass().getName(), "Не смогли извлечь размер из файла", th);
            return ((long) (g58Var.c * g58Var.d)) * 3;
        }
    }

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
