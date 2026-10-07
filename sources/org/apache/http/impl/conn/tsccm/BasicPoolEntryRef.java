package org.apache.http.impl.conn.tsccm;

import defpackage.ore;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.routing.HttpRoute;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicPoolEntryRef extends WeakReference<BasicPoolEntry> {
    private final HttpRoute route;

    public BasicPoolEntryRef(BasicPoolEntry basicPoolEntry, ReferenceQueue<Object> referenceQueue) {
        super(basicPoolEntry, referenceQueue);
        if (basicPoolEntry != null) {
            this.route = basicPoolEntry.getPlannedRoute();
        } else {
            ore.p("Pool entry must not be null.");
            throw null;
        }
    }

    public final HttpRoute getRoute() {
        return this.route;
    }
}
