package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ft8 implements x76 {
    public static final dt8 f;
    public static final dt8 g;
    public final HashMap a;
    public final HashMap b;
    public final ct8 c;
    public boolean d;
    public static final ct8 e = new ct8(0);
    public static final et8 h = new et8();

    /* JADX WARN: Type inference failed for: r0v1, types: [dt8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dt8] */
    static {
        final int i = 0;
        f = new jri() { // from class: dt8
            @Override // defpackage.v76
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((kri) obj2).b((String) obj);
                        break;
                    default:
                        ((kri) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new jri() { // from class: dt8
            @Override // defpackage.v76
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((kri) obj2).b((String) obj);
                        break;
                    default:
                        ((kri) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public ft8() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // defpackage.x76
    public final x76 h(Class cls, zpb zpbVar) {
        this.a.put(cls, zpbVar);
        this.b.remove(cls);
        return this;
    }
}
