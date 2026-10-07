package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class so4 extends zq0 {
    public final List b;

    public so4(long j) {
        this.b = Collections.singletonList(Long.valueOf(j));
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "ContactsUpdateEvent{idList=" + this.b + '}';
    }

    public so4(Collection collection) {
        this.b = new ArrayList(collection);
    }

    public so4(long j, Collection collection) {
        super(j);
        this.b = new ArrayList(collection);
    }
}
