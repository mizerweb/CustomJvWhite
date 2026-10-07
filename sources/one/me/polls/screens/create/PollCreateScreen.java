package one.me.polls.screens.create;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ev;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gvc;
import defpackage.gwc;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.i7d;
import defpackage.iua;
import defpackage.j8e;
import defpackage.kn8;
import defpackage.lfe;
import defpackage.ln8;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.odb;
import defpackage.oi8;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.pyb;
import defpackage.q0d;
import defpackage.q35;
import defpackage.q7d;
import defpackage.qe7;
import defpackage.qyb;
import defpackage.qz9;
import defpackage.r7d;
import defpackage.rb5;
import defpackage.rcc;
import defpackage.rn8;
import defpackage.rt3;
import defpackage.rx8;
import defpackage.s7d;
import defpackage.sbf;
import defpackage.t7d;
import defpackage.uik;
import defpackage.v7d;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.y7d;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/polls/screens/create/PollCreateScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lkn8;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "requestCode", "Lha9;", "localAccountId", "(JILha9;)V", "polls"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PollCreateScreen extends Widget implements mc4, kn8 {
    public static final /* synthetic */ zv8[] n = {new dwd(PollCreateScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PollCreateScreen.class, "requestCode", "getRequestCode()I", 0), new dwd(PollCreateScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(PollCreateScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final vv a;
    public final vv b;
    public final oi8 c;
    public final wtc d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public Long h;
    public g8c i;
    public final ev j;
    public final ny8 k;
    public final rn8 l;
    public final i7d m;

    public PollCreateScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv("chat_id", Long.class);
        this.b = new vv(Integer.class, 0, "request_code");
        this.c = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = createViewModelLazy(y7d.class, new hta(16, new iua(29, this)));
        this.f = viewBinding(R.id.oneme_poll_create__recycler_view);
        this.g = viewBinding(R.id.oneme_poll_create__create_button_view);
        this.j = new ev(13, this);
        this.k = rx8.P(3, new gvc(17));
        this.l = new rn8(new ln8(this, new pyb(23)));
        this.m = new i7d(new q7d(this), new uik(20, this), ((a2c) wtcVar.getAccessor().c(27)).a());
    }

    @Override // defpackage.kn8
    public final void C0(lfe lfeVar) {
        View view;
        if (getView() == null) {
            return;
        }
        o1().setItemAnimator(null);
        Long l = this.h;
        if (l != null) {
            lfe lfeVarL = o1().L(l.longValue());
            if (lfeVarL != null && (view = lfeVarL.a) != null) {
                view.requestFocus();
            }
            this.h = null;
        }
    }

    @Override // defpackage.kn8
    public final void S0(int i, int i2) {
        this.m.S0(i, i2);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != R.id.oneme_poll_create__confirm_leave_button) {
            return;
        }
        a8j.x(p1().f, rt3.b);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.c;
    }

    @Override // defpackage.kn8
    public final void m0() {
        if (getView() == null) {
            return;
        }
        o1().setItemAnimator((rb5) this.k.getValue());
        View focusedChild = o1().getFocusedChild();
        if (focusedChild == null) {
            return;
        }
        focusedChild.clearFocus();
        this.h = Long.valueOf(o1().S(focusedChild).e);
    }

    public final RecyclerView o1() {
        return (RecyclerView) this.f.m(this, n[2]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context2 = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_poll_create__toolbar_view);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new p7d(0, this)));
        rccVar.setTitle(R.string.oneme_poll_create__toolbar_title);
        linearLayout.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(R.id.oneme_poll_create__recycler_view);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new PollCreateScreen$recycler$3$1());
        recyclerView.setAdapter(this.m);
        this.l.i(recyclerView);
        recyclerView.setItemAnimator(null);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingRight(), gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        qyb qybVar = new qyb(6, this);
        a8g a8gVar = pq3.j;
        recyclerView.h(new sbf(a8gVar.h(recyclerView), qybVar, null, null, null, 60), -1);
        recyclerView.h(new q35(2), -1);
        recyclerView.h(new odb(1, a8gVar.h(recyclerView)), -1);
        recyclerView.h(new v7d(recyclerView.getContext()), -1);
        recyclerView.h(new odb(recyclerView.getContext()), -1);
        recyclerView.i(new t7d(this, recyclerView));
        linearLayout.addView(recyclerView);
        frameLayout.addView(linearLayout);
        cyb cybVar = new cyb(frameLayout.getContext());
        cybVar.setId(R.id.oneme_poll_create__create_button_view);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iK);
        layoutParams3.setMarginEnd(iK);
        layoutParams3.bottomMargin = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.gravity = 80;
        cybVar.setLayoutParams(layoutParams3);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_poll_create__create_button_title));
        qe7.H(cybVar, 300L, new gwc(3, this));
        frameLayout.addView(cybVar);
        n1g.N(new r7d(3, null, 0), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        g8c g8cVar = this.i;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.i = null;
        this.l.i(null);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        View focusedChild = o1().getFocusedChild();
        if (focusedChild != null) {
            focusedChild.clearFocus();
        }
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), this.j);
        }
        q0d q0dVar = p1().e;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(q0dVar, i19VarF, n09Var), new qz9((lq4) null, this, 25), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().f, getViewLifecycleOwner().f(), n09Var), new s7d((lq4) null, view, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().g, getViewLifecycleOwner().f(), n09Var), new s7d((lq4) null, this, view), 3), getViewLifecycleScope());
    }

    public final y7d p1() {
        return (y7d) this.e.getValue();
    }

    public PollCreateScreen(long j, int i, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat_id", Long.valueOf(j)), new ylc("request_code", Integer.valueOf(i))));
    }
}
