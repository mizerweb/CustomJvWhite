package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class kk5 extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ DeviceIdRepositoryImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk5(DeviceIdRepositoryImpl deviceIdRepositoryImpl, lq4 lq4Var) {
        super(lq4Var);
        this.f = deviceIdRepositoryImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$generateDeviceId(this.f, this);
    }
}
