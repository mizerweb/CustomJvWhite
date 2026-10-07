package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        byte b = 0;
        int i2 = 2;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll((List) obj2);
                return linkedHashSet;
            case 1:
                f10 f10Var = (f10) obj2;
                f10 f10Var2 = (f10) obj;
                c10 c10Var = f10Var2 instanceof c10 ? (c10) f10Var2 : null;
                return c10Var != null ? c10Var : f10Var;
            case 2:
                return (nkg) obj2;
            case 3:
                return (mbb) obj2;
            case 4:
                return (lmc) obj2;
            case 5:
                utd utdVar = (utd) obj2;
                vo8 vo8Var = (vo8) obj;
                if (vo8Var == null || !vo8Var.isActive()) {
                    return yab.i0(utdVar.b, ((n0c) utdVar.a).b(), 0, new ai8(utdVar, b == true ? 1 : 0, 20), 2);
                }
                return vo8Var;
            case 6:
                return Long.valueOf(((qmg) ((jaf) obj2)).d);
            default:
                gih gihVar = (gih) obj2;
                qsb qsbVar = (qsb) obj;
                if (qsbVar != null) {
                    return qsbVar;
                }
                ifh ifhVar = gihVar.e;
                ifh ifhVar2 = gihVar.d;
                psb psbVar = new psb();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                psbVar.w = uqi.b(10L, timeUnit);
                psbVar.x = uqi.b(10L, timeUnit);
                ExecutorService executorService = (ExecutorService) gihVar.g.getValue();
                gvb gvbVar = new gvb(7);
                gvbVar.b = executorService;
                psbVar.a = gvbVar;
                psbVar.v = uqi.b(10L, timeUnit);
                q71 q71Var = new q71(i2);
                ArrayList arrayList = psbVar.d;
                arrayList.add(q71Var);
                if (gihVar.b) {
                    arrayList.add(new bf9("gih"));
                } else {
                    gihVar.a.getClass();
                }
                if (ifhVar2 != null && ifhVar != null) {
                    new qsb(psbVar);
                    psbVar.a((SSLSocketFactory) ifhVar2.getValue(), (X509TrustManager) ifhVar.getValue());
                    ifh ifhVar3 = gihVar.f;
                    if (ifhVar3 != null && ifhVar3.getValue() != null) {
                        ore.m();
                        return null;
                    }
                }
                psbVar.c.add(new x21(i2, gihVar));
                return new qsb(psbVar);
        }
    }
}
