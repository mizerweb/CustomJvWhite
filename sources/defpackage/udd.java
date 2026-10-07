package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;

/* JADX INFO: loaded from: classes4.dex */
public final class udd extends nq4 {
    public Context d;
    public PreferenceDataStoreMigration e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PreferenceDataStoreMigration g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udd(PreferenceDataStoreMigration preferenceDataStoreMigration, lq4 lq4Var) {
        super(lq4Var);
        this.g = preferenceDataStoreMigration;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objA = PreferenceDataStoreMigration.a(this.g, null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
