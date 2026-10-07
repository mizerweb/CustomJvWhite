package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.acc;
import defpackage.as9;
import defpackage.br4;
import defpackage.ccd;
import defpackage.ch8;
import defpackage.ci1;
import defpackage.cqk;
import defpackage.cs9;
import defpackage.d97;
import defpackage.db3;
import defpackage.dcc;
import defpackage.ds9;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ecd;
import defpackage.el6;
import defpackage.es9;
import defpackage.f5d;
import defpackage.fg2;
import defpackage.fxb;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gi7;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.h;
import defpackage.h7a;
import defpackage.h8c;
import defpackage.hb9;
import defpackage.hcc;
import defpackage.hj2;
import defpackage.hve;
import defpackage.hz1;
import defpackage.i19;
import defpackage.ib;
import defpackage.ib9;
import defpackage.ic6;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jdf;
import defpackage.je9;
import defpackage.jef;
import defpackage.jy5;
import defpackage.jz;
import defpackage.k2e;
import defpackage.kw3;
import defpackage.lq4;
import defpackage.lr9;
import defpackage.lsk;
import defpackage.lvb;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n2e;
import defpackage.n9j;
import defpackage.nt4;
import defpackage.nvh;
import defpackage.ny8;
import defpackage.o56;
import defpackage.o65;
import defpackage.o8c;
import defpackage.oc2;
import defpackage.oc9;
import defpackage.oef;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ow0;
import defpackage.pbb;
import defpackage.pq3;
import defpackage.q2f;
import defpackage.r07;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.s50;
import defpackage.sr9;
import defpackage.svj;
import defpackage.t3f;
import defpackage.t73;
import defpackage.tb3;
import defpackage.tbb;
import defpackage.tha;
import defpackage.tp2;
import defpackage.tq9;
import defpackage.ur9;
import defpackage.uvc;
import defpackage.uw8;
import defpackage.vd2;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w8c;
import defpackage.wd2;
import defpackage.wo6;
import defpackage.wsc;
import defpackage.x9h;
import defpackage.xbc;
import defpackage.xr1;
import defpackage.y3f;
import defpackage.yab;
import defpackage.ybc;
import defpackage.yka;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0011\u0012B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0013"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lpbb;", "Lmc4;", "Lvd2;", "Lvp4;", "Lq2f;", "Loef;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Lt3f;J)V", "one/me/chatscreen/ChatScreen", "ib", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaBarWidget extends Widget implements pbb, mc4, vd2, vp4, q2f, oef {
    public static final /* synthetic */ zv8[] u1 = {new dwd(MediaBarWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, MediaBarWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(MediaBarWidget.class, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), new dwd(MediaBarWidget.class, "suggestionsContainer", "getSuggestionsContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), new dwd(MediaBarWidget.class, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), new dwd(MediaBarWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(MediaBarWidget.class, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), new dwd(MediaBarWidget.class, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "selectedMediaRouter", "getSelectedMediaRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new dwd(MediaBarWidget.class, "viewModelScopeId", "getViewModelScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(MediaBarWidget.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaBarWidget.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaBarWidget.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public static final oi8 v1 = new oi8(0, 0, 0, new j11(4, 3, true), 7);
    public int A;
    public final nvh B;
    public final ColorDrawable C;
    public ValueAnimator D;
    public LinearLayout E;
    public final j8e F;
    public final j8e G;
    public final j8e H;
    public final j8e I;
    public final vv J;
    public final ny8 K;
    public final ny8 X;
    public final ny8 Y;
    public final ny8 Z;
    public final String a;
    public final vv b;
    public final t3f c;
    public final h d;
    public final ny8 e;
    public final tbb f;
    public final ny8 g;
    public final IntEvaluator h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public g8c m;
    public final j8e n;
    public final j8e n1;
    public final j8e o;
    public final j8e o1;
    public final j8e p;
    public final j8e p1;
    public final j8e q;
    public final jy5 q1;
    public final ny8 r;
    public final ny8 r1;
    public final ny8 s;
    public SelectedMediaBottomBarWidget s1;
    public final j8e t;
    public ChatScreen t1;
    public final j8e u;
    public final ColorDrawable v;
    public final ny8 w;
    public final j8e x;
    public float y;
    public float z;

    public MediaBarWidget(Bundle bundle) {
        super(bundle);
        this.a = MediaBarWidget.class.getName();
        this.b = new vv("chat_id", Long.class);
        vv vvVar = new vv("scope_id", t3f.class);
        zv8 zv8Var = u1[1];
        this.c = new t3f(((t3f) vvVar.a(this)).a, super.getA().b());
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.e = ysc.a.a();
        this.f = (tbb) hVar.getAccessor().c(231);
        this.g = hVar.getAccessor().d(783);
        this.h = new IntEvaluator();
        this.i = childSlotRouter(R.id.media_bar__bottom_container);
        this.j = childSlotRouter(R.id.media_bar__primary_container);
        this.k = viewBinding(R.id.media_bar__popup_layout);
        this.l = viewBinding(R.id.media_bar__suggestion_container);
        this.n = viewBinding(R.id.media_bar__close_drag_view);
        this.o = viewBinding(R.id.media_bar__close_drag_element);
        this.p = viewBinding(R.id.media_bar__album_chooser);
        this.q = viewBinding(R.id.media_bar__primary_container);
        this.r = createViewModelLazy(n2e.class, new ch8(12, new cs9(this, 1)));
        this.s = createViewModelLazy(x9h.class, new ch8(13, new cs9(this, 2)));
        this.t = childSlotRouter(R.id.media_bar__partial_media_access_container);
        this.u = viewBinding(R.id.media_bar__partial_media_access_container);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.v = colorDrawable;
        this.w = new h(m35getAccountScopeuqN4xOY()).getAccessor().d(784);
        this.x = viewBinding(R.id.media_bar__camera_container);
        this.B = new nvh(yl5.d().getDisplayMetrics().density * 12.0f);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.C = colorDrawable2;
        this.F = viewBinding(R.id.media_bar__bottom_container);
        this.G = childSlotRouter(R.id.media_bar__selected_media_container);
        this.H = childSlotRouter(R.id.media_bar__suggestion_container);
        this.I = viewBinding(R.id.media_bar__bottom_layout);
        this.J = new vv("scope_id", t3f.class);
        this.K = createViewModelLazy(gi7.class, new ch8(14, new cs9(this, 3)));
        this.X = createViewModelLazy(h7a.class, new ch8(15, new cs9(this, 4)));
        this.Y = getSharedViewModel(D1(), as9.class, null);
        this.Z = createViewModelLazy(jdf.class, new ch8(16, new cs9(this, 5)));
        this.n1 = childSlotRouter(R.id.media_bar__select_album_container);
        this.o1 = viewBinding(R.id.media_bar__select_album_container);
        viewBinding(R.id.media_bar__emoji_keyboard_container);
        this.p1 = Widget.childRouter$default(this, R.id.media_bar__emoji_keyboard_container, null, 2, null);
        this.q1 = new jy5(this, 2);
        this.r1 = hVar.getAccessor().d(26);
    }

    public static final zp3 o1(MediaBarWidget mediaBarWidget) {
        return (zp3) mediaBarWidget.j.m(mediaBarWidget, u1[3]);
    }

    public static final void p1(MediaBarWidget mediaBarWidget, int i, int i2) {
        g8c g8cVar = mediaBarWidget.m;
        if (g8cVar != null) {
            g8cVar.a();
        }
        h8c h8cVar = new h8c(mediaBarWidget.x1());
        h8cVar.c(new o8c(0, 0, mediaBarWidget.u1().getHeight(), 11));
        h8cVar.h(new w8c(i));
        h8cVar.n(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.m = h8cVar.p();
    }

    public static final void q1(MediaBarWidget mediaBarWidget, int i) {
        g8c g8cVar = mediaBarWidget.m;
        if (g8cVar != null) {
            g8cVar.a();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(R.plurals.oneme_gallery_max_attach_count_error, i, Integer.valueOf(i));
        h8c h8cVar = new h8c(mediaBarWidget.x1());
        h8cVar.c(new o8c(0, 0, mediaBarWidget.u1().getHeight(), 11));
        h8cVar.n(quantityString);
        mediaBarWidget.m = h8cVar.p();
    }

    public static final void r1(MediaBarWidget mediaBarWidget) {
        j8e j8eVar = mediaBarWidget.o;
        zv8[] zv8VarArr = u1;
        int measuredHeight = mediaBarWidget.B1().getMeasuredHeight() + ((FrameLayout) j8eVar.m(mediaBarWidget, zv8VarArr[7])).getMeasuredHeight();
        LinearLayout linearLayout = mediaBarWidget.E;
        float measuredHeight2 = mediaBarWidget.z + mediaBarWidget.y + ((tp2) mediaBarWidget.u.m(mediaBarWidget, zv8VarArr[11])).getMeasuredHeight() + measuredHeight + (linearLayout != null ? linearLayout.getPaddingTop() : 0);
        LinearLayout linearLayoutU1 = mediaBarWidget.u1();
        Rect rect = n9j.a;
        n9j.e(rect, linearLayoutU1);
        int height = (mediaBarWidget.v1().getHeight() + ((int) measuredHeight2)) - rect.top;
        int i = height >= 0 ? height : 0;
        wd2 wd2VarV1 = mediaBarWidget.v1();
        int i2 = (-((int) mediaBarWidget.y)) + mediaBarWidget.A;
        wd2VarV1.h = i2;
        wd2VarV1.i = i;
        if (!wd2VarV1.n) {
            kw3 kw3Var = wd2VarV1.j;
            kw3Var.b = i2;
            kw3Var.c = i;
            wd2VarV1.invalidateOutline();
        }
        mediaBarWidget.v1().setPreviewTranslationY(measuredHeight2);
        wd2 wd2VarV2 = mediaBarWidget.v1();
        if (wd2VarV2.n) {
            return;
        }
        wd2VarV2.f(wd2VarV2.e, wd2VarV2.f);
    }

    public final zp3 A1() {
        return (zp3) this.H.m(this, u1[15]);
    }

    public final rcc B1() {
        return (rcc) this.p.m(this, u1[8]);
    }

    public final as9 C1() {
        return (as9) this.Y.getValue();
    }

    public final t3f D1() {
        zv8 zv8Var = u1[17];
        return (t3f) this.J.a(this);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        as9 as9VarC1 = C1();
        if (i == R.id.send_context_menu_action_scheduled_send) {
            yab.i0(as9VarC1.b, null, 0, new sr9(as9VarC1, null, 0), 3);
        } else {
            as9VarC1.getClass();
        }
    }

    public final void E1(boolean z) {
        if (getView() != null) {
            x1().j(z);
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "popupLayoutChangeType=hide, scrollState=" + x1().getScrollState(), null);
            }
        }
    }

    public final void F1(hb9 hb9Var, int i, String str) {
        tb3 tb3Var = tb3.b;
        boolean zE = C1().E();
        String str2 = D1().a;
        long jW1 = w1();
        long j = hb9Var.b;
        Long l = (Long) C1().e.invoke();
        o65.c(tb3Var.b(), ":media-editor", n1g.i(new ylc("album_id", str), new ylc("pos", String.valueOf(i)), new ylc("is_message_edit", String.valueOf(zE)), new ylc("media_scope_id", str2), new ylc("chat_id", String.valueOf(jW1)), new ylc("initial_id", String.valueOf(j)), new ylc("multi_select", "true"), new ylc("message_id", l != null ? String.valueOf(l.longValue()) : null)), null, 4);
    }

    public final void G1(s50 s50Var) {
        int i;
        dcc accVar;
        rcc rccVarB1 = B1();
        if (C1().E()) {
            accVar = ybc.a;
        } else {
            int iOrdinal = s50Var.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.icon_image;
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return;
                }
                i = R.drawable.icon_file;
            }
            accVar = new acc(null, new hcc(i, new ds9(this, 0)), null);
        }
        rccVarB1.setRightActions(accVar);
    }

    @Override // defpackage.oef
    public final void O0() {
    }

    @Override // defpackage.vd2
    public final void P() {
        if (((f5d) ((wo6) this.d.getAccessor().d(54).getValue())).C()) {
            u1().bringToFront();
        }
        ((fxb) this.w.getValue()).a.y(false);
        tbb.g(this.f, y3f.CHAT_ATTACH_PICKER);
    }

    @Override // defpackage.oef
    public final void Q0() {
        as9 as9VarC1 = C1();
        if (as9VarC1.d.h()) {
            yab.i0(as9VarC1.b, null, 0, new ur9(as9VarC1, null, 1), 3);
        }
    }

    @Override // defpackage.vd2
    public final void V() {
        int i = uw8.a;
        if (uw8.b(uw8.c)) {
            this.q1.i();
        }
        if (((f5d) ((wo6) this.d.getAccessor().d(54).getValue())).C()) {
            v1().bringToFront();
        }
        ((fxb) this.w.getValue()).a.o(false);
        tbb.g(this.f, y3f.CHAT_ATTACH_PICKER_CAMERA);
    }

    @Override // defpackage.oef
    public final hb9 X0() {
        return null;
    }

    @Override // defpackage.oef
    public final void b0(t73 t73Var, rt2 rt2Var) {
        gm0.n(this.a, "OnClickSend in MediaBarWidget");
        as9 as9VarC1 = C1();
        zv8[] zv8VarArr = as9.I;
        if (as9VarC1.d.i()) {
            yab.i0(as9VarC1.b, null, 0, new sr9(as9VarC1, null, 1), 3);
        } else {
            as9VarC1.G(null, false);
        }
    }

    @Override // defpackage.oef
    public final void c0() {
        a8j.x(C1().v, lr9.a);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        C1().r.c(new tq9(false));
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        as9 as9VarC1 = C1();
        as9VarC1.getClass();
        if (j == 1 || j == 2) {
            as9VarC1.G(Long.valueOf(j2), j == 2);
        }
    }

    @Override // defpackage.oef
    public final void g0() {
        as9 as9VarC1 = C1();
        zv8[] zv8VarArr = as9.I;
        as9VarC1.u.a(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getA() {
        return this.c;
    }

    @Override // defpackage.oef
    public final void h(jef jefVar) {
        C1().p(jefVar);
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        if (v1().n) {
            v1().d(false, true);
            tbb.g(this.f, y3f.CHAT_ATTACH_PICKER);
            return true;
        }
        ccd scrollState = x1().getScrollState();
        scrollState.getClass();
        if (scrollState == ccd.a) {
            return false;
        }
        if (((hve) this.p1.m(this, u1[21])).o()) {
            C1().u.a(yka.a);
            return true;
        }
        if (C1().F()) {
            x1().j(true);
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "handleBack(): popupLayoutChangeType=hide, scrollState=" + x1().getScrollState(), null);
                }
            }
        }
        return true;
    }

    @Override // defpackage.pbb
    public final y3f o0() {
        return v1().n ? y3f.CHAT_ATTACH_PICKER_CAMERA : y3f.CHAT_ATTACH_PICKER;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        s1();
        super.onActivityPaused(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        tha thaVarQ1;
        if (getView() != null) {
            if (x1().getScrollState() != ccd.a) {
                t1();
            }
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = this.s1;
            if (selectedMediaBottomBarWidget != null && (thaVarQ1 = selectedMediaBottomBarWidget.q1()) != null) {
                thaVarQ1.setText(((ib9) this.g.getValue()).a.i);
            }
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = this.s1;
            if (selectedMediaBottomBarWidget2 != null) {
                selectedMediaBottomBarWidget2.A = this;
            }
        }
        as9 as9VarC1 = C1();
        as9VarC1.x.e();
        as9VarC1.y.e();
        n2e n2eVar = (n2e) this.r.getValue();
        n2eVar.q.e();
        n2eVar.r.e();
        super.onActivityResumed(activity);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object next;
        final ecd ecdVar = new ecd(getContext());
        ecdVar.setId(R.id.media_bar__popup_layout);
        a8g a8gVar = pq3.j;
        a8gVar.h(ecdVar);
        ecdVar.setBackground(new ColorDrawable(-1728053248));
        LinearLayout linearLayout = new LinearLayout(ecdVar.getContext());
        linearLayout.setId(R.id.media_bar__draggable_container);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOutlineProvider(this.B);
        linearLayout.setForeground(this.C);
        n1g.N(new xr1(3, null, 4), linearLayout);
        View frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.media_bar__close_drag_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
        frameLayout.setBackgroundColor(a8gVar.h(frameLayout).getIcon().e);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.media_bar__close_drag_element);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.addView(frameLayout);
        linearLayout.addView(frameLayout2);
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.media_bar__album_chooser);
        rccVar.setTitle(R.string.media_bar_recent);
        rccVar.setLeftActions(new xbc(new ds9(this, 1)));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        rccVar.setPadding(rccVar.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), rccVar.getPaddingRight(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        rccVar.setLayoutParams(layoutParams2);
        rccVar.setTitleClickListener(new cs9(this, 0));
        linearLayout.addView(rccVar);
        tp2 tp2Var = new tp2(getContext());
        tp2Var.setId(R.id.media_bar__partial_media_access_container);
        tp2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(tp2Var);
        FrameLayout frameLayout3 = new FrameLayout(linearLayout.getContext());
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tp2 tp2Var2 = new tp2(getContext());
        tp2Var2.setId(R.id.media_bar__primary_container);
        tp2Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout3.addView(tp2Var2);
        tp2 tp2Var3 = new tp2(getContext());
        tp2Var3.setId(R.id.media_bar__select_album_container);
        tp2Var3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tp2Var3.setVisibility(8);
        frameLayout3.addView(tp2Var3);
        linearLayout.addView(frameLayout3);
        this.E = linearLayout;
        ecdVar.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.media_bar__bottom_layout);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 80;
        linearLayout2.setLayoutParams(layoutParams3);
        tp2 tp2Var4 = new tp2(getContext());
        tp2Var4.setId(R.id.media_bar__selected_media_container);
        linearLayout2.addView(tp2Var4);
        tp2 tp2Var5 = new tp2(getContext());
        tp2Var5.setId(R.id.media_bar__bottom_container);
        linearLayout2.addView(tp2Var5);
        lvb.H(linearLayout2, v1, null);
        n1g.N(new n(3, null, 7), linearLayout2);
        linearLayout2.addOnLayoutChangeListener(new ci1(5, this));
        linearLayout2.setClickable(true);
        ecdVar.addView(linearLayout2);
        wd2 wd2Var = new wd2(getContext());
        wd2Var.setId(R.id.media_bar__camera_container);
        wd2Var.setListener(this);
        h hVar = this.d;
        ExecutorService executorServiceD = ((a2c) hVar.getAccessor().c(27)).d();
        int iIntValue = ((Number) ((e5d) this.r1.getValue()).y2.a(e5d.S6[180]).i()).intValue();
        Iterator it = fg2.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fg2) next).a != iIntValue);
        fg2 fg2Var = (fg2) next;
        if (fg2Var == null) {
            fg2Var = fg2.DEFAULT;
        }
        wd2Var.b((n2e) this.r.getValue(), new uvc(executorServiceD, 0, fg2Var));
        hz1 hz1Var = C1().B;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(hz1Var, i19VarF, n09Var), new el6((lq4) null, wd2Var, 25), 3), getViewLifecycleScope());
        wd2Var.setForeground(this.v);
        ecdVar.addView(wd2Var);
        if (((f5d) ((wo6) hVar.getAccessor().d(54).getValue())).C()) {
            linearLayout2.bringToFront();
        }
        View tp2Var6 = new tp2(ecdVar.getContext());
        tp2Var6.setId(R.id.media_bar__suggestion_container);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        tp2Var6.setLayoutParams(layoutParams4);
        ecdVar.addView(tp2Var6);
        View tp2Var7 = new tp2(ecdVar.getContext());
        tp2Var7.setId(R.id.media_bar__emoji_keyboard_container);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 80;
        tp2Var7.setLayoutParams(layoutParams5);
        int i = uw8.a;
        tp2Var7.setTranslationY(uw8.a(tp2Var7.getContext()));
        lvb.H(tp2Var7, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
        ecdVar.addView(tp2Var7);
        ecdVar.setCallback(new ib(this, 2));
        ecdVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: bs9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                xbd callback;
                LinearLayout linearLayout3 = this.a.E;
                if (linearLayout3 == null || i5 == i9 || (callback = ecdVar.getCallback()) == null) {
                    return;
                }
                callback.m(linearLayout3.getTop());
            }
        });
        e9i.j0(new fz6(n1g.v(uw8.f, getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, this, ecdVar, 9), 3), getViewLifecycleScope());
        return ecdVar;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        x1().setCallback(null);
        ecd ecdVarX1 = x1();
        ValueAnimator valueAnimator = ecdVarX1.e;
        if (valueAnimator != null) {
            lsk.a(valueAnimator);
        }
        ecdVarX1.e = null;
        this.E = null;
        A1().c();
        v1().a();
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ny8 ny8Var = this.e;
        if (i == 159) {
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.n, R.string.permissions_camera_request_photo, R.string.permissions_camera_request_photo_denied, 192);
        } else {
            if (i != 171) {
                return;
            }
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.i, R.string.permissions_audio_for_video_request_denied, R.string.permissions_audio_for_video_not_granted, 192);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gjg gjgVar;
        o56 o56Var;
        r8e r8eVar;
        zv8[] zv8VarArr = u1;
        zp3 zp3Var = (zp3) this.i.m(this, zv8VarArr[2]);
        hve hveVar = zp3Var.a;
        if (!cqk.d(zp3Var.b(), "media_type_picker_widget")) {
            hveVar.S(false);
            lve lveVarE = oc9.e(new MediaTypePickerWidget(this.c, w1()), null, null);
            lveVarE.e("media_type_picker_widget");
            hveVar.T(lveVarE);
        }
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = new SelectedMediaBottomBarWidget(D1(), w1(), true, this.c);
        zv8 zv8Var = zv8VarArr[14];
        j8e j8eVar = this.G;
        zp3 zp3Var2 = (zp3) j8eVar.m(this, zv8Var);
        hve hveVar2 = zp3Var2.a;
        if (!cqk.d(zp3Var2.b(), "selected_media_widget")) {
            hveVar2.S(false);
            lve lveVarE2 = oc9.e(selectedMediaBottomBarWidget, null, null);
            lveVarE2.e("selected_media_widget");
            hveVar2.T(lveVarE2);
        }
        br4 br4VarC = rx8.C(((zp3) j8eVar.m(this, zv8VarArr[14])).a);
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = br4VarC instanceof SelectedMediaBottomBarWidget ? (SelectedMediaBottomBarWidget) br4VarC : null;
        this.s1 = selectedMediaBottomBarWidget2;
        if (selectedMediaBottomBarWidget2 != null) {
            selectedMediaBottomBarWidget2.A = this;
        }
        n09 n09Var = n09.d;
        if (selectedMediaBottomBarWidget2 != null && (o56Var = (o56) selectedMediaBottomBarWidget2.p.getValue()) != null && (r8eVar = o56Var.b) != null) {
            e9i.j0(new fz6(n1g.v(new jz(r8eVar, 13), getViewLifecycleOwner().f(), n09Var), new es9(null, this, 1), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(C1().p, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().z, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.q0(C1().r), getViewLifecycleOwner().f(), n09Var), new es9(null, this, 9), 3), getViewLifecycleScope());
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget3 = this.s1;
        if (selectedMediaBottomBarWidget3 != null && (gjgVar = (gjg) selectedMediaBottomBarWidget3.o.getValue()) != null) {
            e9i.j0(new fz6(n1g.v(gjgVar, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 10), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(C1().A, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 11), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((gi7) this.K.getValue()).d, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 4), 3), getViewLifecycleScope());
        ny8 ny8Var = this.X;
        ic6 ic6Var = ((h7a) ny8Var.getValue()).d;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var2 = n09.c;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var2), new es9(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((h7a) ny8Var.getValue()).e, getViewLifecycleOwner().f(), n09Var2), new es9(null, this, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((n2e) this.r.getValue()).p, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((jdf) this.Z.getValue()).e, getViewLifecycleOwner().f(), n09Var), new es9(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r07(((x9h) this.s.getValue()).t, C1().C, new db3(3, null, 1), 0), getViewLifecycleOwner().f(), n09Var), new es9(null, this, 0), 3), getViewLifecycleScope());
    }

    @Override // defpackage.oef
    public final void q0() {
    }

    public final void s1() {
        if (getView() != null) {
            k2e k2eVar = v1().a;
            if (k2eVar != null) {
                ((hj2) k2eVar.getCameraApi()).e();
            }
            br4 br4VarC = rx8.C(o1(this).a);
            if (br4VarC instanceof MediaBarPermissionWidget) {
                ow0 ow0Var = ((MediaBarPermissionWidget) br4VarC).d;
                if (ow0Var.d()) {
                    ((hj2) ((oc2) ow0Var.getValue())).e();
                }
            }
            br4 br4VarC2 = rx8.C(((zp3) this.n1.m(this, u1[18])).a);
            SelectAlbumWidget selectAlbumWidget = br4VarC2 instanceof SelectAlbumWidget ? (SelectAlbumWidget) br4VarC2 : null;
            if (selectAlbumWidget != null) {
                selectAlbumWidget.p1().j(false);
            }
            B1().setDropdownRotationProgress(0.0f);
            mjg mjgVar = C1().o;
            Boolean bool = Boolean.FALSE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
        }
    }

    public final void t1() {
        if (getView() != null) {
            k2e k2eVar = v1().a;
            if (k2eVar != null) {
                ((hj2) k2eVar.getCameraApi()).d();
            }
            br4 br4VarC = rx8.C(o1(this).a);
            if (br4VarC instanceof MediaBarPermissionWidget) {
                ow0 ow0Var = ((MediaBarPermissionWidget) br4VarC).d;
                if (ow0Var.d()) {
                    ((hj2) ((oc2) ow0Var.getValue())).d();
                }
            }
            mjg mjgVar = C1().o;
            Boolean bool = Boolean.TRUE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
        }
    }

    public final LinearLayout u1() {
        return (LinearLayout) this.I.m(this, u1[16]);
    }

    public final wd2 v1() {
        return (wd2) this.x.m(this, u1[12]);
    }

    public final long w1() {
        zv8 zv8Var = u1[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final ecd x1() {
        return (ecd) this.k.m(this, u1[4]);
    }

    public final tp2 y1() {
        return (tp2) this.o1.m(this, u1[19]);
    }

    public final tp2 z1() {
        return (tp2) this.l.m(this, u1[5]);
    }

    public MediaBarWidget(t3f t3fVar, long j) {
        this(n1g.i(new ylc("scope_id", t3fVar), new ylc("chat_id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
