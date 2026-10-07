package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class huk {
    public static bpa a(dq4 dq4Var, t51 t51Var, long j, mg5 mg5Var) {
        return new bpa(dq4Var, t51Var, j, mg5Var, 0L);
    }

    public static boolean b(zr zrVar, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && i7j.f(zrVar) != null) {
            Context context = zrVar.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + zrVar);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return hs.a(dragEvent, zrVar, activity);
            }
        }
        return false;
    }

    public static boolean c(zr zrVar, int i) {
        xo4 xo4Var;
        wo4 wo4Var;
        ft0 ft0Var;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 31 || i7j.f(zrVar) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) zrVar.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                ft0Var = new ft0(primaryClip, 1);
            } else {
                xo4Var = new xo4();
                xo4Var.b = primaryClip;
                xo4Var.c = 1;
            }
            if (i != 16908322) {
                wo4Var = xo4Var;
                wo4Var = ft0Var;
                i3 = 1;
            }
            wo4Var = xo4Var;
            wo4Var = ft0Var;
            wo4Var.setFlags(i3);
            i7j.h(zrVar, wo4Var.build());
        }
        return true;
    }
}
