package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n9h extends mdh implements qf7 {
    public List e;
    public ufe f;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lah l;
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;
    public final /* synthetic */ uii o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9h(lah lahVar, String str, int i, uii uiiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = lahVar;
        this.m = str;
        this.n = i;
        this.o = uiiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        n9h n9hVar = new n9h(this.l, this.m, this.n, this.o, lq4Var);
        n9hVar.k = obj;
        return n9hVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((n9h) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205 A[Catch: all -> 0x023b, TryCatch #3 {all -> 0x023b, blocks: (B:104:0x01f7, B:106:0x0205, B:109:0x020d, B:110:0x0222, B:112:0x0228, B:113:0x0238), top: B:127:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0228 A[Catch: all -> 0x023b, LOOP:0: B:110:0x0222->B:112:0x0228, LOOP_END, TryCatch #3 {all -> 0x023b, blocks: (B:104:0x01f7, B:106:0x0205, B:109:0x020d, B:110:0x0222, B:112:0x0228, B:113:0x0238), top: B:127:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[Catch: all -> 0x011f, TryCatch #10 {all -> 0x011f, blocks: (B:47:0x00d8, B:49:0x00e6, B:52:0x00ee, B:53:0x0101, B:55:0x0107), top: B:141:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #10 {all -> 0x011f, blocks: (B:47:0x00d8, B:49:0x00e6, B:52:0x00ee, B:53:0x0101, B:55:0x0107), top: B:141:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d3  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        int i;
        int i2;
        ufe ufeVar;
        int i3;
        List list;
        int i4;
        int i5;
        ufe ufeVar2;
        Object objK0;
        List list2;
        int i6;
        ufe ufeVar3;
        int i7;
        List list3;
        ufe ufeVar4;
        int i8;
        Object objK1;
        List list4;
        List list5;
        int i9;
        p8h p8hVar;
        List list6;
        int i10;
        int size;
        ArrayList arrayList2;
        Iterator it;
        List list7;
        int i11;
        int size2;
        int i12;
        int size3;
        ArrayList arrayList3;
        Iterator it2;
        gu4 gu4Var = (gu4) this.k;
        int i13 = this.j;
        lah lahVar = this.l;
        boolean z = true;
        uii uiiVar = this.o;
        int i14 = this.n;
        String str = this.m;
        hu4 hu4Var = hu4.a;
        try {
            if (i13 == 0) {
                ch3.d0(obj);
                if (cqk.d(lahVar.a, str) && lahVar.b == i14 && !lahVar.f) {
                    return lahVar;
                }
                arrayList = new ArrayList();
                i = lahVar.e;
                ufe ufeVar5 = new ufe();
                lx2 lx2Var = (lx2) uiiVar.b;
                i2 = (lx2Var == lx2.b || lx2Var == lx2.d) ? 1 : 0;
                ifh ifhVar = new ifh(new t86(str, i14, uiiVar, 5));
                if (i2 != 0 || ((o9h) ifhVar.getValue()) == o9h.c || ((o9h) ifhVar.getValue()) == o9h.d) {
                    try {
                        this.k = gu4Var;
                        this.e = arrayList;
                        this.f = ufeVar5;
                        this.g = i;
                        this.h = i2;
                        this.i = 10;
                        this.j = 1;
                        try {
                            ufeVar = ufeVar5;
                            try {
                                i3 = i2;
                                try {
                                    objK0 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 0), this);
                                    if (objK0 != hu4Var) {
                                        i4 = i;
                                        i5 = i3;
                                        ufeVar2 = ufeVar;
                                        list2 = arrayList;
                                        i6 = 10;
                                        list6 = (List) objK0;
                                        ufeVar2.a = list6.size();
                                        if (list6.size() > i4) {
                                            i10 = i6 + i4;
                                            size = list6.size();
                                            if (i10 > size) {
                                                i10 = size;
                                            }
                                            List listSubList = list6.subList(i4, i10);
                                            arrayList2 = new ArrayList(yw3.W0(listSubList, 10));
                                            it = listSubList.iterator();
                                            while (it.hasNext()) {
                                                z = z;
                                                arrayList2.add(new kah((p8h) it.next(), false));
                                                z = z;
                                            }
                                            z = z;
                                            list2.addAll(arrayList2);
                                        } else {
                                            z = true;
                                        }
                                        arrayList = list2;
                                        i2 = i5;
                                        ufeVar3 = ufeVar2;
                                        i = i4;
                                        if (i2 != 0) {
                                            list5 = (List) uiiVar.h;
                                            if (list5 != null) {
                                                i9 = 0;
                                            } else {
                                                i9 = 0;
                                            }
                                            if (i9 != 1) {
                                                uiiVar.f = str;
                                                uiiVar.g = new Integer(i14);
                                                return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                            }
                                        }
                                        this.k = gu4Var;
                                        this.e = arrayList;
                                        this.f = ufeVar3;
                                        this.g = i;
                                        this.h = i2;
                                        i7 = 0;
                                        this.i = 0;
                                        this.j = 2;
                                        objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                                        if (objK1 != hu4Var) {
                                            i8 = i;
                                        }
                                    }
                                } catch (Throwable unused) {
                                    z = true;
                                    list = arrayList;
                                    i4 = i;
                                    i5 = i3;
                                    ufeVar2 = ufeVar;
                                    arrayList = list;
                                    ufeVar3 = ufeVar2;
                                    i2 = i5;
                                    i = i4;
                                    if (i2 != 0) {
                                        list5 = (List) uiiVar.h;
                                        if (list5 != null) {
                                            i9 = 0;
                                        } else {
                                            i9 = 0;
                                        }
                                        if (i9 != 1) {
                                            uiiVar.f = str;
                                            uiiVar.g = new Integer(i14);
                                            return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                        }
                                    }
                                    this.k = gu4Var;
                                    this.e = arrayList;
                                    this.f = ufeVar3;
                                    this.g = i;
                                    this.h = i2;
                                    i7 = 0;
                                    this.i = 0;
                                    this.j = 2;
                                    objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                                    if (objK1 != hu4Var) {
                                        i8 = i;
                                        list7 = (List) objK1;
                                        if (arrayList.size() >= 10) {
                                            return new lah(i14, list7.size() + ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                        }
                                        int i15 = ufeVar3.a;
                                        i11 = i8 - i15;
                                        if (i11 < 0) {
                                            i11 = i7;
                                        }
                                        ufeVar3.a = list7.size() + i15;
                                        size2 = 10 - arrayList.size();
                                        if (list7.size() > i11) {
                                            i12 = size2 + i11;
                                            size3 = list7.size();
                                            if (i12 > size3) {
                                                i12 = size3;
                                            }
                                            List listSubList2 = list7.subList(i11, i12);
                                            arrayList3 = new ArrayList(yw3.W0(listSubList2, 10));
                                            it2 = listSubList2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(new kah((p8h) it2.next(), true));
                                            }
                                            arrayList.addAll(arrayList3);
                                        }
                                        uiiVar.f = str;
                                        uiiVar.g = new Integer(i14);
                                        return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                    }
                                    return hu4Var;
                                }
                            } catch (Throwable unused2) {
                                i3 = i2;
                                list = arrayList;
                                i4 = i;
                                i5 = i3;
                                ufeVar2 = ufeVar;
                                arrayList = list;
                                ufeVar3 = ufeVar2;
                                i2 = i5;
                                i = i4;
                                if (i2 != 0) {
                                    list5 = (List) uiiVar.h;
                                    if (list5 != null) {
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                    }
                                    if (i9 != 1) {
                                        uiiVar.f = str;
                                        uiiVar.g = new Integer(i14);
                                        return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                    }
                                }
                                this.k = gu4Var;
                                this.e = arrayList;
                                this.f = ufeVar3;
                                this.g = i;
                                this.h = i2;
                                i7 = 0;
                                this.i = 0;
                                this.j = 2;
                                objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                                if (objK1 != hu4Var) {
                                    i8 = i;
                                    list7 = (List) objK1;
                                    if (arrayList.size() >= 10) {
                                        return new lah(i14, list7.size() + ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                    }
                                    int i16 = ufeVar3.a;
                                    i11 = i8 - i16;
                                    if (i11 < 0) {
                                        i11 = i7;
                                    }
                                    ufeVar3.a = list7.size() + i16;
                                    size2 = 10 - arrayList.size();
                                    if (list7.size() > i11) {
                                        i12 = size2 + i11;
                                        size3 = list7.size();
                                        if (i12 > size3) {
                                            i12 = size3;
                                        }
                                        List listSubList3 = list7.subList(i11, i12);
                                        arrayList3 = new ArrayList(yw3.W0(listSubList3, 10));
                                        it2 = listSubList3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(new kah((p8h) it2.next(), true));
                                        }
                                        arrayList.addAll(arrayList3);
                                    }
                                    uiiVar.f = str;
                                    uiiVar.g = new Integer(i14);
                                    return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                }
                                return hu4Var;
                            }
                        } catch (Throwable unused3) {
                            ufeVar = ufeVar5;
                        }
                    } catch (Throwable unused4) {
                        ufeVar = ufeVar5;
                    }
                } else {
                    z = true;
                    ufeVar3 = ufeVar5;
                    if (i2 != 0) {
                        list5 = (List) uiiVar.h;
                        if (list5 != null) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                        }
                        if (i9 != 1) {
                            uiiVar.f = str;
                            uiiVar.g = new Integer(i14);
                            return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                        }
                    }
                    this.k = gu4Var;
                    this.e = arrayList;
                    this.f = ufeVar3;
                    this.g = i;
                    this.h = i2;
                    i7 = 0;
                    this.i = 0;
                    this.j = 2;
                    objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                    if (objK1 != hu4Var) {
                        i8 = i;
                    }
                }
                return hu4Var;
            }
            if (i13 == 1) {
                i6 = this.i;
                i5 = this.h;
                i4 = this.g;
                ufeVar2 = this.f;
                list = this.e;
                try {
                    try {
                        ch3.d0(obj);
                        objK0 = obj;
                        list2 = list;
                        try {
                            list6 = (List) objK0;
                            ufeVar2.a = list6.size();
                            if (list6.size() > i4) {
                                i10 = i6 + i4;
                                size = list6.size();
                                if (i10 > size) {
                                    i10 = size;
                                }
                                List listSubList4 = list6.subList(i4, i10);
                                arrayList2 = new ArrayList(yw3.W0(listSubList4, 10));
                                it = listSubList4.iterator();
                                while (it.hasNext()) {
                                    z = z;
                                    try {
                                        arrayList2.add(new kah((p8h) it.next(), false));
                                        z = z;
                                    } catch (Throwable unused5) {
                                        list = list2;
                                        arrayList = list;
                                        ufeVar3 = ufeVar2;
                                        i2 = i5;
                                        i = i4;
                                        if (i2 != 0) {
                                            list5 = (List) uiiVar.h;
                                            if (list5 != null) {
                                                i9 = 0;
                                            } else {
                                                i9 = 0;
                                            }
                                            if (i9 != 1) {
                                                uiiVar.f = str;
                                                uiiVar.g = new Integer(i14);
                                                return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                            }
                                        }
                                        this.k = gu4Var;
                                        this.e = arrayList;
                                        this.f = ufeVar3;
                                        this.g = i;
                                        this.h = i2;
                                        i7 = 0;
                                        this.i = 0;
                                        this.j = 2;
                                        objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                                        if (objK1 != hu4Var) {
                                            i8 = i;
                                            list7 = (List) objK1;
                                            if (arrayList.size() >= 10) {
                                                return new lah(i14, list7.size() + ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                            }
                                            int i17 = ufeVar3.a;
                                            i11 = i8 - i17;
                                            if (i11 < 0) {
                                                i11 = i7;
                                            }
                                            ufeVar3.a = list7.size() + i17;
                                            try {
                                                size2 = 10 - arrayList.size();
                                                if (list7.size() > i11) {
                                                    i12 = size2 + i11;
                                                    size3 = list7.size();
                                                    if (i12 > size3) {
                                                        i12 = size3;
                                                    }
                                                    List listSubList5 = list7.subList(i11, i12);
                                                    arrayList3 = new ArrayList(yw3.W0(listSubList5, 10));
                                                    it2 = listSubList5.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList3.add(new kah((p8h) it2.next(), true));
                                                    }
                                                    arrayList.addAll(arrayList3);
                                                }
                                            } catch (Throwable unused6) {
                                            }
                                            uiiVar.f = str;
                                            uiiVar.g = new Integer(i14);
                                            return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                                        }
                                        return hu4Var;
                                    }
                                }
                                z = z;
                                list2.addAll(arrayList2);
                            } else {
                                z = true;
                            }
                            arrayList = list2;
                            i2 = i5;
                            ufeVar3 = ufeVar2;
                        } catch (Throwable unused7) {
                            z = z;
                        }
                    } catch (Throwable unused8) {
                        z = true;
                        arrayList = list;
                        ufeVar3 = ufeVar2;
                        i2 = i5;
                        i = i4;
                        if (i2 != 0) {
                            list5 = (List) uiiVar.h;
                            if (list5 != null) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            if (i9 != 1) {
                                uiiVar.f = str;
                                uiiVar.g = new Integer(i14);
                                return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                            }
                        }
                        this.k = gu4Var;
                        this.e = arrayList;
                        this.f = ufeVar3;
                        this.g = i;
                        this.h = i2;
                        i7 = 0;
                        this.i = 0;
                        this.j = 2;
                        objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                        if (objK1 != hu4Var) {
                            i8 = i;
                            list7 = (List) objK1;
                            if (arrayList.size() >= 10) {
                                return new lah(i14, list7.size() + ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                            }
                            int i18 = ufeVar3.a;
                            i11 = i8 - i18;
                            if (i11 < 0) {
                                i11 = i7;
                            }
                            ufeVar3.a = list7.size() + i18;
                            size2 = 10 - arrayList.size();
                            if (list7.size() > i11) {
                                i12 = size2 + i11;
                                size3 = list7.size();
                                if (i12 > size3) {
                                    i12 = size3;
                                }
                                List listSubList6 = list7.subList(i11, i12);
                                arrayList3 = new ArrayList(yw3.W0(listSubList6, 10));
                                it2 = listSubList6.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(new kah((p8h) it2.next(), true));
                                }
                                arrayList.addAll(arrayList3);
                            }
                            uiiVar.f = str;
                            uiiVar.g = new Integer(i14);
                            return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                        }
                        return hu4Var;
                    }
                    this.k = gu4Var;
                    this.e = arrayList;
                    this.f = ufeVar3;
                    this.g = i;
                    this.h = i2;
                    i7 = 0;
                    try {
                        this.i = 0;
                        this.j = 2;
                        objK1 = yab.K0(((n0c) ((xhh) uiiVar.c)).a(), new m9h(uiiVar, str, i14, null, 1), this);
                        if (objK1 != hu4Var) {
                            i8 = i;
                        }
                        return hu4Var;
                    } catch (Throwable unused9) {
                        list3 = arrayList;
                        ufeVar4 = ufeVar3;
                        i8 = i;
                        ufe ufeVar6 = ufeVar4;
                        arrayList = list3;
                        objK1 = r66.a;
                        ufeVar3 = ufeVar6;
                    }
                } catch (Throwable unused10) {
                    i7 = 0;
                }
                i = i4;
                if (i2 != 0 && (list4 = (List) uiiVar.h) != null && (!list4.isEmpty()) == z) {
                    list5 = (List) uiiVar.h;
                    if (list5 != null || (p8hVar = (p8h) ww3.t1(list5)) == null) {
                        i9 = 0;
                    } else {
                        i9 = p8hVar.b;
                    }
                    if (i9 != 1) {
                        uiiVar.f = str;
                        uiiVar.g = new Integer(i14);
                        return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
                    }
                }
            } else {
                if (i13 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i8 = this.g;
                ufeVar4 = this.f;
                list3 = this.e;
                try {
                    ch3.d0(obj);
                    ufeVar3 = ufeVar4;
                    i7 = 0;
                    arrayList = list3;
                    objK1 = obj;
                } catch (Throwable unused11) {
                    i7 = 0;
                    ufe ufeVar7 = ufeVar4;
                    arrayList = list3;
                    objK1 = r66.a;
                    ufeVar3 = ufeVar7;
                }
            }
            list7 = (List) objK1;
            if (arrayList.size() >= 10) {
                return new lah(i14, list7.size() + ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
            }
            int i19 = ufeVar3.a;
            i11 = i8 - i19;
            if (i11 < 0) {
                i11 = i7;
            }
            ufeVar3.a = list7.size() + i19;
            size2 = 10 - arrayList.size();
            if (list7.size() > i11) {
                i12 = size2 + i11;
                size3 = list7.size();
                if (i12 > size3) {
                    i12 = size3;
                }
                List listSubList7 = list7.subList(i11, i12);
                arrayList3 = new ArrayList(yw3.W0(listSubList7, 10));
                it2 = listSubList7.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new kah((p8h) it2.next(), true));
                }
                arrayList.addAll(arrayList3);
            }
            uiiVar.f = str;
            uiiVar.g = new Integer(i14);
            return new lah(i14, ufeVar3.a, str, ww3.G1(arrayList, lahVar.d));
        } catch (CancellationException e) {
            throw e;
        }
    }
}
