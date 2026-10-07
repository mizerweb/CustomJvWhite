package one.me.settings;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.izb;
import defpackage.j5;
import defpackage.j8e;
import defpackage.k5;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.q5;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.r;
import defpackage.tre;
import defpackage.tv7;
import defpackage.v30;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/settings/AccountActionsBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "", "profileName", "Landroid/view/View;", "anchorView", "(Lha9;Ljava/lang/CharSequence;Landroid/view/View;)V", "settings-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccountActionsBottomSheet extends BottomSheetWidget implements mc4 {
    public static final /* synthetic */ zv8[] z;
    public final CharSequence u;
    public final wtc v;
    public final ny8 w;
    public boolean x;
    public final j8e y;

    static {
        dwd dwdVar = new dwd(AccountActionsBottomSheet.class, "readAllCell", "getReadAllCell()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView;", 0);
        zfe.a.getClass();
        z = new zv8[]{dwdVar};
    }

    public AccountActionsBottomSheet(Bundle bundle) {
        super(bundle);
        B1(false);
        String charSequence = bundle.getCharSequence("profile_name");
        this.u = charSequence == null ? "" : charSequence;
        this.v = new wtc(m35getAccountScopeuqN4xOY());
        this.w = createViewModelLazy(q5.class, new r(2, new qo7(2, this)));
        this.y = viewBinding(R.id.oneme_settings_account_actions_read_all);
    }

    @Override // defpackage.mc4
    public final void D0() {
        if (this.x) {
            v1(true);
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        izb izbVar = new izb(linearLayout.getContext(), false);
        izbVar.setId(R.id.oneme_settings_account_actions_read_all);
        izbVar.setVisibility(8);
        linearLayout.addView(izbVar, new LinearLayout.LayoutParams(-1, -2));
        izb izbVar2 = new izb(linearLayout.getContext(), false);
        izbVar2.m(R.drawable.icon_autorization_leave, null);
        izbVar2.setIsIconBackgroundEnabled(false);
        izbVar2.setTitle(R.string.oneme_profile_edit_logout_button);
        izbVar2.setSubtitle(this.u);
        qe7.H(izbVar2, 300L, new j5(this, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        linearLayout.addView(izbVar2, layoutParams);
        return linearLayout;
    }

    public final izb F1() {
        return (izb) this.y.m(this, z[0]);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.profile_edit_logout_confirm_action) {
            this.x = true;
            ((q5) this.w.getValue()).d.d(true);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        int i = getArgs().getInt("anchor_id", -1);
        Class cls = (Class) tre.g0(getArgs(), "anchor_class", Class.class);
        if (i != -1 && cls != null) {
            v30 v30Var = new v30(i, cls);
            v30Var.d(this);
            new tv7(v30Var).a(view, new Rect(0, gm0.K(yl5.d().getDisplayMetrics().density * (-5.0f)), 0, gm0.K((-5.0f) * yl5.d().getDisplayMetrics().density)), Float.valueOf(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)), null);
        }
        izb izbVarF1 = F1();
        zv8[] zv8VarArr = izb.I;
        izbVarF1.m(R.drawable.icon_message_unread, null);
        izbVarF1.setIsIconBackgroundEnabled(false);
        qe7.H(izbVarF1, 300L, new j5(this, 0));
        ny8 ny8Var = this.w;
        ic6 ic6Var = ((q5) ny8Var.getValue()).i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new k5(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((q5) ny8Var.getValue()).j, getViewLifecycleOwner().f(), n09Var), new k5(null, this, 1), 3), getViewLifecycleScope());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountActionsBottomSheet(ha9 ha9Var, CharSequence charSequence, View view) {
        Bundle bundleI = n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("profile_name", charSequence));
        if (view != null) {
            bundleI.putInt("anchor_id", view.getId());
            bundleI.putSerializable("anchor_class", view.getClass());
        }
        this(bundleI);
    }
}
