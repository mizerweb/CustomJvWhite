package one.me.chats.picker.chats;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import defpackage.a4c;
import defpackage.an3;
import defpackage.b65;
import defpackage.bhb;
import defpackage.c;
import defpackage.c0a;
import defpackage.ca2;
import defpackage.ce;
import defpackage.cqk;
import defpackage.dhb;
import defpackage.dwd;
import defpackage.dyc;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.em3;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.fz6;
import defpackage.g26;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.hta;
import defpackage.hyc;
import defpackage.i19;
import defpackage.iyc;
import defpackage.j3;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.k96;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nee;
import defpackage.ny8;
import defpackage.ore;
import defpackage.oxc;
import defpackage.pvh;
import defpackage.py2;
import defpackage.q84;
import defpackage.qt4;
import defpackage.r1c;
import defpackage.r84;
import defpackage.r8e;
import defpackage.rx8;
import defpackage.see;
import defpackage.sy7;
import defpackage.t3f;
import defpackage.t84;
import defpackage.tnh;
import defpackage.tre;
import defpackage.txc;
import defpackage.uik;
import defpackage.vv;
import defpackage.w8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zv8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "", "Lan3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lt3f;", "scopeId", "Lpy2;", "filter", "", "isFakeChatsEnabled", "isFiltersEnabled", "isInMultiSelect", "showStoryCell", "(Ljava/lang/String;Lt3f;Lpy2;ZZZZ)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickerChatsListWidget extends Widget implements an3 {
    public static final /* synthetic */ zv8[] x = {new dwd(PickerChatsListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), zo5.f(zfe.a, PickerChatsListWidget.class, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), new dwd(PickerChatsListWidget.class, "isFolderFiltersEnabled", "isFolderFiltersEnabled()Z", 0), new dwd(PickerChatsListWidget.class, "isInMultiSelect", "isInMultiSelect()Z", 0), new dwd(PickerChatsListWidget.class, "showStoryCell", "getShowStoryCell()Z", 0), new dwd(PickerChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(PickerChatsListWidget.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final ca2 a;
    public final ny8 b;
    public final String c;
    public final ny8 d;
    public final String e;
    public final vv f;
    public final vv g;
    public final vv h;
    public final vv i;
    public final vv j;
    public final ny8 k;
    public pvh l;
    public sy7 m;
    public zpg n;
    public final ExecutorService o;
    public a p;
    public final em3 q;
    public final r84 r;
    public final oxc s;
    public final oxc t;
    public final j8e u;
    public final j8e v;
    public final ny8 w;

    public PickerChatsListWidget(Bundle bundle) {
        super(bundle);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.a = ca2Var;
        this.b = ca2Var.d();
        this.c = PickerChatsListWidget.class.getName();
        Object objF0 = tre.f0(bundle, "scope.id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key scope.id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.d = getSharedViewModel((t3f) ((Parcelable) objF0), txc.class, null);
        String string = bundle.getString("folder.id.key");
        if (string == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.e = string;
        this.f = new vv("picker.filter", py2.class);
        this.g = new vv("folder.fake.enabled", Boolean.class);
        this.h = new vv("folder.filters.enabled", Boolean.class);
        this.i = new vv(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.j = new vv(Boolean.class, Boolean.FALSE, "show.story.cell");
        this.k = createViewModelLazy(dyc.class, new hta(9, new fyc(this, 0)));
        ExecutorService executorServiceA = ca2Var.b().a();
        this.o = executorServiceA;
        em3 em3Var = new em3();
        this.q = em3Var;
        this.r = new r84(new q84(false, 1), em3Var);
        hyc hycVar = new hyc(this);
        this.s = new oxc(hycVar, executorServiceA, 0);
        this.t = new oxc(hycVar, executorServiceA, 0);
        this.u = viewBinding(R.id.chats_list_view);
        this.v = viewBinding(R.id.oneme_chat_list_picker_empty_view);
        this.w = rx8.P(3, new fyc(this, 1));
        x1().d.v();
    }

    public static final boolean o1(PickerChatsListWidget pickerChatsListWidget, int i) {
        r84 r84Var = pickerChatsListWidget.r;
        return i < 0 || i >= r84Var.l() || !cqk.d(r84Var.G(i).first, pickerChatsListWidget.q);
    }

    public static final boolean p1(PickerChatsListWidget pickerChatsListWidget) {
        List listF = pickerChatsListWidget.r.F();
        if (!(listF instanceof Collection) || !listF.isEmpty()) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                if (((nee) it.next()) == pickerChatsListWidget.t) {
                    return false;
                }
            }
        }
        return ((Boolean) pickerChatsListWidget.x1().u.a.getValue()).booleanValue();
    }

    public static final void q1(PickerChatsListWidget pickerChatsListWidget, int i) {
        r1c r1cVarT1 = pickerChatsListWidget.t1();
        int iD = qt4.D(i);
        if (iD == 0) {
            r1cVarT1.setIcon(R.drawable.icon_search);
            r1cVarT1.setTitle(new tnh(R.string.empty_view_title_empty_search));
            r1cVarT1.setSubtitle(new tnh(R.string.empty_view_subtitle_empty_search));
        } else {
            if (iD != 1) {
                ore.o();
                return;
            }
            r1cVarT1.setIcon(R.drawable.icon_folder_fill);
            r1cVarT1.setTitle(new tnh(R.string.chats_list_empty_state_title));
            r1cVarT1.setSubtitle(ynh.b);
        }
    }

    public static final void r1(PickerChatsListWidget pickerChatsListWidget, List list, boolean z, oxc oxcVar) {
        if (pickerChatsListWidget.getView() != null && pickerChatsListWidget.w1().Y()) {
            String name = PickerChatsListWidget.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Picker chats list, recycler is in computing state, before submit", null);
                }
            }
        }
        oxcVar.H(list);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.w1().setRefreshingNext(z);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        mjg mjgVar = x1().x;
        mjgVar.j(null, Long.valueOf(((Number) mjgVar.getValue()).longValue() + 1));
        r8e r8eVar = v1().i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new iyc(null, this, 0), 3), getViewLifecycleScope());
        if (cqk.d(this.e, "all.chat.folder")) {
            e9i.j0(new fz6(n1g.v(new fz6(v1().l, new w8(2, x1(), dyc.class, "search", "search$chats_list(Ljava/lang/String;)V", 4, 24), 3), getViewLifecycleOwner().f(), n09Var), new iyc(null, this, 1), 3), getViewLifecycleScope());
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k96 k96Var = new k96(getContext());
        k96Var.setId(R.id.chats_list_view);
        k96Var.setClipChildren(false);
        k96Var.setClipToPadding(false);
        k96Var.setClipToOutline(false);
        r1c r1cVar = new r1c(getContext());
        r1cVar.setId(R.id.oneme_chat_list_picker_empty_view);
        r1cVar.setAllowAnimate(false);
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(k96Var);
        frameLayout.addView(r1cVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.m = null;
        this.n = null;
        k96 k96VarW1 = w1();
        pvh pvhVar = this.l;
        if (pvhVar != null) {
            pvhVar.b(k96VarW1);
        }
        k96VarW1.setDelegate(null);
        k96VarW1.setPager(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r84 r84Var = this.r;
        t84 t84Var = r84Var.d;
        oxc oxcVar = this.s;
        t84Var.b(0, oxcVar);
        k96 k96VarW1 = w1();
        k96VarW1.getContext();
        k96VarW1.setLayoutManager(new LinearLayoutManager());
        k96VarW1.setAdapter(r84Var);
        this.l = tre.Y(k96VarW1);
        k96VarW1.setPager(new gl1(this, 7));
        if (((Boolean) ((e5d) this.b.getValue()).G6.a(e5d.S6[399]).i()).booleanValue()) {
            dhb dhbVar = new dhb(1);
            dhbVar.g = false;
            k96VarW1.setItemAnimator(dhbVar);
        } else {
            k96VarW1.setItemAnimator(new bhb());
        }
        k96VarW1.setDelegate(this.q);
        k96VarW1.setClipToPadding(false);
        k96VarW1.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        k96VarW1.setThreshold(10);
        k96VarW1.setIgnoreRefreshingFlagsForScrollEvent(true);
        a aVar = this.p;
        if (aVar != null) {
            k96VarW1.setRecycledViewPool(aVar);
        }
        if (y1()) {
            s1(k96VarW1);
        }
        k96VarW1.j(new b65(k96VarW1));
        if (oxcVar.l() > 0) {
            k96VarW1.measure(View.MeasureSpec.makeMeasureSpec(k96VarW1.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k96VarW1.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            see itemAnimator = k96VarW1.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.e();
            }
        }
        w1().setRefreshingNext(((Boolean) x1().u.a.getValue()).booleanValue());
        j3 j3VarC = e9i.C(x1().q, x1().w, x1().u, new g26(4, null, 1));
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(j3VarC, i19VarF, n09Var), new iyc(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(x1().B, getViewLifecycleOwner().f(), n09Var), new iyc(null, this, 3), 3), getViewLifecycleScope());
    }

    public final void s1(k96 k96Var) {
        uik uikVar = new uik(24, new eyc(this, 0));
        zpg zpgVar = new zpg(k96Var, this.r, uikVar);
        this.n = zpgVar;
        k96Var.h(zpgVar, -1);
        sy7 sy7Var = new sy7(uikVar);
        this.m = sy7Var;
        k96Var.h(sy7Var, -1);
        n1g.N(new ce(zpgVar, null, 2), k96Var);
    }

    public final r1c t1() {
        return (r1c) this.v.m(this, x[6]);
    }

    public final py2 u1() {
        zv8 zv8Var = x[0];
        return (py2) this.f.a(this);
    }

    @Override // defpackage.an3
    public final void v0(boolean z) {
        if (getView() != null) {
            t1().setAllowAnimate(z);
        }
    }

    public final txc v1() {
        return (txc) this.d.getValue();
    }

    public final k96 w1() {
        return (k96) this.u.m(this, x[5]);
    }

    public final dyc x1() {
        return (dyc) this.k.getValue();
    }

    public final boolean y1() {
        zv8 zv8Var = x[2];
        return ((Boolean) this.h.a(this)).booleanValue();
    }

    public PickerChatsListWidget(String str, t3f t3fVar, py2 py2Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this(n1g.i(new ylc("folder.id.key", str), new ylc("scope.id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a)), new ylc("picker.filter", py2Var), new ylc("folder.fake.enabled", Boolean.valueOf(z)), new ylc("folder.filters.enabled", Boolean.valueOf(z2)), new ylc("is_in_multiselect", Boolean.valueOf(z3)), new ylc("show.story.cell", Boolean.valueOf(z4))));
    }

    public /* synthetic */ PickerChatsListWidget(String str, t3f t3fVar, py2 py2Var, boolean z, boolean z2, boolean z3, boolean z4, int i, j95 j95Var) {
        this(str, t3fVar, (i & 4) != 0 ? py2.a : py2Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? false : z4);
    }
}
