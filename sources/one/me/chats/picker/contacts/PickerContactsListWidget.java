package one.me.chats.picker.contacts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c;
import defpackage.c0a;
import defpackage.c37;
import defpackage.ca2;
import defpackage.ce;
import defpackage.d3;
import defpackage.d97;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.hta;
import defpackage.iaa;
import defpackage.j95;
import defpackage.jsc;
import defpackage.kp0;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nxc;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.oxc;
import defpackage.p3c;
import defpackage.pvh;
import defpackage.py2;
import defpackage.q84;
import defpackage.qz9;
import defpackage.r07;
import defpackage.r84;
import defpackage.ryc;
import defpackage.svj;
import defpackage.sy7;
import defpackage.t3f;
import defpackage.tre;
import defpackage.txc;
import defpackage.um4;
import defpackage.vv;
import defpackage.vyc;
import defpackage.w8;
import defpackage.wsc;
import defpackage.xyc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo0;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/picker/contacts/PickerContactsListWidget;", "Lone/me/sdk/arch/Widget;", "Lnxc;", "", "Lum4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lpy2;", "filter", "(Lt3f;Lpy2;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickerContactsListWidget extends Widget implements nxc, um4 {
    public static final /* synthetic */ zv8[] q = {new dwd(PickerContactsListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), zo5.f(zfe.a, PickerContactsListWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final vv a;
    public final ca2 b;
    public final ca2 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ExecutorService g;
    public final oxc h;
    public final oxc i;
    public final lp0 j;
    public final r84 k;
    public final ow0 l;
    public final ow0 m;
    public pvh n;
    public sy7 o;
    public zpg p;

    public PickerContactsListWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv("picker.filter", py2.class);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var;
        ca2 ca2Var2 = new ca2(m35getAccountScopeuqN4xOY());
        this.c = ca2Var2;
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.d = getSharedViewModel((t3f) ((Parcelable) objF0), txc.class, null);
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(vyc.class, new hta(11, new ryc(this, 0)));
        this.e = ny8VarCreateViewModelLazy;
        ny8 ny8VarCreateViewModelLazy2 = createViewModelLazy(zo0.class, new hta(12, new ryc(this, 1)));
        this.f = ca2Var.c();
        ExecutorService executorServiceA = ca2Var.b().a();
        this.g = executorServiceA;
        oxc oxcVar = new oxc(this, executorServiceA, 48);
        this.h = oxcVar;
        this.i = new oxc(this, executorServiceA, 48);
        lp0 lp0Var = new lp0(this, (kp0) ca2Var2.getAccessor().c(235), executorServiceA, 0);
        this.j = lp0Var;
        this.k = new r84(new q84(false, 1), lp0Var, oxcVar);
        this.l = binding(new ryc(this, 2));
        this.m = binding(new ryc(this, 3));
        e9i.j0(new r07(((vyc) ny8VarCreateViewModelLazy.getValue()).d, ((zo0) ny8VarCreateViewModelLazy2.getValue()).i, new d3(this, null, 28), 0), getLifecycleScope());
    }

    @Override // defpackage.um4
    public final void B(int i) {
        z();
    }

    @Override // defpackage.nxc
    public final void T0(xyc xycVar, boolean z) {
        txc txcVarP1 = p1();
        zv8 zv8Var = q[0];
        txcVarP1.B(xycVar, z, (py2) this.a.a(this), true, 0);
    }

    public final void o1(RecyclerView recyclerView) {
        p3c p3cVar = new p3c(11, new iaa(this, 26, recyclerView));
        zpg zpgVar = new zpg(recyclerView, this.k, p3cVar);
        this.p = zpgVar;
        recyclerView.h(zpgVar, -1);
        sy7 sy7Var = new sy7(p3cVar);
        this.o = sy7Var;
        recyclerView.h(sy7Var, -1);
        n1g.N(new ce(zpgVar, null, 3), recyclerView);
    }

    @Override // defpackage.br4
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        e9i.j0(new fz6(p1().l, new w8(2, (vyc) this.e.getValue(), vyc.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 25), 3), getLifecycleScope());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(q1());
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        pvh pvhVar = this.n;
        if (pvhVar != null) {
            pvhVar.b(q1());
        }
        this.n = null;
        this.o = null;
        this.p = null;
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            wsc wscVar = (wsc) this.f.getValue();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVar.getClass();
            wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((vyc) this.e.getValue()).f, getViewLifecycleOwner().f(), n09.d), new d97((lq4) null, this, view, 21), 3), getViewLifecycleScope());
        e9i.j0(new fz6(p1().i, new c37(this, null, 16), 3), getViewLifecycleScope());
        e9i.j0(new fz6(p1().l, new qz9(this, (lq4) null, 20), 3), getViewLifecycleScope());
    }

    public final txc p1() {
        return (txc) this.d.getValue();
    }

    public final RecyclerView q1() {
        zv8 zv8Var = q[1];
        return (RecyclerView) this.m.getValue();
    }

    @Override // defpackage.um4
    public final void z() {
        ((wsc) this.f.getValue()).m(new svj(this, 1), wsc.f, 156);
    }

    public PickerContactsListWidget(t3f t3fVar, py2 py2Var) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("picker.filter", py2Var)));
    }

    public /* synthetic */ PickerContactsListWidget(t3f t3fVar, py2 py2Var, int i, j95 j95Var) {
        this(t3fVar, (i & 2) != 0 ? py2.a : py2Var);
    }
}
