package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface r5g {
    void onCommandSent(q5g q5gVar, String str, boolean z);

    void onConnect(q5g q5gVar);

    void onConnected(q5g q5gVar);

    void onDisconnectedSuccessfully(q5g q5gVar);

    void onFailedByException(q5g q5gVar, Throwable th);

    void onFailedByPings(q5g q5gVar);

    void onMessageReceived(q5g q5gVar, String str, boolean z);

    void onRestart(q5g q5gVar);

    void onTimeout(q5g q5gVar);
}
