package com.google.mlkit.vision.common.internal;

import defpackage.j0b;
import defpackage.xwd;
import defpackage.yab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final Map a = new HashMap();

    /* JADX INFO: renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public interface InterfaceC0000a<DetectorT extends c, OptionsT extends b<DetectorT>> {
        DetectorT a(OptionsT optionst);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface b<DetectorT> {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface c {
    }

    public a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Class clsC = dVar.c();
            if (this.a.containsKey(clsC)) {
                int iA = dVar.a();
                Integer num = (Integer) map.get(clsC);
                yab.s(num);
                if (iA >= num.intValue()) {
                }
            }
            this.a.put(clsC, dVar.b());
            map.put(clsC, Integer.valueOf(dVar.a()));
        }
    }

    public static synchronized a b() {
        return (a) j0b.c().a(a.class);
    }

    public <DetectorT extends c, OptionsT extends b<DetectorT>> DetectorT a(OptionsT optionst) {
        xwd xwdVar = (xwd) this.a.get(optionst.getClass());
        yab.s(xwdVar);
        return (DetectorT) ((InterfaceC0000a) xwdVar.get()).a(optionst);
    }

    public static class d {
        private final Class a;
        private final xwd b;
        private final int c;

        public <DetectorT extends c, OptionsT extends b<DetectorT>> d(Class<? extends OptionsT> cls, xwd xwdVar, int i) {
            this.a = cls;
            this.b = xwdVar;
            this.c = i;
        }

        public final int a() {
            return this.c;
        }

        public final xwd b() {
            return this.b;
        }

        public final Class c() {
            return this.a;
        }

        public <DetectorT extends c, OptionsT extends b<DetectorT>> d(Class<? extends OptionsT> cls, xwd xwdVar) {
            this(cls, xwdVar, 100);
        }
    }
}
