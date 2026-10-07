package one.me.chats.picker.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.aac;
import defpackage.br4;
import defpackage.ca2;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg8;
import defpackage.fz6;
import defpackage.gp2;
import defpackage.ha9;
import defpackage.hta;
import defpackage.hve;
import defpackage.j95;
import defpackage.kyc;
import defpackage.lyc;
import defpackage.myc;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n57;
import defpackage.n5b;
import defpackage.n67;
import defpackage.nee;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.py2;
import defpackage.pyb;
import defpackage.qt4;
import defpackage.qyb;
import defpackage.qz4;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tj6;
import defpackage.txc;
import defpackage.uf4;
import defpackage.vv;
import defpackage.wf0;
import defpackage.wf4;
import defpackage.wy7;
import defpackage.xc3;
import defpackage.y8j;
import defpackage.ylc;
import defpackage.z2i;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "", "Ln5b;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "isInMultiSelect", "Lpy2;", "filter", "showStoryCell", "(Lt3f;ZLpy2;Z)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickerChatsTabWidget extends Widget implements n5b {
    public static final /* synthetic */ zv8[] p = {new dwd(PickerChatsTabWidget.class, "sharedScopeId", "getSharedScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.e(zfe.a, PickerChatsTabWidget.class, "isInMultiSelect", "isInMultiSelect()Z"), new dwd(PickerChatsTabWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new dwd(PickerChatsTabWidget.class, "showStoryCell", "getShowStoryCell()Z", 0), new dwd(PickerChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(PickerChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final oi8 e;
    public final ca2 f;
    public final ow0 g;
    public final ow0 h;
    public final ny8 i;
    public qz4 j;
    public final n67 k;
    public final int l;
    public final n57 m;
    public final z2i n;
    public final wy7 o;

    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv("scope.id", t3f.class);
        this.a = vvVar;
        this.b = new vv(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.c = new vv("picker.filter", py2.class);
        Boolean bool = Boolean.FALSE;
        this.d = new vv(Boolean.class, bool, "show.story.cell");
        this.e = oi8.e;
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.f = ca2Var;
        this.g = binding(new lyc(this, 0));
        this.h = binding(new lyc(this, 1));
        zv8 zv8Var = p[0];
        this.i = getSharedViewModel((t3f) vvVar.a(this), txc.class, null);
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(kyc.class, new hta(10, new lyc(this, 2)));
        this.k = new n67(false, ca2Var.b().a(), new eg8(bool));
        this.l = 3;
        t3f b = getB();
        ha9 ha9VarB = getB().b();
        a aVar = new a();
        aVar.setMaxRecycledViews(R.id.oneme_picker_chat_item_view_type, 30);
        this.m = new n57(b, ha9VarB, this, aVar, new qyb(5, this), null, 80);
        z2i z2iVar = new z2i();
        z2iVar.P(new gp2());
        z2iVar.P(new tj6());
        z2iVar.S(0);
        z2iVar.G(150L);
        this.n = z2iVar;
        this.o = new wy7(9, this);
        e9i.j0(new fz6(n1g.v(((kyc) ny8VarCreateViewModelLazy.getValue()).c, getViewLifecycleOwner().f(), n09.d), new myc(null, this, 1), 3), getViewLifecycleScope());
    }

    @Override // defpackage.n5b
    public final void d0(boolean z) {
        Object targetWidget = getTargetWidget();
        n5b n5bVar = targetWidget instanceof n5b ? (n5b) targetWidget : null;
        if (n5bVar != null) {
            n5bVar.d0(true);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.e;
    }

    public final aac o1() {
        zv8 zv8Var = p[4];
        return (aac) this.g.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        aac aacVarO1 = o1();
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.i = 0;
        uf4Var.e = 0;
        uf4Var.h = 0;
        wf4Var.addView(aacVarO1, uf4Var);
        y8j y8jVarP1 = p1();
        uf4 uf4Var2 = new uf4(0, 0);
        uf4Var2.j = R.id.chats_list_folders_tabs;
        uf4Var2.l = 0;
        uf4Var2.e = 0;
        uf4Var2.h = 0;
        wf4Var.addView(y8jVarP1, uf4Var2);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        p1().j(this.o);
        qz4 qz4Var = this.j;
        if (qz4Var != null) {
            qz4Var.c();
        }
        this.j = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        p1().e(this.o);
        y8j y8jVarP1 = p1();
        n57 n57Var = this.m;
        y8jVarP1.setAdapter(n57Var);
        p1().setOffscreenPageLimit(this.l);
        qz4 qz4VarA = this.k.a(o1(), p1(), new pyb(18), new wf0(18), new pyb(19));
        qz4VarA.a();
        this.j = qz4VarA;
        View childAt = p1().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        if (n57Var.s.size() > 0) {
            p1().h(0, false);
            p1().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        e9i.j0(new fz6(n1g.v(e9i.I(new xc3(((txc) this.i.getValue()).l, 23)), getViewLifecycleOwner().f(), n09.d), new myc(null, this, 0), 3), getViewLifecycleScope());
    }

    public final y8j p1() {
        zv8 zv8Var = p[5];
        return (y8j) this.h.getValue();
    }

    public final void q1(boolean z) {
        zv8 zv8Var = p[1];
        this.b.b(this, Boolean.valueOf(z));
        nee adapter = p1().getAdapter();
        if (adapter != null) {
            int iL = adapter.l();
            for (int i = 0; i < iL; i++) {
                hve hveVarI = this.m.I(i);
                if (hveVarI != null) {
                    br4 br4VarI = rx8.I(hveVarI);
                    PickerChatsListWidget pickerChatsListWidget = br4VarI instanceof PickerChatsListWidget ? (PickerChatsListWidget) br4VarI : null;
                    if (pickerChatsListWidget != null) {
                        qt4.C(z, pickerChatsListWidget.x1().A, null);
                    }
                }
            }
        }
    }

    public PickerChatsTabWidget(t3f t3fVar, boolean z, py2 py2Var, boolean z2) {
        this(n1g.i(new ylc("scope.id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a)), new ylc("is_in_multiselect", Boolean.valueOf(z)), new ylc("picker.filter", py2Var), new ylc("show.story.cell", Boolean.valueOf(z2))));
    }

    public /* synthetic */ PickerChatsTabWidget(t3f t3fVar, boolean z, py2 py2Var, boolean z2, int i, j95 j95Var) {
        this(t3fVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? py2.a : py2Var, (i & 8) != 0 ? false : z2);
    }
}
