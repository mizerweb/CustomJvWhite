package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a24 implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Collection g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a24(String str, long j, long j2, long j3, ArrayList arrayList, int i, toa toaVar) {
        List list = xfa.b;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.g = arrayList;
        this.f = i;
        this.h = toaVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        int i2 = 3;
        Object obj2 = this.h;
        int i3 = this.f;
        Collection collection = this.g;
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                Collection collection2 = (Collection) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0(str);
                try {
                    vxeVarO0.c(1, j3);
                    vxeVarO0.c(2, j2);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    vxeVarO0.c(i3 + 3, j);
                    int i4 = i3 + 4;
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        vxeVarO0.c(i4, ((Number) it2.next()).longValue());
                        i4++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO0.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            default:
                ArrayList arrayList2 = (ArrayList) collection;
                toa toaVar = (toa) obj2;
                List list = xfa.b;
                vxe vxeVarO1 = ((qxe) obj).O0(str);
                try {
                    vxeVarO1.c(1, j3);
                    vxeVarO1.c(2, j2);
                    vxeVarO1.c(3, j);
                    Iterator it3 = arrayList2.iterator();
                    int i5 = 4;
                    while (it3.hasNext()) {
                        vxeVarO1.c(i5, ((Number) it3.next()).longValue());
                        i5++;
                    }
                    toaVar.e().getClass();
                    vxeVarO1.c(i3 + 4, 10L);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO1.getLong(0)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ a24(String str, long j, long j2, Set set, int i, long j3, Collection collection) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.g = set;
        this.f = i;
        this.e = j3;
        this.h = collection;
    }
}
