package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ya extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(fg5 fg5Var, lq4 lq4Var, ArrayList arrayList, int i, int i2, int i3) {
        super(2, lq4Var);
        this.i = fg5Var;
        this.j = arrayList;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new ya(this.h, (za) obj3, (m8b) obj2, lq4Var);
            default:
                return new ya((fg5) obj3, lq4Var, (ArrayList) obj2, this.f, this.g, this.h);
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
                break;
        }
        return ((ya) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r7v1, types: [xn3] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ya yaVar;
        ?? r0;
        int i = this.e;
        int i2 = this.h;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                za zaVar = (za) obj3;
                int i3 = this.g;
                hu4 hu4Var = hu4.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i4 = this.f;
                        ch3.d0(obj);
                        yaVar = this;
                        r0 = i4;
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbi.a;
                }
                ch3.d0(obj);
                ?? r12 = i2 == R.id.profile_add_members_show_history_positive_action ? 1 : 0;
                zv8[] zv8VarArr = za.j;
                ?? r7 = (xn3) zaVar.b.getValue();
                long j = zaVar.a;
                List listF0 = rx8.f0((m8b) obj2);
                this.f = r12;
                this.g = 1;
                yaVar = this;
                if (r7.b(j, yaVar, listF0, r12) == hu4Var) {
                    return hu4Var;
                }
                r0 = r12;
                pzf pzfVar = zaVar.f;
                rt3 rt3Var = rt3.b;
                yaVar.f = r0;
                yaVar.g = 2;
                if (pzfVar.emit(rt3Var, yaVar) == hu4Var) {
                    return hu4Var;
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                return fg5.m((fg5) obj3).c((ArrayList) obj2, this.f, this.g, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(int i, za zaVar, m8b m8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = i;
        this.i = zaVar;
        this.j = m8bVar;
    }
}
