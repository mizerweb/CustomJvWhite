package one.me.chats.picker.members;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.c;
import defpackage.c0a;
import defpackage.ca2;
import defpackage.ce;
import defpackage.czc;
import defpackage.d97;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g5d;
import defpackage.hta;
import defpackage.iaa;
import defpackage.j95;
import defpackage.k96;
import defpackage.lq4;
import defpackage.m8b;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nxc;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.oxc;
import defpackage.p3c;
import defpackage.pvh;
import defpackage.py2;
import defpackage.rt2;
import defpackage.sy7;
import defpackage.t3f;
import defpackage.tre;
import defpackage.txc;
import defpackage.vv;
import defpackage.w8;
import defpackage.xyc;
import defpackage.ylc;
import defpackage.yyc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zv8;
import defpackage.zyc;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lnxc;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "decorsEnabled", "Lpy2;", "chatFilter", "isChat", "(Lt3f;JZLpy2;Z)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickerMembersListWidget extends Widget implements nxc {
    public static final /* synthetic */ zv8[] p = {new dwd(PickerMembersListWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PickerMembersListWidget.class, "decorsEnabled", "getDecorsEnabled()Z", 0), new dwd(PickerMembersListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new dwd(PickerMembersListWidget.class, "isChat", "isChat()Z", 0), new dwd(PickerMembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final ca2 e;
    public final ny8 f;
    public final ny8 g;
    public final ExecutorService h;
    public final oxc i;
    public final oxc j;
    public final ow0 k;
    public final ow0 l;
    public pvh m;
    public sy7 n;
    public zpg o;

    public PickerMembersListWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv(Long.class, 0L, "chat_id");
        this.b = new vv(Boolean.class, Boolean.TRUE, "decors_enabled");
        this.c = new vv("picker.filter", py2.class);
        this.d = new vv("picker.is_chat", Boolean.class);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.e = ca2Var;
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.f = getSharedViewModel((t3f) ((Parcelable) objF0), txc.class, null);
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(czc.class, new hta(13, new yyc(this, 0)));
        this.g = ny8VarCreateViewModelLazy;
        ExecutorService executorServiceA = ca2Var.b().a();
        this.h = executorServiceA;
        this.i = new oxc(this, executorServiceA, 0);
        this.j = new oxc(this, executorServiceA, 0);
        this.k = binding(new yyc(this, 1));
        this.l = binding(new yyc(this, 2));
        e9i.j0(new fz6(((czc) ny8VarCreateViewModelLazy.getValue()).i, new zyc(this, null, 0), 3), getLifecycleScope());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0037  */
    @Override // defpackage.nxc
    public final void T0(xyc xycVar, boolean z) {
        int i;
        txc txcVarQ1 = q1();
        zv8[] zv8VarArr = p;
        zv8 zv8Var = zv8VarArr[2];
        py2 py2Var = (py2) this.c.a(this);
        zv8 zv8Var2 = zv8VarArr[3];
        boolean zBooleanValue = ((Boolean) this.d.a(this)).booleanValue();
        czc czcVar = (czc) this.g.getValue();
        mjg mjgVar = czcVar.h;
        if (!czcVar.D((m8b) mjgVar.getValue())) {
            i = 0;
        } else if (((m8b) mjgVar.getValue()).d >= ((g5d) czcVar.f).d()) {
            i = 1;
        } else {
            rt2 rt2VarC = czcVar.C();
            if ((rt2VarC == null || !rt2VarC.e0()) && !czcVar.d) {
                i = 0;
            } else {
                i = 2;
            }
        }
        txcVarQ1.B(xycVar, z, py2Var, zBooleanValue, i);
    }

    public final void o1(k96 k96Var) {
        p3c p3cVar = new p3c(11, new iaa(this, 28, k96Var));
        zpg zpgVar = new zpg(k96Var, this.i, p3cVar);
        this.o = zpgVar;
        k96Var.h(zpgVar, -1);
        sy7 sy7Var = new sy7(p3cVar);
        this.n = sy7Var;
        k96Var.h(sy7Var, -1);
        n1g.N(new ce(zpgVar, null, 4), k96Var);
    }

    @Override // defpackage.br4
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        e9i.j0(new fz6(q1().l, new w8(2, (czc) this.g.getValue(), czc.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 26), 3), getLifecycleScope());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(r1());
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        pvh pvhVar = this.m;
        if (pvhVar != null) {
            pvhVar.b(r1());
        }
        this.m = null;
        this.n = null;
        this.o = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((czc) this.g.getValue()).j, getViewLifecycleOwner().f(), n09.d), new d97((lq4) null, this, view, 22), 3), getViewLifecycleScope());
        e9i.j0(new fz6(q1().i, new zyc(this, null, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(q1().l, new zyc(this, null, 2), 3), getViewLifecycleScope());
    }

    public final boolean p1() {
        zv8 zv8Var = p[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final txc q1() {
        return (txc) this.f.getValue();
    }

    public final k96 r1() {
        zv8 zv8Var = p[4];
        return (k96) this.l.getValue();
    }

    public PickerMembersListWidget(t3f t3fVar, long j, boolean z, py2 py2Var, boolean z2) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("chat_id", Long.valueOf(j)), new ylc("decors_enabled", Boolean.valueOf(z)), new ylc("picker.filter", py2Var), new ylc("picker.is_chat", Boolean.valueOf(z2))));
    }

    public /* synthetic */ PickerMembersListWidget(t3f t3fVar, long j, boolean z, py2 py2Var, boolean z2, int i, j95 j95Var) {
        this(t3fVar, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z, (i & 8) != 0 ? py2.a : py2Var, (i & 16) != 0 ? true : z2);
    }
}
