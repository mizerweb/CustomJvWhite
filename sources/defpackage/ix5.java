package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ix5 {
    public static final String a = b(24, "video/hevc");
    public static final String b = b(24, "video/x-vnd.on2.vp9");
    public static final String c = b(29, "audio/opus");
    public static final String d = b(33, "video/dolby-vision");
    public static final String e = b(34, "video/av01");
    public static final String f = b(36, "video/apv");
    public static final ifh g = new ifh(new s35(9));
    public static final ifh h = new ifh(new s35(10));
    public static final ifh i = new ifh(new s35(11));

    public static d87 a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        Object linkedHashMap2 = linkedHashMap.get(0);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(0, linkedHashMap2);
        }
        new mf(i2, (Map) linkedHashMap2, 6).A(xw3.Q0(d), (List) h.getValue());
        return new d87(linkedHashMap);
    }

    public static String b(int i2, String str) {
        if (Build.VERSION.SDK_INT >= i2) {
            return str;
        }
        return null;
    }
}
