package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface op {
    default boolean canRepeat() {
        return true;
    }

    default int getPriority() {
        return 16;
    }

    up getScope();

    Uri getUri();

    default boolean shouldNeverGzip() {
        return false;
    }

    default boolean shouldNeverPost() {
        return false;
    }

    default boolean willWriteParams() {
        return true;
    }

    default boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(mv8 mv8Var);

    default void writeSupplyParams(mv8 mv8Var) {
    }
}
