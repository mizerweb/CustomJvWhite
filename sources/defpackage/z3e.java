package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface z3e {
    boolean shouldHideSensitiveInformation();

    default boolean shouldThrottleSignalingLogs() {
        return true;
    }
}
