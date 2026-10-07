package com.my.tracker.core.o;

import com.my.tracker.core.AsyncCore;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.Consumer;
import defpackage.o90;

/* JADX INFO: loaded from: classes.dex */
public final class h implements AsyncCore {
    private boolean a = true;
    private EngineCore b;

    private h() {
    }

    public /* synthetic */ void a(Consumer consumer) {
        EngineCore engineCore = this.b;
        if (engineCore != null) {
            consumer.accept(engineCore);
            return;
        }
        Tracer.e("Internal error: engineCore is null, unable to execute command " + consumer);
    }

    public void b() {
        this.a = false;
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onEngineWorker(Runnable runnable) {
        if (this.a) {
            g.b(runnable);
        }
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onEngineWorkerWithEngineCore(Consumer consumer) {
        onEngineWorker(new o90(this, 29, consumer));
    }

    @Override // com.my.tracker.core.AsyncCore
    public void onUi(Runnable runnable) {
        g.c(runnable);
    }

    public static h a() {
        return new h();
    }

    public void a(EngineCore engineCore) {
        this.b = engineCore;
    }
}
