package org.apache.http.impl.conn.tsccm;

import defpackage.ore;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ConnPoolByRoute extends AbstractConnPool {
    private final ConnPerRoute connPerRoute;
    protected Queue<BasicPoolEntry> freeConnections;
    private final Log log = LogFactory.getLog(getClass());
    protected final int maxTotalConnections;
    protected final ClientConnectionOperator operator;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected Queue<WaitingThread> waitingThreads;

    /* JADX INFO: renamed from: org.apache.http.impl.conn.tsccm.ConnPoolByRoute$1 */
    public class AnonymousClass1 implements PoolEntryRequest {
        final /* synthetic */ WaitingThreadAborter val$aborter;
        final /* synthetic */ HttpRoute val$route;
        final /* synthetic */ Object val$state;

        public AnonymousClass1() {
            waitingThreadAborter = waitingThreadAborter;
            httpRoute = httpRoute;
            obj = obj;
        }

        @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
        public void abortRequest() {
            ConnPoolByRoute.this.poolLock.lock();
            try {
                waitingThreadAborter.abort();
            } finally {
                ConnPoolByRoute.this.poolLock.unlock();
            }
        }

        @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
        public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
            return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        if (clientConnectionOperator == null) {
            ore.p("Connection operator may not be null");
            throw null;
        }
        this.operator = clientConnectionOperator;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.maxTotalConnections = ConnManagerParams.getMaxTotalConnections(httpParams);
        this.connPerRoute = ConnManagerParams.getMaxConnectionsPerRoute(httpParams);
    }

    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.refQueue);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.issuedConnections.add(basicPoolEntry.getWeakRef());
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry.getConnection());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
            this.idleConnHandler.remove(basicPoolEntry.getConnection());
        } finally {
            this.poolLock.unlock();
        }
    }

    public void deleteLeastUsedEntry() {
        try {
            this.poolLock.lock();
            BasicPoolEntry basicPoolEntryRemove = this.freeConnections.remove();
            if (basicPoolEntryRemove != null) {
                deleteEntry(basicPoolEntryRemove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete.");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Freeing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                closeConnection(basicPoolEntry.getConnection());
            } else {
                this.issuedConnections.remove(basicPoolEntry.getWeakRef());
                RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
                if (z) {
                    routePool.freeEntry(basicPoolEntry);
                    this.freeConnections.add(basicPoolEntry);
                    this.idleConnHandler.add(basicPoolEntry.getConnection(), j, timeUnit);
                } else {
                    routePool.dropEntry();
                    this.numConnections--;
                }
                notifyWaitingThread(routePool);
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            return routePool != null ? routePool.getEntryCount() : 0;
        } finally {
            this.poolLock.unlock();
        }
    }

    public BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) throws ConnectionPoolTimeoutException, InterruptedException {
        Date date;
        BasicPoolEntry freeEntry = null;
        if (j > 0) {
            date = new Date(timeUnit.toMillis(j) + System.currentTimeMillis());
        } else {
            date = null;
        }
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThreadNewWaitingThread = null;
            while (freeEntry == null) {
                if (this.isShutDown) {
                    throw new IllegalStateException("Connection pool shut down.");
                }
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Total connections kept alive: " + this.freeConnections.size());
                    this.log.debug("Total issued connections: " + this.issuedConnections.size());
                    this.log.debug("Total allocated connection: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                freeEntry = getFreeEntry(routePool, obj);
                if (freeEntry != null) {
                    break;
                }
                boolean z = routePool.getCapacity() > 0;
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                }
                if (z && this.numConnections < this.maxTotalConnections) {
                    freeEntry = createEntry(routePool, this.operator);
                } else if (!z || this.freeConnections.isEmpty()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                    }
                    if (waitingThreadNewWaitingThread == null) {
                        waitingThreadNewWaitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThreadNewWaitingThread);
                    }
                    try {
                        routePool.queueThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.add(waitingThreadNewWaitingThread);
                        boolean zAwait = waitingThreadNewWaitingThread.await(date);
                        routePool.removeThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.remove(waitingThreadNewWaitingThread);
                        if (!zAwait && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                        }
                    } catch (Throwable th) {
                        routePool.removeThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.remove(waitingThreadNewWaitingThread);
                        throw th;
                    }
                } else {
                    deleteLeastUsedEntry();
                    freeEntry = createEntry(routePool, this.operator);
                }
            }
            this.poolLock.unlock();
            return freeEntry;
        } catch (Throwable th2) {
            this.poolLock.unlock();
            throw th2;
        }
    }

    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        BasicPoolEntry basicPoolEntryAllocEntry = null;
        boolean z = false;
        while (!z) {
            try {
                basicPoolEntryAllocEntry = routeSpecificPool.allocEntry(obj);
                Log log = this.log;
                if (basicPoolEntryAllocEntry != null) {
                    if (log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntryAllocEntry);
                    if (this.idleConnHandler.remove(basicPoolEntryAllocEntry.getConnection())) {
                        this.issuedConnections.add(basicPoolEntryAllocEntry.getWeakRef());
                    } else {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntryAllocEntry.getConnection());
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    }
                } else if (log.isDebugEnabled()) {
                    this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z = true;
            } catch (Throwable th) {
                this.poolLock.unlock();
                throw th;
            }
        }
        this.poolLock.unlock();
        return basicPoolEntryAllocEntry;
    }

    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPoolNewRouteSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPoolNewRouteSpecificPool == null && z) {
                routeSpecificPoolNewRouteSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPoolNewRouteSpecificPool);
            }
            return routeSpecificPoolNewRouteSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute.getMaxForRoute(httpRoute));
    }

    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:24:0x0069, B:12:0x0039, B:15:0x0043, B:17:0x0049, B:18:0x0050, B:19:0x0059, B:21:0x005f), top: B:29:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:24:0x0069, B:12:0x0039, B:15:0x0043, B:17:0x0049, B:18:0x0050, B:19:0x0059, B:21:0x005f), top: B:29:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:24:0x0069, B:12:0x0039, B:15:0x0043, B:17:0x0049, B:18:0x0050, B:19:0x0059, B:21:0x005f), top: B:29:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:24:0x0069, B:12:0x0039, B:15:0x0043, B:17:0x0049, B:18:0x0050, B:19:0x0059, B:21:0x005f), top: B:29:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:24:0x0069, B:12:0x0039, B:15:0x0043, B:17:0x0049, B:18:0x0050, B:19:0x0059, B:21:0x005f), top: B:29:0x0009 }] */
    public void notifyWaitingThread(RouteSpecificPool routeSpecificPool) {
        WaitingThread waitingThreadNextThread;
        boolean zIsEmpty;
        Log log;
        this.poolLock.lock();
        if (routeSpecificPool != null) {
            try {
                if (routeSpecificPool.hasThread()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Notifying thread waiting on pool [" + routeSpecificPool.getRoute() + "]");
                    }
                    waitingThreadNextThread = routeSpecificPool.nextThread();
                } else {
                    zIsEmpty = this.waitingThreads.isEmpty();
                    log = this.log;
                    if (zIsEmpty) {
                        if (log.isDebugEnabled()) {
                            this.log.debug("Notifying no-one, there are no waiting threads");
                        }
                        waitingThreadNextThread = null;
                    } else {
                        if (log.isDebugEnabled()) {
                            this.log.debug("Notifying thread waiting on any pool");
                        }
                        waitingThreadNextThread = this.waitingThreads.remove();
                    }
                }
            } finally {
                this.poolLock.unlock();
            }
        } else {
            zIsEmpty = this.waitingThreads.isEmpty();
            log = this.log;
            if (zIsEmpty) {
                if (log.isDebugEnabled()) {
                    this.log.debug("Notifying thread waiting on any pool");
                }
                waitingThreadNextThread = this.waitingThreads.remove();
            } else {
                if (log.isDebugEnabled()) {
                    this.log.debug("Notifying no-one, there are no waiting threads");
                }
                waitingThreadNextThread = null;
            }
        }
        if (waitingThreadNextThread != null) {
            waitingThreadNextThread.wakeup();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new PoolEntryRequest() { // from class: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.1
            final /* synthetic */ WaitingThreadAborter val$aborter;
            final /* synthetic */ HttpRoute val$route;
            final /* synthetic */ Object val$state;

            public AnonymousClass1() {
                waitingThreadAborter = waitingThreadAborter;
                httpRoute = httpRoute;
                obj = obj;
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
            }
        };
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            super.shutdown();
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next.getConnection());
            }
            Iterator<WaitingThread> it2 = this.waitingThreads.iterator();
            while (it2.hasNext()) {
                WaitingThread next2 = it2.next();
                it2.remove();
                next2.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }
}
