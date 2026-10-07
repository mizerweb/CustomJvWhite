package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class g21 {
    public mvh a;
    public boolean b;

    public static void a(g21 g21Var) {
        g21Var.b = false;
        mvh mvhVar = g21Var.a;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        g21Var.a = null;
    }

    public static void b(g21 g21Var, txb txbVar, int i, ynh ynhVar, int i2, int i3) {
        int i4;
        va vaVar = new va(22);
        g21Var.getClass();
        View viewFindViewById = txbVar.findViewById(i);
        if (viewFindViewById == null) {
            return;
        }
        Context context = txbVar.getContext();
        int i5 = uw8.a;
        int iA = (!uw8.b(uw8.c) || Build.VERSION.SDK_INT < 29) ? 0 : uw8.a(context);
        int i6 = 2;
        int width = (viewFindViewById.getWidth() / 2) + yab.P(viewFindViewById);
        int width2 = (txbVar.getWidth() / 2) - width;
        boolean z = width < Math.abs(width2);
        boolean z2 = Math.abs(txbVar.getWidth() - width) < Math.abs(width2);
        int height = txbVar.getHeight() + iA;
        int i7 = 8388611;
        if (z) {
            width -= i2;
            i4 = 1;
        } else if (z2) {
            width = (wk8.D(viewFindViewById.getContext()) - width) - i3;
            i7 = 8388613;
            i4 = 3;
        } else {
            i4 = 2;
        }
        Point point = new Point(width, height);
        int i8 = i7 | 80;
        g21Var.b = true;
        mvh mvhVar = g21Var.a;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        g21Var.a = null;
        mvh mvhVar2 = new mvh(context, viewFindViewById, new ca0(context, i6), null, 0, i4, true, 56);
        mvhVar2.c(ynhVar);
        mvhVar2.e(point, i8, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        mvhVar2.setOnDismissListener(new f21(g21Var, 0, vaVar));
        g21Var.a = mvhVar2;
    }
}
