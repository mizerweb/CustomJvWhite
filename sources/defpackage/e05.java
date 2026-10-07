package defpackage;

import java.util.Map;
import java.util.function.Predicate;
import one.me.sdk.concurrent.LinkedTransferQueue34;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e05 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((gab) obj) instanceof ov8;
            case 1:
                return ((gab) obj) instanceof pbj;
            case 2:
                return ((gab) obj) instanceof kgh;
            case 3:
                gab gabVar = (gab) obj;
                return (gabVar instanceof qzd) || (gabVar instanceof zkc);
            case 4:
                return ((gab) obj) instanceof pbj;
            case 5:
                gab gabVar2 = (gab) obj;
                return ((gabVar2 instanceof pbj) || (gabVar2 instanceof qzd) || (gabVar2 instanceof zkc)) ? false : true;
            case 6:
                return ((gab) obj) instanceof zkc;
            case 7:
                return !i05.A.contains((mfk) obj);
            case 8:
                return !((zkc) ((gab) obj)).b.isEmpty();
            case 9:
                throw null;
            case 10:
                return !(((gab) obj) instanceof z0k);
            case 11:
                return ((gab) obj) instanceof r9i;
            case 12:
                return LinkedTransferQueue34.lambda$clear$2(obj);
            case 13:
                obj.getClass();
                throw new ClassCastException();
            case 14:
                return !qt4.e(((z5k) obj).c, 4);
            case 15:
                return !qt4.e(((z5k) ((Map.Entry) obj).getValue()).c, 4);
            case 16:
                int i = ((z5k) obj).c;
                return (qt4.e(i, 1) || qt4.e(i, 4)) ? false : true;
            case 17:
                return !qt4.e(((z5k) ((Map.Entry) obj).getValue()).c, 4);
            case 18:
                return !qt4.e(((z5k) obj).c, 4);
            case 19:
                return qt4.e(((z5k) obj).c, 1);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((gab) obj) instanceof qzd;
            case 21:
                return ((o8k) obj) instanceof f5k;
            case 22:
                o8k o8kVar = (o8k) obj;
                return (o8kVar instanceof k8k) || (o8kVar instanceof n8k) || (o8kVar instanceof e5k) || (o8kVar instanceof g5k) || ((o8kVar instanceof f5k) && ((f5k) o8kVar).e == 28);
            case 23:
                o8k o8kVar2 = (o8k) obj;
                return (o8kVar2 instanceof k8k) || (o8kVar2 instanceof n8k) || (o8kVar2 instanceof e5k) || (o8kVar2 instanceof g5k) || ((o8kVar2 instanceof f5k) && ((f5k) o8kVar2).e == 28);
            case 24:
                o8k o8kVar3 = (o8k) obj;
                return (o8kVar3 instanceof g5k) || (o8kVar3 instanceof e5k) || (o8kVar3 instanceof j8k) || (o8kVar3 instanceof m8k) || (o8kVar3 instanceof j5k);
            case 25:
                return ((eak) obj) instanceof gck;
            case 26:
                return ((gck) ((eak) obj)).a.getClass().equals(m8k.class);
            case 27:
                return ((pbk) obj) instanceof rbk;
            case 28:
                return ((o8k) obj) instanceof t8k;
            default:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 1;
        }
    }

    public /* synthetic */ e05(int i) {
        this.a = i;
    }
}
