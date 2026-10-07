package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.aah;
import defpackage.acc;
import defpackage.adc;
import defpackage.ayb;
import defpackage.c79;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e6c;
import defpackage.e9i;
import defpackage.f4g;
import defpackage.f5d;
import defpackage.fsk;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hzi;
import defpackage.i19;
import defpackage.i6j;
import defpackage.i7j;
import defpackage.j0i;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jcc;
import defpackage.je9;
import defpackage.jz;
import defpackage.k6j;
import defpackage.l6c;
import defpackage.l6j;
import defpackage.lq4;
import defpackage.lu8;
import defpackage.lvb;
import defpackage.m6j;
import defpackage.md1;
import defpackage.meh;
import defpackage.mjg;
import defpackage.mxj;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n6j;
import defpackage.n7j;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o6j;
import defpackage.oi8;
import defpackage.oki;
import defpackage.om8;
import defpackage.p6j;
import defpackage.pni;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r6c;
import defpackage.rcc;
import defpackage.td8;
import defpackage.ufe;
import defpackage.vbi;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wo6;
import defpackage.wxb;
import defpackage.xc0;
import defpackage.yab;
import defpackage.ycc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zw1;
import defpackage.zxb;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/chatmedia/viewer/VideoWebViewScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lvp4;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "videoUrl", "msgId", "Lha9;", "localAccountId", "(JLjava/lang/String;JLha9;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoWebViewScreen extends SwipeWidget implements vp4, z4f {
    public static final /* synthetic */ zv8[] A = {new dwd(VideoWebViewScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, VideoWebViewScreen.class, "videoUrl", "getVideoUrl()Ljava/lang/String;", 0), new dwd(VideoWebViewScreen.class, "msgId", "getMsgId()J", 0), new dwd(VideoWebViewScreen.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), new dwd(VideoWebViewScreen.class, "webViewContainer", "getWebViewContainer()Landroid/widget/FrameLayout;", 0), new dwd(VideoWebViewScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(VideoWebViewScreen.class, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0), new dwd(VideoWebViewScreen.class, "progressBar", "getProgressBar()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new dwd(VideoWebViewScreen.class, "errorView", "getErrorView()Landroid/widget/LinearLayout;", 0)};
    public final h d;
    public final vv e;
    public final vv f;
    public final vv g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final ny8 o;
    public final ny8 p;
    public final oi8 q;
    public final oi8 r;
    public final ny8 s;
    public mxj t;
    public md1 u;
    public Bundle v;
    public final Handler w;
    public final f4g x;
    public AnimatorSet y;
    public final int z;

    public VideoWebViewScreen(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.z = 1;
        this.e = new vv(Long.class, 0L, "chat.media.viewer.chat_id");
        this.f = new vv(String.class, "", "chat.media.viewer.attach_url");
        this.g = new vv(Long.class, 0L, "chat.media.viewer.message_id");
        this.h = createViewModelLazy(i6j.class, new hzi(3, new vbi(16, this)));
        this.i = viewBinding(R.id.video_webview_id);
        this.j = viewBinding(R.id.video_webview_container);
        this.k = viewBinding(R.id.oneme_chatmedia_viewer_toolbar);
        this.l = viewBinding(R.id.oneme_chatmedia_viewer_info_panel_view);
        this.m = viewBinding(R.id.video_progressbar);
        this.n = viewBinding(R.id.video_error);
        this.o = hVar.getAccessor().d(54);
        this.p = hVar.getAccessor().d(26);
        this.q = new oi8(0, 3, 0, null, 13);
        int i = 0;
        this.r = new oi8(i, 0, 0, new j11(3, 1, false), 7);
        this.s = hVar.getAccessor().d(82);
        this.w = new Handler(Looper.getMainLooper());
        this.x = new f4g(25, this);
    }

    public static final void D1(VideoWebViewScreen videoWebViewScreen, int i) {
        Object value;
        p6j p6jVar;
        String name = VideoWebViewScreen.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "videoWebView: handleNewOrientation: "), null);
            }
        }
        mjg mjgVar = videoWebViewScreen.J1().s;
        do {
            value = mjgVar.getValue();
            p6jVar = (p6j) value;
        } while (!mjgVar.h(value, p6jVar != null ? new p6j(i, p6jVar.b) : new p6j(i, false)));
    }

    public static final boolean E1(VideoWebViewScreen videoWebViewScreen) {
        Activity activity;
        Activity activity2;
        return (videoWebViewScreen.getActivity() == null || (activity = videoWebViewScreen.getActivity()) == null || activity.isDestroyed() || (activity2 = videoWebViewScreen.getActivity()) == null || activity2.isFinishing() || !videoWebViewScreen.isAttached()) ? false : true;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long B1() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer C1() {
        return Integer.valueOf(pq3.j.k(getContext()).b.b().b);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        J1().C(i);
    }

    public final void F1(boolean z) {
        Activity activity;
        Window window;
        mxj mxjVar = this.t;
        if (z) {
            if (mxjVar != null) {
                mxjVar.a(519);
            }
        } else if (mxjVar != null) {
            mxjVar.a.q(3);
        }
        if (Build.VERSION.SDK_INT < 29 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(!z);
    }

    public final void G1(boolean z) {
        AnimatorSet animatorSet;
        int i = 1;
        if ((I1().getVisibility() == 0) == z) {
            if ((H1().getVisibility() == 0) == (z && getContext().getResources().getConfiguration().orientation != 2)) {
                return;
            }
        }
        AnimatorSet animatorSet2 = this.y;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.y) != null) {
            animatorSet.cancel();
        }
        this.y = new AnimatorSet();
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? -I1().getHeight() : 0.0f;
        float f3 = z ? 0.0f : -I1().getHeight();
        float height = z ? H1().getHeight() : 0.0f;
        float height2 = z ? 0.0f : H1().getHeight();
        c79 c79VarW = yab.w();
        rcc rccVarI1 = I1();
        Property property = View.ALPHA;
        c79VarW.add(fsk.a(rccVarI1, property, I1().getAlpha(), f, 200L, 0L, false, 240));
        rcc rccVarI2 = I1();
        Property property2 = View.TRANSLATION_Y;
        c79VarW.add(fsk.a(rccVarI2, property2, f2, f3, 200L, 0L, false, 240));
        c79VarW.add(fsk.a(H1(), property, H1().getAlpha(), f, 200L, 0L, false, 240));
        c79VarW.add(fsk.a(H1(), property2, height, height2, 200L, 0L, false, 240));
        c79 c79VarJ = yab.j(c79VarW);
        AnimatorSet animatorSet3 = this.y;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(c79VarJ);
        }
        AnimatorSet animatorSet4 = this.y;
        if (z) {
            if (animatorSet4 != null) {
                animatorSet4.addListener(new k6j(this, i));
            }
        } else if (animatorSet4 != null) {
            animatorSet4.addListener(new k6j(this, 0));
        }
        AnimatorSet animatorSet5 = this.y;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final td8 H1() {
        return (td8) this.l.m(this, A[6]);
    }

    public final rcc I1() {
        return (rcc) this.k.m(this, A[5]);
    }

    public final i6j J1() {
        return (i6j) this.h.getValue();
    }

    public final ycc K1() {
        return (ycc) this.i.m(this, A[3]);
    }

    public final FrameLayout L1() {
        return (FrameLayout) this.j.m(this, A[4]);
    }

    public final void M1(meh mehVar) {
        td8 td8Var = new td8(mehVar.getContext());
        td8Var.setId(R.id.oneme_chatmedia_viewer_info_panel_view);
        td8Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        td8Var.setClipToPadding(false);
        td8Var.setPadding(td8Var.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 9.0f), td8Var.getPaddingRight(), gm0.K(9.0f * yl5.d().getDisplayMetrics().density));
        td8Var.setBackgroundColor(pq3.j.l(td8Var).b.b().b);
        lvb.H(td8Var, this.r, null);
        mehVar.addView(td8Var);
    }

    public final void N1() {
        Handler handler = this.w;
        f4g f4gVar = this.x;
        handler.removeCallbacks(f4gVar);
        handler.postDelayed(f4gVar, 2000L);
    }

    public final void O1(meh mehVar) {
        rcc rccVar = new rcc(mehVar.getContext());
        rccVar.setId(R.id.oneme_chatmedia_viewer_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        rccVar.setLeftActions(new wbc(new pni(4, this)));
        rccVar.setRightActions(new acc(null, new jcc(R.drawable.icon_dots_vertical, null, null, null, 0.0f, new fz7(1, this, VideoWebViewScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 28), 254), null));
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        rccVar.setBackgroundColor(a8gVar.l(rccVar).b.k().b);
        lvb.H(rccVar, this.q, null);
        mehVar.addView(rccVar);
    }

    public final void P1(meh mehVar) {
        Bundle bundle;
        FrameLayout frameLayout = new FrameLayout(mehVar.getContext());
        frameLayout.setId(R.id.video_webview_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        r6c r6cVar = new r6c(frameLayout.getContext());
        r6cVar.setId(R.id.video_progressbar);
        r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        r6cVar.setAppearance(e6c.a);
        r6cVar.setSize(l6c.a);
        r6cVar.setVisibility(0);
        frameLayout.addView(r6cVar);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(R.id.video_error);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        Drawable drawableMutate = linearLayout.getContext().getDrawable(R.drawable.icon_warning_triangle_fill).mutate();
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageDrawable(drawableMutate);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(R.string.web_app_root_error_title);
        textView.setSingleLine();
        q9i.a(q9i.d, textView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(R.string.web_app_root_error_subtitle);
        textView2.setSingleLine();
        q9i.a(q9i.i, textView2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        cyb cybVar = new cyb(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        cybVar.setLayoutParams(layoutParams4);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.web_app_root_error_retry_button));
        cybVar.setAppearance(zxb.SECONDARY);
        cybVar.setSize(ayb.h);
        qe7.H(cybVar, 300L, new aah(11, this));
        n1g.N(new om8(textView, textView2, drawableMutate, null, 2), linearLayout);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(cybVar);
        frameLayout.addView(linearLayout);
        boolean z = ycc.c;
        Context context = frameLayout.getContext();
        ny8 ny8Var = this.p;
        ycc yccVarC = lu8.c(context, ((Boolean) ((e5d) ny8Var.getValue()).t().i()).booleanValue());
        yccVarC.setId(R.id.video_webview_id);
        yccVarC.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        yccVarC.setVisibility(8);
        yccVarC.setBackgroundColor(-16777216);
        yccVarC.getSettings().setDomStorageEnabled(true);
        yccVarC.getSettings().setJavaScriptEnabled(true);
        yccVarC.getSettings().setAllowContentAccess(true);
        yccVarC.getSettings().setAllowFileAccess(false);
        yccVarC.getSettings().setMixedContentMode(0);
        yccVarC.getSettings().setMediaPlaybackRequiresUserGesture(false);
        String userAgentString = yccVarC.getSettings().getUserAgentString();
        ny8 ny8Var2 = this.s;
        ((wxb) ny8Var2.getValue()).getClass();
        yccVarC.getSettings().setUserAgentString(userAgentString + " MAX/26.28.0");
        ((wxb) ny8Var2.getValue()).getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        oki okiVar = new oki(J1());
        if (((Boolean) ((e5d) ny8Var.getValue()).D().i()).booleanValue() && (bundle = this.v) != null) {
            yccVarC.restoreState(bundle);
        }
        yccVarC.setInteractionListener(new n6j(this));
        yccVarC.setWebViewClient(new adc(this.d.getAccessor().d(5), okiVar));
        yccVarC.setWebChromeClient(new o6j(yccVarC));
        frameLayout.addView(yccVarC);
        mehVar.addView(frameLayout);
    }

    @Override // defpackage.z4f
    public final void j(Window window) {
        super.j(window);
        F1(true);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        Activity activity;
        super.onAttach(view);
        if (!((Boolean) ((f5d) ((wo6) this.o.getValue())).w().getValue()).booleanValue() && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(4);
        }
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 13);
        context.registerComponentCallbacks(md1Var);
        D1(this, ufeVar.a);
        this.u = md1Var;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        meh mehVar;
        Activity activity = getActivity();
        if (activity != null) {
            mxj mxjVar = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
            mxjVar.a.b0();
            this.t = mxjVar;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            mehVar = new meh(getContext());
            mehVar.setId(R.id.video_container);
            mehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            mehVar.setBackgroundColor(-16777216);
            O1(mehVar);
            P1(mehVar);
            M1(mehVar);
        } else {
            l6j l6jVar = new l6j(getContext());
            l6jVar.setId(R.id.video_container);
            l6jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            l6jVar.setBackgroundColor(-16777216);
            O1(l6jVar);
            P1(l6jVar);
            M1(l6jVar);
            mehVar = l6jVar;
        }
        mehVar.setOnTouchListener(new zw1(6, this));
        WeakHashMap weakHashMap = i7j.a;
        if (!mehVar.isLaidOut() || mehVar.isLayoutRequested()) {
            mehVar.addOnLayoutChangeListener(new xc0(21, this));
        } else {
            N1();
        }
        n7j.e(mehVar, new j0i(mehVar, 12, this));
        return mehVar;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.w.removeCallbacks(this.x);
        K1().destroy();
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        Activity activity;
        super.onDetach(view);
        if (!((Boolean) ((f5d) ((wo6) this.o.getValue())).w().getValue()).booleanValue() && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(1);
        }
        md1 md1Var = this.u;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    @Override // defpackage.br4
    public final void onRestoreViewState(View view, Bundle bundle) {
        Bundle bundle2;
        super.onRestoreViewState(view, bundle);
        if (((Boolean) ((e5d) this.p.getValue()).D().i()).booleanValue() && (bundle2 = bundle.getBundle("web_view_state_key")) != null) {
            this.v = bundle2;
        }
    }

    @Override // defpackage.br4
    public final void onSaveViewState(View view, Bundle bundle) {
        super.onSaveViewState(view, bundle);
        if (((Boolean) ((e5d) this.p.getValue()).D().i()).booleanValue()) {
            String name = VideoWebViewScreen.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "videoWebView: onSaveViewState with webViewCacheEnabled", null);
                }
            }
            Bundle bundleI = n1g.i(new ylc[0]);
            K1().saveState(bundleI);
            bundle.putBundle("web_view_state_key", bundleI);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        jz jzVar = new jz(J1().l, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new m6j(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().r, getViewLifecycleOwner().f(), n09Var), new m6j(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().o, getViewLifecycleOwner().f(), n09Var), new m6j(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().n, getViewLifecycleOwner().f(), n09Var), new m6j(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(J1().t, getViewLifecycleOwner().f(), n09Var), new m6j(lq4Var, this, 4), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().getEvents(), getViewLifecycleOwner().f(), n09Var), new m6j(lq4Var, this, 5), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getZ() {
        return this.z;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        Window window;
        Window window2;
        View view = getView();
        a8g a8gVar = pq3.j;
        if (view != null) {
            view.setBackgroundColor(a8gVar.k(getContext()).b.b().b);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(a8gVar.k(getContext()).b.b().b);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(a8gVar.k(getContext()).b.b().b);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void w1(float f) {
        Window window;
        Window window2;
        View view = getView();
        a8g a8gVar = pq3.j;
        if (view != null) {
            a8gVar.k(getContext());
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            a8gVar.k(getContext());
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        a8gVar.k(getContext());
        window.setNavigationBarColor(0);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        if (getView() == null || I1().getVisibility() != 0) {
            return;
        }
        I1().setVisibility(8);
        H1().setVisibility(8);
    }

    public VideoWebViewScreen(long j, String str, long j2, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat.media.viewer.chat_id", Long.valueOf(j)), new ylc("chat.media.viewer.attach_url", str), new ylc("chat.media.viewer.message_id", Long.valueOf(j2))));
    }
}
