package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class hck implements eak {
    public int a;
    public Function b;
    public Consumer c;

    @Override // defpackage.eak
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eak
    public final Consumer b() {
        return this.c;
    }

    @Override // defpackage.eak
    public final o8k c(int i) {
        return (o8k) this.b.apply(Integer.valueOf(i));
    }
}
