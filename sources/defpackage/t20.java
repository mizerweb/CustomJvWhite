package defpackage;

import android.net.Uri;
import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.deviceid.DeviceIdDataSource;
import com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource;
import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.ipc.BaseIPCClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import one.me.calls.impl.service.c;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t20 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[PHI: r13 r15
  0x0137: PHI (r13v1 t20) = (r13v0 t20), (r13v2 t20) binds: [B:62:0x0134, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r15v25 java.lang.Object) = (r15v20 java.lang.Object), (r15v0 java.lang.Object) binds: [B:62:0x0134, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a A[PHI: r1 r13
  0x018a: PHI (r1v8 java.io.File) = (r1v5 java.io.File), (r1v10 java.io.File) binds: [B:80:0x0187, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x018a: PHI (r13v5 t20) = (r13v3 t20), (r13v6 t20) binds: [B:80:0x0187, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        if (r15 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (r15 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        if (r4.emit(r14, r13) == r5) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object l(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9 A[Catch: all -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb A[Catch: all -> 0x00e3, PHI: r1 r4 r13
  0x00fb: PHI (r1v5 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v2 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v7 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:51:0x00f7, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r4v8 java.lang.Object) = (r4v5 java.lang.Object), (r4v13 java.lang.Object) binds: [B:51:0x00f7, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r13v10 j9b) = (r13v7 j9b), (r13v13 j9b) binds: [B:51:0x00f7, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f A[Catch: all -> 0x00e3, PHI: r0 r1 r13
  0x013f: PHI (r0v5 java.lang.Throwable) = (r0v1 java.lang.Throwable), (r0v8 java.lang.Throwable) binds: [B:63:0x013b, B:29:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x013f: PHI (r1v9 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v5 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v11 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:63:0x013b, B:29:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x013f: PHI (r13v15 j9b) = (r13v10 j9b), (r13v16 j9b) binds: [B:63:0x013b, B:29:0x008d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0152 A[Catch: all -> 0x00e3, PHI: r1 r13
  0x0152: PHI (r1v8 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v5 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v9 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:61:0x011f, B:65:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r13v14 j9b) = (r13v10 j9b), (r13v15 j9b) binds: [B:61:0x011f, B:65:0x013f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169 A[Catch: all -> 0x00e3, PHI: r0 r1 r13
  0x0169: PHI (r0v9 java.lang.Object) = (r0v4 java.lang.Object), (r0v18 java.lang.Object) binds: [B:67:0x0165, B:26:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x0169: PHI (r1v12 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v8 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v15 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:67:0x0165, B:26:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x0169: PHI (r13v17 j9b) = (r13v14 j9b), (r13v20 j9b) binds: [B:67:0x0165, B:26:0x0078] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016d A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0176 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199 A[Catch: all -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x019f A[Catch: all -> 0x00e3, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0 A[Catch: all -> 0x00e3, PHI: r1 r13
  0x01d0: PHI (r1v19 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v12 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v20 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:81:0x019d, B:86:0x01bd] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r13v22 j9b) = (r13v17 j9b), (r13v23 j9b) binds: [B:81:0x019d, B:86:0x01bd] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x01eb A[Catch: all -> 0x00e3, PHI: r0 r1 r13
  0x01eb: PHI (r0v29 java.lang.Object) = (r0v24 java.lang.Object), (r0v33 java.lang.Object) binds: [B:88:0x01e8, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x01eb: PHI (r1v23 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) = (r1v19 com.vk.push.core.deviceid.DeviceIdRepositoryImpl), (r1v26 com.vk.push.core.deviceid.DeviceIdRepositoryImpl) binds: [B:88:0x01e8, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x01eb: PHI (r13v26 j9b) = (r13v22 j9b), (r13v27 j9b) binds: [B:88:0x01e8, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:90:0x01eb, B:86:0x01bd, B:87:0x01d0, B:69:0x0169, B:71:0x016d, B:73:0x0176, B:80:0x0199, B:82:0x019f, B:65:0x013f, B:66:0x0152, B:53:0x00fb, B:55:0x00ff, B:57:0x0108, B:60:0x011b, B:62:0x0121, B:43:0x00d5, B:45:0x00db, B:50:0x00e9), top: B:100:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01fe  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x013f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [lq4, t20] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [j9b] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    private final Object n(Object obj) throws Throwable {
        j9b j9bVar;
        Object objMo15getDeviceIdIoAF18A;
        Throwable thA;
        d9b d9bVar;
        DeviceIdRepository.DeviceIdError deviceIdError;
        String str;
        Object objMo15getDeviceIdIoAF18A2;
        Throwable thA2;
        d9b d9bVar2;
        DeviceIdRepository.DeviceIdError deviceIdError2;
        Throwable th;
        String str2;
        j9b j9bVar2;
        String str3;
        Object objAccess$generateDeviceId;
        String str4;
        j9b j9bVar3;
        DeviceIdRepositoryImpl deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.k;
        ?? r4 = this.f;
        hu4 hu4Var = hu4.a;
        try {
            try {
                try {
                    switch (r4) {
                        case 0:
                            ch3.d0(obj);
                            if (DeviceIdRepositoryImpl.access$canUseCache(deviceIdRepositoryImpl)) {
                                return deviceIdRepositoryImpl.f;
                            }
                            j9bVar = deviceIdRepositoryImpl.g;
                            this.h = j9bVar;
                            this.i = deviceIdRepositoryImpl;
                            this.f = 1;
                            if (j9bVar.b(this) != hu4Var) {
                                try {
                                    if (DeviceIdRepositoryImpl.access$canUseCache(deviceIdRepositoryImpl)) {
                                        String str5 = deviceIdRepositoryImpl.f;
                                        j9bVar.g(null);
                                        return str5;
                                    }
                                    DeviceIdDataSource deviceIdDataSource = deviceIdRepositoryImpl.a;
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.f = 2;
                                    objMo15getDeviceIdIoAF18A = deviceIdDataSource.mo15getDeviceIdIoAF18A(this);
                                    if (objMo15getDeviceIdIoAF18A == hu4Var) {
                                        if (!(objMo15getDeviceIdIoAF18A instanceof poe)) {
                                            str = (String) objMo15getDeviceIdIoAF18A;
                                            if (!r5h.X0(str)) {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from local storage is used, value = ".concat(str), null, 2, null);
                                                String str6 = deviceIdRepositoryImpl.f = str;
                                                j9bVar.g(null);
                                                return str6;
                                            }
                                        }
                                        thA = roe.a(objMo15getDeviceIdIoAF18A);
                                        if (thA != null) {
                                            d9bVar = deviceIdRepositoryImpl.h;
                                            deviceIdError = new DeviceIdRepository.DeviceIdError(thA, "DeviceId: failed to read from local");
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = objMo15getDeviceIdIoAF18A;
                                            this.j = thA;
                                            this.f = 3;
                                            if (d9bVar.emit(deviceIdError, this) != hu4Var) {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + thA, null, 2, null);
                                                DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource = deviceIdRepositoryImpl.b;
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 4;
                                                objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource.mo15getDeviceIdIoAF18A(this);
                                                if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                                    if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                                        thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                        if (thA2 != null) {
                                                            d9bVar2 = deviceIdRepositoryImpl.h;
                                                            deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = objMo15getDeviceIdIoAF18A2;
                                                            this.j = thA2;
                                                            this.f = 6;
                                                            if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                                th = thA2;
                                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = null;
                                                                this.j = null;
                                                                this.f = 7;
                                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                                if (objAccess$generateDeviceId != hu4Var) {
                                                                    str4 = (String) objAccess$generateDeviceId;
                                                                    this.h = j9bVar;
                                                                    this.i = deviceIdRepositoryImpl;
                                                                    this.g = str4;
                                                                    this.f = 8;
                                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                        j9bVar3 = j9bVar;
                                                                        String str7 = deviceIdRepositoryImpl.f = str4;
                                                                        j9bVar3.g(null);
                                                                        return str7;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = null;
                                                            this.j = null;
                                                            this.f = 7;
                                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                            if (objAccess$generateDeviceId != hu4Var) {
                                                                str4 = (String) objAccess$generateDeviceId;
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = str4;
                                                                this.f = 8;
                                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                    j9bVar3 = j9bVar;
                                                                    String str8 = deviceIdRepositoryImpl.f = str4;
                                                                    j9bVar3.g(null);
                                                                    return str8;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str2 = (String) objMo15getDeviceIdIoAF18A2;
                                                        if (r5h.X0(str2)) {
                                                            thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                            if (thA2 != null) {
                                                                d9bVar2 = deviceIdRepositoryImpl.h;
                                                                deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = objMo15getDeviceIdIoAF18A2;
                                                                this.j = thA2;
                                                                this.f = 6;
                                                                if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                                    th = thA2;
                                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                                    this.h = j9bVar;
                                                                    this.i = deviceIdRepositoryImpl;
                                                                    this.g = null;
                                                                    this.j = null;
                                                                    this.f = 7;
                                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                                        str4 = (String) objAccess$generateDeviceId;
                                                                        this.h = j9bVar;
                                                                        this.i = deviceIdRepositoryImpl;
                                                                        this.g = str4;
                                                                        this.f = 8;
                                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                            j9bVar3 = j9bVar;
                                                                            String str9 = deviceIdRepositoryImpl.f = str4;
                                                                            j9bVar3.g(null);
                                                                            return str9;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = null;
                                                                this.j = null;
                                                                this.f = 7;
                                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                                if (objAccess$generateDeviceId != hu4Var) {
                                                                    str4 = (String) objAccess$generateDeviceId;
                                                                    this.h = j9bVar;
                                                                    this.i = deviceIdRepositoryImpl;
                                                                    this.g = str4;
                                                                    this.f = 8;
                                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                        j9bVar3 = j9bVar;
                                                                        String str10 = deviceIdRepositoryImpl.f = str4;
                                                                        j9bVar3.g(null);
                                                                        return str10;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str2;
                                                            this.f = 5;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                                j9bVar2 = j9bVar;
                                                                str3 = str2;
                                                                String str11 = deviceIdRepositoryImpl.f = str3;
                                                                j9bVar2.g(null);
                                                                return str11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource2 = deviceIdRepositoryImpl.b;
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = null;
                                            this.j = null;
                                            this.f = 4;
                                            objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource2.mo15getDeviceIdIoAF18A(this);
                                            if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                                if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                                    str2 = (String) objMo15getDeviceIdIoAF18A2;
                                                    if (r5h.X0(str2)) {
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str2;
                                                        this.f = 5;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                            j9bVar2 = j9bVar;
                                                            str3 = str2;
                                                            String str12 = deviceIdRepositoryImpl.f = str3;
                                                            j9bVar2.g(null);
                                                            return str12;
                                                        }
                                                    } else {
                                                        thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                        if (thA2 != null) {
                                                            d9bVar2 = deviceIdRepositoryImpl.h;
                                                            deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = objMo15getDeviceIdIoAF18A2;
                                                            this.j = thA2;
                                                            this.f = 6;
                                                            if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                                th = thA2;
                                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = null;
                                                                this.j = null;
                                                                this.f = 7;
                                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                                if (objAccess$generateDeviceId != hu4Var) {
                                                                    str4 = (String) objAccess$generateDeviceId;
                                                                    this.h = j9bVar;
                                                                    this.i = deviceIdRepositoryImpl;
                                                                    this.g = str4;
                                                                    this.f = 8;
                                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                        j9bVar3 = j9bVar;
                                                                        String str13 = deviceIdRepositoryImpl.f = str4;
                                                                        j9bVar3.g(null);
                                                                        return str13;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = null;
                                                            this.j = null;
                                                            this.f = 7;
                                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                            if (objAccess$generateDeviceId != hu4Var) {
                                                                str4 = (String) objAccess$generateDeviceId;
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = str4;
                                                                this.f = 8;
                                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                    j9bVar3 = j9bVar;
                                                                    String str14 = deviceIdRepositoryImpl.f = str4;
                                                                    j9bVar3.g(null);
                                                                    return str14;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                    if (thA2 != null) {
                                                        d9bVar2 = deviceIdRepositoryImpl.h;
                                                        deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = objMo15getDeviceIdIoAF18A2;
                                                        this.j = thA2;
                                                        this.f = 6;
                                                        if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                            th = thA2;
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = null;
                                                            this.j = null;
                                                            this.f = 7;
                                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                            if (objAccess$generateDeviceId != hu4Var) {
                                                                str4 = (String) objAccess$generateDeviceId;
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = str4;
                                                                this.f = 8;
                                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                    j9bVar3 = j9bVar;
                                                                    String str15 = deviceIdRepositoryImpl.f = str4;
                                                                    j9bVar3.g(null);
                                                                    return str15;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = null;
                                                        this.j = null;
                                                        this.f = 7;
                                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                        if (objAccess$generateDeviceId != hu4Var) {
                                                            str4 = (String) objAccess$generateDeviceId;
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str4;
                                                            this.f = 8;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                j9bVar3 = j9bVar;
                                                                String str16 = deviceIdRepositoryImpl.f = str4;
                                                                j9bVar3.g(null);
                                                                return str16;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    j9b j9bVar4 = j9bVar;
                                    th = th2;
                                    this = j9bVar4;
                                    this.g(null);
                                    throw th;
                                }
                            }
                            return hu4Var;
                        case 1:
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar5 = (j9b) this.h;
                            ch3.d0(obj);
                            j9bVar = j9bVar5;
                            if (DeviceIdRepositoryImpl.access$canUseCache(deviceIdRepositoryImpl)) {
                                String str17 = deviceIdRepositoryImpl.f;
                                j9bVar.g(null);
                                return str17;
                            }
                            DeviceIdDataSource deviceIdDataSource2 = deviceIdRepositoryImpl.a;
                            this.h = j9bVar;
                            this.i = deviceIdRepositoryImpl;
                            this.f = 2;
                            objMo15getDeviceIdIoAF18A = deviceIdDataSource2.mo15getDeviceIdIoAF18A(this);
                            if (objMo15getDeviceIdIoAF18A == hu4Var) {
                                if (!(objMo15getDeviceIdIoAF18A instanceof poe)) {
                                    str = (String) objMo15getDeviceIdIoAF18A;
                                    if (!r5h.X0(str)) {
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from local storage is used, value = ".concat(str), null, 2, null);
                                        String str18 = deviceIdRepositoryImpl.f = str;
                                        j9bVar.g(null);
                                        return str18;
                                    }
                                }
                                thA = roe.a(objMo15getDeviceIdIoAF18A);
                                if (thA != null) {
                                    d9bVar = deviceIdRepositoryImpl.h;
                                    deviceIdError = new DeviceIdRepository.DeviceIdError(thA, "DeviceId: failed to read from local");
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = objMo15getDeviceIdIoAF18A;
                                    this.j = thA;
                                    this.f = 3;
                                    if (d9bVar.emit(deviceIdError, this) != hu4Var) {
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + thA, null, 2, null);
                                        DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource3 = deviceIdRepositoryImpl.b;
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = null;
                                        this.j = null;
                                        this.f = 4;
                                        objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource3.mo15getDeviceIdIoAF18A(this);
                                        if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                            if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                                str2 = (String) objMo15getDeviceIdIoAF18A2;
                                                if (r5h.X0(str2)) {
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str2;
                                                    this.f = 5;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                        j9bVar2 = j9bVar;
                                                        str3 = str2;
                                                        String str19 = deviceIdRepositoryImpl.f = str3;
                                                        j9bVar2.g(null);
                                                        return str19;
                                                    }
                                                } else {
                                                    thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                    if (thA2 != null) {
                                                        d9bVar2 = deviceIdRepositoryImpl.h;
                                                        deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = objMo15getDeviceIdIoAF18A2;
                                                        this.j = thA2;
                                                        this.f = 6;
                                                        if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                            th = thA2;
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = null;
                                                            this.j = null;
                                                            this.f = 7;
                                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                            if (objAccess$generateDeviceId != hu4Var) {
                                                                str4 = (String) objAccess$generateDeviceId;
                                                                this.h = j9bVar;
                                                                this.i = deviceIdRepositoryImpl;
                                                                this.g = str4;
                                                                this.f = 8;
                                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                    j9bVar3 = j9bVar;
                                                                    String str110 = deviceIdRepositoryImpl.f = str4;
                                                                    j9bVar3.g(null);
                                                                    return str110;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = null;
                                                        this.j = null;
                                                        this.f = 7;
                                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                        if (objAccess$generateDeviceId != hu4Var) {
                                                            str4 = (String) objAccess$generateDeviceId;
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str4;
                                                            this.f = 8;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                j9bVar3 = j9bVar;
                                                                String str111 = deviceIdRepositoryImpl.f = str4;
                                                                j9bVar3.g(null);
                                                                return str111;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                if (thA2 != null) {
                                                    d9bVar2 = deviceIdRepositoryImpl.h;
                                                    deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = objMo15getDeviceIdIoAF18A2;
                                                    this.j = thA2;
                                                    this.f = 6;
                                                    if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                        th = thA2;
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = null;
                                                        this.j = null;
                                                        this.f = 7;
                                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                        if (objAccess$generateDeviceId != hu4Var) {
                                                            str4 = (String) objAccess$generateDeviceId;
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str4;
                                                            this.f = 8;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                j9bVar3 = j9bVar;
                                                                String str112 = deviceIdRepositoryImpl.f = str4;
                                                                j9bVar3.g(null);
                                                                return str112;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str113 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str113;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource4 = deviceIdRepositoryImpl.b;
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = null;
                                    this.j = null;
                                    this.f = 4;
                                    objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource4.mo15getDeviceIdIoAF18A(this);
                                    if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                        if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                            str2 = (String) objMo15getDeviceIdIoAF18A2;
                                            if (r5h.X0(str2)) {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str2;
                                                this.f = 5;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                    j9bVar2 = j9bVar;
                                                    str3 = str2;
                                                    String str114 = deviceIdRepositoryImpl.f = str3;
                                                    j9bVar2.g(null);
                                                    return str114;
                                                }
                                            } else {
                                                thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                if (thA2 != null) {
                                                    d9bVar2 = deviceIdRepositoryImpl.h;
                                                    deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = objMo15getDeviceIdIoAF18A2;
                                                    this.j = thA2;
                                                    this.f = 6;
                                                    if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                        th = thA2;
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = null;
                                                        this.j = null;
                                                        this.f = 7;
                                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                        if (objAccess$generateDeviceId != hu4Var) {
                                                            str4 = (String) objAccess$generateDeviceId;
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str4;
                                                            this.f = 8;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                j9bVar3 = j9bVar;
                                                                String str115 = deviceIdRepositoryImpl.f = str4;
                                                                j9bVar3.g(null);
                                                                return str115;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str116 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str116;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                            if (thA2 != null) {
                                                d9bVar2 = deviceIdRepositoryImpl.h;
                                                deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = objMo15getDeviceIdIoAF18A2;
                                                this.j = thA2;
                                                this.f = 6;
                                                if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                    th = thA2;
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str117 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str117;
                                                        }
                                                    }
                                                }
                                            } else {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 7;
                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                if (objAccess$generateDeviceId != hu4Var) {
                                                    str4 = (String) objAccess$generateDeviceId;
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str4;
                                                    this.f = 8;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                        j9bVar3 = j9bVar;
                                                        String str118 = deviceIdRepositoryImpl.f = str4;
                                                        j9bVar3.g(null);
                                                        return str118;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return hu4Var;
                        case 2:
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar6 = (j9b) this.h;
                            ch3.d0(obj);
                            objMo15getDeviceIdIoAF18A = ((roe) obj).a;
                            j9bVar = j9bVar6;
                            if (!(objMo15getDeviceIdIoAF18A instanceof poe)) {
                                str = (String) objMo15getDeviceIdIoAF18A;
                                if (!r5h.X0(str)) {
                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from local storage is used, value = ".concat(str), null, 2, null);
                                    String str119 = deviceIdRepositoryImpl.f = str;
                                    j9bVar.g(null);
                                    return str119;
                                }
                            }
                            thA = roe.a(objMo15getDeviceIdIoAF18A);
                            if (thA != null) {
                                d9bVar = deviceIdRepositoryImpl.h;
                                deviceIdError = new DeviceIdRepository.DeviceIdError(thA, "DeviceId: failed to read from local");
                                this.h = j9bVar;
                                this.i = deviceIdRepositoryImpl;
                                this.g = objMo15getDeviceIdIoAF18A;
                                this.j = thA;
                                this.f = 3;
                                if (d9bVar.emit(deviceIdError, this) != hu4Var) {
                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + thA, null, 2, null);
                                    DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource5 = deviceIdRepositoryImpl.b;
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = null;
                                    this.j = null;
                                    this.f = 4;
                                    objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource5.mo15getDeviceIdIoAF18A(this);
                                    if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                        if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                            str2 = (String) objMo15getDeviceIdIoAF18A2;
                                            if (r5h.X0(str2)) {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str2;
                                                this.f = 5;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                    j9bVar2 = j9bVar;
                                                    str3 = str2;
                                                    String str1110 = deviceIdRepositoryImpl.f = str3;
                                                    j9bVar2.g(null);
                                                    return str1110;
                                                }
                                            } else {
                                                thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                                if (thA2 != null) {
                                                    d9bVar2 = deviceIdRepositoryImpl.h;
                                                    deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = objMo15getDeviceIdIoAF18A2;
                                                    this.j = thA2;
                                                    this.f = 6;
                                                    if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                        th = thA2;
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = null;
                                                        this.j = null;
                                                        this.f = 7;
                                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                        if (objAccess$generateDeviceId != hu4Var) {
                                                            str4 = (String) objAccess$generateDeviceId;
                                                            this.h = j9bVar;
                                                            this.i = deviceIdRepositoryImpl;
                                                            this.g = str4;
                                                            this.f = 8;
                                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                                j9bVar3 = j9bVar;
                                                                String str1111 = deviceIdRepositoryImpl.f = str4;
                                                                j9bVar3.g(null);
                                                                return str1111;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str1112 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str1112;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                            if (thA2 != null) {
                                                d9bVar2 = deviceIdRepositoryImpl.h;
                                                deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = objMo15getDeviceIdIoAF18A2;
                                                this.j = thA2;
                                                this.f = 6;
                                                if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                    th = thA2;
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str1113 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str1113;
                                                        }
                                                    }
                                                }
                                            } else {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 7;
                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                if (objAccess$generateDeviceId != hu4Var) {
                                                    str4 = (String) objAccess$generateDeviceId;
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str4;
                                                    this.f = 8;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                        j9bVar3 = j9bVar;
                                                        String str1114 = deviceIdRepositoryImpl.f = str4;
                                                        j9bVar3.g(null);
                                                        return str1114;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource6 = deviceIdRepositoryImpl.b;
                                this.h = j9bVar;
                                this.i = deviceIdRepositoryImpl;
                                this.g = null;
                                this.j = null;
                                this.f = 4;
                                objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource6.mo15getDeviceIdIoAF18A(this);
                                if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                    if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                        str2 = (String) objMo15getDeviceIdIoAF18A2;
                                        if (r5h.X0(str2)) {
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = str2;
                                            this.f = 5;
                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                                j9bVar2 = j9bVar;
                                                str3 = str2;
                                                String str1115 = deviceIdRepositoryImpl.f = str3;
                                                j9bVar2.g(null);
                                                return str1115;
                                            }
                                        } else {
                                            thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                            if (thA2 != null) {
                                                d9bVar2 = deviceIdRepositoryImpl.h;
                                                deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = objMo15getDeviceIdIoAF18A2;
                                                this.j = thA2;
                                                this.f = 6;
                                                if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                    th = thA2;
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = null;
                                                    this.j = null;
                                                    this.f = 7;
                                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                    if (objAccess$generateDeviceId != hu4Var) {
                                                        str4 = (String) objAccess$generateDeviceId;
                                                        this.h = j9bVar;
                                                        this.i = deviceIdRepositoryImpl;
                                                        this.g = str4;
                                                        this.f = 8;
                                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                            j9bVar3 = j9bVar;
                                                            String str1116 = deviceIdRepositoryImpl.f = str4;
                                                            j9bVar3.g(null);
                                                            return str1116;
                                                        }
                                                    }
                                                }
                                            } else {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 7;
                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                if (objAccess$generateDeviceId != hu4Var) {
                                                    str4 = (String) objAccess$generateDeviceId;
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str4;
                                                    this.f = 8;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                        j9bVar3 = j9bVar;
                                                        String str1117 = deviceIdRepositoryImpl.f = str4;
                                                        j9bVar3.g(null);
                                                        return str1117;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                        if (thA2 != null) {
                                            d9bVar2 = deviceIdRepositoryImpl.h;
                                            deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = objMo15getDeviceIdIoAF18A2;
                                            this.j = thA2;
                                            this.f = 6;
                                            if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                th = thA2;
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 7;
                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                if (objAccess$generateDeviceId != hu4Var) {
                                                    str4 = (String) objAccess$generateDeviceId;
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str4;
                                                    this.f = 8;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                        j9bVar3 = j9bVar;
                                                        String str1118 = deviceIdRepositoryImpl.f = str4;
                                                        j9bVar3.g(null);
                                                        return str1118;
                                                    }
                                                }
                                            }
                                        } else {
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = null;
                                            this.j = null;
                                            this.f = 7;
                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                            if (objAccess$generateDeviceId != hu4Var) {
                                                str4 = (String) objAccess$generateDeviceId;
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str4;
                                                this.f = 8;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                    j9bVar3 = j9bVar;
                                                    String str1119 = deviceIdRepositoryImpl.f = str4;
                                                    j9bVar3.g(null);
                                                    return str1119;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return hu4Var;
                        case 3:
                            thA = (Throwable) this.j;
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar7 = (j9b) this.h;
                            ch3.d0(obj);
                            j9bVar = j9bVar7;
                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + thA, null, 2, null);
                            DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource7 = deviceIdRepositoryImpl.b;
                            this.h = j9bVar;
                            this.i = deviceIdRepositoryImpl;
                            this.g = null;
                            this.j = null;
                            this.f = 4;
                            objMo15getDeviceIdIoAF18A2 = deviceIdReadOnlyDataSource7.mo15getDeviceIdIoAF18A(this);
                            if (objMo15getDeviceIdIoAF18A2 != hu4Var) {
                                if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                    str2 = (String) objMo15getDeviceIdIoAF18A2;
                                    if (r5h.X0(str2)) {
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = str2;
                                        this.f = 5;
                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                            j9bVar2 = j9bVar;
                                            str3 = str2;
                                            String str11110 = deviceIdRepositoryImpl.f = str3;
                                            j9bVar2.g(null);
                                            return str11110;
                                        }
                                    } else {
                                        thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                        if (thA2 != null) {
                                            d9bVar2 = deviceIdRepositoryImpl.h;
                                            deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = objMo15getDeviceIdIoAF18A2;
                                            this.j = thA2;
                                            this.f = 6;
                                            if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                                th = thA2;
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = null;
                                                this.j = null;
                                                this.f = 7;
                                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                                if (objAccess$generateDeviceId != hu4Var) {
                                                    str4 = (String) objAccess$generateDeviceId;
                                                    this.h = j9bVar;
                                                    this.i = deviceIdRepositoryImpl;
                                                    this.g = str4;
                                                    this.f = 8;
                                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                        j9bVar3 = j9bVar;
                                                        String str11111 = deviceIdRepositoryImpl.f = str4;
                                                        j9bVar3.g(null);
                                                        return str11111;
                                                    }
                                                }
                                            }
                                        } else {
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = null;
                                            this.j = null;
                                            this.f = 7;
                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                            if (objAccess$generateDeviceId != hu4Var) {
                                                str4 = (String) objAccess$generateDeviceId;
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str4;
                                                this.f = 8;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                    j9bVar3 = j9bVar;
                                                    String str11112 = deviceIdRepositoryImpl.f = str4;
                                                    j9bVar3.g(null);
                                                    return str11112;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                    if (thA2 != null) {
                                        d9bVar2 = deviceIdRepositoryImpl.h;
                                        deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = objMo15getDeviceIdIoAF18A2;
                                        this.j = thA2;
                                        this.f = 6;
                                        if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                            th = thA2;
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = null;
                                            this.j = null;
                                            this.f = 7;
                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                            if (objAccess$generateDeviceId != hu4Var) {
                                                str4 = (String) objAccess$generateDeviceId;
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str4;
                                                this.f = 8;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                    j9bVar3 = j9bVar;
                                                    String str11113 = deviceIdRepositoryImpl.f = str4;
                                                    j9bVar3.g(null);
                                                    return str11113;
                                                }
                                            }
                                        }
                                    } else {
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = null;
                                        this.j = null;
                                        this.f = 7;
                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                        if (objAccess$generateDeviceId != hu4Var) {
                                            str4 = (String) objAccess$generateDeviceId;
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = str4;
                                            this.f = 8;
                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                j9bVar3 = j9bVar;
                                                String str11114 = deviceIdRepositoryImpl.f = str4;
                                                j9bVar3.g(null);
                                                return str11114;
                                            }
                                        }
                                    }
                                }
                            }
                            return hu4Var;
                        case 4:
                            DeviceIdRepositoryImpl deviceIdRepositoryImpl2 = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar8 = (j9b) this.h;
                            ch3.d0(obj);
                            objMo15getDeviceIdIoAF18A2 = ((roe) obj).a;
                            j9bVar = j9bVar8;
                            deviceIdRepositoryImpl = deviceIdRepositoryImpl2;
                            if (objMo15getDeviceIdIoAF18A2 instanceof poe) {
                                str2 = (String) objMo15getDeviceIdIoAF18A2;
                                if (r5h.X0(str2)) {
                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from remote is used", null, 2, null);
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = str2;
                                    this.f = 5;
                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str2, this) != hu4Var) {
                                        j9bVar2 = j9bVar;
                                        str3 = str2;
                                        String str11115 = deviceIdRepositoryImpl.f = str3;
                                        j9bVar2.g(null);
                                        return str11115;
                                    }
                                } else {
                                    thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                    if (thA2 != null) {
                                        d9bVar2 = deviceIdRepositoryImpl.h;
                                        deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = objMo15getDeviceIdIoAF18A2;
                                        this.j = thA2;
                                        this.f = 6;
                                        if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                            th = thA2;
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = null;
                                            this.j = null;
                                            this.f = 7;
                                            objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                            if (objAccess$generateDeviceId != hu4Var) {
                                                str4 = (String) objAccess$generateDeviceId;
                                                this.h = j9bVar;
                                                this.i = deviceIdRepositoryImpl;
                                                this.g = str4;
                                                this.f = 8;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                    j9bVar3 = j9bVar;
                                                    String str11116 = deviceIdRepositoryImpl.f = str4;
                                                    j9bVar3.g(null);
                                                    return str11116;
                                                }
                                            }
                                        }
                                    } else {
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = null;
                                        this.j = null;
                                        this.f = 7;
                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                        if (objAccess$generateDeviceId != hu4Var) {
                                            str4 = (String) objAccess$generateDeviceId;
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = str4;
                                            this.f = 8;
                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                j9bVar3 = j9bVar;
                                                String str11117 = deviceIdRepositoryImpl.f = str4;
                                                j9bVar3.g(null);
                                                return str11117;
                                            }
                                        }
                                    }
                                }
                            } else {
                                thA2 = roe.a(objMo15getDeviceIdIoAF18A2);
                                if (thA2 != null) {
                                    d9bVar2 = deviceIdRepositoryImpl.h;
                                    deviceIdError2 = new DeviceIdRepository.DeviceIdError(thA2, "DeviceId: failed to read from remote");
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = objMo15getDeviceIdIoAF18A2;
                                    this.j = thA2;
                                    this.f = 6;
                                    if (d9bVar2.emit(deviceIdError2, this) == hu4Var) {
                                        th = thA2;
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = null;
                                        this.j = null;
                                        this.f = 7;
                                        objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                        if (objAccess$generateDeviceId != hu4Var) {
                                            str4 = (String) objAccess$generateDeviceId;
                                            this.h = j9bVar;
                                            this.i = deviceIdRepositoryImpl;
                                            this.g = str4;
                                            this.f = 8;
                                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                                j9bVar3 = j9bVar;
                                                String str11118 = deviceIdRepositoryImpl.f = str4;
                                                j9bVar3.g(null);
                                                return str11118;
                                            }
                                        }
                                    }
                                } else {
                                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = null;
                                    this.j = null;
                                    this.f = 7;
                                    objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                    if (objAccess$generateDeviceId != hu4Var) {
                                        str4 = (String) objAccess$generateDeviceId;
                                        this.h = j9bVar;
                                        this.i = deviceIdRepositoryImpl;
                                        this.g = str4;
                                        this.f = 8;
                                        if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                            j9bVar3 = j9bVar;
                                            String str11119 = deviceIdRepositoryImpl.f = str4;
                                            j9bVar3.g(null);
                                            return str11119;
                                        }
                                    }
                                }
                            }
                            return hu4Var;
                        case 5:
                            str3 = (String) this.g;
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9bVar2 = (j9b) this.h;
                            ch3.d0(obj);
                            String str111110 = deviceIdRepositoryImpl.f = str3;
                            j9bVar2.g(null);
                            return str111110;
                        case 6:
                            th = (Throwable) this.j;
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar9 = (j9b) this.h;
                            try {
                                ch3.d0(obj);
                                j9bVar = j9bVar9;
                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id will be generated", null, 2, null);
                                this.h = j9bVar;
                                this.i = deviceIdRepositoryImpl;
                                this.g = null;
                                this.j = null;
                                this.f = 7;
                                objAccess$generateDeviceId = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl, this);
                                if (objAccess$generateDeviceId != hu4Var) {
                                    str4 = (String) objAccess$generateDeviceId;
                                    this.h = j9bVar;
                                    this.i = deviceIdRepositoryImpl;
                                    this.g = str4;
                                    this.f = 8;
                                    if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                        j9bVar3 = j9bVar;
                                        String str111111 = deviceIdRepositoryImpl.f = str4;
                                        j9bVar3.g(null);
                                        return str111111;
                                    }
                                }
                                return hu4Var;
                            } catch (Throwable th3) {
                                th = th3;
                                this = j9bVar9;
                                this.g(null);
                                throw th;
                            }
                        case 7:
                            DeviceIdRepositoryImpl deviceIdRepositoryImpl3 = (DeviceIdRepositoryImpl) this.i;
                            j9b j9bVar10 = (j9b) this.h;
                            ch3.d0(obj);
                            objAccess$generateDeviceId = obj;
                            j9bVar = j9bVar10;
                            deviceIdRepositoryImpl = deviceIdRepositoryImpl3;
                            str4 = (String) objAccess$generateDeviceId;
                            this.h = j9bVar;
                            this.i = deviceIdRepositoryImpl;
                            this.g = str4;
                            this.f = 8;
                            if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl, str4, this) != hu4Var) {
                                j9bVar3 = j9bVar;
                                String str111112 = deviceIdRepositoryImpl.f = str4;
                                j9bVar3.g(null);
                                return str111112;
                            }
                            return hu4Var;
                        case 8:
                            str4 = (String) this.g;
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.i;
                            j9bVar3 = (j9b) this.h;
                            ch3.d0(obj);
                            String str111113 = deviceIdRepositoryImpl.f = str4;
                            j9bVar3.g(null);
                            return str111113;
                        default:
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    this = deviceIdRepositoryImpl;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            this = r4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        if (r0 == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fd, code lost:
    
        if (defpackage.f37.D(r0, r3, r20) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d3, code lost:
    
        if (r0.h(r13, r2, r3, r4, r5, r6, r20) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f7, code lost:
    
        if (defpackage.f37.D(r0, r2, r20) == r9) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (defpackage.yab.K0(((defpackage.n0c) ((defpackage.xhh) r1.d.getValue())).c(), new defpackage.c37(r1, null, 1), r11) == r10) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0100 A[Catch: all -> 0x011d, CancellationException -> 0x0121, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0121, all -> 0x011d, blocks: (B:26:0x00ee, B:28:0x0100), top: B:64:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014f, code lost:
    
        if (r1 == r12) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0100, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object q(java.lang.Object r18) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        String strP;
        String strD;
        Object objE;
        String str;
        bi8 bi8Var = (bi8) this.k;
        nh8 nh8Var = bi8Var.d;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            strP = zo5.p((String) this.i, " ", (String) this.j);
            strD = nh8Var.i.d("", strP);
            y6b y6bVar = (y6b) bi8Var.h.getValue();
            this.g = strP;
            this.h = strD;
            this.f = 1;
            objE = y6bVar.e(strD, this);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            strD = (String) this.h;
            String str2 = (String) this.g;
            ch3.d0(obj);
            objE = obj;
            strP = str2;
        } else {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = (String) this.g;
            ch3.d0(obj);
            str = str3;
        }
        ie0 ie0Var = (ie0) obj;
        a8j.x(bi8Var.i, new qh8(ie0Var.c, str, ie0Var.d, ie0Var.e, ((x0c) nh8Var.e.getValue()).a));
        return sbiVar;
        String str4 = strD;
        if (((Boolean) objE).booleanValue()) {
            pzf pzfVar = bi8Var.j;
            sf9 sf9Var = new sf9(new tnh(R.string.oneme_login_already_in_this_profile));
            this.g = null;
            this.h = null;
            this.f = 2;
            if (pzfVar.emit(sf9Var, this) != hu4Var) {
                return sbiVar;
            }
        } else {
            le0 le0Var = (le0) bi8Var.e.getValue();
            this.g = strP;
            this.h = null;
            this.f = 3;
            le0Var.getClass();
            Object objN = e9i.N(new j3(new bye(new je0(le0Var, str4, 1, (lq4) null, 0)), 15, new ke0(4, null)), this);
            if (objN != hu4Var) {
                str = strP;
                obj = objN;
                ie0 ie0Var2 = (ie0) obj;
                a8j.x(bi8Var.i, new qh8(ie0Var2.c, str, ie0Var2.d, ie0Var2.e, ((x0c) nh8Var.e.getValue()).a));
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:27:0x0086, B:30:0x008b, B:32:0x0095, B:23:0x0074), top: B:51:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    private final Object s(Object obj) throws Throwable {
        j9b j9bVar;
        cf7 cf7Var;
        Object objM20access$readUnsafeIoAF18A;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl;
        cf7 cf7Var2;
        Throwable th;
        j9b j9bVar2;
        JsonSerializer jsonSerializer;
        Object objM21access$writeUnsafegIAlus;
        Object obj2;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) this.j;
        int i = this.f;
        boolean z = false;
        hu4 hu4Var = hu4.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                j9bVar = jsonSerializableFileDataStoreImpl2.i;
                cf7Var = (cf7) this.k;
                this.g = j9bVar;
                this.h = jsonSerializableFileDataStoreImpl2;
                this.i = cf7Var;
                this.f = 1;
                if (j9bVar.b(this) != hu4Var) {
                }
                return hu4Var;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j9bVar2 = (j9b) this.g;
                    try {
                        ch3.d0(obj);
                        obj2 = ((roe) obj).a;
                        if (!(obj2 instanceof poe)) {
                            z = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        j9bVar2.g(null);
                        return boolValueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                cf7Var2 = (cf7) this.i;
                jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.h;
                j9b j9bVar3 = (j9b) this.g;
                try {
                    ch3.d0(obj);
                    objM20access$readUnsafeIoAF18A = ((roe) obj).a;
                    j9bVar = j9bVar3;
                    if (objM20access$readUnsafeIoAF18A instanceof poe) {
                        objM20access$readUnsafeIoAF18A = null;
                    }
                    jsonSerializer = (JsonSerializer) cf7Var2.invoke((JsonSerializer) objM20access$readUnsafeIoAF18A);
                    if (jsonSerializer != null) {
                        this.g = j9bVar;
                        this.h = null;
                        this.i = null;
                        this.f = 3;
                        objM21access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m21access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
                        if (objM21access$writeUnsafegIAlus != hu4Var) {
                            j9b j9bVar4 = j9bVar;
                            obj2 = objM21access$writeUnsafegIAlus;
                            j9bVar2 = j9bVar4;
                            if (!(obj2 instanceof poe)) {
                                z = true;
                            }
                        }
                        return hu4Var;
                    }
                    j9bVar2 = j9bVar;
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    j9bVar2.g(null);
                    return boolValueOf2;
                } catch (Throwable th3) {
                    th = th3;
                    j9bVar2 = j9bVar3;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            cf7 cf7Var3 = (cf7) this.i;
            JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl3 = (JsonSerializableFileDataStoreImpl) this.h;
            j9b j9bVar5 = (j9b) this.g;
            ch3.d0(obj);
            cf7Var = cf7Var3;
            jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl3;
            j9bVar = j9bVar5;
            this.g = j9bVar;
            this.h = jsonSerializableFileDataStoreImpl2;
            this.i = cf7Var;
            this.f = 2;
            objM20access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m20access$readUnsafeIoAF18A(jsonSerializableFileDataStoreImpl2, this);
            if (objM20access$readUnsafeIoAF18A != hu4Var) {
                cf7 cf7Var4 = cf7Var;
                jsonSerializableFileDataStoreImpl = jsonSerializableFileDataStoreImpl2;
                cf7Var2 = cf7Var4;
                if (objM20access$readUnsafeIoAF18A instanceof poe) {
                    objM20access$readUnsafeIoAF18A = null;
                }
                jsonSerializer = (JsonSerializer) cf7Var2.invoke((JsonSerializer) objM20access$readUnsafeIoAF18A);
                if (jsonSerializer != null) {
                    this.g = j9bVar;
                    this.h = null;
                    this.i = null;
                    this.f = 3;
                    objM21access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m21access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
                    if (objM21access$writeUnsafegIAlus != hu4Var) {
                        j9b j9bVar6 = j9bVar;
                        obj2 = objM21access$writeUnsafegIAlus;
                        j9bVar2 = j9bVar6;
                        if (!(obj2 instanceof poe)) {
                            z = true;
                        }
                    }
                } else {
                    j9bVar2 = j9bVar;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                j9bVar2.g(null);
                return boolValueOf3;
            }
            return hu4Var;
        } catch (Throwable th4) {
            j9b j9bVar7 = j9bVar;
            th = th4;
            j9bVar2 = j9bVar7;
            j9bVar2.g(null);
            throw th;
        }
    }

    private final Object t(Object obj) throws Throwable {
        j9b j9bVar;
        JsonSerializer jsonSerializer;
        Throwable th;
        j9b j9bVar2;
        Object obj2;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.j;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                j9bVar = jsonSerializableFileDataStoreImpl.i;
                jsonSerializer = (JsonSerializer) this.k;
                this.g = j9bVar;
                this.h = jsonSerializableFileDataStoreImpl;
                this.i = jsonSerializer;
                this.f = 1;
                if (j9bVar.b(this) != hu4Var) {
                }
                return hu4Var;
            }
            if (i != 1) {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = (j9b) this.g;
                try {
                    ch3.d0(obj);
                    obj2 = ((roe) obj).a;
                    Boolean boolValueOf = Boolean.valueOf(!(obj2 instanceof poe));
                    j9bVar2.g(null);
                    return boolValueOf;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            JsonSerializer jsonSerializer2 = (JsonSerializer) this.i;
            JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) this.h;
            j9b j9bVar3 = (j9b) this.g;
            ch3.d0(obj);
            jsonSerializer = jsonSerializer2;
            jsonSerializableFileDataStoreImpl = jsonSerializableFileDataStoreImpl2;
            j9bVar = j9bVar3;
            if (jsonSerializableFileDataStoreImpl.e) {
                jsonSerializableFileDataStoreImpl.j = jsonSerializer;
            }
            this.g = j9bVar;
            this.h = null;
            this.i = null;
            this.f = 2;
            Object objM21access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m21access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
            if (objM21access$writeUnsafegIAlus != hu4Var) {
                j9b j9bVar4 = j9bVar;
                obj2 = objM21access$writeUnsafegIAlus;
                j9bVar2 = j9bVar4;
                Boolean boolValueOf2 = Boolean.valueOf(!(obj2 instanceof poe));
                j9bVar2.g(null);
                return boolValueOf2;
            }
            return hu4Var;
        } catch (Throwable th3) {
            j9b j9bVar5 = j9bVar;
            th = th3;
            j9bVar2 = j9bVar5;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    private final Object u(Object obj) {
        ohf ohfVar;
        ohf ohfVar2;
        ArrayList arrayList;
        Object objC;
        ohf ohfVar3;
        ArrayList arrayList2;
        Collection collection;
        Object objC2;
        Collection collection2;
        mm4 mm4Var;
        s9a s9aVar;
        ArrayList arrayList3;
        r00 r00Var = (r00) this.k;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            this.f = 1;
            obj = r00.a(r00Var, this);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i == 2) {
                ohfVar = (ohf) this.g;
                ch3.d0(obj);
                ohfVar2 = (ohf) obj;
                arrayList = new ArrayList();
                List listW0 = yhf.w0(ohfVar);
                this.g = null;
                this.h = ohfVar2;
                this.i = arrayList;
                this.f = 3;
                objC = ch3.c(listW0, this);
                if (objC != hu4Var) {
                    ohfVar3 = ohfVar2;
                    obj = objC;
                    arrayList2 = arrayList;
                    collection = (Collection) obj;
                    List listW1 = yhf.w0(ohfVar3);
                    this.g = null;
                    this.h = null;
                    this.i = arrayList2;
                    this.j = collection;
                    this.f = 4;
                    objC2 = ch3.c(listW1, this);
                    if (objC2 != hu4Var) {
                        collection2 = collection;
                        obj = objC2;
                        ww3.p1(ww3.G1((Iterable) obj, collection2), arrayList2);
                        mm4Var = (mm4) ((ny8) r00Var.a).getValue();
                        s9aVar = new s9a(4);
                        this.g = null;
                        this.h = null;
                        this.i = arrayList2;
                        this.j = null;
                        this.f = 5;
                        if (mm4Var.b(arrayList2, s9aVar, this) != hu4Var) {
                            arrayList3 = arrayList2;
                        }
                    }
                }
                return hu4Var;
            }
            if (i == 3) {
                arrayList2 = (ArrayList) this.i;
                ohfVar3 = (ohf) this.h;
                ch3.d0(obj);
                collection = (Collection) obj;
                List listW2 = yhf.w0(ohfVar3);
                this.g = null;
                this.h = null;
                this.i = arrayList2;
                this.j = collection;
                this.f = 4;
                objC2 = ch3.c(listW2, this);
                if (objC2 != hu4Var) {
                    collection2 = collection;
                    obj = objC2;
                    ww3.p1(ww3.G1((Iterable) obj, collection2), arrayList2);
                    mm4Var = (mm4) ((ny8) r00Var.a).getValue();
                    s9aVar = new s9a(4);
                    this.g = null;
                    this.h = null;
                    this.i = arrayList2;
                    this.j = null;
                    this.f = 5;
                    if (mm4Var.b(arrayList2, s9aVar, this) != hu4Var) {
                        arrayList3 = arrayList2;
                    }
                }
                return hu4Var;
            }
            if (i == 4) {
                Collection collection3 = (Collection) this.j;
                ArrayList arrayList4 = (ArrayList) this.i;
                ch3.d0(obj);
                collection2 = collection3;
                arrayList2 = arrayList4;
                ww3.p1(ww3.G1((Iterable) obj, collection2), arrayList2);
                mm4Var = (mm4) ((ny8) r00Var.a).getValue();
                s9aVar = new s9a(4);
                this.g = null;
                this.h = null;
                this.i = arrayList2;
                this.j = null;
                this.f = 5;
                if (mm4Var.b(arrayList2, s9aVar, this) != hu4Var) {
                    arrayList3 = arrayList2;
                }
                return hu4Var;
            }
            if (i != 5) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList3 = (ArrayList) this.i;
            ch3.d0(obj);
        }
        arrayList3.removeIf(new u6(11, new ez(new m8b(arrayList3.size()), 2)));
        mjg mjgVar = (mjg) r00Var.j;
        mjgVar.getClass();
        mjgVar.j(null, arrayList3);
        ((AtomicBoolean) r00Var.g).set(false);
        return sbi.a;
        ohfVar = (ohf) obj;
        this.g = ohfVar;
        this.f = 2;
        obj = r00.b(r00Var, this);
        if (obj != hu4Var) {
            ohfVar2 = (ohf) obj;
            arrayList = new ArrayList();
            List listW3 = yhf.w0(ohfVar);
            this.g = null;
            this.h = ohfVar2;
            this.i = arrayList;
            this.f = 3;
            objC = ch3.c(listW3, this);
            if (objC != hu4Var) {
                ohfVar3 = ohfVar2;
                obj = objC;
                arrayList2 = arrayList;
                collection = (Collection) obj;
                List listW4 = yhf.w0(ohfVar3);
                this.g = null;
                this.h = null;
                this.i = arrayList2;
                this.j = collection;
                this.f = 4;
                objC2 = ch3.c(listW4, this);
                if (objC2 != hu4Var) {
                    collection2 = collection;
                    obj = objC2;
                    ww3.p1(ww3.G1((Iterable) obj, collection2), arrayList2);
                    mm4Var = (mm4) ((ny8) r00Var.a).getValue();
                    s9aVar = new s9a(4);
                    this.g = null;
                    this.h = null;
                    this.i = arrayList2;
                    this.j = null;
                    this.f = 5;
                    if (mm4Var.b(arrayList2, s9aVar, this) != hu4Var) {
                        arrayList3 = arrayList2;
                        arrayList3.removeIf(new u6(11, new ez(new m8b(arrayList3.size()), 2)));
                        mjg mjgVar2 = (mjg) r00Var.j;
                        mjgVar2.getClass();
                        mjgVar2.j(null, arrayList3);
                        ((AtomicBoolean) r00Var.g).set(false);
                        return sbi.a;
                    }
                }
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r12 == r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.j
            r3 = r0
            a0b r3 = (defpackage.a0b) r3
            java.lang.Object r0 = r11.g
            r5 = r0
            gu4 r5 = (defpackage.gu4) r5
            int r0 = r11.f
            r8 = 2
            r1 = 1
            r2 = r5
            r5 = 0
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L22
            if (r0 != r8) goto L1b
            defpackage.ch3.d0(r12)
            goto Lbc
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            r11 = 0
            return r11
        L22:
            java.lang.Object r11 = r11.h
            long[] r11 = (long[]) r11
            defpackage.ch3.d0(r12)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r10 = r5
            goto L5d
        L2b:
            r0 = move-exception
            r11 = r0
            r10 = r5
            goto L6d
        L2f:
            defpackage.ch3.d0(r12)
            java.lang.Object r12 = r11.i
            pw r12 = (defpackage.pw) r12
            int r0 = r12.c
            hu4 r9 = defpackage.hu4.a
            r4 = 100
            if (r0 > r4) goto L78
            java.lang.Object r0 = r11.k
            r4 = r0
            java.lang.Long r4 = (java.lang.Long) r4
            long[] r2 = defpackage.ww3.U1(r12)     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            r11.g = r5     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            r11.h = r2     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            r11.f = r1     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            gv7 r1 = new gv7     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            r6 = 14
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a java.util.concurrent.CancellationException -> L75
            r10 = r5
            java.lang.Object r12 = defpackage.cqk.k(r1, r11)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L75
            if (r12 != r9) goto L5c
            goto Lbb
        L5c:
            r11 = r2
        L5d:
            ylc r0 = new ylc     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L75
            r0.<init>(r11, r12)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L75
            java.util.List r11 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L75
            return r11
        L67:
            r0 = move-exception
        L68:
            r11 = r0
            goto L6d
        L6a:
            r0 = move-exception
            r10 = r5
            goto L68
        L6d:
            java.lang.String r12 = "MissedContactsController"
            java.lang.String r0 = "fail"
            defpackage.gm0.V(r12, r0, r11)
            return r10
        L75:
            r0 = move-exception
            r11 = r0
            throw r11
        L78:
            r10 = r5
            java.util.ArrayList r12 = defpackage.ww3.Y1(r12, r4, r4)
            java.lang.Object r0 = r11.k
            r7 = r0
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yw3.W0(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L91:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r4 = r12.next()
            t20 r1 = new t20
            r6 = r3
            r3 = 0
            r5 = r2
            r2 = 24
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = r6
            r2 = 3
            r4 = 0
            yf5 r1 = defpackage.yab.h(r5, r10, r4, r1, r2)
            r0.add(r1)
            r2 = r5
            goto L91
        Lb1:
            r11.g = r10
            r11.f = r8
            java.lang.Object r12 = defpackage.ch3.c(r0, r11)
            if (r12 != r9) goto Lbc
        Lbb:
            return r9
        Lbc:
            java.util.List r12 = (java.util.List) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    private final Object w(Object obj) {
        long[] jArr;
        long[] jArr2;
        a4c a4cVar;
        je9 je9Var;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                a0b a0bVar = (a0b) this.i;
                long[] jArr3 = (long[]) this.j;
                Long l = (Long) this.k;
                try {
                    pvb pvbVar = (pvb) a0bVar.a.getValue();
                    wy2 wy2Var = new wy2(jArr3, l);
                    this.g = jArr3;
                    this.h = jArr3;
                    this.f = 1;
                    obj = pvbVar.D(wy2Var, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    jArr2 = jArr3;
                    jArr = jArr2;
                } catch (Throwable th) {
                    th = th;
                    jArr = jArr3;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "MissedContactsController", "fail to fetch contact info ".concat(a.f1(63, jArr)), th);
                        }
                    }
                    return null;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jArr = (long[]) this.h;
                jArr2 = (long[]) this.g;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "MissedContactsController", "fail to fetch contact info ".concat(a.f1(63, jArr)), th);
                        }
                    }
                    return null;
                }
            }
            rj4 rj4Var = (rj4) obj;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, "MissedContactsController", "success CONTACT_INFO request: " + rj4Var + "; " + a.f1(63, jArr2) + "}", null);
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object x(Object obj) {
        Object poeVar;
        File file;
        apd apdVar;
        apd apdVar2 = (apd) this.j;
        AtomicReference atomicReference = apdVar2.q;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                zv8[] zv8VarArr = apd.r;
                File fileT = ((ju6) apdVar2.f.getValue()).t((String) atomicReference.get());
                Uri uri = (Uri) this.k;
                xw4 xw4Var = (xw4) apdVar2.i.getValue();
                this.g = gu4Var;
                this.h = fileT;
                this.i = apdVar2;
                this.f = 1;
                Object objC = xw4Var.c(fileT, uri, this);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
                }
                file = fileT;
                apdVar = apdVar2;
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                apdVar = (apd) this.i;
                file = (File) this.h;
                ch3.d0(obj);
            }
            a8j.x(apdVar.n, new aod(Uri.fromFile(file).toString(), file.getAbsolutePath()));
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(gu4Var.getClass().getName(), "failed to copy picked image, e:", thA);
            atomicReference.set(null);
            a8j.x(apdVar2.o, new uod(new tnh(R.string.oneme_profile_edit_change_avatar_error), Integer.valueOf(R.drawable.icon_warning)));
        }
        return sbiVar;
    }

    private final Object y(Object obj) {
        Object poeVar;
        File file;
        dvd dvdVar;
        dvd dvdVar2 = (dvd) this.j;
        AtomicReference atomicReference = dvdVar2.q1;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                zv8[] zv8VarArr = dvd.u1;
                File fileT = ((ju6) dvdVar2.r.getValue()).t((String) atomicReference.get());
                Uri uri = (Uri) this.k;
                xw4 xw4Var = (xw4) dvdVar2.s.getValue();
                this.g = gu4Var;
                this.h = fileT;
                this.i = dvdVar2;
                this.f = 1;
                Object objC = xw4Var.c(fileT, uri, this);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
                }
                file = fileT;
                dvdVar = dvdVar2;
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dvdVar = (dvd) this.i;
                file = (File) this.h;
                ch3.d0(obj);
            }
            a8j.x(dvdVar.C, new bsd(Uri.fromFile(file).toString(), file.getAbsolutePath()));
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(gu4Var.getClass().getName(), "failed to copy picked image, e:", thA);
            atomicReference.set(null);
            a8j.x(dvdVar2.B, new pud(4, new tnh(R.string.profile_change_avatar_error), Integer.valueOf(R.drawable.icon_warning)));
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new t20(0, lq4Var, this.g, (w20) this.h, (rt2) this.i, (h8b) this.j);
            case 1:
                return new t20((BaseIPCClient) this.g, (qf7) this.h, (String) this.i, (cf7) this.j, (cf7) this.k, lq4Var, 1);
            case 2:
                return new t20((w11) this.j, (Long) this.k, lq4Var, 2);
            case 3:
                return new t20((pe1) this.j, (String) this.k, lq4Var, 3);
            case 4:
                return new t20((hs1) this.g, (String) this.h, (dz4) this.i, (be1) this.j, (cf7) this.k, lq4Var, 4);
            case 5:
                return new t20((hs1) this.g, (String) this.h, (dz4) this.i, (be1) this.j, (c) this.k, lq4Var, 5);
            case 6:
                t20 t20Var = new t20((n23) this.h, (j60) this.i, (sq6) this.j, (String) this.k, lq4Var, 6);
                t20Var.g = obj;
                return t20Var;
            case 7:
                t20 t20Var2 = new t20((rt2) this.i, (sfa) this.k, (l63) this.j, lq4Var);
                t20Var2.h = obj;
                return t20Var2;
            case 8:
                return new t20((xd3) this.h, (CharSequence) this.i, (Long) this.j, (Long) this.k, lq4Var, 8);
            case 9:
                return new t20((xd3) this.h, (g4b) this.i, (Uri) this.j, (Long) this.k, lq4Var, 9);
            case 10:
                t20 t20Var3 = new t20((wf3) this.j, (Uri) this.k, lq4Var, 10);
                t20Var3.g = obj;
                return t20Var3;
            case 11:
                return new t20((rx4) this.j, (kbi) this.k, lq4Var, 11);
            case 12:
                t20 t20Var4 = new t20((List) this.j, (ArrayList) this.k, lq4Var, 12);
                t20Var4.i = obj;
                return t20Var4;
            case 13:
                t20 t20Var5 = new t20((ywg) this.i, (ae5) this.j, (ArrayList) this.k, lq4Var, 13);
                t20Var5.g = obj;
                return t20Var5;
            case 14:
                t20 t20Var6 = new t20((zwg) this.i, (ae5) this.j, (ArrayList) this.k, lq4Var, 14);
                t20Var6.g = obj;
                return t20Var6;
            case 15:
                return new t20((DeviceIdRepositoryImpl) this.k, lq4Var, 15);
            case 16:
                t20 t20Var7 = new t20((w27) this.j, (f37) this.k, lq4Var, 16);
                t20Var7.i = obj;
                return t20Var7;
            case 17:
                t20 t20Var8 = new t20((n37) this.j, (String) this.k, lq4Var, 17);
                t20Var8.i = obj;
                return t20Var8;
            case 18:
                t20 t20Var9 = new t20((tz7) this.k, lq4Var, 18);
                t20Var9.g = obj;
                return t20Var9;
            case 19:
                return new t20((String) this.i, (String) this.j, (bi8) this.k, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new t20((JsonSerializableFileDataStoreImpl) this.j, (cf7) this.k, lq4Var, 20);
            case 21:
                return new t20((JsonSerializableFileDataStoreImpl) this.j, (JsonSerializer) this.k, lq4Var, 21);
            case 22:
                return new t20((r00) this.k, lq4Var, 22);
            case 23:
                return new t20((jsa) this.g, (Long) this.h, (String) this.i, (g61) this.j, (c61) this.k, lq4Var, 23);
            case 24:
                return new t20(24, lq4Var, this.g, (gu4) this.h, (a0b) this.i, (Long) this.j);
            case 25:
                t20 t20Var10 = new t20((pw) this.i, (a0b) this.j, (Long) this.k, lq4Var, 25);
                t20Var10.g = obj;
                return t20Var10;
            case 26:
                return new t20((a0b) this.i, (long[]) this.j, (Long) this.k, lq4Var, 26);
            case 27:
                t20 t20Var11 = new t20((apd) this.j, (Uri) this.k, lq4Var, 27);
                t20Var11.g = obj;
                return t20Var11;
            case 28:
                t20 t20Var12 = new t20((dvd) this.j, (Uri) this.k, lq4Var, 28);
                t20Var12.g = obj;
                return t20Var12;
            default:
                t20 t20Var13 = new t20((n2e) this.j, (File) this.k, lq4Var, 29);
                t20Var13.g = obj;
                return t20Var13;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((t20) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((t20) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((t20) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((t20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0211  */
    /* JADX WARN: Code duplicated, block: B:110:0x0219  */
    /* JADX WARN: Code duplicated, block: B:114:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[PHI: r0
  0x024f: PHI (r0v194 java.lang.Object) = (r0v191 java.lang.Object), (r0v200 java.lang.Object) binds: [B:115:0x024c, B:98:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0253  */
    /* JADX WARN: Code duplicated, block: B:122:0x025e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0276  */
    /* JADX WARN: Code duplicated, block: B:131:0x0289 A[PHI: r0
  0x0289: PHI (r0v201 java.io.File) = (r0v195 java.io.File), (r0v203 java.io.File) binds: [B:129:0x0286, B:95:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x029e A[PHI: r0
  0x029e: PHI (r0v204 java.io.File) = (r0v201 java.io.File), (r0v209 java.io.File) binds: [B:132:0x029b, B:94:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x0658  */
    /* JADX WARN: Code duplicated, block: B:287:0x065c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0662  */
    /* JADX WARN: Code duplicated, block: B:290:0x066e  */
    /* JADX WARN: Code duplicated, block: B:373:0x08b3  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0226, code lost:
    
        if (r10.emit(r9, r5) == r13) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0273, code lost:
    
        if (r10.emit(r9, r5) == r13) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b2, code lost:
    
        if (r10.emit(r1, r5) == r13) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x050a, code lost:
    
        if (r0 == r15) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0585, code lost:
    
        if (r2 == r1) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r5 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x084a, code lost:
    
        if (r0 == r1) goto L369;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(rt2 rt2Var, sfa sfaVar, l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.i = rt2Var;
        this.k = sfaVar;
        this.j = l63Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(a8j a8jVar, Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = a8jVar;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
