package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class c9h implements d9h {
    public long a;
    public final Object b;
    public final Object c;

    public c9h() {
        this.b = new q36(this);
        this.c = new q36(this);
    }

    public static final List b(c9h c9hVar, q63 q63Var, String str) {
        return yhf.w0(yhf.m0(new m2i(yhf.m0(new sw(1, q63Var.c), new u8h(3, c9hVar)), new bad(c9hVar, 18, str)), new u8h(4)));
    }

    public static final p8h c(c9h c9hVar, pj4 pj4Var) {
        String strB = xoh.b(pj4Var.l);
        ArrayList arrayList = new ArrayList();
        d(arrayList, pj4Var.e);
        return ((cmf) c9hVar.c).k(pj4Var.a, arrayList, strB, pj4Var.a(), pj4Var.d(us0.c));
    }

    public static void d(ArrayList arrayList, List list) {
        String str = (String) yhf.p0(new m2i(yhf.m0(new sw(1, list), new u8h(1)), new u8h(2)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = cqk.i(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object a(nq4 nq4Var) {
        z8h z8hVar;
        if (nq4Var instanceof z8h) {
            z8hVar = (z8h) nq4Var;
            int i = z8hVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z8hVar.f = i - Integer.MIN_VALUE;
            } else {
                z8hVar = new z8h(this, nq4Var);
            }
        } else {
            z8hVar = new z8h(this, nq4Var);
        }
        Object objD = z8hVar.d;
        int i2 = z8hVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                wy2 wy2Var = new wy2(this.a, "MEMBER", 0L, 100, (String) null);
                pvb pvbVar = (pvb) this.b;
                z8hVar.f = 1;
                objD = pvbVar.D(wy2Var, z8hVar);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            return b(this, (q63) objD, "@");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(c9h.class.getName(), "getAllContacts fail!", th);
            return r66.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object f(LinkedHashSet linkedHashSet, nq4 nq4Var) {
        a9h a9hVar;
        if (nq4Var instanceof a9h) {
            a9hVar = (a9h) nq4Var;
            int i = a9hVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                a9hVar.f = i - Integer.MIN_VALUE;
            } else {
                a9hVar = new a9h(this, nq4Var);
            }
        } else {
            a9hVar = new a9h(this, nq4Var);
        }
        Object objD = a9hVar.d;
        int i2 = a9hVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                pvb pvbVar = (pvb) this.b;
                wy2 wy2Var = new wy2(ww3.U1(linkedHashSet), (Long) null);
                a9hVar.f = 1;
                objD = pvbVar.D(wy2Var, a9hVar);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            List listH = ((rj4) objD).h();
            ArrayList arrayList = new ArrayList(yw3.W0(listH, 10));
            Iterator it = ((ArrayList) listH).iterator();
            while (it.hasNext()) {
                arrayList.add(c(this, (pj4) it.next()));
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(c9h.class.getName(), "getContactsByIds fail!", th);
            return r66.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object g(String str, nq4 nq4Var) {
        b9h b9hVar;
        if (nq4Var instanceof b9h) {
            b9hVar = (b9h) nq4Var;
            int i = b9hVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9hVar.g = i - Integer.MIN_VALUE;
            } else {
                b9hVar = new b9h(this, nq4Var);
            }
        } else {
            b9hVar = new b9h(this, nq4Var);
        }
        Object objD = b9hVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = b9hVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                wy2 wy2Var = new wy2(this.a, "MEMBER", 0L, 100, (str.length() <= 1 || str.charAt(0) != '@') ? str : str.substring(1));
                pvb pvbVar = (pvb) this.b;
                b9hVar.d = str;
                b9hVar.g = 1;
                objD = pvbVar.D(wy2Var, b9hVar);
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = b9hVar.d;
                ch3.d0(objD);
            }
            return b(this, (q63) objD, str);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String name = c9h.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    if (!gm0.c()) {
                        str = null;
                    }
                    a4cVar.c(je9Var, name, "getFilteredContacts for query=`" + ((Object) str) + "` fail!\n" + gm0.N(th), null);
                }
            }
            return r66.a;
        }
    }

    public c9h(long j, pvb pvbVar, cmf cmfVar) {
        this.a = j;
        this.b = pvbVar;
        this.c = cmfVar;
    }
}
