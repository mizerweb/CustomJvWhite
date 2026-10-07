package defpackage;

import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes3.dex */
public final class nxi implements zae {
    public final af7 a;
    public final ny8 b;
    public Long c;

    public nxi(ny8 ny8Var, af7 af7Var) {
        this.a = af7Var;
        this.b = ny8Var;
    }

    @Override // defpackage.zae
    public final void a() {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        long jLongValue = l.longValue();
        p1j p1jVarI = i();
        p1jVarI.getClass();
        p1j.b(p1jVarI, 1, Long.valueOf(jLongValue), (sdg) objInvoke, null, null, 1, 88);
    }

    @Override // defpackage.zae
    public final void b(boolean z) {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        sdg sdgVar = (sdg) objInvoke;
        long jLongValue = l.longValue();
        if (z) {
            p1j p1jVarI = i();
            p1jVarI.getClass();
            p1j.b(p1jVarI, 2, Long.valueOf(jLongValue), sdgVar, null, m1j.DELETE_ON_PREVIEW, 0, AidlException.SDK_IS_NOT_INITIALIZED);
        } else {
            p1j p1jVarI2 = i();
            p1jVarI2.getClass();
            p1j.b(p1jVarI2, 2, Long.valueOf(jLongValue), sdgVar, null, m1j.DELETE_ON_RECORD, 0, AidlException.SDK_IS_NOT_INITIALIZED);
        }
    }

    @Override // defpackage.zae
    public final void c() {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        long jLongValue = l.longValue();
        p1j p1jVarI = i();
        p1jVarI.getClass();
        p1j.b(p1jVarI, 3, Long.valueOf(jLongValue), (sdg) objInvoke, null, null, 0, 120);
    }

    @Override // defpackage.zae
    public final void clear() {
        this.c = null;
    }

    @Override // defpackage.zae
    public final void d() {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        long jLongValue = l.longValue();
        p1j p1jVarI = i();
        p1jVarI.getClass();
        p1j.b(p1jVarI, 2, Long.valueOf(jLongValue), (sdg) objInvoke, null, m1j.CANCEL_1S, 0, AidlException.SDK_IS_NOT_INITIALIZED);
    }

    @Override // defpackage.zae
    public final void e() {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        long jLongValue = l.longValue();
        p1j p1jVarI = i();
        p1jVarI.getClass();
        p1j.b(p1jVarI, 1, Long.valueOf(jLongValue), (sdg) objInvoke, null, null, 2, 88);
    }

    @Override // defpackage.zae
    public final void f() {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        Long l = this.c;
        Object objInvoke = this.a.invoke();
        if (l == null || objInvoke == null) {
            return;
        }
        long jLongValue = l.longValue();
        p1j p1jVarI = i();
        p1jVarI.getClass();
        p1j.b(p1jVarI, 2, Long.valueOf(jLongValue), (sdg) objInvoke, null, m1j.SWIPE, 0, AidlException.SDK_IS_NOT_INITIALIZED);
    }

    @Override // defpackage.zae
    public final void g(Long l) {
        String name = nxi.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "setLocalMessageId { localMessageId: " + l + "\nsourceType: " + this.a.invoke() + " }", null);
            }
        }
        this.c = l;
    }

    @Override // defpackage.zae
    public final void h(dbe dbeVar) {
        je9 je9Var = je9.d;
        if (dbeVar.equals(cbe.a)) {
            sdg sdgVar = (sdg) this.a.invoke();
            if (sdgVar == null) {
                return;
            }
            p1j p1jVarI = i();
            Long l = this.c;
            p1jVarI.getClass();
            p1j.b(p1jVarI, 4, l, sdgVar, null, n1j.OUT_OF_MEMORY, 0, AidlException.SDK_IS_NOT_INITIALIZED);
            return;
        }
        if (dbeVar.equals(abe.a)) {
            String name = nxi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
            }
            Long l2 = this.c;
            Object objInvoke = this.a.invoke();
            if (l2 == null || objInvoke == null) {
                return;
            }
            sdg sdgVar2 = (sdg) objInvoke;
            long jLongValue = l2.longValue();
            p1j p1jVarI2 = i();
            p1jVarI2.getClass();
            p1j.b(p1jVarI2, 4, Long.valueOf(jLongValue), sdgVar2, null, n1j.CAMERA_NOT_FOUND, 0, AidlException.SDK_IS_NOT_INITIALIZED);
            return;
        }
        if (!dbeVar.equals(bbe.a)) {
            ore.o();
            return;
        }
        String name2 = nxi.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, "withParams { id: " + this.c + "\nsourceType: " + this.a.invoke() + " }", null);
        }
        Long l3 = this.c;
        Object objInvoke2 = this.a.invoke();
        if (l3 == null || objInvoke2 == null) {
            return;
        }
        sdg sdgVar3 = (sdg) objInvoke2;
        long jLongValue2 = l3.longValue();
        p1j p1jVarI3 = i();
        p1jVarI3.getClass();
        p1j.b(p1jVarI3, 4, Long.valueOf(jLongValue2), sdgVar3, null, n1j.CAMERA_ERROR_ON_RECORD, 0, AidlException.SDK_IS_NOT_INITIALIZED);
    }

    public final p1j i() {
        return (p1j) this.b.getValue();
    }
}
