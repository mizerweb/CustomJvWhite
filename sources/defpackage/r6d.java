package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;
import ru.ok.tamtam.messages.c;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r6d {
    public final no4 a;
    public final y8d b;
    public final ifh c = new ifh(new gvc(16));

    public r6d(no4 no4Var, y8d y8dVar) {
        this.a = no4Var;
        this.b = y8dVar;
    }

    public static rnh c(o5d o5dVar, int i, String str) {
        return (o5dVar.d & 1) != 0 ? new rnh(R.plurals.messages_list_message_poll_anonymous_answers_count, i, a.n1(Arrays.copyOf(new Object[]{str}, 1))) : new rnh(R.plurals.messages_list_message_poll_answers_count, i, a.n1(Arrays.copyOf(new Object[]{str}, 1)));
    }

    public final List a(u8b u8bVar, int i) {
        if (u8bVar.b <= 0) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = u8bVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            l5d l5dVar = (l5d) u8bVar.g(i3);
            vg4 vg4Var = (vg4) this.a.j(l5dVar.a).a.getValue();
            ylc ylcVar = vg4Var == null ? null : new ylc(gm0.a(vg4Var.u(), Long.valueOf(vg4Var.v())), vg4Var.x(((Number) this.c.getValue()).intValue()));
            if (ylcVar != null) {
                arrayList.add(new ylc(ylcVar, Long.valueOf(l5dVar.b)));
            }
        }
        return yhf.w0(yhf.u0(new m2i(new rj7(new sw(1, arrayList), 1, new xa8(19)), new pyb(22)), i));
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0314  */
    /* JADX WARN: Code duplicated, block: B:168:0x0323  */
    /* JADX WARN: Code duplicated, block: B:170:0x0327  */
    /* JADX WARN: Code duplicated, block: B:171:0x032d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0356  */
    /* JADX WARN: Code duplicated, block: B:185:0x035d  */
    /* JADX WARN: Code duplicated, block: B:189:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0384  */
    /* JADX WARN: Code duplicated, block: B:196:0x038d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0399  */
    public final e7d b(mm9 mm9Var, c cVar) {
        ylc ylcVar;
        String strO;
        boolean z;
        mm9 mm9Var2;
        boolean z2;
        List arrayList;
        ArrayList arrayList2;
        List arrayList3;
        LinkedHashSet linkedHashSet;
        a7d x6dVar;
        a7d y6dVar;
        ArrayList arrayList4;
        LinkedHashSet linkedHashSet2;
        boolean z3;
        String str;
        boolean z4;
        int i;
        long j;
        CharSequence charSequence;
        kjl u6dVar;
        b7d b7dVar;
        CharSequence charSequence2;
        o5d o5dVarU = mm9Var.b().u();
        if (o5dVarU == null) {
            return null;
        }
        int i2 = o5dVarU.d;
        long j2 = o5dVarU.a;
        cVar.m(cVar.d);
        wcd wcdVar = cVar.n;
        CharSequence charSequence3 = wcdVar != null ? wcdVar.a : o5dVarU.b;
        tnh tnhVar = new tnh(yil.b(i2) ? R.string.messages_list_message_poll_finished_subtitle : (i2 & 4) != 0 ? R.string.messages_list_message_poll_subtitle : R.string.messages_list_message_poll_cant_revote_subtitle);
        n5d n5dVar = o5dVarU.e;
        int i3 = n5dVar != null ? n5dVar.a : 0;
        DecimalFormat decimalFormat = l5h.a;
        long j3 = i3;
        if (j3 < 10000) {
            strO = String.valueOf(j3);
        } else {
            if (j3 >= 1000000000) {
                ylcVar = new ylc(Double.valueOf(j3 / 1.0E9d), "B");
            } else if (j3 >= 1000000) {
                ylcVar = new ylc(Double.valueOf(j3 / 1000000.0d), "M");
            } else {
                ylcVar = j3 >= 1000 ? new ylc(Double.valueOf(j3 / 1000.0d), "K") : new ylc(Double.valueOf(j3), "");
            }
            double dDoubleValue = ((Number) ylcVar.a).doubleValue();
            String str2 = (String) ylcVar.b;
            strO = zo5.o((!cqk.d(str2, "K") || dDoubleValue >= 100.0d) ? cqk.d(str2, "K") ? l5h.b.format(dDoubleValue) : l5h.a.format(dDoubleValue) : l5h.c.format(dDoubleValue), str2);
        }
        e8b e8bVar = new e8b(n5dVar != null ? n5dVar.b.b : 0);
        if (n5dVar != null) {
            u8b u8bVar = n5dVar.b;
            Object[] objArr = u8bVar.a;
            int i4 = u8bVar.b;
            z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                m5d m5dVar = (m5d) objArr[i5];
                e8bVar.f(m5dVar.a, m5dVar);
                boolean z5 = (m5dVar.e & 1) != 0;
                if (!z && z5) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean z6 = true;
        f8b f8bVar = (f8b) this.b.a.computeIfAbsent(Long.valueOf(mm9Var.b().a), new f05(10, new pyb(25)));
        u8b u8bVar2 = o5dVarU.c;
        ArrayList arrayList5 = new ArrayList(u8bVar2.b);
        Object[] objArr2 = u8bVar2.a;
        int i6 = u8bVar2.b;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i6;
            k5d k5dVar = (k5d) objArr2[i7];
            if (z || yil.b(i2)) {
                j = j2;
                Integer numD = n5dVar != null ? n5dVar.d() : null;
                boolean z7 = (i2 & 1) != 0 ? z6 : false;
                er3 er3Var = er3.k;
                Integer num = numD;
                int i9 = k5dVar.b;
                boolean z8 = z7;
                if (wcdVar == null || (charSequence = (CharSequence) wcdVar.b.c(i9)) == null) {
                    charSequence = k5dVar.a;
                }
                CharSequence charSequence4 = charSequence;
                m5d m5dVar2 = (m5d) e8bVar.c(i9);
                if (m5dVar2 == null) {
                    b7dVar = new b7d(i9, charSequence4, er3Var, v6d.c, f8bVar.d(i9));
                } else {
                    int i10 = m5dVar2.b;
                    u8b u8bVar3 = m5dVar2.c;
                    d7d c7dVar = (m5dVar2.e & 1) != 0 ? new c7d(z6) : er3Var;
                    int i11 = m5dVar2.d;
                    if ((u8bVar3.j() || z8) && num != null && i9 == num.intValue()) {
                        u6dVar = new u6d(i10, z8 ? new ArrayList() : a(u8bVar3, 1));
                    } else if (u8bVar3.j()) {
                        u6dVar = new t6d(i10, z8 ? new ArrayList() : a(u8bVar3, 2));
                    } else {
                        u6dVar = new s6d(i10);
                    }
                    b7dVar = new b7d(i9, charSequence4, c7dVar, new v6d(i11, u6dVar), f8bVar.d(i9));
                }
                arrayList5.add(b7dVar);
                i7++;
                i6 = i8;
                wcdVar = wcdVar;
                e8bVar = e8bVar;
                charSequence3 = charSequence3;
                j2 = j;
                z6 = true;
            } else {
                j = j2;
                c7d c7dVar2 = new c7d(false);
                int i12 = k5dVar.b;
                if (wcdVar == null || (charSequence2 = (CharSequence) wcdVar.b.c(i12)) == null) {
                    charSequence2 = k5dVar.a;
                }
                b7dVar = new b7d(i12, charSequence2, c7dVar2, so2.k, f8bVar.d(k5dVar.b));
            }
            charSequence3 = charSequence3;
            arrayList5.add(b7dVar);
            i7++;
            i6 = i8;
            wcdVar = wcdVar;
            e8bVar = e8bVar;
            charSequence3 = charSequence3;
            j2 = j;
            z6 = true;
        }
        long j4 = j2;
        CharSequence charSequence5 = charSequence3;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
        if (!z && !yil.b(i2)) {
            mm9Var2 = mm9Var;
            rt2 rt2Var = mm9Var2.a;
            z2 = mm9Var2.b().T() && ((rt2Var.d0() && (rt2Var.M() || rt2Var.Q())) || mm9Var2.e().f);
            if (i3 <= 0) {
                arrayList = r66.a;
                if (z2) {
                    if (!z || yil.b(i2)) {
                        arrayList = new ArrayList();
                    } else {
                        if (n5dVar == null || (linkedHashSet2 = n5dVar.c) == null) {
                            arrayList4 = null;
                        } else {
                            arrayList4 = new ArrayList();
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                ylc ylcVarD = d(((Number) it.next()).longValue());
                                if (ylcVarD != null) {
                                    arrayList4.add(ylcVarD);
                                }
                            }
                        }
                        if (arrayList4 != null) {
                            arrayList = arrayList4;
                        }
                    }
                    y6dVar = new y6d(c(o5dVarU, i3, strO), arrayList);
                } else {
                    if ((i2 & 1) != 0) {
                        arrayList3 = new ArrayList();
                    } else {
                        if (n5dVar != null || (linkedHashSet = n5dVar.c) == null) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList();
                            Iterator it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                ylc ylcVarD2 = d(((Number) it2.next()).longValue());
                                if (ylcVarD2 != null) {
                                    arrayList2.add(ylcVarD2);
                                }
                            }
                        }
                        arrayList3 = arrayList2;
                    }
                    if (arrayList3 != null) {
                        arrayList = arrayList3;
                    }
                    x6dVar = new x6d(c(o5dVarU, i3, strO), arrayList);
                }
                long j5 = mm9Var2.b().a;
                if (mm9Var2.b().b != 0 || z || yil.b(i2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                str = mm9Var2.b().g;
                if (str != null || str.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new e7d(j5, j4, charSequence5, tnhVar, listUnmodifiableList, x6dVar, z3, !z4);
            }
            if (yil.b(i2)) {
                i = R.string.messages_list_message_poll_no_answers_finished_button_title;
            } else if ((i2 & 1) != 0) {
                i = R.string.messages_list_message_poll_anonymous_button_title;
            } else {
                i = R.string.messages_list_message_poll_no_answers_button_title;
            }
            y6dVar = new z6d(new tnh(i));
            x6dVar = y6dVar;
            long j6 = mm9Var2.b().a;
            if (mm9Var2.b().b != 0) {
                z3 = false;
            } else {
                z3 = false;
            }
            str = mm9Var2.b().g;
            if (str != null) {
                z4 = true;
            } else {
                z4 = true;
            }
            return new e7d(j6, j4, charSequence5, tnhVar, listUnmodifiableList, x6dVar, z3, !z4);
        }
        mm9Var2 = mm9Var;
        if (i3 <= 0) {
            arrayList = r66.a;
            if (z2) {
                if (z) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList();
                }
                y6dVar = new y6d(c(o5dVarU, i3, strO), arrayList);
            } else {
                if ((i2 & 1) != 0) {
                    arrayList3 = new ArrayList();
                } else {
                    if (n5dVar != null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList3 = arrayList2;
                }
                if (arrayList3 != null) {
                    arrayList = arrayList3;
                }
                x6dVar = new x6d(c(o5dVarU, i3, strO), arrayList);
            }
            long j7 = mm9Var2.b().a;
            if (mm9Var2.b().b != 0) {
                z3 = false;
            } else {
                z3 = false;
            }
            str = mm9Var2.b().g;
            if (str != null) {
                z4 = true;
            } else {
                z4 = true;
            }
            return new e7d(j7, j4, charSequence5, tnhVar, listUnmodifiableList, x6dVar, z3, !z4);
        }
        if (yil.b(i2)) {
            i = R.string.messages_list_message_poll_no_answers_finished_button_title;
        } else if ((i2 & 1) != 0) {
            i = R.string.messages_list_message_poll_anonymous_button_title;
        } else {
            i = R.string.messages_list_message_poll_no_answers_button_title;
        }
        y6dVar = new z6d(new tnh(i));
        x6dVar = y6dVar;
        long j8 = mm9Var2.b().a;
        if (mm9Var2.b().b != 0) {
            z3 = false;
        } else {
            z3 = false;
        }
        str = mm9Var2.b().g;
        if (str != null) {
            z4 = true;
        } else {
            z4 = true;
        }
        return new e7d(j8, j4, charSequence5, tnhVar, listUnmodifiableList, x6dVar, z3, !z4);
    }

    public final ylc d(long j) {
        vg4 vg4Var = (vg4) this.a.j(j).a.getValue();
        if (vg4Var == null) {
            return null;
        }
        return new ylc(gm0.a(vg4Var.u(), Long.valueOf(vg4Var.v())), vg4Var.x(((Number) this.c.getValue()).intValue()));
    }
}
