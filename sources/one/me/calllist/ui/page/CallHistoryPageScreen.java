package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a4c;
import defpackage.c9;
import defpackage.ca2;
import defpackage.cl1;
import defpackage.cqk;
import defpackage.dwd;
import defpackage.e92;
import defpackage.e9i;
import defpackage.el1;
import defpackage.er3;
import defpackage.fl1;
import defpackage.fz6;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i92;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.in;
import defpackage.j8e;
import defpackage.je9;
import defpackage.k66;
import defpackage.k96;
import defpackage.kl1;
import defpackage.l8b;
import defpackage.lh9;
import defpackage.lof;
import defpackage.lq4;
import defpackage.m;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.mmc;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nk1;
import defpackage.ny8;
import defpackage.o5b;
import defpackage.p5b;
import defpackage.p6f;
import defpackage.p7b;
import defpackage.pvh;
import defpackage.qz9;
import defpackage.r;
import defpackage.r1c;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tre;
import defpackage.v09;
import defpackage.vd7;
import defpackage.vl1;
import defpackage.vv;
import defpackage.w09;
import defpackage.wme;
import defpackage.wre;
import defpackage.xu1;
import defpackage.yl1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw7;
import defpackage.z79;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lp6f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lyl1;", "type", "Lha9;", "localAccountId", "(Lyl1;Lha9;)V", "er3", "call-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallHistoryPageScreen extends Widget implements mc4, p6f {
    public final ny8 a;
    public final h b;
    public final ca2 c;
    public final ny8 d;
    public final ny8 e;
    public pvh f;
    public final wme g;
    public final j8e h;
    public final ifh i;
    public final vv j;
    public final ny8 k;
    public static final /* synthetic */ zv8[] m = {new dwd(CallHistoryPageScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zo5.e(zfe.a, CallHistoryPageScreen.class, "typeArg", "getTypeArg()Ljava/lang/String;")};
    public static final er3 l = new er3();

    public CallHistoryPageScreen(Bundle bundle) {
        super(bundle);
        this.a = getSharedViewModel(new t3f("call_history_scope_id", getB().b()), vl1.class, null);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = new ca2(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(kl1.class, new r(17, new el1(this, 0)));
        this.e = rx8.P(3, new el1(this, 1));
        this.g = new wme(new el1(this, 2));
        this.h = viewBinding(R.id.call_history_list);
        this.i = new ifh(new el1(this, 3));
        this.j = new vv("type_arg", String.class);
        this.k = hVar.getAccessor().d(377);
    }

    public static final void o1(CallHistoryPageScreen callHistoryPageScreen, long j) {
        Object value;
        LinkedHashSet linkedHashSetX;
        yw7 yw7VarD = callHistoryPageScreen.s1().D(j);
        if (yw7VarD == null) {
            return;
        }
        vl1 vl1VarR1 = callHistoryPageScreen.r1();
        p5b p5bVar = vl1VarR1.h;
        long j2 = yw7VarD.a;
        boolean zContains = ((o5b) p5bVar.b.a.getValue()).b.contains(Long.valueOf(j2));
        l8b l8bVar = vl1VarR1.i;
        if (zContains) {
            l8bVar.k(j2);
        } else {
            l8bVar.l(j2, yw7VarD);
        }
        Long lValueOf = Long.valueOf(j2);
        mjg mjgVar = p5bVar.a;
        do {
            value = mjgVar.getValue();
            o5b o5bVar = (o5b) value;
            boolean zContains2 = o5bVar.b.contains(lValueOf);
            Set set = o5bVar.b;
            linkedHashSetX = zContains2 ? lof.X(set, lValueOf) : lof.a0(set, lValueOf);
            linkedHashSetX.isEmpty();
        } while (!mjgVar.h(value, new o5b(linkedHashSetX, false, 4)));
    }

    @Override // defpackage.p6f
    public final void U0() {
        if (getView() != null) {
            q1().w0(0);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((xu1) this.e.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        kl1 kl1VarS1 = s1();
        if (kl1VarS1.E()) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallHistoryPageViewModel", "unregister load history callbacks for type=" + kl1VarS1.c, null);
            }
        }
        i92 i92Var = kl1VarS1.f;
        i92Var.o.S0().D0(k66.a, new e92(i92Var, 1));
        kl1VarS1.f.f.remove(kl1VarS1);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        s1().G();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        r1c r1cVar = (r1c) this.g.getValue();
        if (r1cVar != null) {
            frameLayout.addView(r1cVar, -1, -1);
        }
        k96 k96Var = new k96(frameLayout.getContext());
        k96Var.setId(R.id.call_history_list);
        frameLayout.addView(k96Var, -1, -1);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.g.a();
        pvh pvhVar = this.f;
        if (pvhVar != null) {
            pvhVar.b(q1());
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((xu1) this.e.getValue()).b(i, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k96 k96VarQ1 = q1();
        k96VarQ1.getContext();
        k96VarQ1.setLayoutManager(new LinearLayoutManager());
        k96VarQ1.setAdapter((cl1) this.i.getValue());
        k96VarQ1.setItemAnimator(new nk1());
        this.f = tre.Y(k96VarQ1);
        r1c r1cVar = (r1c) this.g.getValue();
        if (r1cVar != null) {
            k96VarQ1.setEmptyView(r1cVar);
        }
        int i = 0;
        k96VarQ1.setPager(new gl1(this, i));
        int i2 = 1;
        k96VarQ1.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96VarQ1.setThreshold(10);
        k96VarQ1.setClipToPadding(false);
        k96VarQ1.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        lq4 lq4Var = null;
        int i3 = 3;
        mmc.d(new fz6(s1().v, new fl1(this, null), i3), getViewLifecycleScope());
        ic6 ic6Var = s1().y;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new fl1(lq4Var, this, i), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().z, getViewLifecycleOwner().f(), n09Var), new c9(2, lq4Var, i3), i3), getViewLifecycleScope());
        if (s1().c == yl1.ALL) {
            mmc.d(new fz6(s1().x, new in(this, (lq4) null, 1), i3), getViewLifecycleScope());
        }
        p5b p5bVar = r1().h;
        k96 k96VarQ2 = q1();
        v09 viewLifecycleScope = getViewLifecycleScope();
        z79 z79Var = new z79(k96VarQ2, new p7b(), new wre(p5bVar, k96VarQ2, new m(22, this), 23));
        vd7.B(((w09) viewLifecycleScope).b).Y(new lh9(13, z79Var));
        e9i.j0(new fz6(p5bVar.b, new qz9(z79Var, lq4Var, 12), i3), viewLifecycleScope);
        e9i.j0(new fz6(n1g.v(r1().h.b, getViewLifecycleOwner().f(), n09Var), new fl1(lq4Var, this, i2), i3), getViewLifecycleScope());
    }

    public final yl1 p1() {
        Object next;
        zv8 zv8Var = m[1];
        String str = (String) this.j.a(this);
        Iterator it = yl1.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((yl1) next).name(), str));
        yl1 yl1Var = (yl1) next;
        return yl1Var == null ? yl1.ALL : yl1Var;
    }

    public final k96 q1() {
        return (k96) this.h.m(this, m[0]);
    }

    public final vl1 r1() {
        return (vl1) this.a.getValue();
    }

    public final kl1 s1() {
        return (kl1) this.d.getValue();
    }

    public CallHistoryPageScreen(yl1 yl1Var, ha9 ha9Var) {
        this(n1g.i(new ylc("type_arg", yl1Var.name()), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
