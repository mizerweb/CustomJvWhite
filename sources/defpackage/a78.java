package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a78 implements mq4 {
    public final /* synthetic */ nk2 a;
    public final /* synthetic */ w68 b;
    public final /* synthetic */ wfe c;

    public a78(nk2 nk2Var, w68 w68Var, wfe wfeVar) {
        this.a = nk2Var;
        this.b = w68Var;
        this.c = wfeVar;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        if (task.isCancelled() || task.isFaulted() || !((Boolean) task.getResult()).booleanValue()) {
            return task.isCancelled() ? Task.forResult(Boolean.FALSE) : (Task) this.c.a;
        }
        nk2 nk2Var = this.a;
        synchronized (nk2Var.a) {
            try {
                nk2Var.A();
                if (!nk2Var.d) {
                    nk2Var.d = true;
                    Iterator it = new ArrayList(nk2Var.b).iterator();
                    while (it.hasNext()) {
                        ((lk2) it.next()).l();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Task.forResult(Boolean.TRUE).continueWith(this.b);
    }
}
