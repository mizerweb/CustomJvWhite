package defpackage;

import android.os.Bundle;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class qhk {
    public final g4k a;
    public final mgk b;
    public final AnalyticsSender c;
    public final gu4 d;
    public final g7k e;
    public final Logger f;

    public qhk(g4k g4kVar, mgk mgkVar, AnalyticsSender analyticsSender, dq4 dq4Var, g7k g7kVar, Logger logger) {
        this.a = g4kVar;
        this.b = mgkVar;
        this.c = analyticsSender;
        this.d = dq4Var;
        this.e = g7kVar;
        this.f = logger.createLogger(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(qhk qhkVar, Bundle bundle, String str, nq4 nq4Var) {
        ygk ygkVar;
        qhk qhkVar2;
        NotificationAnalyticsPayload notificationAnalyticsPayload;
        String str2;
        qhkVar.getClass();
        if (nq4Var instanceof ygk) {
            ygkVar = (ygk) nq4Var;
            int i = ygkVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ygkVar.i = i - Integer.MIN_VALUE;
            } else {
                ygkVar = new ygk(qhkVar, nq4Var);
            }
        } else {
            ygkVar = new ygk(qhkVar, nq4Var);
        }
        Object objK0 = ygkVar.g;
        int i2 = ygkVar.i;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            ygkVar.d = qhkVar;
            ygkVar.e = str;
            ygkVar.i = 1;
            ao5 ao5Var = ao5.a;
            objK0 = yab.K0(rk9.a, new e4k(bundle, lq4Var, 0), ygkVar);
            if (objK0 != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            str = ygkVar.e;
            qhkVar = ygkVar.d;
            ch3.d0(objK0);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            notificationAnalyticsPayload = ygkVar.f;
            str2 = ygkVar.e;
            qhkVar2 = ygkVar.d;
            ch3.d0(objK0);
        }
        String str3 = (String) objK0;
        qhkVar2.c.send(notificationAnalyticsPayload != null ? new b4k(null, null, str2) : new b4k(null, null, str2));
        return sbi.a;
        NotificationAnalyticsPayload notificationAnalyticsPayload2 = (NotificationAnalyticsPayload) objK0;
        g7k g7kVar = qhkVar.e;
        ygkVar.d = qhkVar;
        ygkVar.e = str;
        ygkVar.f = notificationAnalyticsPayload2;
        ygkVar.i = 2;
        objK0 = g7kVar.a(ygkVar);
        if (objK0 != hu4Var) {
            String str4 = str;
            qhkVar2 = qhkVar;
            notificationAnalyticsPayload = notificationAnalyticsPayload2;
            str2 = str4;
            String str5 = (String) objK0;
            qhkVar2.c.send(notificationAnalyticsPayload != null ? new b4k(null, null, str2) : new b4k(null, null, str2));
            return sbi.a;
        }
        return hu4Var;
    }
}
