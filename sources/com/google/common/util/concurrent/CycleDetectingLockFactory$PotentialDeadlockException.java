package com.google.common.util.concurrent;

import defpackage.a05;
import defpackage.b05;
import defpackage.u98;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        u98.l(new Object[]{b05.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", a05.class.getName()}, 3);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
