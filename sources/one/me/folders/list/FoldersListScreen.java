package one.me.folders.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.bc1;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f57;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.g57;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.h57;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i41;
import defpackage.i57;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.k57;
import defpackage.kn8;
import defpackage.ks6;
import defpackage.ks9;
import defpackage.ln8;
import defpackage.mc4;
import defpackage.mp5;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n61;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ph1;
import defpackage.pq3;
import defpackage.r17;
import defpackage.r37;
import defpackage.rcc;
import defpackage.rn8;
import defpackage.tre;
import defpackage.url;
import defpackage.vp4;
import defpackage.wbc;
import defpackage.wz6;
import defpackage.x27;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ym9;
import defpackage.zfe;
import defpackage.zmi;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "Lkn8;", "Lmc4;", "Lvp4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "folders"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FoldersListScreen extends Widget implements kn8, mc4, vp4 {
    public static final /* synthetic */ zv8[] h;
    public final ks6 a;
    public final oi8 b;
    public final h c;
    public final ny8 d;
    public final rn8 e;
    public final f57 f;
    public final j8e g;

    static {
        dwd dwdVar = new dwd(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        h = new zv8[]{dwdVar};
    }

    public FoldersListScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new h57(0));
        this.b = oi8.f;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = hVar;
        this.d = createViewModelLazy(k57.class, new fj3(25, new mp5(13, this)));
        this.e = new rn8(new ln8(this, new x27(1)));
        this.f = new f57(((a2c) hVar.getAccessor().c(27)).a(), new n61(1, this, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 26), new i41(3, 0, FoldersListScreen.class, this, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V"), new ks9(15, this));
        this.g = viewBinding(R.id.oneme_folders_list_recycler_view);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        zmi zmiVar;
        r17 r17Var;
        r17 r17Var2;
        String str;
        if (i != R.id.oneme_folders_list_menu_action_change) {
            if (i != R.id.oneme_folders_list_menu_action_delete_folder || (zmiVar = o1().n) == null || (r17Var = zmiVar.a) == null) {
                return;
            }
            url.c(r17Var.b, this);
            return;
        }
        k57 k57VarO1 = o1();
        zmi zmiVar2 = k57VarO1.n;
        if (zmiVar2 == null || (r17Var2 = zmiVar2.a) == null || (str = r17Var2.a) == null) {
            gm0.Y(k57.class.getName(), "Early return in editSelectedFolder cuz of selectedFolder?.folder?.id is null");
            return;
        }
        ic6 ic6Var = k57VarO1.l;
        r37.b.getClass();
        bc1.q(":settings/folder/edit?id=".concat(str), ic6Var);
    }

    @Override // defpackage.kn8
    public final void S0(int i, int i2) {
        this.f.S0(i, i2);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_folders_delete_folder_bottom_sheet_delete_button) {
            k57 k57VarO1 = o1();
            k57VarO1.p.B(k57VarO1, k57.r[1], yab.h0(k57VarO1.b, ((n0c) k57VarO1.d).a(), 2, new wz6(k57VarO1, null, 4)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final k57 o1() {
        return (k57) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.oneme_folders_list_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.oneme_folder_list_toolbar_title);
        rccVar.setLeftActions(new wbc(new nv4(13, this)));
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.oneme_folders_list_recycler_view);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.f);
        this.e.i(recyclerView);
        recyclerView.h(new ph1(4), -1);
        recyclerView.h(new ym9(2), -1);
        recyclerView.h(new g57((Context) this.c.getAccessor().c(7)), -1);
        recyclerView.h(new g57(pq3.j.h(recyclerView)), -1);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(R.id.oneme_folders_list_screen);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(rccVar);
        linearLayout.addView(recyclerView);
        n1g.N(new n(3, null, 6), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.e.i(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ic6 ic6Var = o1().l;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new i57(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().k, getViewLifecycleOwner().f(), n09Var), new i57(null, this, 1), 3), getViewLifecycleScope());
    }

    public FoldersListScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
