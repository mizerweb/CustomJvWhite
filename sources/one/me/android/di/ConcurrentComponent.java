package one.me.android.di;

import defpackage.a2c;
import defpackage.s5;
import defpackage.xhh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lone/me/android/di/ConcurrentComponent;", "Ls5;", "<init>", "()V", "La2c;", "getExecutors", "()La2c;", "executors", "Lxhh;", "getDispatchers", "()Lxhh;", "dispatchers", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConcurrentComponent extends s5 {
    public static final ConcurrentComponent INSTANCE = new ConcurrentComponent();

    private ConcurrentComponent() {
        super(2);
    }

    public final xhh getDispatchers() {
        return (xhh) getAccessor().c(23);
    }

    public final a2c getExecutors() {
        return (a2c) getAccessor().c(27);
    }
}
