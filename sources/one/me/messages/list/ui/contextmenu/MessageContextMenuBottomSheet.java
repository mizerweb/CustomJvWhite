package one.me.messages.list.ui.contextmenu;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8e;
import defpackage.af7;
import defpackage.bb;
import defpackage.bdc;
import defpackage.br4;
import defpackage.c0a;
import defpackage.c8e;
import defpackage.ce;
import defpackage.ch8;
import defpackage.cqk;
import defpackage.d3;
import defpackage.due;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ecd;
import defpackage.er3;
import defpackage.fa8;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.g6e;
import defpackage.g6f;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gnl;
import defpackage.h;
import defpackage.h6f;
import defpackage.ha8;
import defpackage.hve;
import defpackage.i19;
import defpackage.ia8;
import defpackage.iaa;
import defpackage.ib;
import defpackage.ifh;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jsa;
import defpackage.kja;
import defpackage.kog;
import defpackage.lfa;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.lt7;
import defpackage.lvb;
import defpackage.lve;
import defpackage.mfa;
import defpackage.mpl;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nvh;
import defpackage.ny8;
import defpackage.o37;
import defpackage.ofa;
import defpackage.oi8;
import defpackage.p;
import defpackage.p0m;
import defpackage.poe;
import defpackage.pq3;
import defpackage.q8e;
import defpackage.qaa;
import defpackage.qe7;
import defpackage.qp4;
import defpackage.r66;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rda;
import defpackage.roe;
import defpackage.rx8;
import defpackage.s5e;
import defpackage.sbi;
import defpackage.t3f;
import defpackage.t8a;
import defpackage.tre;
import defpackage.tv7;
import defpackage.u6e;
import defpackage.v30;
import defpackage.v6e;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wo0;
import defpackage.x7e;
import defpackage.xbc;
import defpackage.xbd;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.z5e;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lqp4;", "Lu6e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessageContextMenuBottomSheet extends BottomSheetWidget implements qp4, u6e {
    public static final /* synthetic */ zv8[] w1 = {new dwd(MessageContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), zo5.f(zfe.a, MessageContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new dwd(MessageContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new dwd(MessageContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new dwd(MessageContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new dwd(MessageContextMenuBottomSheet.class, "showReactionsSelector", "getShowReactionsSelector()Z", 0), new dwd(MessageContextMenuBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new dwd(MessageContextMenuBottomSheet.class, "messageId", "getMessageId()J", 0), new dwd(MessageContextMenuBottomSheet.class, "messageServerId", "getMessageServerId()J", 0), new z8b(MessageContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z"), new dwd(MessageContextMenuBottomSheet.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    public final vv A;
    public final vv B;
    public final vv C;
    public final vv D;
    public final vv E;
    public final vv F;
    public final vv G;
    public final vv H;
    public final ColorDrawable I;
    public final j8e J;
    public ViewGroup K;
    public RecyclerView X;
    public v6e Y;
    public final ny8 Z;
    public final ifh n1;
    public final ny8 o1;
    public final ny8 p1;
    public final ny8 q1;
    public final er3 r1;
    public af7 s1;
    public final kog t1;
    public final h u;
    public final nvh u1;
    public final oi8 v;
    public final int v1;
    public final oi8 w;
    public final oi8 x;
    public final vv y;
    public final vv z;

    public MessageContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        int i = 0;
        this.v = new oi8(0, 4, i, null, 13);
        int i2 = 3;
        this.w = new oi8(0, i, 0, new j11(3, 3, false), 7);
        this.x = oi8.e;
        Class<Integer> cls = Integer.class;
        this.y = new vv("anchor_id", cls);
        this.z = new vv("anchor_class", Class.class);
        this.A = new vv("highlight_padding", Rect.class);
        this.B = new vv("highlight_radius", Float.class);
        this.C = new vv("parent_id", cls);
        Boolean bool = Boolean.FALSE;
        vv vvVar = new vv(Boolean.class, bool, "show_reactions_selector");
        this.D = vvVar;
        this.E = new vv(Long.class, 0L, "chat_id");
        this.F = new vv(Long.class, 0L, "message_id");
        this.G = new vv(Long.class, 0L, "message_server_id");
        this.H = new vv(Boolean.class, bool, "callback_sent");
        this.I = new ColorDrawable();
        this.J = viewBinding(R.id.messages_list_context_content_container);
        t3f t3fVar = (t3f) ((Parcelable) tre.f0(getArgs(), Widget.ARG_SCOPE_ID, t3f.class));
        this.Z = getSharedViewModel(t3fVar == null ? getB() : t3fVar, c8e.class, null);
        this.n1 = new ifh(new mfa(this, 1));
        t3f t3fVar2 = (t3f) ((Parcelable) tre.f0(getArgs(), Widget.ARG_SCOPE_ID, t3f.class));
        this.o1 = getSharedViewModel(t3fVar2 == null ? getB() : t3fVar2, jsa.class, null);
        this.p1 = createViewModelLazy(qaa.class, new ch8(26, new mfa(this, 2)));
        this.q1 = rx8.P(3, new mfa(this, i2));
        er3 er3Var = new er3();
        this.r1 = er3Var;
        this.t1 = new kog(hVar.getExecutors().a(), er3Var, new fz7(1, J1(), qaa.class, "onMemberClicked", "onMemberClicked$message_list(J)V", 0, 7), new lfa(this, 2), 1);
        this.u1 = new nvh(yl5.d().getDisplayMetrics().density * 20.0f);
        zv8 zv8Var = w1[5];
        this.v1 = ((Boolean) vvVar.a(this)).booleanValue() ? zo5.b(10.0f, yl5.d().getDisplayMetrics().density, zo5.b(32.0f, yl5.d().getDisplayMetrics().density, c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2))) : 0;
        B1(false);
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
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ViewGroup viewGroupC;
        if (I1()) {
            ViewGroup frameLayout2 = new FrameLayout(getContext());
            rcc rccVar = new rcc(frameLayout2.getContext());
            rccVar.setId(R.id.oneme_bottom_sheet_toolbar);
            rccVar.setForm(gcc.Compact);
            rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            rccVar.setAlpha(0.0f);
            rccVar.setTitle(R.string.chat_screen_context_menu_toolbar_title);
            rccVar.setLeftActions(new xbc(new lfa(this, 0)));
            lvb.H(rccVar, this.v, null);
            frameLayout2.addView(rccVar);
            RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext());
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            recyclerView.setClipToPadding(false);
            kog kogVar = this.t1;
            recyclerView.setAdapter(kogVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setItemAnimator(null);
            int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            recyclerView.setPadding(iK, recyclerView.getPaddingTop(), iK, recyclerView.getPaddingBottom());
            zpg zpgVar = new zpg(recyclerView, kogVar, new due(new iaa(this, 4, recyclerView)));
            recyclerView.h(zpgVar, -1);
            recyclerView.h(new t8a(pq3.j.h(recyclerView)), -1);
            lvb.H(recyclerView, this.w, null);
            n1g.N(new ce(zpgVar, null, 1), recyclerView);
            frameLayout2.addView(recyclerView);
            this.X = recyclerView;
            viewGroupC = frameLayout2;
        } else {
            Context context = layoutInflater.getContext();
            Bundle bundle = getArgs().getBundle("actions");
            Collection collectionB = bundle != null ? mpl.b(bundle) : null;
            if (collectionB == null) {
                collectionB = r66.a;
            }
            lfa lfaVar = new lfa(this, 1);
            this.r1.getClass();
            viewGroupC = er3.C(context, collectionB, lfaVar);
        }
        this.K = viewGroupC;
        return viewGroupC;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* JADX INFO: renamed from: E1 */
    public final boolean getB() {
        return false;
    }

    public final void F1(int i) {
        zv8[] zv8VarArr = w1;
        zv8 zv8Var = zv8VarArr[9];
        vv vvVar = this.H;
        if (!((Boolean) vvVar.a(this)).booleanValue()) {
            zv8 zv8Var2 = zv8VarArr[9];
            vvVar.b(this, Boolean.TRUE);
            Object targetController = getTargetController();
            vp4 vp4Var = targetController instanceof vp4 ? (vp4) targetController : null;
            if (vp4Var != null) {
                vp4Var.E(i, null);
            }
        }
        v1(true);
    }

    @Override // defpackage.u6e
    public final void G0() {
        xbd callback;
        v6e v6eVar = this.Y;
        if (v6eVar == null) {
            return;
        }
        RecyclerView recyclerView = v6eVar.e;
        a8e a8eVar = (a8e) this.n1.getValue();
        MessageModel messageModelR = ((jsa) this.o1.getValue()).R(H1());
        int iB = 0;
        List listL = a8e.L(a8eVar, messageModelR != null ? messageModelR.w : null, false, 4);
        int measuredHeight = requireView().getMeasuredHeight();
        ecd ecdVar = this.b;
        if (ecdVar != null && (callback = ecdVar.getCallback()) != null) {
            iB = callback.b();
        }
        v6e.d(v6eVar, listL, Integer.valueOf((measuredHeight - iB) - this.v1), null, 4);
        p0m.a(recyclerView, lt7.KEYBOARD_TAP);
        bdc.a(recyclerView, new rda(1, recyclerView, this));
    }

    public final ViewGroup G1() {
        return (ViewGroup) this.J.m(this, w1[10]);
    }

    public final long H1() {
        zv8 zv8Var = w1[7];
        return ((Number) this.F.a(this)).longValue();
    }

    public final boolean I1() {
        return ((Boolean) this.q1.getValue()).booleanValue();
    }

    public final qaa J1() {
        return (qaa) this.p1.getValue();
    }

    @Override // defpackage.u6e
    public final void P0(g6e g6eVar) {
        ia8 ia8Var;
        kja kjaVar;
        z5e z5eVar;
        MessageModel messageModelR = ((jsa) this.o1.getValue()).R(H1());
        s5e s5eVar = null;
        ((a8e) this.n1.getValue()).T(new x7e(g6eVar.b, gnl.b(messageModelR), messageModelR != null ? messageModelR.b : 0L, messageModelR != null ? messageModelR.w : null));
        v1(true);
        if (messageModelR != null && (kjaVar = messageModelR.w) != null && (z5eVar = kjaVar.c) != null) {
            s5eVar = z5eVar.b;
        }
        if (cqk.d(s5eVar, g6eVar.b) || (ia8Var = (ia8) this.u.getAccessor().g().getValue()) == null) {
            return;
        }
        ia8Var.f(Collections.singleton(new ha8(fa8.ADD_2_REACTIONS, 1)), y3f.CHAT);
    }

    @Override // defpackage.qp4
    public final void dismiss() {
        v1(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout o1(LayoutInflater layoutInflater, Bundle bundle) {
        Object poeVar;
        ny8 ny8Var = this.o1;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_bottom_sheet_popup_card);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipToPadding(false);
        qe7.H(frameLayout, 300L, new o37(20, this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(R.id.messages_list_context_reactions_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        frameLayout2.setLayoutParams(layoutParams);
        lq4 lq4Var = null;
        try {
            a8e a8eVar = (a8e) this.n1.getValue();
            MessageModel messageModelR = ((jsa) ny8Var.getValue()).R(H1());
            poeVar = a8e.L(a8eVar, messageModelR != null ? messageModelR.w : null, false, 6);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.X("BottomSheetWidget", thA, "failed to get reactions for selection", new Object[0]);
        }
        if (poeVar instanceof poe) {
            poeVar = r66.a;
        }
        List list = (List) poeVar;
        zv8 zv8Var = w1[5];
        if (((Boolean) this.D.a(this)).booleanValue() && !list.isEmpty()) {
            v6e v6eVar = new v6e(frameLayout2.getContext(), this.u.getExecutors().a());
            v6e.d(v6eVar, list, null, null, 6);
            v6eVar.c = this;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
            layoutParams2.rightMargin = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            MessageModel messageModelR2 = ((jsa) ny8Var.getValue()).R(H1());
            layoutParams2.gravity = (messageModelR2 == null || !messageModelR2.z) ? 21 : 19;
            frameLayout2.addView(v6eVar.e, layoutParams2);
            frameLayout2.setVisibility(0);
            this.Y = v6eVar;
        }
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(R.id.messages_list_context_content_container);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = this.v1;
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setClickable(true);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setOutlineProvider(this.u1);
        C1(frameLayout3, layoutInflater, bundle);
        if (I1()) {
            frameLayout3.setPadding(0, gm0.K(10.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        } else {
            lvb.H(frameLayout3, this.w, null);
        }
        n1g.N(new d3(this, lq4Var, 22), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        ln5 ln5Var = new ln5(this, new mfa(this, 0));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 10));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        this.X = null;
        this.K = null;
        this.Y = null;
        this.s1 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zv8[] zv8VarArr = w1;
        int i = 0;
        zv8 zv8Var = zv8VarArr[0];
        Integer num = (Integer) this.y.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            int i2 = 1;
            zv8 zv8Var2 = zv8VarArr[1];
            Class cls = (Class) this.z.a(this);
            if (cls == null) {
                return;
            }
            v30 v30Var = new v30(iIntValue, cls);
            this.s1 = v30Var.d(this);
            ((ArrayList) v30Var.f).add(new g6f(new h6f(v30Var, s1()), new Rect(), new Rect(), new Rect(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density)));
            v30 v30Var2 = new v30(iIntValue, cls);
            v30Var2.d(this);
            tv7 tv7Var = new tv7(v30Var2);
            int i3 = 2;
            zv8 zv8Var3 = zv8VarArr[2];
            Rect rect = (Rect) this.A.a(this);
            int i4 = 3;
            zv8 zv8Var4 = zv8VarArr[3];
            Float f = (Float) this.B.a(this);
            zv8 zv8Var5 = zv8VarArr[4];
            tv7Var.a(view, rect, f, (Integer) this.C.a(this));
            if (I1()) {
                qaa qaaVarJ1 = J1();
                ifh ifhVar = this.n1;
                qaaVarJ1.G(((a8e) ifhVar.getValue()).G());
                qaa qaaVarJ2 = J1();
                lq4 lq4Var = null;
                e9i.j0(new fz6(new q8e(qaaVarJ2.r.d), new wo0(qaaVarJ2, ((a8e) ifhVar.getValue()).G(), lq4Var, 7), i4), qaaVarJ2.b);
                r8e r8eVar = J1().y;
                i19 i19VarF = getViewLifecycleOwner().f();
                n09 n09Var = n09.d;
                e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new ofa(lq4Var, this, i), i4), getViewLifecycleScope());
                e9i.j0(new fz6(n1g.v(J1().A, getViewLifecycleOwner().f(), n09Var), new ofa(lq4Var, this, i2), i4), getViewLifecycleScope());
                e9i.j0(new fz6(n1g.v(J1().B, getViewLifecycleOwner().f(), n09Var), new ofa(lq4Var, this, i3), i4), getViewLifecycleScope());
            }
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new ib(this, 3);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1, reason: from getter */
    public final oi8 getX() {
        return this.x;
    }

    @Override // defpackage.qp4
    public final void u(Widget widget) {
        setTargetController(widget);
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(this, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        Object poeVar;
        try {
            ((jsa) this.o1.getValue()).K2.set(0L);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.X("BottomSheetWidget", thA, "failed to deselect messages on hide", new Object[0]);
        }
        af7 af7Var = this.s1;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }
}
