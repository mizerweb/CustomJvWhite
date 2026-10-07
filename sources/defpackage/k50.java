package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k50 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ k50(yx6 yx6Var, long j, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        j50 j50Var;
        m50 m50Var;
        fj4 fj4Var;
        q49 q49Var;
        z49 z49Var;
        ych ychVar;
        Boolean boolValueOf;
        int i = this.a;
        boolean zD = false;
        sbi sbiVar = sbi.a;
        long j = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof j50) {
                    j50Var = (j50) lq4Var;
                    int i2 = j50Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        j50Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        j50Var = new j50(this, lq4Var);
                    }
                } else {
                    j50Var = new j50(this, lq4Var);
                }
                Object obj2 = j50Var.d;
                int i3 = j50Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                if (((h50) obj).b() != j) {
                    return sbiVar;
                }
                j50Var.e = 1;
                return yx6Var.emit(obj, j50Var) == hu4Var ? hu4Var : sbiVar;
            case 1:
                if (lq4Var instanceof m50) {
                    m50Var = (m50) lq4Var;
                    int i4 = m50Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        m50Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        m50Var = new m50(this, lq4Var);
                    }
                } else {
                    m50Var = new m50(this, lq4Var);
                }
                Object obj3 = m50Var.d;
                int i5 = m50Var.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                h50 h50Var = (h50) obj;
                if (h50Var == null || h50Var.b() != j) {
                    return sbiVar;
                }
                m50Var.e = 1;
                return yx6Var.emit(obj, m50Var) == hu4Var ? hu4Var : sbiVar;
            case 2:
                if (lq4Var instanceof fj4) {
                    fj4Var = (fj4) lq4Var;
                    int i6 = fj4Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        fj4Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        fj4Var = new fj4(this, lq4Var);
                    }
                } else {
                    fj4Var = new fj4(this, lq4Var);
                }
                Object obj4 = fj4Var.d;
                int i7 = fj4Var.e;
                if (i7 == 0) {
                    ch3.d0(obj4);
                    ej4 ej4Var = (ej4) obj;
                    if (cqk.d(ej4Var, aj4.a)) {
                        zD = true;
                    } else if (ej4Var instanceof dj4) {
                        zD = ((dj4) ej4Var).a.d(j);
                    } else if (!(ej4Var instanceof cj4)) {
                        if (ej4Var instanceof bj4) {
                            if (j == ((bj4) ej4Var).a) {
                                zD = true;
                            }
                        } else if (ej4Var instanceof zi4) {
                            if (j == ((zi4) ej4Var).a) {
                                zD = true;
                            }
                        } else if (!(ej4Var instanceof yi4)) {
                            ore.o();
                        } else if (j == ((yi4) ej4Var).a) {
                            zD = true;
                        }
                    }
                    if (!zD) {
                        return sbiVar;
                    }
                    fj4Var.e = 1;
                    return yx6Var.emit(obj, fj4Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj4);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lq4Var instanceof q49) {
                    q49Var = (q49) lq4Var;
                    int i8 = q49Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        q49Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        q49Var = new q49(this, lq4Var);
                    }
                } else {
                    q49Var = new q49(this, lq4Var);
                }
                Object obj5 = q49Var.d;
                int i9 = q49Var.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                if (((gz2) obj).b != j) {
                    return sbiVar;
                }
                q49Var.e = 1;
                return yx6Var.emit(obj, q49Var) == hu4Var ? hu4Var : sbiVar;
            case 4:
                if (lq4Var instanceof z49) {
                    z49Var = (z49) lq4Var;
                    int i10 = z49Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        z49Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        z49Var = new z49(this, lq4Var);
                    }
                } else {
                    z49Var = new z49(this, lq4Var);
                }
                Object obj6 = z49Var.d;
                int i11 = z49Var.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                if (((i29) obj).a() != j) {
                    return sbiVar;
                }
                z49Var.e = 1;
                return yx6Var.emit(obj, z49Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof ych) {
                    ychVar = (ych) lq4Var;
                    int i12 = ychVar.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ychVar.e = i12 - Integer.MIN_VALUE;
                    } else {
                        ychVar = new ych(this, lq4Var);
                    }
                } else {
                    ychVar = new ych(this, lq4Var);
                }
                Object obj7 = ychVar.d;
                int i13 = ychVar.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ch3.d0(obj7);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj7);
                List list = (List) obj;
                if (list.isEmpty()) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((emg) it.next()).a == j) {
                                zD = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(zD);
                }
                ychVar.e = 1;
                return yx6Var.emit(boolValueOf, ychVar) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
