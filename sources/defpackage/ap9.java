package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.http.X509TrustManagerExtensions;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ap9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new X509TrustManagerExtensions((X509TrustManager) ((cp9) obj).b.getValue());
            case 1:
                Object systemService = ((lba) obj).a.getSystemService((Class<Object>) ActivityManager.class);
                if (systemService != null) {
                    return (ActivityManager) systemService;
                }
                ore.p("Required value was null.");
                return null;
            case 2:
                Boolean bool = (Boolean) ((ei3) obj).invoke();
                bool.getClass();
                return bool;
            case 3:
                return ((pza) obj).getClass().getName();
            case 4:
                sza szaVar = (sza) obj;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(szaVar.getBounds().width() * 2.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(10000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(szaVar);
                return valueAnimatorOfFloat;
            case 5:
                wcb wcbVar = (wcb) obj;
                ((wd4) wcbVar.c.getValue()).f(wcbVar.f);
                return sbiVar;
            case 6:
                return new umb(((g5c) obj).a);
            case 7:
                return Integer.valueOf(pq3.j.h((bvb) obj).h().a);
            case 8:
                return cyb.a((cyb) obj);
            case 9:
                return Collections.singletonList((String) ((jzb) obj).b.getValue());
            case 10:
                return (NotificationManager) ((e1c) obj).a.getSystemService("notification");
            case 11:
                return (Path) ((m2c) obj).a.invoke();
            case 12:
                return (Path) ((v5) obj).invoke();
            case 13:
                GradientDrawable gradientDrawable = new GradientDrawable();
                bac bacVar = ((aac) obj).r1;
                float f = bacVar.a;
                gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setShape(0);
                gradientDrawable.setSize(0, bacVar.b);
                return gradientDrawable;
            case 14:
                return new ncc((rcc) obj);
            case 15:
                boc bocVar = (boc) obj;
                return bocVar.a.a(bocVar.b);
            case 16:
                ((exb) obj).getClass();
                ghb ghbVar = ew5.b;
                return Long.valueOf(ew5.g(qe7.P(SystemClock.elapsedRealtime(), lw5.MILLISECONDS)));
            case 17:
                return p90.a(((usc) obj).f());
            case 18:
                return new usc((String[]) obj);
            case 19:
                return ((Context) ((fbc) obj).b).getSharedPreferences("permissions_prefs", 0);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((vfd) obj).a.getSharedPreferences("presences.pref", 0);
            case 21:
                uje ujeVar = (uje) obj;
                ujeVar.f++;
                ujeVar.b.Q(new sje(ujeVar, 0));
                ujeVar.b();
                return sbiVar;
            case 22:
                return ((Callable) obj).call();
            case 23:
                dxe dxeVar = (dxe) obj;
                p41 p41VarB = yab.b(1, 2, null, 4);
                yab.i0((gu4) dxeVar.k.getValue(), null, 0, new cxe(p41VarB, dxeVar, null), 3);
                return p41VarB;
            case 24:
                return new ha9(((t3f) obj).b);
            case 25:
                return Integer.valueOf(((s7f) obj).d.getInt("request_id", 10));
            case 26:
                return obj;
            case 27:
                hif hifVar = (hif) obj;
                return Integer.valueOf(vhl.b(hifVar, hifVar.k));
            case 28:
                return ((bw8) ((ArrayList) obj).get(0)).c();
            default:
                return new qd6((ScheduledExecutorService) ((rjf) obj).a.getValue());
        }
    }
}
