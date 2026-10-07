package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import defpackage.ao5;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.e9i;
import defpackage.hu4;
import defpackage.j95;
import defpackage.k66;
import defpackage.kk5;
import defpackage.l9b;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.ore;
import defpackage.pzf;
import defpackage.qv1;
import defpackage.qy3;
import defpackage.t20;
import defpackage.xt4;
import defpackage.xx6;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/vk/push/core/deviceid/DeviceIdRepositoryImpl;", "Lcom/vk/push/core/DeviceIdRepository;", "Lcom/vk/push/core/deviceid/DeviceIdDataSource;", "localDataSource", "Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;", "remoteDataSource", "Lcom/vk/push/core/deviceid/DeviceIdGenerator;", "generator", "Lxt4;", "dispatcher", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Lcom/vk/push/core/deviceid/DeviceIdDataSource;Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;Lcom/vk/push/core/deviceid/DeviceIdGenerator;Lxt4;Lcom/vk/push/common/Logger;)V", "", "getDeviceId", "(Llq4;)Ljava/lang/Object;", "getDeviceIdBlocking", "()Ljava/lang/String;", "Lxx6;", "Lcom/vk/push/core/DeviceIdRepository$DeviceIdError;", "i", "Lxx6;", "getErrorsFlow", "()Lxx6;", "errorsFlow", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceIdRepositoryImpl implements DeviceIdRepository {

    @Deprecated
    public static final String DEFAULT_DEVICE_ID = "default_device_id";

    @Deprecated
    public static final int ERROR_BUFFER_SIZE = 5;
    public final DeviceIdDataSource a;
    public final DeviceIdReadOnlyDataSource b;
    public final DeviceIdGenerator c;
    public final xt4 d;
    public final Logger e;
    public volatile String f;
    public final l9b g;
    public final pzf h;
    public final pzf i;

    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, xt4 xt4Var, Logger logger) {
        this.a = deviceIdDataSource;
        this.b = deviceIdReadOnlyDataSource;
        this.c = deviceIdGenerator;
        this.d = xt4Var;
        this.e = logger.createLogger("DeviceIdRepository");
        this.f = DEFAULT_DEVICE_ID;
        this.g = new l9b();
        pzf pzfVarB = e9i.b(5, 0, 6);
        this.h = pzfVarB;
        this.i = pzfVarB;
    }

    public static final boolean access$canUseCache(DeviceIdRepositoryImpl deviceIdRepositoryImpl) {
        return !cqk.d(deviceIdRepositoryImpl.f, DEFAULT_DEVICE_ID);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object access$generateDeviceId(DeviceIdRepositoryImpl deviceIdRepositoryImpl, lq4 lq4Var) {
        kk5 kk5Var;
        pzf pzfVar = deviceIdRepositoryImpl.h;
        if (lq4Var instanceof kk5) {
            kk5Var = (kk5) lq4Var;
            int i = kk5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk5Var.g = i - Integer.MIN_VALUE;
            } else {
                kk5Var = new kk5(deviceIdRepositoryImpl, lq4Var);
            }
        } else {
            kk5Var = new kk5(deviceIdRepositoryImpl, lq4Var);
        }
        Object obj = kk5Var.e;
        int i2 = kk5Var.g;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = kk5Var.d;
            ch3.d0(obj);
            return str;
        }
        ch3.d0(obj);
        String strGenerateDeviceId = deviceIdRepositoryImpl.c.generateDeviceId();
        if (!pzfVar.d().isEmpty()) {
            DeviceIdRepository.DeviceIdError deviceIdError = new DeviceIdRepository.DeviceIdError(new Exception(qv1.k("Device id new value ", strGenerateDeviceId)), "DeviceId: corrupted, generating new");
            kk5Var.d = strGenerateDeviceId;
            kk5Var.g = 1;
            Object objEmit = pzfVar.emit(deviceIdError, kk5Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        }
        return strGenerateDeviceId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r10.emit(r1, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$saveToLocal(com.vk.push.core.deviceid.DeviceIdRepositoryImpl r8, java.lang.String r9, defpackage.lq4 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.lk5
            if (r0 == 0) goto L16
            r0 = r10
            lk5 r0 = (defpackage.lk5) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            lk5 r0 = new lk5
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            r4 = 2
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L4b
            if (r1 == r2) goto L38
            if (r1 != r4) goto L32
            java.lang.Object r8 = r0.e
            com.vk.push.core.deviceid.DeviceIdRepositoryImpl r9 = r0.d
            defpackage.ch3.d0(r10)
            goto L90
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r3
        L38:
            java.lang.Object r8 = r0.e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            com.vk.push.core.deviceid.DeviceIdRepositoryImpl r8 = r0.d
            defpackage.ch3.d0(r10)
            roe r10 = (defpackage.roe) r10
            java.lang.Object r10 = r10.a
        L46:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L5d
        L4b:
            defpackage.ch3.d0(r10)
            com.vk.push.core.deviceid.DeviceIdDataSource r10 = r8.a
            r0.d = r8
            r0.e = r9
            r0.h = r2
            java.lang.Object r10 = r10.mo14setDeviceIdgIAlus(r9, r0)
            if (r10 != r5) goto L46
            goto L8f
        L5d:
            boolean r1 = r8 instanceof defpackage.poe
            if (r1 != 0) goto L6d
            com.vk.push.common.Logger r8 = r9.e
            java.lang.String r9 = "Device id saved, value = "
            java.lang.String r9 = defpackage.qv1.k(r9, r10)
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r9, r3, r4, r3)
            goto La7
        L6d:
            pzf r10 = r9.h
            com.vk.push.core.DeviceIdRepository$DeviceIdError r1 = new com.vk.push.core.DeviceIdRepository$DeviceIdError
            java.lang.Throwable r2 = defpackage.roe.a(r8)
            if (r2 != 0) goto L7e
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r6 = "Unknown exception"
            r2.<init>(r6)
        L7e:
            java.lang.String r6 = "DeviceId: failed to save to local"
            r1.<init>(r2, r6)
            r0.d = r9
            r0.e = r8
            r0.h = r4
            java.lang.Object r10 = r10.emit(r1, r0)
            if (r10 != r5) goto L90
        L8f:
            return r5
        L90:
            com.vk.push.common.Logger r9 = r9.e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Device id cannot be saved locally, error = "
            r10.<init>(r0)
            java.lang.Throwable r8 = defpackage.roe.a(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r8, r3, r4, r3)
        La7:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.deviceid.DeviceIdRepositoryImpl.access$saveToLocal(com.vk.push.core.deviceid.DeviceIdRepositoryImpl, java.lang.String, lq4):java.lang.Object");
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public Object getDeviceId(lq4 lq4Var) {
        return yab.K0(this.d, new t20(this, null, 15), lq4Var);
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public String getDeviceIdBlocking() {
        return (String) yab.A0(k66.a, new qy3(this, null, 11));
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public xx6 getErrorsFlow() {
        return this.i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, xt4 xt4Var, Logger logger, int i, j95 j95Var) {
        if ((i & 8) != 0) {
            ao5 ao5Var = ao5.a;
            xt4Var = lb5.c;
        }
        this(deviceIdDataSource, deviceIdReadOnlyDataSource, deviceIdGenerator, xt4Var, logger);
    }
}
