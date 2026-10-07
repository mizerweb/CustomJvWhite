package one.me.mediaeditor;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.ac3;
import defpackage.acc;
import defpackage.as9;
import defpackage.bc3;
import defpackage.br4;
import defpackage.bs0;
import defpackage.c79;
import defpackage.cf7;
import defpackage.ch8;
import defpackage.col;
import defpackage.cqk;
import defpackage.cw9;
import defpackage.d97;
import defpackage.db3;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.el6;
import defpackage.ew5;
import defpackage.fr4;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ghb;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.gw9;
import defpackage.gx9;
import defpackage.h;
import defpackage.ha9;
import defpackage.hb9;
import defpackage.hr4;
import defpackage.hve;
import defpackage.i7j;
import defpackage.ir9;
import defpackage.j8e;
import defpackage.jcc;
import defpackage.je9;
import defpackage.jef;
import defpackage.jw9;
import defpackage.jz;
import defpackage.kb9;
import defpackage.kc4;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.lw5;
import defpackage.lx9;
import defpackage.mc4;
import defpackage.meh;
import defpackage.mjg;
import defpackage.mxj;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.noh;
import defpackage.np4;
import defpackage.npb;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oef;
import defpackage.oi8;
import defpackage.ore;
import defpackage.pll;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qc3;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.r07;
import defpackage.rb6;
import defpackage.rcc;
import defpackage.rj5;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.s0a;
import defpackage.sr0;
import defpackage.suc;
import defpackage.t3f;
import defpackage.t5a;
import defpackage.t73;
import defpackage.tha;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tpe;
import defpackage.u3m;
import defpackage.upe;
import defpackage.uw8;
import defpackage.vk4;
import defpackage.vnh;
import defpackage.vp4;
import defpackage.vuc;
import defpackage.vv;
import defpackage.wb6;
import defpackage.wr4;
import defpackage.wy7;
import defpackage.x9h;
import defpackage.xbc;
import defpackage.xc0;
import defpackage.xc3;
import defpackage.xd3;
import defpackage.xw3;
import defpackage.y26;
import defpackage.y8j;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.yv9;
import defpackage.yw4;
import defpackage.z26;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.chatmedia.viewer.BaseMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.sdk.arch.Widget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBM\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\r\u0010\u001b¨\u0006\u001c"}, d2 = {"Lone/me/mediaeditor/MediaEditScreen;", "Lone/me/chatmedia/viewer/BaseMediaViewerScreen;", "Lkb9;", "Lz4f;", "Lvp4;", "Lmc4;", "Loef;", "Lyw4;", "Lvuc;", "Ls5a;", "Lfr4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialId", "", "isMultiSelect", "isMessageEdit", ApiProtocol.PARAM_CHAT_ID, "Lt3f;", "mediaBarScopeId", "Lru/ok/tamtam/chats/MessageLocalId;", "messageLocalId", "Lha9;", "localAccountId", "(JZZLjava/lang/Long;Lt3f;Ljava/lang/Long;Lha9;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaEditScreen extends BaseMediaViewerScreen<kb9> implements z4f, vp4, mc4, oef, yw4, vuc, fr4 {
    public static final /* synthetic */ zv8[] w1 = {new dwd(MediaEditScreen.class, "viewModelScopeId", "getViewModelScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, MediaEditScreen.class, "initialMediaId", "getInitialMediaId()J", 0), new dwd(MediaEditScreen.class, "isMultiSelect", "isMultiSelect()Z", 0), new dwd(MediaEditScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;", 0), new dwd(MediaEditScreen.class, "messageId", "getMessageId()Ljava/lang/Long;", 0), new dwd(MediaEditScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(MediaEditScreen.class, "counter", "getCounter()Lone/me/sdk/gallery/view/NumericCheckButton;", 0), new dwd(MediaEditScreen.class, "videoMuteAction", "getVideoMuteAction()Landroid/widget/ImageView;", 0), new dwd(MediaEditScreen.class, "videoQualityAction", "getVideoQualityAction()Landroid/widget/TextView;", 0), new dwd(MediaEditScreen.class, "photoCropAction", "getPhotoCropAction()Landroid/widget/ImageView;", 0), new dwd(MediaEditScreen.class, "photoDrawAction", "getPhotoDrawAction()Landroid/widget/ImageView;", 0), new dwd(MediaEditScreen.class, "selectedMediaRouter", "getSelectedMediaRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaEditScreen.class, "trimStartTimeline", "getTrimStartTimeline()Landroid/widget/TextView;", 0), new dwd(MediaEditScreen.class, "trimEndTimeline", "getTrimEndTimeline()Landroid/widget/TextView;", 0), new dwd(MediaEditScreen.class, "trimTimeline", "getTrimTimeline()Landroid/view/ViewGroup;", 0), new dwd(MediaEditScreen.class, "trimSliderRouter", "getTrimSliderRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaEditScreen.class, "trimSliderContainer", "getTrimSliderContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaEditScreen.class, "suggestionsContainer", "getSuggestionsContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaEditScreen.class, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaEditScreen.class, "actions", "getActions()Landroid/view/ViewGroup;", 0), new dwd(MediaEditScreen.class, "bottomContainer", "getBottomContainer()Landroid/view/ViewGroup;", 0)};
    public final j8e A;
    public final j8e B;
    public final j8e C;
    public final j8e D;
    public final j8e E;
    public final j8e F;
    public final j8e G;
    public final j8e H;
    public final j8e I;
    public final j8e J;
    public final ny8 K;
    public final j8e X;
    public final j8e Y;
    public final j8e Z;
    public final j8e n1;
    public final j8e o1;
    public final String p;
    public final j8e p1;
    public final vv q;
    public final s0a q1;
    public final vv r;
    public final oi8 r1;
    public final vv s;
    public mxj s1;
    public final vv t;
    public AnimatorSet t1;
    public final vv u;
    public SelectedMediaBottomBarWidget u1;
    public final h v;
    public final rj5 v1;
    public final ny8 w;
    public final z26 x;
    public final ny8 y;
    public final ny8 z;

    public MediaEditScreen(Bundle bundle) {
        super(bundle);
        this.p = MediaEditScreen.class.getName();
        this.q = new vv("scope_id", t3f.class);
        Class<Long> cls = Long.class;
        this.r = new vv("initial_id", cls);
        this.s = new vv("multi_select", Boolean.class);
        this.t = new vv("chat_id", cls);
        this.u = new vv("message_id", cls);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.v = hVar;
        this.w = hVar.getAccessor().d(26);
        this.x = (z26) hVar.getAccessor().c(961);
        this.y = createViewModelLazy(lx9.class, new ch8(17, new cw9(this, 0)));
        this.z = createViewModelLazy(x9h.class, new ch8(18, new cw9(this, 2)));
        this.A = viewBinding(R.id.media_editor_toolbar_id);
        this.B = viewBinding(R.id.media_editor_selected_counter);
        this.C = viewBinding(R.id.media_editor_video_sound_action_id);
        this.D = viewBinding(R.id.media_editor_video_quality_action_id);
        this.E = viewBinding(R.id.media_editor_photo_crop_action_id);
        this.F = viewBinding(R.id.media_editor_photo_draw_action_id);
        this.G = childSlotRouter(R.id.media_editor_selected_media_container);
        this.H = viewBinding(R.id.media_editor_trim_start);
        this.I = viewBinding(R.id.media_editor_trim_end);
        this.J = viewBinding(R.id.media_editor_trim_timeline);
        this.K = ysc.a.a();
        this.X = childSlotRouter(R.id.media_editor_video_trim_container_id);
        this.Y = viewBinding(R.id.media_editor_video_trim_container_id);
        this.Z = viewBinding(R.id.media_editor_suggestion_container_id);
        this.n1 = childSlotRouter(R.id.media_editor_suggestion_container_id);
        this.o1 = viewBinding(R.id.media_editor_actions_id);
        this.p1 = viewBinding(R.id.media_editor_bottom_container_id);
        s0a s0aVar = new s0a(this, this.d, ((a2c) hVar.getAccessor().c(27)).a());
        int i = 3;
        s0aVar.g = 3;
        while (s0aVar.e.i() > s0aVar.g) {
            s0aVar.e.h(((Number) s0aVar.f.remove(0)).longValue());
        }
        this.q1 = s0aVar;
        this.r1 = oi8.f;
        this.v1 = new rj5(19, this);
        e9i.j0(new fz6(new xc3(a2().u, 12), new gw9(this, null), i), getLifecycleScope());
    }

    public static final ImageView P1(MediaEditScreen mediaEditScreen) {
        return (ImageView) mediaEditScreen.E.m(mediaEditScreen, w1[9]);
    }

    public static final ImageView Q1(MediaEditScreen mediaEditScreen) {
        return (ImageView) mediaEditScreen.F.m(mediaEditScreen, w1[10]);
    }

    public static final tp2 R1(MediaEditScreen mediaEditScreen) {
        return (tp2) mediaEditScreen.Y.m(mediaEditScreen, w1[16]);
    }

    public static final ViewGroup S1(MediaEditScreen mediaEditScreen) {
        return (ViewGroup) mediaEditScreen.J.m(mediaEditScreen, w1[14]);
    }

    public static final ImageView T1(MediaEditScreen mediaEditScreen) {
        return (ImageView) mediaEditScreen.C.m(mediaEditScreen, w1[7]);
    }

    public static final TextView U1(MediaEditScreen mediaEditScreen) {
        return (TextView) mediaEditScreen.D.m(mediaEditScreen, w1[8]);
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        lx9 lx9VarA2 = a2();
        Uri uri = sucVar.c;
        int i = 27;
        a8j.t(lx9VarA2, ((n0c) lx9VarA2.H()).a(), new vk4(i, (lq4) null, lx9VarA2, sucVar.b, sucVar.d, uri), 2);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final int D1() {
        return 0;
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        a2().V(i, bundle);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final sr0 E1() {
        return this.q1;
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void H1() {
        if (a2().D.a.getValue() == wr4.c) {
            t5a t5aVar = this.m;
            if (t5aVar != null) {
                t5aVar.b();
            }
            a2().N();
        }
    }

    @Override // defpackage.a6j
    public final void I0(long j) {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.j(j, "onProgressChange: "), null);
        }
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void I1() {
        a2().N();
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void K1() {
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(X1());
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void L1() {
        lx9 lx9VarA2 = a2();
        hb9 hb9VarG = lx9VarA2.G();
        if (hb9VarG != null) {
            if (hb9VarG.b()) {
                a8j.x(lx9VarA2.n1, new rb6(hb9VarG));
                return;
            } else {
                if (hb9VarG.c()) {
                    lx9VarA2.F(hb9VarG.b);
                    return;
                }
                return;
            }
        }
        String str = lx9VarA2.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "mediaEditor: refreshContent - currentItem is null!", null);
        }
    }

    @Override // defpackage.a6j
    public final void N0() {
        d2(true, false);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void N1() {
        Object value;
        lx9 lx9VarA2 = a2();
        lx9VarA2.E();
        mjg mjgVar = lx9VarA2.C;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, wr4.d));
    }

    @Override // defpackage.oef
    public final void O0() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "MediaEditScreen: onDelayedSendConfirmed", null);
            }
        }
        b2();
    }

    @Override // defpackage.oef
    public final void Q0() {
    }

    @Override // defpackage.z4f
    public final Integer R() {
        return Integer.valueOf(W1());
    }

    public final void V1() {
        Activity activity;
        Window window;
        mxj mxjVar = this.s1;
        if (mxjVar != null) {
            mxjVar.a(1);
        }
        if (Build.VERSION.SDK_INT < 29 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(false);
    }

    @Override // defpackage.a6j
    public final void W(float f) {
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        if (!cqk.d(br4Var2, this) || cqk.d(br4Var, this) || (br4Var instanceof PhotoEditScreen)) {
            return;
        }
        this.x.a();
    }

    public final int W1() {
        return pq3.j.e(getContext()).j().b.b().c;
    }

    @Override // defpackage.oef
    public final hb9 X0() {
        return a2().G();
    }

    public final int X1() {
        return pq3.j.e(getContext()).j().b.p().b;
    }

    public final rcc Y1() {
        return (rcc) this.A.m(this, w1[5]);
    }

    public final VideoTrimSliderWidget Z1() {
        br4 br4VarC = rx8.C(((zp3) this.X.m(this, w1[15])).a);
        if (br4VarC instanceof VideoTrimSliderWidget) {
            return (VideoTrimSliderWidget) br4VarC;
        }
        return null;
    }

    public final lx9 a2() {
        return (lx9) this.y.getValue();
    }

    @Override // defpackage.oef
    public final void b0(t73 t73Var, rt2 rt2Var) {
        int i = uw8.a;
        if (uw8.b(uw8.c)) {
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = this.u1;
            if (selectedMediaBottomBarWidget != null) {
                selectedMediaBottomBarWidget.q1().h(false);
                return;
            }
            return;
        }
        if (t73Var.h()) {
            if (rt2Var == null || !pll.d(rt2Var, (e5d) this.w.getValue(), true, null)) {
                b2();
                return;
            }
            lx9 lx9VarA2 = a2();
            lx9VarA2.getClass();
            String strF = rt2Var.F();
            if (strF == null) {
                strF = "";
            }
            int i2 = 32;
            a8j.x(lx9VarA2.n1, new wb6(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(new Object[]{strF})), xw3.P0(new kc4(R.id.chat_screen__confirm_send_message_positive, new tnh(R.string.oneme_confirm_send_message_positive), 3, i2), new kc4(R.id.chat_screen__confirm_send_message_negative, new tnh(R.string.oneme_confirm_send_message_negative), 2, i2))));
        }
    }

    public final void b2() {
        br4 br4Var;
        hve router = getRouter();
        zv zvVar = new zv();
        zvVar.addLast(router);
        loop0: while (true) {
            if (zvVar.isEmpty()) {
                br4Var = null;
                break;
            }
            ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
            for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                br4Var = ((lve) arrayListE.get(iO0)).a;
                if (br4Var instanceof ChatScreen) {
                    break loop0;
                }
                Iterator it = new upe(br4Var.getChildRouters()).iterator();
                while (true) {
                    ListIterator listIterator = ((tpe) it).b;
                    if (listIterator.hasPrevious()) {
                        zvVar.addLast((hve) listIterator.previous());
                    }
                }
            }
        }
        ChatScreen chatScreen = (ChatScreen) br4Var;
        if (chatScreen != null) {
            Long lF = chatScreen.U1().F();
            chatScreen.U1().Q(null);
            if (lF == null) {
                chatScreen.k2().E();
            }
            xd3 xd3VarK2 = chatScreen.k2();
            xd3VarK2.N(qc3.b);
            a8j.x(xd3VarK2.L1, ac3.a);
            as9 as9VarS1 = chatScreen.S1();
            as9VarS1.C().a.i = null;
            a8j.x(as9VarS1.v, ir9.a);
        }
        yv9.b.l();
    }

    @Override // defpackage.oef
    public final void c0() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        br4 br4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "MediaEditScreen: onFinishEditMessage", null);
            }
        }
        hve router = getRouter();
        zv zvVar = new zv();
        zvVar.addLast(router);
        loop0: while (!zvVar.isEmpty()) {
            ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
            for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                br4 br4Var2 = ((lve) arrayListE.get(iO0)).a;
                if (br4Var2 instanceof ChatScreen) {
                    br4Var = br4Var2;
                    break loop0;
                }
                Iterator it = new upe(br4Var2.getChildRouters()).iterator();
                while (true) {
                    tpe tpeVar = (tpe) it;
                    if (tpeVar.b.hasPrevious()) {
                        zvVar.addLast((hve) tpeVar.b.previous());
                    }
                }
            }
        }
        ChatScreen chatScreen = (ChatScreen) br4Var;
        if (chatScreen != null) {
            a8j.x(chatScreen.k2().L1, bc3.a);
        }
    }

    public final void c2() {
        e3j e3jVarW0 = w0();
        ghb ghbVar = ew5.b;
        this.k = e9i.j0(new fz6(n1g.v(u3m.b(e3jVarW0, qe7.O(50, lw5.MILLISECONDS)), getViewLifecycleOwner().f(), n09.d), new gw9(null, this, 13), 3), getViewLifecycleScope());
    }

    public final void d2(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.t1;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = z2 ? 1.0f : 0.0f;
            c79 c79VarW = yab.w();
            t5a t5aVar = this.m;
            ObjectAnimator objectAnimatorOfFloat = t5aVar != null ? ObjectAnimator.ofFloat(t5aVar.a(), (Property<ImageView, Float>) View.ALPHA, t5aVar.a().getAlpha(), f) : null;
            if (z && objectAnimatorOfFloat != null) {
                c79VarW.add(objectAnimatorOfFloat);
            }
            c79 c79VarJ = yab.j(c79VarW);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(c79VarJ);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new jw9(z, this, f));
            animatorSet2.addListener(new jw9(f, z, this));
            animatorSet2.start();
            this.t1 = animatorSet2;
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        lx9 lx9VarA2 = a2();
        zv8[] zv8VarArr = lx9.F1;
        lx9VarA2.V(i, null);
    }

    @Override // defpackage.oef
    public final void g0() {
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getR1() {
        return this.r1;
    }

    @Override // defpackage.oef
    public final void h(jef jefVar) {
        lx9 lx9VarA2 = a2();
        lx9VarA2.x1.B(lx9VarA2, lx9.F1[8], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new el6(lx9VarA2, jefVar, null, 29)));
    }

    @Override // defpackage.z4f
    public final void j(Window window) {
        super.j(window);
        V1();
    }

    @Override // defpackage.as0
    public final void k() {
        d2(false, false);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        getRouter().a(this);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        int iOrdinal = hr4Var.ordinal();
        if (iOrdinal == 1) {
            V1();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            V1();
        }
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
        meh mehVar = new meh(getContext());
        mehVar.setId(R.id.media_editor_container_id);
        mehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mehVar.setBackgroundColor(W1());
        LinearLayout linearLayout = new LinearLayout(mehVar.getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.media_editor_toolbar_id);
        rccVar.setForm(gcc.Compact);
        rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        final int i2 = 0;
        rccVar.setLeftActions(new xbc(new cf7(this) { // from class: dw9
            public final /* synthetic */ MediaEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                MediaEditScreen mediaEditScreen = this.b;
                zv8[] zv8VarArr = MediaEditScreen.w1;
                switch (i3) {
                    case 0:
                        a8j.x(mediaEditScreen.a2().s, rt3.b);
                        break;
                    default:
                        mediaEditScreen.a2().M();
                        break;
                }
                return sbiVar;
            }
        }));
        rccVar.setRightActions(new acc(null, new jcc(R.drawable.icon_file, null, null, null, 0.0f, new cf7(this) { // from class: dw9
            public final /* synthetic */ MediaEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i;
                sbi sbiVar = sbi.a;
                MediaEditScreen mediaEditScreen = this.b;
                zv8[] zv8VarArr = MediaEditScreen.w1;
                switch (i3) {
                    case 0:
                        a8j.x(mediaEditScreen.a2().s, rt3.b);
                        break;
                    default:
                        mediaEditScreen.a2().M();
                        break;
                }
                return sbiVar;
            }
        }, 254), null));
        rccVar.setBackgroundColor(W1());
        linearLayout.addView(rccVar);
        y8j y8jVar = new y8j(linearLayout.getContext());
        y8jVar.setId(R.id.oneme_chatmedia_viewer_pager);
        y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y8jVar.setAdapter(this.q1);
        lvb.m0(y8jVar);
        linearLayout.addView(y8jVar);
        mehVar.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(mehVar.getContext());
        linearLayout2.setId(R.id.media_editor_bottom_container_id);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout2.setLayoutParams(layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setId(R.id.media_editor_actions_id);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout3.setBackgroundColor(X1());
        FrameLayout frameLayout = new FrameLayout(linearLayout3.getContext());
        frameLayout.setId(R.id.media_editor_trim_timeline);
        frameLayout.setVisibility(8);
        frameLayout.setBackgroundColor(X1());
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(R.id.media_editor_trim_start);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388627;
        textView.setLayoutParams(layoutParams2);
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        noh nohVar = q9i.s;
        q9i.a(nohVar, textView);
        frameLayout.addView(textView);
        TextView textView2 = new TextView(frameLayout.getContext());
        textView2.setId(R.id.media_editor_trim_end);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388629;
        textView2.setLayoutParams(layoutParams3);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().b);
        q9i.a(nohVar, textView2);
        frameLayout.addView(textView2);
        linearLayout3.addView(frameLayout);
        View tp2Var = new tp2(linearLayout3.getContext());
        tp2Var.setId(R.id.media_editor_video_trim_container_id);
        tp2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout3.addView(tp2Var);
        FrameLayout frameLayout2 = new FrameLayout(linearLayout3.getContext());
        frameLayout2.setId(R.id.media_editor_photo_actions_id);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(frameLayout2.getContext());
        linearLayout4.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        linearLayout4.setLayoutParams(layoutParams4);
        final ImageView imageView = new ImageView(linearLayout4.getContext());
        imageView.setId(R.id.media_editor_photo_crop_action_id);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        layoutParams5.gravity = 17;
        layoutParams5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(18.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        imageView.setLayoutParams(layoutParams5);
        imageView.setVisibility(8);
        int i3 = ((bs0) a8gVar.h(imageView).u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        a8gVar.l(imageView);
        paint.setColor(-1);
        imageView.setBackground(col.b(i3, null, shapeDrawable));
        imageView.setImageResource(R.drawable.icon_crop);
        a8gVar.l(imageView);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        final int i4 = 0;
        qe7.H(imageView, 300L, new View.OnClickListener() { // from class: ew9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq4 lq4Var = null;
                switch (i4) {
                    case 0:
                        ImageView imageView2 = imageView;
                        MediaEditScreen mediaEditScreen = this;
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        p0m.a(imageView2, kt7.CLOCK_TICK);
                        lx9 lx9VarA2 = mediaEditScreen.a2();
                        je9 je9Var = je9.f;
                        hb9 hb9VarG = lx9VarA2.G();
                        if (hb9VarG != null) {
                            vo8 vo8VarL = lx9VarA2.L();
                            if ((vo8VarL != null && vo8VarL.isActive()) || !hb9VarG.b()) {
                                String str = lx9VarA2.d;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    vo8 vo8VarL2 = lx9VarA2.L();
                                    Boolean boolValueOf = vo8VarL2 != null ? Boolean.valueOf(vo8VarL2.isActive()) : null;
                                    a4cVar.c(je9Var, str, "media editor: onCropClicked isActive: " + boolValueOf + ", isPhoto: " + hb9VarG.b(), null);
                                }
                            } else {
                                lx9VarA2.w1.B(lx9VarA2, lx9.F1[7], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).b(), 2, new gv7(lx9VarA2, hb9VarG, lq4Var, 8)));
                            }
                        } else {
                            String str2 = lx9VarA2.d;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "media editor: onCropClicked no current item", null);
                            }
                        }
                        break;
                    default:
                        ImageView imageView3 = imageView;
                        MediaEditScreen mediaEditScreen2 = this;
                        zv8[] zv8VarArr2 = MediaEditScreen.w1;
                        p0m.a(imageView3, kt7.CLOCK_TICK);
                        lx9 lx9VarA3 = mediaEditScreen2.a2();
                        je9 je9Var2 = je9.f;
                        hb9 hb9VarG2 = lx9VarA3.G();
                        if (hb9VarG2 != null) {
                            vo8 vo8VarL3 = lx9VarA3.L();
                            if ((vo8VarL3 != null && vo8VarL3.isActive()) || !hb9VarG2.b()) {
                                String str3 = lx9VarA3.d;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                    vo8 vo8VarL4 = lx9VarA3.L();
                                    Boolean boolValueOf2 = vo8VarL4 != null ? Boolean.valueOf(vo8VarL4.isActive()) : null;
                                    a4cVar3.c(je9Var2, str3, "media editor: onDrawClicked isActive: " + boolValueOf2 + ", isPhoto: " + hb9VarG2.b(), null);
                                }
                            } else {
                                lx9VarA3.w1.B(lx9VarA3, lx9.F1[7], yab.h0(lx9VarA3.b, ((n0c) lx9VarA3.H()).b(), 2, new gv7(lx9VarA3, hb9VarG2, lq4Var, 9)));
                            }
                        } else {
                            String str4 = lx9VarA3.d;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                a4cVar4.c(je9Var2, str4, "media editor: onDrawClicked no current item", null);
                            }
                        }
                        break;
                }
            }
        });
        linearLayout4.addView(imageView);
        final ImageView imageView2 = new ImageView(linearLayout4.getContext());
        imageView2.setId(R.id.media_editor_photo_draw_action_id);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        layoutParams6.gravity = 17;
        layoutParams6.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        imageView2.setLayoutParams(layoutParams6);
        imageView2.setVisibility(8);
        int i5 = ((bs0) a8gVar.h(imageView2).u().c.g).c;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint2 = shapeDrawable2.getPaint();
        a8gVar.l(imageView2);
        paint2.setColor(-1);
        imageView2.setBackground(col.b(i5, null, shapeDrawable2));
        imageView2.setImageResource(R.drawable.icon_paint);
        a8gVar.l(imageView2);
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        final int i6 = 1;
        qe7.H(imageView2, 300L, new View.OnClickListener() { // from class: ew9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lq4 lq4Var = null;
                switch (i6) {
                    case 0:
                        ImageView imageView3 = imageView2;
                        MediaEditScreen mediaEditScreen = this;
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        p0m.a(imageView3, kt7.CLOCK_TICK);
                        lx9 lx9VarA2 = mediaEditScreen.a2();
                        je9 je9Var = je9.f;
                        hb9 hb9VarG = lx9VarA2.G();
                        if (hb9VarG != null) {
                            vo8 vo8VarL = lx9VarA2.L();
                            if ((vo8VarL != null && vo8VarL.isActive()) || !hb9VarG.b()) {
                                String str = lx9VarA2.d;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    vo8 vo8VarL2 = lx9VarA2.L();
                                    Boolean boolValueOf = vo8VarL2 != null ? Boolean.valueOf(vo8VarL2.isActive()) : null;
                                    a4cVar.c(je9Var, str, "media editor: onCropClicked isActive: " + boolValueOf + ", isPhoto: " + hb9VarG.b(), null);
                                }
                            } else {
                                lx9VarA2.w1.B(lx9VarA2, lx9.F1[7], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).b(), 2, new gv7(lx9VarA2, hb9VarG, lq4Var, 8)));
                            }
                        } else {
                            String str2 = lx9VarA2.d;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "media editor: onCropClicked no current item", null);
                            }
                        }
                        break;
                    default:
                        ImageView imageView4 = imageView2;
                        MediaEditScreen mediaEditScreen2 = this;
                        zv8[] zv8VarArr2 = MediaEditScreen.w1;
                        p0m.a(imageView4, kt7.CLOCK_TICK);
                        lx9 lx9VarA3 = mediaEditScreen2.a2();
                        je9 je9Var2 = je9.f;
                        hb9 hb9VarG2 = lx9VarA3.G();
                        if (hb9VarG2 != null) {
                            vo8 vo8VarL3 = lx9VarA3.L();
                            if ((vo8VarL3 != null && vo8VarL3.isActive()) || !hb9VarG2.b()) {
                                String str3 = lx9VarA3.d;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                    vo8 vo8VarL4 = lx9VarA3.L();
                                    Boolean boolValueOf2 = vo8VarL4 != null ? Boolean.valueOf(vo8VarL4.isActive()) : null;
                                    a4cVar3.c(je9Var2, str3, "media editor: onDrawClicked isActive: " + boolValueOf2 + ", isPhoto: " + hb9VarG2.b(), null);
                                }
                            } else {
                                lx9VarA3.w1.B(lx9VarA3, lx9.F1[7], yab.h0(lx9VarA3.b, ((n0c) lx9VarA3.H()).b(), 2, new gv7(lx9VarA3, hb9VarG2, lq4Var, 9)));
                            }
                        } else {
                            String str4 = lx9VarA3.d;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                a4cVar4.c(je9Var2, str4, "media editor: onDrawClicked no current item", null);
                            }
                        }
                        break;
                }
            }
        });
        linearLayout4.addView(imageView2);
        TextView textView3 = new TextView(linearLayout4.getContext());
        textView3.setId(R.id.media_editor_video_quality_action_id);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        layoutParams7.gravity = 17;
        layoutParams7.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        textView3.setLayoutParams(layoutParams7);
        textView3.setVisibility(8);
        textView3.setText(np4.q(getContext(), R.string.video_auto_quality).toLowerCase(Locale.ROOT));
        int i7 = ((bs0) a8gVar.h(textView3).u().c.g).c;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
        Paint paint3 = shapeDrawable3.getPaint();
        a8gVar.l(textView3);
        paint3.setColor(-1);
        textView3.setBackground(col.b(i7, null, shapeDrawable3));
        a8gVar.l(textView3);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_quality_surround);
        qe7.K(-1, drawable);
        textView3.setForeground(drawable);
        noh nohVar2 = q9i.d;
        q9i.a(nohVar2, textView3);
        textView3.setTextAlignment(4);
        a8gVar.l(textView3);
        textView3.setTextColor(-1);
        textView3.setPadding(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, textView3.getPaddingLeft()), zo5.b(5.0f, yl5.d().getDisplayMetrics().density, textView3.getPaddingTop()), zo5.b(6.0f, yl5.d().getDisplayMetrics().density, textView3.getPaddingRight()), zo5.b(7.0f, yl5.d().getDisplayMetrics().density, textView3.getPaddingBottom()));
        final int i8 = 0;
        qe7.H(textView3, 300L, new View.OnClickListener(this) { // from class: fw9
            public final /* synthetic */ MediaEditScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                lq4 lq4Var = null;
                MediaEditScreen mediaEditScreen = this.b;
                switch (i9) {
                    case 0:
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        lx9 lx9VarA2 = mediaEditScreen.a2();
                        lx9VarA2.y1.B(lx9VarA2, lx9.F1[9], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new ax9(lx9VarA2, lq4Var, 3)));
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = MediaEditScreen.w1;
                        lx9 lx9VarA3 = mediaEditScreen.a2();
                        lx9VarA3.v1.B(lx9VarA3, lx9.F1[6], yab.h0(lx9VarA3.b, ((n0c) lx9VarA3.H()).a(), 2, new ax9(lx9VarA3, lq4Var, 1)));
                        break;
                    default:
                        zv8[] zv8VarArr3 = MediaEditScreen.w1;
                        lx9 lx9VarA4 = mediaEditScreen.a2();
                        hb9 hb9VarG = lx9VarA4.G();
                        if (hb9VarG != null) {
                            lx9VarA4.K().a.w(hb9VarG);
                            a8j.x(lx9VarA4.w, sbi.a);
                            break;
                        } else {
                            String str = lx9VarA4.d;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "toggleMediaSelection: current media is null", null);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout4.addView(textView3);
        ImageView imageView3 = new ImageView(linearLayout4.getContext());
        imageView3.setId(R.id.media_editor_video_sound_action_id);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        layoutParams8.gravity = 17;
        layoutParams8.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        imageView3.setLayoutParams(layoutParams8);
        imageView3.setVisibility(8);
        int i9 = ((bs0) a8gVar.h(imageView3).u().c.g).c;
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(new OvalShape());
        Paint paint4 = shapeDrawable4.getPaint();
        a8gVar.l(imageView3);
        paint4.setColor(-1);
        imageView3.setBackground(col.b(i9, null, shapeDrawable4));
        imageView3.setImageResource(R.drawable.icon_sound);
        a8gVar.l(imageView3);
        imageView3.setImageTintList(ColorStateList.valueOf(-1));
        final int i10 = 1;
        qe7.H(imageView3, 300L, new View.OnClickListener(this) { // from class: fw9
            public final /* synthetic */ MediaEditScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                lq4 lq4Var = null;
                MediaEditScreen mediaEditScreen = this.b;
                switch (i11) {
                    case 0:
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        lx9 lx9VarA2 = mediaEditScreen.a2();
                        lx9VarA2.y1.B(lx9VarA2, lx9.F1[9], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new ax9(lx9VarA2, lq4Var, 3)));
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = MediaEditScreen.w1;
                        lx9 lx9VarA3 = mediaEditScreen.a2();
                        lx9VarA3.v1.B(lx9VarA3, lx9.F1[6], yab.h0(lx9VarA3.b, ((n0c) lx9VarA3.H()).a(), 2, new ax9(lx9VarA3, lq4Var, 1)));
                        break;
                    default:
                        zv8[] zv8VarArr3 = MediaEditScreen.w1;
                        lx9 lx9VarA4 = mediaEditScreen.a2();
                        hb9 hb9VarG = lx9VarA4.G();
                        if (hb9VarG != null) {
                            lx9VarA4.K().a.w(hb9VarG);
                            a8j.x(lx9VarA4.w, sbi.a);
                            break;
                        } else {
                            String str = lx9VarA4.d;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "toggleMediaSelection: current media is null", null);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout4.addView(imageView3);
        frameLayout2.addView(linearLayout4);
        npb npbVar = new npb(frameLayout2.getContext());
        npbVar.setId(R.id.media_editor_selected_counter);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        layoutParams9.gravity = 8388629;
        layoutParams9.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        npbVar.setLayoutParams(layoutParams9);
        npbVar.setGravity(17);
        npbVar.setMaxLines(1);
        npbVar.setSingleLine(true);
        npbVar.setPadding(0, 0, 0, 0);
        npbVar.setTextAlignment(1);
        a8gVar.l(npbVar);
        npbVar.setTextColor(-1);
        q9i.a(nohVar2, npbVar);
        final int i11 = 2;
        qe7.H(npbVar, 300L, new View.OnClickListener(this) { // from class: fw9
            public final /* synthetic */ MediaEditScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                lq4 lq4Var = null;
                MediaEditScreen mediaEditScreen = this.b;
                switch (i12) {
                    case 0:
                        zv8[] zv8VarArr = MediaEditScreen.w1;
                        lx9 lx9VarA2 = mediaEditScreen.a2();
                        lx9VarA2.y1.B(lx9VarA2, lx9.F1[9], yab.h0(lx9VarA2.b, ((n0c) lx9VarA2.H()).a(), 2, new ax9(lx9VarA2, lq4Var, 3)));
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = MediaEditScreen.w1;
                        lx9 lx9VarA3 = mediaEditScreen.a2();
                        lx9VarA3.v1.B(lx9VarA3, lx9.F1[6], yab.h0(lx9VarA3.b, ((n0c) lx9VarA3.H()).a(), 2, new ax9(lx9VarA3, lq4Var, 1)));
                        break;
                    default:
                        zv8[] zv8VarArr3 = MediaEditScreen.w1;
                        lx9 lx9VarA4 = mediaEditScreen.a2();
                        hb9 hb9VarG = lx9VarA4.G();
                        if (hb9VarG != null) {
                            lx9VarA4.K().a.w(hb9VarG);
                            a8j.x(lx9VarA4.w, sbi.a);
                            break;
                        } else {
                            String str = lx9VarA4.d;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "toggleMediaSelection: current media is null", null);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout2.addView(npbVar);
        linearLayout3.addView(frameLayout2);
        linearLayout2.addView(linearLayout3);
        View tp2Var2 = new tp2(linearLayout2.getContext());
        tp2Var2.setId(R.id.media_editor_selected_media_container);
        tp2Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout2.addView(tp2Var2);
        mehVar.addView(linearLayout2);
        View tp2Var3 = new tp2(mehVar.getContext());
        tp2Var3.setId(R.id.media_editor_suggestion_container_id);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams10.gravity = 80;
        layoutParams10.bottomMargin = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        tp2Var3.setLayoutParams(layoutParams10);
        mehVar.addView(tp2Var3);
        Activity activity = getActivity();
        if (activity != null) {
            mxj mxjVar = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
            mxjVar.a.b0();
            this.s1 = mxjVar;
        }
        this.m = new t5a(mehVar, this);
        return mehVar;
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        V1();
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((zp3) this.n1.m(this, w1[18])).c();
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        getRouter().M(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009f  */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i;
        gjg gjgVar;
        tha thaVarQ1;
        a8g a8gVar = pq3.j;
        n09 n09Var = n09.d;
        super.onViewCreated(view);
        String str = this.p;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Media editor pager state save limit=3", null);
            }
        }
        vv vvVar = this.q;
        zv8[] zv8VarArr = w1;
        zv8 zv8Var = zv8VarArr[0];
        t3f t3fVar = (t3f) vvVar.a(this);
        vv vvVar2 = this.t;
        int i2 = 3;
        zv8 zv8Var2 = zv8VarArr[3];
        Long l = (Long) vvVar2.a(this);
        int i3 = 9;
        int i4 = 2;
        if (t3fVar == null || l == null) {
            i = 11;
        } else {
            if (rx8.C(((zp3) this.G.m(this, zv8VarArr[11])).a) == null) {
                zp3 zp3Var = (zp3) this.G.m(this, zv8VarArr[11]);
                hve hveVar = zp3Var.a;
                if (cqk.d(zp3Var.b(), "selected_media_widget")) {
                    i = 11;
                } else {
                    hveVar.S(false);
                    i = 11;
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = new SelectedMediaBottomBarWidget(t3fVar, l.longValue(), false, this.d);
                    selectedMediaBottomBarWidget.u1(a8gVar.e(getContext()).j().b);
                    lve lveVarE = oc9.e(selectedMediaBottomBarWidget, null, null);
                    lveVarE.e("selected_media_widget");
                    hveVar.T(lveVarE);
                }
            } else {
                i = 11;
            }
            br4 br4VarC = rx8.C(((zp3) this.G.m(this, zv8VarArr[i])).a);
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = br4VarC instanceof SelectedMediaBottomBarWidget ? (SelectedMediaBottomBarWidget) br4VarC : null;
            this.u1 = selectedMediaBottomBarWidget2;
            if (selectedMediaBottomBarWidget2 == null) {
                selectedMediaBottomBarWidget2 = null;
            }
            int i5 = 1;
            if (selectedMediaBottomBarWidget2 != null) {
                selectedMediaBottomBarWidget2.u1(a8gVar.e(getContext()).j().b);
                selectedMediaBottomBarWidget2.q1().setTransparent(true);
            }
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget3 = this.u1;
            if (selectedMediaBottomBarWidget3 != null) {
                selectedMediaBottomBarWidget3.A = this;
            }
            if (selectedMediaBottomBarWidget3 != null && (thaVarQ1 = selectedMediaBottomBarWidget3.q1()) != null) {
                WeakHashMap weakHashMap = i7j.a;
                if (!thaVarQ1.isLaidOut() || thaVarQ1.isLayoutRequested()) {
                    thaVarQ1.addOnLayoutChangeListener(new xc0(i3, this));
                } else {
                    y8j y8jVarG1 = G1();
                    ViewGroup.LayoutParams layoutParams = y8jVarG1.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = thaVarQ1.getMeasuredHeight();
                        y8jVarG1.setLayoutParams(marginLayoutParams);
                    }
                }
            }
            SelectedMediaBottomBarWidget selectedMediaBottomBarWidget4 = this.u1;
            if (selectedMediaBottomBarWidget4 != null && (gjgVar = (gjg) selectedMediaBottomBarWidget4.o.getValue()) != null) {
                e9i.j0(new fz6(n1g.v(new r07(((x9h) this.z.getValue()).t, gjgVar, new db3(3, null, 2), 0), getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i5), i2), getViewLifecycleScope());
            }
        }
        int i6 = 4;
        e9i.j0(new fz6(n1g.v(a2().s, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i6), i2), getViewLifecycleScope());
        int i7 = 7;
        G1().e(new wy7(i7, this));
        e9i.j0(new fz6(n1g.v(a2().n1, getViewLifecycleOwner().f(), n09.c), new gw9(lq4Var, this, 5), i2), getViewLifecycleScope());
        lx9 lx9VarA2 = a2();
        a8j.t(lx9VarA2, ((n0c) lx9VarA2.H()).a(), new gx9(lx9VarA2, lq4Var, i6), 2);
        e9i.j0(new fz6(n1g.v(a2().C1, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, 6), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(a2().D, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i7), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(a2().x, 13), getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, 8), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(a2().H, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i3), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(a2().B, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, 10), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(a2().F, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i), i2), getViewLifecycleScope());
        e3j e3jVarW0 = w0();
        ghb ghbVar = ew5.b;
        e9i.j0(new fz6(n1g.v(u3m.b(e3jVarW0, qe7.O(16, lw5.MILLISECONDS)), getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, 12), i2), getViewLifecycleScope());
        vv vvVar3 = this.s;
        zv8 zv8Var3 = zv8VarArr[2];
        if (((Boolean) vvVar3.a(this)).booleanValue()) {
            e9i.j0(new fz6(n1g.v(a2().z, getViewLifecycleOwner().f(), n09Var), new el6(lq4Var, (npb) this.B.m(this, zv8VarArr[6]), 28), i2), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(new jz(a2().Z, 13), getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i4), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(uw8.f, getViewLifecycleOwner().f(), n09Var), new gw9(lq4Var, this, i2), i2), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, defpackage.s5a
    public final void p0(int i) {
        Object value;
        t5a t5aVar;
        int iD = qt4.D(i);
        if (iD != 1 && iD != 2) {
            if (iD == 4 && (t5aVar = this.m) != null) {
                t5aVar.d(4);
                return;
            }
            return;
        }
        if (!w0().d()) {
            w0().play();
            a2().N();
            return;
        }
        w0().pause();
        lx9 lx9VarA2 = a2();
        lx9VarA2.E();
        mjg mjgVar = lx9VarA2.C;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, wr4.d));
    }

    @Override // defpackage.oef
    public final void q0() {
        b2();
    }

    @Override // defpackage.vuc
    public final void r(Uri uri, y26 y26Var) {
        lx9 lx9VarA2 = a2();
        a8j.t(lx9VarA2, ((n0c) lx9VarA2.H()).a(), new d97(lx9VarA2, y26Var, uri, null, 10), 2);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: s1 */
    public final boolean getX() {
        return rx8.C(((zp3) this.n1.m(this, w1[18])).a) == null;
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        super.t1(f);
        V1();
        Y1().setVisibility(0);
        ((ViewGroup) this.p1.m(this, w1[20])).setVisibility(0);
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void w1(float f) {
        Window window;
        Window window2;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(0);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        t5a t5aVar;
        if (getView() != null) {
            t5a t5aVar2 = this.m;
            if (t5aVar2 != null && t5aVar2.a().getVisibility() == 0 && (t5aVar = this.m) != null) {
                t5aVar.e(false);
            }
            Y1().setVisibility(4);
            ((ViewGroup) this.p1.m(this, w1[20])).setVisibility(4);
            a2().E();
        }
    }

    @Override // defpackage.vuc
    public final void y() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    @Override // defpackage.a6j
    public final void y0() {
        Object value;
        wr4 wr4Var;
        lx9 lx9VarA2 = a2();
        boolean zD = w0().d();
        mjg mjgVar = lx9VarA2.C;
        do {
            value = mjgVar.getValue();
            int iOrdinal = ((wr4) value).ordinal();
            wr4Var = wr4.b;
            if (iOrdinal != 0) {
                wr4 wr4Var2 = wr4.a;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        wr4Var = wr4Var2;
                    } else if (iOrdinal != 3) {
                        ore.o();
                        return;
                    }
                } else if (zD) {
                    wr4Var = wr4Var2;
                } else {
                    wr4Var = wr4.d;
                }
            }
        } while (!mjgVar.h(value, wr4Var));
    }

    public MediaEditScreen(long j, boolean z, boolean z2, Long l, t3f t3fVar, Long l2, ha9 ha9Var) {
        this(n1g.i(new ylc("is_message_edit", Boolean.valueOf(z2)), new ylc("scope_id", t3fVar), new ylc("chat_id", l), new ylc("initial_id", Long.valueOf(j)), new ylc("multi_select", Boolean.valueOf(z)), new ylc("message_id", l2), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
