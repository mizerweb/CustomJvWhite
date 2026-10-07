package one.me.chats.forward;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.acc;
import defpackage.af7;
import defpackage.bb;
import defpackage.bc1;
import defpackage.c76;
import defpackage.c97;
import defpackage.cf7;
import defpackage.d4f;
import defpackage.d97;
import defpackage.dsc;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.dz9;
import defpackage.dzc;
import defpackage.e30;
import defpackage.e97;
import defpackage.e9i;
import defpackage.ez9;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.g97;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.h;
import defpackage.h57;
import defpackage.ha9;
import defpackage.hcc;
import defpackage.hve;
import defpackage.i19;
import defpackage.i1m;
import defpackage.j11;
import defpackage.j8e;
import defpackage.j95;
import defpackage.j97;
import defpackage.jc4;
import defpackage.jy5;
import defpackage.jz;
import defpackage.kcc;
import defpackage.ks6;
import defpackage.kz9;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m8b;
import defpackage.mc4;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n5b;
import defpackage.nc1;
import defpackage.ny8;
import defpackage.o24;
import defpackage.o97;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.p;
import defpackage.py2;
import defpackage.pyc;
import defpackage.pzf;
import defpackage.r87;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.t3f;
import defpackage.tha;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tre;
import defpackage.u87;
import defpackage.ui9;
import defpackage.uw8;
import defpackage.v09;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w87;
import defpackage.wbc;
import defpackage.x87;
import defpackage.xde;
import defpackage.xw3;
import defpackage.yka;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z2e;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zka;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lu87;", "Lmc4;", "Lvp4;", "Ln5b;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "Lha9;", "localAccountId", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLha9;Ljava/lang/Long;ZZ)V", "forward-message"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ForwardPickerScreen extends AbstractPickerScreen<u87> implements mc4, vp4, n5b {
    public final ks6 j;
    public final h k;
    public final oi8 l;
    public final xde m;
    public final vv n;
    public final vv o;
    public af7 p;
    public final AutoTransition q;
    public final ow0 r;
    public final j8e s;
    public final ny8 t;
    public tp2 u;
    public hve v;
    public final jy5 w;
    public kz9 x;
    public mvh y;
    public static final /* synthetic */ zv8[] z = {new z8b(ForwardPickerScreen.class, "isForwardAttach", "isForwardAttach()Z"), zo5.e(zfe.a, ForwardPickerScreen.class, "isInMultiSelect", "isInMultiSelect()Z"), new dwd(ForwardPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new dwd(ForwardPickerScreen.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    public static final oi8 A = new oi8(0, 4, 0, new j11(4, 3, false), 5);

    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        int i = 1;
        this.j = tre.G(this, new h57(i));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.k = hVar;
        this.l = oi8.e;
        this.m = new xde(hVar.getAccessor().d(23), hVar.getAccessor().d(144), 4);
        Boolean bool = Boolean.FALSE;
        this.n = new vv(Boolean.class, bool, "is_forward_attach");
        this.o = new vv(Boolean.class, bool, "is_in_multiselect");
        this.p = new h57(2);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(R.id.oneme_picker_quote_view);
        autoTransition.addTarget(R.id.oneme_picker_main_container);
        autoTransition.addTarget(R.id.oneme_picker_input_view);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        autoTransition.addListener((Transition.TransitionListener) new g97(0, this));
        this.q = autoTransition;
        this.r = binding(new c97(this, 3));
        this.s = viewBinding(R.id.oneme_picker_quote_view);
        this.t = createViewModelLazy(ez9.class, new fj3(28, new c97(this, 4)));
        this.w = new jy5(this, i);
        ln5 ln5Var = new ln5(this, new c97(this, 5));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 6));
        }
    }

    public static final void A1(ForwardPickerScreen forwardPickerScreen, View view, tnh tnhVar, boolean z2) {
        Point point = new Point(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.C1().getTop()));
        mvh mvhVar = forwardPickerScreen.y;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        mvh mvhVar2 = new mvh(forwardPickerScreen.getContext(), view, new c97(forwardPickerScreen, 1), null, 0, 1, false, 184);
        mvhVar2.c(tnhVar);
        mvhVar2.e(point, 8388691, z2 ? 2500L : 800L);
        mvhVar2.setOnDismissListener(new nc1(4, forwardPickerScreen));
        forwardPickerScreen.y = mvhVar2;
    }

    public final tha B1() {
        zv8 zv8Var = z[2];
        return (tha) this.r.getValue();
    }

    public final z2e C1() {
        return (z2e) this.s.m(this, z[3]);
    }

    public final boolean D1() {
        zv8 zv8Var = z[0];
        return ((Boolean) this.n.a(this)).booleanValue();
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        pzf pzfVar = ((u87) x1().d).s;
        if (i == R.id.oneme_picker_toolbar_action_select) {
            pzfVar.a(new x87());
        } else if (i == R.id.oneme_picker_toolbar_action_cancel_selection) {
            pzfVar.a(w87.a);
        }
    }

    public final boolean E1() {
        zv8 zv8Var = z[1];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        ((u87) x1().d).A = false;
    }

    @Override // defpackage.n5b
    public final void d0(boolean z2) {
        zv8 zv8Var = z[1];
        this.o.b(this, Boolean.valueOf(z2));
        Widget widgetV1 = v1();
        PickerChatsTabWidget pickerChatsTabWidget = widgetV1 instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widgetV1 : null;
        if (pickerChatsTabWidget != null) {
            pickerChatsTabWidget.q1(z2);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_picker_confirm_close) {
            r87.b.b().f();
            return;
        }
        if (i != R.id.oneme_picker_confirm_cancel) {
            if (i != R.id.oneme_picker_toolbar_confirm_send_message_positive) {
                if (i == R.id.oneme_picker_toolbar_confirm_send_message_negative) {
                    ((u87) x1().d).A = false;
                    return;
                }
                return;
            }
            u87 u87Var = (u87) x1().d;
            ow0 ow0Var = this.r;
            CharSequence text = ow0Var.d() ? ((tha) ow0Var.getValue()).getText() : null;
            m8b m8bVar = (m8b) x1().i.a.getValue();
            boolean zE1 = E1();
            u87Var.A = false;
            u87Var.h(text, m8bVar, zE1, false);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getL() {
        return this.l;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [br4] */
    @Override // defpackage.br4
    public final boolean handleBack() {
        hve hveVar = this.v;
        if (hveVar != null && hveVar.o()) {
            ((u87) x1().d).u.a(yka.a);
            return true;
        }
        if (!((m8b) x1().i.a.getValue()).j()) {
            return super.handleBack();
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.oneme_forward_confirmation_close_title, null, null, 6);
        jc4VarC.b(R.id.oneme_picker_confirm_close, new tnh(R.string.oneme_forward_confirm_close));
        jc4VarC.c(R.id.oneme_picker_confirm_cancel, new tnh(R.string.oneme_forward_confirm_cancel));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(this);
        confirmationBottomSheetF.setTargetController(this);
        ?? parentController = this;
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
        return true;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        z2e z2eVar = new z2e(getContext());
        z2eVar.setId(R.id.oneme_picker_quote_view);
        z2eVar.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
        e9i.j0(new fz6(n1g.v(((u87) x1().d).q, getViewLifecycleOwner().f(), n09.d), new d97((lq4) null, z2eVar, this, 0), 3), getViewLifecycleScope());
        return xw3.P0(z2eVar, B1());
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.u = null;
        this.v = null;
        kz9 kz9Var = this.x;
        if (kz9Var != null) {
            kz9Var.c();
        }
        this.x = null;
        mvh mvhVar = this.y;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        this.y = null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        lq4 lq4Var = null;
        lvb.H(u1(), A, null);
        tp2 tp2Var = new tp2(viewGroup.getContext());
        tp2Var.setId(R.id.oneme_picker_media_keyboard_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        tp2Var.setLayoutParams(layoutParams);
        int i = uw8.a;
        tp2Var.setTranslationY(uw8.a(tp2Var.getContext()));
        int i2 = 5;
        int i3 = 1;
        lvb.H(tp2Var, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
        this.u = tp2Var;
        this.v = getChildRouter(tp2Var);
        viewGroup.addView(tp2Var);
        r8e r8eVar = x1().i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i4 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new d97((lq4) null, this, view), i4), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new o24(((u87) x1().d).w, 7, this), getViewLifecycleOwner().f(), n09Var), new j97(lq4Var, this, 0), i4), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((u87) x1().d).t, getViewLifecycleOwner().f(), n09Var), new j97(lq4Var, this, i3), i4), getViewLifecycleScope());
        ViewGroup viewGroupU1 = u1();
        hve hveVar = this.v;
        tp2 tp2Var2 = this.u;
        if (hveVar == null || tp2Var2 == null) {
            return;
        }
        c97 c97Var = new c97(this, 2);
        boolean z2 = ((dsc) this.k.getAccessor().c(79)).b && Build.VERSION.SDK_INT >= 30;
        v09 viewLifecycleScope = getViewLifecycleScope();
        zka zkaVar = (zka) ((u87) x1().d).u.b.a.getValue();
        this.x = new kz9(hveVar, tp2Var2, viewGroupU1, c97Var, z2, viewLifecycleScope, (zkaVar != null ? zkaVar.a : null) == yka.b, null, null, new dx4(this, 15, viewGroupU1), 1920);
        ny8 ny8Var = this.t;
        new dz9((ez9) ny8Var.getValue(), B1()).a(getViewLifecycleScope());
        e9i.j0(new fz6(new jz(((u87) x1().d).u.b, 13), new d97(this, viewGroupU1, (lq4) null), i4), getViewLifecycleScope());
        r8e r8eVar2 = ((ez9) ny8Var.getValue()).h;
        e9i.j0(new e30(new fz6(new jz(r8eVar2, 13), new d97(r8eVar2, lq4Var, this, i3), i4), i2), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return new i1m(this.k.getAccessor().d(144));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerChatsTabWidget(t3fVar, E1(), py2.b, false, 8, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTransitionName(context.getString(R.string.chat_list_toolbar_transition_name));
        rccVar.setTitle(R.string.picker_chats_forward_title);
        rccVar.setActionsHorizontalPadding(new ylc(bc1.k(4.0f, yl5.d().getDisplayMetrics().density), bc1.k(4.0f, yl5.d().getDisplayMetrics().density)));
        rccVar.setForm(gcc.Compact);
        final int i2 = 0;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: b97
            public final /* synthetic */ ForwardPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                ForwardPickerScreen forwardPickerScreen = this.b;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = ForwardPickerScreen.z;
                        ltb onBackPressedDispatcher = forwardPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = ForwardPickerScreen.z;
                        opl.b(forwardPickerScreen, 1).f(view).l(forwardPickerScreen.E1() ? Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_cancel_selection, new tnh(R.string.forward_toolbar_action_cancel_selection), Integer.valueOf(R.drawable.icon_multi_unselect), (Integer) null, 20)) : Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_select, new tnh(R.string.forward_toolbar_action_select), Integer.valueOf(R.drawable.icon_multi_select), (Integer) null, 20))).b().build().u(forwardPickerScreen);
                        break;
                }
                return sbiVar;
            }
        }));
        final int i3 = 1;
        rccVar.setRightActions(new acc(new kcc(new e97(this, 0)), new hcc(R.drawable.icon_dots_vertical, new cf7(this) { // from class: b97
            public final /* synthetic */ ForwardPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i4 = i3;
                sbi sbiVar = sbi.a;
                ForwardPickerScreen forwardPickerScreen = this.b;
                View view = (View) obj;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = ForwardPickerScreen.z;
                        ltb onBackPressedDispatcher = forwardPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = ForwardPickerScreen.z;
                        opl.b(forwardPickerScreen, 1).f(view).l(forwardPickerScreen.E1() ? Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_cancel_selection, new tnh(R.string.forward_toolbar_action_cancel_selection), Integer.valueOf(R.drawable.icon_multi_unselect), (Integer) null, 20)) : Collections.singletonList(new rp4(R.id.oneme_picker_toolbar_action_select, new tnh(R.string.forward_toolbar_action_select), Integer.valueOf(R.drawable.icon_multi_select), (Integer) null, 20))).b().build().u(forwardPickerScreen);
                        break;
                }
                return sbiVar;
            }
        }), null));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        Long lValueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        Set setO1 = longArray != null ? a.o1(longArray) : null;
        if (setO1 == null) {
            setO1 = c76.a;
        }
        h hVar = this.k;
        return new u87(setO1, (o97) hVar.getAccessor().c(1011), this.m, lValueOf, D1(), (Context) hVar.getAccessor().d(7).getValue(), hVar.getAccessor().d(23), hVar.getAccessor().d(333), hVar.getAccessor().d(802), hVar.getAccessor().d(803), hVar.getAccessor().d(316), hVar.getAccessor().d(85), hVar.getAccessor().d(18), hVar.getAccessor().d(136), hVar.getAccessor().d(26));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        return ui9.a;
    }

    public ForwardPickerScreen(long[] jArr, ha9 ha9Var, Long l, boolean z2, boolean z3) {
        this(n1g.i(new ylc("messages_to_forward", jArr), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("attach_to_forward", l), new ylc("is_forward_attach", Boolean.valueOf(z2)), new ylc("show_external_sharing", Boolean.valueOf(z3))));
    }

    public /* synthetic */ ForwardPickerScreen(long[] jArr, ha9 ha9Var, Long l, boolean z2, boolean z3, int i, j95 j95Var) {
        this(jArr, ha9Var, (i & 4) != 0 ? null : l, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
