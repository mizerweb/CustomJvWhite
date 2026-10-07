package defpackage;

import android.content.Context;
import android.os.Bundle;
import one.me.sdk.vendor.rustore.appupdate.aidlproxy.RuStoreAppUpdateException;

/* JADX INFO: loaded from: classes3.dex */
public final class gwe implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ kwe c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ wfe e;

    public /* synthetic */ gwe(ek2 ek2Var, kwe kweVar, Context context, wfe wfeVar, int i) {
        this.a = i;
        this.b = ek2Var;
        this.c = kweVar;
        this.d = context;
        this.e = wfeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (this.b.t() instanceof hib) {
                    try {
                        int i = bundle.getInt("UPDATE_AVAILABILITY", 0);
                        String str = this.c.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "bindAndAwaitResult: onSuccess -> " + i, null);
                            }
                        }
                        this.b.resumeWith(Boolean.valueOf(i == 2));
                    } catch (ClassCastException e) {
                        this.b.resumeWith(new poe(new RuStoreAppUpdateException(qv1.k("Unknown error: ", e.getMessage()), 5, null, e, 4)));
                    }
                }
                kwe kweVar = this.c;
                Context context = this.d;
                Object obj2 = this.e.a;
                kwe.a(kweVar, context, obj2 != null ? (jk7) obj2 : null);
                break;
            default:
                Throwable th = (Throwable) obj;
                ek2 ek2Var = this.b;
                if (ek2Var.t() instanceof hib) {
                    ek2Var.resumeWith(new poe(new RuStoreAppUpdateException(qv1.k("Unknown error: ", th.getMessage()), 6, null, th, 4)));
                }
                kwe kweVar2 = this.c;
                Context context2 = this.d;
                Object obj3 = this.e.a;
                kwe.a(kweVar2, context2, obj3 != null ? (jk7) obj3 : null);
                break;
        }
        return sbi.a;
    }
}
