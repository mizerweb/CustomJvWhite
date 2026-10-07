package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b54 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b54(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (cf7 cf7Var : (cf7[]) obj3) {
                    int iD = e9i.D((Comparable) cf7Var.invoke(obj), (Comparable) cf7Var.invoke(obj2));
                    if (iD != 0) {
                        return iD;
                    }
                }
                return 0;
            case 1:
                o6 o6Var = (o6) obj3;
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return o6Var.compare(obj, obj2);
            default:
                return ((Number) ((dz) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
