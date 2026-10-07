package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t8f extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u8f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8f(u8f u8fVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = u8fVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        u8f u8fVar = this.g;
        switch (i) {
            case 0:
                t8f t8fVar = new t8f(u8fVar, lq4Var, 0);
                t8fVar.f = obj;
                return t8fVar;
            default:
                t8f t8fVar2 = new t8f(u8fVar, lq4Var, 1);
                t8fVar2.f = obj;
                return t8fVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((t8f) create((q8f) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((t8f) create((uv7) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        o73 o73Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        u8f u8fVar = this.g;
        switch (i) {
            case 0:
                o73 o73Var2 = u8fVar.e;
                q8f q8fVar = (q8f) this.f;
                ch3.d0(obj);
                if (!(q8fVar instanceof p8f)) {
                    if (!(q8fVar instanceof o8f)) {
                        ore.o();
                        return null;
                    }
                    long j = ((o8f) q8fVar).a.a;
                    q73 q73Var = (q73) o73Var2.a;
                    if (j != q73Var.i) {
                        return sbiVar;
                    }
                    q73Var.b();
                    o73 o73Var3 = q73Var.g;
                    if (o73Var3 == null) {
                        return sbiVar;
                    }
                    o73Var3.e();
                    return sbiVar;
                }
                r73 r73Var = ((p8f) q8fVar).a;
                q73 q73Var2 = (q73) o73Var2.a;
                ArrayList arrayList = q73Var2.f;
                if (r73Var.a != q73Var2.i) {
                    return sbiVar;
                }
                List list = r73Var.c;
                q73Var2.h = true;
                q73Var2.k = r73Var.e;
                q73Var2.c = r73Var.b;
                q73Var2.j = r73Var.d;
                q73Var2.l = r73Var.f;
                arrayList.addAll(list);
                if (q73Var2.k > 0) {
                    if (q73Var2.d == 0) {
                        q73Var2.d = 1;
                        if (1 + 1 <= arrayList.size() && q73Var2.g != null) {
                        }
                    }
                    o73 o73Var4 = q73Var2.g;
                    if (o73Var4 != null) {
                        o73Var4.b(q73Var2.d, q73Var2.k);
                    }
                    o73 o73Var5 = q73Var2.g;
                    if (o73Var5 != null) {
                        o73Var5.c((tja) arrayList.get(q73Var2.d - 1));
                    }
                }
                if (q73Var2.k != 0 || (o73Var = q73Var2.g) == null) {
                    return sbiVar;
                }
                o73Var.e();
                return sbiVar;
            default:
                uv7 uv7Var = (uv7) this.f;
                ch3.d0(obj);
                long j2 = uv7Var.b;
                ic6 ic6Var = u8fVar.i;
                z8f z8fVar = z8f.b;
                long j3 = u8fVar.c;
                boolean z = u8fVar.d == qx2.LOCAL_ID;
                z8fVar.getClass();
                bc1.q(qt4.k(j2, "&message_id=", qt4.t(j3, ":chats?id=", "&type=", z ? "local" : "server")), ic6Var);
                return sbiVar;
        }
    }
}
