package one.me.webview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.ap6;
import defpackage.b1k;
import defpackage.bl6;
import defpackage.dl6;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.el6;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.ht1;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jhc;
import defpackage.juj;
import defpackage.ldf;
import defpackage.lq4;
import defpackage.lu8;
import defpackage.mp5;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p3c;
import defpackage.qc5;
import defpackage.qyj;
import defpackage.rcc;
import defpackage.vo8;
import defpackage.wbc;
import defpackage.wcc;
import defpackage.wtc;
import defpackage.wxb;
import defpackage.xhh;
import defpackage.xw3;
import defpackage.yab;
import defpackage.ycc;
import defpackage.yf5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "ldf", "webview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FaqWebViewWidget extends Widget {
    public final wtc a;
    public final j8e b;
    public final oi8 c;
    public final ny8 d;
    public final p3c e;
    public final ny8 f;
    public final ap6 g;
    public final ny8 h;
    public final yf5 i;
    public final ny8 j;
    public static final /* synthetic */ zv8[] l = {new dwd(FaqWebViewWidget.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), zo5.e(zfe.a, FaqWebViewWidget.class, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;")};
    public static final ldf k = new ldf(25);
    public static final List m = xw3.P0("text/html", HTTP.PLAIN_TEXT_TYPE, "text/xml", "application/xhtml+xml", "application/xml");

    public FaqWebViewWidget(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.a = wtcVar;
        this.b = viewBinding(R.id.webview);
        this.c = oi8.f;
        this.d = wtcVar.getAccessor().d(26);
        this.e = qyj.S();
        this.f = wtcVar.getAccessor().d(213);
        this.g = (ap6) wtcVar.getAccessor().c(212);
        this.h = wtcVar.getAccessor().d(82);
        this.i = yab.h(getLifecycleScope(), ((n0c) ((xhh) wtcVar.getAccessor().d(23).getValue())).a(), 0, new jhc(this, null, 28), 2);
        this.j = createViewModelLazy(bl6.class, new fj3(22, new mp5(5, this)));
    }

    public static final void o1(FaqWebViewWidget faqWebViewWidget, Uri uri) {
        try {
            faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            String name = FaqWebViewWidget.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "error handleUrl - " + uri + ": " + e.getMessage(), e);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            bl6 bl6Var = (bl6) this.j.getValue();
            a8j.t(bl6Var, ((n0c) ((xhh) bl6Var.c.getValue())).a(), new ht1(intent, bl6Var, i2, (lq4) null, 12), 2);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setTitle(R.string.faq_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new nv4(7, this)));
        linearLayout.addView(rccVar);
        boolean z = ycc.c;
        Context context = linearLayout.getContext();
        ny8 ny8Var = this.d;
        ycc yccVarC = lu8.c(context, ((Boolean) ((e5d) ny8Var.getValue()).t().i()).booleanValue());
        yccVarC.setId(R.id.webview);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        yccVarC.setLayoutParams(layoutParams);
        yccVarC.getSettings().setJavaScriptEnabled(true);
        yccVarC.getSettings().setDomStorageEnabled(true);
        ((wxb) this.h.getValue()).getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        yccVarC.setWebViewClient(new dl6(this));
        yccVarC.setWebChromeClient(new wcc(new b1k(14, this), (juj) this.a.getAccessor().c(210), ((Boolean) ((e5d) ny8Var.getValue()).t().i()).booleanValue()));
        linearLayout.addView(yccVarC);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        zv8[] zv8VarArr = l;
        zv8 zv8Var = zv8VarArr[1];
        p3c p3cVar = this.e;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[1], null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yab.i0(getViewLifecycleScope(), null, 0, new qc5(this, (lq4) null, 10), 3);
        e9i.j0(new fz6(n1g.v(((bl6) this.j.getValue()).e, getViewLifecycleOwner().f(), n09.d), new el6((lq4) null, this, 0), 3), getViewLifecycleScope());
    }

    public final ycc p1() {
        return (ycc) this.b.m(this, l[0]);
    }

    public FaqWebViewWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
