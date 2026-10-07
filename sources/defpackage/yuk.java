package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class yuk extends msk {
    private final Object a;
    private int b;
    final /* synthetic */ evk c;

    public yuk(evk evkVar, int i) {
        this.c = evkVar;
        this.a = evk.j(evkVar, i);
        this.b = i;
    }

    private final void a() {
        int i = this.b;
        if (i == -1 || i >= this.c.size() || !qpk.a(this.a, evk.j(this.c, this.b))) {
            this.b = this.c.z(this.a);
        }
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object getValue() {
        Map mapO = this.c.o();
        if (mapO != null) {
            return mapO.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return evk.m(this.c, i);
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapO = this.c.o();
        if (mapO != null) {
            return mapO.put(this.a, obj);
        }
        a();
        int i = this.b;
        evk evkVar = this.c;
        if (i == -1) {
            evkVar.put(this.a, obj);
            return null;
        }
        Object objM = evk.m(evkVar, i);
        evk.q(evkVar, this.b, obj);
        return objM;
    }
}
