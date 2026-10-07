package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* JADX INFO: loaded from: classes2.dex */
public final class tdd extends nq4 {
    public Context d;
    public PreferenceDataStoreByKeyMigration e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdd(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, lq4 lq4Var) {
        super(lq4Var);
        this.i = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objMo22migrategIAlus = this.i.mo22migrategIAlus(null, this);
        return objMo22migrategIAlus == hu4.a ? objMo22migrategIAlus : new roe(objMo22migrategIAlus);
    }
}
