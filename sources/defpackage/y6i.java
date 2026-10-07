package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class y6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b7i f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6i(b7i b7iVar, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = b7iVar;
        this.g = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.g;
        b7i b7iVar = this.f;
        switch (i) {
            case 0:
                return new y6i(b7iVar, str, lq4Var, 0);
            default:
                return new y6i(b7iVar, str, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((y6i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((y6i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        b7i b7iVar = this.f;
        String str = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ch3.d0(obj);
                AtomicReference atomicReference = b7iVar.q;
                mjg mjgVar = b7iVar.o;
                x8i x8iVar = (x8i) mjgVar.getValue();
                if (x8iVar instanceof s8i) {
                    String str2 = (String) atomicReference.getAndUpdate(new ung(str, 2));
                    s8i s8iVar = (s8i) x8iVar;
                    v8i v8iVar = s8iVar.c;
                    if (v8iVar.c == null || cqk.d(str2, str)) {
                        return sbiVar;
                    }
                    s8i s8iVar2 = new s8i(s8iVar.a, s8iVar.b, v8i.a(v8iVar, null));
                    mjgVar.getClass();
                    mjgVar.j(null, s8iVar2);
                    return sbiVar;
                }
                if (x8iVar instanceof u8i) {
                    String str3 = (String) atomicReference.getAndUpdate(new ung(str, 2));
                    u8i u8iVar = (u8i) x8iVar;
                    v8i v8iVar2 = u8iVar.b;
                    if (v8iVar2.c == null || cqk.d(str3, str)) {
                        return sbiVar;
                    }
                    u8i u8iVarC = u8i.c(u8iVar, v8i.a(v8iVar2, null), null, 11);
                    mjgVar.getClass();
                    mjgVar.j(null, u8iVarC);
                    return sbiVar;
                }
                if (x8iVar instanceof r8i) {
                    r8i r8iVar = (r8i) x8iVar;
                    v8i v8iVar3 = r8iVar.c;
                    if (v8iVar3.c == null) {
                        return sbiVar;
                    }
                    r8i r8iVar2 = new r8i(r8iVar.a, r8iVar.b, v8i.a(v8iVar3, null));
                    mjgVar.getClass();
                    mjgVar.j(null, r8iVar2);
                    return sbiVar;
                }
                if (!(x8iVar instanceof t8i)) {
                    if (x8iVar == null || (x8iVar instanceof w8i)) {
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                t8i t8iVar = (t8i) x8iVar;
                v8i v8iVar4 = t8iVar.c;
                if (v8iVar4.c == null) {
                    return sbiVar;
                }
                t8i t8iVar2 = new t8i(t8iVar.a, t8iVar.b, v8i.a(v8iVar4, null));
                mjgVar.getClass();
                mjgVar.j(null, t8iVar2);
                return sbiVar;
            default:
                ch3.d0(obj);
                mjg mjgVar2 = b7iVar.o;
                x8i x8iVar2 = (x8i) mjgVar2.getValue();
                if (x8iVar2 instanceof u8i) {
                    String str4 = (String) b7iVar.r.getAndUpdate(new ung(str, 2));
                    u8i u8iVar2 = (u8i) x8iVar2;
                    v8i v8iVar5 = u8iVar2.c;
                    if (v8iVar5.c != null && !cqk.d(str4, str)) {
                        u8i u8iVarC2 = u8i.c(u8iVar2, null, v8i.a(v8iVar5, null), 7);
                        mjgVar2.getClass();
                        mjgVar2.j(null, u8iVarC2);
                    }
                }
                return sbiVar;
        }
    }
}
