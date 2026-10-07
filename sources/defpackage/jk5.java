package defpackage;

import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;

/* JADX INFO: loaded from: classes2.dex */
public final class jk5 extends nq4 {
    public DeviceIdRemoteDataSource d;
    public /* synthetic */ Object e;
    public final /* synthetic */ DeviceIdRemoteDataSource f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk5(DeviceIdRemoteDataSource deviceIdRemoteDataSource, lq4 lq4Var) {
        super(lq4Var);
        this.f = deviceIdRemoteDataSource;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
