package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class foj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ioj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ foj(ioj iojVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = iojVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ioj iojVar = this.g;
        switch (i) {
            case 0:
                foj fojVar = new foj(iojVar, lq4Var, 0);
                fojVar.f = obj;
                return fojVar;
            default:
                foj fojVar2 = new foj(iojVar, lq4Var, 1);
                fojVar2.f = obj;
                return fojVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((foj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((foj) create((aij) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                ioj iojVar = this.g;
                try {
                    iojVar.s1 = System.currentTimeMillis() + ".jpg";
                    Uri uriFromFile = Uri.fromFile(iojVar.E().t(iojVar.s1));
                    if (!uriFromFile.toString().startsWith("content://")) {
                        uriFromFile = iojVar.E().i((Context) iojVar.v.getValue(), u1m.b(uriFromFile));
                    }
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", uriFromFile);
                    intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                    poeVar = intent;
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                ioj iojVar2 = this.g;
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V(iojVar2.C, "capturePhoto: failed to capture photo", thA);
                    iojVar2.s1 = null;
                    iojVar2.G(anj.a);
                }
                ioj iojVar3 = this.g;
                if (!(poeVar instanceof poe)) {
                    iojVar3.G(new cnj((Intent) poeVar));
                }
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                aij aijVar = (aij) this.f;
                ch3.d0(obj);
                ioj iojVar4 = this.g;
                ConcurrentHashMap concurrentHashMap = iojVar4.P1;
                ConcurrentHashMap concurrentHashMap2 = iojVar4.P1;
                es8 es8Var = (es8) concurrentHashMap.get(new Long(aijVar.a()));
                if (es8Var != null) {
                    if (aijVar instanceof yhj) {
                        es8Var.a(chj.SUCCESS);
                        concurrentHashMap2.remove(new Long(((yhj) aijVar).a));
                    } else if (aijVar instanceof xhj) {
                        es8Var.a(chj.CANCELLED);
                        concurrentHashMap2.remove(new Long(((xhj) aijVar).a));
                    } else {
                        if (!(aijVar instanceof zhj)) {
                            ore.o();
                            return null;
                        }
                        es8Var.b(new ghj());
                        concurrentHashMap2.remove(new Long(((zhj) aijVar).a));
                    }
                }
                return sbiVar;
        }
    }
}
