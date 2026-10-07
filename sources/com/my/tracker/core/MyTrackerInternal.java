package com.my.tracker.core;

import android.util.Pair;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.Consumer;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: loaded from: classes.dex */
public final class MyTrackerInternal {
    public static final String INIT_ERROR = "MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first";
    private static final Object a = new Object();
    private static LinkedTransferQueue b = new LinkedTransferQueue();
    private static LinkedTransferQueue c = new LinkedTransferQueue();

    public static void a(EngineMiniCore engineMiniCore) {
        Pair pair;
        do {
            synchronized (a) {
                try {
                    LinkedTransferQueue linkedTransferQueue = b;
                    if (linkedTransferQueue == null) {
                        return;
                    }
                    pair = (Pair) linkedTransferQueue.poll();
                    if (pair == null) {
                        b = null;
                    }
                    if (pair != null) {
                        try {
                            ((Consumer) pair.second).accept(engineMiniCore);
                        } catch (Throwable th) {
                            Tracer.e("MyTracker error: module " + ((String) pair.first) + " mini-init block exception: " + th, th);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (pair != null);
    }

    public static void registerInit(String str, Consumer<EngineMiniCore> consumer, BiConsumer<EngineCore, MyTrackerActivityHandler> biConsumer) {
        if (consumer == null && biConsumer == null) {
            Tracer.e("MyTracker: registerInit error - double null, module=" + str);
            return;
        }
        synchronized (a) {
            if (consumer != null) {
                try {
                    LinkedTransferQueue linkedTransferQueue = b;
                    if (linkedTransferQueue != null) {
                        linkedTransferQueue.put(Pair.create(str, consumer));
                    } else {
                        Tracer.e("MyTracker error: too late init, ignore module " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (biConsumer != null) {
                LinkedTransferQueue linkedTransferQueue2 = c;
                if (linkedTransferQueue2 != null) {
                    linkedTransferQueue2.put(Pair.create(str, biConsumer));
                } else {
                    Tracer.e("MyTracker error: too late init, ignore module " + str);
                }
            }
        }
    }

    public static void a(b bVar, MyTrackerActivityHandler myTrackerActivityHandler) {
        Pair pair;
        do {
            synchronized (a) {
                try {
                    LinkedTransferQueue linkedTransferQueue = c;
                    if (linkedTransferQueue == null) {
                        return;
                    }
                    pair = (Pair) linkedTransferQueue.poll();
                    if (pair == null) {
                        c = null;
                    }
                    if (pair != null) {
                        try {
                            ((BiConsumer) pair.second).accept(bVar, myTrackerActivityHandler);
                        } catch (Throwable th) {
                            Tracer.e("MyTracker error: module " + ((String) pair.first) + " init block exception: " + th, th);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (pair != null);
    }
}
