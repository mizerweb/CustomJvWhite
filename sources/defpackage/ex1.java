package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ex1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ex1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        CallScreen callScreen = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                l6m l6mVar = CallScreen.D1;
                callScreen.P1().c();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                l6m l6mVar2 = CallScreen.D1;
                callScreen.P1().c();
                break;
        }
    }
}
