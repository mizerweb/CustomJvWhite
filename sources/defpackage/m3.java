package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class m3 implements f9b {
    public final /* synthetic */ int a;
    public final mjg b;
    public final Object c;

    public m3(i10 i10Var) {
        this.a = 1;
        this.b = p90.a(Collections.singletonList(new jw7()));
        this.c = i10Var;
    }

    @Override // defpackage.d9b
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                setValue(obj);
                break;
            default:
                mjg mjgVar = this.b;
                mjgVar.getClass();
                mjgVar.j(null, (List) obj);
                break;
        }
        return true;
    }

    @Override // defpackage.d9b
    public final gjg c() {
        int i = this.a;
        mjg mjgVar = this.b;
        switch (i) {
            case 0:
                return mjgVar;
            default:
                return mjgVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        k3 k3Var;
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        hu4 hu4Var = hu4.a;
        mjg mjgVar = this.b;
        switch (i) {
            case 0:
                if (lq4Var instanceof k3) {
                    k3Var = (k3) lq4Var;
                    int i2 = k3Var.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        k3Var.f = i2 - Integer.MIN_VALUE;
                    } else {
                        k3Var = new k3(this, lq4Var);
                    }
                } else {
                    k3Var = new k3(this, lq4Var);
                }
                Object obj = k3Var.d;
                int i3 = k3Var.f;
                lq4 lq4Var2 = null;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ch3.d0(obj);
                        } else {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    ch3.d0(obj);
                    do {
                        value2 = mjgVar.getValue();
                    } while (!mjgVar.h(value2, new Integer(((Number) value2).intValue() + 1)));
                    int i4 = 0;
                    xx6 xx6VarI = e9i.I(new j3(new fz6((d9b) ((n3) this.c).e, new l3(2, lq4Var2, i4)), i4, this));
                    k3Var.f = 1;
                    if (xx6VarI.collect(yx6Var, k3Var) == hu4Var) {
                        return hu4Var;
                    }
                    do {
                        value3 = mjgVar.getValue();
                        break;
                    } while (!mjgVar.h(value3, new Integer(((Number) value3).intValue() - 1)));
                    ore.k("StateFlow collection never ends");
                    return null;
                } catch (Throwable th) {
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, new Integer(((Number) value).intValue() - 1)));
                    throw th;
                }
            default:
                mjgVar.collect(yx6Var, lq4Var);
                return hu4Var;
        }
    }

    @Override // defpackage.lzf
    public final List d() {
        switch (this.a) {
            case 0:
                return Collections.singletonList(f());
            default:
                return this.b.d();
        }
    }

    public List e() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.d9b, defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                setValue(obj);
                break;
            default:
                this.b.setValue((List) obj);
                break;
        }
        return sbiVar;
    }

    public Object f() {
        n3 n3Var = (n3) this.c;
        SharedPreferences sharedPreferences = (SharedPreferences) n3Var.d;
        String str = (String) n3Var.a;
        return d0g.d((sr3) n3Var.f, sharedPreferences, n3Var.c, str);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    public void g(cf7 cf7Var) {
        List listE;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        Object objPrevious;
        Object next;
        boolean z3;
        do {
            listE = e();
            arrayList = new ArrayList(listE);
            cf7Var.invoke(arrayList);
            for (int iO0 = xw3.O0(arrayList); -1 < iO0; iO0--) {
                if (iO0 > 0 && (arrayList.get(iO0) instanceof jw7) && (arrayList.get(iO0 - 1) instanceof jw7)) {
                    arrayList.remove(iO0);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((kw7) it.next()) instanceof jw7)) {
                        hw7 hw7Var = (hw7) ((i10) this.c).get();
                        long jD = hw7Var.d();
                        boolean z4 = false;
                        if (jD != hw7Var.e() && !arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                kw7 kw7Var = (kw7) it2.next();
                                if (!(kw7Var instanceof jw7) && kw7Var.getA() == jD) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        kw7 kw7Var2 = (kw7) ww3.t1(arrayList);
                        Object obj = null;
                        if (kw7Var2 != null) {
                            Iterator it3 = arrayList.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (((kw7) next) instanceof jw7);
                            kw7 kw7Var3 = (kw7) next;
                            if (kw7Var3 != null) {
                                List listL = hw7Var.l();
                                if (!(listL instanceof Collection) || !listL.isEmpty()) {
                                    Iterator it4 = listL.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (((tq3) it4.next()).b(kw7Var3.getC())) {
                                                z3 = false;
                                            }
                                        }
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z && (kw7Var2 instanceof jw7) && !z3) {
                                arrayList.remove(0);
                            } else if (!z && !(kw7Var2 instanceof jw7)) {
                                arrayList.add(0, new jw7());
                            }
                        }
                        long jK = hw7Var.k();
                        if (jK != hw7Var.e()) {
                            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                kw7 kw7Var4 = (kw7) objPrevious;
                                if (!(kw7Var4 instanceof jw7) && kw7Var4.getA() == jK) {
                                    break;
                                }
                            }
                            if (objPrevious != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        kw7 kw7Var5 = (kw7) ww3.D1(arrayList);
                        if (kw7Var5 == null) {
                            break;
                        }
                        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                        while (listIterator2.hasPrevious()) {
                            Object objPrevious2 = listIterator2.previous();
                            if (!(((kw7) objPrevious2) instanceof jw7)) {
                                obj = objPrevious2;
                                break;
                            }
                        }
                        kw7 kw7Var6 = (kw7) obj;
                        if (kw7Var6 != null) {
                            List listL2 = hw7Var.l();
                            if (!(listL2 instanceof Collection) || !listL2.isEmpty()) {
                                Iterator it5 = listL2.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        z4 = true;
                                        break;
                                    }
                                } while (!((tq3) it5.next()).b(kw7Var6.getC()));
                            } else {
                                z4 = true;
                                break;
                            }
                        }
                        if (!z2 || !(kw7Var5 instanceof jw7) || z4) {
                            if (!z2 && !(kw7Var5 instanceof jw7)) {
                                arrayList.add(arrayList.size(), new jw7());
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                        arrayList.remove(kw7Var5);
                        break;
                    }
                }
            }
        } while (!this.b.h(listE, arrayList));
    }

    @Override // defpackage.f9b, defpackage.gjg
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return f();
            default:
                return e();
        }
    }

    @Override // defpackage.f9b
    public final boolean h(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!cqk.d(f(), obj)) {
                    return false;
                }
                setValue(obj2);
                return true;
            default:
                return this.b.h((List) obj, (List) obj2);
        }
    }

    @Override // defpackage.d9b
    public final void k() {
        switch (this.a) {
            case 0:
                String str = (String) ((n3) this.c).b;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "resetReplayCache has no effect on prefs wrapper!", null);
                    return;
                }
                return;
            default:
                this.b.k();
                throw null;
        }
    }

    @Override // defpackage.f9b
    public final void setValue(Object obj) {
        switch (this.a) {
            case 0:
                n3 n3Var = (n3) this.c;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) n3Var.d).edit();
                d0g.e(editorEdit, (String) n3Var.a, obj);
                editorEdit.apply();
                break;
            default:
                mjg mjgVar = this.b;
                mjgVar.getClass();
                mjgVar.j(null, (List) obj);
                break;
        }
    }

    public m3(n3 n3Var) {
        this.a = 0;
        this.c = n3Var;
        this.b = p90.a(0);
    }
}
