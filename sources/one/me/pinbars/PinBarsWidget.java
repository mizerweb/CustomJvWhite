package one.me.pinbars;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.b0d;
import defpackage.br4;
import defpackage.ca2;
import defpackage.col;
import defpackage.d5c;
import defpackage.dab;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.f5d;
import defpackage.fn8;
import defpackage.fz6;
import defpackage.gci;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gr7;
import defpackage.gve;
import defpackage.ha9;
import defpackage.hve;
import defpackage.hzc;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.kzc;
import defpackage.lh9;
import defpackage.lq4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n99;
import defpackage.ny8;
import defpackage.nza;
import defpackage.nzc;
import defpackage.p;
import defpackage.pq3;
import defpackage.pzc;
import defpackage.q67;
import defpackage.qe7;
import defpackage.qj0;
import defpackage.qzc;
import defpackage.r8e;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.szc;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tre;
import defpackage.v05;
import defpackage.v5c;
import defpackage.vl3;
import defpackage.vv;
import defpackage.vzc;
import defpackage.wo6;
import defpackage.wzc;
import defpackage.xu1;
import defpackage.xzc;
import defpackage.ylc;
import defpackage.yxb;
import defpackage.z18;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zzc;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u000f\u0010\u0010\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lone/me/pinbars/PinBarsWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lszc;", "place", "Lha9;", "localAccountId", "(Lszc;Lha9;)V", "Lt3f;", "scopeId", "(Lt3f;Lszc;)V", "one/me/chatscreen/ChatScreen", "one/me/chats/tab/ChatsTabWidget", "pinbars"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PinBarsWidget extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] z = {new dwd(PinBarsWidget.class, "place", "getPlace()Ljava/lang/String;", 0), zo5.f(zfe.a, PinBarsWidget.class, "root", "getRoot()Landroid/widget/LinearLayout;", 0), new z8b(PinBarsWidget.class, "isInformerDividerVisible", "isInformerDividerVisible()Z")};
    public final vv a;
    public final ca2 b;
    public final ca2 c;
    public final ny8 d;
    public mvh e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public nza j;
    public v5c k;
    public gci l;
    public gr7 m;
    public n99 n;
    public v5c o;
    public d5c p;
    public v5c q;
    public final AutoTransition r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final qj0 w;
    public final int x;
    public final gve y;

    public PinBarsWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv(String.class, null, "arg_key_pinbars_place");
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var;
        this.c = new ca2(m35getAccountScopeuqN4xOY());
        this.d = ca2Var.getAccessor().d(26);
        t3f t3fVar = (t3f) ((Parcelable) tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class));
        this.f = getSharedViewModel(t3fVar == null ? t3f.e : t3fVar, kzc.class, new yxb(17));
        this.g = createViewModelLazy(nzc.class, new ei3(14, new qzc(this, 0)));
        this.h = rx8.P(3, new qzc(this, 1));
        this.i = viewBinding(R.id.pinbars_root);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setOrdering(0);
        autoTransition.setDuration(150L);
        this.r = autoTransition;
        this.s = rx8.P(3, new yxb(18));
        this.t = rx8.P(3, new qzc(this, 2));
        this.u = rx8.P(3, new qzc(this, 3));
        this.v = ca2Var.getAccessor().d(94);
        this.w = new qj0(this);
        this.x = 6;
        this.y = new gve(this);
    }

    public static final void o1(PinBarsWidget pinBarsWidget, Drawable drawable, int i) {
        RippleDrawable rippleDrawable = drawable instanceof RippleDrawable ? (RippleDrawable) drawable : null;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        rt2 rt2Var;
        if (((xu1) this.h.getValue()).g(i)) {
            return;
        }
        z18 z18Var = t1().n;
        if (!(z18Var != null ? z18Var.n(i) : false) && i == R.id.pinbars_block_user_confirmation_sheet_confirm) {
            nzc nzcVarT1 = t1();
            if (((f5d) ((wo6) nzcVarT1.g.getValue())).y()) {
                v05 v05Var = nzcVarT1.l;
                if (v05Var != null) {
                    v05Var.b();
                }
                gjg gjgVar = nzcVarT1.c.c;
                if (gjgVar == null || (rt2Var = (rt2) gjgVar.getValue()) == null) {
                    gm0.Y(nzc.class.getName(), "Early return in onBlockConfirmed cuz of sharedViewModel.chatFlow?.value?.id is null");
                    return;
                }
                long j = rt2Var.a;
                ic6 ic6Var = nzcVarT1.J;
                b0d.b.getClass();
                a8j.x(ic6Var, new hzc(b0d.l(), b0d.q(j)));
            }
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        br4 parentController = getParentController();
        ChatsTabWidget chatsTabWidget = parentController instanceof ChatsTabWidget ? (ChatsTabWidget) parentController : null;
        if (chatsTabWidget != null) {
            chatsTabWidget.x1 = this.y;
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.pinbars_root);
        n1g.N(new q67(this, null, 1), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.j = null;
        this.l = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.p = null;
        this.q = null;
        t1().p.a();
        mvh mvhVar = this.e;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        this.e = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        br4 parentController = getParentController();
        ChatsTabWidget chatsTabWidget = parentController instanceof ChatsTabWidget ? (ChatsTabWidget) parentController : null;
        if (chatsTabWidget != null) {
            chatsTabWidget.x1 = null;
        }
        super.onDetach(view);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((xu1) this.h.getValue()).b(i, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        r8e r8eVar = t1().q;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new xzc(null, this, viewGroup, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().x, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(new dab(t1().y, this, 3), new zzc(this, null), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().t, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().u, getViewLifecycleOwner().f(), n09Var), new wzc(3, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().D, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().E, getViewLifecycleOwner().f(), n09Var), new wzc(4, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().A, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().B, getViewLifecycleOwner().f(), n09Var), new wzc(5, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().H, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().I, getViewLifecycleOwner().f(), n09Var), new wzc(2, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().F, getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().G, getViewLifecycleOwner().f(), n09Var), new wzc(6, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.A(t1().w, t1().q, t1().r, t1().t, t1().H, new vl3(1, null, this)), getViewLifecycleOwner().f(), n09Var), new xzc(null, this, viewGroup, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().J, getViewLifecycleOwner().f(), n09Var), new wzc(0, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().s, getViewLifecycleOwner().f(), n09Var), new wzc(1, null, this), 3), getViewLifecycleScope());
    }

    public final int p1() {
        br4 parentController = getParentController();
        ChatScreen chatScreen = parentController instanceof ChatScreen ? (ChatScreen) parentController : null;
        if (chatScreen != null) {
            return chatScreen.K1();
        }
        return 0;
    }

    public final nza q1() {
        nza nzaVar = new nza(getContext());
        nzaVar.setId(R.id.pinbars_miniplayer);
        nzaVar.setOnCloseClickListener(new pzc(this, 12));
        nzaVar.setOnPlaybackSpeedClick(new lh9(26, this));
        nzaVar.setOnPlaybackClickListener(new pzc(this, 0));
        qe7.H(nzaVar, 300L, new pzc(this, 1));
        nzaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Long l = ((kzc) this.f.getValue()).d;
        a8g a8gVar = pq3.j;
        nzaVar.setBackground(col.e(a8gVar.h(nzaVar), l == null ? new ColorDrawable(a8gVar.h(nzaVar).b().d) : null, ((fn8) a8gVar.h(nzaVar).u().c.b).c, 4));
        n1g.N(new vzc(this, (lq4) null, 0), nzaVar);
        return nzaVar;
    }

    public final e5d r1() {
        return (e5d) this.d.getValue();
    }

    public final LinearLayout s1() {
        return (LinearLayout) this.i.m(this, z[1]);
    }

    public final nzc t1() {
        return (nzc) this.g.getValue();
    }

    public final void u1(int i, int i2, int i3, int i4, int i5, int i6) {
        PinBarsWidget pinBarsWidget = this;
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(i, null, null, 6);
        jc4VarC.g(new tnh(i2));
        jc4VarC.a(new kc4(i3, new tnh(i4), 3, true, 3, 2), new kc4(i5, new tnh(i6), 2, true, 3, 2));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(pinBarsWidget);
        confirmationBottomSheetF.setTargetController(pinBarsWidget);
        br4 parentController = pinBarsWidget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    public PinBarsWidget(t3f t3fVar, szc szcVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_key_pinbars_place", szcVar.name())));
    }

    public PinBarsWidget(szc szcVar, ha9 ha9Var) {
        this(n1g.i(new ylc("arg_key_pinbars_place", szcVar.name()), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
