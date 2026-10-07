package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p6l implements x76 {
    private static final zpb d = new zpb() { // from class: m6l
        @Override // defpackage.v76
        public final void a(Object obj, Object obj2) {
            int i = p6l.e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    public static final /* synthetic */ int e = 0;
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final zpb c = d;

    public final /* bridge */ /* synthetic */ x76 a(Class cls, jri jriVar) {
        this.b.put(cls, jriVar);
        this.a.remove(cls);
        return this;
    }

    public final s6l b() {
        return new s6l(new HashMap(this.a), new HashMap(this.b), this.c);
    }

    @Override // defpackage.x76
    public final /* bridge */ /* synthetic */ x76 h(Class cls, zpb zpbVar) {
        this.a.put(cls, zpbVar);
        this.b.remove(cls);
        return this;
    }
}
