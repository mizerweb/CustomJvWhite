package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class v0f {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final a1f e;

    public v0f(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a1f() { // from class: u0f
            @Override // defpackage.a1f
            public final Bundle a() {
                return v0f.a(this.a);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static Bundle a(v0f v0fVar) {
        LinkedHashMap linkedHashMap = v0fVar.a;
        for (Map.Entry entry : wm9.X0(v0fVar.b).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((a1f) entry.getValue()).a();
            if (bundleA != null) {
                int i = 0;
                while (true) {
                    if (i >= 29) {
                        c.f(bundleA.getClass(), " into saved state", "Can't put value with type ");
                        return null;
                    }
                    if (f[i].isInstance(bundleA)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj = v0fVar.c.get(str);
            g8b g8bVar = obj instanceof g8b ? (g8b) obj : null;
            if (g8bVar != null) {
                g8bVar.k(bundleA);
            } else {
                linkedHashMap.put(str, bundleA);
            }
            f9b f9bVar = (f9b) v0fVar.d.get(str);
            if (f9bVar != null) {
                f9bVar.setValue(bundleA);
            }
        }
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str2 : setKeySet) {
            arrayList.add(str2);
            arrayList2.add(linkedHashMap.get(str2));
        }
        return n1g.i(new ylc(ApiProtocol.PARAM_KEYS, arrayList), new ylc("values", arrayList2));
    }

    public final a1f b() {
        return this.e;
    }

    public v0f() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a1f() { // from class: u0f
            @Override // defpackage.a1f
            public final Bundle a() {
                return v0f.a(this.a);
            }
        };
    }
}
