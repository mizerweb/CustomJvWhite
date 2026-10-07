package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class xj3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fk3 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj3(int i, long j, fk3 fk3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.f = fk3Var;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new xj3(0, this.g, this.f, lq4Var);
            case 1:
                return new xj3(1, this.g, this.f, lq4Var);
            default:
                return new xj3(2, this.g, this.f, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((xj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((xj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.g;
        fk3 fk3Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = fk3.y1;
                fk3Var.E().u(j);
                break;
            case 1:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = fk3.y1;
                fk3Var.E().u(j);
                break;
            default:
                ch3.d0(obj);
                Iterator it = ((jj3) fk3Var.E.getValue()).c.c.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((ek4) it.next()).a == j) {
                        r9f r9fVar = (r9f) fk3Var.z.getValue();
                        r9fVar.getClass();
                        ul9 ul9Var = new ul9();
                        ul9Var.put("conversationType", 1);
                        ul9Var.put(ApiProtocol.PARAM_CONVERSATION_ID, Long.valueOf(j));
                        ul9Var.put("section", 5);
                        ul9Var.put("rank", Integer.valueOf(i2));
                        ((ae9) r9fVar.a.getValue()).h("search_click", ouk.a(new ylc("source_meta", ul9Var.b())));
                    } else {
                        i2++;
                    }
                    break;
                }
                i2 = -1;
                r9f r9fVar2 = (r9f) fk3Var.z.getValue();
                r9fVar2.getClass();
                ul9 ul9Var2 = new ul9();
                ul9Var2.put("conversationType", 1);
                ul9Var2.put(ApiProtocol.PARAM_CONVERSATION_ID, Long.valueOf(j));
                ul9Var2.put("section", 5);
                ul9Var2.put("rank", Integer.valueOf(i2));
                ((ae9) r9fVar2.a.getValue()).h("search_click", ouk.a(new ylc("source_meta", ul9Var2.b())));
                break;
        }
        return sbiVar;
    }
}
