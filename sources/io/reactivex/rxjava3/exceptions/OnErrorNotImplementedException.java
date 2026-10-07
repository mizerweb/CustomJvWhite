package io.reactivex.rxjava3.exceptions;

import defpackage.zo5;

/* JADX INFO: loaded from: classes2.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th) {
        super(zo5.r("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th), th == null ? new NullPointerException() : th);
    }
}
