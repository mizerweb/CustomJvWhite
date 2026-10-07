package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv2 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ vv2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                rt2 rt2Var = (rt2) obj;
                rt2Var.getClass();
                return tre.P(((rt2) obj2).B(), rt2Var.B());
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 2:
                return cqk.j(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 3:
                kw7 kw7Var = (kw7) obj;
                kw7 kw7Var2 = (kw7) obj2;
                int iD = e9i.D(Long.valueOf(kw7Var2.getC()), Long.valueOf(kw7Var.getC()));
                return iD != 0 ? iD : e9i.D(Long.valueOf(kw7Var.getA()), Long.valueOf(kw7Var2.getA()));
            case 4:
                return cqk.j(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 5:
                m6g m6gVar = (m6g) obj;
                m6g m6gVar2 = (m6g) obj2;
                long j = m6gVar.f;
                long j2 = m6gVar2.f;
                if (j - j2 == 0) {
                    return m6gVar.compareTo(m6gVar2);
                }
                return j < j2 ? -1 : 1;
            case 6:
                ox2 ox2Var = (ox2) obj;
                ox2 ox2Var2 = (ox2) obj2;
                long j3 = ox2Var.b.a().e;
                long j4 = ox2Var2.b.a().e;
                if (j3 == 0) {
                    j3 = Long.MAX_VALUE;
                }
                if (j4 == 0) {
                    j4 = Long.MAX_VALUE;
                }
                int iJ = cqk.j(j4, j3);
                if (iJ != 0) {
                    return iJ;
                }
                int iJ2 = cqk.j(ox2Var2.b.k, ox2Var.b.k);
                if (iJ2 != 0) {
                    return iJ2;
                }
                int iJ3 = cqk.j(ox2Var2.a, ox2Var.a);
                return iJ3 != 0 ? iJ3 : cqk.i(ox2Var2.hashCode(), ox2Var.hashCode());
            case 7:
                return ((tag) obj).a - ((tag) obj2).a;
            default:
                return Float.compare(((tag) obj).c, ((tag) obj2).c);
        }
    }
}
