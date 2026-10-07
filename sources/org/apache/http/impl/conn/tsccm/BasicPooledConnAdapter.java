package org.apache.http.impl.conn.tsccm;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.AbstractPooledConnAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicPooledConnAdapter extends AbstractPooledConnAdapter {
    public BasicPooledConnAdapter(ThreadSafeClientConnManager threadSafeClientConnManager, AbstractPoolEntry abstractPoolEntry) {
        super(threadSafeClientConnManager, abstractPoolEntry);
        markReusable();
    }

    @Override // org.apache.http.impl.conn.AbstractPooledConnAdapter, org.apache.http.impl.conn.AbstractClientConnAdapter
    public void detach() {
        super.detach();
    }

    @Override // org.apache.http.impl.conn.AbstractClientConnAdapter
    public ClientConnectionManager getManager() {
        return super.getManager();
    }

    public AbstractPoolEntry getPoolEntry() {
        return this.poolEntry;
    }
}
