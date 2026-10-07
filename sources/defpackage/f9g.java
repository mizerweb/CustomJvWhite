package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f9g {
    public final /* synthetic */ j9b a;
    public final /* synthetic */ sfe b;
    public final /* synthetic */ wfe c;
    public final /* synthetic */ m9g d;

    public f9g(j9b j9bVar, sfe sfeVar, wfe wfeVar, m9g m9gVar) {
        this.a = j9bVar;
        this.b = sfeVar;
        this.c = wfeVar;
        this.d = m9gVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(t20 t20Var, nq4 nq4Var) throws Throwable {
        e9g e9gVar;
        j9b j9bVar;
        sfe sfeVar;
        wfe wfeVar;
        m9g m9gVar;
        qf7 qf7Var;
        j9b j9bVar2;
        j9b j9bVar3;
        wfe wfeVar2;
        Object obj;
        if (nq4Var instanceof e9g) {
            e9gVar = (e9g) nq4Var;
            int i = e9gVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9gVar.k = i - Integer.MIN_VALUE;
            } else {
                e9gVar = new e9g(this, nq4Var);
            }
        } else {
            e9gVar = new e9g(this, nq4Var);
        }
        Object obj2 = e9gVar.i;
        int i2 = e9gVar.k;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj2);
                e9gVar.d = t20Var;
                j9bVar = this.a;
                e9gVar.e = j9bVar;
                sfeVar = this.b;
                e9gVar.f = sfeVar;
                wfeVar = this.c;
                e9gVar.g = wfeVar;
                m9gVar = this.d;
                e9gVar.h = m9gVar;
                e9gVar.k = 1;
                if (j9bVar.b(e9gVar) != hu4Var) {
                }
                qf7Var = t20Var;
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = e9gVar.f;
                    wfeVar2 = (wfe) e9gVar.e;
                    j9bVar2 = (j9b) e9gVar.d;
                    try {
                        ch3.d0(obj2);
                        wfeVar2.a = obj;
                        Object obj3 = wfeVar2.a;
                        j9bVar2.g(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                m9gVar = (m9g) e9gVar.f;
                wfeVar2 = (wfe) e9gVar.e;
                j9bVar3 = (j9b) e9gVar.d;
                try {
                    ch3.d0(obj2);
                    if (!cqk.d(obj2, wfeVar2.a)) {
                        e9gVar.d = j9bVar3;
                        e9gVar.e = wfeVar2;
                        e9gVar.f = obj2;
                        e9gVar.k = 3;
                        if (m9gVar.j(obj2, e9gVar) != hu4Var) {
                            obj = obj2;
                            j9bVar2 = j9bVar3;
                            wfeVar2.a = obj;
                        }
                        qf7Var = t20Var;
                        return hu4Var;
                    }
                    j9bVar2 = j9bVar3;
                    Object obj4 = wfeVar2.a;
                    j9bVar2.g(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2 = j9bVar3;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            m9gVar = e9gVar.h;
            wfe wfeVar3 = e9gVar.g;
            sfeVar = (sfe) e9gVar.f;
            j9b j9bVar4 = (j9b) e9gVar.e;
            qf7 qf7Var2 = (qf7) e9gVar.d;
            ch3.d0(obj2);
            wfeVar = wfeVar3;
            qf7Var = qf7Var2;
            j9bVar = j9bVar4;
            qf7Var = t20Var;
            if (sfeVar.a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = wfeVar.a;
            e9gVar.d = j9bVar;
            e9gVar.e = wfeVar;
            e9gVar.f = m9gVar;
            e9gVar.g = null;
            e9gVar.h = null;
            e9gVar.k = 2;
            Object objInvoke = qf7Var.invoke(obj5, e9gVar);
            if (objInvoke != hu4Var) {
                j9bVar3 = j9bVar;
                obj2 = objInvoke;
                wfeVar2 = wfeVar;
                if (!cqk.d(obj2, wfeVar2.a)) {
                    e9gVar.d = j9bVar3;
                    e9gVar.e = wfeVar2;
                    e9gVar.f = obj2;
                    e9gVar.k = 3;
                    if (m9gVar.j(obj2, e9gVar) != hu4Var) {
                        obj = obj2;
                        j9bVar2 = j9bVar3;
                        wfeVar2.a = obj;
                    }
                } else {
                    j9bVar2 = j9bVar3;
                }
                Object obj6 = wfeVar2.a;
                j9bVar2.g(null);
                return obj6;
            }
            qf7Var = t20Var;
            return hu4Var;
        } catch (Throwable th3) {
            th = th3;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }
}
