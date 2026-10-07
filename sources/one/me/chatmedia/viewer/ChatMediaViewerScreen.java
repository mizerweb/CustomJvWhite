package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a53;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.af7;
import defpackage.bdc;
import defpackage.c53;
import defpackage.c79;
import defpackage.ca2;
import defpackage.ci1;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.d53;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e5d;
import defpackage.e63;
import defpackage.e9i;
import defpackage.ew5;
import defpackage.fl2;
import defpackage.fz6;
import defpackage.g53;
import defpackage.gcc;
import defpackage.gec;
import defpackage.ghb;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.h;
import defpackage.h3j;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.iec;
import defpackage.j11;
import defpackage.j22;
import defpackage.j8e;
import defpackage.je9;
import defpackage.ji0;
import defpackage.k82;
import defpackage.ks6;
import defpackage.l63;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lw5;
import defpackage.mc4;
import defpackage.meh;
import defpackage.mg5;
import defpackage.mjg;
import defpackage.mxj;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n7j;
import defpackage.ns5;
import defpackage.ny8;
import defpackage.o1c;
import defpackage.og7;
import defpackage.oi8;
import defpackage.ore;
import defpackage.pgg;
import defpackage.pi;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qq2;
import defpackage.qy9;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sd8;
import defpackage.sic;
import defpackage.sr0;
import defpackage.svj;
import defpackage.t5a;
import defpackage.td8;
import defpackage.tl1;
import defpackage.tre;
import defpackage.u33;
import defpackage.u3m;
import defpackage.u53;
import defpackage.ubf;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wr4;
import defpackage.wsc;
import defpackage.wy7;
import defpackage.y8j;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zhb;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/chatmedia/viewer/BaseMediaViewerScreen;", "Lqy9;", "Lz4f;", "Lvp4;", "Lmc4;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "attachId", "msgId", "", "singleMode", "descOrder", "", "itemTypeId", "Lha9;", "localAccountId", "(JLjava/lang/String;JZZBLha9;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMediaViewerScreen extends BaseMediaViewerScreen<qy9> implements z4f, vp4, mc4, ubf {
    public static final /* synthetic */ zv8[] Z = {new dwd(ChatMediaViewerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ChatMediaViewerScreen.class, "attachId", "getAttachId()Ljava/lang/String;", 0), new dwd(ChatMediaViewerScreen.class, "msgId", "getMsgId()J", 0), new dwd(ChatMediaViewerScreen.class, "descOrder", "getDescOrder()Z", 0), new dwd(ChatMediaViewerScreen.class, "singleMode", "getSingleMode()Z", 0), new dwd(ChatMediaViewerScreen.class, "itemTypeId", "getItemTypeId()B", 0), new dwd(ChatMediaViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatMediaViewerScreen.class, "toolbarBubble", "getToolbarBubble()Landroid/widget/TextView;", 0), new dwd(ChatMediaViewerScreen.class, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
    public static final oi8 n1 = new oi8(0, 3, 0, null, 13);
    public static final oi8 o1 = new oi8(0, 0, 0, new j11(3, 1, false), 7);
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final j8e D;
    public final j8e E;
    public final j8e F;
    public ji0 G;
    public mxj H;
    public AnimatorSet I;
    public final ny8 J;
    public final ny8 K;
    public final ny8 X;
    public final ny8 Y;
    public final vv p;
    public final vv q;
    public final vv r;
    public final vv s;
    public final vv t;
    public final vv u;
    public final h v;
    public final ca2 w;
    public final u33 x;
    public final ny8 y;
    public final ks6 z;

    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        this.p = new vv(Long.class, 0L, "chat.media.viewer.chat_id");
        this.q = new vv(String.class, "", "chat.media.viewer.attach_id");
        this.r = new vv(Long.class, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        this.s = new vv(Boolean.class, bool, "chat.media.viewer.desc_order");
        this.t = new vv(Boolean.class, bool, "chat.media.viewer.single_mode");
        this.u = new vv(Byte.class, Byte.valueOf(mg5.REGULAR.a), "chat.media.viewer.item_type_id");
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.v = hVar;
        this.w = new ca2(m35getAccountScopeuqN4xOY());
        u33 u33Var = new u33(this, this.d, ((a2c) hVar.getAccessor().c(27)).a());
        int i = 3;
        u33Var.g = 3;
        while (u33Var.e.i() > u33Var.g) {
            u33Var.e.h(((Number) u33Var.f.remove(0)).longValue());
        }
        this.x = u33Var;
        this.y = hVar.getAccessor().d(54);
        this.z = tre.G(this, new k82(18));
        this.A = rx8.P(3, new a53(this, 1));
        this.B = createViewModelLazy(l63.class, new qq2(8, new a53(this, 2)));
        this.C = rx8.P(3, new a53(this, i));
        this.D = viewBinding(R.id.oneme_chatmedia_viewer_toolbar);
        this.E = viewBinding(R.id.oneme_chatmedia_viewer_toolbar_bubble);
        this.F = viewBinding(R.id.oneme_chatmedia_viewer_info_panel_view);
        this.J = hVar.getAccessor().d(26);
        this.K = rx8.P(3, new a53(this, 4));
        this.X = ysc.a.a();
        this.Y = hVar.getAccessor().d(806);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final int D1() {
        Integer numG;
        View view = getView();
        int i = 0;
        int iIntValue = (view == null || (numG = n7j.g(view)) == null) ? 0 : numG.intValue();
        int measuredHeight = R1().getMeasuredHeight();
        if (iIntValue == 0) {
            ViewGroup.LayoutParams layoutParams = R1().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        return measuredHeight + i;
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        U1().W(i, bundle);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final sr0 E1() {
        return this.x;
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final pgg F1() {
        h hVar = this.v;
        Object value = hVar.getAccessor().d(199).getValue();
        iec iecVar = (iec) ((e5d) hVar.getAccessor().d(26).getValue()).l().i();
        iecVar.getClass();
        if (!(iecVar instanceof gec)) {
            value = null;
        }
        return new pgg((h3j) value);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void H1() {
        if (U1().y1.a.getValue() == wr4.c) {
            t5a t5aVar = this.m;
            if (t5aVar != null) {
                t5aVar.b();
            }
            U1().Q();
        }
    }

    @Override // defpackage.a6j
    public final void I0(long j) {
        R1().e(j, w0().V(), w0().getDuration());
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void I1() {
        U1().Q();
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void K1() {
        l63 l63VarU1 = U1();
        long jE = w0().e();
        l63VarU1.getClass();
        yab.h0(l63VarU1.b, zhb.b, 3, new u53(l63VarU1, jE, null, 2));
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void L1() {
        U1().X();
    }

    @Override // defpackage.a6j
    public final void N0() {
        W1(true, false);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen
    public final void N1() {
        Object value;
        l63 l63VarU1 = U1();
        l63VarU1.H();
        mjg mjgVar = l63VarU1.x1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, wr4.d));
    }

    public final void P1(boolean z) {
        Activity activity;
        Window window;
        mxj mxjVar = this.H;
        if (z) {
            if (mxjVar != null) {
                mxjVar.a(1);
            }
        } else if (mxjVar != null) {
            mxjVar.a.q(1);
        }
        if (Build.VERSION.SDK_INT < 29 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(!z);
    }

    public final fl2 Q1() {
        return (fl2) findViewById(R.id.oneme_chatmedia_viewer_info_panel_view_caption_text_container);
    }

    public final td8 R1() {
        return (td8) this.F.m(this, Z[8]);
    }

    public final rcc S1() {
        return (rcc) this.D.m(this, Z[6]);
    }

    public final TextView T1() {
        return (TextView) this.E.m(this, Z[7]);
    }

    public final l63 U1() {
        return (l63) this.B.getValue();
    }

    public final void V1() {
        e3j e3jVarW0 = w0();
        ghb ghbVar = ew5.b;
        this.k = e9i.j0(n1g.v(new fz6(u3m.b(e3jVarW0, qe7.O(50, lw5.MILLISECONDS)), new tl1(this, (lq4) null, 1), 3), getViewLifecycleOwner().f(), n09.d), getViewLifecycleScope());
    }

    @Override // defpackage.a6j
    public final void W(float f) {
        td8 td8VarR1 = R1();
        cyb cybVar = (cyb) td8VarR1.j.getValue();
        cybVar.post(new sd8(f, cybVar, td8VarR1));
    }

    public final void W1(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.I;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = z2 ? 1.0f : 0.0f;
            c79 c79VarW = yab.w();
            rcc rccVarS1 = S1();
            Property property = View.ALPHA;
            c79VarW.add(ObjectAnimator.ofFloat(rccVarS1, (Property<rcc, Float>) property, S1().getAlpha(), f));
            c79VarW.add(ObjectAnimator.ofFloat(T1(), (Property<TextView, Float>) property, T1().getAlpha(), f));
            c79VarW.add(ObjectAnimator.ofFloat(R1(), (Property<td8, Float>) property, R1().getAlpha(), f));
            fl2 fl2VarQ1 = Q1();
            if (fl2VarQ1 != null) {
                c79VarW.add(ObjectAnimator.ofFloat(Q1(), (Property<fl2, Float>) property, fl2VarQ1.getAlpha(), f));
            }
            t5a t5aVar = this.m;
            ObjectAnimator objectAnimatorOfFloat = t5aVar != null ? ObjectAnimator.ofFloat(t5aVar.a(), (Property<ImageView, Float>) property, t5aVar.a().getAlpha(), f) : null;
            if (z && objectAnimatorOfFloat != null) {
                c79VarW.add(objectAnimatorOfFloat);
            }
            ji0 ji0Var = this.G;
            ObjectAnimator objectAnimatorOfFloat2 = ji0Var != null ? ObjectAnimator.ofFloat(ji0Var.b(), (Property<ImageView, Float>) property, ji0Var.b().getAlpha(), f) : null;
            if (objectAnimatorOfFloat2 != null) {
                c79VarW.add(objectAnimatorOfFloat2);
            }
            c79 c79VarJ = yab.j(c79VarW);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(c79VarJ);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new g53(this, z, f));
            animatorSet2.addListener(new g53(this, f, z));
            animatorSet2.start();
            this.I = animatorSet2;
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        l63 l63VarU1 = U1();
        zv8[] zv8VarArr = l63.O1;
        l63VarU1.W(i, null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.z;
    }

    @Override // defpackage.z4f
    public final void j(Window window) {
        super.j(window);
        if (!((Boolean) ((e5d) this.J.getValue()).B().i()).booleanValue()) {
            P1(true);
            return;
        }
        mxj mxjVar = this.H;
        if (mxjVar != null) {
            mxjVar.a(1);
        }
    }

    @Override // defpackage.as0
    public final void k() {
        fl2 fl2VarQ1;
        W1(false, (S1().getVisibility() == 0 || R1().getVisibility() == 0 || ((fl2VarQ1 = Q1()) != null && fl2VarQ1.getVisibility() == 0)) ? false : true);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        td8 td8VarR1 = R1();
        bdc.a(td8VarR1, new pi(9, td8VarR1, this));
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        int iOrdinal = hr4Var.ordinal();
        if (iOrdinal == 1) {
            P1(true);
            U1().X();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            int i = 0;
            if (getView() != null) {
                P1(S1().getVisibility() == 0);
            }
            l63 l63VarU1 = U1();
            a8j.t(l63VarU1, ((n0c) l63VarU1.l).a(), new e63(i, l63VarU1, null), 2);
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
        mehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y8j y8jVar = new y8j(mehVar.getContext());
        y8jVar.setId(R.id.oneme_chatmedia_viewer_pager);
        y8jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        final int i = 1;
        y8jVar.setOffscreenPageLimit(1);
        y8jVar.setAdapter(this.x);
        lvb.m0(y8jVar);
        mehVar.addView(y8jVar);
        rcc rccVar = new rcc(mehVar.getContext());
        rccVar.setId(R.id.oneme_chatmedia_viewer_toolbar);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setForm(((Boolean) ((e5d) this.J.getValue()).J4.a(e5d.S6[297]).i()).booleanValue() ? gcc.Chat : gcc.Compact);
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        rccVar.setLeftActions(new wbc(new j22(10, this)));
        rccVar.setBackgroundColor(tre.I0(a8gVar.l(rccVar).b.k().d, 0.84f));
        final ji0 ji0Var = null;
        lvb.H(rccVar, n1, null);
        mehVar.addView(rccVar);
        TextView textView = new TextView(mehVar.getContext());
        textView.setId(R.id.oneme_chatmedia_viewer_toolbar_bubble);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        textView.setLayoutParams(layoutParams);
        q9i.a(q9i.h, textView);
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        GradientDrawable gradientDrawable = new GradientDrawable();
        final int i2 = 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        gradientDrawable.setColor(a8gVar.l(textView).b.b().g);
        textView.setBackground(gradientDrawable);
        textView.setVisibility(8);
        mehVar.addView(textView);
        mehVar.setClipChildren(false);
        mehVar.setClipToPadding(false);
        fl2 fl2Var = new fl2(mehVar.getContext(), this, (o1c) this.Y.getValue());
        fl2Var.setId(R.id.oneme_chatmedia_viewer_info_panel_view_caption_text_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        fl2Var.setLayoutParams(layoutParams2);
        fl2Var.setClipChildren(false);
        fl2Var.setClipToPadding(false);
        mehVar.addView(fl2Var);
        td8 td8Var = new td8(mehVar.getContext());
        td8Var.setId(R.id.oneme_chatmedia_viewer_info_panel_view);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 80;
        td8Var.setLayoutParams(layoutParams3);
        td8Var.setClipChildren(false);
        td8Var.setClipToPadding(false);
        td8Var.setPadding(td8Var.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 9.0f), td8Var.getPaddingRight(), gm0.K(9.0f * yl5.d().getDisplayMetrics().density));
        td8Var.setBackgroundColor(tre.I0(a8gVar.l(td8Var).b.k().d, 0.84f));
        lvb.H(td8Var, o1, null);
        mehVar.addView(td8Var);
        Activity activity = getActivity();
        if (activity != null) {
            mxj mxjVar = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
            mxjVar.a.b0();
            this.H = mxjVar;
        }
        mehVar.setBackgroundColor(a8gVar.l(mehVar).b.b().b);
        this.m = new t5a(mehVar, new c53(this));
        if (((Boolean) this.K.getValue()).booleanValue()) {
            a53 a53Var = new a53(this, 5);
            ji0Var = new ji0();
            ji0Var.b = mehVar;
            ji0Var.c = td8Var;
            ji0Var.d = fl2Var;
            ji0Var.e = a53Var;
            ji0Var.f = rx8.P(3, new af7() { // from class: ye7
                @Override // defpackage.af7
                public final Object invoke() {
                    int i3 = i2;
                    a8g a8gVar2 = pq3.j;
                    ji0 ji0Var2 = ji0Var;
                    switch (i3) {
                        case 0:
                            meh mehVar2 = (meh) ji0Var2.b;
                            Context context = mehVar2.getContext();
                            a8gVar2.k(mehVar2.getContext());
                            return sb8.D(R.drawable.icon_rotate_screen, -1, context);
                        default:
                            ImageView imageView = new ImageView(((meh) ji0Var2.b).getContext());
                            imageView.setId(R.id.oneme_chatmedia_viewer_fullscreen_view);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 8388693));
                            int i4 = ((bs0) a8gVar2.l(imageView).b.u().c.g).c;
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                            a8gVar2.l(imageView);
                            sb8.m0(-1728053248, shapeDrawable);
                            imageView.setBackground(col.c(i4, shapeDrawable, null, 4));
                            x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                            imageView.setImageDrawable((Drawable) ((ny8) ji0Var2.f).getValue());
                            qe7.H(imageView, 300L, new o37(4, ji0Var2));
                            return imageView;
                    }
                }
            });
            ji0Var.g = rx8.P(3, new af7() { // from class: ye7
                @Override // defpackage.af7
                public final Object invoke() {
                    int i3 = i;
                    a8g a8gVar2 = pq3.j;
                    ji0 ji0Var2 = ji0Var;
                    switch (i3) {
                        case 0:
                            meh mehVar2 = (meh) ji0Var2.b;
                            Context context = mehVar2.getContext();
                            a8gVar2.k(mehVar2.getContext());
                            return sb8.D(R.drawable.icon_rotate_screen, -1, context);
                        default:
                            ImageView imageView = new ImageView(((meh) ji0Var2.b).getContext());
                            imageView.setId(R.id.oneme_chatmedia_viewer_fullscreen_view);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 8388693));
                            int i4 = ((bs0) a8gVar2.l(imageView).b.u().c.g).c;
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                            a8gVar2.l(imageView);
                            sb8.m0(-1728053248, shapeDrawable);
                            imageView.setBackground(col.c(i4, shapeDrawable, null, 4));
                            x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageView);
                            imageView.setImageDrawable((Drawable) ((ny8) ji0Var2.f).getValue());
                            qe7.H(imageView, 300L, new o37(4, ji0Var2));
                            return imageView;
                    }
                }
            });
            ji0Var.a = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            n7j.a(mehVar, ji0Var.b(), -1);
            bdc.a(td8Var, new og7(td8Var, 7, ji0Var));
        }
        this.G = ji0Var;
        return mehVar;
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        P1(true);
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.G = null;
        if (((Boolean) this.K.getValue()).booleanValue()) {
            ((sic) this.A.getValue()).disable();
        }
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    U1().N().h(ns5.CHAT_MEDIA);
                    return;
                }
            }
            U1().N().g = null;
            wsc wscVar = (wsc) this.X.getValue();
            svj svjVar = new svj(this, 1);
            wscVar.getClass();
            wsc.t(svjVar, strArr, iArr, R.string.oneme_request_storage_permission_title, R.string.oneme_request_storage_permission_subtitle);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        String name = ChatMediaViewerScreen.class.getName();
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Media viewer pager state save limit=3", null);
            }
        }
        if (((Boolean) this.K.getValue()).booleanValue()) {
            ((sic) this.A.getValue()).enable();
        }
        int i = 2;
        S1().addOnLayoutChangeListener(new ci1(i, this));
        r8e r8eVar = U1().o1;
        n09 n09Var = n09.d;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 1), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().s1, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, i), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().q1, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, i2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().Y, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 4), i2), getViewLifecycleScope());
        int i3 = 5;
        e9i.j0(new fz6(n1g.v(U1().Z, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, i3), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().w1, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 6), i2), getViewLifecycleScope());
        G1().e(new wy7(i3, this));
        e9i.j0(new fz6(n1g.v(R1().getEvents(), getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 7), i2), getViewLifecycleScope());
        l63 l63VarU1 = U1();
        int i4 = 0;
        a8j.t(l63VarU1, ((n0c) l63VarU1.l).a(), new e63(i4, l63VarU1, lq4Var), 2);
        e9i.j0(new fz6(n1g.v(U1().B1, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 8), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().y1, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, 9), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(U1().N().i, getViewLifecycleOwner().f(), n09Var), new d53(lq4Var, this, i4), i2), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.BaseMediaViewerScreen, one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        super.t1(f);
        P1(false);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        if (getView() != null) {
            if (S1().getVisibility() == 0) {
                S1().setVisibility(8);
                T1().setVisibility(8);
                R1().setVisibility(8);
                fl2 fl2VarQ1 = Q1();
                if (fl2VarQ1 != null) {
                    fl2VarQ1.setVisibility(8);
                }
                ji0 ji0Var = this.G;
                if (ji0Var != null) {
                    ji0Var.c(false);
                }
                t5a t5aVar = this.m;
                if (t5aVar != null) {
                    t5aVar.e(false);
                }
            }
            U1().H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    @Override // defpackage.a6j
    public final void y0() {
        Object value;
        wr4 wr4Var;
        l63 l63VarU1 = U1();
        boolean zD = w0().d();
        mjg mjgVar = l63VarU1.x1;
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

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return U1().b0(lq4Var);
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z, boolean z2, byte b, ha9 ha9Var) {
        this(n1g.i(new ylc("chat.media.viewer.chat_id", Long.valueOf(j)), new ylc("chat.media.viewer.attach_id", str), new ylc("chat.media.viewer.message_id", Long.valueOf(j2)), new ylc("chat.media.viewer.single_mode", Boolean.valueOf(z)), new ylc("chat.media.viewer.desc_order", Boolean.valueOf(z2)), new ylc("chat.media.viewer.item_type_id", Byte.valueOf(b)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
