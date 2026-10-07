package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ark extends jsk implements axk {
    public ark(Map map) {
        super(map);
    }

    @Override // defpackage.axk
    public final List b(Object obj) {
        return (List) s(obj);
    }

    @Override // defpackage.jsk
    public /* bridge */ /* synthetic */ Collection n() {
        throw null;
    }

    @Override // defpackage.jsk
    public final /* synthetic */ Collection o() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.jsk
    public final Collection p(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // defpackage.jsk
    public final Collection q(Object obj, Collection collection) {
        return u(obj, (List) collection, null);
    }

    public final List y(Object obj) {
        return (List) t(obj);
    }
}
