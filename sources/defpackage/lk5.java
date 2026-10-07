package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class lk5 extends nq4 {
    public DeviceIdRepositoryImpl d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ DeviceIdRepositoryImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk5(DeviceIdRepositoryImpl deviceIdRepositoryImpl, lq4 lq4Var) {
        super(lq4Var);
        this.g = deviceIdRepositoryImpl;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$saveToLocal(this.g, null, this);
    }
}
