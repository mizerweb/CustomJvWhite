package ru.ok.android.externcalls.sdk.util;

import defpackage.af7;
import defpackage.b8g;
import defpackage.f8g;
import defpackage.i3f;
import defpackage.ko5;
import defpackage.p64;
import defpackage.q8g;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.th;
import defpackage.tre;
import defpackage.y42;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Lkotlin/Function0;", "Lsg4;", "onSuccess", "Ljava/lang/Runnable;", "onError", "Lko5;", "executeOnIoThread", "(Laf7;Lsg4;Ljava/lang/Runnable;)Lko5;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class CallsThreadUtilsKt {

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt$executeOnIoThread$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass2 implements rg4 {
        public AnonymousClass2() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(T t) {
            sg4Var.accept(t);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt$executeOnIoThread$3 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass3<T> implements rg4 {
        final /* synthetic */ Runnable $onError;

        public AnonymousClass3() {
            runnable = runnable;
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            Runnable runnable = runnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static final <T> ko5 executeOnIoThread(af7 af7Var, sg4 sg4Var, Runnable runnable) {
        return new q8g(new p64(2, new y42(3, af7Var)).j(i3f.b()), th.a(), 0).g(new rg4() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.2
            public AnonymousClass2() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(T t) {
                sg4Var.accept(t);
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.3
            final /* synthetic */ Runnable $onError;

            public AnonymousClass3() {
                runnable = runnable;
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public static final void executeOnIoThread$lambda$0(af7 af7Var, f8g f8gVar) {
        try {
            ((b8g) f8gVar).a(af7Var.invoke());
        } catch (Throwable th) {
            if (((b8g) f8gVar).d(th)) {
                return;
            }
            tre.s0(th);
        }
    }
}
