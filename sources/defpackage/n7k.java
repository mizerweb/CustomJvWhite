package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.utils.ResultExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n7k {
    public final PackageManagerDataSource a;
    public final r9k b;
    public final MasterHostApi c;
    public final g9i d;
    public final p25 e;
    public final AnalyticsSender f;
    public final Logger g;
    public final l9b h = new l9b();

    public n7k(PackageManagerDataSource packageManagerDataSource, xr8 xr8Var, r9k r9kVar, MasterHostApi masterHostApi, g9i g9iVar, p25 p25Var, AnalyticsSender analyticsSender, Logger logger) {
        this.a = packageManagerDataSource;
        this.b = r9kVar;
        this.c = masterHostApi;
        this.d = g9iVar;
        this.e = p25Var;
        this.f = analyticsSender;
        this.g = logger.createLogger(this);
    }

    public final AppInfo a(k6k k6kVar) {
        this.f.send(new i7k(new poe(k6kVar)));
        gik gikVar = dul.o;
        if (gikVar != null) {
            return gikVar.f;
        }
        ore.k("ConfigModule.init() must be called before accessing its members");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) throws Throwable {
        o6k o6kVar;
        l9b l9bVar;
        Throwable th;
        j9b j9bVar;
        if (nq4Var instanceof o6k) {
            o6kVar = (o6k) nq4Var;
            int i = o6kVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6kVar.h = i - Integer.MIN_VALUE;
            } else {
                o6kVar = new o6k(this, nq4Var);
            }
        } else {
            o6kVar = new o6k(this, nq4Var);
        }
        Object obj = o6kVar.f;
        int i2 = o6kVar.h;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                o6kVar.d = this;
                l9bVar = this.h;
                o6kVar.e = l9bVar;
                o6kVar.h = 1;
                if (l9bVar.b(o6kVar) != hu4Var) {
                }
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar = (j9b) o6kVar.d;
                try {
                    ch3.d0(obj);
                    sbi sbiVar = sbi.a;
                    j9bVar.g(null);
                    return sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar.g(null);
                    throw th;
                }
            }
            l9b l9bVar2 = o6kVar.e;
            n7k n7kVar = (n7k) o6kVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            this = n7kVar;
            r9k r9kVar = this.b;
            o6kVar.d = l9bVar;
            o6kVar.e = null;
            o6kVar.h = 2;
            if (r9kVar.a(o6kVar) != hu4Var) {
                j9bVar = l9bVar;
                sbi sbiVar2 = sbi.a;
                j9bVar.g(null);
                return sbiVar2;
            }
            return hu4Var;
        } catch (Throwable th3) {
            l9b l9bVar3 = l9bVar;
            th = th3;
            j9bVar = l9bVar3;
            j9bVar.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(AppInfo appInfo, boolean z, nq4 nq4Var) {
        v6k v6kVar;
        if (nq4Var instanceof v6k) {
            v6kVar = (v6k) nq4Var;
            int i = v6kVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                v6kVar.i = i - Integer.MIN_VALUE;
            } else {
                v6kVar = new v6k(this, nq4Var);
            }
        } else {
            v6kVar = new v6k(this, nq4Var);
        }
        Object objWrite = v6kVar.g;
        int i2 = v6kVar.i;
        if (i2 == 0) {
            ch3.d0(objWrite);
            v6kVar.d = this;
            v6kVar.e = appInfo;
            v6kVar.f = z;
            v6kVar.i = 1;
            objWrite = this.b.a.write(new a9k(appInfo.getPackageName(), appInfo.getPubKey()), v6kVar);
            hu4 hu4Var = hu4.a;
            if (objWrite == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = v6kVar.f;
            appInfo = v6kVar.e;
            this = v6kVar.d;
            ch3.d0(objWrite);
        }
        boolean zBooleanValue = ((Boolean) objWrite).booleanValue();
        AnalyticsSender analyticsSender = this.f;
        if (zBooleanValue) {
            analyticsSender.send(new i7k(new a4k(appInfo.getPackageName(), z)));
        } else {
            analyticsSender.send(new i7k(new poe(d6k.a)));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, nq4 nq4Var) {
        r6k r6kVar;
        Object objM24getHostListgIAlus;
        if (nq4Var instanceof r6k) {
            r6kVar = (r6k) nq4Var;
            int i = r6kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6kVar.g = i - Integer.MIN_VALUE;
            } else {
                r6kVar = new r6k(this, nq4Var);
            }
        } else {
            r6kVar = new r6k(this, nq4Var);
        }
        Object obj = r6kVar.e;
        int i2 = r6kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            r6kVar.d = this;
            r6kVar.g = 1;
            objM24getHostListgIAlus = this.c.m24getHostListgIAlus(list, r6kVar);
            hu4 hu4Var = hu4.a;
            if (objM24getHostListgIAlus == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = r6kVar.d;
            ch3.d0(obj);
            objM24getHostListgIAlus = ((roe) obj).a;
        }
        Throwable thA = roe.a(objM24getHostListgIAlus);
        if (thA == null) {
            return objM24getHostListgIAlus;
        }
        this.g.warn("Unable to get host list. Will be used empty host list", thA);
        return r66.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e2 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x020d A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0225 A[Catch: all -> 0x01fe, TRY_ENTER, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x022f A[Catch: all -> 0x01fe, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0247 A[Catch: all -> 0x01fe, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0263 A[Catch: all -> 0x01fe, LOOP:1: B:124:0x025d->B:126:0x0263, LOOP_END, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x027e A[Catch: all -> 0x01fe, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x01fe, blocks: (B:99:0x01dc, B:101:0x01e2, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:111:0x021d, B:114:0x0225, B:115:0x0229, B:117:0x022f, B:121:0x0242, B:123:0x0247, B:124:0x025d, B:126:0x0263, B:127:0x0271, B:129:0x0276, B:132:0x027e, B:135:0x0288, B:142:0x0297), top: B:164:0x01dc, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0291  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b9 A[Catch: all -> 0x02b6, TRY_ENTER, TryCatch #3 {all -> 0x02b6, blocks: (B:45:0x00cc, B:47:0x00d7, B:151:0x02b9, B:152:0x02c0), top: B:160:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[Catch: all -> 0x02b6, TRY_LEAVE, TryCatch #3 {all -> 0x02b6, blocks: (B:45:0x00cc, B:47:0x00d7, B:151:0x02b9, B:152:0x02c0), top: B:160:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[DONT_INVERT, PHI: r2 r6 r11
  0x0113: PHI (r2v16 ??) = (r2v36 ??), (r2v37 ??), (r2v38 ??) binds: [B:52:0x00fe, B:54:0x010f, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r6v7 n7k) = (r6v4 n7k), (r6v4 n7k), (r6v9 n7k) binds: [B:52:0x00fe, B:54:0x010f, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r11v15 com.vk.push.common.AppInfo) = (r11v12 com.vk.push.common.AppInfo), (r11v12 com.vk.push.common.AppInfo), (r11v19 com.vk.push.common.AppInfo) binds: [B:52:0x00fe, B:54:0x010f, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0097, blocks: (B:34:0x0092, B:57:0x0115, B:60:0x0120), top: B:161:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0120 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0097, blocks: (B:34:0x0092, B:57:0x0115, B:60:0x0120), top: B:161:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #1 {all -> 0x0083, blocks: (B:29:0x007e, B:64:0x0135, B:68:0x013d, B:70:0x0149, B:73:0x015a), top: B:157:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:29:0x007e, B:64:0x0135, B:68:0x013d, B:70:0x0149, B:73:0x015a), top: B:157:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015a A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:29:0x007e, B:64:0x0135, B:68:0x013d, B:70:0x0149, B:73:0x015a), top: B:157:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177 A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184 A[Catch: all -> 0x02b1, TRY_ENTER, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x018a A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7 A[Catch: all -> 0x02b1, TRY_ENTER, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01af A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c3 A[Catch: all -> 0x02b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x02b1, blocks: (B:110:0x021a, B:128:0x0273, B:133:0x0284, B:26:0x0070, B:77:0x016f, B:79:0x0177, B:82:0x0184, B:84:0x018a, B:90:0x01a7, B:92:0x01af, B:95:0x01c3, B:39:0x00a7, B:51:0x00f8, B:53:0x0100), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [j9b] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lq4, nq4, t6k] */
    /* JADX WARN: Type inference failed for: r0v25, types: [j9b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v16, types: [r9k] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21, types: [j9b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27, types: [g9i] */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, l9b] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v9, types: [p25] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [j9b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [j9b] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, n7k] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [j9b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [j9b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r9k] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24, types: [j9b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, n7k] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [n7k] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object e(nq4 nq4Var) {
        ?? t6kVar;
        ?? r12;
        gik gikVar;
        AppInfo appInfo;
        Object objB;
        n7k n7kVar;
        AppInfo appInfo2;
        ?? r2;
        ?? r13;
        ?? r3;
        ?? r11;
        ?? r4;
        AppInfo appInfo3;
        List<String> initializedHostPackages;
        Object objD;
        ?? r7;
        ?? r5;
        List<String> list;
        List list2;
        AppInfo appInfo4;
        Object objB2;
        Object obj;
        AppInfo appInfo5;
        List list3;
        AppInfo appInfo6;
        ?? r0;
        ?? r6;
        ?? r8;
        ?? r9;
        String str;
        Iterator it;
        Object next;
        AppInfo appInfo7;
        ?? r1;
        ArrayList arrayList;
        Iterator it2;
        if (nq4Var instanceof t6k) {
            t6k t6kVar2 = (t6k) nq4Var;
            int i = t6kVar2.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6kVar2.j = i - Integer.MIN_VALUE;
                t6kVar = t6kVar2;
            } else {
                t6kVar = new t6k(this, nq4Var);
            }
        } else {
            t6kVar = new t6k(this, nq4Var);
        }
        Object objC = t6kVar.h;
        hu4 hu4Var = hu4.a;
        ?? r10 = t6kVar.j;
        try {
            try {
                switch (r10) {
                    case 0:
                        ch3.d0(objC);
                        ?? r14 = this.h;
                        t6kVar.d = this;
                        t6kVar.e = r14;
                        t6kVar.j = 1;
                        Object objB3 = r14.b(t6kVar);
                        r12 = r14;
                        if (objB3 != hu4Var) {
                            try {
                                Logger.DefaultImpls.info$default(this.g, "getMasterHost started", null, 2, null);
                                gikVar = dul.o;
                                if (gikVar != null) {
                                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                                }
                                appInfo = (AppInfo) ww3.t1(gikVar.g);
                                ?? r15 = this.b;
                                t6kVar.d = this;
                                t6kVar.e = r12;
                                t6kVar.f = appInfo;
                                t6kVar.j = 2;
                                objB = r15.b(appInfo, t6kVar);
                                if (objB != hu4Var) {
                                    n7kVar = this;
                                    appInfo2 = appInfo;
                                    r2 = r12;
                                    objC = objB;
                                    r3 = r2;
                                    if (((Boolean) objC).booleanValue()) {
                                        r13 = n7kVar.e;
                                        t6kVar.d = n7kVar;
                                        t6kVar.e = r2;
                                        t6kVar.f = appInfo2;
                                        t6kVar.j = 3;
                                        if (r13.invoke(t6kVar) != hu4Var) {
                                            if (appInfo2 != null) {
                                                Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                                r3.g(null);
                                                return appInfo2;
                                            }
                                            ?? r16 = n7kVar.b;
                                            t6kVar.d = n7kVar;
                                            t6kVar.e = r3;
                                            t6kVar.f = null;
                                            t6kVar.j = 4;
                                            objC = r16.c(t6kVar);
                                            if (objC != hu4Var) {
                                                r11 = r3;
                                                r4 = n7kVar;
                                                appInfo3 = (AppInfo) objC;
                                                if (appInfo3 != null) {
                                                    r11.g(null);
                                                    return appInfo3;
                                                }
                                                initializedHostPackages = r4.a.getInitializedHostPackages();
                                                if (initializedHostPackages.isEmpty()) {
                                                    Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                                    AppInfo appInfoA = r4.a(g6k.a);
                                                    r11.g(null);
                                                    return appInfoA;
                                                }
                                                t6kVar.d = r4;
                                                t6kVar.e = r11;
                                                t6kVar.f = initializedHostPackages;
                                                t6kVar.j = 5;
                                                objD = r4.d(initializedHostPackages, t6kVar);
                                                if (objD != hu4Var) {
                                                    r7 = r4;
                                                    r5 = r11;
                                                    list = initializedHostPackages;
                                                    objC = objD;
                                                    list2 = (List) objC;
                                                    if (list2.isEmpty()) {
                                                        AppInfo appInfoA2 = r7.a(new e6k(list));
                                                        r5.g(null);
                                                        return appInfoA2;
                                                    }
                                                    if (list2.size() == 1) {
                                                        appInfo6 = (AppInfo) ww3.r1(list2);
                                                        t6kVar.d = r5;
                                                        t6kVar.e = appInfo6;
                                                        t6kVar.f = null;
                                                        t6kVar.j = 6;
                                                        if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                                            r0 = r5;
                                                            r0.g(null);
                                                            return appInfo6;
                                                        }
                                                    } else {
                                                        appInfo4 = (AppInfo) ww3.t1(list2);
                                                        if (appInfo4 == null) {
                                                            Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                                            AppInfo appInfoA3 = r7.a(new e6k(list));
                                                            r5.g(null);
                                                            return appInfoA3;
                                                        }
                                                        ?? r17 = r7.d;
                                                        t6kVar.d = r7;
                                                        t6kVar.e = r5;
                                                        t6kVar.f = list2;
                                                        t6kVar.g = appInfo4;
                                                        t6kVar.j = 7;
                                                        objB2 = r17.b(appInfo4, t6kVar);
                                                        if (objB2 != hu4Var) {
                                                            obj = objB2;
                                                            appInfo5 = appInfo4;
                                                            list3 = list2;
                                                            r9 = r5;
                                                            r8 = r7;
                                                            try {
                                                                if (!ResultExtensionsKt.isValid(obj)) {
                                                                    Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                                    AppInfo appInfoA4 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                                    r9.g(null);
                                                                    return appInfoA4;
                                                                }
                                                                try {
                                                                    ch3.d0(obj);
                                                                    str = (String) obj;
                                                                    if (str.length() == 0) {
                                                                        Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                                        AppInfo appInfoA5 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                                        r9.g(null);
                                                                        return appInfoA5;
                                                                    }
                                                                    it = list3.iterator();
                                                                    do {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                        } else {
                                                                            next = null;
                                                                        }
                                                                        appInfo7 = (AppInfo) next;
                                                                        if (appInfo7 == null) {
                                                                            Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                                            arrayList = new ArrayList(yw3.W0(list3, 10));
                                                                            it2 = list3.iterator();
                                                                            while (it2.hasNext()) {
                                                                                arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                                            }
                                                                            AppInfo appInfoA6 = r8.a(new f6k(str, arrayList));
                                                                            r9.g(null);
                                                                            return appInfoA6;
                                                                        }
                                                                        t6kVar.d = r9;
                                                                        t6kVar.e = appInfo7;
                                                                        t6kVar.f = null;
                                                                        t6kVar.g = null;
                                                                        t6kVar.j = 8;
                                                                        if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                                            r1 = r9;
                                                                            r1.g(null);
                                                                            return appInfo7;
                                                                        }
                                                                    } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                                                    appInfo7 = (AppInfo) next;
                                                                    if (appInfo7 == null) {
                                                                        Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                                        arrayList = new ArrayList(yw3.W0(list3, 10));
                                                                        it2 = list3.iterator();
                                                                        while (it2.hasNext()) {
                                                                            arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                                        }
                                                                        AppInfo appInfoA7 = r8.a(new f6k(str, arrayList));
                                                                        r9.g(null);
                                                                        return appInfoA7;
                                                                    }
                                                                    t6kVar.d = r9;
                                                                    t6kVar.e = appInfo7;
                                                                    t6kVar.f = null;
                                                                    t6kVar.g = null;
                                                                    t6kVar.j = 8;
                                                                    if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                                        r1 = r9;
                                                                        r1.g(null);
                                                                        return appInfo7;
                                                                    }
                                                                } catch (Exception e) {
                                                                    r8.g.error("Unable to get master from arbiter", e);
                                                                    AppInfo appInfoA8 = r8.a(new h6k(appInfo5.getPackageName(), e));
                                                                    r9.g(null);
                                                                    return appInfoA8;
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                r6 = r9;
                                                                r10 = r6;
                                                                r10.g(null);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (appInfo2 != null) {
                                            Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                            r3.g(null);
                                            return appInfo2;
                                        }
                                        ?? r18 = n7kVar.b;
                                        t6kVar.d = n7kVar;
                                        t6kVar.e = r3;
                                        t6kVar.f = null;
                                        t6kVar.j = 4;
                                        objC = r18.c(t6kVar);
                                        if (objC != hu4Var) {
                                            r11 = r3;
                                            r4 = n7kVar;
                                            appInfo3 = (AppInfo) objC;
                                            if (appInfo3 != null) {
                                                r11.g(null);
                                                return appInfo3;
                                            }
                                            initializedHostPackages = r4.a.getInitializedHostPackages();
                                            if (initializedHostPackages.isEmpty()) {
                                                Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                                AppInfo appInfoA9 = r4.a(g6k.a);
                                                r11.g(null);
                                                return appInfoA9;
                                            }
                                            t6kVar.d = r4;
                                            t6kVar.e = r11;
                                            t6kVar.f = initializedHostPackages;
                                            t6kVar.j = 5;
                                            objD = r4.d(initializedHostPackages, t6kVar);
                                            if (objD != hu4Var) {
                                                r7 = r4;
                                                r5 = r11;
                                                list = initializedHostPackages;
                                                objC = objD;
                                                list2 = (List) objC;
                                                if (list2.isEmpty()) {
                                                    AppInfo appInfoA10 = r7.a(new e6k(list));
                                                    r5.g(null);
                                                    return appInfoA10;
                                                }
                                                if (list2.size() == 1) {
                                                    appInfo6 = (AppInfo) ww3.r1(list2);
                                                    t6kVar.d = r5;
                                                    t6kVar.e = appInfo6;
                                                    t6kVar.f = null;
                                                    t6kVar.j = 6;
                                                    if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                                        r0 = r5;
                                                        r0.g(null);
                                                        return appInfo6;
                                                    }
                                                } else {
                                                    appInfo4 = (AppInfo) ww3.t1(list2);
                                                    if (appInfo4 == null) {
                                                        Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                                        AppInfo appInfoA11 = r7.a(new e6k(list));
                                                        r5.g(null);
                                                        return appInfoA11;
                                                    }
                                                    ?? r19 = r7.d;
                                                    t6kVar.d = r7;
                                                    t6kVar.e = r5;
                                                    t6kVar.f = list2;
                                                    t6kVar.g = appInfo4;
                                                    t6kVar.j = 7;
                                                    objB2 = r19.b(appInfo4, t6kVar);
                                                    if (objB2 != hu4Var) {
                                                        obj = objB2;
                                                        appInfo5 = appInfo4;
                                                        list3 = list2;
                                                        r9 = r5;
                                                        r8 = r7;
                                                        if (!ResultExtensionsKt.isValid(obj)) {
                                                            Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                            AppInfo appInfoA12 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                            r9.g(null);
                                                            return appInfoA12;
                                                        }
                                                        ch3.d0(obj);
                                                        str = (String) obj;
                                                        if (str.length() == 0) {
                                                            Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                            AppInfo appInfoA13 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                            r9.g(null);
                                                            return appInfoA13;
                                                        }
                                                        it = list3.iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = it.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            appInfo7 = (AppInfo) next;
                                                            if (appInfo7 == null) {
                                                                Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                                arrayList = new ArrayList(yw3.W0(list3, 10));
                                                                it2 = list3.iterator();
                                                                while (it2.hasNext()) {
                                                                    arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                                }
                                                                AppInfo appInfoA14 = r8.a(new f6k(str, arrayList));
                                                                r9.g(null);
                                                                return appInfoA14;
                                                            }
                                                            t6kVar.d = r9;
                                                            t6kVar.e = appInfo7;
                                                            t6kVar.f = null;
                                                            t6kVar.g = null;
                                                            t6kVar.j = 8;
                                                            if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                                r1 = r9;
                                                                r1.g(null);
                                                                return appInfo7;
                                                            }
                                                        } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                                        appInfo7 = (AppInfo) next;
                                                        if (appInfo7 == null) {
                                                            Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                            arrayList = new ArrayList(yw3.W0(list3, 10));
                                                            it2 = list3.iterator();
                                                            while (it2.hasNext()) {
                                                                arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                            }
                                                            AppInfo appInfoA15 = r8.a(new f6k(str, arrayList));
                                                            r9.g(null);
                                                            return appInfoA15;
                                                        }
                                                        t6kVar.d = r9;
                                                        t6kVar.e = appInfo7;
                                                        t6kVar.f = null;
                                                        t6kVar.g = null;
                                                        t6kVar.j = 8;
                                                        if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                            r1 = r9;
                                                            r1.g(null);
                                                            return appInfo7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                t6kVar = r12;
                                r10 = t6kVar;
                                r10.g(null);
                                throw th;
                            }
                        }
                        r3 = r2;
                        return hu4Var;
                    case 1:
                        j9b j9bVar = (j9b) t6kVar.e;
                        n7k n7kVar2 = (n7k) t6kVar.d;
                        ch3.d0(objC);
                        r12 = j9bVar;
                        this = n7kVar2;
                        Logger.DefaultImpls.info$default(this.g, "getMasterHost started", null, 2, null);
                        gikVar = dul.o;
                        if (gikVar != null) {
                            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                        }
                        appInfo = (AppInfo) ww3.t1(gikVar.g);
                        ?? r110 = this.b;
                        t6kVar.d = this;
                        t6kVar.e = r12;
                        t6kVar.f = appInfo;
                        t6kVar.j = 2;
                        objB = r110.b(appInfo, t6kVar);
                        if (objB != hu4Var) {
                            n7kVar = this;
                            appInfo2 = appInfo;
                            r2 = r12;
                            objC = objB;
                            r3 = r2;
                            if (((Boolean) objC).booleanValue()) {
                                r13 = n7kVar.e;
                                t6kVar.d = n7kVar;
                                t6kVar.e = r2;
                                t6kVar.f = appInfo2;
                                t6kVar.j = 3;
                                if (r13.invoke(t6kVar) != hu4Var) {
                                    if (appInfo2 != null) {
                                        Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                        r3.g(null);
                                        return appInfo2;
                                    }
                                    ?? r111 = n7kVar.b;
                                    t6kVar.d = n7kVar;
                                    t6kVar.e = r3;
                                    t6kVar.f = null;
                                    t6kVar.j = 4;
                                    objC = r111.c(t6kVar);
                                    if (objC != hu4Var) {
                                        r11 = r3;
                                        r4 = n7kVar;
                                        appInfo3 = (AppInfo) objC;
                                        if (appInfo3 != null) {
                                            r11.g(null);
                                            return appInfo3;
                                        }
                                        initializedHostPackages = r4.a.getInitializedHostPackages();
                                        if (initializedHostPackages.isEmpty()) {
                                            Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                            AppInfo appInfoA16 = r4.a(g6k.a);
                                            r11.g(null);
                                            return appInfoA16;
                                        }
                                        t6kVar.d = r4;
                                        t6kVar.e = r11;
                                        t6kVar.f = initializedHostPackages;
                                        t6kVar.j = 5;
                                        objD = r4.d(initializedHostPackages, t6kVar);
                                        if (objD != hu4Var) {
                                            r7 = r4;
                                            r5 = r11;
                                            list = initializedHostPackages;
                                            objC = objD;
                                            list2 = (List) objC;
                                            if (list2.isEmpty()) {
                                                AppInfo appInfoA17 = r7.a(new e6k(list));
                                                r5.g(null);
                                                return appInfoA17;
                                            }
                                            if (list2.size() == 1) {
                                                appInfo6 = (AppInfo) ww3.r1(list2);
                                                t6kVar.d = r5;
                                                t6kVar.e = appInfo6;
                                                t6kVar.f = null;
                                                t6kVar.j = 6;
                                                if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                                    r0 = r5;
                                                    r0.g(null);
                                                    return appInfo6;
                                                }
                                            } else {
                                                appInfo4 = (AppInfo) ww3.t1(list2);
                                                if (appInfo4 == null) {
                                                    Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                                    AppInfo appInfoA18 = r7.a(new e6k(list));
                                                    r5.g(null);
                                                    return appInfoA18;
                                                }
                                                ?? r112 = r7.d;
                                                t6kVar.d = r7;
                                                t6kVar.e = r5;
                                                t6kVar.f = list2;
                                                t6kVar.g = appInfo4;
                                                t6kVar.j = 7;
                                                objB2 = r112.b(appInfo4, t6kVar);
                                                if (objB2 != hu4Var) {
                                                    obj = objB2;
                                                    appInfo5 = appInfo4;
                                                    list3 = list2;
                                                    r9 = r5;
                                                    r8 = r7;
                                                    if (!ResultExtensionsKt.isValid(obj)) {
                                                        Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                        AppInfo appInfoA19 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                        r9.g(null);
                                                        return appInfoA19;
                                                    }
                                                    ch3.d0(obj);
                                                    str = (String) obj;
                                                    if (str.length() == 0) {
                                                        Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                        AppInfo appInfoA110 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                        r9.g(null);
                                                        return appInfoA110;
                                                    }
                                                    it = list3.iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        appInfo7 = (AppInfo) next;
                                                        if (appInfo7 == null) {
                                                            Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                            arrayList = new ArrayList(yw3.W0(list3, 10));
                                                            it2 = list3.iterator();
                                                            while (it2.hasNext()) {
                                                                arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                            }
                                                            AppInfo appInfoA111 = r8.a(new f6k(str, arrayList));
                                                            r9.g(null);
                                                            return appInfoA111;
                                                        }
                                                        t6kVar.d = r9;
                                                        t6kVar.e = appInfo7;
                                                        t6kVar.f = null;
                                                        t6kVar.g = null;
                                                        t6kVar.j = 8;
                                                        if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                            r1 = r9;
                                                            r1.g(null);
                                                            return appInfo7;
                                                        }
                                                    } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                                    appInfo7 = (AppInfo) next;
                                                    if (appInfo7 == null) {
                                                        Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                        arrayList = new ArrayList(yw3.W0(list3, 10));
                                                        it2 = list3.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                        }
                                                        AppInfo appInfoA112 = r8.a(new f6k(str, arrayList));
                                                        r9.g(null);
                                                        return appInfoA112;
                                                    }
                                                    t6kVar.d = r9;
                                                    t6kVar.e = appInfo7;
                                                    t6kVar.f = null;
                                                    t6kVar.g = null;
                                                    t6kVar.j = 8;
                                                    if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                        r1 = r9;
                                                        r1.g(null);
                                                        return appInfo7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (appInfo2 != null) {
                                    Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                    r3.g(null);
                                    return appInfo2;
                                }
                                ?? r113 = n7kVar.b;
                                t6kVar.d = n7kVar;
                                t6kVar.e = r3;
                                t6kVar.f = null;
                                t6kVar.j = 4;
                                objC = r113.c(t6kVar);
                                if (objC != hu4Var) {
                                    r11 = r3;
                                    r4 = n7kVar;
                                    appInfo3 = (AppInfo) objC;
                                    if (appInfo3 != null) {
                                        r11.g(null);
                                        return appInfo3;
                                    }
                                    initializedHostPackages = r4.a.getInitializedHostPackages();
                                    if (initializedHostPackages.isEmpty()) {
                                        Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                        AppInfo appInfoA113 = r4.a(g6k.a);
                                        r11.g(null);
                                        return appInfoA113;
                                    }
                                    t6kVar.d = r4;
                                    t6kVar.e = r11;
                                    t6kVar.f = initializedHostPackages;
                                    t6kVar.j = 5;
                                    objD = r4.d(initializedHostPackages, t6kVar);
                                    if (objD != hu4Var) {
                                        r7 = r4;
                                        r5 = r11;
                                        list = initializedHostPackages;
                                        objC = objD;
                                        list2 = (List) objC;
                                        if (list2.isEmpty()) {
                                            AppInfo appInfoA114 = r7.a(new e6k(list));
                                            r5.g(null);
                                            return appInfoA114;
                                        }
                                        if (list2.size() == 1) {
                                            appInfo6 = (AppInfo) ww3.r1(list2);
                                            t6kVar.d = r5;
                                            t6kVar.e = appInfo6;
                                            t6kVar.f = null;
                                            t6kVar.j = 6;
                                            if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                                r0 = r5;
                                                r0.g(null);
                                                return appInfo6;
                                            }
                                        } else {
                                            appInfo4 = (AppInfo) ww3.t1(list2);
                                            if (appInfo4 == null) {
                                                Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                                AppInfo appInfoA115 = r7.a(new e6k(list));
                                                r5.g(null);
                                                return appInfoA115;
                                            }
                                            ?? r114 = r7.d;
                                            t6kVar.d = r7;
                                            t6kVar.e = r5;
                                            t6kVar.f = list2;
                                            t6kVar.g = appInfo4;
                                            t6kVar.j = 7;
                                            objB2 = r114.b(appInfo4, t6kVar);
                                            if (objB2 != hu4Var) {
                                                obj = objB2;
                                                appInfo5 = appInfo4;
                                                list3 = list2;
                                                r9 = r5;
                                                r8 = r7;
                                                if (!ResultExtensionsKt.isValid(obj)) {
                                                    Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                    AppInfo appInfoA116 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                    r9.g(null);
                                                    return appInfoA116;
                                                }
                                                ch3.d0(obj);
                                                str = (String) obj;
                                                if (str.length() == 0) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                    AppInfo appInfoA117 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                    r9.g(null);
                                                    return appInfoA117;
                                                }
                                                it = list3.iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    appInfo7 = (AppInfo) next;
                                                    if (appInfo7 == null) {
                                                        Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                        arrayList = new ArrayList(yw3.W0(list3, 10));
                                                        it2 = list3.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                        }
                                                        AppInfo appInfoA118 = r8.a(new f6k(str, arrayList));
                                                        r9.g(null);
                                                        return appInfoA118;
                                                    }
                                                    t6kVar.d = r9;
                                                    t6kVar.e = appInfo7;
                                                    t6kVar.f = null;
                                                    t6kVar.g = null;
                                                    t6kVar.j = 8;
                                                    if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                        r1 = r9;
                                                        r1.g(null);
                                                        return appInfo7;
                                                    }
                                                } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                                appInfo7 = (AppInfo) next;
                                                if (appInfo7 == null) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                                    it2 = list3.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                    }
                                                    AppInfo appInfoA119 = r8.a(new f6k(str, arrayList));
                                                    r9.g(null);
                                                    return appInfoA119;
                                                }
                                                t6kVar.d = r9;
                                                t6kVar.e = appInfo7;
                                                t6kVar.f = null;
                                                t6kVar.g = null;
                                                t6kVar.j = 8;
                                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                    r1 = r9;
                                                    r1.g(null);
                                                    return appInfo7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        r3 = r2;
                        return hu4Var;
                    case 2:
                        appInfo2 = (AppInfo) t6kVar.f;
                        j9b j9bVar2 = (j9b) t6kVar.e;
                        n7kVar = (n7k) t6kVar.d;
                        ch3.d0(objC);
                        r2 = j9bVar2;
                        r3 = r2;
                        if (((Boolean) objC).booleanValue()) {
                            r13 = n7kVar.e;
                            t6kVar.d = n7kVar;
                            t6kVar.e = r2;
                            t6kVar.f = appInfo2;
                            t6kVar.j = 3;
                            if (r13.invoke(t6kVar) != hu4Var) {
                                if (appInfo2 != null) {
                                    Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                    r3.g(null);
                                    return appInfo2;
                                }
                                ?? r115 = n7kVar.b;
                                t6kVar.d = n7kVar;
                                t6kVar.e = r3;
                                t6kVar.f = null;
                                t6kVar.j = 4;
                                objC = r115.c(t6kVar);
                                if (objC != hu4Var) {
                                    r11 = r3;
                                    r4 = n7kVar;
                                    appInfo3 = (AppInfo) objC;
                                    if (appInfo3 != null) {
                                        r11.g(null);
                                        return appInfo3;
                                    }
                                    initializedHostPackages = r4.a.getInitializedHostPackages();
                                    if (initializedHostPackages.isEmpty()) {
                                        Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                        AppInfo appInfoA1110 = r4.a(g6k.a);
                                        r11.g(null);
                                        return appInfoA1110;
                                    }
                                    t6kVar.d = r4;
                                    t6kVar.e = r11;
                                    t6kVar.f = initializedHostPackages;
                                    t6kVar.j = 5;
                                    objD = r4.d(initializedHostPackages, t6kVar);
                                    if (objD != hu4Var) {
                                        r7 = r4;
                                        r5 = r11;
                                        list = initializedHostPackages;
                                        objC = objD;
                                        list2 = (List) objC;
                                        if (list2.isEmpty()) {
                                            AppInfo appInfoA1111 = r7.a(new e6k(list));
                                            r5.g(null);
                                            return appInfoA1111;
                                        }
                                        if (list2.size() == 1) {
                                            appInfo6 = (AppInfo) ww3.r1(list2);
                                            t6kVar.d = r5;
                                            t6kVar.e = appInfo6;
                                            t6kVar.f = null;
                                            t6kVar.j = 6;
                                            if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                                r0 = r5;
                                                r0.g(null);
                                                return appInfo6;
                                            }
                                        } else {
                                            appInfo4 = (AppInfo) ww3.t1(list2);
                                            if (appInfo4 == null) {
                                                Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                                AppInfo appInfoA1112 = r7.a(new e6k(list));
                                                r5.g(null);
                                                return appInfoA1112;
                                            }
                                            ?? r116 = r7.d;
                                            t6kVar.d = r7;
                                            t6kVar.e = r5;
                                            t6kVar.f = list2;
                                            t6kVar.g = appInfo4;
                                            t6kVar.j = 7;
                                            objB2 = r116.b(appInfo4, t6kVar);
                                            if (objB2 != hu4Var) {
                                                obj = objB2;
                                                appInfo5 = appInfo4;
                                                list3 = list2;
                                                r9 = r5;
                                                r8 = r7;
                                                if (!ResultExtensionsKt.isValid(obj)) {
                                                    Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                    AppInfo appInfoA1113 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                    r9.g(null);
                                                    return appInfoA1113;
                                                }
                                                ch3.d0(obj);
                                                str = (String) obj;
                                                if (str.length() == 0) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                    AppInfo appInfoA1114 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                    r9.g(null);
                                                    return appInfoA1114;
                                                }
                                                it = list3.iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                    } else {
                                                        next = null;
                                                    }
                                                    appInfo7 = (AppInfo) next;
                                                    if (appInfo7 == null) {
                                                        Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                        arrayList = new ArrayList(yw3.W0(list3, 10));
                                                        it2 = list3.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                        }
                                                        AppInfo appInfoA1115 = r8.a(new f6k(str, arrayList));
                                                        r9.g(null);
                                                        return appInfoA1115;
                                                    }
                                                    t6kVar.d = r9;
                                                    t6kVar.e = appInfo7;
                                                    t6kVar.f = null;
                                                    t6kVar.g = null;
                                                    t6kVar.j = 8;
                                                    if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                        r1 = r9;
                                                        r1.g(null);
                                                        return appInfo7;
                                                    }
                                                } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                                appInfo7 = (AppInfo) next;
                                                if (appInfo7 == null) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                                    it2 = list3.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                    }
                                                    AppInfo appInfoA1116 = r8.a(new f6k(str, arrayList));
                                                    r9.g(null);
                                                    return appInfoA1116;
                                                }
                                                t6kVar.d = r9;
                                                t6kVar.e = appInfo7;
                                                t6kVar.f = null;
                                                t6kVar.g = null;
                                                t6kVar.j = 8;
                                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                    r1 = r9;
                                                    r1.g(null);
                                                    return appInfo7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (appInfo2 != null) {
                                Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                r3.g(null);
                                return appInfo2;
                            }
                            ?? r117 = n7kVar.b;
                            t6kVar.d = n7kVar;
                            t6kVar.e = r3;
                            t6kVar.f = null;
                            t6kVar.j = 4;
                            objC = r117.c(t6kVar);
                            if (objC != hu4Var) {
                                r11 = r3;
                                r4 = n7kVar;
                                appInfo3 = (AppInfo) objC;
                                if (appInfo3 != null) {
                                    r11.g(null);
                                    return appInfo3;
                                }
                                initializedHostPackages = r4.a.getInitializedHostPackages();
                                if (initializedHostPackages.isEmpty()) {
                                    Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                    AppInfo appInfoA1117 = r4.a(g6k.a);
                                    r11.g(null);
                                    return appInfoA1117;
                                }
                                t6kVar.d = r4;
                                t6kVar.e = r11;
                                t6kVar.f = initializedHostPackages;
                                t6kVar.j = 5;
                                objD = r4.d(initializedHostPackages, t6kVar);
                                if (objD != hu4Var) {
                                    r7 = r4;
                                    r5 = r11;
                                    list = initializedHostPackages;
                                    objC = objD;
                                    list2 = (List) objC;
                                    if (list2.isEmpty()) {
                                        AppInfo appInfoA1118 = r7.a(new e6k(list));
                                        r5.g(null);
                                        return appInfoA1118;
                                    }
                                    if (list2.size() == 1) {
                                        appInfo6 = (AppInfo) ww3.r1(list2);
                                        t6kVar.d = r5;
                                        t6kVar.e = appInfo6;
                                        t6kVar.f = null;
                                        t6kVar.j = 6;
                                        if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                            r0 = r5;
                                            r0.g(null);
                                            return appInfo6;
                                        }
                                    } else {
                                        appInfo4 = (AppInfo) ww3.t1(list2);
                                        if (appInfo4 == null) {
                                            Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                            AppInfo appInfoA1119 = r7.a(new e6k(list));
                                            r5.g(null);
                                            return appInfoA1119;
                                        }
                                        ?? r118 = r7.d;
                                        t6kVar.d = r7;
                                        t6kVar.e = r5;
                                        t6kVar.f = list2;
                                        t6kVar.g = appInfo4;
                                        t6kVar.j = 7;
                                        objB2 = r118.b(appInfo4, t6kVar);
                                        if (objB2 != hu4Var) {
                                            obj = objB2;
                                            appInfo5 = appInfo4;
                                            list3 = list2;
                                            r9 = r5;
                                            r8 = r7;
                                            if (!ResultExtensionsKt.isValid(obj)) {
                                                Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                AppInfo appInfoA11110 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                r9.g(null);
                                                return appInfoA11110;
                                            }
                                            ch3.d0(obj);
                                            str = (String) obj;
                                            if (str.length() == 0) {
                                                Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                AppInfo appInfoA11111 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                r9.g(null);
                                                return appInfoA11111;
                                            }
                                            it = list3.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = null;
                                                }
                                                appInfo7 = (AppInfo) next;
                                                if (appInfo7 == null) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                                    it2 = list3.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                    }
                                                    AppInfo appInfoA11112 = r8.a(new f6k(str, arrayList));
                                                    r9.g(null);
                                                    return appInfoA11112;
                                                }
                                                t6kVar.d = r9;
                                                t6kVar.e = appInfo7;
                                                t6kVar.f = null;
                                                t6kVar.g = null;
                                                t6kVar.j = 8;
                                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                    r1 = r9;
                                                    r1.g(null);
                                                    return appInfo7;
                                                }
                                            } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                            appInfo7 = (AppInfo) next;
                                            if (appInfo7 == null) {
                                                Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                arrayList = new ArrayList(yw3.W0(list3, 10));
                                                it2 = list3.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                }
                                                AppInfo appInfoA11113 = r8.a(new f6k(str, arrayList));
                                                r9.g(null);
                                                return appInfoA11113;
                                            }
                                            t6kVar.d = r9;
                                            t6kVar.e = appInfo7;
                                            t6kVar.f = null;
                                            t6kVar.g = null;
                                            t6kVar.j = 8;
                                            if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                r1 = r9;
                                                r1.g(null);
                                                return appInfo7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        r3 = r2;
                        return hu4Var;
                    case 3:
                        appInfo2 = (AppInfo) t6kVar.f;
                        j9b j9bVar3 = (j9b) t6kVar.e;
                        n7kVar = (n7k) t6kVar.d;
                        try {
                            ch3.d0(objC);
                            r3 = j9bVar3;
                            if (appInfo2 != null) {
                                Logger.DefaultImpls.warn$default(n7kVar.g, "Default host is not null", null, 2, null);
                                r3.g(null);
                                return appInfo2;
                            }
                            ?? r119 = n7kVar.b;
                            t6kVar.d = n7kVar;
                            t6kVar.e = r3;
                            t6kVar.f = null;
                            t6kVar.j = 4;
                            objC = r119.c(t6kVar);
                            if (objC != hu4Var) {
                                r11 = r3;
                                r4 = n7kVar;
                                appInfo3 = (AppInfo) objC;
                                if (appInfo3 != null) {
                                    r11.g(null);
                                    return appInfo3;
                                }
                                initializedHostPackages = r4.a.getInitializedHostPackages();
                                if (initializedHostPackages.isEmpty()) {
                                    Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                    AppInfo appInfoA11114 = r4.a(g6k.a);
                                    r11.g(null);
                                    return appInfoA11114;
                                }
                                t6kVar.d = r4;
                                t6kVar.e = r11;
                                t6kVar.f = initializedHostPackages;
                                t6kVar.j = 5;
                                objD = r4.d(initializedHostPackages, t6kVar);
                                if (objD != hu4Var) {
                                    r7 = r4;
                                    r5 = r11;
                                    list = initializedHostPackages;
                                    objC = objD;
                                    list2 = (List) objC;
                                    if (list2.isEmpty()) {
                                        AppInfo appInfoA11115 = r7.a(new e6k(list));
                                        r5.g(null);
                                        return appInfoA11115;
                                    }
                                    if (list2.size() == 1) {
                                        appInfo6 = (AppInfo) ww3.r1(list2);
                                        t6kVar.d = r5;
                                        t6kVar.e = appInfo6;
                                        t6kVar.f = null;
                                        t6kVar.j = 6;
                                        if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                            r0 = r5;
                                            r0.g(null);
                                            return appInfo6;
                                        }
                                    } else {
                                        appInfo4 = (AppInfo) ww3.t1(list2);
                                        if (appInfo4 == null) {
                                            Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                            AppInfo appInfoA11116 = r7.a(new e6k(list));
                                            r5.g(null);
                                            return appInfoA11116;
                                        }
                                        ?? r1110 = r7.d;
                                        t6kVar.d = r7;
                                        t6kVar.e = r5;
                                        t6kVar.f = list2;
                                        t6kVar.g = appInfo4;
                                        t6kVar.j = 7;
                                        objB2 = r1110.b(appInfo4, t6kVar);
                                        if (objB2 != hu4Var) {
                                            obj = objB2;
                                            appInfo5 = appInfo4;
                                            list3 = list2;
                                            r9 = r5;
                                            r8 = r7;
                                            if (!ResultExtensionsKt.isValid(obj)) {
                                                Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                                AppInfo appInfoA11117 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                                r9.g(null);
                                                return appInfoA11117;
                                            }
                                            ch3.d0(obj);
                                            str = (String) obj;
                                            if (str.length() == 0) {
                                                Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                                AppInfo appInfoA11118 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                                r9.g(null);
                                                return appInfoA11118;
                                            }
                                            it = list3.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = null;
                                                }
                                                appInfo7 = (AppInfo) next;
                                                if (appInfo7 == null) {
                                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                                    it2 = list3.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                    }
                                                    AppInfo appInfoA11119 = r8.a(new f6k(str, arrayList));
                                                    r9.g(null);
                                                    return appInfoA11119;
                                                }
                                                t6kVar.d = r9;
                                                t6kVar.e = appInfo7;
                                                t6kVar.f = null;
                                                t6kVar.g = null;
                                                t6kVar.j = 8;
                                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                    r1 = r9;
                                                    r1.g(null);
                                                    return appInfo7;
                                                }
                                            } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                            appInfo7 = (AppInfo) next;
                                            if (appInfo7 == null) {
                                                Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                arrayList = new ArrayList(yw3.W0(list3, 10));
                                                it2 = list3.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                }
                                                AppInfo appInfoA111110 = r8.a(new f6k(str, arrayList));
                                                r9.g(null);
                                                return appInfoA111110;
                                            }
                                            t6kVar.d = r9;
                                            t6kVar.e = appInfo7;
                                            t6kVar.f = null;
                                            t6kVar.g = null;
                                            t6kVar.j = 8;
                                            if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                r1 = r9;
                                                r1.g(null);
                                                return appInfo7;
                                            }
                                        }
                                    }
                                }
                            }
                            r3 = r2;
                            return hu4Var;
                        } catch (Throwable th3) {
                            th = th3;
                            t6kVar = j9bVar3;
                            r10 = t6kVar;
                            r10.g(null);
                            throw th;
                        }
                    case 4:
                        j9b j9bVar4 = (j9b) t6kVar.e;
                        n7k n7kVar3 = (n7k) t6kVar.d;
                        try {
                            ch3.d0(objC);
                            r4 = n7kVar3;
                            r11 = j9bVar4;
                            appInfo3 = (AppInfo) objC;
                            if (appInfo3 != null) {
                                r11.g(null);
                                return appInfo3;
                            }
                            initializedHostPackages = r4.a.getInitializedHostPackages();
                            if (initializedHostPackages.isEmpty()) {
                                Logger.DefaultImpls.warn$default(r4.g, "Empty packages list", null, 2, null);
                                AppInfo appInfoA111111 = r4.a(g6k.a);
                                r11.g(null);
                                return appInfoA111111;
                            }
                            t6kVar.d = r4;
                            t6kVar.e = r11;
                            t6kVar.f = initializedHostPackages;
                            t6kVar.j = 5;
                            objD = r4.d(initializedHostPackages, t6kVar);
                            if (objD != hu4Var) {
                                r7 = r4;
                                r5 = r11;
                                list = initializedHostPackages;
                                objC = objD;
                                list2 = (List) objC;
                                if (list2.isEmpty()) {
                                    AppInfo appInfoA111112 = r7.a(new e6k(list));
                                    r5.g(null);
                                    return appInfoA111112;
                                }
                                if (list2.size() == 1) {
                                    appInfo6 = (AppInfo) ww3.r1(list2);
                                    t6kVar.d = r5;
                                    t6kVar.e = appInfo6;
                                    t6kVar.f = null;
                                    t6kVar.j = 6;
                                    if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                        r0 = r5;
                                        r0.g(null);
                                        return appInfo6;
                                    }
                                } else {
                                    appInfo4 = (AppInfo) ww3.t1(list2);
                                    if (appInfo4 == null) {
                                        Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                        AppInfo appInfoA111113 = r7.a(new e6k(list));
                                        r5.g(null);
                                        return appInfoA111113;
                                    }
                                    ?? r1111 = r7.d;
                                    t6kVar.d = r7;
                                    t6kVar.e = r5;
                                    t6kVar.f = list2;
                                    t6kVar.g = appInfo4;
                                    t6kVar.j = 7;
                                    objB2 = r1111.b(appInfo4, t6kVar);
                                    if (objB2 != hu4Var) {
                                        obj = objB2;
                                        appInfo5 = appInfo4;
                                        list3 = list2;
                                        r9 = r5;
                                        r8 = r7;
                                        if (!ResultExtensionsKt.isValid(obj)) {
                                            Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                            AppInfo appInfoA111114 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                            r9.g(null);
                                            return appInfoA111114;
                                        }
                                        ch3.d0(obj);
                                        str = (String) obj;
                                        if (str.length() == 0) {
                                            Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                            AppInfo appInfoA111115 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                            r9.g(null);
                                            return appInfoA111115;
                                        }
                                        it = list3.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            appInfo7 = (AppInfo) next;
                                            if (appInfo7 == null) {
                                                Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                                arrayList = new ArrayList(yw3.W0(list3, 10));
                                                it2 = list3.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                }
                                                AppInfo appInfoA111116 = r8.a(new f6k(str, arrayList));
                                                r9.g(null);
                                                return appInfoA111116;
                                            }
                                            t6kVar.d = r9;
                                            t6kVar.e = appInfo7;
                                            t6kVar.f = null;
                                            t6kVar.g = null;
                                            t6kVar.j = 8;
                                            if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                                r1 = r9;
                                                r1.g(null);
                                                return appInfo7;
                                            }
                                        } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                        appInfo7 = (AppInfo) next;
                                        if (appInfo7 == null) {
                                            Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                            arrayList = new ArrayList(yw3.W0(list3, 10));
                                            it2 = list3.iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add(((AppInfo) it2.next()).getPackageName());
                                            }
                                            AppInfo appInfoA111117 = r8.a(new f6k(str, arrayList));
                                            r9.g(null);
                                            return appInfoA111117;
                                        }
                                        t6kVar.d = r9;
                                        t6kVar.e = appInfo7;
                                        t6kVar.f = null;
                                        t6kVar.g = null;
                                        t6kVar.j = 8;
                                        if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                            r1 = r9;
                                            r1.g(null);
                                            return appInfo7;
                                        }
                                    }
                                }
                            }
                            r3 = r2;
                            return hu4Var;
                        } catch (Throwable th4) {
                            r10 = j9bVar4;
                            th = th4;
                            r10.g(null);
                            throw th;
                        }
                    case 5:
                        list = (List) t6kVar.f;
                        j9b j9bVar5 = (j9b) t6kVar.e;
                        n7k n7kVar4 = (n7k) t6kVar.d;
                        ch3.d0(objC);
                        r7 = n7kVar4;
                        r5 = j9bVar5;
                        list2 = (List) objC;
                        if (list2.isEmpty()) {
                            AppInfo appInfoA111118 = r7.a(new e6k(list));
                            r5.g(null);
                            return appInfoA111118;
                        }
                        if (list2.size() == 1) {
                            appInfo6 = (AppInfo) ww3.r1(list2);
                            t6kVar.d = r5;
                            t6kVar.e = appInfo6;
                            t6kVar.f = null;
                            t6kVar.j = 6;
                            if (r7.c(appInfo6, false, t6kVar) != hu4Var) {
                                r0 = r5;
                                r0.g(null);
                                return appInfo6;
                            }
                        } else {
                            appInfo4 = (AppInfo) ww3.t1(list2);
                            if (appInfo4 == null) {
                                Logger.DefaultImpls.warn$default(r7.g, "Unable to get arbiter", null, 2, null);
                                AppInfo appInfoA111119 = r7.a(new e6k(list));
                                r5.g(null);
                                return appInfoA111119;
                            }
                            ?? r1112 = r7.d;
                            t6kVar.d = r7;
                            t6kVar.e = r5;
                            t6kVar.f = list2;
                            t6kVar.g = appInfo4;
                            t6kVar.j = 7;
                            objB2 = r1112.b(appInfo4, t6kVar);
                            if (objB2 != hu4Var) {
                                obj = objB2;
                                appInfo5 = appInfo4;
                                list3 = list2;
                                r9 = r5;
                                r8 = r7;
                                if (!ResultExtensionsKt.isValid(obj)) {
                                    Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                    AppInfo appInfoA1111110 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                    r9.g(null);
                                    return appInfoA1111110;
                                }
                                ch3.d0(obj);
                                str = (String) obj;
                                if (str.length() == 0) {
                                    Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                    AppInfo appInfoA1111111 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                    r9.g(null);
                                    return appInfoA1111111;
                                }
                                it = list3.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    appInfo7 = (AppInfo) next;
                                    if (appInfo7 == null) {
                                        Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                        arrayList = new ArrayList(yw3.W0(list3, 10));
                                        it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((AppInfo) it2.next()).getPackageName());
                                        }
                                        AppInfo appInfoA1111112 = r8.a(new f6k(str, arrayList));
                                        r9.g(null);
                                        return appInfoA1111112;
                                    }
                                    t6kVar.d = r9;
                                    t6kVar.e = appInfo7;
                                    t6kVar.f = null;
                                    t6kVar.g = null;
                                    t6kVar.j = 8;
                                    if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                        r1 = r9;
                                        r1.g(null);
                                        return appInfo7;
                                    }
                                } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                                appInfo7 = (AppInfo) next;
                                if (appInfo7 == null) {
                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                    }
                                    AppInfo appInfoA1111113 = r8.a(new f6k(str, arrayList));
                                    r9.g(null);
                                    return appInfoA1111113;
                                }
                                t6kVar.d = r9;
                                t6kVar.e = appInfo7;
                                t6kVar.f = null;
                                t6kVar.g = null;
                                t6kVar.j = 8;
                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                    r1 = r9;
                                    r1.g(null);
                                    return appInfo7;
                                }
                            }
                        }
                        r3 = r2;
                        return hu4Var;
                    case 6:
                        appInfo6 = (AppInfo) t6kVar.e;
                        j9b j9bVar6 = (j9b) t6kVar.d;
                        ch3.d0(objC);
                        r0 = j9bVar6;
                        r0.g(null);
                        return appInfo6;
                    case 7:
                        appInfo5 = t6kVar.g;
                        List list4 = (List) t6kVar.f;
                        r6 = (j9b) t6kVar.e;
                        n7k n7kVar5 = (n7k) t6kVar.d;
                        try {
                            ch3.d0(objC);
                            obj = ((roe) objC).a;
                            list3 = list4;
                            r9 = r6;
                            r8 = n7kVar5;
                            if (!ResultExtensionsKt.isValid(obj)) {
                                Logger.DefaultImpls.warn$default(r8.g, "Unable to get valid master from arbiter", null, 2, null);
                                AppInfo appInfoA1111114 = r8.a(new h6k(appInfo5.getPackageName(), roe.a(obj)));
                                r9.g(null);
                                return appInfoA1111114;
                            }
                            ch3.d0(obj);
                            str = (String) obj;
                            if (str.length() == 0) {
                                Logger.DefaultImpls.error$default(r8.g, "Master package is empty", null, 2, null);
                                AppInfo appInfoA1111115 = r8.a(new h6k(appInfo5.getPackageName(), null));
                                r9.g(null);
                                return appInfoA1111115;
                            }
                            it = list3.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                appInfo7 = (AppInfo) next;
                                if (appInfo7 == null) {
                                    Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                    arrayList = new ArrayList(yw3.W0(list3, 10));
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((AppInfo) it2.next()).getPackageName());
                                    }
                                    AppInfo appInfoA1111116 = r8.a(new f6k(str, arrayList));
                                    r9.g(null);
                                    return appInfoA1111116;
                                }
                                t6kVar.d = r9;
                                t6kVar.e = appInfo7;
                                t6kVar.f = null;
                                t6kVar.g = null;
                                t6kVar.j = 8;
                                if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                    r1 = r9;
                                    r1.g(null);
                                    return appInfo7;
                                }
                                r3 = r2;
                                return hu4Var;
                            } while (!cqk.d(((AppInfo) next).getPackageName(), str));
                            appInfo7 = (AppInfo) next;
                            if (appInfo7 == null) {
                                Logger.DefaultImpls.error$default(r8.g, "Master host is empty", null, 2, null);
                                arrayList = new ArrayList(yw3.W0(list3, 10));
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((AppInfo) it2.next()).getPackageName());
                                }
                                AppInfo appInfoA1111117 = r8.a(new f6k(str, arrayList));
                                r9.g(null);
                                return appInfoA1111117;
                            }
                            t6kVar.d = r9;
                            t6kVar.e = appInfo7;
                            t6kVar.f = null;
                            t6kVar.g = null;
                            t6kVar.j = 8;
                            if (r8.c(appInfo7, true, t6kVar) != hu4Var) {
                                r1 = r9;
                                r1.g(null);
                                return appInfo7;
                            }
                            r3 = r2;
                            return hu4Var;
                        } catch (Throwable th5) {
                            th = th5;
                            r10 = r6;
                            r10.g(null);
                            throw th;
                        }
                    case 8:
                        appInfo7 = (AppInfo) t6kVar.e;
                        j9b j9bVar7 = (j9b) t6kVar.d;
                        ch3.d0(objC);
                        r1 = j9bVar7;
                        r1.g(null);
                        return appInfo7;
                    default:
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
