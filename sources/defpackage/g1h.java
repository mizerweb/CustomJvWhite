package defpackage;

import androidx.work.a;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import one.me.stories.core.workers.StoryPublishWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class g1h {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = g1h.class.getName();

    public g1h(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(azg azgVar, long j, ha9 ha9Var, nq4 nq4Var) {
        e1h e1hVar;
        long j2;
        ha9 ha9Var2;
        if (nq4Var instanceof e1h) {
            e1hVar = (e1h) nq4Var;
            int i = e1hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                e1hVar.i = i - Integer.MIN_VALUE;
            } else {
                e1hVar = new e1h(this, nq4Var);
            }
        } else {
            e1hVar = new e1h(this, nq4Var);
        }
        Object obj = e1hVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = e1hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j, "Cancel story publish for draftId="), null);
                }
            }
            ltg ltgVar = (ltg) this.c.getValue();
            e1hVar.d = azgVar;
            e1hVar.e = ha9Var;
            e1hVar.f = j;
            e1hVar.i = 1;
            if (ltgVar.d(j, e1hVar) != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j = e1hVar.f;
            ha9Var = e1hVar.e;
            azgVar = e1hVar.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = e1hVar.f;
            ha9Var2 = e1hVar.e;
            ch3.d0(obj);
        }
        ((xyj) this.a.getValue()).d(ha9Var2.a("story-publish:" + j2, null));
        return sbi.a;
        erg ergVar = (erg) this.b.getValue();
        e1hVar.d = null;
        e1hVar.e = ha9Var;
        e1hVar.f = j;
        e1hVar.i = 2;
        if (ergVar.b(azgVar, j, e1hVar) != hu4Var) {
            j2 = j;
            ha9Var2 = ha9Var;
            ((xyj) this.a.getValue()).d(ha9Var2.a("story-publish:" + j2, null));
            return sbi.a;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(zyg zygVar, bxg bxgVar, ha9 ha9Var, nq4 nq4Var) {
        f1h f1hVar;
        ha9 ha9Var2;
        kxg kxgVar;
        zyg zygVar2;
        if (nq4Var instanceof f1h) {
            f1hVar = (f1h) nq4Var;
            int i = f1hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1hVar.h = i - Integer.MIN_VALUE;
            } else {
                f1hVar = new f1h(this, nq4Var);
            }
        } else {
            f1hVar = new f1h(this, nq4Var);
        }
        Object objH = f1hVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = f1hVar.h;
        if (i2 == 0) {
            ch3.d0(objH);
            String str = this.d;
            a4c a4cVar = gm0.f;
            lq4 lq4Var = null;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Publish story draft with data: " + bxgVar, null);
                }
            }
            erg ergVar = (erg) this.b.getValue();
            f1hVar.d = zygVar;
            ha9Var2 = ha9Var;
            f1hVar.e = ha9Var2;
            f1hVar.h = 1;
            ergVar.getClass();
            if (bxgVar instanceof ywg) {
                kxgVar = kxg.PHOTO;
            } else if (bxgVar instanceof axg) {
                kxgVar = kxg.VIDEO;
            } else {
                if (!(bxgVar instanceof zwg)) {
                    ore.o();
                    return null;
                }
                kxgVar = kxg.TEXT;
            }
            swg swgVar = new swg(0L, bxgVar.getPath(), bxgVar.e(), kxgVar, bxgVar.c(), bxgVar.b(), bxgVar.g(), bxgVar.f(), System.currentTimeMillis());
            qwg qwgVarE = ergVar.e();
            objH = ch3.H(f1hVar, new d24(qwgVarE, swgVar, new ptf(10, bxgVar), lq4Var, 4), qwgVarE.a);
            if (objH == hu4Var) {
                return hu4Var;
            }
            zygVar2 = zygVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ha9 ha9Var3 = f1hVar.e;
            zygVar2 = f1hVar.d;
            ch3.d0(objH);
            ha9Var2 = ha9Var3;
        }
        c(zygVar2, ((Number) objH).longValue(), ha9Var2);
        return sbi.a;
    }

    public final void c(azg azgVar, long j, ha9 ha9Var) {
        dzg dzgVar;
        xyj xyjVar = (xyj) this.a.getValue();
        String strA = ha9Var.a("story-publish:" + j, null);
        a aVar = (a) ((a) ((a) new a(StoryPublishWorker.class).setExpedited(yic.a)).setBackoffCriteria(rn0.b, 10000L, TimeUnit.MILLISECONDS)).addTag(strA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("workName", strA);
        linkedHashMap.put("draftId", Long.valueOf(j));
        linkedHashMap.put("ownerId", Long.valueOf(azgVar.a()));
        if (azgVar instanceof zyg) {
            dzgVar = dzg.a;
        } else if (azgVar instanceof yyg) {
            dzgVar = dzg.b;
        } else {
            if (!(azgVar instanceof xyg)) {
                ore.o();
                return;
            }
            dzgVar = dzg.c;
        }
        linkedHashMap.put("ownerType", dzgVar.name());
        linkedHashMap.put("local_account_id", Integer.valueOf(ha9Var.a));
        d25 d25Var = new d25(linkedHashMap);
        f55.y(d25Var);
        cdc cdcVar = (cdc) ((a) aVar.setInputData(d25Var)).build();
        a8g a8gVar = xyj.l;
        xyjVar.b(strA, ve6.b, cdcVar).N();
    }
}
