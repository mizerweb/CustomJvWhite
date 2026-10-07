package defpackage;

import android.content.Context;
import one.me.sdk.vendor.rustore.appupdate.aidlproxy.RuStoreAppUpdateException;

/* JADX INFO: loaded from: classes3.dex */
public final class iwe implements af7 {
    public final /* synthetic */ ek2 a;
    public final /* synthetic */ kwe b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ wfe d;

    public iwe(ek2 ek2Var, kwe kweVar, Context context, wfe wfeVar) {
        this.a = ek2Var;
        this.b = kweVar;
        this.c = context;
        this.d = wfeVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.resumeWith(new poe(new RuStoreAppUpdateException("Service disconnected before response", 4, null, null, 12)));
        }
        Object obj = this.d.a;
        kwe.a(this.b, this.c, obj == null ? null : (jk7) obj);
        return sbi.a;
    }
}
