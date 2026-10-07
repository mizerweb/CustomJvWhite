package defpackage;

import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* JADX INFO: loaded from: classes2.dex */
public final class gk5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DeviceIdFileDataSource e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk5(DeviceIdFileDataSource deviceIdFileDataSource, lq4 lq4Var) {
        super(lq4Var);
        this.e = deviceIdFileDataSource;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objMo14setDeviceIdgIAlus = this.e.mo14setDeviceIdgIAlus(null, this);
        return objMo14setDeviceIdgIAlus == hu4.a ? objMo14setDeviceIdgIAlus : new roe(objMo14setDeviceIdgIAlus);
    }
}
