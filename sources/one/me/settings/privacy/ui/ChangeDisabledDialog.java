package one.me.settings.privacy.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ha9;
import defpackage.n1g;
import defpackage.rp2;
import defpackage.wtc;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/ChangeDisabledDialog;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChangeDisabledDialog extends BottomSheetWidget {
    public static final /* synthetic */ int v = 0;
    public final wtc u;

    public ChangeDisabledDialog(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new rp2(this, frameLayout.getContext());
    }

    public ChangeDisabledDialog(Bundle bundle) {
        super(bundle);
        this.u = new wtc(m35getAccountScopeuqN4xOY());
    }
}
