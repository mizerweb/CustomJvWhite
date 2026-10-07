package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class glf extends ilf {
    public final String l;
    public final List m;
    public List n;
    public final boolean o;

    public glf(flf flfVar) {
        super(flfVar);
        this.l = flfVar.i;
        this.m = flfVar.j;
        this.n = flfVar.h;
        this.o = flfVar.k;
    }

    @Override // defpackage.ilf
    public rfa C() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n.size());
        Iterator it = this.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t2 t2Var = (t2) it.next();
            if (t2Var instanceof q50) {
                arrayList2.add(t2Var);
                arrayList.add(((q50) t2Var).c);
            } else {
                njf njfVar = this.a;
                zlc zlcVarC = ((uid) (njfVar != null ? njfVar : null).I.getValue()).c(t2Var, this.o);
                if (zlcVarC != null) {
                    t2 t2Var2 = (t2) zlcVarC.a;
                    e70 e70Var = (e70) zlcVarC.b;
                    if (t2Var2 != null && e70Var != null) {
                        arrayList2.add(t2Var2);
                        arrayList.add(e70Var);
                    }
                }
            }
        }
        String str = this.l;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.n = arrayList2;
        f70 f70Var = new f70();
        f70Var.a = arrayList;
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.n = c46VarC;
        if (!ch3.r(str)) {
            rfaVar.g = str;
        }
        List list = this.m;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            rfaVar.b(list);
        }
        return rfaVar;
    }

    @Override // defpackage.ilf
    public String D() {
        return "ServiceTaskSendMediaMessage";
    }

    @Override // defpackage.ilf
    public final long G(rt2 rt2Var, long j, String str) {
        long jG = super.G(rt2Var, j, str);
        sfa sfaVarL = s().l(j);
        if (sfaVarL == null) {
            return 0L;
        }
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            t2 t2Var = (t2) this.n.get(i);
            String str2 = sfaVarL.n.h(i).t;
            if (!(t2Var instanceof q50)) {
                long j2 = rt2Var.a;
                njf njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                ((cq6) njfVar.c.getValue()).c(t2Var, j, j2, str2);
            }
        }
        return jG;
    }
}
