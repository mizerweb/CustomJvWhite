package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class nag {
    public final ArrayList a = new ArrayList();

    public final void a(rv8... rv8VarArr) {
        ArrayList arrayList = new ArrayList();
        for (rv8 rv8Var : rv8VarArr) {
            String canonicalName = ((qr3) rv8Var).d().getCanonicalName();
            if (canonicalName != null) {
                arrayList.add(canonicalName);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a.add(ww3.o1(a.n1((String[]) Arrays.copyOf(strArr, strArr.length))));
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        this.a.add(Collections.singletonList(str));
    }
}
