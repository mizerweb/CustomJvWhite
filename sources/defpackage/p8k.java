package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class p8k implements Supplier {
    public long a;

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        long j = this.a;
        this.a = j - 1;
        return Long.valueOf(j);
    }
}
