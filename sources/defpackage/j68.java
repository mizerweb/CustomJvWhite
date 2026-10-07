package defpackage;

import android.graphics.Matrix;
import android.graphics.drawable.ShapeDrawable;
import android.system.Os;
import android.system.OsConstants;
import android.view.animation.PathInterpolator;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.main.MainScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.UploadService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j68 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ j68(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() throws NoSuchAlgorithmException, KeyStoreException {
        Object poeVar;
        switch (this.a) {
            case 0:
                return new k68();
            case 1:
                zv8[] zv8VarArr = InputPhoneScreen.v;
                return y3f.AUTH_PHONE_LOGIN;
            case 2:
                return sbi.a;
            case 3:
                return sbi.a;
            case 4:
                return new dn8();
            case 5:
                return new keh(new keh.a(Integer.valueOf(R.attr.background_overlay)));
            case 6:
                return new keh(new keh.a(Integer.valueOf(R.attr.background_overlay)));
            case 7:
                a8g a8gVar = MainScreen.u;
                return new km3();
            case 8:
                a8g a8gVar2 = MainScreen.u;
                return new g21();
            case 9:
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(hp7.a());
                return (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
            case 10:
                return new fw(kq9.a);
            case 11:
                return Long.valueOf(Os.sysconf(OsConstants._SC_PAGESIZE));
            case 12:
                return new mj9(100);
            case 13:
                return new lge("[^0-9+]");
            case 14:
                r7 r7Var = r7.a;
                return new qzb(r7.d(ha9.b));
            case 15:
                return new Matrix();
            case 16:
                return qyj.r("M19.5 8.1 C14.5222 8.1 10.2545 5.0684 8.4375 0.7514 C8.2752 0.3657 7.9058 0.1001 7.4874 0.1001 C6.9421 0.1001 6.5 0.5422 6.5 1.0875 L6.5 1.6997 C6.5 3.9399 6.5004 5.0609 6.0645 5.9165 C5.681 6.669 5.0689 7.2811 4.3164 7.6646 C3.5134 8.0737 2.4762 8.0981 0.5 8.0996 L19.5 8.1 Z");
            case 17:
                return qyj.r("M0 8.0892 C0 8.0833 0.0048 8.0785 0.0107 8.0784 C1.8614 8.0369 3.0539 7.9081 4.0615 7.4907 C6.0216 6.6788 7.5787 5.1217 8.3906 3.1616 C8.6306 2.5824 8.7761 1.942 8.8644 1.1506 C8.9298 0.5638 9.4095 0.1001 10 0.1001 C10.5905 0.1001 11.0702 0.5638 11.1356 1.1506 C11.2239 1.942 11.3694 2.5824 11.6094 3.1616 C12.4213 5.1217 13.9784 6.6788 15.9385 7.4907 C16.9461 7.9081 18.1386 8.0369 19.9893 8.0784 C19.9952 8.0785 20 8.0833 20 8.0892 C20 8.0952 19.9951 8.1001 19.9891 8.1001 H0.0109 C0.0049 8.1001 0 8.0952 0 8.0892 Z");
            case 18:
                return new PathInterpolator(0.45f, 0.28f, 0.68f, 1.0f);
            case 19:
                return new PathInterpolator(0.4f, 0.0f, 0.59f, 0.86f);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new PathInterpolator(0.26f, -0.43f, 0.58f, 1.12f);
            case 21:
                return new PathInterpolator(0.76f, 0.0f, 0.24f, 1.0f);
            case 22:
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            case 23:
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            case 24:
                int i = OneMeApplication.g;
                qzb qzbVar = (qzb) yab.A0(k66.a, new i07(2, null, 1));
                umi umiVar = (umi) qzbVar.getAccessor().c(77);
                ek5 ek5Var = (ek5) qzbVar.getAccessor().c(76);
                ExecutorService executorServiceF = a2c.f(ConcurrentComponent.INSTANCE.getExecutors(), UploadService.SCHEME, 2, 2, true, true, 0, 96);
                r7 r7Var2 = r7.a;
                xb9 xb9Var = new ca2(r7.d(ha9.b)).f().a;
                xt4 xt4VarB = ((n0c) ((xhh) m94.l.getValue())).b();
                s4j s4jVar = (s4j) qzbVar.getAccessor().c(203);
                qzbVar.b().getClass();
                gvb gvbVar = new gvb();
                gvbVar.b = xb9Var;
                gvbVar.c = xt4VarB;
                gvbVar.d = s4jVar;
                gvbVar.a = gvb.class.getName();
                xe4 xe4Var = new xe4();
                pgg pggVar = new pgg();
                pggVar.a = new glh();
                if (((i18) xe4Var.e) != null) {
                    ore.k("API client engine is already set");
                    throw null;
                }
                xe4Var.c = pggVar;
                fvb fvbVar = new Provider() { // from class: fvb
                    public /* synthetic */ fvb() {
                    }

                    @Override // javax.inject.Provider
                    public final Object get() throws Throwable {
                        gvb gvbVar2 = gvbVar;
                        s7f s7fVar = (s7f) ((et3) gvbVar2.b);
                        long jF = s7fVar.f();
                        long jP = s7fVar.p();
                        String strO = s7fVar.o();
                        if (strO == null || r5h.X0(strO) || jF >= jP) {
                            yab.A0((vt4) gvbVar2.c, new awa(gvbVar2, (lq4) null, 9));
                        }
                        return s7fVar.o();
                    }
                };
                if (((wp) xe4Var.f) != null) {
                    ore.k("Overriding session provider previously set via setApiSessionProvider");
                    throw null;
                }
                xe4Var.g = fvbVar;
                String string = umiVar.a().toString();
                i18 i18Var = (i18) xe4Var.d;
                if (i18Var == null && ((i18) xe4Var.e) != null) {
                    ore.k("Cannot change user agent of unknown ApiClientEngine");
                    throw null;
                }
                if (i18Var == null && ((i18) xe4Var.e) != null) {
                    ore.k("Cannot make changes on unknown ApiClientEngine");
                    throw null;
                }
                xe4Var.a();
                ((i18) xe4Var.d).c = string;
                xe4Var.a = ek5Var.a();
                so soVar = new so(xe4Var);
                synchronized (lvb.class) {
                    lvb.t0(soVar);
                }
                boolean z = nec.a;
                jvb.b = "one.me";
                jvb.c = "ok.mobile.apps.video";
                jvb.d = executorServiceF;
                return sbi.a;
            case 25:
                int i2 = OneMeApplication.g;
                r7 r7Var3 = r7.a;
                return new qzb(r7.d(ha9.b));
            case 26:
                return new owb("", "", 2, nwb.l, null, 64);
            case 27:
                try {
                    poeVar = j51.valueOf("google".toUpperCase(Locale.ROOT));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object obj = j51.a;
                if (poeVar instanceof poe) {
                    poeVar = obj;
                }
                return (j51) poeVar;
            case 28:
                return new qfg(2.2d);
            default:
                return new ShapeDrawable();
        }
    }

    public /* synthetic */ j68(jl8 jl8Var, int i) {
        this.a = i;
    }
}
