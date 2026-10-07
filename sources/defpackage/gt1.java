package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gt1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kt1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt1(kt1 kt1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = kt1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        kt1 kt1Var = this.g;
        switch (i) {
            case 0:
                gt1 gt1Var = new gt1(kt1Var, lq4Var, 0);
                gt1Var.f = obj;
                return gt1Var;
            case 1:
                gt1 gt1Var2 = new gt1(kt1Var, lq4Var, 1);
                gt1Var2.f = obj;
                return gt1Var2;
            case 2:
                gt1 gt1Var3 = new gt1(kt1Var, lq4Var, 2);
                gt1Var3.f = obj;
                return gt1Var3;
            default:
                gt1 gt1Var4 = new gt1(kt1Var, lq4Var, 3);
                gt1Var4.f = obj;
                return gt1Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((gt1) create((cd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((gt1) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((gt1) create((be1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((gt1) create((xd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ynh tnhVar;
        List listJ;
        Object value2;
        st1 st1Var;
        CharSequence charSequence;
        int i = this.e;
        sbi sbiVar = sbi.a;
        kt1 kt1Var = this.g;
        switch (i) {
            case 0:
                cd cdVar = (cd) this.f;
                ch3.d0(obj);
                w82 w82Var = kt1Var.e;
                long j = cdVar.c;
                Map map = cdVar.a;
                w82Var.f(j);
                mjg mjgVar = kt1Var.r;
                do {
                    value = mjgVar.getValue();
                    bd bdVar = (bd) value;
                    tnhVar = map.isEmpty() ? new tnh(R.string.call_users_in_wait_room_count_no_users) : new pnh(R.plurals.call_users_in_wait_room_count, map.size());
                    kt1Var.f.getClass();
                    if (map.size() <= 5) {
                        listJ = xc.a(map);
                    } else {
                        c79 c79VarW = yab.w();
                        int i2 = 0;
                        for (Object obj2 : map.entrySet()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                xw3.V0();
                                throw null;
                            }
                            Map.Entry entry = (Map.Entry) obj2;
                            if (i2 < 5) {
                                c79VarW.add(xc.b((fu1) entry.getKey(), (q42) entry.getValue()));
                                i2 = i3;
                            } else {
                                c79VarW.add(new fni(new vnh(R.string.call_users_in_wait_room_count_show_all, a.n1(new Object[]{Integer.valueOf(map.size())}))));
                                listJ = yab.j(c79VarW);
                            }
                        }
                        listJ = yab.j(c79VarW);
                    }
                    bdVar.getClass();
                } while (!mjgVar.h(value, new bd(tnhVar, listJ)));
                return sbiVar;
            case 1:
                rbb rbbVar = (rbb) this.f;
                ch3.d0(obj);
                a8j.x(kt1Var.t, rbbVar);
                return sbiVar;
            case 2:
                be1 be1Var = (be1) this.f;
                ch3.d0(obj);
                mjg mjgVar2 = kt1Var.o;
                do {
                    value2 = mjgVar2.getValue();
                    st1Var = (st1) value2;
                    charSequence = be1Var.c;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                } while (!mjgVar2.h(value2, st1.a(st1Var, null, null, null, false, charSequence, false, 47)));
                return sbiVar;
            default:
                ic6 ic6Var = kt1Var.t;
                xd xdVar = (xd) this.f;
                ch3.d0(obj);
                if (xdVar instanceof sd) {
                    a8j.x(ic6Var, ry1.k);
                } else if (xdVar instanceof td) {
                    a8j.x(ic6Var, ry1.l);
                } else if (xdVar instanceof wd) {
                    a8j.x(ic6Var, ry1.m);
                } else if (xdVar instanceof pd) {
                    a8j.x(ic6Var, ry1.n);
                } else if (xdVar instanceof ud) {
                    a8j.x(ic6Var, ry1.o);
                }
                return sbiVar;
        }
    }
}
