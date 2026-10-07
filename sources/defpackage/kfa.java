package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface kfa {
    default void c(MotionEvent motionEvent, int[] iArr) {
    }

    default boolean f(MotionEvent motionEvent) {
        return false;
    }

    default yu3 j(MotionEvent motionEvent) {
        return null;
    }

    default boolean l(MotionEvent motionEvent) {
        return false;
    }

    boolean y(MotionEvent motionEvent);
}
