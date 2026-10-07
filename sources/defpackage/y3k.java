package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class y3k {
    public final p25 a;
    public final xde b;
    public final ewe c;
    public final rai d;
    public final xde e;
    public final xtj f;
    public final AnalyticsSender g;
    public final AnalyticsTimingsStore h;
    public final n7k i;
    public final LinkedList j = new LinkedList();
    public final l9b k = new l9b();
    public final Logger l;

    public y3k(p25 p25Var, xde xdeVar, ewe eweVar, rai raiVar, xde xdeVar2, xtj xtjVar, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore, n7k n7kVar, Logger logger) {
        this.a = p25Var;
        this.b = xdeVar;
        this.c = eweVar;
        this.d = raiVar;
        this.e = xdeVar2;
        this.f = xtjVar;
        this.g = analyticsSender;
        this.h = analyticsTimingsStore;
        this.i = n7kVar;
        this.l = logger.createLogger("SubscribeComponent");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        x2k x2kVar;
        Object objJ;
        if (nq4Var instanceof x2k) {
            x2kVar = (x2k) nq4Var;
            int i = x2kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2kVar.g = i - Integer.MIN_VALUE;
            } else {
                x2kVar = new x2k(this, nq4Var);
            }
        } else {
            x2kVar = new x2k(this, nq4Var);
        }
        Object obj = x2kVar.e;
        int i2 = x2kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            Logger.DefaultImpls.info$default(this.l, "Get current push token", null, 2, null);
            x2kVar.d = this;
            x2kVar.g = 1;
            objJ = this.b.j(x2kVar);
            hu4 hu4Var = hu4.a;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = x2kVar.d;
            ch3.d0(obj);
            objJ = ((m4k) obj).a;
        }
        String str = (String) objJ;
        if (r5h.X0(str)) {
            Logger.DefaultImpls.warn$default(this.l, "No saved push token found", null, 2, null);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fjh fjhVar, nq4 nq4Var) {
        u2k u2kVar;
        y3k y3kVar;
        String str;
        Object obj;
        if (nq4Var instanceof u2k) {
            u2kVar = (u2k) nq4Var;
            int i = u2kVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2kVar.i = i - Integer.MIN_VALUE;
            } else {
                u2kVar = new u2k(this, nq4Var);
            }
        } else {
            u2kVar = new u2k(this, nq4Var);
        }
        Object objA = u2kVar.g;
        int i2 = u2kVar.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            Logger.DefaultImpls.warn$default(this.l, "Deletion current push token", null, 2, null);
            u2kVar.d = this;
            u2kVar.e = fjhVar;
            u2kVar.i = 1;
            objA = a(u2kVar);
            if (objA != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            fjhVar = u2kVar.e;
            this = u2kVar.d;
            ch3.d0(objA);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = u2kVar.f;
            fjhVar = u2kVar.e;
            y3kVar = u2kVar.d;
            ch3.d0(objA);
            obj = ((roe) objA).a;
        }
        if (obj instanceof poe) {
            RuntimeException runtimeException = new RuntimeException("Push token deletion failed", roe.a(obj));
            Logger.DefaultImpls.warn$default(y3kVar.l, "Push token deletion failed", null, 2, null);
            fjhVar.a(runtimeException);
            return sbiVar;
        }
        Logger.DefaultImpls.info$default(y3kVar.l, "Push token successfully deleted", null, 2, null);
        y3kVar.g.send(new m9k(str, 1));
        fjhVar.b(sbiVar);
        return sbiVar;
        String str2 = (String) objA;
        if (r5h.X0(str2)) {
            Logger.DefaultImpls.warn$default(this.l, "No saved push token to delete", null, 2, null);
            fjhVar.a(new IllegalStateException("No saved push token to delete"));
            return sbiVar;
        }
        xde xdeVar = this.b;
        u2kVar.d = this;
        u2kVar.e = fjhVar;
        u2kVar.f = str2;
        u2kVar.i = 2;
        Object objL = xdeVar.l(str2, u2kVar);
        if (objL != hu4Var) {
            y3kVar = this;
            str = str2;
            obj = objL;
            if (obj instanceof poe) {
                Logger.DefaultImpls.info$default(y3kVar.l, "Push token successfully deleted", null, 2, null);
                y3kVar.g.send(new m9k(str, 1));
                fjhVar.b(sbiVar);
                return sbiVar;
            }
            RuntimeException runtimeException2 = new RuntimeException("Push token deletion failed", roe.a(obj));
            Logger.DefaultImpls.warn$default(y3kVar.l, "Push token deletion failed", null, 2, null);
            fjhVar.a(runtimeException2);
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r7.h(r8, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r8, defpackage.nq4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.a3k
            if (r0 == 0) goto L13
            r0 = r9
            a3k r0 = (defpackage.a3k) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a3k r0 = new a3k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            r2 = 1
            r3 = 2
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L33
            if (r1 != r3) goto L2d
            boolean r7 = r0.f
            defpackage.ch3.d0(r9)
            goto L77
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r4
        L33:
            java.lang.String r8 = r0.e
            y3k r7 = r0.d
            defpackage.ch3.d0(r9)
            goto L5f
        L3b:
            defpackage.ch3.d0(r9)
            com.vk.push.common.Logger r9 = r7.l
            java.lang.String r1 = "Saving new push token to the storage"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r1, r4, r3, r4)
            r0.d = r7
            r0.e = r8
            r0.i = r2
            xde r9 = r7.b
            java.lang.Object r1 = r9.e
            lb5 r1 = (defpackage.lb5) r1
            oli r2 = new oli
            r6 = 24
            r2.<init>(r9, r8, r4, r6)
            java.lang.Object r9 = defpackage.yab.K0(r1, r2, r0)
            if (r9 != r5) goto L5f
            goto L75
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L76
            r0.d = r4
            r0.e = r4
            r0.f = r9
            r0.i = r3
            java.lang.Object r7 = r7.h(r8, r0)
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            r7 = r9
        L77:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3k.c(java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, Object obj, nq4 nq4Var) {
        h3k h3kVar;
        String str2;
        AnalyticsSender analyticsSender;
        long j;
        if (nq4Var instanceof h3k) {
            h3kVar = (h3k) nq4Var;
            int i = h3kVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                h3kVar.j = i - Integer.MIN_VALUE;
            } else {
                h3kVar = new h3k(this, nq4Var);
            }
        } else {
            h3kVar = new h3k(this, nq4Var);
        }
        Object obj2 = h3kVar.h;
        int i2 = h3kVar.j;
        if (i2 == 0) {
            ch3.d0(obj2);
            long timePassed = this.h.getTimePassed(c4k.class);
            AnalyticsSender analyticsSender2 = this.g;
            h3kVar.d = analyticsSender2;
            h3kVar.e = str;
            h3kVar.f = obj;
            h3kVar.g = timePassed;
            h3kVar.j = 1;
            Object objE = this.i.e(h3kVar);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
                return hu4Var;
            }
            str2 = str;
            analyticsSender = analyticsSender2;
            j = timePassed;
            obj2 = objE;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = h3kVar.g;
            obj = h3kVar.f;
            String str3 = h3kVar.e;
            analyticsSender = h3kVar.d;
            ch3.d0(obj2);
            j = j2;
            str2 = str3;
        }
        analyticsSender.send(new hdk(str2, j, obj, ((AppInfo) obj2).getPackageName()));
        return sbi.a;
    }

    public final void e(Throwable th) {
        sbi sbiVar;
        synchronized (this.j) {
            do {
                fjh fjhVar = (fjh) this.j.poll();
                if (fjhVar != null) {
                    fjhVar.a(th);
                    sbiVar = sbi.a;
                } else {
                    sbiVar = null;
                }
            } while (sbiVar != null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        d3k d3kVar;
        Object objJ;
        if (nq4Var instanceof d3k) {
            d3kVar = (d3k) nq4Var;
            int i = d3kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3kVar.g = i - Integer.MIN_VALUE;
            } else {
                d3kVar = new d3k(this, nq4Var);
            }
        } else {
            d3kVar = new d3k(this, nq4Var);
        }
        Object obj = d3kVar.e;
        int i2 = d3kVar.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            Logger.DefaultImpls.info$default(this.l, "Calling register for pushes", null, 2, null);
            d3kVar.d = this;
            d3kVar.g = 1;
            objJ = this.b.j(d3kVar);
            if (objJ != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = d3kVar.d;
        ch3.d0(obj);
        objJ = ((m4k) obj).a;
        String str = (String) objJ;
        if (!r5h.X0(str)) {
            d3kVar.d = null;
            d3kVar.g = 3;
            if (this.h(str, d3kVar) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        Logger.DefaultImpls.warn$default(this.l, "No saved push token found.", null, 2, null);
        fjh fjhVar = new fjh(new ljh());
        d3kVar.d = null;
        d3kVar.g = 2;
        if (this.g(fjhVar, d3kVar) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01dc A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: Exception -> 0x016b, PHI: r9 r11
  0x00b5: PHI (r9v14 'this' y3k) = (r9v12 'this' y3k), (r9v15 'this' y3k) binds: [B:47:0x00b1, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:47:0x00b1, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:13:0x002f, B:19:0x0046, B:22:0x0054, B:53:0x00e4, B:55:0x00fc, B:57:0x0102, B:58:0x0109, B:60:0x0116), top: B:120:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:13:0x002f, B:19:0x0046, B:22:0x0054, B:53:0x00e4, B:55:0x00fc, B:57:0x0102, B:58:0x0109, B:60:0x0116), top: B:120:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116 A[Catch: Exception -> 0x01f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f0, blocks: (B:13:0x002f, B:19:0x0046, B:22:0x0054, B:53:0x00e4, B:55:0x00fc, B:57:0x0102, B:58:0x0109, B:60:0x0116), top: B:120:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147 A[Catch: Exception -> 0x016b, PHI: r9 r10
  0x0147: PHI (r9v27 'this' y3k) = (r9v24 'this' y3k), (r9v29 'this' y3k) binds: [B:63:0x0144, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0147: PHI (r10v19 java.lang.Object) = (r10v16 java.lang.Object), (r10v25 java.lang.Object) binds: [B:63:0x0144, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015d A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174 A[Catch: Exception -> 0x016b, TryCatch #2 {Exception -> 0x016b, blocks: (B:86:0x0197, B:88:0x019f, B:90:0x01b3, B:91:0x01bc, B:100:0x01d2, B:102:0x01d4, B:103:0x01d5, B:16:0x0039, B:65:0x0147, B:67:0x015d, B:71:0x0164, B:73:0x0168, B:80:0x0174, B:83:0x017b, B:104:0x01d6, B:106:0x01dc, B:107:0x01e3, B:62:0x0130, B:26:0x0062, B:49:0x00b5, B:29:0x0068, B:46:0x00a7, B:43:0x0098, B:92:0x01bd, B:94:0x01c7), top: B:120:0x0020, inners: #3 }] */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        if (r11 == r1) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.fjh r10, defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3k.g(fjh, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:52:0x0112, B:54:0x0118, B:22:0x0053, B:39:0x00bd, B:41:0x00c1, B:48:0x00fe, B:47:0x00fb, B:46:0x00e9, B:25:0x0065, B:35:0x00a9), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:52:0x0112, B:54:0x0118, B:22:0x0053, B:39:0x00bd, B:41:0x00c1, B:48:0x00fe, B:47:0x00fb, B:46:0x00e9, B:25:0x0065, B:35:0x00a9), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #1 {all -> 0x003e, blocks: (B:15:0x0039, B:52:0x0112, B:54:0x0118, B:22:0x0053, B:39:0x00bd, B:41:0x00c1, B:48:0x00fe, B:47:0x00fb, B:46:0x00e9, B:25:0x0065, B:35:0x00a9), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        if (r0.j(r15, r2) == r9) goto L50;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00c1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00e9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6, types: [xtj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [y3k] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [j9b] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [j9b] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [xde] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [y3k] */
    /* JADX WARN: Type inference failed for: r3v6, types: [y3k] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r14, defpackage.nq4 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3k.h(java.lang.String, nq4):java.lang.Object");
    }
}
