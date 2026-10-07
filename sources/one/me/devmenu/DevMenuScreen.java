package one.me.devmenu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import defpackage.aac;
import defpackage.br4;
import defpackage.dk5;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.ecc;
import defpackage.er3;
import defpackage.fwg;
import defpackage.gcc;
import defpackage.h;
import defpackage.ha9;
import defpackage.hu;
import defpackage.hve;
import defpackage.i5d;
import defpackage.j8e;
import defpackage.mc4;
import defpackage.n1g;
import defpackage.nee;
import defpackage.nl9;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.tj5;
import defpackage.uj5;
import defpackage.w83;
import defpackage.wbc;
import defpackage.xr1;
import defpackage.y8j;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevMenuScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] h = {new dwd(DevMenuScreen.class, "tabLayout", "getTabLayout(Lone/me/sdk/arch/Widget$ViewBindingReady;)Lone/me/common/tablayout/OneMeTabLayout;", 0), zo5.f(zfe.a, DevMenuScreen.class, "viewPager", "getViewPager(Lone/me/sdk/arch/Widget$ViewBindingReady;)Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final oi8 a;
    public final h b;
    public final ny8 c;
    public fwg d;
    public final er3 e;
    public final j8e f;
    public final j8e g;

    public DevMenuScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = hVar.getAccessor().b(4);
        this.e = new er3();
        this.f = viewBinding(R.id.oneme_devmenu_screen_view_tab_layout);
        this.g = viewBinding(R.id.oneme_devmenu_screen_view_view_pager);
    }

    public static void o1(View view) {
        if (view instanceof EditText) {
            nl9.c(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                o1(viewGroup.getChildAt(i));
            }
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (getView() == null || i != 1) {
            return;
        }
        e5d e5dVar = (e5d) this.b.getAccessor().d(26).getValue();
        e5dVar.getClass();
        for (i5d i5dVar : new ArrayList(e5dVar.o().values())) {
            i5dVar.g().edit().remove(i5dVar.a).commit();
            i5dVar.k();
        }
        nee adapter = ((y8j) this.g.m(this, h[1])).getAdapter();
        tj5 tj5Var = adapter instanceof tj5 ? (tj5) adapter : null;
        if (tj5Var != null) {
            hve hveVar = (hve) tj5Var.h.get(1);
            br4 br4VarI = hveVar != null ? rx8.I(hveVar) : null;
            DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = br4VarI instanceof DevMenuFeatureTogglesPageScreen ? (DevMenuFeatureTogglesPageScreen) br4VarI : null;
            if (devMenuFeatureTogglesPageScreen != null) {
                devMenuFeatureTogglesPageScreen.t1();
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(R.id.oneme_devmenu_screen_view);
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_devmenu_screen_view_oneme_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle("Dev menu");
        rccVar.setLeftActions(new wbc(new w83(25)));
        rccVar.setRightActions(new ecc("Сброс", null, new nv4(4, this)));
        linearLayout.addView(rccVar);
        aac aacVar = new aac(linearLayout.getContext());
        aacVar.setId(R.id.oneme_devmenu_screen_view_tab_layout);
        aacVar.setTabMode(0);
        aacVar.setLayoutParams(new pq());
        linearLayout.addView(aacVar);
        y8j y8jVar = new y8j(linearLayout.getContext());
        y8jVar.setId(R.id.oneme_devmenu_screen_view_view_pager);
        y8jVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        y8jVar.setOffscreenPageLimit(1);
        y8jVar.e(new uj5(y8jVar, this));
        linearLayout.addView(y8jVar);
        n1g.N(new xr1(3, null, 3), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = ((List) this.c.getValue()).iterator();
        while (it.hasNext()) {
            ((dk5) it.next()).onDestroy();
        }
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        fwg fwgVar = this.d;
        if (fwgVar != null) {
            fwgVar.d();
        }
        this.d = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        if (getView() != null) {
            zv8[] zv8VarArr = h;
            zv8 zv8Var = zv8VarArr[1];
            j8e j8eVar = this.g;
            ((y8j) j8eVar.m(this, zv8Var)).setAdapter(new tj5(this, getC().b()));
            aac aacVar = (aac) this.f.m(this, zv8VarArr[0]);
            y8j y8jVar = (y8j) j8eVar.m(this, zv8VarArr[1]);
            er3 er3Var = this.e;
            er3Var.getClass();
            fwg fwgVar = new fwg(aacVar, y8jVar, new hu(er3Var, 21, aacVar));
            fwgVar.c();
            this.d = fwgVar;
            ((y8j) j8eVar.m(this, zv8VarArr[1])).h(0, false);
        }
    }

    public DevMenuScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
