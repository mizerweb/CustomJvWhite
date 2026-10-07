package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mb2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb2 b;

    public /* synthetic */ mb2(nb2 nb2Var, int i) {
        this.a = i;
        this.b = nb2Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Set setX1;
        Set setX2;
        int i = this.a;
        c76 c76Var = c76.a;
        boolean z = false;
        nb2 nb2Var = this.b;
        switch (i) {
            case 0:
                String str = ((Object) ef2.b(nb2Var.a)) + "#availableCaptureRequestKeys";
                try {
                    try {
                        Trace.beginSection(str);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setX1 = ww3.X1(nb2Var.c.getAvailableCaptureRequestKeys(nb2Var.b));
                            break;
                        } else {
                            setX1 = c76Var;
                        }
                        return setX1;
                    } catch (Throwable th) {
                        Log.w("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th);
                        return c76Var;
                    }
                } finally {
                    Trace.endSection();
                }
            case 1:
                String str2 = ((Object) ef2.b(nb2Var.a)) + "#availableCaptureResultKeys";
                try {
                    try {
                        Trace.beginSection(str2);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setX2 = ww3.X1(nb2Var.c.getAvailableCaptureResultKeys(nb2Var.b));
                            break;
                        } else {
                            setX2 = c76Var;
                        }
                        return setX2;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to get " + str2 + "! Caching {} and ignoring exception.", th2);
                    return c76Var;
                }
            case 2:
                String str3 = ((Object) ef2.b(nb2Var.a)) + "#isPostviewSupported";
                try {
                    try {
                        Trace.beginSection(str3);
                        boolean zIsPostviewAvailable = Build.VERSION.SDK_INT >= 34 ? nb2Var.c.isPostviewAvailable(nb2Var.b) : false;
                        Trace.endSection();
                        z = zIsPostviewAvailable;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                    break;
                } catch (Throwable th4) {
                    Log.w("CXCP", "Failed to get " + str3 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z);
            default:
                String str4 = ((Object) ef2.b(nb2Var.a)) + "#isCaptureProgressSupported";
                try {
                    try {
                        Trace.beginSection(str4);
                        boolean zIsCaptureProcessProgressAvailable = Build.VERSION.SDK_INT >= 34 ? nb2Var.c.isCaptureProcessProgressAvailable(nb2Var.b) : false;
                        Trace.endSection();
                        z = zIsCaptureProcessProgressAvailable;
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                    break;
                } catch (Throwable th6) {
                    Log.w("CXCP", "Failed to get " + str4 + "! Caching false and ignoring exception.", th6);
                }
                return Boolean.valueOf(z);
        }
    }
}
