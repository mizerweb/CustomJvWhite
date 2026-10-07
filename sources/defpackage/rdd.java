package defpackage;

import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* JADX INFO: loaded from: classes2.dex */
public final class rdd extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdd(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, lq4 lq4Var) {
        super(lq4Var);
        this.e = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
