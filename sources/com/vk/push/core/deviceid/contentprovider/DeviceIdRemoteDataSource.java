package com.vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.hu4;
import defpackage.jk5;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.ore;
import defpackage.qc5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdRemoteDataSource;", "Lcom/vk/push/core/deviceid/DeviceIdReadOnlyDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lroe;", "", "getDeviceId-IoAF18A", "(Llq4;)Ljava/lang/Object;", "getDeviceId", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceIdRemoteDataSource implements DeviceIdReadOnlyDataSource {

    @Deprecated
    public static final long QUERY_TIMEOUT_MS = 10000;
    public final Context a;

    public DeviceIdRemoteDataSource(Context context) {
        this.a = context;
    }

    public static final boolean access$hasProvider(DeviceIdRemoteDataSource deviceIdRemoteDataSource, PackageInfo packageInfo) {
        deviceIdRemoteDataSource.getClass();
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (cqk.d(providerInfo.authority, DeviceIdUriMatcher.INSTANCE.getAuthority(providerInfo.packageName))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Uri b(String str) {
        return new Uri.Builder().scheme("content").authority(DeviceIdUriMatcher.INSTANCE.getAuthority(str)).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, lq4 lq4Var) throws Throwable {
        jk5 jk5Var;
        Cursor cursor;
        if (lq4Var instanceof jk5) {
            jk5Var = (jk5) lq4Var;
            int i = jk5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jk5Var.g = i - Integer.MIN_VALUE;
            } else {
                jk5Var = new jk5(this, lq4Var);
            }
        } else {
            jk5Var = new jk5(this, lq4Var);
        }
        Object objJ0 = jk5Var.e;
        int i2 = jk5Var.g;
        Cursor cursor2 = null;
        string = null;
        String string = null;
        try {
            if (i2 == 0) {
                ch3.d0(objJ0);
                qc5 qc5Var = new qc5(this, Uri.withAppendedPath(b(str), DeviceIdUriMatcher.INSTANCE.getPath()), (lq4) null, 3);
                jk5Var.d = this;
                jk5Var.g = 1;
                objJ0 = lvb.J0(10000L, qc5Var, jk5Var);
                hu4 hu4Var = hu4.a;
                if (objJ0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = jk5Var.d;
                ch3.d0(objJ0);
            }
            cursor = (Cursor) objJ0;
            try {
                this.getClass();
                if (cursor != null) {
                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex(DeviceIdUriMatcher.INSTANCE.getVirtualColumnName());
                    if (columnIndex != -1) {
                        string = cursor.getString(columnIndex);
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return string;
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:12:0x0025, B:28:0x0094, B:18:0x0069, B:20:0x006f, B:23:0x0082, B:17:0x0033), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #0 {all -> 0x009e, blocks: (B:12:0x0025, B:28:0x0094, B:18:0x0069, B:20:0x006f, B:23:0x0082, B:17:0x0033), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:28:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* JADX INFO: renamed from: getDeviceId-IoAF18A */
    public java.lang.Object mo15getDeviceIdIoAF18A(defpackage.lq4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.hk5
            if (r0 == 0) goto L13
            r0 = r6
            hk5 r0 = (defpackage.hk5) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            hk5 r0 = new hk5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.util.Iterator r5 = r0.e
            com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource r1 = r0.d
            defpackage.ch3.d0(r6)     // Catch: java.lang.Throwable -> L9e
            goto L94
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L30:
            defpackage.ch3.d0(r6)
            android.content.Context r6 = r5.a     // Catch: java.lang.Throwable -> L9e
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L9e
            r1 = 8
            java.util.List r6 = r6.getInstalledPackages(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L9e
            sw r1 = new sw     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L9e
            ik5 r6 = new ik5     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            r6.<init>(r3, r5)     // Catch: java.lang.Throwable -> L9e
            qu6 r6 = defpackage.yhf.m0(r1, r6)     // Catch: java.lang.Throwable -> L9e
            com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1 r1 = new com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            rj7 r3 = new rj7     // Catch: java.lang.Throwable -> L9e
            r3.<init>(r6, r2, r1)     // Catch: java.lang.Throwable -> L9e
            rl0 r6 = defpackage.rl0.d     // Catch: java.lang.Throwable -> L9e
            m2i r1 = new m2i     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r3, r6)     // Catch: java.lang.Throwable -> L9e
            l2i r6 = new l2i     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            r4 = r6
            r6 = r5
            r5 = r4
        L69:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9e
            android.content.Context r3 = r6.a     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L9e
            boolean r3 = defpackage.cqk.d(r1, r3)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L82
            goto L9b
        L82:
            r0.d = r6     // Catch: java.lang.Throwable -> L9e
            r0.e = r5     // Catch: java.lang.Throwable -> L9e
            r0.h = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r6.a(r1, r0)     // Catch: java.lang.Throwable -> L9e
            hu4 r3 = defpackage.hu4.a
            if (r1 != r3) goto L91
            return r3
        L91:
            r4 = r1
            r1 = r6
            r6 = r4
        L94:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L9e
            if (r6 == 0) goto L99
            return r6
        L99:
            r6 = r1
            goto L69
        L9b:
            java.lang.String r5 = ""
            return r5
        L9e:
            r5 = move-exception
            poe r6 = new poe
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource.mo15getDeviceIdIoAF18A(lq4):java.lang.Object");
    }
}
