package defpackage;

import com.google.android.gms.common.api.Scope;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class lv5 implements Comparator {
    public static final lv5 b = new lv5(0);
    public static final lv5 c = new lv5(1);
    public static final /* synthetic */ lv5 d = new lv5(2);
    public static final /* synthetic */ lv5 e = new lv5(3);
    public final /* synthetic */ int a;

    public /* synthetic */ lv5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ble bleVar;
        b87 b87Var;
        ble bleVar2;
        b87 b87Var2;
        switch (this.a) {
            case 0:
                rv5 rv5Var = (rv5) obj;
                rv5 rv5Var2 = (rv5) obj2;
                String str = rv5Var2.a;
                String str2 = rv5Var2.b;
                int iCompareTo = rv5Var.a.compareTo(str);
                if (iCompareTo == 0 && (iCompareTo = rv5Var.b.compareTo(str2)) == 0) {
                    return 0;
                }
                return iCompareTo;
            case 1:
                k8a k8aVar = (k8a) obj;
                k8a k8aVar2 = (k8a) obj2;
                boolean z = k8aVar.i;
                boolean z2 = k8aVar2.i;
                return z != z2 ? Boolean.compare(z2, z) : cqk.j(k8aVar2.f, k8aVar.f);
            case 2:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 3:
                do6 do6Var = (do6) obj;
                do6 do6Var2 = (do6) obj2;
                return !do6Var.a.equals(do6Var2.a) ? do6Var.a.compareTo(do6Var2.a) : (do6Var.b() > do6Var2.b() ? 1 : (do6Var.b() == do6Var2.b() ? 0 : -1));
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                return e9i.D(((mp) obj).a, ((mp) obj2).a);
            case 6:
                return e9i.D(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 7:
                return e9i.D(Long.valueOf(((ov0) obj).a), Long.valueOf(((ov0) obj2).a));
            case 8:
                return e9i.D(Long.valueOf(((ov0) obj).a), Long.valueOf(((ov0) obj2).a));
            case 9:
                return Integer.compare(((ty0) obj).a, ((ty0) obj2).a);
            case 10:
                o95 o95Var = (o95) obj2;
                Integer numValueOf = null;
                Integer numValueOf2 = (o95Var == null || (bleVar2 = o95Var.b) == null || (b87Var2 = bleVar2.a) == null) ? null : Integer.valueOf(b87Var2.j);
                o95 o95Var2 = (o95) obj;
                if (o95Var2 != null && (bleVar = o95Var2.b) != null && (b87Var = bleVar.a) != null) {
                    numValueOf = Integer.valueOf(b87Var.j);
                }
                return e9i.D(numValueOf2, numValueOf);
            case 11:
                return e9i.D(Long.valueOf(((mh1) obj2).a), Long.valueOf(((mh1) obj).a));
            case 12:
                return e9i.D(Boolean.valueOf(((ys1) obj).d), Boolean.valueOf(((ys1) obj2).d));
            case 13:
                return e9i.D(Boolean.valueOf(((ys1) obj).f), Boolean.valueOf(((ys1) obj2).f));
            case 14:
                return e9i.D(Long.valueOf(((tmc) ((Map.Entry) obj).getValue()).a.n()), Long.valueOf(((tmc) ((Map.Entry) obj2).getValue()).a.n()));
            case 15:
                return e9i.D(Integer.valueOf(((vk2) obj).a()), Integer.valueOf(((vk2) obj2).a()));
            case 16:
                return e9i.D(Long.valueOf(((tia) obj).i), Long.valueOf(((tia) obj2).i));
            case 17:
                return e9i.D(Long.valueOf(((tia) obj).i), Long.valueOf(((tia) obj2).i));
            case 18:
                return e9i.D(Long.valueOf(((cv4) obj).a), Long.valueOf(((cv4) obj2).a));
            case 19:
                return e9i.D(Long.valueOf(((fhh) obj2).c), Long.valueOf(((fhh) obj).c));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return e9i.D(Long.valueOf(((fhh) obj2).b), Long.valueOf(((fhh) obj).b));
            case 21:
                return e9i.D((String) ((ylc) obj).a, (String) ((ylc) obj2).a);
            case 22:
                long jA = ((u95) obj).a();
                long jA2 = ((u95) obj2).a();
                if (jA < jA2) {
                    return -1;
                }
                return jA2 == jA ? 0 : 1;
            case 23:
                Integer num = 0;
                int i = ((i5d) obj).o;
                int[] iArr = jj5.$EnumSwitchMapping$0;
                return e9i.D(iArr[qt4.D(i)] == 1 ? num : 1, iArr[qt4.D(((i5d) obj2).o)] != 1 ? 1 : 0);
            case 24:
                return e9i.D(Long.valueOf(((kn5) obj2).a), Long.valueOf(((kn5) obj).a));
            case 25:
                return e9i.D((Long) ((ylc) obj).b, (Long) ((ylc) obj2).b);
            case 26:
                return e9i.D((String) ((ylc) obj).a, (String) ((ylc) obj2).a);
            case 27:
                return e9i.D(Long.valueOf(((fda) obj).getC()), Long.valueOf(((fda) obj2).getC()));
            case 28:
                return e9i.D(Long.valueOf(((fda) obj).getC()), Long.valueOf(((fda) obj2).getC()));
            default:
                return e9i.D(((k5h) obj).a, ((k5h) obj2).a);
        }
    }
}
