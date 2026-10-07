package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class gck implements eak {
    public final o8k a;
    public final Consumer b;

    public gck(o8k o8kVar, Consumer consumer) {
        this.a = o8kVar;
        this.b = consumer;
    }

    @Override // defpackage.eak
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.eak
    public final Consumer b() {
        return this.b;
    }

    @Override // defpackage.eak
    public final o8k c(int i) {
        return this.a;
    }
}
