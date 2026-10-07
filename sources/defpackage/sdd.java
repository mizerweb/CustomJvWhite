package defpackage;

import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;

/* JADX INFO: loaded from: classes2.dex */
public final class sdd extends nq4 {
    public PreferenceDataStoreByKeyMigration d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PreferenceDataStoreByKeyMigration f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdd(PreferenceDataStoreByKeyMigration preferenceDataStoreByKeyMigration, lq4 lq4Var) {
        super(lq4Var);
        this.f = preferenceDataStoreByKeyMigration;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
