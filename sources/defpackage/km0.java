package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class km0 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(lq4 lq4Var, kj9 kj9Var, i64 i64Var, boolean z, boolean z2) {
        super(2, lq4Var);
        this.i = kj9Var;
        this.j = i64Var;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                km0 km0Var = new km0((nm0) obj2, this.g, this.h, lq4Var);
                km0Var.i = obj;
                return km0Var;
            case 1:
                return new km0(lq4Var, (kj9) this.i, (i64) obj2, this.g, this.h);
            default:
                return new km0((vze) this.i, (String) obj2, this.g, this.h, lq4Var);
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
            case 1:
                break;
        }
        return ((km0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        boolean z;
        i64 i64Var;
        ejg ejgVar;
        Integer num;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.i;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i != 0) {
                    if (i == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                Collection collectionValues = ((mbc) pq3.j.e(((nm0) this.j).a).d).b.values();
                nm0 nm0Var = (nm0) this.j;
                boolean z2 = this.g;
                boolean z3 = this.h;
                ArrayList arrayList = new ArrayList(yw3.W0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(yab.h(gu4Var, null, 0, new jm0(it.next(), null, gu4Var, nm0Var, z2, z3), 3));
                }
                this.i = null;
                this.f = 1;
                Object objC = ch3.c(arrayList, this);
                return objC == hu4Var ? hu4Var : objC;
            case 1:
                boolean z4 = this.g;
                i64 i64Var2 = (i64) this.j;
                kj9 kj9Var = (kj9) this.i;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    xf5 xf5Var = kj9Var.i;
                    if (xf5Var != null) {
                        this.f = 1;
                        obj = xf5Var.z0(this);
                        if (obj == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        kj9Var.c(kj9Var.f, -1);
                        i64Var2.j0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                    } else {
                        kj9Var.e = z4;
                        if (!z4) {
                            kj9Var.c(kj9Var.f, -1);
                        }
                        if (kj9Var.c != null) {
                            if (z4) {
                                kj9Var.c(kj9Var.f, 0);
                            }
                            z = this.h;
                            i64Var = kj9Var.h;
                            if (z) {
                                if (i64Var != null) {
                                    bc1.p("There is a new enableLowLightBoost being set", i64Var);
                                }
                                kj9Var.h = null;
                            } else if (i64Var != null) {
                                rpl.d(i64Var2, i64Var);
                            }
                            kj9Var.h = i64Var2;
                            ejgVar = kj9Var.a;
                            num = z4 ? new Integer(6) : null;
                            synchronized (ejgVar.d) {
                                ejgVar.k = num;
                            }
                            rpl.d(ejgVar.f(), i64Var2);
                            i64Var2.Y(new w62(i64Var2, 5, kj9Var));
                        } else {
                            bc1.p("Camera is not active.", i64Var2);
                        }
                    }
                    return sbi.a;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    kj9Var.c(kj9Var.f, -1);
                    i64Var2.j0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                } else {
                    kj9Var.e = z4;
                    if (!z4) {
                        kj9Var.c(kj9Var.f, -1);
                    }
                    if (kj9Var.c != null) {
                        if (z4) {
                            kj9Var.c(kj9Var.f, 0);
                        }
                        z = this.h;
                        i64Var = kj9Var.h;
                        if (z) {
                            if (i64Var != null) {
                                bc1.p("There is a new enableLowLightBoost being set", i64Var);
                            }
                            kj9Var.h = null;
                        } else if (i64Var != null) {
                            rpl.d(i64Var2, i64Var);
                        }
                        kj9Var.h = i64Var2;
                        ejgVar = kj9Var.a;
                        if (z4) {
                        }
                        synchronized (ejgVar.d) {
                            ejgVar.k = num;
                            rpl.d(ejgVar.f(), i64Var2);
                            i64Var2.Y(new w62(i64Var2, 5, kj9Var));
                        }
                    } else {
                        bc1.p("Camera is not active.", i64Var2);
                    }
                }
                return sbi.a;
            default:
                hu4 hu4Var3 = hu4.a;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                vze vzeVar = (vze) this.i;
                String str = (String) this.j;
                boolean z5 = this.g;
                boolean z6 = this.h;
                this.f = 1;
                Comparable comparableA = vze.a(vzeVar, str, z5, z6, this);
                return comparableA == hu4Var3 ? hu4Var3 : comparableA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(nm0 nm0Var, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = nm0Var;
        this.g = z;
        this.h = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(vze vzeVar, String str, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = vzeVar;
        this.j = str;
        this.g = z;
        this.h = z2;
    }
}
