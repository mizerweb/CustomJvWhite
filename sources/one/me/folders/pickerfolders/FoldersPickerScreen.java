package one.me.folders.pickerfolders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.ayb;
import defpackage.b65;
import defpackage.br4;
import defpackage.cf7;
import defpackage.cyb;
import defpackage.d67;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i19;
import defpackage.j8e;
import defpackage.lve;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n61;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.p57;
import defpackage.ph1;
import defpackage.qe7;
import defpackage.r57;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.s57;
import defpackage.t37;
import defpackage.tm3;
import defpackage.tp3;
import defpackage.tpe;
import defpackage.u57;
import defpackage.uf4;
import defpackage.upe;
import defpackage.v37;
import defpackage.v57;
import defpackage.vv;
import defpackage.w37;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.xw3;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv;
import defpackage.zv8;
import defpackage.zxb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.list.ChatsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatIds", "", "resultTag", "Lha9;", "localAccountId", "([JLjava/lang/String;Lha9;)V", "folders"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ zv8[] l = {new dwd(FoldersPickerScreen.class, "serverChatIds", "getServerChatIds()[J", 0), zo5.f(zfe.a, FoldersPickerScreen.class, "resultTag", "getResultTag()Ljava/lang/String;", 0), new dwd(FoldersPickerScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(FoldersPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(FoldersPickerScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final oi8 a;
    public final vv b;
    public final vv c;
    public boolean d;
    public final h e;
    public final ny8 f;
    public final zsj g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final ow0 k;

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv(long[].class, new long[0], "arg_chat_ids");
        this.c = new vv(String.class, "", "result_tag");
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.e = hVar;
        this.f = createViewModelLazy(d67.class, new fj3(26, new p57(this, 0)));
        this.g = new zsj(((a2c) hVar.getAccessor().c(27)).a(), new n61(1, this, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 27), 5);
        this.h = viewBinding(R.id.oneme_folders_list_recycler_view);
        this.i = viewBinding(R.id.oneme_folders_list_toolbar);
        this.j = viewBinding(R.id.oneme_folders_edit_create_button);
        this.k = binding(new p57(this, 1));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        p1(t37.a);
        return false;
    }

    public final d67 o1() {
        return (d67) this.f.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.oneme_folders_list_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.oneme_folders_picker_toolbar_title);
        final int i = 0;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: q57
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                zmi zmiVar;
                r17 r17Var;
                String str;
                int i2 = i;
                boolean z = true;
                ymi ymiVar = ymi.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = FoldersPickerScreen.l;
                        ltb onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return sbi.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        zsj zsjVar = foldersPickerScreen.g;
                        return Boolean.valueOf(zsjVar.l() >= iIntValue && iIntValue >= 0 && ((zmi) ((k79) zsjVar.F(iIntValue))).b != ymiVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zsj zsjVar2 = foldersPickerScreen.g;
                        if (zsjVar2.l() <= iIntValue2 || iIntValue2 < 0 || (r17Var = (zmiVar = (zmi) ((k79) zsjVar2.F(iIntValue2))).a) == null || (str = r17Var.a) == null || (zmiVar.b != ymiVar && !((Set) foldersPickerScreen.o1().o.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.oneme_folders_edit_create_button);
        cybVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        cybVar.setEnabled(false);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText(np4.q(getContext(), R.string.oneme_folders_edit_create_button));
        qe7.H(cybVar, 300L, new r57(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.oneme_folders_list_recycler_view);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.g);
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), recyclerView.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        final int i2 = 1;
        cf7 cf7Var = new cf7(this) { // from class: q57
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                zmi zmiVar;
                r17 r17Var;
                String str;
                int i3 = i2;
                boolean z = true;
                ymi ymiVar = ymi.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = FoldersPickerScreen.l;
                        ltb onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return sbi.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        zsj zsjVar = foldersPickerScreen.g;
                        return Boolean.valueOf(zsjVar.l() >= iIntValue && iIntValue >= 0 && ((zmi) ((k79) zsjVar.F(iIntValue))).b != ymiVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zsj zsjVar2 = foldersPickerScreen.g;
                        if (zsjVar2.l() <= iIntValue2 || iIntValue2 < 0 || (r17Var = (zmiVar = (zmi) ((k79) zsjVar2.F(iIntValue2))).a) == null || (str = r17Var.a) == null || (zmiVar.b != ymiVar && !((Set) foldersPickerScreen.o1().o.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        };
        final int i3 = 2;
        recyclerView.h(new tp3(new s57(recyclerView, 0), new cf7(this) { // from class: q57
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                zmi zmiVar;
                r17 r17Var;
                String str;
                int i4 = i3;
                boolean z = true;
                ymi ymiVar = ymi.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = FoldersPickerScreen.l;
                        ltb onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return sbi.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        zsj zsjVar = foldersPickerScreen.g;
                        return Boolean.valueOf(zsjVar.l() >= iIntValue && iIntValue >= 0 && ((zmi) ((k79) zsjVar.F(iIntValue))).b != ymiVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zsj zsjVar2 = foldersPickerScreen.g;
                        if (zsjVar2.l() <= iIntValue2 || iIntValue2 < 0 || (r17Var = (zmiVar = (zmi) ((k79) zsjVar2.F(iIntValue2))).a) == null || (str = r17Var.a) == null || (zmiVar.b != ymiVar && !((Set) foldersPickerScreen.o1().o.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }, cf7Var, cf7Var), -1);
        recyclerView.j(new b65(recyclerView));
        recyclerView.h(new ph1(5), -1);
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setId(R.id.oneme_folders_list_screen);
        wf4Var.setClipChildren(false);
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.i = 0;
        uf4Var.e = 0;
        uf4Var.h = 0;
        wf4Var.addView(rccVar, uf4Var);
        uf4 uf4Var2 = new uf4(0, 0);
        uf4Var2.j = rccVar.getId();
        uf4Var2.e = 0;
        uf4Var2.h = 0;
        uf4Var2.k = cybVar.getId();
        wf4Var.addView(recyclerView, uf4Var2);
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.e = 0;
        uf4Var3.h = 0;
        uf4Var3.l = 0;
        uf4Var3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(cybVar, uf4Var3);
        n1g.N(new u57(3, null, 0), wf4Var);
        return wf4Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = o1().i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new v57(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().p, getViewLifecycleOwner().f(), n09Var), new v57(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().k, getViewLifecycleOwner().f(), n09Var), new v57(null, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().m, getViewLifecycleOwner().f(), n09Var), new v57(null, this, 3), i), getViewLifecycleScope());
    }

    public final void p1(w37 w37Var) {
        br4 br4VarG;
        tm3 tm3Var;
        if (this.d) {
            return;
        }
        this.d = true;
        hve router = getRouter();
        zv8 zv8Var = l[1];
        String str = (String) this.c.a(this);
        zv zvVar = new zv();
        zvVar.addLast(router);
        while (true) {
            if (zvVar.isEmpty()) {
                br4VarG = null;
                break;
            }
            hve hveVar = (hve) zvVar.removeLast();
            br4VarG = hveVar.g(str);
            if (br4VarG != null) {
                break;
            }
            ArrayList arrayListE = hveVar.e();
            for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                Iterator it = new upe(((lve) arrayListE.get(iO0)).a.getChildRouters()).iterator();
                while (true) {
                    ListIterator listIterator = ((tpe) it).b;
                    if (listIterator.hasPrevious()) {
                        zvVar.addLast((hve) listIterator.previous());
                    }
                }
            }
        }
        ChatsListWidget chatsListWidget = br4VarG instanceof ChatsListWidget ? (ChatsListWidget) br4VarG : null;
        if (chatsListWidget == null || !w37Var.equals(v37.a) || (tm3Var = chatsListWidget.t1().B1) == null) {
            return;
        }
        tm3Var.a();
    }

    public FoldersPickerScreen(long[] jArr, String str, ha9 ha9Var) {
        this(n1g.i(new ylc("arg_chat_ids", jArr), new ylc("result_tag", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
