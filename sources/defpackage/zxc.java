package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zxc implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ dyc c;

    public /* synthetic */ zxc(yx6 yx6Var, dyc dycVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = dycVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        yxc yxcVar;
        ayc aycVar;
        rt2 value;
        dyc dycVar;
        int i;
        int iNextIndex;
        byc bycVar;
        switch (this.a) {
            case 0:
                dyc dycVar2 = this.c;
                if (lq4Var instanceof yxc) {
                    yxcVar = (yxc) lq4Var;
                    int i2 = yxcVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        yxcVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        yxcVar = new yxc(this, lq4Var);
                    }
                } else {
                    yxcVar = new yxc(this, lq4Var);
                }
                Object obj2 = yxcVar.d;
                hu4 hu4Var = hu4.a;
                int i3 = yxcVar.e;
                if (i3 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    ((Number) obj).longValue();
                    if (((Boolean) dycVar2.g.invoke()).booleanValue() && !((Boolean) dycVar2.u.a.getValue()).booleanValue()) {
                        yxcVar.e = 1;
                        if (yx6Var.emit(obj, yxcVar) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                if (lq4Var instanceof ayc) {
                    aycVar = (ayc) lq4Var;
                    int i4 = aycVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aycVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        aycVar = new ayc(this, lq4Var);
                    }
                } else {
                    aycVar = new ayc(this, lq4Var);
                }
                Object obj3 = aycVar.d;
                hu4 hu4Var2 = hu4.a;
                int i5 = aycVar.e;
                if (i5 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    ylc ylcVar = (ylc) obj;
                    ArrayList arrayList = (ArrayList) ylcVar.a;
                    boolean zBooleanValue = ((Boolean) ylcVar.b).booleanValue();
                    dyc dycVar3 = this.c;
                    if (cqk.d(dycVar3.c, "all.chat.folder") && (value = ((r0f) dycVar3.n.getValue()).getValue()) != null) {
                        if (arrayList.isEmpty()) {
                            dycVar = dycVar3;
                        } else {
                            Iterator it = arrayList.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    Iterator it2 = it;
                                    dycVar = dycVar3;
                                    if (((qxc) it.next()).a != value.a) {
                                        i6++;
                                        it = it2;
                                        dycVar3 = dycVar;
                                    }
                                } else {
                                    dycVar = dycVar3;
                                    i6 = -1;
                                }
                            }
                            if (i6 != -1) {
                                arrayList.remove(i6);
                            }
                        }
                        long j = value.a;
                        Long lValueOf = Long.valueOf(value.q());
                        value.K0();
                        xnh xnhVar = new xnh(value.j);
                        String strS = value.s(us0.c, rs0.a);
                        qxc qxcVar = new qxc(j, lValueOf, (ynh) xnhVar, (ynh) null, strS != null ? Uri.parse(strS) : null, false, false, new xyc(2, 1, value.a), (CharSequence) "", (Integer) null, false, 3584);
                        if (dycVar.i) {
                            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    iNextIndex = -1;
                                } else if (((qxc) listIterator.previous()).h.c == 6) {
                                    iNextIndex = listIterator.nextIndex();
                                }
                            }
                            i = iNextIndex + 1;
                        } else {
                            i = 0;
                        }
                        arrayList.add(i, qxcVar);
                    }
                    dyc dycVar4 = this.c;
                    if (((Boolean) dycVar4.r.getValue()).booleanValue() && cqk.d(dycVar4.c, "all.chat.folder")) {
                        arrayList.add(0, qxc.i((qxc) dycVar4.C.getValue(), !zBooleanValue));
                    } else {
                        String str = dycVar4.s;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "addStoryCellIfNeed: skipped, showStoryCell=" + dycVar4.r.getValue() + ", folderId=" + dycVar4.c, null);
                            }
                        }
                    }
                    aycVar.e = 1;
                    if (yx6Var2.emit(arrayList, aycVar) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                if (lq4Var instanceof byc) {
                    bycVar = (byc) lq4Var;
                    int i7 = bycVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        bycVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        bycVar = new byc(this, lq4Var);
                    }
                } else {
                    bycVar = new byc(this, lq4Var);
                }
                Object obj4 = bycVar.d;
                hu4 hu4Var3 = hu4.a;
                int i8 = bycVar.e;
                if (i8 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    ((Number) obj).longValue();
                    this.c.e.a();
                    bycVar.e = 1;
                    if (yx6Var3.emit(sbiVar, bycVar) == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i8 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbiVar;
        }
    }
}
