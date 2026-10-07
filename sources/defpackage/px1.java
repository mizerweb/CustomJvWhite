package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class px1 implements s22 {
    public final /* synthetic */ CallScreen a;

    public px1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.n12
    public final void b() {
        l6m l6mVar = CallScreen.D1;
        CallScreen callScreen = this.a;
        it3.a(callScreen.getContext(), v3e.c(callScreen.R1().K().l));
        if (it3.b()) {
            String string = callScreen.getContext().getString(R.string.call_link_share_dialog_share_link_copy);
            h8c h8cVar = new h8c(callScreen);
            h8cVar.n(string);
            h8cVar.e(new y42(4, null));
            h8cVar.c(new o8c(0, 0, 0, 11));
            h8cVar.p();
        }
    }

    @Override // defpackage.n12
    public final void d() {
        l6m l6mVar = CallScreen.D1;
        this.a.R1().F();
    }

    @Override // defpackage.n12
    public final void e() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String strC = v3e.c(callScreen.R1().K().l);
        xde xdeVar = new xde(context);
        xdeVar.Q(context.getString(R.string.call_link_share_dialog_share_link_description, strC));
        xdeVar.d = context.getString(R.string.call_link_share_dialog_share_link_dialog_intent_title);
        ((Intent) xdeVar.c).setType(HTTP.PLAIN_TEXT_TYPE);
        xdeVar.R();
    }

    @Override // defpackage.n12
    public final void f() {
        l6m l6mVar = CallScreen.D1;
        CallScreen callScreen = this.a;
        if (callScreen.R1().D(callScreen.N1().g)) {
            CallScreen.G1(callScreen);
        }
    }

    @Override // defpackage.n12
    public final void g() {
        l6m l6mVar = CallScreen.D1;
        h02 h02VarR1 = this.a.R1();
        a8j.x(h02VarR1.G, new ly1(v3e.c(h02VarR1.K().l)));
    }

    @Override // defpackage.e52
    public final void h(fu1 fu1Var) {
        l6m l6mVar = CallScreen.D1;
        this.a.R1().P(fu1Var);
    }

    @Override // defpackage.e52
    public final void j(fu1 fu1Var, Point point) {
        l6m l6mVar = CallScreen.D1;
        this.a.R1().R(fu1Var, point);
    }

    @Override // defpackage.e52
    public final void k() {
        l6m l6mVar = CallScreen.D1;
        CallScreen callScreen = this.a;
        if (callScreen.R1().D(callScreen.N1().g)) {
            CallScreen.G1(callScreen);
        }
    }
}
