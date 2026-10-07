package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gx5 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        fx5 fx5Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        fx5 fx5Var2 = fx5.d;
        linkedHashMap.put(1L, fx5Var2);
        linkedHashMap2.put(fx5Var2, Collections.singletonList(1L));
        linkedHashMap.put(2L, fx5.e);
        linkedHashMap2.put(linkedHashMap.get(2L), Collections.singletonList(2L));
        fx5 fx5Var3 = fx5.f;
        linkedHashMap.put(4L, fx5Var3);
        linkedHashMap2.put(fx5Var3, Collections.singletonList(4L));
        fx5 fx5Var4 = fx5.g;
        linkedHashMap.put(8L, fx5Var4);
        linkedHashMap2.put(fx5Var4, Collections.singletonList(8L));
        List listP0 = xw3.P0(64L, 128L, 16L, 32L);
        Iterator it = listP0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fx5Var = fx5.h;
            if (!zHasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), fx5Var);
        }
        b.put(fx5Var, listP0);
        List listP1 = xw3.P0(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = listP1.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            fx5 fx5Var5 = fx5.i;
            if (!zHasNext2) {
                b.put(fx5Var5, listP1);
                return;
            } else {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), fx5Var5);
            }
        }
    }

    public static Long a(fx5 fx5Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List list = (List) b.get(fx5Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
