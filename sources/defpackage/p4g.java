package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface p4g {
    void dispose();

    void registerListener(o4g o4gVar);

    void restart(String str, Long l);

    void send(String str);

    void tryReconnectNow();

    j4i type();

    void updateActivityTimeout(long j);
}
