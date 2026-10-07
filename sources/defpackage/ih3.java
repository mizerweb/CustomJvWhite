package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih3 implements cf7 {
    public final /* synthetic */ ph3 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ nx2 c;
    public final /* synthetic */ ConcurrentHashMap d;

    public /* synthetic */ ih3(ph3 ph3Var, long j, nx2 nx2Var, ConcurrentHashMap concurrentHashMap) {
        this.a = ph3Var;
        this.b = j;
        this.c = nx2Var;
        this.d = concurrentHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        long j;
        te7 te7VarA;
        ph3 ph3Var = this.a;
        long j2 = this.b;
        nx2 nx2Var = this.c;
        ConcurrentHashMap concurrentHashMap = this.d;
        String name = ph3.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "insertOrReplaceBlocking for #" + j2 + ", status:" + nx2Var.c, null);
            }
        }
        long jLongValue = ((Number) ch3.G(ph3Var.a, false, true, new ol(ph3Var, 2, new jy2(j2, nx2Var.a, nx2Var, nx2Var.a().e, nx2Var.k, nx2Var.l)))).longValue();
        Object obj2 = concurrentHashMap.get(Long.valueOf(jLongValue));
        if (obj2 == null ? false : obj2.equals(nx2Var.g)) {
            j = jLongValue;
        } else {
            concurrentHashMap.remove(Long.valueOf(jLongValue));
            String str = nx2Var.g;
            if (str == null) {
                j = jLongValue;
            } else {
                if (str.length() == 0) {
                    str = null;
                }
                if (str == null || (te7VarA = ve7.a(str)) == null) {
                    j = jLongValue;
                } else {
                    String str2 = te7VarA.a;
                    String str3 = te7VarA.b;
                    te7 te7Var = te7VarA.c;
                    String str4 = te7Var != null ? te7Var.a : null;
                    String str5 = te7Var != null ? te7Var.b : null;
                    j = jLongValue;
                    ch3.G(ph3Var.a, false, true, new kh3(1, jLongValue, nx2Var.k, str2, str3, str4, str5));
                    se7.a(concurrentHashMap, j, nx2Var);
                    gm0.n(ph3.class.getName(), "update_fts_title_chat for #" + j);
                }
            }
        }
        return Long.valueOf(j);
    }
}
