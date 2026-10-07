package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends koe implements qf7 {
    public Object c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Iterator k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zag(int i, int i2, Iterator it, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = i;
        this.j = i2;
        this.k = it;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        zag zagVar = new zag(this.i, this.j, this.k, lq4Var);
        zagVar.h = obj;
        return zagVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zag) create((thf) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0086 A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Iterator it;
        ype ypeVar;
        Iterator it2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        Object next;
        int i6;
        thf thfVar = (thf) this.h;
        int i7 = this.g;
        int i8 = this.j;
        int i9 = this.i;
        hu4 hu4Var = hu4.a;
        if (i7 == 0) {
            ch3.d0(obj);
            i = i9 <= 1024 ? i9 : 1024;
            i2 = i8 - i9;
            it = this.k;
            if (i2 >= 0) {
                i3 = i;
                arrayList = new ArrayList(i);
                i4 = i2;
                i5 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i9) {
                            this.h = thfVar;
                            this.c = arrayList;
                            this.d = it;
                            this.e = i3;
                            this.f = i4;
                            this.g = 1;
                            thfVar.b(arrayList, this);
                            return hu4Var;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.h = null;
                    this.c = null;
                    this.d = null;
                    this.e = i3;
                    this.f = i4;
                    this.g = 2;
                    thfVar.b(arrayList, this);
                    return hu4Var;
                }
            } else {
                ypeVar = new ype(i);
                it2 = it;
                while (it2.hasNext()) {
                    ypeVar.a(it2.next());
                    if (!ypeVar.c()) {
                        if (ypeVar.getSize() < i9) {
                            ArrayList arrayList2 = new ArrayList(ypeVar);
                            this.h = thfVar;
                            this.c = ypeVar;
                            this.d = it2;
                            this.e = i;
                            this.f = i2;
                            this.g = 3;
                            thfVar.b(arrayList2, this);
                            return hu4Var;
                        }
                        ypeVar = ypeVar.b(i9);
                    }
                }
                i6 = i;
                if (ypeVar.getSize() > i8) {
                    ArrayList arrayList3 = new ArrayList(ypeVar);
                    this.h = thfVar;
                    this.c = ypeVar;
                    this.d = null;
                    this.e = i6;
                    this.f = i2;
                    this.g = 4;
                    thfVar.b(arrayList3, this);
                    return hu4Var;
                }
                if (!ypeVar.isEmpty()) {
                    this.h = null;
                    this.c = null;
                    this.d = null;
                    this.e = i6;
                    this.f = i2;
                    this.g = 5;
                    thfVar.b(ypeVar, this);
                    return hu4Var;
                }
            }
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i2 = this.f;
                    int i10 = this.e;
                    it2 = this.d;
                    ype ypeVar2 = (ype) this.c;
                    ch3.d0(obj);
                    ypeVar2.d(i8);
                    i = i10;
                    ypeVar = ypeVar2;
                    while (it2.hasNext()) {
                        ypeVar.a(it2.next());
                        if (!ypeVar.c()) {
                            if (ypeVar.getSize() < i9) {
                                ArrayList arrayList4 = new ArrayList(ypeVar);
                                this.h = thfVar;
                                this.c = ypeVar;
                                this.d = it2;
                                this.e = i;
                                this.f = i2;
                                this.g = 3;
                                thfVar.b(arrayList4, this);
                                return hu4Var;
                            }
                            ypeVar = ypeVar.b(i9);
                        }
                    }
                    i6 = i;
                } else if (i7 == 4) {
                    i2 = this.f;
                    i6 = this.e;
                    ypeVar = (ype) this.c;
                    ch3.d0(obj);
                    ypeVar.d(i8);
                } else {
                    if (i7 != 5) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (ypeVar.getSize() > i8) {
                    ArrayList arrayList5 = new ArrayList(ypeVar);
                    this.h = thfVar;
                    this.c = ypeVar;
                    this.d = null;
                    this.e = i6;
                    this.f = i2;
                    this.g = 4;
                    thfVar.b(arrayList5, this);
                    return hu4Var;
                }
                if (!ypeVar.isEmpty()) {
                    this.h = null;
                    this.c = null;
                    this.d = null;
                    this.e = i6;
                    this.f = i2;
                    this.g = 5;
                    thfVar.b(ypeVar, this);
                    return hu4Var;
                }
            }
            ch3.d0(obj);
        } else {
            i5 = this.f;
            int i11 = this.e;
            Iterator it3 = this.d;
            ch3.d0(obj);
            arrayList = new ArrayList(i9);
            it = it3;
            i3 = i11;
            i4 = i5;
            while (it.hasNext()) {
                next = it.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i9) {
                        this.h = thfVar;
                        this.c = arrayList;
                        this.d = it;
                        this.e = i3;
                        this.f = i4;
                        this.g = 1;
                        thfVar.b(arrayList, this);
                        return hu4Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.h = null;
                this.c = null;
                this.d = null;
                this.e = i3;
                this.f = i4;
                this.g = 2;
                thfVar.b(arrayList, this);
                return hu4Var;
            }
        }
        return sbi.a;
    }
}
