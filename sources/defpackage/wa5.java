package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wa5 implements k74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0e b;

    public /* synthetic */ wa5(x0e x0eVar, int i) {
        this.a = i;
        this.b = x0eVar;
    }

    @Override // defpackage.k74
    public final Object B(h74 h74Var) {
        int i = this.a;
        x0e x0eVar = this.b;
        switch (i) {
            case 0:
                g85 g85Var = (g85) h74Var;
                return new za5((Context) g85Var.a(Context.class), ((ov6) g85Var.a(ov6.class)).c(), g85Var.k(x0e.a(ou7.class)), g85Var.n(xe5.class), (Executor) g85Var.i(x0eVar));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(x0eVar, (g85) h74Var);
        }
    }
}
