package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class y0d extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ha9 ha9Var = new ha9(intent.getIntExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, 0));
        r7 r7Var = r7.a;
        ((s91) new qzb(r7.d(ha9Var)).getAccessor().c(1093)).a(context, intent, "PipBroadcastReceiver");
    }
}
