package defpackage;

import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.filedatastore.FileDataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class k4k {
    public final FeatureManager a;
    public final FileDataSource b;
    public volatile p2k c;
    public final l9b d = new l9b();

    public k4k(FeatureManager featureManager, FileDataSource fileDataSource) {
        this.a = featureManager;
        this.b = fileDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        s2k s2kVar;
        if (nq4Var instanceof s2k) {
            s2kVar = (s2k) nq4Var;
            int i = s2kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s2kVar.f = i - Integer.MIN_VALUE;
            } else {
                s2kVar = new s2k(this, nq4Var);
            }
        } else {
            s2kVar = new s2k(this, nq4Var);
        }
        Object objD = s2kVar.d;
        int i2 = s2kVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            s2kVar.f = 1;
            objD = d(s2kVar);
            Object obj = hu4.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        return ((p2k) objD).c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        v2k v2kVar;
        if (nq4Var instanceof v2k) {
            v2kVar = (v2k) nq4Var;
            int i = v2kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                v2kVar.f = i - Integer.MIN_VALUE;
            } else {
                v2kVar = new v2k(this, nq4Var);
            }
        } else {
            v2kVar = new v2k(this, nq4Var);
        }
        Object objD = v2kVar.d;
        int i2 = v2kVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            v2kVar.f = 1;
            objD = d(v2kVar);
            Object obj = hu4.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        return Boolean.valueOf(((p2k) objD).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r7.m19setDatagIAlus("false", r0) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r7 == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.nq4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.y2k
            if (r0 == 0) goto L13
            r0 = r8
            y2k r0 = (defpackage.y2k) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            y2k r0 = new y2k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L47
            if (r1 == r5) goto L41
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.ch3.d0(r8)
            roe r8 = (defpackage.roe) r8
            java.lang.Object r7 = r8.a
            goto L7a
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r4
        L38:
            defpackage.ch3.d0(r8)
            roe r8 = (defpackage.roe) r8
            r8.getClass()
            goto L6a
        L41:
            k4k r7 = r0.d
            defpackage.ch3.d0(r8)
            goto L55
        L47:
            defpackage.ch3.d0(r8)
            r0.d = r7
            r0.g = r5
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r6) goto L55
            goto L79
        L55:
            p2k r8 = (defpackage.p2k) r8
            boolean r8 = r8.b
            if (r8 == 0) goto L6d
            com.vk.push.core.filedatastore.FileDataSource r7 = r7.b
            r0.d = r4
            r0.g = r3
            java.lang.String r8 = "false"
            java.lang.Object r7 = r7.m19setDatagIAlus(r8, r0)
            if (r7 != r6) goto L6a
            goto L79
        L6a:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L6d:
            com.vk.push.core.filedatastore.FileDataSource r7 = r7.b
            r0.d = r4
            r0.g = r2
            java.lang.Object r7 = r7.m18getDataIoAF18A(r0)
            if (r7 != r6) goto L7a
        L79:
            return r6
        L7a:
            boolean r8 = r7 instanceof defpackage.poe
            if (r8 == 0) goto L7f
            goto L80
        L7f:
            r4 = r7
        L80:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L8b
            boolean r7 = java.lang.Boolean.parseBoolean(r4)
            if (r7 == 0) goto L8b
            goto L8c
        L8b:
            r5 = 0
        L8c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4k.c(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) throws Throwable {
        b3k b3kVar;
        j9b j9bVar;
        j9b j9bVar2;
        p2k p2kVar;
        k4k k4kVar;
        xr8 xr8Var;
        Object objB;
        p2k p2kVar2;
        if (nq4Var instanceof b3k) {
            b3kVar = (b3k) nq4Var;
            int i = b3kVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                b3kVar.i = i - Integer.MIN_VALUE;
            } else {
                b3kVar = new b3k(this, nq4Var);
            }
        } else {
            b3kVar = new b3k(this, nq4Var);
        }
        Object obj = b3kVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = b3kVar.i;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                p2k p2kVar3 = this.c;
                if (p2kVar3 != null) {
                    return p2kVar3;
                }
                j9bVar = this.d;
                b3kVar.d = this;
                b3kVar.e = j9bVar;
                b3kVar.i = 1;
                if (j9bVar.b(b3kVar) != hu4Var) {
                }
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xr8Var = b3kVar.f;
                j9bVar2 = b3kVar.e;
                k4kVar = b3kVar.d;
                try {
                    ch3.d0(obj);
                    xr8Var.getClass();
                    objB = xr8.b((String) obj);
                    p2kVar2 = p2k.e;
                    if (objB instanceof poe) {
                        objB = p2kVar2;
                    }
                    k4kVar.c = (p2k) objB;
                    p2kVar = (p2k) objB;
                    j9bVar = j9bVar2;
                    j9bVar.g(null);
                    return p2kVar;
                } catch (Throwable th) {
                    th = th;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            j9b j9bVar3 = b3kVar.e;
            k4k k4kVar2 = b3kVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            this = k4kVar2;
            p2kVar = this.c;
            if (p2kVar == null) {
                xr8 xr8Var2 = p2k.d;
                FeatureManager featureManager = this.a;
                Feature.StringFeature externalMasterHostAnalyticsConfig = CommonFeaturesKt.getExternalMasterHostAnalyticsConfig();
                b3kVar.d = this;
                b3kVar.e = j9bVar;
                b3kVar.f = xr8Var2;
                b3kVar.i = 2;
                Object featureValue = featureManager.getFeatureValue(externalMasterHostAnalyticsConfig, b3kVar);
                if (featureValue != hu4Var) {
                    j9bVar2 = j9bVar;
                    obj = featureValue;
                    k4kVar = this;
                    xr8Var = xr8Var2;
                    xr8Var.getClass();
                    objB = xr8.b((String) obj);
                    p2kVar2 = p2k.e;
                    if (objB instanceof poe) {
                        objB = p2kVar2;
                    }
                    k4kVar.c = (p2k) objB;
                    p2kVar = (p2k) objB;
                    j9bVar = j9bVar2;
                }
                return hu4Var;
            }
            j9bVar.g(null);
            return p2kVar;
        } catch (Throwable th2) {
            th = th2;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(nq4 nq4Var) {
        e3k e3kVar;
        if (nq4Var instanceof e3k) {
            e3kVar = (e3k) nq4Var;
            int i = e3kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                e3kVar.f = i - Integer.MIN_VALUE;
            } else {
                e3kVar = new e3k(this, nq4Var);
            }
        } else {
            e3kVar = new e3k(this, nq4Var);
        }
        Object obj = e3kVar.d;
        int i2 = e3kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            e3kVar.f = 1;
            Object objM19setDatagIAlus = this.b.m19setDatagIAlus("true", e3kVar);
            hu4 hu4Var = hu4.a;
            if (objM19setDatagIAlus == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            ((roe) obj).getClass();
        }
        return sbi.a;
    }
}
