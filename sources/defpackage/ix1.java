package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ix1 extends meh {
    public final /* synthetic */ CallScreen b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(CallScreen callScreen, Context context) {
        super(context);
        this.b = callScreen;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        this.b.z1();
    }
}
