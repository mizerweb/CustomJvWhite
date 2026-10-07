package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xja {
    public static final HashMap a;
    public static final xja b;
    public static final xja c;
    public static final xja d;
    public static final /* synthetic */ xja[] e;

    static {
        xja xjaVar = new xja("UNKNOWN", 0);
        b = xjaVar;
        xja xjaVar2 = new xja("EDITED", 1);
        xja xjaVar3 = new xja("REMOVED", 2);
        c = xjaVar3;
        xja xjaVar4 = new xja("DELAYED_FIRE_ERROR", 3);
        d = xjaVar4;
        e = new xja[]{xjaVar, xjaVar2, xjaVar3, xjaVar4};
        HashMap map = new HashMap(4);
        for (xja xjaVar5 : values()) {
            map.put(xjaVar5.name(), xjaVar5);
        }
        a = map;
    }

    public static xja valueOf(String str) {
        return (xja) Enum.valueOf(xja.class, str);
    }

    public static xja[] values() {
        return (xja[]) e.clone();
    }
}
