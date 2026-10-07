package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class kzd {
    public final ifh a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String j;
    public final ifh k = new ifh(new tyd(3));

    public kzd(ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ha9 ha9Var) {
        this.a = ifhVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var7;
        this.h = ny8Var8;
        this.i = ny8Var6;
        this.j = zo5.p(kzd.class.getName(), "#", String.valueOf(ha9Var.a));
    }

    public final et3 a() {
        return (et3) this.c.getValue();
    }

    public final co6 b() {
        return (co6) this.k.getValue();
    }

    public final bzd c() {
        return (bzd) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object d(Map map, nq4 nq4Var) {
        hzd hzdVar;
        if (nq4Var instanceof hzd) {
            hzdVar = (hzd) nq4Var;
            int i = hzdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hzdVar.g = i - Integer.MIN_VALUE;
            } else {
                hzdVar = new hzd(this, nq4Var);
            }
        } else {
            hzdVar = new hzd(this, nq4Var);
        }
        hzd hzdVar2 = hzdVar;
        Object obj = hzdVar2.e;
        hu4 hu4Var = hu4.a;
        int i2 = hzdVar2.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                String str = this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "handlePush: deeplink", null);
                    }
                }
                String str2 = (String) map.get("uri");
                String str3 = (String) map.get("msg");
                String str4 = (String) map.get("title");
                String str5 = (String) map.get("imageUrl");
                bzd bzdVarC = c();
                hzdVar2.d = map;
                hzdVar2.g = 1;
                Object objB = bzdVarC.b(str2, str3, str4, str5, hzdVar2);
                this = objB;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = hzdVar2.d;
                ch3.d0(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gzd gzdVar = new gzd("onDeepLink: failed to parse deep link notification", th);
            gm0.V(this.j, gzdVar.getMessage(), gzdVar);
            this.c().d(map);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x0279  */
    /* JADX WARN: Code duplicated, block: B:138:0x0303  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:246:0x0512 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x0514 A[Catch: all -> 0x051b, TryCatch #12 {all -> 0x051b, blocks: (B:244:0x0508, B:247:0x0514, B:252:0x0529, B:254:0x0533, B:256:0x0540, B:258:0x054a, B:265:0x0565, B:267:0x056f, B:272:0x058e, B:274:0x0594, B:263:0x0558), top: B:409:0x0508 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0518 A[PHI: r0
  0x0518: PHI (r0v108 java.lang.String) = (r0v107 java.lang.String), (r0v142 java.lang.String) binds: [B:245:0x0510, B:247:0x0514] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:251:0x0527  */
    /* JADX WARN: Code duplicated, block: B:254:0x0533 A[Catch: all -> 0x051b, TryCatch #12 {all -> 0x051b, blocks: (B:244:0x0508, B:247:0x0514, B:252:0x0529, B:254:0x0533, B:256:0x0540, B:258:0x054a, B:265:0x0565, B:267:0x056f, B:272:0x058e, B:274:0x0594, B:263:0x0558), top: B:409:0x0508 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x053c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0556 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:263:0x0558 A[Catch: all -> 0x051b, TryCatch #12 {all -> 0x051b, blocks: (B:244:0x0508, B:247:0x0514, B:252:0x0529, B:254:0x0533, B:256:0x0540, B:258:0x054a, B:265:0x0565, B:267:0x056f, B:272:0x058e, B:274:0x0594, B:263:0x0558), top: B:409:0x0508 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x0561  */
    /* JADX WARN: Code duplicated, block: B:271:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:272:0x058e A[Catch: all -> 0x051b, TryCatch #12 {all -> 0x051b, blocks: (B:244:0x0508, B:247:0x0514, B:252:0x0529, B:254:0x0533, B:256:0x0540, B:258:0x054a, B:265:0x0565, B:267:0x056f, B:272:0x058e, B:274:0x0594, B:263:0x0558), top: B:409:0x0508 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:289:0x05e4 A[Catch: all -> 0x05c1, TryCatch #0 {all -> 0x05c1, blocks: (B:280:0x05b6, B:287:0x05d6, B:289:0x05e4, B:294:0x061a, B:295:0x0644), top: B:385:0x05b6 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0612  */
    /* JADX WARN: Code duplicated, block: B:293:0x0617  */
    /* JADX WARN: Code duplicated, block: B:295:0x0644 A[Catch: all -> 0x05c1, TRY_LEAVE, TryCatch #0 {all -> 0x05c1, blocks: (B:280:0x05b6, B:287:0x05d6, B:289:0x05e4, B:294:0x061a, B:295:0x0644), top: B:385:0x05b6 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x064a  */
    /* JADX WARN: Code duplicated, block: B:299:0x0668  */
    /* JADX WARN: Code duplicated, block: B:341:0x0779 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:346:0x0790 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:350:0x07a1 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:354:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:355:0x07ba A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:357:0x07db A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:360:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:362:0x07e6 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:365:0x07fa A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:370:0x0817 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0848 A[Catch: Exception -> 0x07e0, TryCatch #8 {Exception -> 0x07e0, blocks: (B:339:0x076f, B:341:0x0779, B:344:0x0781, B:346:0x0790, B:348:0x0796, B:350:0x07a1, B:352:0x07a7, B:355:0x07ba, B:357:0x07db, B:362:0x07e6, B:363:0x07e9, B:365:0x07fa, B:367:0x0800, B:368:0x080d, B:370:0x0817, B:372:0x081d, B:373:0x082a, B:375:0x0848, B:376:0x084d), top: B:401:0x076f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203 A[Catch: all -> 0x022b, TryCatch #6 {all -> 0x022b, blocks: (B:91:0x01e9, B:93:0x0203, B:96:0x020a, B:98:0x0210, B:99:0x0217), top: B:397:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0217 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #6 {all -> 0x022b, blocks: (B:91:0x01e9, B:93:0x0203, B:96:0x020a, B:98:0x0210, B:99:0x0217), top: B:397:0x01e9 }] */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x076a, code lost:
    
        if (f(r4, r14) == r4) goto L337;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.syd r55, defpackage.die r56, long r57, defpackage.nq4 r59) {
        /*
            Method dump skipped, instruction units count: 2160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzd.e(syd, die, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(Map map, nq4 nq4Var) {
        jzd jzdVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof jzd) {
            jzdVar = (jzd) nq4Var;
            int i = jzdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzdVar.g = i - Integer.MIN_VALUE;
            } else {
                jzdVar = new jzd(this, nq4Var);
            }
        } else {
            jzdVar = new jzd(this, nq4Var);
        }
        Object obj = jzdVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = jzdVar.g;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Map map2 = jzdVar.d;
                ch3.d0(obj);
                return sbiVar;
            }
            ch3.d0(obj);
            wn6 wn6VarE = b().e(map, ((s7f) a()).t());
            if (wn6VarE == null) {
                String str = this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onMessageRemoved: failed to parse " + map, null);
                        return sbiVar;
                    }
                }
            } else {
                bzd bzdVarC = c();
                jzdVar.d = map;
                jzdVar.g = 1;
                Object objE = bzdVarC.a().e(wn6VarE, jzdVar);
                if (objE != hu4Var) {
                    objE = sbiVar;
                }
                if (objE == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gzd gzdVar = new gzd("onMessageRemoved: failed to parse message remove notification", th);
            gm0.V(this.j, gzdVar.getMessage(), gzdVar);
            c().d(map);
            return sbiVar;
        }
    }
}
