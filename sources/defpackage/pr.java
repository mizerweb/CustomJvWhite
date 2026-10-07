package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pr {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, vr vrVar) {
        Objects.requireNonNull(vrVar);
        or orVar = new or(0, vrVar);
        ve.h(obj).registerOnBackInvokedCallback(1000000, orVar);
        return orVar;
    }

    public static void c(Object obj, Object obj2) {
        ve.h(obj).unregisterOnBackInvokedCallback(ve.e(obj2));
    }
}
