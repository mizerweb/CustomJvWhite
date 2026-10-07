package one.me.folders.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f37;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.g27;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i27;
import defpackage.j8e;
import defpackage.kv1;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.mp5;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.np4;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oo6;
import defpackage.pq3;
import defpackage.q27;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.t20;
import defpackage.t27;
import defpackage.t8;
import defpackage.uf4;
import defpackage.uw8;
import defpackage.vv;
import defpackage.w27;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wz6;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lg27;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lha9;", "localAccountId", "(Ljava/lang/String;Lha9;)V", "", "serverChatIds", "([JLha9;)V", "folders"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FolderEditScreen extends Widget implements mc4, g27 {
    public static final /* synthetic */ zv8[] i = {new dwd(FolderEditScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0), zo5.f(zfe.a, FolderEditScreen.class, "serverChatIds", "getServerChatIds()[J", 0), new dwd(FolderEditScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(FolderEditScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(FolderEditScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final oi8 a;
    public final vv b;
    public final vv c;
    public final h d;
    public final ny8 e;
    public final i27 f;
    public final j8e g;
    public final j8e h;

    public FolderEditScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("key_folder_id", String.class);
        this.c = new vv(long[].class, new long[0], "key_server_chat_ids");
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.e = createViewModelLazy(f37.class, new fj3(24, new mp5(11, this)));
        i27 i27Var = new i27(((a2c) hVar.getAccessor().c(27)).a(), this);
        this.f = i27Var;
        viewBinding(R.id.oneme_folders_edit_toolbar);
        this.g = viewBinding(R.id.oneme_folders_edit_create_button);
        this.h = viewBinding(R.id.oneme_folders_edit_members_list);
        e9i.j0(new fz6(p1().q, new w8(2, i27Var, i27.class, "submitList", "submitList(Ljava/util/List;)V", 4, 15), 3), getLifecycleScope());
    }

    public static final void o1(FolderEditScreen folderEditScreen, boolean z) {
        cyb cybVar = (cyb) folderEditScreen.g.m(folderEditScreen, i[3]);
        cybVar.setVisibility(z ? 0 : 8);
        if (z) {
            bdc.a(cybVar, new ng7(cybVar, 7, folderEditScreen));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i2, Bundle bundle) {
        f37 f37VarP1 = p1();
        xhh xhhVar = f37VarP1.d;
        if (i2 != R.id.oneme_folders_edit_create_button) {
            if (i2 != R.id.oneme_folders_delete_folder_bottom_sheet_delete_button || f37VarP1.c == null) {
                return;
            }
            a8j.t(f37VarP1, ((n0c) xhhVar).b(), new wz6(f37VarP1, null, 3), 2);
            return;
        }
        w27 w27Var = (w27) f37VarP1.o.a.getValue();
        f37VarP1.C.B(f37VarP1, f37.D[5], yab.h0(f37VarP1.b, ((n0c) xhhVar).b(), 2, new t20(w27Var, f37VarP1, (lq4) null, 16)));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.oneme_folders_edit_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.oneme_folders_edit_toolbar_title);
        rccVar.setLeftActions(new wbc(new nv4(10, this)));
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.oneme_folders_edit_members_list);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.f);
        recyclerView.setItemAnimator(null);
        oo6 oo6Var = new oo6(3, this);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), oo6Var, null, null, null, 60), -1);
        recyclerView.h(new q27(oo6Var), -1);
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.oneme_folders_edit_create_button);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_folders_edit_create_button));
        qe7.H(cybVar, 300L, new t8(29, this));
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setId(R.id.oneme_folders_edit_screen);
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.i = 0;
        uf4Var.e = 0;
        uf4Var.h = 0;
        wf4Var.addView(rccVar, uf4Var);
        uf4 uf4Var2 = new uf4(0, 0);
        uf4Var2.j = rccVar.getId();
        uf4Var2.e = 0;
        uf4Var2.h = 0;
        uf4Var2.l = 0;
        wf4Var.addView(recyclerView, uf4Var2);
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.e = 0;
        uf4Var3.h = 0;
        uf4Var3.l = 0;
        uf4Var3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(cybVar, uf4Var3);
        n1g.N(new kv1(3, null, 1), wf4Var);
        return wf4Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(p1().r, new t27(this, null, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(p1().o, new t27(this, null, 1), 3), getViewLifecycleScope());
    }

    public final f37 p1() {
        return (f37) this.e.getValue();
    }

    public final void q1() {
        int i2 = uw8.a;
        if (uw8.b(uw8.c)) {
            ml9.b(this);
        }
    }

    public FolderEditScreen(long[] jArr, ha9 ha9Var) {
        this(n1g.i(new ylc("key_server_chat_ids", jArr), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public FolderEditScreen(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("key_folder_id", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
