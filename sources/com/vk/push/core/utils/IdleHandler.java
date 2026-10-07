package com.vk.push.core.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.af7;
import defpackage.eq0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/utils/IdleHandler;", "", "Lkotlin/Function0;", "Lsbi;", "task", "post", "(Laf7;)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IdleHandler {
    public static final IdleHandler INSTANCE = new IdleHandler();

    public final void post(af7 task) {
        new Handler(Looper.getMainLooper()).post(new eq0(5, task));
    }
}
