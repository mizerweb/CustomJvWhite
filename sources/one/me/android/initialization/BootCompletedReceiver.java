package one.me.android.initialization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a2c;
import defpackage.c3;
import defpackage.gm0;
import defpackage.m94;

/* JADX INFO: loaded from: classes2.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    public final String a = BootCompletedReceiver.class.getName();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gm0.x(this.a, "onReceive", null);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            ((a2c) m94.i.getValue()).a().submit(new c3(17, this));
        }
    }
}
