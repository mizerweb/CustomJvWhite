package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kq5 implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kq5(u60 u60Var, int i, long j, long j2, File file, er5 er5Var, sfe sfeVar) {
        this.e = u60Var;
        this.c = i;
        this.b = j;
        this.d = j2;
        this.f = file;
        this.g = sfeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.g;
        long j = this.d;
        int i2 = this.c;
        Object obj3 = this.f;
        long j2 = this.b;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                File file = (File) obj3;
                sfe sfeVar = (sfe) obj2;
                c60 c60Var = (c60) obj;
                c60Var.i = (u60) obj4;
                c60Var.k = i2;
                c60Var.p = j2;
                c60Var.o = j;
                if (file != null && i2 >= 100 && ((c60Var.r != null || c60Var.d != null || c60Var.e != null) && file.exists())) {
                    sfeVar.a = true;
                    c60Var.u = file.lastModified();
                    c60Var.m = file.getAbsolutePath();
                }
                return sbi.a;
            default:
                Collection collection = (Collection) obj3;
                Collection collection2 = (Collection) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0((String) obj4);
                try {
                    vxeVarO0.c(1, j2);
                    Iterator it = collection.iterator();
                    int i3 = 2;
                    while (it.hasNext()) {
                        vxeVarO0.c(i3, ((Number) it.next()).longValue());
                        i3++;
                    }
                    vxeVarO0.c(i2 + 2, j);
                    int i4 = i2 + 3;
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
        }
    }

    public /* synthetic */ kq5(String str, long j, Set set, int i, long j2, Collection collection) {
        this.e = str;
        this.b = j;
        this.f = set;
        this.c = i;
        this.d = j2;
        this.g = collection;
    }
}
