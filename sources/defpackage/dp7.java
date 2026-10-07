package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import one.me.sdk.vendor.sms.SmsRetrieverError;

/* JADX INFO: loaded from: classes3.dex */
public final class dp7 extends BroadcastReceiver {
    public final /* synthetic */ ep7 a;

    public dp7(ep7 ep7Var) {
        this.a = ep7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = extras != null ? (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            ep7 ep7Var = this.a;
            if (status != null && status.a == 0) {
                yab.i0(ep7Var.d, null, 0, new qc5(ep7Var, extras, (lq4) null, 24), 3);
                return;
            }
            gm0.X(ep7Var.e, new SmsRetrieverError("onMessageReceived: error; status = " + status + ", " + (extras != null ? extras.keySet() : null)), null, new Object[0]);
        }
    }
}
