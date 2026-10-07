package defpackage;

import com.google.android.gms.tasks.Task;
import one.me.sdk.vendor.sms.SmsRetrieverError;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ap7 implements otb, ttb, ntb {
    public final /* synthetic */ ep7 a;

    public /* synthetic */ ap7(ep7 ep7Var) {
        this.a = ep7Var;
    }

    @Override // defpackage.ntb
    public void c() {
        ep7 ep7Var = this.a;
        gm0.n(ep7Var.e, "startRetriever: canceled");
        ep7Var.h = null;
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ep7 ep7Var = this.a;
        gm0.n(ep7Var.e, "retriever is complete");
        ep7Var.h = null;
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        ep7 ep7Var = this.a;
        gm0.X(ep7Var.e, new SmsRetrieverError("startRetriever: failed", exc), null, new Object[0]);
        ep7Var.h = null;
    }
}
