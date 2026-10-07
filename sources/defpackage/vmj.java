package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.WeakHashMap;
import one.me.webapp.rootscreen.FailedToGetWebViewProfileFeatureException;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vmj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ vmj(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object poeVar;
        kuj kujVar;
        switch (this.a) {
            case 0:
                WebAppRootScreen webAppRootScreen = this.b;
                zv8[] zv8VarArr = WebAppRootScreen.G;
                opl.b(webAppRootScreen, 1).f((View) obj).l(Collections.singletonList(new rp4(1, new tnh(R.string.web_app_root_dots_menu_refresh), Integer.valueOf(R.drawable.icon_redo), (Integer) null, 20))).build().u(webAppRootScreen);
                return sbi.a;
            case 1:
                WebAppRootScreen webAppRootScreen2 = this.b;
                zv8[] zv8VarArr2 = WebAppRootScreen.G;
                js8 js8Var = webAppRootScreen2.J1().G;
                yab.i0((gu4) js8Var.a, null, 0, new ur8(js8Var, null, 1), 3);
                return sbi.a;
            case 2:
                WebAppRootScreen webAppRootScreen3 = this.b;
                zv8[] zv8VarArr3 = WebAppRootScreen.G;
                ioj iojVarJ1 = webAppRootScreen3.J1();
                iojVarJ1.getClass();
                a8j.t(iojVarJ1, null, new boj(iojVarJ1, null, 1), 3);
                return sbi.a;
            default:
                WebAppRootScreen webAppRootScreen4 = this.b;
                LinearLayout linearLayout = (LinearLayout) obj;
                zv8[] zv8VarArr4 = WebAppRootScreen.G;
                rcc rccVar = new rcc(linearLayout.getContext());
                rccVar.setId(R.id.webapp_root_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setRightActions(new ccc(1, new vmj(webAppRootScreen4, 0)));
                n1g.N(new gnd(3, null, 2), rccVar);
                if (!webAppRootScreen4.L1()) {
                    rccVar.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
                }
                rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.addView(rccVar);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(R.id.webapp_root_content_container);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                n1g.N(new qb3(3, null, 15), frameLayout);
                Context context = frameLayout.getContext();
                boolean zBooleanValue = ((Boolean) webAppRootScreen4.H1().t().i()).booleanValue();
                je9 je9Var = je9.d;
                int i = q6f.e;
                q6f q6fVar = zBooleanValue ? (q6f) kc9.i(context, new bzb(context, 29)) : new q6f(context, null, 0);
                q6fVar.setId(R.id.webapp_root_webview);
                q6fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                try {
                    poeVar = Boolean.valueOf(l51.b("MULTI_PROFILE"));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.X(webAppRootScreen4.p, new FailedToGetWebViewProfileFeatureException(thA), "Failed to check MULTI_PROFILE", new Object[0]);
                }
                Boolean bool = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = bool;
                }
                if (((Boolean) poeVar).booleanValue()) {
                    ha9 ha9VarB = webAppRootScreen4.getB().b();
                    String str = webAppRootScreen4.p;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.i("Setup profile for ", ha9VarB), null);
                    }
                    if (!cqk.d(ha9VarB, ha9.b)) {
                        String strA = ha9VarB.a("wv_webapp_profile", null);
                        WeakHashMap weakHashMap = ytj.a;
                        if (!fuj.b.b()) {
                            c.i("This method is not supported by the current version of the framework and the current WebView APK");
                            return null;
                        }
                        if (fuj.c.b()) {
                            WeakHashMap weakHashMap2 = ytj.a;
                            kujVar = (kuj) weakHashMap2.get(q6fVar);
                            if (kujVar == null) {
                                kujVar = new kuj(guj.a.b(q6fVar));
                                weakHashMap2.put(q6fVar, kujVar);
                            }
                        } else {
                            kujVar = new kuj(guj.a.b(q6fVar));
                        }
                        kujVar.a.setProfile(strA);
                    }
                } else {
                    gm0.Y(webAppRootScreen4.p, "Profile feature not supported");
                }
                q6fVar.setOnTouchListener(new zw1(7, webAppRootScreen4));
                q6fVar.getSettings().setJavaScriptEnabled(true);
                q6fVar.getSettings().setDomStorageEnabled(true);
                q6fVar.getSettings().setSupportMultipleWindows(true);
                q6fVar.getSettings().setAllowFileAccess(false);
                ((wxb) webAppRootScreen4.y.getValue()).getClass();
                WebView.setWebContentsDebuggingEnabled(false);
                String str2 = webAppRootScreen4.p;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, c0a.n(webAppRootScreen4.H1().D().i(), "initWebView: "), null);
                }
                if (((Boolean) webAppRootScreen4.H1().D().i()).booleanValue()) {
                    Bundle bundle = webAppRootScreen4.D;
                    if (bundle != null) {
                        q6fVar.restoreState(bundle);
                    }
                } else {
                    webAppRootScreen4.setRetainViewMode(xq4.b);
                }
                zmj zmjVar = webAppRootScreen4.q;
                if (zmjVar != null) {
                    q6fVar.postVisualStateCallback(99991L, zmjVar);
                }
                q6fVar.setWebViewClient(new adc(webAppRootScreen4.l.getAccessor().d(5), new xtj(webAppRootScreen4.J1(), new e71(context), webAppRootScreen4.m, 0)));
                q6fVar.setWebChromeClient(new wcc(new eth(webAppRootScreen4.J1()), new juj(webAppRootScreen4.m), ((Boolean) webAppRootScreen4.H1().t().i()).booleanValue()));
                q6fVar.addJavascriptInterface(new huj(webAppRootScreen4.J1()), "WebViewHandler");
                q6fVar.addJavascriptInterface(new gmj(webAppRootScreen4.m), "AndroidPerf");
                if (webAppRootScreen4.J1().Y) {
                    q6fVar.addJavascriptInterface(new fid(webAppRootScreen4.J1()), "PrivateWebViewHandler");
                }
                r6c r6cVar = new r6c(frameLayout.getContext());
                r6cVar.setId(R.id.webapp_root_progressbar);
                r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                r6cVar.setAppearance(g6c.a);
                r1c r1cVar = new r1c(frameLayout.getContext());
                r1cVar.setId(R.id.webapp_root_error_container);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
                layoutParams.setMarginEnd(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
                r1cVar.setLayoutParams(layoutParams);
                r1cVar.setIcon(R.drawable.icon_warning);
                r1cVar.setTitle(new tnh(R.string.technical_problems));
                r1cVar.setSubtitle(new tnh(R.string.wait_and_retry));
                r1cVar.f(np4.q(webAppRootScreen4.getContext(), R.string.retry), new aah(14, webAppRootScreen4));
                frameLayout.addView(q6fVar);
                e9i.j0(new fz6(n1g.v(new jz(webAppRootScreen4.J1().z1, 13), webAppRootScreen4.getViewLifecycleOwner().f(), n09.d), new h6b((lq4) null, webAppRootScreen4, q6fVar, frameLayout, r1cVar, r6cVar), 3), webAppRootScreen4.getViewLifecycleScope());
                linearLayout.addView(frameLayout);
                return sbi.a;
        }
    }
}
