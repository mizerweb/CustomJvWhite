package defpackage;

import java.util.LinkedHashMap;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes.dex */
public final class yx {
    public static final yx a = new yx();
    public static final j85 b;
    public static final wx c;
    public static final LinkedHashMap d;

    static {
        j85 j85Var = new j85(14);
        b = j85Var;
        wx wxVar = new wx("assertion_tracker_collisions", new vx(6), true);
        wxVar.d = j85Var;
        c = wxVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new xx("assertion_tracker_collisions"), wxVar);
        d = linkedHashMap;
    }

    public static wx a(String str) {
        wx wxVar;
        boolean z;
        yx yxVar = a;
        vx vxVar = new vx(7);
        xx xxVar = new xx(str);
        synchronized (yxVar) {
            LinkedHashMap linkedHashMap = d;
            boolean zContainsKey = linkedHashMap.containsKey(xxVar);
            z = !zContainsKey;
            wxVar = new wx(str, vxVar, z);
            if (!zContainsKey) {
                wxVar.d = b;
                linkedHashMap.put(xxVar, wxVar);
            }
        }
        wx wxVar2 = c;
        d2 d2Var = new d2(4, str);
        wxVar2.getClass();
        wxVar2.a(z, DatabaseHelper.COMPRESSED_COLUMN_NAME, d2Var);
        return wxVar;
    }
}
