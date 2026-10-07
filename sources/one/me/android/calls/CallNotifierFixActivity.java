package one.me.android.calls;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import defpackage.ha9;
import defpackage.qzb;
import defpackage.r7;
import defpackage.s91;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class CallNotifierFixActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        ha9 ha9Var = new ha9(getIntent().getIntExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, 0));
        r7 r7Var = r7.a;
        ((s91) new qzb(r7.d(ha9Var)).getAccessor().c(1093)).a(this, getIntent(), "CallNotifierFixActivity");
        finish();
    }
}
