package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q7j {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
