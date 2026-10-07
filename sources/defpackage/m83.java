package defpackage;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m83 implements Comparator {
    public final /* synthetic */ g83 a;
    public final /* synthetic */ g83 b;

    public m83(g83 g83Var, g83 g83Var2) {
        this.a = g83Var;
        this.b = g83Var2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        Long lValueOf2;
        long jLongValue = ((Number) obj2).longValue();
        Map map = this.a.a;
        d83 d83Var = (d83) map.get(Long.valueOf(jLongValue));
        Map map2 = this.b.a;
        d83 d83Var2 = (d83) map2.get(Long.valueOf(jLongValue));
        if ((d83Var != null ? d83Var.l : 0L) >= (d83Var2 != null ? d83Var2.l : 0L)) {
            lValueOf = Long.valueOf(d83Var != null ? d83Var.l : 0L);
        } else {
            lValueOf = Long.valueOf(d83Var2 != null ? d83Var2.l : 0L);
        }
        long jLongValue2 = ((Number) obj).longValue();
        d83 d83Var3 = (d83) map.get(Long.valueOf(jLongValue2));
        d83 d83Var4 = (d83) map2.get(Long.valueOf(jLongValue2));
        if ((d83Var3 != null ? d83Var3.l : 0L) >= (d83Var4 != null ? d83Var4.l : 0L)) {
            lValueOf2 = Long.valueOf(d83Var3 != null ? d83Var3.l : 0L);
        } else {
            lValueOf2 = Long.valueOf(d83Var4 != null ? d83Var4.l : 0L);
        }
        return e9i.D(lValueOf, lValueOf2);
    }
}
