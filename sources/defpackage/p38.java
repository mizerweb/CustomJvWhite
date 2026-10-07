package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class p38 {
    public static final Pattern e = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern f = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern g = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final y3e a;
    public long c;
    public boolean d = false;
    public final HashMap b = new HashMap();

    public p38(y3e y3eVar) {
        this.a = y3eVar;
        for (lgk lgkVar : lgk.values()) {
            this.b.put(lgkVar, 0);
        }
    }
}
