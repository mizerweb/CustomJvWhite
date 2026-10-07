package one.me.chatscreen.videomsg;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.br4;
import defpackage.c79;
import defpackage.cf7;
import defpackage.cyi;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e9i;
import defpackage.f2j;
import defpackage.fsk;
import defpackage.fz6;
import defpackage.g1j;
import defpackage.g72;
import defpackage.gm0;
import defpackage.h;
import defpackage.h2j;
import defpackage.ha9;
import defpackage.hzi;
import defpackage.i19;
import defpackage.i2j;
import defpackage.iid;
import defpackage.iyi;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jyf;
import defpackage.k2j;
import defpackage.khb;
import defpackage.l2j;
import defpackage.lq4;
import defpackage.m2j;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n7j;
import defpackage.nff;
import defpackage.ny8;
import defpackage.o0j;
import defpackage.oi8;
import defpackage.oki;
import defpackage.oli;
import defpackage.p2j;
import defpackage.p3c;
import defpackage.p7g;
import defpackage.p90;
import defpackage.q2j;
import defpackage.q9i;
import defpackage.qyj;
import defpackage.rui;
import defpackage.rx8;
import defpackage.s2j;
import defpackage.sgg;
import defpackage.uik;
import defpackage.uw8;
import defpackage.v7j;
import defpackage.vzc;
import defpackage.w8g;
import defpackage.wf2;
import defpackage.wk8;
import defpackage.wme;
import defpackage.xme;
import defpackage.xx6;
import defpackage.xxi;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import defpackage.zzi;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ zv8[] B = {new dwd(VideoMessageWidget.class, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0), zo5.f(zfe.a, VideoMessageWidget.class, "timerView", "getTimerView()Landroid/widget/TextView;", 0), new dwd(VideoMessageWidget.class, "cameraPreviewView", "getCameraPreviewView()Lone/me/chatscreen/videomsg/VideoMessageCameraView;", 0), new dwd(VideoMessageWidget.class, "cameraSwitchButton", "getCameraSwitchButton()Landroid/widget/ImageView;", 0), new dwd(VideoMessageWidget.class, "container", "getContainer()Landroid/view/ViewGroup;", 0), new z8b(VideoMessageWidget.class, "blinkingDotJob", "getBlinkingDotJob()Lkotlinx/coroutines/Job;"), new dwd(VideoMessageWidget.class, "trimSliderRouter", "getTrimSliderRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final uik A;
    public final oi8 a;
    public final h b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final k2j g;
    public final String h;
    public final ny8 i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final p3c o;
    public final xme p;
    public rui q;
    public final oki r;
    public final j8e s;
    public final xme t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public AnimatorSet x;
    public ScaleGestureDetector y;
    public sgg z;

    public VideoMessageWidget(Bundle bundle) {
        super(bundle);
        this.a = new oi8(0, 0, 0, null, 5);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = createViewModelLazy(f2j.class, new hzi(1, new i2j(this, 0)));
        this.d = hVar.getAccessor().d(26);
        this.e = hVar.getAccessor().d(85);
        this.f = hVar.getAccessor().d(192);
        this.g = new k2j(this);
        this.h = VideoMessageWidget.class.getName();
        this.i = rx8.P(3, new i2j(this, 1));
        this.j = viewBinding(R.id.chat_screen__video_msg_torch_btn);
        this.k = viewBinding(R.id.chat_screen__video_msg_timer);
        this.l = viewBinding(R.id.chat_screen__video_msg_preview);
        this.m = viewBinding(R.id.chat_screen__video_msg_switch_camera_btn);
        this.n = viewBinding(R.id.chat_screen__video_msg_root_container);
        this.o = qyj.S();
        this.p = p90.M(new i2j(this, 2));
        this.r = new oki(this);
        this.s = childSlotRouter(R.id.chat_screen__video_msg_trim_slider_view_container);
        this.t = p90.M(new i2j(this, 3));
        this.u = rx8.P(3, new o0j(4));
        this.v = rx8.P(3, new i2j(this, 4));
        this.w = rx8.P(3, new i2j(this, 5));
        this.A = new uik(29, this);
    }

    public static final void o1(VideoMessageWidget videoMessageWidget, FrameLayout frameLayout, int i, cf7 cf7Var) {
        View imageView = new ImageView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        n1g.N(new vzc(videoMessageWidget, (lq4) null, 17), imageView);
        cf7Var.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public static final int p1(VideoMessageWidget videoMessageWidget, View view) {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) * 2;
        int iMin = Math.min(wk8.u(videoMessageWidget.getContext()) - iK, (((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - zo5.b(16.0f, yl5.d().getDisplayMetrics().density, gm0.K(40.0f * yl5.d().getDisplayMetrics().density))) - iK);
        return iMin == 0 ? gm0.K(352.0f * yl5.d().getDisplayMetrics().density) : iMin;
    }

    public final void A1(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.x;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.x;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.x = new AnimatorSet();
        q1().setVisibility(0);
        c79 c79VarW = yab.w();
        if (z) {
            c79VarW.add(fsk.a(u1(), View.ALPHA, u1().getAlpha(), 1.0f, 200L, 0L, false, 240));
        }
        if (r1().getVisibility() != 0) {
            c79VarW.add(fsk.a(r1(), View.ALPHA, r1().getAlpha(), 1.0f, 200L, 0L, false, 240));
        }
        if (z2) {
            c79VarW.add(fsk.a(t1(), View.ALPHA, t1().getAlpha(), 1.0f, 200L, 0L, false, 240));
        }
        c79 c79VarJ = yab.j(c79VarW);
        AnimatorSet animatorSet4 = this.x;
        if (animatorSet4 != null) {
            animatorSet4.playTogether(c79VarJ);
        }
        AnimatorSet animatorSet5 = this.x;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new s2j(this, z, z2));
        }
        AnimatorSet animatorSet6 = this.x;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
        View view = getView();
        this.o.B(this, B[5], yab.i0(view != null ? v7j.b(view) : getLifecycleScope(), null, 0, new p7g(((InsetDrawable) this.u.getValue()).mutate(), (lq4) null, 19), 3));
    }

    public final void B1() throws IllegalAccessException, InvocationTargetException {
        if (this.i.d()) {
            sgg sggVar = this.z;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.z = null;
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        boolean z = this.q != null && this.i.d() && x1().P();
        if (getView() == null || !z) {
            return;
        }
        xme xmeVar = this.p;
        if (n7j.o(xmeVar)) {
            if (xmeVar.d()) {
                ((zzi) xmeVar.getValue()).a.a(this.r);
            }
            x1().play();
        }
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        mjg mjgVar = y1().c.G;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        super.onActivityStopped(activity);
        if (getView() == null || this.q == null || !this.i.d()) {
            return;
        }
        e3j e3jVarX1 = x1();
        e3jVarX1.pause();
        e3jVarX1.H(null);
        xme xmeVar = this.p;
        if (xmeVar.d()) {
            ((zzi) xmeVar.getValue()).a.b();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.chat_screen__video_msg_root_container);
        frameLayout.setOnTouchListener(m2j.a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        cyi cyiVar = new cyi(frameLayout.getContext());
        cyiVar.setId(R.id.chat_screen__video_msg_preview);
        cyiVar.setZoomListener(new h2j(this, 1));
        cyiVar.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        frameLayout.addView(cyiVar);
        n1g.N(new nff(cyiVar, (lq4) null, 10), frameLayout);
        o1(this, frameLayout, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), new p2j(this, 0));
        o1(this, frameLayout, gm0.K(72.0f * yl5.d().getDisplayMetrics().density), new p2j(this, 1));
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(R.id.chat_screen__video_msg_timer);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) this.u.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
        q9i.a(q9i.i, textView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
        textView.setVisibility(8);
        n1g.N(new nff(this, (lq4) null, 11), textView);
        frameLayout.addView(textView);
        n7j.a(frameLayout, (View) this.t.getValue(), -1);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        if (this.i.d()) {
            e3j e3jVarX1 = x1();
            e3jVarX1.pause();
            e3jVarX1.H(null);
            e3jVarX1.q(this.g);
            e3jVarX1.stop();
            ((w8g) this.f.getValue()).a(x1());
            wme wmeVar = ((w8g) this.f.getValue()).k;
            if (wmeVar.d()) {
                ((e3j) wmeVar.getValue()).release();
                wmeVar.a();
            }
        }
        g1j g1jVar = y1().c;
        String str = g1jVar.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "VideoMessage Recording. Release all", null);
            }
        }
        g1jVar.y.setValue(null);
        if (g1jVar.j.d()) {
            g1jVar.w().g();
        }
        wf2 wf2Var = g1jVar.K;
        if (wf2Var != null) {
            wf2Var.a();
        }
        g1jVar.K = null;
        mjg mjgVar = g1jVar.G;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        g1jVar.p = null;
        iid iidVar = g1jVar.f;
        if (iidVar != null) {
            iidVar.a.y();
        }
        g1jVar.f = null;
        g1jVar.r = null;
        g1jVar.q = null;
        g1jVar.n = null;
        xxi xxiVar = g1jVar.o;
        if (xxiVar != null) {
            xxiVar.e.release();
        }
        g1jVar.o = null;
        g1jVar.L.compareAndSet(true, false);
        g1jVar.t.set(0);
        g1jVar.u = 0L;
        mjg mjgVar2 = g1jVar.v;
        Float fValueOf = Float.valueOf(0.0f);
        mjgVar2.getClass();
        mjgVar2.j(null, fValueOf);
        mjg mjgVar3 = g1jVar.w;
        mjgVar3.getClass();
        mjgVar3.j(null, 0L);
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        Bitmap frameAsBitmap = q1().getFrameAsBitmap();
        if (frameAsBitmap != null) {
            g1j g1jVar = y1().c;
            g1jVar.M.B(g1jVar, g1j.P[0], yab.h0(g1jVar.i, ((n0c) g1jVar.u()).a(), 2, new oli(g1jVar, frameAsBitmap, null, 8)));
        }
        this.q = null;
        if (this.i.d()) {
            e3j e3jVarX1 = x1();
            e3jVarX1.pause();
            e3jVarX1.H(null);
            e3jVarX1.q(this.g);
        }
        xme xmeVar = this.p;
        if (xmeVar.d()) {
            ((zzi) xmeVar.getValue()).a.b();
        }
        khb khbVar = khb.k;
        xmeVar.b = khbVar;
        v1().c();
        this.t.b = khbVar;
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.y = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yab.i0(getViewLifecycleScope(), null, 0, new l2j(this, view, null, 1), 3);
        this.y = new ScaleGestureDetector(getContext(), new g72(2, this));
        xx6 previewStreamState = q1().getPreviewStreamState();
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(previewStreamState, i19VarF, n09Var), new q2j(null, this, 0), 3), getViewLifecycleScope());
        q1().setZoomListener(new h2j(this, 0));
        e9i.j0(new fz6(n1g.v(y1().q, getViewLifecycleOwner().f(), n09Var), new q2j(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().h, getViewLifecycleOwner().f(), n09Var), new q2j(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().f, getViewLifecycleOwner().f(), n09Var), new q2j(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.K(uw8.f, 1), getViewLifecycleOwner().f(), n09Var), new q2j(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().i, getViewLifecycleOwner().f(), n09Var), new jyf((lq4) null, this, view, 15), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().j, getViewLifecycleOwner().f(), n09Var), new q2j(null, this, 5), 3), getViewLifecycleScope());
    }

    public final cyi q1() {
        return (cyi) this.l.m(this, B[2]);
    }

    public final ImageView r1() {
        return (ImageView) this.m.m(this, B[3]);
    }

    public final ViewGroup s1() {
        return (ViewGroup) this.n.m(this, B[4]);
    }

    public final TextView t1() {
        return (TextView) this.k.m(this, B[1]);
    }

    public final ImageView u1() {
        return (ImageView) this.j.m(this, B[0]);
    }

    public final zp3 v1() {
        return (zp3) this.s.m(this, B[6]);
    }

    public final VideoTrimSliderWidget w1() {
        br4 br4VarC = rx8.C(v1().a);
        if (br4VarC instanceof VideoTrimSliderWidget) {
            return (VideoTrimSliderWidget) br4VarC;
        }
        return null;
    }

    public final e3j x1() {
        return (e3j) this.i.getValue();
    }

    public final f2j y1() {
        return (f2j) this.c.getValue();
    }

    public final void z1() {
        if (this.i.d()) {
            if (x1().a() == 1.0f) {
                a8j.x(y1().j, iyi.a);
            }
            x1().pause();
        }
        xme xmeVar = this.p;
        if (xmeVar.d()) {
            ((zzi) xmeVar.getValue()).setVisibility(8);
        }
        v1().c();
    }

    public VideoMessageWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
