package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oo4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ qo4 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo4(qo4 qo4Var, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = qo4Var;
        this.g = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new oo4(this.f, this.g, lq4Var, 0);
            default:
                return new oo4(this.f, this.g, lq4Var, 1);
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
                break;
        }
        return ((oo4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        String str = this.g;
        qo4 qo4Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = ((vj4) qo4Var.b.getValue()).a;
                if (list != null) {
                    return qo4.a(qo4Var, list, str);
                }
                return null;
            default:
                ch3.d0(obj);
                List list2 = ((vj4) qo4Var.b.getValue()).c;
                if (list2 != null) {
                    return qo4.a(qo4Var, list2, str);
                }
                return null;
        }
    }
}
