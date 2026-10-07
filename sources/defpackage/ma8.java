package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.ReviewException;
import java.util.HashMap;
import java.util.Locale;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class ma8 {
    public MainActivity a;
    public cmf b;
    public wpe c;
    public c7k d;

    public static void c(ww8 ww8Var) {
        ww8Var.invoke();
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public final void b(MainActivity mainActivity, c7k c7kVar) {
        kam kamVarD;
        this.a = mainActivity;
        this.d = c7kVar;
        Context applicationContext = mainActivity.getApplicationContext();
        if (applicationContext != null) {
            mainActivity = applicationContext;
        }
        cmf cmfVar = new cmf(new gfl(mainActivity));
        this.b = cmfVar;
        gfl gflVar = (gfl) cmfVar.b;
        String str = gflVar.b;
        qd2 qd2Var = gfl.c;
        qd2Var.a("requestInAppReview (%s)", str);
        t6m t6mVar = gflVar.a;
        int i = 0;
        if (t6mVar == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", qd2.c(qd2Var.a, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = imk.a;
            kamVarD = gwl.d(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : nbh.v((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) imk.b.get(-1), ")")), null, null)));
        } else {
            qjh qjhVar = new qjh();
            t6mVar.a().post(new bsl(t6mVar, qjhVar, qjhVar, new f5l(gflVar, qjhVar, qjhVar)));
            kamVarD = qjhVar.a;
        }
        if (kamVarD != null) {
            kamVarD.b(new la8(this, i));
        }
    }

    public final void d(g3 g3Var) {
        g3Var.invoke(new mp5(24, this));
    }
}
