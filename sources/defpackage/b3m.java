package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b3m {
    public static final Set b(String str) {
        if (str.length() == 0) {
            return null;
        }
        int iV0 = r5h.V0(str, ",", 0, false, 4);
        if (iV0 == -1) {
            return Collections.singleton(str);
        }
        pw pwVar = new pw(10);
        int i = 0;
        do {
            pwVar.add(str.substring(i, iV0));
            i = iV0 + 1;
            iV0 = r5h.V0(str, ",", i, false, 4);
        } while (iV0 != -1);
        pwVar.add(str.substring(i, str.length()));
        return pwVar;
    }

    public abstract void a();
}
