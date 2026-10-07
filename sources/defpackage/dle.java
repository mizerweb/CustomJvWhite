package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dle {
    public final k28 a;
    public final String b;
    public final hu7 c;
    public final hle d;
    public final Map e;
    public h71 f;

    public dle(k28 k28Var, String str, hu7 hu7Var, hle hleVar, Map map) {
        this.a = k28Var;
        this.b = str;
        this.c = hu7Var;
        this.d = hleVar;
        this.e = map;
    }

    public final ag5 a() {
        ag5 ag5Var = new ag5();
        ag5Var.e = new LinkedHashMap();
        ag5Var.a = this.a;
        ag5Var.b = this.b;
        ag5Var.d = this.d;
        Map map = this.e;
        ag5Var.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        ag5Var.c = this.c.c();
        return ag5Var;
    }

    public final k28 b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        hu7 hu7Var = this.c;
        if (hu7Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = hu7Var.iterator();
            int i = 0;
            while (true) {
                y1 y1Var = (y1) it;
                if (!y1Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = y1Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    xw3.V0();
                    throw null;
                }
                ylc ylcVar = (ylc) next;
                String str = (String) ylcVar.a;
                String str2 = (String) ylcVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
