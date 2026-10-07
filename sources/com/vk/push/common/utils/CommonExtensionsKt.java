package com.vk.push.common.utils;

import defpackage.af7;
import defpackage.qf7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\n*\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "block", "multiLet", "(Ljava/lang/Object;Ljava/lang/Object;Lqf7;)Ljava/lang/Object;", "", "Lkotlin/Function0;", "Lsbi;", "ifTrue", "(ZLaf7;)Z", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CommonExtensionsKt {
    public static final boolean ifTrue(boolean z, af7 af7Var) {
        if (z) {
            af7Var.invoke();
        }
        return z;
    }

    public static final <T1, T2, R> R multiLet(T1 t1, T2 t2, qf7 qf7Var) {
        if (t1 == null || t2 == null) {
            return null;
        }
        return (R) qf7Var.invoke(t1, t2);
    }
}
