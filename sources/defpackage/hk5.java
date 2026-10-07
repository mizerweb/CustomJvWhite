package defpackage;

import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hk5 extends nq4 {
    public DeviceIdRemoteDataSource d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ DeviceIdRemoteDataSource g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk5(DeviceIdRemoteDataSource deviceIdRemoteDataSource, lq4 lq4Var) {
        super(lq4Var);
        this.g = deviceIdRemoteDataSource;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objMo15getDeviceIdIoAF18A = this.g.mo15getDeviceIdIoAF18A(this);
        return objMo15getDeviceIdIoAF18A == hu4.a ? objMo15getDeviceIdIoAF18A : new roe(objMo15getDeviceIdIoAF18A);
    }
}
