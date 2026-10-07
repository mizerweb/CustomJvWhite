package defpackage;

import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pwd {
    public static final pwd c = new pwd();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final due a = new due(1);

    public final l3f a(Class cls) {
        l3f l3fVarW;
        Class cls2;
        wj8.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        l3f l3fVar = (l3f) concurrentHashMap.get(cls);
        if (l3fVar != null) {
            return l3fVar;
        }
        due dueVar = this.a;
        dueVar.getClass();
        Class cls3 = h.a;
        if (!d.class.isAssignableFrom(cls) && (cls2 = h.a) != null && !cls2.isAssignableFrom(cls)) {
            ore.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        i5e i5eVarA = ((ol9) dueVar.a).a(cls);
        if ((i5eVarA.d & 2) == 2) {
            if (d.class.isAssignableFrom(cls)) {
                l3fVarW = new g(h.d, ai6.a, i5eVarA.a);
            } else {
                i iVar = h.b;
                zh6 zh6Var = ai6.b;
                if (zh6Var == null) {
                    ore.k("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                l3fVarW = new g(iVar, zh6Var, i5eVarA.a);
            }
        } else if (d.class.isAssignableFrom(cls)) {
            l3fVarW = (i5eVarA.d & 1) == 1 ? f.w(i5eVarA, xfb.b, i79.b, h.d, ai6.a, hm9.b) : f.w(i5eVarA, xfb.b, i79.b, h.d, null, hm9.b);
        } else if ((i5eVarA.d & 1) == 1) {
            wfb wfbVar = xfb.a;
            g79 g79Var = i79.a;
            i iVar2 = h.b;
            zh6 zh6Var2 = ai6.b;
            if (zh6Var2 == null) {
                ore.k("Protobuf runtime is not correctly loaded.");
                return null;
            }
            l3fVarW = f.w(i5eVarA, wfbVar, g79Var, iVar2, zh6Var2, hm9.a);
        } else {
            l3fVarW = f.w(i5eVarA, xfb.a, i79.a, h.c, null, hm9.a);
        }
        l3f l3fVar2 = (l3f) concurrentHashMap.putIfAbsent(cls, l3fVarW);
        return l3fVar2 != null ? l3fVar2 : l3fVarW;
    }
}
