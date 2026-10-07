package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class l9h {
    public static final Pattern b = Pattern.compile("\\s");
    public final lx2 a;

    public l9h(lx2 lx2Var) {
        this.a = lx2Var;
    }

    public static List a(List list, Predicate predicate) {
        if (list == null) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            p8h p8hVar = null;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            r01 r01Var = (r01) obj;
            if ((predicate.test(r01Var) ? r01Var : null) != null) {
                long j = (r01Var.a * 31) + ((long) i);
                String str = r01Var.c;
                p8hVar = new p8h(j, 3, str, r01Var.d, str, null, null);
            }
            if (p8hVar != null) {
                arrayList.add(p8hVar);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        if (r15 == r4) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.o9h r10, java.lang.String r11, int r12, java.util.List r13, defpackage.d9h r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9h.b(o9h, java.lang.String, int, java.util.List, d9h, nq4):java.lang.Object");
    }
}
