package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.upload.cleanup.UploadsCleanupScheduler$UploadsCleanupWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class hki extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hki(bye byeVar, lq4 lq4Var, wec wecVar, sfe sfeVar, zui zuiVar, ewe eweVar, vfe vfeVar) {
        super(2, lq4Var);
        this.e = 5;
        this.h = byeVar;
        this.i = wecVar;
        this.j = sfeVar;
        this.k = zuiVar;
        this.l = eweVar;
        this.m = vfeVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00b4, please report this as an issue */
    private final Object l(Object obj) {
        sfe sfeVar;
        kli kliVar;
        bqg bqgVar;
        sfe sfeVar2;
        dqg dqgVar;
        l9b l9bVar;
        j9b j9bVar;
        bqg bqgVar2;
        dqg dqgVar2 = (dqg) this.k;
        bqg bqgVar3 = (bqg) this.m;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        if (i != 0) {
            if (i == 1) {
                dqg dqgVar3 = (dqg) this.j;
                kli kliVar2 = (kli) this.i;
                bqg bqgVar4 = (bqg) this.h;
                sfe sfeVar3 = (sfe) this.g;
                ch3.d0(obj);
                dqgVar = dqgVar3;
                sfeVar2 = sfeVar3;
                kliVar = kliVar2;
                bqgVar = bqgVar4;
            } else {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bqg bqgVar5 = (bqg) this.i;
                dqg dqgVar4 = (dqg) this.h;
                j9bVar = (j9b) this.g;
                ch3.d0(obj);
                bqgVar2 = bqgVar5;
                dqgVar2 = dqgVar4;
            }
            try {
                dqgVar2.e.add(bqgVar2);
                j9bVar.g(null);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + bqgVar3 + ", will be retried with a future UseCaseCamera");
                }
                return sbi.a;
            } catch (Throwable th) {
                j9bVar.g(null);
                throw th;
            }
        }
        ch3.d0(obj);
        sfeVar = new sfe();
        sfeVar.a = true;
        kli kliVar3 = dqgVar2.d;
        if (kliVar3 == null || cqk.d((kli) this.l, kliVar3)) {
            if (sfeVar.a) {
                l9bVar = dqgVar2.c;
                this.g = l9bVar;
                this.h = dqgVar2;
                this.i = bqgVar3;
                this.j = null;
                this.f = 2;
                if (l9bVar.b(this) != hu4Var) {
                    j9bVar = l9bVar;
                    bqgVar2 = bqgVar3;
                    dqgVar2.e.add(bqgVar2);
                    j9bVar.g(null);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + bqgVar3 + ", will be retried with a future UseCaseCamera");
                    }
                }
            }
            return sbi.a;
        }
        this.g = sfeVar;
        this.h = bqgVar3;
        this.i = kliVar3;
        this.j = dqgVar2;
        this.f = 1;
        Object objA = dqg.a(dqgVar2, bqgVar3, kliVar3, this);
        if (objA != hu4Var) {
            kliVar = kliVar3;
            bqgVar = bqgVar3;
            obj = objA;
            sfeVar2 = sfeVar;
            dqgVar = dqgVar2;
        }
        return hu4Var;
        tt4 tt4Var = (xf5) obj;
        dqgVar.getClass();
        ((up8) tt4Var).Y(new nb(dqgVar, tt4Var, bqgVar, kliVar, 7));
        sfeVar2.a = false;
        sfeVar = sfeVar2;
        if (sfeVar.a) {
            l9bVar = dqgVar2.c;
            this.g = l9bVar;
            this.h = dqgVar2;
            this.i = bqgVar3;
            this.j = null;
            this.f = 2;
            if (l9bVar.b(this) != hu4Var) {
                j9bVar = l9bVar;
                bqgVar2 = bqgVar3;
                dqgVar2.e.add(bqgVar2);
                j9bVar.g(null);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + bqgVar3 + ", will be retried with a future UseCaseCamera");
                }
            }
            return hu4Var;
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new hki((UploadsCleanupScheduler$UploadsCleanupWorker) this.k, (bhi) this.l, (AtomicInteger) obj2, (chi) this.j, lq4Var);
            case 1:
                int i2 = 1;
                hki hkiVar = new hki(i2, lq4Var, (Uri) this.k, (pl0) this.i, (b78) this.j, (String) this.l, (String) obj2);
                hkiVar.g = obj;
                return hkiVar;
            case 2:
                hki hkiVar2 = new hki((n23) this.h, (d70) this.i, (String) this.j, (File) this.k, (String) this.l, (a3j) obj2, lq4Var);
                hkiVar2.g = obj;
                return hkiVar2;
            case 3:
                return new hki((b95) this.k, (ha9) this.l, (sv1) obj2, lq4Var, 3);
            case 4:
                int i3 = 4;
                hki hkiVar3 = new hki(i3, lq4Var, (String) this.k, (wec) this.i, (File) this.j, (uhi) this.l, (wze) obj2);
                hkiVar3.g = obj;
                return hkiVar3;
            case 5:
                hki hkiVar4 = new hki((bye) this.h, lq4Var, (wec) this.i, (sfe) this.j, (zui) this.k, (ewe) this.l, (vfe) obj2);
                hkiVar4.g = obj;
                return hkiVar4;
            case 6:
                return new hki((dqg) this.k, (kli) this.l, (bqg) obj2, lq4Var, 6);
            default:
                return new hki((dqg) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((hki) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((hki) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((hki) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0322  */
    /* JADX WARN: Code duplicated, block: B:103:0x032a  */
    /* JADX WARN: Code duplicated, block: B:104:0x032d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0333  */
    /* JADX WARN: Code duplicated, block: B:108:0x0347  */
    /* JADX WARN: Code duplicated, block: B:112:0x0365  */
    /* JADX WARN: Code duplicated, block: B:114:0x0378  */
    /* JADX WARN: Code duplicated, block: B:116:0x037c  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:134:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x041d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0427  */
    /* JADX WARN: Code duplicated, block: B:147:0x043d  */
    /* JADX WARN: Code duplicated, block: B:152:0x048a  */
    /* JADX WARN: Code duplicated, block: B:153:0x048c  */
    /* JADX WARN: Code duplicated, block: B:155:0x048f  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x0501  */
    /* JADX WARN: Code duplicated, block: B:171:0x050c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0516  */
    /* JADX WARN: Code duplicated, block: B:176:0x0522  */
    /* JADX WARN: Code duplicated, block: B:181:0x0541  */
    /* JADX WARN: Code duplicated, block: B:185:0x054d  */
    /* JADX WARN: Code duplicated, block: B:192:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:195:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:198:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:201:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:204:0x05da  */
    /* JADX WARN: Code duplicated, block: B:209:0x0603  */
    /* JADX WARN: Code duplicated, block: B:250:0x0799  */
    /* JADX WARN: Code duplicated, block: B:252:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:257:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x07be  */
    /* JADX WARN: Code duplicated, block: B:260:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:262:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:263:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:264:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:266:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:268:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:269:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:270:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:272:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:275:0x0805  */
    /* JADX WARN: Code duplicated, block: B:276:0x080c  */
    /* JADX WARN: Code duplicated, block: B:278:0x0810  */
    /* JADX WARN: Code duplicated, block: B:281:0x0816  */
    /* JADX WARN: Code duplicated, block: B:282:0x081d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0821  */
    /* JADX WARN: Code duplicated, block: B:287:0x0827  */
    /* JADX WARN: Code duplicated, block: B:288:0x082e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0832  */
    /* JADX WARN: Code duplicated, block: B:293:0x0838  */
    /* JADX WARN: Code duplicated, block: B:294:0x083e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0842  */
    /* JADX WARN: Code duplicated, block: B:299:0x0848  */
    /* JADX WARN: Code duplicated, block: B:300:0x084e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0852  */
    /* JADX WARN: Code duplicated, block: B:305:0x0859  */
    /* JADX WARN: Code duplicated, block: B:306:0x085f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0863  */
    /* JADX WARN: Code duplicated, block: B:311:0x086a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0870  */
    /* JADX WARN: Code duplicated, block: B:314:0x0874  */
    /* JADX WARN: Code duplicated, block: B:317:0x087b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0881  */
    /* JADX WARN: Code duplicated, block: B:320:0x0885  */
    /* JADX WARN: Code duplicated, block: B:323:0x088c  */
    /* JADX WARN: Code duplicated, block: B:324:0x0892  */
    /* JADX WARN: Code duplicated, block: B:327:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:10:0x003d, B:39:0x00cd, B:31:0x00a0, B:33:0x00a8, B:35:0x00b2), top: B:383:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:389:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:? A[LOOP:1: B:202:0x05d4->B:395:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0528 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[LOOP:3: B:140:0x0421->B:402:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [w68] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c8 -> B:12:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 2542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hki.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hki(n23 n23Var, d70 d70Var, String str, File file, String str2, a3j a3jVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.h = n23Var;
        this.i = d70Var;
        this.j = str;
        this.k = file;
        this.l = str2;
        this.m = a3jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hki(int i, lq4 lq4Var, Comparable comparable, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = comparable;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hki(dqg dqgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.m = dqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hki(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hki(UploadsCleanupScheduler$UploadsCleanupWorker uploadsCleanupScheduler$UploadsCleanupWorker, bhi bhiVar, AtomicInteger atomicInteger, chi chiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.k = uploadsCleanupScheduler$UploadsCleanupWorker;
        this.l = bhiVar;
        this.m = atomicInteger;
        this.j = chiVar;
    }
}
