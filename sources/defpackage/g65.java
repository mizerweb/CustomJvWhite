package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g65 {
    public final LinkedHashMap a = new LinkedHashMap();

    public g65(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h65 h65Var = (h65) it.next();
            Iterator it2 = ((LinkedHashSet) h65Var.b().b).iterator();
            while (it2.hasNext()) {
                this.a.put((m65) it2.next(), h65Var);
            }
        }
    }

    public final ylc a(Uri uri) {
        String strA = v65.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            m65 m65Var = (m65) entry.getKey();
            h65 h65Var = (h65) entry.getValue();
            if (v65.a(m65Var.a).equals(strA)) {
                return new ylc(m65Var, h65Var);
            }
        }
        return null;
    }
}
