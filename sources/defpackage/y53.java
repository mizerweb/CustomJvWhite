package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class y53 extends mdh implements qf7 {
    public qy9 e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ l63 i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y53(int i, l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = l63Var;
        this.j = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new y53(this.j, this.i, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((y53) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01db  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:99:0x022d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        qy9 qy9Var;
        int i;
        int i2;
        int i3;
        int i4;
        qy9 qy9Var2;
        l53 l53Var;
        l63 l63Var;
        int i5;
        p20 p20Var;
        int i6;
        qy9 qy9Var3;
        ky9 ky9Var;
        g58 g58Var;
        Uri uri;
        rm7 rm7Var;
        int i7;
        p20 p20Var2;
        int i8;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i9 = this.h;
        int i10 = 3;
        if (i9 == 0) {
            ch3.d0(obj);
            qy9 qy9Var4 = (qy9) ww3.u1(this.j, ((m53) this.i.n1.getValue()).a);
            if (qy9Var4 != null) {
                String str = (String) this.i.J.getAndUpdate(new ea1(i10, qy9Var4));
                Iterator it = ((m53) this.i.n1.getValue()).a.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (cqk.d(((qy9) it.next()).B(), str)) {
                        break;
                    }
                    i11++;
                }
                boolean zD = cqk.d(str, qy9Var4.B());
                l63 l63Var2 = this.i;
                if (zD) {
                    l63Var2.Z(null);
                    return sbiVar;
                }
                String str2 = l63Var2.p;
                int i12 = this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qt4.l("Media viewer. On new page selected newPos:", i12, i11, ", prev:"), null);
                }
                int size = ((m53) this.i.n1.getValue()).a.size();
                l63 l63Var3 = this.i;
                int i13 = this.j;
                this.e = qy9Var4;
                this.f = i11;
                this.g = size;
                this.h = 1;
                if (l63Var3.V(i13, qy9Var4, size, this) != hu4Var) {
                    qy9Var = qy9Var4;
                    i = size;
                    i2 = i11;
                }
                return hu4Var;
            }
            return sbiVar;
        }
        if (i9 == 1) {
            i = this.g;
            i2 = this.f;
            qy9Var = this.e;
            ch3.d0(obj);
        } else {
            if (i9 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.g;
            i4 = this.f;
            qy9Var2 = this.e;
            ch3.d0(obj);
        }
        l53Var = (l53) this.i.I.get();
        l63Var = this.i;
        if (l63Var.g) {
            if (!l53Var.b && i4 > (i8 = this.j) && i8 <= 5) {
                gm0.n(l63Var.p, "Media viewer. Call load next, desc order");
                p20 p20Var3 = this.i.E;
                if (p20Var3 != null) {
                    p20Var3.v();
                }
            } else if (l53Var.a && i4 < (i7 = this.j) && i3 - i7 <= 5) {
                gm0.n(l63Var.p, "Media viewer. Call load prev, desc order");
                p20Var2 = this.i.E;
                if (p20Var2 != null) {
                    p20Var2.y();
                }
            }
        } else if (!l53Var.b && i4 < (i6 = this.j) && i3 - i6 <= 5) {
            gm0.n(l63Var.p, "Media viewer. Call load next");
            p20 p20Var4 = this.i.E;
            if (p20Var4 != null) {
                p20Var4.v();
            }
        } else if (l53Var.a && i4 > (i5 = this.j) && i5 <= 5) {
            gm0.n(l63Var.p, "Media viewer. Call load prev");
            p20Var = this.i.E;
            if (p20Var != null) {
                p20Var.y();
            }
        }
        qy9Var3 = (qy9) ww3.u1(i4, ((m53) this.i.n1.getValue()).a);
        if (qy9Var3 != null) {
            a8j.x(this.i.Y, new qb6(qy9Var3));
        }
        if (qy9Var2 instanceof py9) {
            a8j.x(this.i.Y, new jb6(4, true));
            py9 py9Var = (py9) qy9Var2;
            this.i.J(py9Var.a, py9Var.e, py9Var.d.l);
        } else if (qy9Var2 instanceof ky9) {
            ky9Var = (ky9) qy9Var2;
            if (ky9Var.e) {
                g58Var = ky9Var.d;
                uri = g58Var.l;
                if (uri != null) {
                    rm7Var = new rm7(uri, g58Var.c, g58Var.d, g58Var.a);
                } else {
                    rm7Var = null;
                }
                mjg mjgVar = this.i.t1;
                o53 o53Var = new o53(qy9Var2, rm7Var);
                mjgVar.getClass();
                mjgVar.j(null, o53Var);
            } else {
                mjg mjgVar2 = this.i.t1;
                o53 o53Var2 = new o53((py9) null, 3);
                mjgVar2.getClass();
                mjgVar2.j(null, o53Var2);
            }
        } else {
            mjg mjgVar3 = this.i.t1;
            o53 o53Var3 = new o53((py9) null, 3);
            mjgVar3.getClass();
            mjgVar3.j(null, o53Var3);
        }
        a8j.x(this.i.Y, new ob6(qy9Var2));
        this.i.Z(null);
        if (((Boolean) this.i.o.k().i()).booleanValue()) {
            l63 l63Var4 = this.i;
            l63Var4.n.b(l63Var4.c, qy9Var2.l());
        }
        return sbiVar;
        String str3 = this.i.p;
        int i14 = this.j;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str3, zo5.i(i14, "Media viewer. Call prepare info panel by new page, pos:", ", pageId:", qy9Var.B()), null);
        }
        l63 l63Var5 = this.i;
        this.e = qy9Var;
        this.f = i2;
        this.g = i;
        this.h = 2;
        if (l63Var5.U(qy9Var, this) != hu4Var) {
            i3 = i;
            i4 = i2;
            qy9Var2 = qy9Var;
            l53Var = (l53) this.i.I.get();
            l63Var = this.i;
            if (l63Var.g) {
                if (!l53Var.b) {
                    if (l53Var.a) {
                        gm0.n(l63Var.p, "Media viewer. Call load prev, desc order");
                        p20Var2 = this.i.E;
                        if (p20Var2 != null) {
                            p20Var2.y();
                        }
                    }
                } else if (l53Var.a) {
                    gm0.n(l63Var.p, "Media viewer. Call load prev, desc order");
                    p20Var2 = this.i.E;
                    if (p20Var2 != null) {
                        p20Var2.y();
                    }
                }
            } else if (!l53Var.b) {
                if (l53Var.a) {
                    gm0.n(l63Var.p, "Media viewer. Call load prev");
                    p20Var = this.i.E;
                    if (p20Var != null) {
                        p20Var.y();
                    }
                }
            } else if (l53Var.a) {
                gm0.n(l63Var.p, "Media viewer. Call load prev");
                p20Var = this.i.E;
                if (p20Var != null) {
                    p20Var.y();
                }
            }
            qy9Var3 = (qy9) ww3.u1(i4, ((m53) this.i.n1.getValue()).a);
            if (qy9Var3 != null) {
                a8j.x(this.i.Y, new qb6(qy9Var3));
            }
            if (qy9Var2 instanceof py9) {
                a8j.x(this.i.Y, new jb6(4, true));
                py9 py9Var2 = (py9) qy9Var2;
                this.i.J(py9Var2.a, py9Var2.e, py9Var2.d.l);
            } else if (qy9Var2 instanceof ky9) {
                ky9Var = (ky9) qy9Var2;
                if (ky9Var.e) {
                    g58Var = ky9Var.d;
                    uri = g58Var.l;
                    if (uri != null) {
                        rm7Var = new rm7(uri, g58Var.c, g58Var.d, g58Var.a);
                    } else {
                        rm7Var = null;
                    }
                    mjg mjgVar4 = this.i.t1;
                    o53 o53Var4 = new o53(qy9Var2, rm7Var);
                    mjgVar4.getClass();
                    mjgVar4.j(null, o53Var4);
                } else {
                    mjg mjgVar5 = this.i.t1;
                    o53 o53Var5 = new o53((py9) null, 3);
                    mjgVar5.getClass();
                    mjgVar5.j(null, o53Var5);
                }
            } else {
                mjg mjgVar6 = this.i.t1;
                o53 o53Var6 = new o53((py9) null, 3);
                mjgVar6.getClass();
                mjgVar6.j(null, o53Var6);
            }
            a8j.x(this.i.Y, new ob6(qy9Var2));
            this.i.Z(null);
            if (((Boolean) this.i.o.k().i()).booleanValue()) {
                l63 l63Var6 = this.i;
                l63Var6.n.b(l63Var6.c, qy9Var2.l());
            }
            return sbiVar;
        }
        return hu4Var;
    }
}
