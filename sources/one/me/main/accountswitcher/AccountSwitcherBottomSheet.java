package one.me.main.accountswitcher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.ca2;
import defpackage.e9i;
import defpackage.f7;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.k96;
import defpackage.ks9;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o7;
import defpackage.ot4;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qo7;
import defpackage.r;
import defpackage.rsf;
import defpackage.sbf;
import defpackage.sfd;
import defpackage.y6b;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/main/accountswitcher/AccountSwitcherBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "main-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccountSwitcherBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int y = 0;
    public final ca2 u;
    public final ny8 v;
    public final boolean w;
    public final rsf x;

    public AccountSwitcherBottomSheet(Bundle bundle) {
        super(bundle);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.u = ca2Var;
        this.v = createViewModelLazy(o7.class, new r(3, new qo7(5, this)));
        this.w = true;
        this.x = new rsf(new ks9(1, this), ((a2c) ca2Var.getAccessor().c(27)).a());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        k96 k96Var = new k96(linearLayout.getContext());
        k96Var.setId(R.id.oneme_main_account_chooser_list);
        k96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setOverScrollMode(2);
        k96Var.setItemAnimator(null);
        k96Var.setAdapter(this.x);
        k96Var.h(new sbf(pq3.j.h(k96Var), new ot4(1, this), null, null, null, 60), -1);
        linearLayout.addView(k96Var);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        q9i.a(q9i.i, textView);
        n1g.N(new f7(3, null, 0), textView);
        int iIntValue = ((Number) ((y6b) F1().d.getValue()).i.getValue()).intValue();
        textView.setText(textView.getContext().getResources().getQuantityString(R.plurals.oneme_main_account_switcher_profiles_limit, iIntValue, Integer.valueOf(iIntValue)));
        linearLayout.addView(textView);
        return linearLayout;
    }

    public final o7 F1() {
        return (o7) this.v.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(F1().g, getViewLifecycleOwner().f(), n09.d), new sfd(2, (lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: y1, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    public AccountSwitcherBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
