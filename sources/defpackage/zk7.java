package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class zk7 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public zk7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x0267  */
    /* JADX WARN: Code duplicated, block: B:103:0x026b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:81:0x020c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0215  */
    /* JADX WARN: Code duplicated, block: B:85:0x021d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0237  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0243  */
    /* JADX WARN: Code duplicated, block: B:95:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    public final ArrayList a() {
        int i;
        int iY;
        int i2;
        ExecutorService executorService;
        int poolSize;
        int activeCount;
        ExecutorService executorService2;
        int i3;
        ExecutorService executorService3;
        ExecutorService executorService4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ny8 ny8Var = this.a;
        for (Map.Entry entry : ((a2c) ny8Var.getValue()).g.entrySet()) {
            linkedHashMap.put(((od6) entry.getKey()).a, (ExecutorService) entry.getValue());
        }
        ScheduledExecutorService scheduledExecutorServiceF = ((b78) this.b.getValue()).k.i.f();
        if (scheduledExecutorServiceF != null) {
            linkedHashMap.put("frsc-sch", scheduledExecutorServiceF);
        }
        linkedHashMap.put("pend_tsk", ((twe) this.c.getValue()).a);
        linkedHashMap.put("sync-chat-history", (ScheduledExecutorService) ((rjf) this.d.getValue()).a.getValue());
        linkedHashMap.put("srvc-rqst", ((mle) this.e.getValue()).a);
        ny8 ny8Var2 = this.f;
        Executor executor = (Executor) ((w6c) ny8Var2.getValue()).d.getValue();
        Executor executor2 = (Executor) ((w6c) ny8Var2.getValue()).e.getValue();
        if (executor != ((a2c) ny8Var.getValue()).c() && (executor instanceof ExecutorService)) {
            linkedHashMap.put("room-query", executor);
        }
        if (executor2 instanceof ExecutorService) {
            linkedHashMap.put("room-tx", executor2);
        }
        int size = linkedHashMap.size();
        List listSingletonList = r66.a;
        if (size != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    arrayList.add(new ylc(entry2.getKey(), entry2.getValue()));
                    do {
                        Map.Entry entry3 = (Map.Entry) it.next();
                        arrayList.add(new ylc(entry3.getKey(), entry3.getValue()));
                    } while (it.hasNext());
                    listSingletonList = arrayList;
                } else {
                    listSingletonList = Collections.singletonList(new ylc(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        List<ylc> listM1 = ww3.M1(listSingletonList, new lv5(26));
        ArrayList arrayList2 = new ArrayList(yw3.W0(listM1, 10));
        for (ylc ylcVar : listM1) {
            String str = (String) ylcVar.a;
            ExecutorService executorService5 = (ExecutorService) ylcVar.b;
            boolean z = executorService5 instanceof ce6;
            long completedTaskCount = -1;
            if (z) {
                ExecutorService executorService6 = ((ce6) executorService5).a;
                if (executorService6 instanceof ThreadPoolExecutor) {
                    completedTaskCount = ((ThreadPoolExecutor) executorService6).getCompletedTaskCount();
                }
            } else if (executorService5 instanceof ThreadPoolExecutor) {
                completedTaskCount = ((ThreadPoolExecutor) executorService5).getCompletedTaskCount();
            } else if (executorService5 instanceof ah5) {
                ExecutorService executorService7 = ((ah5) executorService5).a;
                if (executorService7 instanceof ce6) {
                    ExecutorService executorService8 = ((ce6) executorService7).a;
                    if (executorService8 instanceof ThreadPoolExecutor) {
                        completedTaskCount = ((ThreadPoolExecutor) executorService8).getCompletedTaskCount();
                    }
                } else if (executorService7 instanceof ThreadPoolExecutor) {
                    completedTaskCount = ((ThreadPoolExecutor) executorService7).getCompletedTaskCount();
                }
            }
            long j = completedTaskCount;
            int size2 = -1;
            if (z) {
                iY = ((ce6) executorService5).y();
            } else if (executorService5 instanceof ThreadPoolExecutor) {
                iY = ((ThreadPoolExecutor) executorService5).getActiveCount();
            } else {
                if (executorService5 instanceof ah5) {
                    ExecutorService executorService9 = ((ah5) executorService5).a;
                    iY = executorService9 instanceof ce6 ? ((ce6) executorService9).y() : executorService9 instanceof ThreadPoolExecutor ? ((ThreadPoolExecutor) executorService9).getActiveCount() : -1;
                } else {
                    i = -1;
                }
                if (z) {
                    executorService4 = ((ce6) executorService5).a;
                    if (executorService4 instanceof ThreadPoolExecutor) {
                        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService4;
                        poolSize = threadPoolExecutor.getPoolSize();
                        activeCount = threadPoolExecutor.getActiveCount();
                        i3 = poolSize - activeCount;
                    } else {
                        i3 = -1;
                    }
                    i2 = i3;
                } else {
                    if (executorService5 instanceof ThreadPoolExecutor) {
                        ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) executorService5;
                        poolSize = threadPoolExecutor2.getPoolSize();
                        activeCount = threadPoolExecutor2.getActiveCount();
                    } else if (executorService5 instanceof ah5) {
                        executorService = ((ah5) executorService5).a;
                        if (executorService instanceof ce6) {
                            executorService2 = ((ce6) executorService).a;
                            if (executorService2 instanceof ThreadPoolExecutor) {
                                ThreadPoolExecutor threadPoolExecutor3 = (ThreadPoolExecutor) executorService2;
                                poolSize = threadPoolExecutor3.getPoolSize();
                                activeCount = threadPoolExecutor3.getActiveCount();
                            } else {
                                i3 = -1;
                            }
                        } else if (executorService instanceof ThreadPoolExecutor) {
                            ThreadPoolExecutor threadPoolExecutor4 = (ThreadPoolExecutor) executorService;
                            poolSize = threadPoolExecutor4.getPoolSize();
                            activeCount = threadPoolExecutor4.getActiveCount();
                        } else {
                            i3 = -1;
                        }
                        i2 = i3;
                    } else {
                        i2 = -1;
                    }
                    i3 = poolSize - activeCount;
                    i2 = i3;
                }
                if (z) {
                    size2 = ((ce6) executorService5).A();
                } else if (executorService5 instanceof ThreadPoolExecutor) {
                    size2 = ((ThreadPoolExecutor) executorService5).getQueue().size();
                } else if (executorService5 instanceof ah5) {
                    executorService3 = ((ah5) executorService5).a;
                    if (executorService3 instanceof ce6) {
                        size2 = ((ce6) executorService3).A();
                    } else if (executorService3 instanceof ThreadPoolExecutor) {
                        size2 = ((ThreadPoolExecutor) executorService3).getQueue().size();
                    }
                }
                arrayList2.add(new de6(str, i2, j, i, size2, executorService5.isShutdown(), executorService5.isTerminated()));
            }
            i = iY;
            if (z) {
                executorService4 = ((ce6) executorService5).a;
                if (executorService4 instanceof ThreadPoolExecutor) {
                    ThreadPoolExecutor threadPoolExecutor5 = (ThreadPoolExecutor) executorService4;
                    poolSize = threadPoolExecutor5.getPoolSize();
                    activeCount = threadPoolExecutor5.getActiveCount();
                    i3 = poolSize - activeCount;
                } else {
                    i3 = -1;
                }
                i2 = i3;
            } else {
                if (executorService5 instanceof ThreadPoolExecutor) {
                    ThreadPoolExecutor threadPoolExecutor6 = (ThreadPoolExecutor) executorService5;
                    poolSize = threadPoolExecutor6.getPoolSize();
                    activeCount = threadPoolExecutor6.getActiveCount();
                } else if (executorService5 instanceof ah5) {
                    executorService = ((ah5) executorService5).a;
                    if (executorService instanceof ce6) {
                        executorService2 = ((ce6) executorService).a;
                        if (executorService2 instanceof ThreadPoolExecutor) {
                            ThreadPoolExecutor threadPoolExecutor7 = (ThreadPoolExecutor) executorService2;
                            poolSize = threadPoolExecutor7.getPoolSize();
                            activeCount = threadPoolExecutor7.getActiveCount();
                        } else {
                            i3 = -1;
                        }
                    } else if (executorService instanceof ThreadPoolExecutor) {
                        ThreadPoolExecutor threadPoolExecutor8 = (ThreadPoolExecutor) executorService;
                        poolSize = threadPoolExecutor8.getPoolSize();
                        activeCount = threadPoolExecutor8.getActiveCount();
                    } else {
                        i3 = -1;
                    }
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                i3 = poolSize - activeCount;
                i2 = i3;
            }
            if (z) {
                size2 = ((ce6) executorService5).A();
            } else if (executorService5 instanceof ThreadPoolExecutor) {
                size2 = ((ThreadPoolExecutor) executorService5).getQueue().size();
            } else if (executorService5 instanceof ah5) {
                executorService3 = ((ah5) executorService5).a;
                if (executorService3 instanceof ce6) {
                    size2 = ((ce6) executorService3).A();
                } else if (executorService3 instanceof ThreadPoolExecutor) {
                    size2 = ((ThreadPoolExecutor) executorService3).getQueue().size();
                }
            }
            arrayList2.add(new de6(str, i2, j, i, size2, executorService5.isShutdown(), executorService5.isTerminated()));
        }
        return arrayList2;
    }
}
