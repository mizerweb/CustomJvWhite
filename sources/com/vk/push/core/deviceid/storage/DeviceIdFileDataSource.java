package com.vk.push.core.deviceid.storage;

import com.vk.push.core.deviceid.DeviceIdDataSource;
import com.vk.push.core.filedatastore.FileDataSource;
import defpackage.ch3;
import defpackage.fk5;
import defpackage.gk5;
import defpackage.hu4;
import defpackage.lq4;
import defpackage.ore;
import defpackage.roe;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/vk/push/core/deviceid/storage/DeviceIdFileDataSource;", "Lcom/vk/push/core/deviceid/DeviceIdDataSource;", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "<init>", "(Lcom/vk/push/core/filedatastore/FileDataSource;)V", "Lroe;", "", "getDeviceId-IoAF18A", "(Llq4;)Ljava/lang/Object;", "getDeviceId", ApiProtocol.PARAM_DEVICE_ID, "Lsbi;", "setDeviceId-gIAlu-s", "(Ljava/lang/String;Llq4;)Ljava/lang/Object;", "setDeviceId", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceIdFileDataSource implements DeviceIdDataSource {
    public static final String DEVICE_ID_FILE_NAME = "device_id.txt";
    public final FileDataSource a;

    public DeviceIdFileDataSource(FileDataSource fileDataSource) {
        this.a = fileDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* JADX INFO: renamed from: getDeviceId-IoAF18A */
    public Object mo15getDeviceIdIoAF18A(lq4 lq4Var) {
        fk5 fk5Var;
        if (lq4Var instanceof fk5) {
            fk5Var = (fk5) lq4Var;
            int i = fk5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk5Var.f = i - Integer.MIN_VALUE;
            } else {
                fk5Var = new fk5(this, lq4Var);
            }
        } else {
            fk5Var = new fk5(this, lq4Var);
        }
        Object obj = fk5Var.d;
        int i2 = fk5Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        fk5Var.f = 1;
        Object objM18getDataIoAF18A = this.a.m18getDataIoAF18A(fk5Var);
        hu4 hu4Var = hu4.a;
        return objM18getDataIoAF18A == hu4Var ? hu4Var : objM18getDataIoAF18A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.deviceid.DeviceIdDataSource
    /* JADX INFO: renamed from: setDeviceId-gIAlu-s */
    public Object mo14setDeviceIdgIAlus(String str, lq4 lq4Var) {
        gk5 gk5Var;
        if (lq4Var instanceof gk5) {
            gk5Var = (gk5) lq4Var;
            int i = gk5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk5Var.f = i - Integer.MIN_VALUE;
            } else {
                gk5Var = new gk5(this, lq4Var);
            }
        } else {
            gk5Var = new gk5(this, lq4Var);
        }
        Object obj = gk5Var.d;
        int i2 = gk5Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        gk5Var.f = 1;
        Object objM19setDatagIAlus = this.a.m19setDatagIAlus(str, gk5Var);
        hu4 hu4Var = hu4.a;
        return objM19setDatagIAlus == hu4Var ? hu4Var : objM19setDatagIAlus;
    }
}
