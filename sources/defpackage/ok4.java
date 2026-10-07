package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ok4 extends mdh implements qf7 {
    public Collection e;
    public Collection f;
    public List g;
    public r66 h;
    public int i;
    public final /* synthetic */ pk4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok4(pk4 pk4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = pk4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ok4(this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ok4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a A[RETURN] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        Collection collection2;
        Object objC;
        Collection collection3;
        List list;
        r66 r66Var;
        Object objC2;
        List list2;
        r66 r66Var2;
        List list3;
        vj4 vj4Var;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Integer num;
        Integer num2;
        Integer num3;
        String strX0;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.i;
        if (i == 0) {
            ch3.d0(obj);
            pk4 pk4Var = this.j;
            this.i = 1;
            obj = pk4.d(pk4Var, this);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i == 2) {
                collection = this.e;
                ch3.d0(obj);
                collection2 = (Collection) obj;
                this.e = null;
                this.f = collection2;
                this.i = 3;
                objC = ch3.c(collection, this);
                if (objC != hu4Var) {
                    collection3 = collection2;
                    obj = objC;
                    list = (List) obj;
                    r66Var = r66.a;
                    this.e = null;
                    this.f = null;
                    this.g = list;
                    this.h = r66Var;
                    this.i = 4;
                    objC2 = ch3.c(collection3, this);
                    if (objC2 != hu4Var) {
                        list2 = list;
                        obj = objC2;
                        r66Var2 = r66Var;
                    }
                }
                return hu4Var;
            }
            if (i == 3) {
                collection3 = this.f;
                Collection collection4 = this.e;
                ch3.d0(obj);
                list = (List) obj;
                r66Var = r66.a;
                this.e = null;
                this.f = null;
                this.g = list;
                this.h = r66Var;
                this.i = 4;
                objC2 = ch3.c(collection3, this);
                if (objC2 != hu4Var) {
                    list2 = list;
                    obj = objC2;
                    r66Var2 = r66Var;
                }
                return hu4Var;
            }
            if (i != 4) {
                if (i != 5) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Collection collection5 = this.f;
                Collection collection6 = this.e;
                ch3.d0(obj);
                return sbiVar;
            }
            r66Var2 = this.h;
            list2 = this.g;
            Collection collection7 = this.f;
            Collection collection8 = this.e;
            ch3.d0(obj);
        }
        list3 = (List) obj;
        vj4Var = new vj4(list2, r66Var2, list3);
        str = this.j.o;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (vj4Var.b()) {
                    strX0 = "isEmpty";
                } else {
                    if (list2 != null) {
                        num = new Integer(list2.size());
                    } else {
                        num = null;
                    }
                    if (r66Var2 != null) {
                        num2 = new Integer(0);
                    } else {
                        num2 = null;
                    }
                    if (list3 != null) {
                        num3 = new Integer(list3.size());
                    } else {
                        num3 = null;
                    }
                    strX0 = s5h.x0("\n                        contacts=" + num + ";\n                        globalContacts=" + num2 + ";\n                        phoneContacts=" + num3 + ".\n                    ");
                }
                a4cVar.c(je9Var, str, "Reloaded contactList: ".concat(strX0), null);
            }
        }
        mjg mjgVar = this.j.m;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 5;
        mjgVar.getClass();
        mjgVar.j(null, vj4Var);
        if (sbiVar != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        collection = (Collection) obj;
        pk4 pk4Var2 = this.j;
        this.e = collection;
        this.i = 2;
        obj = pk4.e(pk4Var2, this);
        if (obj != hu4Var) {
            collection2 = (Collection) obj;
            this.e = null;
            this.f = collection2;
            this.i = 3;
            objC = ch3.c(collection, this);
            if (objC != hu4Var) {
                collection3 = collection2;
                obj = objC;
                list = (List) obj;
                r66Var = r66.a;
                this.e = null;
                this.f = null;
                this.g = list;
                this.h = r66Var;
                this.i = 4;
                objC2 = ch3.c(collection3, this);
                if (objC2 != hu4Var) {
                    list2 = list;
                    obj = objC2;
                    r66Var2 = r66Var;
                    list3 = (List) obj;
                    vj4Var = new vj4(list2, r66Var2, list3);
                    str = this.j.o;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            if (vj4Var.b()) {
                                strX0 = "isEmpty";
                            } else {
                                if (list2 != null) {
                                    num = new Integer(list2.size());
                                } else {
                                    num = null;
                                }
                                if (r66Var2 != null) {
                                    num2 = new Integer(0);
                                } else {
                                    num2 = null;
                                }
                                if (list3 != null) {
                                    num3 = new Integer(list3.size());
                                } else {
                                    num3 = null;
                                }
                                strX0 = s5h.x0("\n                        contacts=" + num + ";\n                        globalContacts=" + num2 + ";\n                        phoneContacts=" + num3 + ".\n                    ");
                            }
                            a4cVar.c(je9Var, str, "Reloaded contactList: ".concat(strX0), null);
                        }
                    }
                    mjg mjgVar2 = this.j.m;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.i = 5;
                    mjgVar2.getClass();
                    mjgVar2.j(null, vj4Var);
                    if (sbiVar != hu4Var) {
                        return sbiVar;
                    }
                }
            }
        }
        return hu4Var;
    }
}
