package one.me.sdk.phoneutils.countriesdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.c23;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e97;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ize;
import defpackage.j8e;
import defpackage.ldf;
import defpackage.lq4;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.odf;
import defpackage.qyb;
import defpackage.t7c;
import defpackage.wme;
import defpackage.wtc;
import defpackage.xbd;
import defpackage.xre;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/sdk/phoneutils/countriesdialog/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "ldf", "phone-utils"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectCountryBottomSheet extends BaseBottomSheetWidget {
    public final wtc m;
    public final ny8 n;
    public final j8e o;
    public final j8e p;
    public final zsj q;
    public final wme r;
    public static final /* synthetic */ zv8[] t = {new dwd(SelectCountryBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zo5.f(zfe.a, SelectCountryBottomSheet.class, "container", "getContainer()Landroid/widget/LinearLayout;", 0)};
    public static final ldf s = new ldf(0);

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.m = wtcVar;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(odf.class, new ztd(11, new xre(this, 4, bundle)));
        this.n = ny8VarCreateViewModelLazy;
        this.o = viewBinding(R.id.oneme_country_recycler_view);
        this.p = viewBinding(R.id.oneme_country_container);
        this.q = new zsj(((a2c) wtcVar.getAccessor().c(27)).a(), new qyb(22, this), 4);
        this.r = new wme(new ize(4, this));
        e9i.j0(new fz6(e9i.I(n1g.v(((odf) ny8VarCreateViewModelLazy.getValue()).d, this.lifecycleOwner.f(), n09.d)), new dtd(this, (lq4) null, 17), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(R.id.oneme_country_container);
        linearLayout.setOrientation(1);
        t7c t7cVar = new t7c(linearLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        t7cVar.setLayoutParams(layoutParams);
        t7cVar.setSearchHint(np4.q(t7cVar.getContext(), R.string.oneme_countries_search_hint));
        t7cVar.setShouldShowSearchIcon(false);
        t7cVar.setShouldShowBackButton(false);
        t7cVar.c(true);
        t7cVar.setListener(new e97(this, 1));
        linearLayout.addView(t7cVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(R.id.oneme_country_recycler_view);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.q);
        recyclerView.setItemAnimator(null);
        linearLayout.addView(recyclerView);
        frameLayout.addView(linearLayout);
        if (x1()) {
            View mt5Var = new mt5(frameLayout.getContext());
            mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
            frameLayout.addView(mt5Var);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        this.r.a();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new c23(this, 4);
    }
}
