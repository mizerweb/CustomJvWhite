package one.me.devmenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p51;
import defpackage.pd8;
import defpackage.pe3;
import defpackage.ph1;
import defpackage.pq3;
import defpackage.rj5;
import defpackage.rx8;
import defpackage.s5h;
import defpackage.sbf;
import defpackage.xw3;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zsj;
import defpackage.zu;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/devmenu/DevMenuInfoScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevMenuInfoScreen extends Widget {
    public final ny8 a;
    public final zsj b;

    public DevMenuInfoScreen(Bundle bundle) {
        super(bundle);
        this.a = rx8.P(3, new pe3(29, this));
        this.b = new zsj(new rj5(0, this));
    }

    public final List o1() {
        pd8 pd8Var = (pd8) this.a.getValue();
        Context context = getContext();
        return xw3.P0(pd8Var, new pd8("Об устройстве", s5h.x0("\n    PerfClass: " + lvb.w0(context).name().toLowerCase(Locale.ROOT) + "\n    DefaultDensity: " + (DisplayMetrics.DENSITY_DEVICE_STABLE / 160.0f) + "\n    CurrentDensity: " + context.getResources().getDisplayMetrics().density + "\n    DensityDpi: " + context.getResources().getDisplayMetrics().densityDpi + "\n")));
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        this.b.H(o1());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.oneme_settingslist_rv);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new p51(5), null, null, null, 60), -1);
        recyclerView.h(new ph1(9), -1);
        recyclerView.setAdapter(this.b);
        n1g.N(new zu(3, (lq4) null, 7), recyclerView);
        return recyclerView;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.b.H(o1());
    }

    public DevMenuInfoScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
