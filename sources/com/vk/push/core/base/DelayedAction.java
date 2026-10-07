package com.vk.push.core.base;

import defpackage.af7;
import defpackage.ao5;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.j95;
import defpackage.lq4;
import defpackage.sgg;
import defpackage.vq;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/push/core/base/DelayedAction;", "", "Lgu4;", "scope", "Lkotlin/Function0;", "Lsbi;", "action", "<init>", "(Lgu4;Laf7;)V", "", "delayMillis", "runWithDelay", "(J)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DelayedAction {
    public final gu4 a;
    public final af7 b;
    public sgg c;

    public DelayedAction(gu4 gu4Var, af7 af7Var, int i, j95 j95Var) {
        this((i & 1) != 0 ? cqk.a(ao5.b.R0(1, null)) : gu4Var, af7Var);
    }

    public final void runWithDelay(long delayMillis) {
        DelayedAction delayedAction;
        Throwable th;
        synchronized (this) {
            try {
                sgg sggVar = this.c;
                lq4 lq4Var = null;
                if (sggVar != null) {
                    try {
                        sggVar.b(null);
                    } catch (Throwable th2) {
                        th = th2;
                        delayedAction = this;
                        throw th;
                    }
                }
                delayedAction = this;
                try {
                    delayedAction.c = yab.i0(this.a, null, 0, new vq(delayMillis, delayedAction, lq4Var, 24), 3);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                delayedAction = this;
            }
        }
    }

    public DelayedAction(gu4 gu4Var, af7 af7Var) {
        this.a = gu4Var;
        this.b = af7Var;
    }
}
