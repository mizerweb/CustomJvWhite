package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zjf extends ilf {
    public final /* synthetic */ int l = 1;
    public final Object m;

    public zjf(clf clfVar) {
        super(clfVar);
        this.m = (h60) clfVar.i;
    }

    public static clf H(long j, h60 h60Var) {
        return new clf(j, h60Var, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [r66] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    @Override // defpackage.ilf
    public final rfa C() {
        ?? arrayList;
        c46 c46VarC;
        List list;
        int i = this.l;
        Object obj = this.m;
        switch (i) {
            case 0:
                sfa sfaVar = (sfa) obj;
                c46 c46Var = sfaVar.n;
                if (c46Var == null || (list = (List) c46Var.a) == null) {
                    arrayList = r66.a;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        e70 e70Var = (e70) obj2;
                        if (e70Var.g == null && e70Var.p == null) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(yw3.W0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        c60 c60VarJ = ((e70) it.next()).j();
                        c60VarJ.l = UUID.randomUUID().toString();
                        arrayList.add(c60VarJ.a());
                    }
                }
                rfa rfaVarC0 = sfaVar.c0();
                rfaVarC0.b = 0L;
                rfaVarC0.u = true;
                c46 c46Var2 = sfaVar.n;
                if (c46Var2 != null) {
                    f70 f70VarP = c46Var2.p();
                    f70VarP.c = null;
                    f70VarP.b = null;
                    f70VarP.a = arrayList;
                    c46VarC = f70VarP.c();
                } else {
                    c46VarC = null;
                }
                rfaVarC0.n = c46VarC;
                rfaVarC0.o = 0;
                rfaVarC0.p = 0L;
                rfaVarC0.r = null;
                rfaVarC0.s = null;
                rfaVarC0.t = null;
                rfaVarC0.H = 0;
                rfaVarC0.x = 0L;
                rfaVarC0.y = 0L;
                rfaVarC0.q = null;
                rfaVarC0.E = null;
                rfaVarC0.G = 0L;
                return rfaVarC0;
            default:
                c60 c60Var = new c60();
                c60Var.c = (h60) obj;
                c60Var.a = y60.b;
                e70 e70VarA = c60Var.a();
                f70 f70Var = new f70();
                f70Var.a = Collections.singletonList(e70VarA);
                c46 c46VarC2 = f70Var.c();
                rfa rfaVar = new rfa();
                rfaVar.n = c46VarC2;
                return rfaVar;
        }
    }

    @Override // defpackage.ilf
    public final String D() {
        switch (this.l) {
            case 0:
                return "ServiceTaskCopyAndSendMessage";
            default:
                return "ServiceTaskSendControlMessage";
        }
    }

    public zjf(yjf yjfVar) {
        super(yjfVar);
        this.m = yjfVar.i;
    }
}
