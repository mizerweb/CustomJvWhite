package defpackage;

import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* JADX INFO: loaded from: classes2.dex */
public final class fk5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DeviceIdFileDataSource e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk5(DeviceIdFileDataSource deviceIdFileDataSource, lq4 lq4Var) {
        super(lq4Var);
        this.e = deviceIdFileDataSource;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objMo15getDeviceIdIoAF18A = this.e.mo15getDeviceIdIoAF18A(this);
        return objMo15getDeviceIdIoAF18A == hu4.a ? objMo15getDeviceIdIoAF18A : new roe(objMo15getDeviceIdIoAF18A);
    }
}
