package ru.ok.android.onelog;

import defpackage.no;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/onelog/OneLogImplProxy;", "", "<init>", "()V", "", "collector", "Lno;", "apiClient", "(Ljava/lang/String;)Lno;", "getApplicationParam", "()Ljava/lang/String;", "applicationParam", "one-video-stat-transport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneLogImplProxy {
    public static final OneLogImplProxy INSTANCE = new OneLogImplProxy();

    private OneLogImplProxy() {
    }

    public final no apiClient(String collector) {
        return OneLogImpl.getInstance().getApiClient(collector);
    }

    public final String getApplicationParam() {
        return OneLogImpl.getInstance().getApplicationParam();
    }
}
