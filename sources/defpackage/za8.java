package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class za8 extends mdh implements qf7 {
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ mh7 j;
    public final /* synthetic */ px8 k;
    public final /* synthetic */ rb8 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za8(mh7 mh7Var, px8 px8Var, rb8 rb8Var, int i, int i2, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = mh7Var;
        this.k = px8Var;
        this.l = rb8Var;
        this.m = i;
        this.n = i2;
        this.o = z;
    }

    public static final void l(gu4 gu4Var, rb8 rb8Var, px8 px8Var, boolean z) {
        sgg sggVar;
        vd7.q(gu4Var.k());
        if (z && (sggVar = rb8Var.s) != null && sggVar.isActive()) {
            throw new ji1("content change", 4);
        }
    }

    public static final boolean n(gu4 gu4Var, rb8 rb8Var, px8 px8Var, boolean z) {
        l(gu4Var, rb8Var, px8Var, z);
        if (!z) {
            return cqk.x(gu4Var);
        }
        if (!cqk.x(gu4Var)) {
            return false;
        }
        sgg sggVar = rb8Var.s;
        return sggVar == null || !sggVar.isActive();
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        za8 za8Var = new za8(this.j, this.k, this.l, this.m, this.n, this.o, lq4Var);
        za8Var.i = obj;
        return za8Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((za8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        za8 za8Var = this;
        final rb8 rb8Var = za8Var.l;
        xhh xhhVar = rb8Var.d;
        final gu4 gu4Var = (gu4) za8Var.i;
        int i = za8Var.h;
        boolean z = za8Var.o;
        final px8 px8Var = za8Var.k;
        if (i == 0) {
            ch3.d0(obj);
            final ArrayList arrayList4 = new ArrayList();
            final ArrayList arrayList5 = new ArrayList();
            final ArrayList arrayList6 = new ArrayList();
            mh7 mh7Var = za8Var.j;
            Iterator it = mh7Var.d().iterator();
            while (it.hasNext()) {
                final gh7 gh7Var = (gh7) it.next();
                ContentResolver contentResolver = rb8Var.e;
                final boolean z2 = za8Var.o;
                cf7 cf7Var = new cf7() { // from class: wa8
                    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
                    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
                    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
                    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
                    /* JADX WARN: Code duplicated, block: B:56:0x00ef A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
                    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
                    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
                    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
                    /* JADX WARN: Code duplicated, block: B:77:0x010a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:80:0x010a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:81:0x010a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:82:0x0118 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:83:0x0132 A[SYNTHETIC] */
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        int columnIndex;
                        Integer numValueOf;
                        Integer numValueOf2;
                        Integer numValueOf3;
                        int i2;
                        String string;
                        Integer numValueOf4;
                        String str;
                        jb9 jb9Var;
                        long j;
                        rb8 rb8Var2;
                        gu4 gu4Var2;
                        kb9 kb9Var;
                        String str2;
                        a4c a4cVar;
                        je9 je9Var;
                        gh7 gh7Var2 = gh7Var;
                        rb8 rb8Var3 = rb8Var;
                        ArrayList arrayList7 = arrayList6;
                        ArrayList arrayList8 = arrayList4;
                        ArrayList arrayList9 = arrayList5;
                        boolean z3 = z2;
                        gu4 gu4Var3 = gu4Var;
                        px8 px8Var2 = px8Var;
                        Cursor cursor = (Cursor) obj2;
                        int columnIndex2 = cursor.getColumnIndex(gh7Var2.f());
                        if (columnIndex2 != -1 && (columnIndex = cursor.getColumnIndex(gh7Var2.c())) != -1) {
                            int columnIndex3 = cursor.getColumnIndex(gh7Var2.h());
                            Integer numValueOf5 = Integer.valueOf(columnIndex3);
                            if (columnIndex3 == -1) {
                                numValueOf5 = null;
                            }
                            int columnIndex4 = cursor.getColumnIndex(gh7Var2.d());
                            if (columnIndex4 != -1) {
                                String strI = gh7Var2.i();
                                if (strI != null) {
                                    int columnIndex5 = cursor.getColumnIndex(strI);
                                    numValueOf = Integer.valueOf(columnIndex5);
                                    if (columnIndex5 == -1) {
                                        numValueOf = null;
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                String strE = gh7Var2.e();
                                if (strE != null) {
                                    int columnIndex6 = cursor.getColumnIndex(strE);
                                    numValueOf2 = Integer.valueOf(columnIndex6);
                                    if (columnIndex6 == -1) {
                                        numValueOf2 = null;
                                    }
                                } else {
                                    numValueOf2 = null;
                                }
                                String strG = gh7Var2.g();
                                if (strG != null) {
                                    int columnIndex7 = cursor.getColumnIndex(strG);
                                    numValueOf3 = Integer.valueOf(columnIndex7);
                                    if (columnIndex7 == -1) {
                                        numValueOf3 = null;
                                    }
                                } else {
                                    numValueOf3 = null;
                                }
                                while (cursor.moveToNext() && za8.n(gu4Var3, rb8Var3, px8Var2, z3)) {
                                    long j2 = cursor.getLong(columnIndex2);
                                    Uri uriB = gpl.b(cursor, columnIndex);
                                    if (uriB == null) {
                                        uriB = ContentUris.withAppendedId(gh7Var2.j(), j2);
                                    }
                                    long j3 = cursor.getLong(columnIndex4);
                                    px8Var2 = px8Var2;
                                    int i3 = numValueOf != null ? cursor.getInt(numValueOf.intValue()) : 0;
                                    String strK = gh7Var2.k();
                                    if (numValueOf5 == null) {
                                        i2 = i3;
                                    } else {
                                        i2 = i3;
                                        string = cursor.getString(numValueOf5.intValue());
                                        if (string == null) {
                                        }
                                        z3 = z3;
                                        if (numValueOf3 != null) {
                                            numValueOf4 = Integer.valueOf(cursor.getInt(numValueOf3.intValue()));
                                        } else {
                                            numValueOf4 = null;
                                        }
                                        ylc ylcVarA = rb8.a(rb8Var3, string, numValueOf4);
                                        str = (String) ylcVarA.a;
                                        jb9Var = (jb9) ylcVarA.b;
                                        if (jb9Var == jb9.a) {
                                            if (numValueOf2 != null) {
                                                j = cursor.getLong(numValueOf2.intValue());
                                            } else {
                                                j = 0;
                                            }
                                            if (l6i.a(rb8Var3.b, uriB)) {
                                                rb8Var2 = rb8Var3;
                                                gu4Var2 = gu4Var3;
                                                kb9Var = new kb9(j2, uriB, str, -1, j3, Integer.valueOf(i2), Long.valueOf(j), uriB, 896);
                                                if (gh7Var2.equals(dh7.c)) {
                                                    arrayList7.add(kb9Var);
                                                }
                                                if (jb9Var == jb9.d) {
                                                    arrayList8.add(kb9Var);
                                                } else {
                                                    arrayList9.add(kb9Var);
                                                }
                                            } else {
                                                str2 = rb8.u;
                                                a4cVar = gm0.f;
                                                if (a4cVar == null) {
                                                    je9Var = je9.d;
                                                    if (a4cVar.b(je9Var)) {
                                                        rb8Var2 = rb8Var3;
                                                        gu4Var2 = gu4Var3;
                                                        a4cVar.c(je9Var, str2, nbh.s(j2, "fetchMedias: ", ", is not valid uri, will continue with next"), null);
                                                    }
                                                }
                                            }
                                            rb8Var3 = rb8Var2;
                                            gu4Var3 = gu4Var2;
                                        }
                                    }
                                    string = strK;
                                    z3 = z3;
                                    if (numValueOf3 != null) {
                                        numValueOf4 = Integer.valueOf(cursor.getInt(numValueOf3.intValue()));
                                    } else {
                                        numValueOf4 = null;
                                    }
                                    ylc ylcVarA2 = rb8.a(rb8Var3, string, numValueOf4);
                                    str = (String) ylcVarA2.a;
                                    jb9Var = (jb9) ylcVarA2.b;
                                    if (jb9Var == jb9.a) {
                                        if (numValueOf2 != null) {
                                            j = cursor.getLong(numValueOf2.intValue());
                                        } else {
                                            j = 0;
                                        }
                                        if (l6i.a(rb8Var3.b, uriB)) {
                                            str2 = rb8.u;
                                            a4cVar = gm0.f;
                                            if (a4cVar == null) {
                                                je9Var = je9.d;
                                                if (a4cVar.b(je9Var)) {
                                                    rb8Var2 = rb8Var3;
                                                    gu4Var2 = gu4Var3;
                                                    a4cVar.c(je9Var, str2, nbh.s(j2, "fetchMedias: ", ", is not valid uri, will continue with next"), null);
                                                }
                                            }
                                        } else {
                                            rb8Var2 = rb8Var3;
                                            gu4Var2 = gu4Var3;
                                            kb9Var = new kb9(j2, uriB, str, -1, j3, Integer.valueOf(i2), Long.valueOf(j), uriB, 896);
                                            if (gh7Var2.equals(dh7.c)) {
                                                arrayList7.add(kb9Var);
                                            }
                                            if (jb9Var == jb9.d) {
                                                arrayList8.add(kb9Var);
                                            } else {
                                                arrayList9.add(kb9Var);
                                            }
                                        }
                                        rb8Var3 = rb8Var2;
                                        gu4Var3 = gu4Var2;
                                    }
                                }
                            }
                        }
                        return sbi.a;
                    }
                };
                ArrayList arrayList7 = arrayList6;
                xhh xhhVar2 = xhhVar;
                Iterator it2 = it;
                Cursor cursorQuery = contentResolver.query(gh7Var.j(), gh7Var.l(), l6i.c(Integer.valueOf(za8Var.m), Integer.valueOf(za8Var.n), mh7Var.e(gh7Var), mh7Var.a(gh7Var), gh7Var.m()), null);
                if (cursorQuery != null) {
                    try {
                        cf7Var.invoke(cursorQuery);
                        cursorQuery.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                arrayList6 = arrayList7;
                xhhVar = xhhVar2;
                it = it2;
                za8Var = this;
            }
            ArrayList arrayList8 = arrayList6;
            xhh xhhVar3 = xhhVar;
            if ((arrayList5.isEmpty() && arrayList4.isEmpty()) || !n(gu4Var, rb8Var, px8Var, z)) {
                r66 r66Var = r66.a;
                return new ua8(r66Var, r66Var, r66Var);
            }
            arrayList5.size();
            arrayList4.size();
            ArrayList arrayList9 = !arrayList8.isEmpty() ? arrayList8 : null;
            if (arrayList9 == null) {
                ArrayList arrayList10 = new ArrayList(arrayList4.size() + arrayList5.size());
                arrayList10.addAll(arrayList5);
                arrayList10.addAll(arrayList4);
                arrayList = arrayList10;
            } else {
                arrayList = arrayList9;
            }
            vo8[] vo8VarArr = {yab.i0(gu4Var, ((n0c) xhhVar3).b(), 0, new ya8(arrayList, null, 0), 2), yab.i0(gu4Var, ((n0c) xhhVar3).b(), 0, new ya8(arrayList5, null, 1), 2), yab.i0(gu4Var, ((n0c) xhhVar3).b(), 0, new ya8(arrayList4, null, 2), 2)};
            this.i = gu4Var;
            this.e = arrayList4;
            this.f = arrayList5;
            this.g = arrayList;
            this.h = 1;
            Object objV = ch3.v(vo8VarArr, this);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = za8Var.g;
            arrayList3 = za8Var.f;
            arrayList2 = za8Var.e;
            ch3.d0(obj);
        }
        l(gu4Var, rb8Var, px8Var, z);
        return new ua8(arrayList, arrayList2, arrayList3);
    }
}
