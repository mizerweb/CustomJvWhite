package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dw1 extends a8j {
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final ny8 g;
    public final mjg h;
    public final mjg i;
    public final r8e j;
    public final mjg k;
    public final r8e l;
    public final mjg m;
    public final r8e n;
    public final r8e o;
    public final ic6 p;
    public boolean q;

    public dw1(String str, boolean z, boolean z2, List list, ny8 ny8Var) {
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = ny8Var;
        mjg mjgVarA = p90.a(new bw1(null, jj8.a));
        this.h = mjgVarA;
        mjg mjgVarA2 = p90.a(new tnh(R.string.call_rate_initial_title_text));
        this.i = mjgVarA2;
        this.j = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(B());
        this.k = mjgVarA3;
        this.l = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(r66.a);
        this.m = mjgVarA4;
        this.n = new r8e(mjgVarA4);
        yo0 yo0Var = new yo0(mjgVarA, 1);
        Boolean bool = Boolean.FALSE;
        this.o = e9i.G0(yo0Var, this.b, j0g.a, bool);
        this.p = new ic6(null);
    }

    public final List B() {
        Integer num = ((bw1) this.h.getValue()).a;
        boolean z = false;
        boolean z2 = num == null;
        p4e p4eVar = new p4e(R.id.call_rate_positive_button, Integer.valueOf(R.drawable.ic_thumbs_up), z2 || (num != null && num.intValue() == R.id.call_rate_positive_button));
        Integer numValueOf = Integer.valueOf(R.drawable.ic_thumbs_down);
        if (z2 || (num != null && num.intValue() == R.id.call_rate_negative_button)) {
            z = true;
        }
        return xw3.P0(p4eVar, new p4e(R.id.call_rate_negative_button, numValueOf, z));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[LOOP:2: B:38:0x00ab->B:43:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[LOOP:0: B:31:0x0076->B:55:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee A[EDGE_INSN: B:73:0x00ee->B:57:0x00ee BREAK  A[LOOP:0: B:31:0x0076->B:55:0x00e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee A[EDGE_INSN: B:74:0x00ee->B:57:0x00ee BREAK  A[LOOP:0: B:31:0x0076->B:55:0x00e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[EDGE_INSN: B:80:0x00c9->B:45:0x00c9 BREAK  A[LOOP:2: B:38:0x00ab->B:43:0x00c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final void C(boolean z) {
        Long l;
        long j;
        long jLongValue;
        c79 c79VarW;
        List list;
        int[] iArr;
        long[] jArr;
        int length;
        long j2;
        Collection collectionJ;
        int i;
        long j3;
        int i2;
        int i3;
        long j4;
        int i4;
        Iterator it;
        Object next;
        v4e v4eVar;
        String string;
        boolean z2;
        if (this.q) {
            return;
        }
        this.q = true;
        long j5 = 1;
        mjg mjgVar = this.h;
        if (z) {
            j = 0L;
        } else {
            Integer num = ((bw1) mjgVar.getValue()).a;
            if (num == null || num.intValue() != R.id.call_rate_positive_button) {
                if (num != null && num.intValue() == R.id.call_rate_negative_button) {
                    j = 1L;
                } else {
                    l = null;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                    if (jLongValue == 0) {
                        collectionJ = r66.a;
                        j2 = 1;
                    } else {
                        c79VarW = yab.w();
                        list = this.f;
                        if (list != null) {
                            c79VarW.addAll(list);
                        }
                        f8b f8bVar = ((bw1) mjgVar.getValue()).b;
                        iArr = f8bVar.b;
                        jArr = f8bVar.a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i = 0;
                            while (true) {
                                j3 = jArr[i];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    i2 = 8 - ((~(i - length)) >>> 31);
                                    i3 = 0;
                                    while (i3 < i2) {
                                        if ((j3 & 255) < 128) {
                                            i4 = iArr[(i << 3) + i3];
                                            it = v4e.m.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    j4 = j5;
                                                    next = null;
                                                    break;
                                                } else {
                                                    next = it.next();
                                                    j4 = j5;
                                                    if (((v4e) next).ordinal() == i4) {
                                                        break;
                                                    } else {
                                                        j5 = j4;
                                                    }
                                                }
                                            }
                                            v4eVar = (v4e) next;
                                            if (v4eVar != null) {
                                                c79VarW.add(v4eVar.a);
                                            }
                                        } else {
                                            j4 = j5;
                                        }
                                        j3 >>= 8;
                                        i3++;
                                        j5 = j4;
                                    }
                                    j2 = j5;
                                    if (i2 == 8) {
                                        break;
                                    }
                                } else {
                                    j2 = j5;
                                }
                                if (i != length) {
                                    break;
                                }
                                i++;
                                j5 = j2;
                            }
                        } else {
                            j2 = 1;
                        }
                        collectionJ = yab.j(c79VarW);
                    }
                    if (collectionJ.isEmpty()) {
                        collectionJ = null;
                    }
                    if (collectionJ != null) {
                        string = collectionJ.toString();
                    } else {
                        string = null;
                    }
                    sa2 sa2Var = (sa2) this.g.getValue();
                    sa2Var.getClass();
                    sa2.c(sa2Var, "CALL_REVIEW", this.c, string, l, null, null, this.d, null, 352);
                    if (z && jLongValue == j2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a8j.x(this.p, new yv1(z2));
                }
            }
            j = 3L;
        }
        l = j;
        if (l != null) {
            jLongValue = l.longValue();
            if (jLongValue == 0) {
                collectionJ = r66.a;
                j2 = 1;
            } else {
                c79VarW = yab.w();
                list = this.f;
                if (list != null) {
                    c79VarW.addAll(list);
                }
                f8b f8bVar2 = ((bw1) mjgVar.getValue()).b;
                iArr = f8bVar2.b;
                jArr = f8bVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i2 = 8 - ((~(i - length)) >>> 31);
                            i3 = 0;
                            while (i3 < i2) {
                                if ((j3 & 255) < 128) {
                                    i4 = iArr[(i << 3) + i3];
                                    it = v4e.m.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            j4 = j5;
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        j4 = j5;
                                        if (((v4e) next).ordinal() == i4) {
                                            break;
                                            break;
                                        }
                                        j5 = j4;
                                    }
                                    v4eVar = (v4e) next;
                                    if (v4eVar != null) {
                                        c79VarW.add(v4eVar.a);
                                    }
                                } else {
                                    j4 = j5;
                                }
                                j3 >>= 8;
                                i3++;
                                j5 = j4;
                            }
                            j2 = j5;
                            if (i2 == 8) {
                                break;
                                break;
                            }
                        } else {
                            j2 = j5;
                        }
                        if (i != length) {
                            break;
                            break;
                        } else {
                            i++;
                            j5 = j2;
                        }
                    }
                } else {
                    j2 = 1;
                }
                collectionJ = yab.j(c79VarW);
            }
            if (collectionJ.isEmpty()) {
                collectionJ = null;
            }
            if (collectionJ != null) {
                string = collectionJ.toString();
            } else {
                string = null;
            }
            sa2 sa2Var2 = (sa2) this.g.getValue();
            sa2Var2.getClass();
            sa2.c(sa2Var2, "CALL_REVIEW", this.c, string, l, null, null, this.d, null, 352);
            if (z) {
                z2 = false;
            } else {
                z2 = false;
            }
            a8j.x(this.p, new yv1(z2));
        }
    }
}
