package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b9f extends mdh implements tf7 {
    public String e;
    public Object f;
    public Object g;
    public int h;
    public /* synthetic */ yx6 i;
    public /* synthetic */ ylc j;
    public final /* synthetic */ wfe k;
    public final /* synthetic */ aaf l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9f(wfe wfeVar, aaf aafVar, int i, String str, lq4 lq4Var) {
        super(3, lq4Var);
        this.k = wfeVar;
        this.l = aafVar;
        this.m = i;
        this.n = str;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        String str = this.n;
        b9f b9fVar = new b9f(this.k, this.l, i, str, (lq4) obj3);
        b9fVar.i = (yx6) obj;
        b9fVar.j = (ylc) obj2;
        return b9fVar.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        ulc ulcVar;
        String str2;
        ulc ulcVar2;
        String str3;
        ulc ulcVar3;
        Object obj3;
        Object obj4;
        Object objF0;
        ulc ulcVar4;
        Object obj5;
        String name;
        String str4;
        wfe wfeVar;
        a4c a4cVar;
        ulc ulcVar5;
        Object obj6;
        Object obj7;
        String str5;
        Object obj8;
        String name2;
        String str6;
        wfe wfeVar2;
        a4c a4cVar2;
        ulc ulcVar6;
        Integer num;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        yx6 yx6Var = this.i;
        ylc ylcVar = this.j;
        hu4 hu4Var = hu4.a;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.f;
                str = this.e;
                ch3.d0(obj);
                objF0 = obj;
            } else {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj7 = this.g;
                obj8 = this.f;
                str5 = this.e;
                ch3.d0(obj);
            }
            name2 = yx6Var.getClass().getName();
            str6 = this.n;
            wfeVar2 = this.k;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                ulcVar6 = (ulc) wfeVar2.a;
                if (ulcVar6 != null) {
                    num = new Integer(ulcVar6.b.size());
                } else {
                    num = null;
                }
                StringBuilder sbQ = qv1.q("[search][", str6, "] emit for ", str5, " ");
                sbQ.append(obj8);
                sbQ.append(" ");
                sbQ.append(obj7);
                sbQ.append(": ");
                sbQ.append(num);
                a4cVar2.c(je9Var, name2, sbQ.toString(), null);
            }
            return sbiVar;
        }
        ch3.d0(obj);
        str = (String) ylcVar.a;
        obj2 = ylcVar.b;
        ulc ulcVar7 = (ulc) this.k.a;
        if (!cqk.d(ulcVar7 != null ? ulcVar7.a : null, str)) {
            ulcVar = (ulc) this.k.a;
            if (ulcVar != null) {
                str2 = ulcVar.a;
            } else {
                str2 = null;
            }
            if (cqk.d(str2, str)) {
                ulcVar4 = (ulc) this.k.a;
                if (ulcVar4 != null) {
                    obj5 = ulcVar4.d;
                } else {
                    obj5 = null;
                }
                if (!cqk.d(obj5, obj2)) {
                    name = yx6Var.getClass().getName();
                    str4 = this.n;
                    wfeVar = this.k;
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        ulcVar5 = (ulc) wfeVar.a;
                        if (ulcVar5 != null) {
                            obj6 = ulcVar5.d;
                        } else {
                            obj6 = null;
                        }
                        StringBuilder sbQ2 = qv1.q("[search][", str4, "] skip illegal page load ", str, " ");
                        sbQ2.append(obj2);
                        sbQ2.append(" / ");
                        sbQ2.append(obj6);
                        a4cVar.c(je9Var, name, sbQ2.toString(), null);
                        return sbiVar;
                    }
                }
            }
            ulcVar2 = (ulc) this.k.a;
            if (ulcVar2 != null) {
                str3 = ulcVar2.a;
            } else {
                str3 = null;
            }
            if (!cqk.d(str3, str)) {
                this.k.a = null;
            }
            ulcVar3 = (ulc) this.k.a;
            if (ulcVar3 != null) {
                obj3 = ulcVar3.d;
            } else {
                obj3 = null;
            }
            if (cqk.d(obj2, obj3)) {
                obj4 = obj2;
            } else {
                obj4 = null;
            }
            j3 j3VarA = this.l.a(this.m, obj4, str);
            this.i = yx6Var;
            this.j = null;
            this.e = str;
            this.f = obj2;
            this.h = 1;
            objF0 = e9i.F0(j3VarA, this);
            if (objF0 != hu4Var) {
            }
            return hu4Var;
        }
        ulc ulcVar8 = (ulc) this.k.a;
        if (!cqk.d(ulcVar8 != null ? ulcVar8.c : null, obj2)) {
            ulcVar = (ulc) this.k.a;
            if (ulcVar != null) {
                str2 = ulcVar.a;
            } else {
                str2 = null;
            }
            if (cqk.d(str2, str)) {
                ulcVar4 = (ulc) this.k.a;
                if (ulcVar4 != null) {
                    obj5 = ulcVar4.d;
                } else {
                    obj5 = null;
                }
                if (!cqk.d(obj5, obj2)) {
                    name = yx6Var.getClass().getName();
                    str4 = this.n;
                    wfeVar = this.k;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        ulcVar5 = (ulc) wfeVar.a;
                        if (ulcVar5 != null) {
                            obj6 = ulcVar5.d;
                        } else {
                            obj6 = null;
                        }
                        StringBuilder sbQ3 = qv1.q("[search][", str4, "] skip illegal page load ", str, " ");
                        sbQ3.append(obj2);
                        sbQ3.append(" / ");
                        sbQ3.append(obj6);
                        a4cVar.c(je9Var, name, sbQ3.toString(), null);
                        return sbiVar;
                    }
                }
            }
            ulcVar2 = (ulc) this.k.a;
            if (ulcVar2 != null) {
                str3 = ulcVar2.a;
            } else {
                str3 = null;
            }
            if (!cqk.d(str3, str)) {
                this.k.a = null;
            }
            ulcVar3 = (ulc) this.k.a;
            if (ulcVar3 != null) {
                obj3 = ulcVar3.d;
            } else {
                obj3 = null;
            }
            if (cqk.d(obj2, obj3)) {
                obj4 = obj2;
            } else {
                obj4 = null;
            }
            j3 j3VarA2 = this.l.a(this.m, obj4, str);
            this.i = yx6Var;
            this.j = null;
            this.e = str;
            this.f = obj2;
            this.h = 1;
            objF0 = e9i.F0(j3VarA2, this);
            if (objF0 != hu4Var) {
            }
            return hu4Var;
        }
        String name3 = yx6Var.getClass().getName();
        String str7 = this.n;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            StringBuilder sbQ4 = qv1.q("[search][", str7, "] skip duplicate request ", str, " ");
            sbQ4.append(obj2);
            a4cVar3.c(je9Var, name3, sbQ4.toString(), null);
            return sbiVar;
        }
        return sbiVar;
        Object obj9 = obj2;
        String str8 = str;
        j9f j9fVar = (j9f) objF0;
        List list = j9fVar.a;
        Object obj10 = j9fVar.b;
        String str9 = j9fVar.c;
        int i2 = j9fVar.d;
        wfe wfeVar3 = this.k;
        ulc ulcVar9 = (ulc) wfeVar3.a;
        wfeVar3.a = new ulc(str8, ww3.G1(list, ulcVar9 != null ? ulcVar9.b : r66.a), obj9, obj10, str9, i2);
        Object obj11 = this.k.a;
        this.i = yx6Var;
        this.j = null;
        this.e = str8;
        this.f = obj9;
        this.g = obj10;
        this.h = 2;
        if (yx6Var.emit(obj11, this) != hu4Var) {
            obj7 = obj10;
            str5 = str8;
            obj8 = obj9;
            name2 = yx6Var.getClass().getName();
            str6 = this.n;
            wfeVar2 = this.k;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                ulcVar6 = (ulc) wfeVar2.a;
                if (ulcVar6 != null) {
                    num = new Integer(ulcVar6.b.size());
                } else {
                    num = null;
                }
                StringBuilder sbQ5 = qv1.q("[search][", str6, "] emit for ", str5, " ");
                sbQ5.append(obj8);
                sbQ5.append(" ");
                sbQ5.append(obj7);
                sbQ5.append(": ");
                sbQ5.append(num);
                a4cVar2.c(je9Var, name2, sbQ5.toString(), null);
            }
            return sbiVar;
        }
        return hu4Var;
    }
}
