package one.me.aboutappsettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.h47;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i26;
import defpackage.lq4;
import defpackage.m;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o;
import defpackage.oi8;
import defpackage.p51;
import defpackage.pq3;
import defpackage.q35;
import defpackage.qo7;
import defpackage.r;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.sgg;
import defpackage.wbc;
import defpackage.y;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zo7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "about-app-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AboutAppSettingsScreen extends Widget implements mc4 {
    public final h a;
    public final ny8 b;
    public final h47 c;

    public AboutAppSettingsScreen(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = createViewModelLazy(y.class, new r(0, new qo7(1, this)));
        this.c = new h47(((a2c) hVar.getAccessor().d(27).getValue()).a(), new zo7(1, this), 1);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        y yVarO1 = o1();
        sgg sggVar = yVarO1.j;
        if (sggVar == null || !sggVar.isActive()) {
            yVarO1.j = a8j.t(yVarO1, null, new i26(yVarO1, (lq4) null, 1), 3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getE() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    public final y o1() {
        return (y) this.b.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.about_app_settings_toolbar_title);
        rccVar.setLeftActions(new wbc(new m(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        recyclerView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new p51(5), null, null, null, 56), -1);
        recyclerView.h(new q35(gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 3), -1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(rccVar);
        linearLayout.addView(recyclerView);
        n1g.N(new n(3, null, 0), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = o1().i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new o(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().g, getViewLifecycleOwner().f(), n09Var), new o(null, this, 1), 3), getViewLifecycleScope());
    }

    public AboutAppSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
