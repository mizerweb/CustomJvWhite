package one.me.calls.share;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.a22;
import defpackage.b22;
import defpackage.bc1;
import defpackage.d22;
import defpackage.d4f;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.h;
import defpackage.i19;
import defpackage.i1m;
import defpackage.in1;
import defpackage.j11;
import defpackage.kj1;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.m;
import defpackage.m8b;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.oi8;
import defpackage.p90;
import defpackage.py2;
import defpackage.pyc;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rt3;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tre;
import defpackage.ud9;
import defpackage.ui9;
import defpackage.vv1;
import defpackage.wbc;
import defpackage.xde;
import defpackage.y3f;
import defpackage.ybc;
import defpackage.yl5;
import defpackage.ylc;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/share/CallSharePickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "La22;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "calls-share"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallSharePickerScreen extends AbstractPickerScreen<a22> implements mc4 {
    public static final oi8 p = new oi8(0, 4, 0, new j11(4, 3, false), 5);
    public final ks6 j;
    public final oi8 k;
    public final mjg l;
    public final h m;
    public final xde n;
    public ConfirmationBottomSheet o;

    public CallSharePickerScreen(Bundle bundle) {
        super(bundle);
        this.j = tre.F(this, y3f.CALL_ADD_PARTICIPANTS);
        this.k = oi8.e;
        this.l = p90.a(new tnh(R.string.call_share_search_hint));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.m = hVar;
        this.n = new xde(hVar.getAccessor().d(23), hVar.getAccessor().d(144), 4);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.call_share_picker_confirm_p2p_invite_retry) {
            ((a22) x1().d).f();
        } else if (i == R.id.call_share_picker_confirm_p2p_invite_cancel) {
            ((a22) x1().d).i.a(rt3.b);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getK() {
        return this.k;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.j;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        vv1 vv1Var = new vv1(getContext());
        vv1Var.setId(R.id.oneme_picker_quote_view);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new ud9(i, lq4Var, 5), vv1Var);
        vv1Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vv1Var.setMinHeight(gm0.K(62.0f * yl5.d().getDisplayMetrics().density));
        vv1Var.setOnConfirmClickListener$calls_share(new kj1(0, x1().d, a22.class, "onShareConfirmed", "onShareConfirmed$calls_share()V", 0, 7));
        r8e r8eVar = x1().i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new d22(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((a22) x1().d).h, getViewLifecycleOwner().f(), n09Var), new in1(lq4Var, vv1Var, 4), i), getViewLifecycleScope());
        return Collections.singletonList(vv1Var);
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ConfirmationBottomSheet confirmationBottomSheet = this.o;
        if (confirmationBottomSheet != null) {
            confirmationBottomSheet.v1(false);
        }
        nl9.c(view);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((rcc) this.e.m(this, AbstractPickerScreen.i[0])).requestFocus();
        lvb.H(u1(), p, null);
        e9i.j0(new fz6(n1g.v(((a22) x1().d).j, getViewLifecycleOwner().f(), n09.d), new d22(null, this, 1), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return new i1m(this.m.getAccessor().d(144));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerChatsTabWidget(t3fVar, false, py2.b, false, 10, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        String string = getArgs().getString("calls_share_title", null);
        if (string == null) {
            string = context.getString(R.string.share);
        }
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setFocusable(true);
        rccVar.setFocusableInTouchMode(true);
        rccVar.setTitle(string);
        rccVar.setActionsHorizontalPadding(new ylc(bc1.k(4.0f, yl5.d().getDisplayMetrics().density), bc1.k(4.0f, yl5.d().getDisplayMetrics().density)));
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new m(29, this)));
        rccVar.setRightActions(ybc.a);
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        b22 b22Var = (b22) this.m.getAccessor().c(1014);
        b22Var.getClass();
        return new a22(this.n, b22Var.a, b22Var.b, b22Var.c, b22Var.d, b22Var.e);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.l;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }
}
