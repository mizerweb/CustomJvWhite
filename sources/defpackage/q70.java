package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class q70 extends BroadcastReceiver {
    public final xf6 a;
    public final sfh b;
    public final /* synthetic */ r70 c;

    public q70(r70 r70Var, sfh sfhVar, xf6 xf6Var) {
        this.c = r70Var;
        this.b = sfhVar;
        this.a = xf6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.f(new c3(9, this));
        }
    }
}
