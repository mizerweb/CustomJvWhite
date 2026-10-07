package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.core.filedatastore.FileDataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class r9k {
    public final FileDataStore a;
    public final FileDataStore b;

    public r9k(FileDataStore fileDataStore, FileDataStore fileDataStore2) {
        this.a = fileDataStore;
        this.b = fileDataStore2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.clear(r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.h9k
            if (r0 == 0) goto L13
            r0 = r7
            h9k r0 = (defpackage.h9k) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            h9k r0 = new h9k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r7)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L31:
            r9k r6 = r0.d
            defpackage.ch3.d0(r7)
            goto L47
        L37:
            defpackage.ch3.d0(r7)
            r0.d = r6
            r0.g = r4
            com.vk.push.core.filedatastore.FileDataStore r7 = r6.a
            java.lang.Object r7 = r7.clear(r0)
            if (r7 != r5) goto L47
            goto L53
        L47:
            com.vk.push.core.filedatastore.FileDataStore r6 = r6.b
            r0.d = r2
            r0.g = r3
            java.lang.Object r6 = r6.clear(r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9k.a(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(AppInfo appInfo, nq4 nq4Var) {
        k9k k9kVar;
        String str;
        boolean z;
        String str2;
        if (nq4Var instanceof k9k) {
            k9kVar = (k9k) nq4Var;
            int i = k9kVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                k9kVar.h = i - Integer.MIN_VALUE;
            } else {
                k9kVar = new k9k(this, nq4Var);
            }
        } else {
            k9kVar = new k9k(this, nq4Var);
        }
        Object obj = k9kVar.f;
        int i2 = k9kVar.h;
        boolean z2 = false;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            k9kVar.d = this;
            k9kVar.e = appInfo;
            k9kVar.h = 1;
            obj = this.b.read(k9kVar);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            appInfo = (AppInfo) k9kVar.e;
            this = (r9k) k9kVar.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) k9kVar.e;
            appInfo = (AppInfo) k9kVar.d;
            ch3.d0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        str = str2;
        z = zBooleanValue;
        if (!cqk.d(str, appInfo != null ? appInfo.getPackageName() : null) && z) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
        e9k e9kVar = (e9k) obj;
        str = e9kVar != null ? e9kVar.a : null;
        if (appInfo != null) {
            FileDataStore fileDataStore = this.b;
            e9k e9kVar2 = new e9k(appInfo.getPackageName());
            k9kVar.d = appInfo;
            k9kVar.e = str;
            k9kVar.h = 2;
            Object objWrite = fileDataStore.write(e9kVar2, k9kVar);
            if (objWrite != hu4Var) {
                String str3 = str;
                obj = objWrite;
                str2 = str3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                str = str2;
                z = zBooleanValue2;
            }
            return hu4Var;
        }
        z = false;
        if (!cqk.d(str, appInfo != null ? appInfo.getPackageName() : null)) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) {
        i9k i9kVar;
        if (nq4Var instanceof i9k) {
            i9kVar = (i9k) nq4Var;
            int i = i9kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i9kVar.f = i - Integer.MIN_VALUE;
            } else {
                i9kVar = new i9k(this, nq4Var);
            }
        } else {
            i9kVar = new i9k(this, nq4Var);
        }
        Object obj = i9kVar.d;
        int i2 = i9kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            i9kVar.f = 1;
            obj = this.a.read(i9kVar);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        a9k a9kVar = (a9k) obj;
        if (a9kVar != null) {
            return new AppInfo(a9kVar.a, a9kVar.b);
        }
        return null;
    }
}
