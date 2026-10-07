package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vy6 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy6(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new vy6((yx6) obj2, (wfe) obj, lq4Var, 0);
            case 1:
                return new vy6((eh9) obj2, (hua) obj, lq4Var, 1);
            case 2:
                return new vy6((bre) obj2, (List) obj, lq4Var, 2);
            case 3:
                return new vy6((xse) obj2, (List) obj, lq4Var, 3);
            case 4:
                return new vy6((icg) obj2, (jcg) obj, lq4Var, 4);
            default:
                return new vy6((xkh) obj2, (Collection) obj, lq4Var, 5);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((vy6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objI;
        sbi sbiVar;
        Object next;
        int i = this.e;
        sbi sbiVar2 = sbi.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                wfe wfeVar = (wfe) obj2;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    yx6 yx6Var = (yx6) obj3;
                    c5b c5bVar = vd7.e;
                    Object obj4 = wfeVar.a;
                    if (obj4 == c5bVar) {
                        obj4 = null;
                    }
                    this.f = 1;
                    if (yx6Var.emit(obj4, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                wfeVar.a = null;
                return sbiVar2;
            case 1:
                hua huaVar = (hua) obj2;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (((eh9) obj3).a(this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                huaVar.p.B(huaVar, hua.s[0], null);
                huaVar.q.clear();
                return sbiVar2;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (bre.a((bre) obj3, (List) obj2, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar2;
            case 3:
                List list = (List) obj2;
                ny8 ny8Var = ((xse) obj3).a;
                int i5 = this.f;
                int i6 = 2;
                if (i5 == 0) {
                    ch3.d0(obj);
                    ymg ymgVar = (ymg) ny8Var.getValue();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c0a.t(((clg) it.next()).a, arrayList);
                    }
                    this.f = 1;
                    ymgVar.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT * FROM stickers WHERE sticker_id IN (");
                    vd7.b(sb, arrayList.size());
                    sb.append(")");
                    objI = ch3.I(this, ymgVar.a, true, false, new xmg(sb.toString(), arrayList, ymgVar));
                    if (objI != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        ch3.d0(obj);
                        return sbiVar2;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                objI = obj;
                List list3 = (List) objI;
                ymg ymgVar2 = (ymg) ny8Var.getValue();
                List<clg> list4 = list;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list4, 10));
                for (clg clgVar : list4) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            sbiVar = sbiVar2;
                            if (clgVar.a != ((olg) next).b) {
                                sbiVar2 = sbiVar;
                            }
                        } else {
                            sbiVar = sbiVar2;
                            next = null;
                        }
                    }
                    olg olgVar = (olg) next;
                    arrayList2.add(new olg(olgVar != null ? olgVar.a : 0L, clgVar.a, clgVar.b, clgVar.c, clgVar.d, clgVar.e, clgVar.f, clgVar.g, clgVar.h, clgVar.i, clgVar.j, clgVar.k, clgVar.l, clgVar.m, clgVar.n, clgVar.o));
                    sbiVar2 = sbiVar;
                    i6 = 2;
                }
                sbi sbiVar3 = sbiVar2;
                this.f = i6;
                Object objI2 = ch3.I(this, ymgVar2.a, false, true, new ol(ymgVar2, 21, arrayList2));
                if (objI2 != hu4Var) {
                    objI2 = sbiVar3;
                }
                if (objI2 != hu4Var) {
                    return sbiVar3;
                }
                return hu4Var;
            case 4:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objB = icg.b((icg) obj3, (jcg) obj2, this);
                    return objB == hu4Var ? hu4Var : objB;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i8 = this.f;
                if (i8 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return xkh.c((xkh) obj3, (Collection) obj2, this) == hu4Var ? hu4Var : sbiVar2;
                }
                if (i8 == 1) {
                    ch3.d0(obj);
                    return sbiVar2;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
