package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ss3 implements rba {
    public static final rs3 e = new rs3();
    public static final qs3 f = new qs3(0);
    public static final fbc g = new fbc(19, new b6(27));
    public final String a = ss3.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public ss3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    @Override // defpackage.rba
    public final void a(int i) {
        if (qt4.d(i, 2) >= 0) {
            je9 je9Var = je9.e;
            taa taaVar = ((b78) this.c.getValue()).f;
            vi8 vi8VarE = ((f78) this.d.getValue()).e();
            b("before", taaVar, vi8VarE);
            List list = (List) ((zya) ((l3c) this.b.getValue()).b.getValue()).b.get();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                String strA = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((yya) it.next()).r;
                if (str != null) {
                    e.getClass();
                    strA = rs3.a(Uri.parse(str));
                }
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            String str2 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "avatars:" + arrayList.size() + "|" + arrayList, null);
            }
            ps3 ps3Var = new ps3(this, arrayList);
            int iC = taaVar.c(ps3Var);
            String str3 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, zo5.h(iC, "bitmapMemoryCacheRemovedCount="), null);
            }
            int iC2 = vi8VarE.a.c(ps3Var);
            String str4 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str4, zo5.h(iC2, "encodedMemoryCacheRemovedCount="), null);
            }
            b("after", taaVar, vi8VarE);
        }
    }

    public final void b(String str, taa taaVar, vi8 vi8Var) {
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            int count = taaVar.getCount();
            int sizeInBytes = taaVar.getSizeInBytes();
            int count2 = vi8Var.a.getCount();
            int sizeInBytes2 = vi8Var.a.getSizeInBytes();
            StringBuilder sbR = c0a.r(count, "fresco in-memory ", str, ":bitmap:", "|");
            qt4.x(sizeInBytes, count2, "b, encoded:", "|", sbR);
            a4cVar.c(je9Var, str2, zo5.t(sbR, sizeInBytes2, "b"), null);
        }
    }
}
