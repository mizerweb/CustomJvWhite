package one.me.calls.ui.bottomsheet.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ade;
import defpackage.ao1;
import defpackage.as1;
import defpackage.bc1;
import defpackage.bmc;
import defpackage.br1;
import defpackage.c79;
import defpackage.da1;
import defpackage.due;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ee1;
import defpackage.et3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h02;
import defpackage.i19;
import defpackage.ie;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nt4;
import defpackage.ny8;
import defpackage.ore;
import defpackage.pq3;
import defpackage.q91;
import defpackage.r;
import defpackage.r66;
import defpackage.r91;
import defpackage.rx8;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.ty1;
import defpackage.ur1;
import defpackage.vr1;
import defpackage.vv;
import defpackage.vy1;
import defpackage.wo1;
import defpackage.wr1;
import defpackage.x7j;
import defpackage.xb9;
import defpackage.xr1;
import defpackage.ya1;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lvr1;", "type", "(Lt3f;Lvr1;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] t = {new dwd(CallMoreBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, CallMoreBottomSheet.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final ny8 m;
    public final sx1 n;
    public final ny8 o;
    public final j8e p;
    public final ny8 q;
    public final ny8 r;
    public final ur1 s;

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        zv8 zv8Var = t[0];
        this.m = getSharedViewModel((t3f) vvVar.a(this), h02.class, null);
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.n = sx1Var;
        this.o = createViewModelLazy(as1.class, new r(23, new z2(this, 18, bundle)));
        this.p = viewBinding(R.id.call_more_actions_list);
        ny8 ny8VarP = rx8.P(3, new br1(3));
        this.q = ny8VarP;
        ny8 ny8VarP2 = rx8.P(3, new br1(4));
        this.r = ny8VarP2;
        this.s = new ur1(new due(this), (ade) ny8VarP.getValue(), (ee1) ny8VarP2.getValue(), sx1Var.b().a());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        linearLayoutJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(linearLayoutJ.getContext());
        frameLayout2.setId(R.id.call_more_popup_drag_layout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 49;
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(pq3.j.l(frameLayout2).b.getIcon().e);
        linearLayoutJ.addView(frameLayout2);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.call_more_actions_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.s);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new q91(0), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new xr1(3, null, 0), linearLayoutJ);
        frameLayout.addView(linearLayoutJ);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.p.m(this, t[1])).setAdapter(null);
        ((ee1) this.r.getValue()).a.b();
        ((ade) this.q.getValue()).a.clear();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List listJ;
        ny8 ny8Var = this.o;
        as1 as1Var = (as1) ny8Var.getValue();
        h02 h02Var = as1Var.d;
        ny8 ny8Var2 = as1Var.g;
        ao1 ao1Var = (ao1) h02Var.u.a.getValue();
        int iOrdinal = as1Var.c.ordinal();
        if (iOrdinal == 0) {
            listJ = r66.a;
        } else if (iOrdinal == 1) {
            boolean z = ao1Var.h;
            vy1 vy1Var = ao1Var.j;
            if (z) {
                r91 r91Var = bmc.a;
                ty1 ty1Var = ao1Var.k;
                boolean zM = ((ya1) ((da1) as1Var.f.getValue())).m();
                boolean z2 = ao1Var.m;
                x7j x7jVar = (x7j) h02Var.H.a.getValue();
                boolean zB0 = ((xb9) ((et3) ny8Var2.getValue())).b0();
                c79 c79VarW = yab.w();
                boolean z3 = !z2 || vy1Var.a();
                x7j x7jVar2 = x7j.c;
                if (x7jVar == x7jVar2 && z3) {
                    c79VarW.add(bmc.n);
                } else if (x7jVar == x7jVar2) {
                    c79VarW.add(bmc.m);
                } else {
                    x7j x7jVar3 = x7j.a;
                    if (x7jVar == x7jVar3 && z3) {
                        c79VarW.add(bmc.l);
                    } else if (x7jVar == x7jVar3) {
                        c79VarW.add(bmc.k);
                    }
                }
                c79VarW.add(bmc.q);
                bmc.a(c79VarW, vy1Var);
                c79VarW.addAll(bmc.b(ty1Var));
                if (zM) {
                    c79VarW.add(bmc.p);
                }
                if (zB0) {
                    c79VarW.add(bmc.o);
                }
                listJ = yab.j(c79VarW);
            } else {
                r91 r91Var2 = bmc.a;
                boolean zBooleanValue = ((Boolean) ((wo1) h02Var.e.i).i.a.getValue()).booleanValue();
                boolean zB1 = ((xb9) ((et3) ny8Var2.getValue())).b0();
                c79 c79VarW2 = yab.w();
                if (zBooleanValue) {
                    c79VarW2.add(bmc.c);
                }
                bmc.a(c79VarW2, vy1Var);
                c79VarW2.add(bmc.b);
                c79VarW2.add(bmc.a);
                if (zB1) {
                    c79VarW2.add(bmc.o);
                }
                listJ = yab.j(c79VarW2);
            }
        } else if (iOrdinal != 2) {
            ore.o();
            return;
        } else {
            r91 r91Var3 = bmc.a;
            listJ = bmc.b(ao1Var.k);
        }
        this.s.H(listJ);
        ie ieVar = ((as1) ny8Var.getValue()).j;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ieVar, i19VarF, n09Var), new wr1(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((as1) ny8Var.getValue()).d.I, getViewLifecycleOwner().f(), n09Var), new wr1(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((as1) ny8Var.getValue()).k, getViewLifecycleOwner().f(), n09Var), new wr1(null, this, 2), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public CallMoreBottomSheet(t3f t3fVar, vr1 vr1Var) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("open_type", vr1Var.name())));
    }
}
