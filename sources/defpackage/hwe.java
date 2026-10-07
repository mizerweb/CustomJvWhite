package defpackage;

import android.content.Context;
import one.me.sdk.vendor.rustore.appupdate.aidlproxy.RuStoreAppUpdateException;

/* JADX INFO: loaded from: classes3.dex */
public final class hwe implements qf7 {
    public final /* synthetic */ ek2 a;
    public final /* synthetic */ kwe b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ wfe d;

    public hwe(ek2 ek2Var, kwe kweVar, Context context, wfe wfeVar) {
        this.a = ek2Var;
        this.b = kweVar;
        this.c = context;
        this.d = wfeVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.resumeWith(new poe(new RuStoreAppUpdateException(zo5.i(iIntValue, "Remote error ", ": ", str), 3, Integer.valueOf(iIntValue), null, 8)));
        }
        Object obj3 = this.d.a;
        kwe.a(this.b, this.c, obj3 == null ? null : (jk7) obj3);
        return sbi.a;
    }
}
