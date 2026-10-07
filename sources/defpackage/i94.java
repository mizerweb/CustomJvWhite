package defpackage;

import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import androidx.work.WorkRequest;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i94 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ i94(dn5 dn5Var, cn5 cn5Var) {
        this.a = 18;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                return new vd6((ScheduledExecutorService) ((a2c) m94.i.getValue()).r.getValue(), true);
            case 1:
                return Boolean.valueOf(xvc.p);
            case 2:
                return new vd6((ScheduledExecutorService) ((a2c) m94.i.getValue()).p.getValue(), true);
            case 3:
                return new vd6((ScheduledExecutorService) ((a2c) m94.i.getValue()).q.getValue(), true);
            case 4:
                return new od6("io", 1, ((Number) m94.c.getValue()).intValue(), 10000L, true, false, 0, false, true, 96);
            case 5:
                return new od6("net", 1, 4, 60000L, true, false, 0, true, true, 64);
            case 6:
                od6 od6Var = m94.a;
                boolean z = a8g.c;
                jcj.a.getClass();
                z1c z1cVarA = jcj.a();
                xh xhVar = xh.a;
                od6 od6Var2 = z ? od6Var : (od6) m94.d.getValue();
                od6 od6Var3 = z ? m94.b : (od6) m94.e.getValue();
                if (!z) {
                    od6Var = m94.f;
                }
                od6 od6Var4 = od6Var;
                f5h f5hVar = f5h.a;
                return new a2c(z1cVarA, new j94(0), new t3a(new i94(1)), new c(16), od6Var2, od6Var3, od6Var4);
            case 7:
                return new t1c();
            case 8:
                return new k94(nhb.f, 0);
            case 9:
                ylc ylcVar = new ylc(we4.TYPE_UNKNOWN, new long[]{60000, 80000});
                ylc ylcVar2 = new ylc(we4.TYPE_MOBILE_SLOW, new long[]{60000, 80000});
                ylc ylcVar3 = new ylc(we4.TYPE_MOBILE_NORMAL, new long[]{BuildConfig.SILENCE_TIME_TO_UPLOAD, 20000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 40000, 50000, 60000, 80000});
                we4 we4Var = we4.TYPE_WIFI;
                long[] jArr = wk8.a;
                ylc[] ylcVarArr = {ylcVar, ylcVar2, ylcVar3, new ylc(we4Var, jArr), new ylc(we4.TYPE_MOBILE_FAST, jArr)};
                EnumMap enumMap = new EnumMap(we4.class);
                for (int i = 0; i < 5; i++) {
                    ylc ylcVar4 = ylcVarArr[i];
                    enumMap.put((Enum) ylcVar4.a, ylcVar4.b);
                }
                return enumMap;
            case 10:
                return Boolean.FALSE;
            case 11:
                return new UUID(0L, 0L).toString();
            case 12:
                return null;
            case 13:
                return new fw(n5h.a);
            case 14:
                if (r5h.X0("")) {
                    return null;
                }
                return "";
            case 15:
                return Resources.getSystem();
            case 16:
                return Float.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE / 160.0f);
            case 17:
                return Float.valueOf(Math.min(yl5.d().getDisplayMetrics().density, ((Number) yl5.b.getValue()).floatValue()));
            case 18:
                return s66.a;
            case 19:
                return e9i.a(1, 1, 2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return jt5.I();
            case 21:
                return new HashSet(1);
            case 22:
                return new Handler(Looper.getMainLooper());
            case 23:
                return FitFontImageSpan.sharedPaintWithAlpha_delegate$lambda$0();
            case 24:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 25:
                try {
                    String[] strArr = id7.b;
                    Method method = (Method) id7.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 26:
                return new lge("width=\"(\\d+)", 0);
            case 27:
                return new lge("height=\"(\\d+)", 0);
            case 28:
                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(hp7.a));
            default:
                return new lge("\\b(?:[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}|[0-9a-fA-F:]+:[0-9a-fA-F:]+)\\b");
        }
    }

    public /* synthetic */ i94(int i) {
        this.a = i;
    }
}
